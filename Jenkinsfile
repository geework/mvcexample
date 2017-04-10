

node{
  stage ('Build') {
  	checkout scm
	 
	     // git url: 'https://github.com/repo/project'
	      
	          withMaven(
		          maven: 'M3', // Maven installation declared in the Jenkins "Global Tool Configuration"
			          mavenSettingsConfig: 'my-maven-settings', // Maven settings.xml file defined with the Jenkins Config File Provider Plugin
				          mavenLocalRepo: '.repository') {
					   
					         // Run the maven build
						       sh "mvn clean install"
						        
							    } // withMaven will discover the generated Maven artifacts, JUnit reports and FindBugs reports
							      }

							        stage('Package') {
										sh 'mvn clean package -DskipTests'
											}
											}



