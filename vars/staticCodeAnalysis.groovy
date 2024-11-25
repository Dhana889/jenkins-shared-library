def call() {
    withSonarQubeEnv('sonar-server')  {
        sh '''
        mvn clean package sonar:sonar
        '''
        }
    }