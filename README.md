# Application de Location de Voiture avec Spring Boot
Ce projet est une application de location de voiture développée avec Spring Boot. Il utilise une base de données MySQL et serveur Tomcat.

# API Endpoints
### Authentification
Signup: POST /api/auth/signup

Signin: POST /api/auth/signin
### Clients
Ajouter un client: POST /client/save

Modifier un client: PUT /client/update/{id}

Supprimer un client: DELETE /client/delete/{id}

Lire tous les clients: GET /client/all
### Voitures
Ajouter une voiture: POST /voiture/voituresave

Modifier une voiture: PUT /voiture/updatevoiture/{id}

Supprimer une voiture: DELETE /voiture/deletevoiture/{id}

Lire toutes les voitures: GET /voiture/listvoiture
### Locations
Ajouter une location: POST /location/locationsave

Modifier une location: PUT /location/updatelocation/{id}

Supprimer une location: DELETE /location/deletelocation/{id}

Lire toutes les locations: GET /location/listlocation
### Modèles
Ajouter un modèle de voiture: POST /modele/modelesave

Modifier un modèle de voiture: PUT /modele/updatemodele/{id}

Supprimer un modèle de voiture: DELETE /modele/deletemodele/{id}

Lire tous les modèles de voiture: GET /modele/listmodele

Les endpoints seront accessibles à partir de http://localhost:8082/.