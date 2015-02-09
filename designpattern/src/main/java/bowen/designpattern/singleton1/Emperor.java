package bowen.designpattern.singleton1;

public class Emperor {
	private static Emperor emperor = null; // ����һ���ʵ۷������Ȼ�������ʵ�����

	private Emperor() {
		// ���׺͵���Լ���㣬Ŀ�ľ��ǲ��������ڶ����ʵ�
	}

	public static Emperor getInstance() {

		if (emperor == null) { // ���ʵۻ�û�ж��壬�ǾͶ�һ��
			emperor = new Emperor();
		}
		return emperor;
	}

	// �ʵ۽�ʲô����ѽ
	public static void emperorInfo() {
		System.out.println("�Ҿ��ǻʵ�ĳĳĳ....");
	}

}
