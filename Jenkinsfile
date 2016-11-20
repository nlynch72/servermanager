node('docker'){
    docker.image('niaquinto/gradle').inside {
        stage('build') {
            
            checkout scm
            withEnv(["JAVA_HOME=${ tool 'java-1.7.0-openjdk-1.7.0' }", "PATH+JAVA_HOME=${env.JAVA_HOME}/bin"]) {
                sh "env"
                sh "./gradlew build"
                junit "build/**/*.xml"  
            }
            //clean up will always run
            step([$class: 'WsCleanup'])

        }
    }
}


