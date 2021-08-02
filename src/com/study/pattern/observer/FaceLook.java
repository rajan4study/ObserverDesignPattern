/**
 * 
 */
package com.study.pattern.observer;

/**
 * @author 
 *
 */
public class FaceLook {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Subscriber s1= new Subscriber("rajan");
		Subscriber s2= new Subscriber("toby");
		Subscriber s3= new Subscriber("rasi");
		Subscriber s4= new Subscriber("rajesh");
		
		Channel channel= new Channel();
		channel.addSubscriber(s1);
		channel.addSubscriber(s2);
		channel.addSubscriber(s3);
		channel.addSubscriber(s4);
		
		channel.uploadNewVideo("How to work");

	}

}
