/**
 * 
 */
package com.study.pattern.observer;

/**
 * @author 
 *
 */
public class Subscriber implements Observer {
	
	private String name;
	
	public Subscriber(String name) {
		this.name=name;
	}
	
	@Override
	public void update() {
		System.out.println("Hi "+name+",Video updated");
	}

}
