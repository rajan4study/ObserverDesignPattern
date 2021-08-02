package com.study.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 
 *
 */
public class Channel implements Subject {
	
	private List<Subscriber> subscibers=new ArrayList<>();

	@Override
	public void addSubscriber(Subscriber sub) {
		subscibers.add(sub);

	}

	@Override
	public void removeSubscriber(Subscriber sub) {
		subscibers.remove(sub);

	}

	@Override
	public void notifyAllSubscriber() {
		subscibers.stream().forEach(Subscriber::update);

	}

	@Override
	public void uploadNewVideo(String title) {
		System.out.println("New video updated : "+ title);
		notifyAllSubscriber();

	}

}
