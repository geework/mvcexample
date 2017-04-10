node{
  stage ('Build') {
	// git url: 'https://github.com/repo/project'
	checkout scm
	// install Maven and add it to the path
	env.PATH = "${tool 'M3'}/bin:${env.PATH}"

	//configFileProvider(
	//[configFile(fileId: 'maven-settings', variable: 'MAVEN_SETTINGS')]) {
	//  sh 'mvn -s $MAVEN_SETTINGS clean package'
	//}
	// Run the maven build
	sh "mvn clean install"
	// Package
	sh 'mvn clean package -DskipTests'
  }
}

