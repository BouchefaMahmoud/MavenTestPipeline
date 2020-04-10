node{
      stage('SCM Checkout'){
          git 'https://github.com/BouchefaMahmoud/MavenTestPipeline'
      }
      
      stage('copmpil-package'){
        sh 'mvn package'
      }
}
