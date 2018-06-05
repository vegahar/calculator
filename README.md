# Calculator

### Installation
* Install docker
* Run ```docker-compose -f docker-compose-pipeline.yml -d```
* This should run a docker registry and jenkins with blue ocean

#### Jenkins
* Go to ```localhost:8080```
* Follow the installation
* Configure a multi branch project and point the url to this project
* Start a build
* Run the in script console ```System.setProperty("hudson.model.DirectoryBrowserSupport.CSP", "")```
* Need it to display nice graphs :) [1]



### Running applications
* Run ```docker-compose up -d``` 
    * This command will pull a docker image from the local docker registry which we started earlier.
* This will run a spring boot application connected to a redis cache. 

#### Connect to redis
* Need to connect to redis?
* Run ```docker-compose exec redis redis-cli```



[1]: https://wiki.jenkins.io/display/JENKINS/Configuring+Content+Security+Policy