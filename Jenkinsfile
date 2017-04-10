node {
	checkout scm
	stage('Package') {
		sh 'mvn clean package -DskipTests'
	}
}
