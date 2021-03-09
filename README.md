### About this application

This sample application will describe how to configure code coverage using
Jacoco plugin. It covers following points.

 1. How to enable Code Coverage for given project.
    

 2. How to include rules for exclude/include certain class from
    code Coverage.
    
    
 3. How to set up build pipe-line in GitHub to enforce these rule.
    In case if the rule is not satisfied build will fail.
    
4. This example will deploy an app in two different environment dev,prod.
   Whenever code is merged with main branch prod app is deployed similarly whenever
   dev branch is merged dev app is getting deployed.
   

### Access this application Health URL

https://herokuautodeploy-test.herokuapp.com/actuator/health

### Reference

__Jacoco Ref__

https://reflectoring.io/jacoco/

https://docs.gradle.org/current/userguide/jacoco_plugin.html

https://docs.gradle.org/current/samples/sample_jvm_multi_project_with_code_coverage.html

__Environment Specifid Deploy__

https://www.coletiv.com/blog/how-to-setup-continuous-integration-and-deployment-workflows-for-reactjs-using-github-actions/
