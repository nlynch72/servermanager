#!groovy

node('docker'){
   // docker.image('niaquinto/gradle').inside {
        stage('build') {
            
            checkout scm
            withEnv(["JAVA_HOME=${ tool 'java-1.7.0-openjdk-1.7.0' }", 
                     "JAVA_BINDIR=${ tool 'java-1.7.0-openjdk-1.7.0' }/bin",
                     "JAVA_ROOT=${ tool 'java-1.7.0-openjdk-1.7.0' }/jre"]) {
                sh "env | sort"
                sh "./gradlew build"
                junit "build/**/*.xml"  
            }
            //clean up will always run
            step([$class: 'WsCleanup'])

        }
 //   }
}


