node('docker'){
    docker.image('niaquinto/gradle').inside {
        stage 'Checkout'
        git credentialsId: 'niel_github', url: 'https://github.com/nlynch72/servermanager.git'

        stage 'Build'
        sh "./gradlew build"
    }
}
