Simple Spring MVC application to add Todos. Todos added are not persisted; when the application is terminated, added todos are lost.

This application just highlights some of the capabilities of Spring MVC module. It uses Spring's XML configuration.

SETUP
=====

Just import the project into eclipse.

	--> Right click in Eclipse Project / Package Explorer and select Import -> Existing Maven project

BUILDING
========

	--> Right click on the project and select "Maven build..."
	--> In the goals field, enter "clean package"
	--> Hit "Apply" and "Run"

RUNNING
=======

	--> In the server view of Eclipse, make sure you have a Tomcat or TC server created
	--> Right click on the server and select "Add or remove programs"
	--> Choose the application from the left pane and move to right pane and hit finish
	--> Right click on the server and select "Clean" and wait till the application is published
	--> Start the server
	--> Access http://localhost:<port>/todo-mvc

Understanding
=============

Has a dependency on 'todo' project through Maven dependency.

Control flow starts with web.xml which
1) Registers DispatcherServlet with servlet configuration in servlet-context.xml.
2) Registers root-context.xml as the root context configuration.

Static files are in "resources" folder.
