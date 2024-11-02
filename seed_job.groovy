folder('test_folder')
job("test_folder/test_freestyle_job"){
    steps{

      shell('echo Hello World')
    }
}

pipelineJob('test_folder/test_pipeline_job'){


definition{

  cpsScm{


    scm{
      git{
        remote{

          url('https://github.com/deepinder4/jenkins_tutorials.git')
        }
        branches("master")
      }
    }
    scriptPath('JenkinsFile')
  }
}
}
