# spring-mvc-xml-demo


How exactly are the root context and the dispatcher servlet context into a Spring MVC web application?

https://stackoverflow.com/questions/30639842/how-exactly-are-the-root-context-and-the-dispatcher-servlet-context-into-a-spring


squ_ae3d18069c4fe4e6aa457e3dc571ae5a39297efa

docker run --name sonarqube --platform linux/x86_64 -e SONAR_ES_BOOTSTRAP_CHECKS_DISABLE=true -p 9000:9000 sonarqube:8.9-developer

docker pull sonarqube:8.9-developer

mvn clean verify sonar:sonar -Dsonar.projectKey=spring-mvc-xml-demo 
                             -Dsonar.projectName='spring-mvc-xml-demo' 
                             -Dsonar.host.url=http://localhost:9000 
                             -Dsonar.token=3e737cd4f78f489cde3141896e2aea7bec93fcf9 
                             -Dsonar.login=admin -Dsonar.password=!DS03ec12345
