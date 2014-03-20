Scala + Spring + Hibernate + Maven + Selenium WebDriver
=======================================================

This project contains source code for kickstarting a webapp project using
Scala, Spring, Hibernate and Maven, including Selenium WebDriver PageObject-based web tests.

Versions currently used in the project are:

* [Scala](http://www.scala-lang.org/): 2.10.2
* [Spring](http://www.springsource.org/about): 4.0.2..RELEASE
* [Hibernate](http://www.hibernate.org/): 4.2.3.Final

The code also makes use of [HSQLDB](http://hsqldb.org/), but you'll probably want to replace that with the JDBC driver
for whatever database you're using.


Building and Running
--------------------

Assuming you already have Maven installed, the webapp can be built by running:

    mvn clean install

The webapp can be run inside Jetty using the Maven plugin:

    mvn jetty:run



Conditions of Usage
-------------------

This code is in the public domain and no guarantee and or responsibility is provided in any way to the user.
