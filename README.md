# TP4_POO
## Etape 6
###  Faut-il une clé API pour appeler MeteoConcept ?
Oui, il est nécessaire d'avoir une clé API pour appeler les services météorologiques de météo concept. je l'ai stocké dans le fichier application.properties.
### Quelle URL appeler ?
https://api.meteo-concept.com/api/forecast/daily?token=+MYTOKEN&latlng=y,x
### Quelle méthode HTTP utiliser ?
Méthode GET
###  Comment passer les paramètres d'appels ?
on utilise le symbole &
### Où est l'information dont j'ai besoin dans la réponse?
dans l'object forecast
###  Pour afficher la prévision de météo du lieu visé par les coordonnées GPS
On utilise URL ="https://api.meteo-concept.com/api/forecast/daily?token=+MYTOKEN&latlng=y,x"

