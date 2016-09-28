node('docker'){
    docker.image('niaquinto/gradle').inside {
        
        checkout scm
        
        sh "./gradlew build"
   
        junit "build/**/*.xml"  
   
        //clean up will always run
        step([$class: 'WsCleanup'])
       
    }
}


