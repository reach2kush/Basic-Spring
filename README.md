# Basic-Spring
You will learn SPRING IN ACTION means how we are using spring in live projects.

If you are a new born baby to Spring ,before going to code just read README.md once.

Have a look on below flow :

UI ---> Spring ---> DB (imagine as jsp--->java classes --->oracle DB)

Now we will divide Spring into three layer for code maintainability : 

Controller ----> Service ----> Dao

Controller will talk with UI & your service layer .Controller takes request from UI & pass it to Service layer in proper format.

Service talks with Controller & Dao layer .In service layer , we are writing our business logic & then pass that to DAO layer for CRUD operation with DB
 
Dao layer talks with service & Database .In Dao layer ,you will find CRUD operation related things.

Now again have a look on flow :

UI --->Controller ---> Service ---> Dao --->DB.

To talk about Spring more , Spring works on Configuration file (dispatcher-servlet.xml) where you specify what spring will do for you.

In web.xml , based on your url pattern mapping we are redirecting to Spring Configuration file which is mandaory for Spring to Work properly.

Now again have a look on flow :

UI ---> web.xml ---> dispatcher-servlet.xml --->Controller ---> Service ---> Dao --->DB.

Now just go through the code & read the comments written in code for more understanding on Spring Basics. 


