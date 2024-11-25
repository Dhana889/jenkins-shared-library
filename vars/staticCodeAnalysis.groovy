def call() {
    script {
        mvn clean package sonar:sonar
        }
    }