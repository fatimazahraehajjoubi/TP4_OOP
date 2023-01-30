package com.example.demo.controller;

import java.nio.charset.StandardCharsets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriUtils;

import com.example.demo.response.AdresseResponse;
import com.example.demo.response.MeteoResponse;

@Controller
@RequestMapping("/meteo")
public class MeteoController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${api.token.meteo}")
	private String apiToken;

	
	 @GetMapping
	  public String weatherForm() {
	    return "meteo";
	  }
	 

	  @PostMapping
	  public String handleWeatherForm(@RequestParam("address") String address, Model model) {
		  
		try {
			    String encodedAddress = UriUtils.encode(address, StandardCharsets.UTF_8);
				String url = "https://api-adresse.data.gouv.fr/search/?q=" + encodedAddress+"&type=housenumber&autocomplete=0";
				
				System.out.println(url);

			    AdresseResponse response = restTemplate.getForObject(url, AdresseResponse.class);
			    
				double x = response.getFeatures().get(0).getGeometry().getCoordinates().get(0);
				
				double y = response.getFeatures().get(0).getGeometry().getCoordinates().get(1);
				
				
				String urlMeteo = "https://api.meteo-concept.com/api/forecast/daily?token="+apiToken+"&latlng="+y+","+x;
				
			    MeteoResponse responseMeteo = restTemplate.getForObject(urlMeteo, MeteoResponse.class);
			    
			    
			    model.addAttribute("forecasts", responseMeteo.getForecast());
				model.addAttribute("x", x);
				model.addAttribute("y", y);
				
				
				
							
			
		}catch(Exception e) {
			System.out.println(e.getMessage());			
		}
		  
		
		
	    model.addAttribute("address", address);
	    return "meteo";
	  }

}
