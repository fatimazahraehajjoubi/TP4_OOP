package com.example.demo.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AdresseResponse {
    private String type;
    private String version;
    private List<Feature> features;
    private String attribution;
    private String licence;
    private String query;
    private Filters filters;
    private int limit;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public String getAttribution() {
        return attribution;
    }

    public void setAttribution(String attribution) {
        this.attribution = attribution;
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public Filters getFilters() {
        return filters;
    }

    public void setFilters(Filters filters) {
        this.filters = filters;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
    
    
    @JsonIgnoreProperties(ignoreUnknown = true)
	public static
    class Feature {
    	
    	
        private String type;
        private Geometry geometry;
        private Properties properties;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Geometry getGeometry() {
            return geometry;
        }

        public void setGeometry(Geometry geometry) {
            this.geometry = geometry;
        }

        public Properties getProperties() {
            return properties;
        }

        public void setProperties(Properties properties) {
            this.properties = properties;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static
    class Geometry {
        private String type;
        private List<Double> coordinates;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public List<Double> getCoordinates() {
            return coordinates;
        }

        public void setCoordinates(List<Double> coordinates) {
            this.coordinates = coordinates;
        }
    }


    @JsonIgnoreProperties(ignoreUnknown = true)
    public static
    class Properties {

        private String label;
        private double score;
        private String housenumber;
        private String id;
        private String name;
        private String postcode;
        private String citycode;
        private double x;
        private double y;
        private String city;
        private String context;
        private String type;
        private double importance;
        private String street;
        
        
    	public String getLabel() {
    		return label;
    	}
    	public void setLabel(String label) {
    		this.label = label;
    	}
    	public double getScore() {
    		return score;
    	}
    	public void setScore(double score) {
    		this.score = score;
    	}
    	public String getHousenumber() {
    		return housenumber;
    	}
    	public void setHousenumber(String housenumber) {
    		this.housenumber = housenumber;
    	}
    	public String getId() {
    		return id;
    	}
    	public void setId(String id) {
    		this.id = id;
    	}
    	public String getName() {
    		return name;
    	}
    	public void setName(String name) {
    		this.name = name;
    	}
    	public String getPostcode() {
    		return postcode;
    	}
    	public void setPostcode(String postcode) {
    		this.postcode = postcode;
    	}
    	public String getCitycode() {
    		return citycode;
    	}
    	public void setCitycode(String citycode) {
    		this.citycode = citycode;
    	}
    	public double getX() {
    		return x;
    	}
    	public void setX(double x) {
    		this.x = x;
    	}
    	public double getY() {
    		return y;
    	}
    	public void setY(double y) {
    		this.y = y;
    	}
    	public String getCity() {
    		return city;
    	}
    	public void setCity(String city) {
    		this.city = city;
    	}
    	public String getContext() {
    		return context;
    	}
    	public void setContext(String context) {
    		this.context = context;
    	}
    	public String getType() {
    		return type;
    	}
    	public void setType(String type) {
    		this.type = type;
    	}
    	public double getImportance() {
    		return importance;
    	}
    	public void setImportance(double importance) {
    		this.importance = importance;
    	}
    	public String getStreet() {
    		return street;
    	}
    	public void setStreet(String street) {
    		this.street = street;
    	}

    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static
    class Filters {
      private String type;

      public Filters() {}

      public String getType() {
        return type;
      }

      public void setType(String type) {
        this.type = type;
      }
    }
}





