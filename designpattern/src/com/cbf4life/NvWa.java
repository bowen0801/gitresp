package com.cbf4life;

public class NvWa {
	public static void main(String[] args) {
		// Ů洵�һ�����ˣ��������ʣ�����㣬����㣬ȱ�ݲ�Ʒ
		System.out.println("------------����ĵ�һ�����������ģ�����-----------------");
		Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
		whiteHuman.cry();
		whiteHuman.laugh();
		whiteHuman.talk();
		// Ů洵ڶ������ˣ�������㣬Ȼ���ֳ��˸���Ʒ������
		System.out.println("\n\n------------����ĵڶ������������ģ�����-----------------");
		Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
		blackHuman.cry();
		blackHuman.laugh();
		blackHuman.talk();
		// ���������ˣ���λ�����յ����ã���ɫ���ࣨ��д���ˣ�����������壩����ע��RB�˲����ڴ���
		System.out.println("\n\n------------����ĵ��������������ģ���ɫ����-----------------");

		Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
		yellowHuman.cry();
		yellowHuman.laugh();
		yellowHuman.talk();
	}

}
