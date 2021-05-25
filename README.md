# zemg-challenge
# Simple Screenplay test with BDD

This project is a simple test using screenplay 
By default the tests run on Chrome, so make sure you have the latest chromedriver instance on your system path.

###### go to Documents
[testDocuments](https://github.com/manu-tae/zemg-challenge/tree/master/test-documents)

## Screenplay implementation and Cucumber

This project is the integration of Serenity BDD, Screenplay and Cucumber JVM.
To run it, execute:

These tests use tasks, actions, questions and page elements defined in `src/main/java/net/serenitybdd/demos/todos/screenplay`.

The overall project structure is shown below:
````
+ exceptions
    Domain model classes
+ model
    Domain model classes
+ tasks
    Business-level tasks
+ interactions
    UI interactions
+ pages
    Page Objects and Page Elements
+ questions
    Objects used to query the application
````

![alt text](https://github.com/manu-tae/zemg-challenge/blob/master/test-documents/the-screenplay-pattern.png)


## Get Started


### compile
gradle build                                  
### runs some class
gradle test --tests <className> -i           
### Generates the report under ./target/site/serenity
graddle aggregate                             



## Environment variable versions 

To run the project you'll need JDK 1.8 and gradle installed.

[environment](https://docs.google.com/spreadsheets/d/15LFvjW0JLvxwEvqR8Q_YIma_mr9YBVkpiD1o5GKcDp4/edit#gid=4)



## Reporting

The Serenity reports will be generated in the `target/site/serenity` directory.
