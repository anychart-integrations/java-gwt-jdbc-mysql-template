[<img src="https://cdn.anychart.com/images/logo-transparent-segoe.png?2" width="234px" alt="AnyChart - Robust JavaScript/HTML5 Chart library for any project">](https://www.anychart.com)
# Java GWT basic template

This example shows how to run Anychart library with Java programming language using Maven, Servlets, JDBC, GWT and MySQL.

### Running
To use this sample you must have:

MySQL installed and running, if not please check out [MySQL download page](https://dev.mysql.com/downloads/installer/) and follow [these instructions](http://dev.mysql.com/doc/refman/5.7/en/installing.html).
To check your MySQL installation, run following command in command line:
```
$ mysql --version
mysql  Ver 14.14 Distrib 5.5.52, for debian-linux-gnu (x86_64) using readline 6. # sample output
```
Maven build tool, if not please checkout [maven installation page](https://maven.apache.org/install.html).
To check your Maven installation, run following command in command line:
```
$ mvn --version
Apache Maven 3.0.5
Maven home: /usr/share/maven
Java version: 1.8.0_131, vendor: Oracle Corporation
Java home: /usr/lib/jvm/java-8-oracle/jre
Default locale: en_US, platform encoding: UTF-8
OS name: "linux", version: "3.16.0-38-generic", arch: "amd64", family: "unix"
```
Make sure you are using Maven 3, if not - you can switch to it using this command:
```
sudo update-alternatives --config mvn
```
and select Maven 3.

To start this example run commands listed below.

Clone the repository from github.com to your workspace folder:

```
$ git clone git@github.com:anychart-integrations/java-gwt-jdbc-mysql-template.git
```

Navigate to the repository folder:
```
$ cd java-gwt-jdbc-mysql-template
```

Set up MySQL database, use -u -p flags to provide your user name and password:
```
$  mysql < database_backup.sql
```

Run GWT:
```
 mvn gwt:run
```
Then click `Launch default browser`.


## Workspace
Your workspace should look like:
```
java-jsp-jdbc-mysql-template/
    src/
        main/
            java/
                com.anychart/
                    client/
                        Template.java      # GWT template
                    listeners/
                        DatabaseContextListener.java    # Listener for database
                    models/
                        Fruit.java      # Data model
                    servlets/
                        MainServlet.java    # Servlet
                resources/
                    com/
                        anychart/
                            GWTTemplate.gwt.xml    # GWT settings
                webapp/
                    index.css   # css styles
                    index.html   # html markup
                    WEB-INF/
                        web.xml             # Main web settings

                    
    .gitignore
    database_backup.sql     # MySQL database dump
    LICENSE
    pom.xml     # Maven settings
    README.md
```

## Technologies
Language - [Java](https://java.com)<br />
Database - [MySQL](https://www.mysql.com/)<br />
Database driver - [JDBC](http://docs.oracle.com/javase/tutorial/jdbc/)<br />
JS framework - [GWT](http://www.gwtproject.org/)<br />
Build tool - [Maven](https://maven.apache.org/)

## Further Learning
* [Documentation](https://docs.anychart.com)
* [JavaScript API Reference](https://api.anychart.com)
* [Code Playground](https://playground.anychart.com)
* [Technical Support](https://www.anychart.com/support)

## License
AnyChart Java/GWT/MySQL integration sample includes two parts:
- Code of the integration sample that allows to use Javascript library (in this case, AnyChart) with Java language, GWT framework and MySQL database with JDBC driver. You can use, edit, modify it, use it with other Javascript libraries without any restrictions. It is released under [Apache 2.0 License](https://github.com/anychart-integrations/java-gwt-jdbc-mysql-template/blob/master/LICENSE).
- AnyChart JavaScript library. It is released under Commercial license. You can test this plugin with the trial version of AnyChart. Our trial version is not limited by time and doesn't contain any feature limitations. Check details [here](https://www.anychart.com/buy/).

If you have any questions regarding licensing - please contact us. <sales@anychart.com>

[![Analytics](https://ga-beacon.appspot.com/UA-228820-4/Integrations/java-gwt-jdbc-mysql-template?pixel&useReferer)](https://github.com/igrigorik/ga-beacon)
