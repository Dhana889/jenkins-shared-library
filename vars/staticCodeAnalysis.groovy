def call(credentialsId) {
    withSonarQubeEnv(credentialsId: 'sonar-apitoken') {
        mvn clean package sonar:sonar
        }
    }