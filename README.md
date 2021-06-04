
<img  src="https://ecole-alternance.cesi.fr/wp-content/themes/cesi/static/logo/ecole-alternance.svg">
<img  src="https://secrethub.io/img/travis-ci.svg" width="35%">

# RILS 2020 - Deployment With GitHub & TravisCI 

[![Version](https://badge.fury.io/gh/tterb%2FHyde.svg)]() [![Build](https://travis-ci.com/BoisselNicolas/Rils-deploy.svg?token=4kAo6qsZ5hqAksyhZUQD&branch=main)]()

## Usage

**Étape 1** : Connecter GitHub et Travis CI

```
  - Se connecter à Travis avec son compte GitHub
  - Cliquer sur Activer son repository github dans Travis CI
  - Sélectionner son repository
  - Approuver & installer
```
Le lien entre GitHub et Travis est effectué mais nous transmettons aucune information à Travis

**Etape 2** : Créer un fichier .travis.yml Afin de dire à Travis ce qu'il doit éffectuer

```
  - https://docs.travis-ci.com/user/languages
  - Écrire son fichier en fonction du language utilisé
  - Faire un commit du fichier .travis.yml
  - Faire un push
```

TravisCI détecte et lance le build de notre application
 

## Auteurs

  
* **BOISSEL Nicolas**

## Merci pour la syntaxe des test unitaire en java

* **@YTBeater**
