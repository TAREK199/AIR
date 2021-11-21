# TP2 

## EJB 

> EJB is an architecture to develop a scalable and distributed java enterprise application, mainly used to encapsulate the business logic of an application
In any application we will look on it as a three different layers.


* __The web layer__
> Consist of the client side, where it can call any method provided by the business logic layer by looking on the JNDI
* __The business logic layer__
> Contains all the logic components of the app like lifecycle beans, DI and security This layer also provides an interfaces that have all the functionalities that can be called by the client side those interfaces can be Remote (@Remote) in the case where our client and our EJB located in two different environment or Local (@Local) where the both located in the same environment (container)
* __Data layer (also named JPA layer)__
> will encapsulate the all tasks of mapping and managing the access to the database


## EJB Categories 

* Session DB 

  * Stateless : the server hasn't any information of the client, no association maintained between the server and the client like REST
  * Stateful : is another type of Bean which save the state between the server and client
* Message Driven EJB
* Entity Bean 

## EJB Categories 

![](https://github.com/TAREK199/AIR/blob/master/tp2/images/Screenshot%20from%202019-10-19%2008-06-22.png?raw=true)

### WilFly Server 8.0 (Jboss):
> WildFly, formerly JBoss Application Server or JBoss, is a Free Java EE application server written in Java, released under the GNU LGPL license. Being written in Java, WildFly can be used on any operating system providing a Java Virtual Machine (JVM)

![](https://github.com/TAREK199/AIR/blob/master/tp2/images/unnamed.png?raw=true)

### JDK 8 (java 8):
> The JDK is a development environment for building applications using the Java programming language

### Eclipse IDE:
> Eclipse IDE is a free integrated development environment (the term Eclipse also refers to the corresponding project, launched by IBM) extensible, universal and versatile, potentially allowing the creation of development projects implementing any programming language. Eclipse IDE is mainly written in Java (using the SWT graphics library, from IBM), and this language, thanks to libraries.

## Some Screenshots:

#### Project Structure : 
![](https://github.com/TAREK199/AIR/blob/master/tp2/images/6.png?raw=true)

#### Server : 
![](https://github.com/TAREK199/AIR/blob/master/tp2/images/2.png?raw=true)

#### Classes : 
![](https://github.com/TAREK199/AIR/blob/master/tp2/images/3.png?raw=true)
![](https://github.com/TAREK199/AIR/blob/master/tp2/images/4.png?raw=true)
![](https://github.com/TAREK199/AIR/blob/master/tp2/images/8.png?raw=true)













