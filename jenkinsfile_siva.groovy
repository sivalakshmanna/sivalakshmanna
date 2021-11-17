//declarative pipeline
pipeline{
    agent any
    stages{
        stage("checkout code"){
            steps{
                println "clone our code to our repo"
            }
        }
        stage("build code"){
            steps{
                println "mvn clean package"
            }
        }
        stage ("upload artifacts to s3"){
            steps{
                println "uploading artifacts to s3 buckets"
            }
        }
    }
}