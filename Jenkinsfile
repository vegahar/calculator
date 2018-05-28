pipeline {
    agent any
    stages {
        stage("Compile") {
            steps {
                sh "./gradlew compileJava"
            }
        }
        stage("Unit test") {
            steps {
                sh "./gradlew test"
                publishHTML(target: [
                        reportDir  : 'build/reports/tests/test/',
                        reportFiles: 'index.html',
                        reportName : "Test Report",
                        keepAll    : true
                ])
            }
        }
        stage("Static code analysis") {
            steps {
                sh "./gradlew checkstyleMain"
                publishHTML(target: [
                        reportDir  : 'build/reports/checkstyle/',
                        reportFiles: 'main.html',
                        reportName : "Checkstyle Report",
                        keepAll    : true
                ])
            }
        }
        stage("Code coverage") {
            steps {
                sh "./gradlew jacocoTestReport"
                publishHTML(target: [
                        reportDir  : 'build/reports/jacoco/test/html/',
                        reportFiles: 'index.html',
                        reportName : "JaCoCo Report",
                        keepAll    : true
                ])
                sh "./gradlew jacocoTestCoverageVerification"
            }
        }
        stage("Package") {
            steps {
                sh "./gradlew build"
            }
        }
        stage("Docker build") {
            steps {
                sh "docker build -t localhost:5000/calculator ."
            }
        }
        stage("Docker push") {
            steps {
                sh "docker push localhost:5000/calculator localhost:5000/calculator"
            }
        }

    }
}