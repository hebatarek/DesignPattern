package com.maugames.singleton;

public class ThreadSafeSynchronizedBlockIntialization {

	private static ThreadSafeSynchronizedBlockIntialization instance;

	private ThreadSafeSynchronizedBlockIntialization() {
	}

	public static ThreadSafeSynchronizedBlockIntialization getInstance() {
		if (instance == null) {
			synchronized (ThreadSafeSynchronizedBlockIntialization.class) {
				if (instance == null)
					instance = new ThreadSafeSynchronizedBlockIntialization();
			}
		}
		return instance;
	}
}
