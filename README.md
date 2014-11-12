springmvc-angular-seed
======================

Seed project for web app with spring-mvc and angular

1. How to deploy to tomcat

    - Add 'tomcat7' to settings.xml in %MAVEN_HOME%
    - Grant 'manager-script' role to user 'tomcat' in tomcat-users.xml,
        ```xml
        <tomcat-users>
        <!--
          NOTE:  By default, no user is included in the "manager-gui" role required
          to operate the "/manager/html" web application.  If you wish to use this app,
          you must define such a user - the username and password are arbitrary.
        -->
        <!--
          NOTE:  The sample user and role entries below are wrapped in a comment
          and thus are ignored when reading this file. Do not forget to remove
          <!.. ..> that surrounds them.
        -->

          <role rolename="tomcat"/>
          <role rolename="role1"/>
          <role rolename="manager-script"/>
          <user username="tomcat" password="tomcat" roles="tomcat,manager-script"/>
          <user username="both" password="tomcat" roles="tomcat,role1"/>
          <user username="role1" password="tomcat" roles="role1"/>

        </tomcat-users>
        ```
    - Add tomcat7-maven-plugin in pom.xml, configure the url and the user name

        ```xml
        <plugin>
                        <groupId>org.apache.tomcat.maven</groupId>
                        <artifactId>tomcat7-maven-plugin</artifactId>
                        <version>2.2</version>
                        <configuration>
                            <url>http://localhost:8080/manager/text</url>
                            <server>tomcat7</server>
                            <username>tomcat</username>
                            <password>tomcat</password>
                        </configuration>
                    </plugin>
        ```


