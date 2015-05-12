Spring MVC example for swagger-maven-plugin

cd $(mktemp -d /tmp/tmp.XXXXX);
git clone https://github.com/who/swagger-maven-plugin-spring-mvc-example.git;
cd swagger-maven-plugin-spring-mvc-example;
mvn clean compile; 
cat generated/swagger-ui/swagger.json;
swagger-tools validate generated/swagger-ui/swagger.json;




