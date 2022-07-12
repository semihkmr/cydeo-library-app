package com.cydeo.AysunTasks.library.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(

         plugin = {
                 "pretty",
                 "html:targer/cucumber-report.html",
               "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                 "rerun:target/rerun.txt"
         },
          features = "src/test/resources/features",
        glue = "com/cydeo/AysunTasks/library/step_def" ,
        tags = ""




)

public class CukesRunner {



}
