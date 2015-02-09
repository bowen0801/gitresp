package bowen.designpattern.singleton3;
/**
 * ����ģʽ��֧�ֶ��߳�
 * @author admin
 *
 */
public class SingletonPattern {
	private static final SingletonPattern singletonPattern = new SingletonPattern();

	// ����ס����ֱ�Ӳ���һ��ʵ��
	private SingletonPattern() {
	}

	public synchronized static SingletonPattern getInstance() {
		return singletonPattern;
	}

}
