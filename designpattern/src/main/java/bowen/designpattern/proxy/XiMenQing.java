package bowen.designpattern.proxy;

public class XiMenQing {
	/*
	 * ˮ���������д�ģ������챻�˽������������һ���ѵ��������ˣ� �����ſ�����, �Ϳ�ʼ������˺��£�������Ϊ�˽����Ĵ�����
	 * ���˲��ٺô��ѣ������Ǽ���һ�£� ���û���������м�ǣ�ߣ���������Ҫ�����ܳ�����˵�ĺܣ�
	 */
	public static void main(String[] args) {
		/*// �����Žг���
		WangPo wangPo = new WangPo();
		// Ȼ���������˵����Ҫ���˽���happy��Ȼ�����žͰ����������춪���ӵ��ǳ�Ϸ:
		wangPo.makeEyesWithMan(); // ����û����Ȼ������ʱ����������ʵ����ˬ�����˽���
		wangPo.happyWithMan();*/
		
		JiaShi jiaShi = new JiaShi();
		WangPo wangPo = new WangPo(jiaShi); //��������Ϊ���ϵĴ�����
		wangPo.makeEyesWithMan();
		wangPo.happyWithMan();
		
		
	}

}
