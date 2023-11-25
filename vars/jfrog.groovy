def call(){
    sh 'docker start artifactory'
    sh 'curl -X PUT -u admin:password -T /var/lib/jenkins/workspace/java/target/kubernetes-configmap-reload-0.0.1-SNAPSHOT.jar http://52.91.115.150:8082/artifactory/example-repo-local/kubernetes-configmap-reload-0.0.1-SNAPSHOT.jar'
}
