# prjjsb_sbhellow

instructions on how to install and run this application:

1. ensure Git and Maven CLI are installed in your local development machine
2. open a command prompt and cd to your local projects folder
3. run:  git clone https://github.com/alwonghn/mod_login2
4. git will automatically download the application in a new sub-directory
5. cd into the application root directory (where the pom.xml file is)
6. run: mvn clean package
7. run: mvn spring-boot:run
8. open your browser and navigate to :  localhost:8080/h2-console
9. at the h2 database login page, enter the following details:
Saved Settings: Generic H2 (Embedded)
Setting Name: Generic H2 (Embedded)
Driver Class:org.h2.Driver
JDBC URL:jdbc:h2:mem:testdb
User Name: sa
Password:--LEAVE-BLANK--
10. click submit. run the following SQL query: SELECT * FROM student;
11. there should be 2 student records for testing one of them is a manager role.
12. if there are none, copy the two insert statements from the /src/main/resources/data.sql file in this application and run it in the h2 console to insert them.
13. open a new browser tab
14. navigate to localhost:8080.
15. at the Login Page, enter the username of either of the two students and enter any password. click the Submit button.
16. the login result will show according to the role of the username which you entered.


