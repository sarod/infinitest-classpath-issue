Infinitest Console output:

`Dec 06, 2013 1:29:50 PM org.springframework.beans.factory.xml.XmlBeanDefinitionReader loadBeanDefinitions
INFO: Loading XML bean definitions from URL [file:/C:/Volumes/Development/1t1c/inifinitest-classpath-issue/test-project/target/test-classes/META-INF/context.xml]
Dec 06, 2013 1:29:50 PM org.springframework.beans.factory.xml.XmlBeanDefinitionReader loadBeanDefinitions
INFO: Loading XML bean definitions from URL [file:/C:/Volumes/Development/1t1c/inifinitest-classpath-issue/dependency-project/target/test-classes/META-INF/context.xml]
Dec 06, 2013 1:29:50 PM org.springframework.context.support.AbstractApplicationContext prepareRefresh
INFO: Refreshing org.springframework.context.support.GenericApplicationContext@7aa8be43: startup date [Fri Dec 06 13:29:50 EST 2013]; root of context hierarchy
Dec 06, 2013 1:29:51 PM org.springframework.beans.factory.support.DefaultListableBeanFactory preInstantiateSingletons
INFO: Pre-instantiating singletons in org.springframework.beans.factory.support.DefaultListableBeanFactory@5c34f625: defining beans [test-project-bean,dependency-project-bean,org.springframework.context.annotation.internalConfigurationAnnotationProcessor,org.springframework.context.annotation.internalAutowiredAnnotationProcessor,org.springframework.context.annotation.internalRequiredAnnotationProcessor,org.springframework.context.annotation.internalCommonAnnotationProcessor,org.springframework.context.annotation.ConfigurationClassPostProcessor.importAwareProcessor]; root of factory hierarchy
Dec 06, 2013 1:29:51 PM org.springframework.test.context.TestContextManager prepareTestInstance
SEVERE: Caught exception while allowing TestExecutionListener [org.springframework.test.context.support.DependencyInjectionTestExecutionListener@e3c0649] to prepare test instance [com.zophr.bugs.BugTest@6c0a9ec]
org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'com.zophr.bugs.BugTest': Injection of autowired dependencies failed; nested exception is org.springframework.beans.factory.BeanCreationException: Could not autowire field: private com.zophr.bugs.Bean com.zophr.bugs.BugTest.bean; nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException: No qualifying bean of type [com.zophr.bugs.Bean] is defined: expected single matching bean but found 2: test-project-bean,dependency-project-bean
    at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessPropertyValues(AutowiredAnnotationBeanPostProcessor.java:288)
    at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1116)
    at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.autowireBeanProperties(AbstractAutowireCapableBeanFactory.java:376)
    at org.springframework.test.context.support.DependencyInjectionTestExecutionListener.injectDependencies(DependencyInjectionTestExecutionListener.java:110)
    at org.springframework.test.context.support.DependencyInjectionTestExecutionListener.prepareTestInstance(DependencyInjectionTestExecutionListener.java:75)
    at org.springframework.test.context.TestContextManager.prepareTestInstance(TestContextManager.java:312)
    at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.createTest(SpringJUnit4ClassRunner.java:211)
    at org.springframework.test.context.junit4.SpringJUnit4ClassRunner$1.runReflectiveCall(SpringJUnit4ClassRunner.java:288)
    at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
    at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.methodBlock(SpringJUnit4ClassRunner.java:284)
    at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.runChild(SpringJUnit4ClassRunner.java:231)
    at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.runChild(SpringJUnit4ClassRunner.java:88)
    at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
    at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
    at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
    at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
    at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
    at org.springframework.test.context.junit4.statements.RunBeforeTestClassCallbacks.evaluate(RunBeforeTestClassCallbacks.java:61)
    at org.springframework.test.context.junit4.statements.RunAfterTestClassCallbacks.evaluate(RunAfterTestClassCallbacks.java:71)
    at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
    at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.run(SpringJUnit4ClassRunner.java:174)
    at org.junit.runner.JUnitCore.run(JUnitCore.java:160)
    at org.junit.runner.JUnitCore.run(JUnitCore.java:138)
    at org.infinitest.testrunner.JUnit4Runner.runJUnitTest(JUnit4Runner.java:91)
    at org.infinitest.testrunner.JUnit4Runner.runTest(JUnit4Runner.java:57)
    at org.infinitest.testrunner.TestRunnerProcess.runTest(TestRunnerProcess.java:70)
    at org.infinitest.testrunner.TestRunnerProcess.writeTestResultToOutputStream(TestRunnerProcess.java:112)
    at org.infinitest.testrunner.TestRunnerProcess.main(TestRunnerProcess.java:89)
Caused by: org.springframework.beans.factory.BeanCreationException: Could not autowire field: private com.zophr.bugs.Bean com.zophr.bugs.BugTest.bean; nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException: No qualifying bean of type [com.zophr.bugs.Bean] is defined: expected single matching bean but found 2: test-project-bean,dependency-project-bean
    at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.inject(AutowiredAnnotationBeanPostProcessor.java:514)
    at org.springframework.beans.factory.annotation.InjectionMetadata.inject(InjectionMetadata.java:87)
    at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessPropertyValues(AutowiredAnnotationBeanPostProcessor.java:285)
    ... 27 more
Caused by: org.springframework.beans.factory.NoUniqueBeanDefinitionException: No qualifying bean of type [com.zophr.bugs.Bean] is defined: expected single matching bean but found 2: test-project-bean,dependency-project-bean
    at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:865)
    at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:770)
    at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.inject(AutowiredAnnotationBeanPostProcessor.java:486)
    ... 29 more`




