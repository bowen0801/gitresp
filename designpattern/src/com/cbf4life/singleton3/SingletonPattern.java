package com.cbf4life.singleton3;
/**
 * 单例模式，支持多线程
 * @author admin
 *
 */
public class SingletonPattern {
	private static final SingletonPattern singletonPattern = new SingletonPattern();

	// 限制住不能直接产生一个实例
	private SingletonPattern() {
	}

	public synchronized static SingletonPattern getInstance() {
		return singletonPattern;
	}

}
