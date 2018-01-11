def call (slave){

podTemplate(
    cloud: 'https://master.marthanda.in',
    name: 'maven-node',
    label: 'maven-node',
    namespace: 'maven-node',
    serviceAccount: '',
    slaveConnectTimeout: 120,
    activeDeadlineSeconds: 30 * 120,
    containers: [
        containerTemplate(
            name: 'maven', 
            image: 'maven:3.3.9-jdk-8-alpine', 
            ttyEnabled: true, 
            command: 'cat'
        )
    ]
)
node('maven-node') {
        sh "echo Hello world"
}
}
