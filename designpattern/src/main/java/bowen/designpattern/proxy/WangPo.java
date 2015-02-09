package bowen.designpattern.proxy;

public class WangPo implements KindWomen {

	private KindWomen kindWomen;

	public WangPo() { // Ĭ�ϵĻ������˽����Ĵ���
		this.kindWomen = new PanJinLian();
	}

	// �������KindWomen���κ�һ��Ů�˵Ĵ��?ֻҪ������һ����
	public WangPo(KindWomen kindWomen) {
		this.kindWomen = kindWomen;
	}

	public void makeEyesWithMan() {
		this.kindWomen.happyWithMan(); //�Լ����ˣ��ɲ��ˣ�����������Ĵ���

	}

	public void happyWithMan() {
		this.kindWomen.makeEyesWithMan(); //������ô�������ˣ�˭���������ۣ���

	}

}
