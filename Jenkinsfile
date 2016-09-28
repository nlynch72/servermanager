node('docker'){
    docker.image('niaquinto/gradle').inside {
        stage('build') {
            
            checkout scm
            sh "./gradlew build"
            junit "build/**/*.xml"  

            //clean up will always run
            step([$class: 'WsCleanup'])

        }
    }
}


