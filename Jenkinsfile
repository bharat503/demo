pipeline {
    agent any
    stages {
        stage('Build'){
            steps {
                withMaven(maven:'maven-3.9.0'){
                    sh 'mvn clean package'
                }


            }
         }
         stage('Deploy') {
            withCredentials([ [ $class:'UsernamePasswordManager',
            					CredentialsId:'PCF_LOGIN',
            					UsernameVariable:'USERNAME',
            					PasswordVariable:'PASSWORD',
            					
            ] ])
            sh '/usr/local/bin/cf login -a https://api.run.pivotal.io -u $USERNAME -p $PASSWORD'
            sh '/usr/local/bin/cf push'
         }

    }
}