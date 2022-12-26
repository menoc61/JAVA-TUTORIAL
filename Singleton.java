// File Name: Singleton.java
public class Singleton{
	
	private static Singleton singleton = new Singleton(); 
	
/* A private constructor prevents any other
*class from instantiating.

private Singleton() {}

/* Static 'instance' method */

public static Singleton getInstance() {
	return singleton;
}
/* Other methods protected by  singleton-ness */
protected void demoMethod(){
	System.out.println("demoMethod for singleton");
}
}

//======================== NOTE ==================================================================
// Pour les francophone desole encore une fois mais vous allez devoir utilise google translator🙇🏾‍♂️
// https://translate.google.com/
//=================================================================================================
// 1.) Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class exists in the Java Virtual Machine. The singleton class must provide a global access point to get the instance of the class.
// 2.) Singleton pattern is used for logging, drivers objects, caching, and thread pool