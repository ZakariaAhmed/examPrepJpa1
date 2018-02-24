# examPrepJpa1
Exam Prep Jpa 1

## Describe how you have handled persistence in the last three semesters. The considerations should include all relevant layers. File IO, Relational Databases, local storage and cookies in browsers. 
We used Java Database Connectivity, and some unneccesary complex idiotic servlets,
with commands and action to send request and response headers with sessions and cookies around to smaller servlets.
on our frontend we used outdated JSP pages, we also wrote mappers with our own SQL statements to persist our pojos to the database.
such is life at school :-) 

## Explain the rationale behind the topic Object Relational Mapping and the Pros and Cons in using a ORM
ORM is a persistance library API that sits between the database and our objects, 
Hibernate probably the most popular one for Java, but we using EclipseLink on our project.
Pros:
Makes it easier for us not to write a bunch of mappers constantly, to map our classes in order to save them on a database, is a big time saver :-)

Cons:
Probably some cons. if we deep dive into complex objects, that wont exactly be able to match
with our ORM, I also read that Oracle made some of their earlier versions far too complex and slow,

There's also the object relational impedance mismatch, which is a set of issues that occurs when you try to match an app that is written in object oriented language, with a RDMBS (Relation Database Management System).
In object oriented programming we traverse objects, while RDMBS and the relational databases are written with mathmatical principles in mind, 
[In depth explaination](http://www.agiledata.org/essays/impedanceMismatch.html)

[There's a bunch of issues, beyond our scope written here](https://en.wikipedia.org/wiki/Object-relational_impedance_mismatch#Mismatches)


## Explain the JPA strategy for handling Object Relational Mapping and important classes/annotations involved.
Well the strategy is to map and save our pojos to the database, and vice versa,
so it is really helpful to annotate so EclipseLink knows which one is gonna be used for id,
and which one is relational to another pojo.

## Outline some of the fundamental differences in Database handling using plain JDBC versus JPA
JDBC is very primitive we just use a singleton object to connect to our database, then we write our classes/entities, afterwards we write CRUD mappers. Unneccesary complex.
JPA generates automatically database for us, and adds all the entities we add on our persistence.xml
