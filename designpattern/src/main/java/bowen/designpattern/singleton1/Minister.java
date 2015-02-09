package bowen.designpattern.singleton1;

public class Minister {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ��һ��
		Emperor emperor1 = Emperor.getInstance();
		emperor1.emperorInfo(); // ��һ���Ļʵ۽�ʲô�����أ�
		// �ڶ���
		Emperor emperor2 = Emperor.getInstance();
		Emperor.emperorInfo();
		// ������
		Emperor emperor3 = Emperor.getInstance();
		emperor2.emperorInfo();
		// �����Ļʵ۶���ͬһ���ˣ����Ұɣ�
	}

}
