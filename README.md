# x_JUnit_Maven
Java project created using VSCode experimenting with IDE, Maven, Java, and Junit integration.

**Motivation**: Test the VSCode IDE with Maven/Java/Junit projects.  
**Solution**: VSCode IDE works great with Java using Redhat Java Extensions and VSCode Debugger extensions.  

---
**09/16/2018** (Sun)  
1330  
-created this project to experiment with VSCode, Java, Maven, and JUnit.  
-added basic Maven pom.xml  
```xml
        <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
        <modelVersion>4.0.0</modelVersion>
        
        <groupId>x</groupId>
        <artifactId>x_junit</artifactId>
        <version>1.0-SNAPSHOT</version>
        <!-- packaging>jar</packaging -->
        
        <properties>
            <maven.compiler.source>1.8</maven.compiler.source>
            <maven.compiler.target>1.8</maven.compiler.target>
        </properties>
        
        <dependencies>
            <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
            <scope>test</scope>
            </dependency>
        </dependencies>
        </project>
```
1400  
-got it all working and experimenting with simple JUnit testcases in a VSCode/Maven project.
-created **JunitTests.java**
```java
        import static org.junit.Assert.assertTrue;

        import org.junit.Test;
        import java.lang.Exception;

        /**
         * Junit testcases - simple for experimenting with VSCode.
         * @author Patrick Victorio
         * @since 09/16/2018
         * @version 09/16/2018 -created.</br>
         */
        public class JunitTests {

            /**
             * Simple testcase.
             * @throws Exception
             */
            @Test
            public void test() throws Exception {
                System.out.println("JunitTests test.");
            }

            /**
             * Simple testcase that makes an assertion.
             */
            @Test
            public void test2() throws Exception {
                System.out.println("Test2 with an assertion.");
                assertTrue(true);
            }

        }
```
-next need to get it working with **Gradle**.  

