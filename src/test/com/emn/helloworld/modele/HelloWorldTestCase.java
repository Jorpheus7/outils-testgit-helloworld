package test.com.emn.helloworld.modele;

import java.com.emn.helloworld.modele.HelloWorld;

import junit.framework.TestCase;

import org.junit.Test;

public class HelloWorldTestCase extends TestCase {

	@Test
	public void testGetMessage(){
		HelloWorld helloWorld = new HelloWorld();
		assertEquals("Hello World !", helloWorld.getMessage());
	}

}