Command line "mvn test" output:

`C:\Volumes\Development\1t1c\inifinitest-classpath-issue>mvn test
[INFO] Scanning for projects...
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Build Order:
[INFO]
[INFO] inifinitest-classpath-issue
[INFO] dependency-project
[INFO] test-project
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] Building inifinitest-classpath-issue 0.0.1-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] Building dependency-project 0.0.1-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO]
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ dependency
-project ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 0 resource
[INFO]
[INFO] --- maven-compiler-plugin:2.5.1:compile (default-compile) @ dependency-pr
oject ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ de
pendency-project ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 2 resources
[INFO]
[INFO] --- maven-compiler-plugin:2.5.1:testCompile (default-testCompile) @ depen
dency-project ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ dependency-project
 ---
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] Building test-project 0.0.1-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO]
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ test-proje
ct ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 0 resource
[INFO]
[INFO] --- maven-compiler-plugin:2.5.1:compile (default-compile) @ test-project
---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ te
st-project ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 2 resources
[INFO]
[INFO] --- maven-compiler-plugin:2.5.1:testCompile (default-testCompile) @ test-
project ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ test-project ---
[INFO] Surefire report directory: C:\Volumes\Development\1t1c\inifinitest-classp
ath-issue\test-project\target\surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running com.zophr.bugs.BugTest
Dec 06, 2013 1:46:38 PM org.springframework.beans.factory.xml.XmlBeanDefinitionR
eader loadBeanDefinitions
INFO: Loading XML bean definitions from URL [file:/C:/Volumes/Development/1t1c/i
nifinitest-classpath-issue/test-project/target/test-classes/META-INF/context.xml
]
Dec 06, 2013 1:46:38 PM org.springframework.context.support.AbstractApplicationC
ontext prepareRefresh
INFO: Refreshing org.springframework.context.support.GenericApplicationContext@6
a75863f: startup date [Fri Dec 06 13:46:38 EST 2013]; root of context hierarchy
Dec 06, 2013 1:46:38 PM org.springframework.beans.factory.support.DefaultListabl
eBeanFactory preInstantiateSingletons
INFO: Pre-instantiating singletons in org.springframework.beans.factory.support.
DefaultListableBeanFactory@28839907: defining beans [test-project-bean,org.sprin
gframework.context.annotation.internalConfigurationAnnotationProcessor,org.sprin
gframework.context.annotation.internalAutowiredAnnotationProcessor,org.springfra
mework.context.annotation.internalRequiredAnnotationProcessor,org.springframewor
k.context.annotation.internalCommonAnnotationProcessor,org.springframework.conte
xt.annotation.ConfigurationClassPostProcessor.importAwareProcessor]; root of fac
tory hierarchy
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.46 sec

Results :

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary:
[INFO]
[INFO] inifinitest-classpath-issue ....................... SUCCESS [0.001s]
[INFO] dependency-project ................................ SUCCESS [0.721s]
[INFO] test-project ...................................... SUCCESS [0.940s]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 1.755s
[INFO] Finished at: Fri Dec 06 13:46:39 EST 2013
[INFO] Final Memory: 7M/245M
[INFO] ------------------------------------------------------------------------
C:\Volumes\Development\1t1c\inifinitest-classpath-issue>`