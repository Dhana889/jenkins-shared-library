def call() {
    waitForQualityGate abortPipeline: false, credentialsId: 'sonar-apitoken'
    }