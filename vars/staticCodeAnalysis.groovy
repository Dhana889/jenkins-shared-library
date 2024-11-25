def call() {
    withSonarQubeEnv('sonar-server') {
        script {
            mvn clean verify sonar:sonar -Dsonar.projectKey=boardgame
        }
    }
}