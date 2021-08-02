package com.study.pattern.observer;

/**
 * @author 
 *
 */
public interface Subject {

	void addSubscriber(Subscriber sub);
	void removeSubscriber(Subscriber sub);
	void notifyAllSubscriber();
	void uploadNewVideo(String title);
}
