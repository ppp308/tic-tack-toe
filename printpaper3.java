package basic3;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//5��.������ ���� 2021.04.22 ������
//������ ���3
public class printpaper1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sc = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		// ���� �ð� ���
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:dd");
		// �ð��� �����Ͽ� ���
		SimpleDateFormat sd = new SimpleDateFormat("yyyyMMdd");
		
		DecimalFormat sb = new DecimalFormat("###,###,###");
		// õ�� �ڸ����� �޸��� ����
		Calendar cal = Calendar.getInstance();
		// Ķ���� ��ü�� ��
		Date time = new Date();
		// ���� ��¥�� ������
		cal.add(Calendar.HOUR, -1);
		// Ķ������ �����ͼ� �ð����� -1�� ��
		String k11_date = sc.format(time);
		// ���ó�¥�� �ִ� ���¸� ������
		String k11_Cartime = sf.format(cal.getTime());
		// -1 �� �ð��� �����Ͽ� ���
		String k11_today = sd.format(time);
		String[] k11_itemname = { "����ȨSAFE365�ڵ���Ŭ����", "(G)LH��������ȭ��10", "��������E", "���������Ϸб���", "����ȨSAFE�ڵ����",
				"��ɽŶ��120g*5", "(��)����������", "���ѱ��������156g", "GAP ������ 4-6��/", "������� �ٳ���(��)", "����ũ ź�θ� �߰���",
				"(����)����߰���(g)", "DZ�ִϾ�縻3��_BK", "DZ�ִϾ�縻3��_WK", "�����̾��������ʹ�", "����ũ����̿���500", "������ִ¿���GT������",
				"���������÷�10��", "��������(��)65g*6", "�ɶ�ý�����Ʈ��Ʈ", "Ǫ���й̼��������", "���Ϸν���������500g", "CJ ����Ĩ 20G", "����ũ����̿���500g",
				"����縻����ũƼ", "1+��޶�10���� Ư", "������ݺ�����ġ��ȹ", "�ٳ���", "��������", "����","������ ���̷ν� ()100�׷�a++" };
		// ǰ�� ���� ����
		int[] k11_price = { 7500, 6900, 5980, 3300, 1000000, 3380000, 6610, 2750, 10,100, 2480, 7920, 4980, 4980, 7130,
				3980, 4480, 4980, 3210, 6950, 2980, 1990, 1980, 3980, 4480, 3480, 7980, 1000, 2500, 3300,4000 };
		// ���� ���� ����
		int[] k11_num = { 2, 1, 1, 1, 5, 1, 1, 1, 1, 10, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1, 2, 4, 1,1 };
		// ���� ���� ����
		boolean[] k11_taxfree = { false, false, false, false, false, false, true, false, true, true, false, false,
				false, false, false, false, true, false, false, false, false, false, false, false, false, true, false,
				false, false, false,false };
		// �鼼 ���� �����ϴ� ����
		int k11_itemcount = 0;
		// ���� ���� �ʱ�ȭ
		int k11_taxfreetotal = 0;
		// �鼼 ���� �ʱ�ȭ
		int k11_taxtotal = 0;
		// ���� �ʱ�ȭ
		double k11_sum = 0;
		// �հ� �ʱ�ȭ
		double k11_beforetaxtotal =0;
		//������ǰ���� �ΰ����� �� �ݾ� �ʱ�ȭ
		double k11_beforetax =0;
		//������ǰ���� �ΰ��� �ʱ�ȭ
		System.out.printf("emart");
		System.out.printf("�̸�Ʈ ������ (031)888-1234\n");
		System.out.printf("     206-86-50913 ����\n");
		System.out.printf("     ���� ������ ������� 552\n");
		System.out.printf("������ �������� ��ȯ/ȯ�� �Ұ�\n");
		System.out.printf("�����ǰ�� ����, 30�� �̳�(�ż� 7��)\n");
		System.out.printf("���Ϻ� �귣����� ����(���� ����������)\n");
		System.out.printf("��ȯ/ȯ�� ���������� ����(����ī�� ����)\n");
		System.out.printf("\n");
		System.out.printf("[�� ��]%s      POS:0011-9861\n", k11_date);
		// ���� �ý��ۻ� ��¥,�ð��� ������
		System.out.printf("-----------------------------------------\n");
		System.out.printf("  ��ǰ��          �ܰ�    ����     �ݾ�\n");
		System.out.printf("-----------------------------------------\n");
		
		
		for (int i = 0; i < k11_itemname.length; i++) {
			// ǰ������� ������ ���� ���̸�ŭ ���
			// 0~29
			if (k11_itemname[i].length() >= 7) {
				// �� ǰ����� ���̰� 7���� Ŭ��
				k11_itemname[i] = k11_itemname[i].substring(0, 6);
				// �� ǰ����� 6���� ������
			} else {

			}

			int num = 12 - k11_itemname[i].getBytes().length;
			// ���࿡ ǰ����� ��� �ѱ۷� ���ִٸ� 6*2=12
			// 12 - ǰ��������� ����Ʈ
			// 6���� ���� - ���� ���� ���� = ����
			for (int j = 0; j < num; j++) {
				k11_itemname[i] = k11_itemname[i] + " ";
				// ������ ���̸�ŭ ����+������ ����
			}

			if (k11_taxfree[i] == true) {
				// ���࿡ �鼼 ǰ���̶��
				System.out.printf("*%s %9s %5d %10s\n", k11_itemname[i], sb.format(k11_price[i]), k11_num[i],
						sb.format(k11_price[i]*k11_num[i]));
				// ��ǥ�� ���̰� �����

			} else {
				// �鼼 ǰ���� �ƴ϶��
				System.out.printf(" %s %9s %5d %10s\n", k11_itemname[i], sb.format(k11_price[i]), k11_num[i],
						sb.format(k11_price[i]*k11_num[i]));
				// ��ǥ�� ������ �ʰ� ���
			}

			if ((i + 1) % 5 == 0) {
				// ���࿡ ǰ���� ������ 5���
				System.out.printf("-----------------------------------------\n");
				// 5�� ���� �ش� ��¹��� ������ ��
			} else {
				// �װ� �ƴ϶�� �׳� ���
			}

		}

		for (int i = 0; i < k11_num.length; i++) {
			// �� ǰ������� ���̸�ŭ ���ư�
			k11_itemcount++;
			// count�� ��� ���Ͽ� ���
		}
		System.out.printf("                �� ǰ�� ����%12d\n", k11_itemcount);
		// ��� ���
		
		for (int i = 0; i < k11_itemname.length; i++) {
			// ǰ����� ���̸�ŭ ���鼭
			if (k11_taxfree[i] == true) {
				// ���࿡ �鼼 ǰ���̶��
				k11_taxfreetotal = k11_taxfreetotal + k11_price[i] * k11_num[i];
				// �ش�� ���� ����� �ϰ� taxfreetotal�� ����
			} else {
				k11_taxtotal = k11_taxtotal + k11_price[i] * k11_num[i];
				// �װ� �ƴ϶�� taxtotal�� �����ϸ�
				k11_beforetaxtotal = k11_taxtotal / (11.0/10.0);
				k11_beforetax = k11_taxtotal-k11_beforetaxtotal;
				// ���������� ������ ���� ����			
			}
			k11_sum = k11_beforetaxtotal + k11_taxfreetotal+k11_beforetax;
			// �� �������ݾ��� �鼼ǰ�� + ����ǰ��(��������)+�ΰ���
		}
	
		System.out.printf("             (*)�� ��  �� ǰ%12s\n", sb.format(k11_taxfreetotal));
		// õ�ڸ����� �޸��� ����
		System.out.printf("                �� ��  �� ǰ%12s\n", sb.format(k11_beforetaxtotal));
		// õ�ڸ����� �޸��� ����
		System.out.printf("                ��   ��   ��%12s\n", sb.format(k11_beforetax));
		// õ�ڸ����� �޸��� ����
		System.out.printf("                ��        ��%12s\n", sb.format(k11_sum));
		// õ�ڸ����� �޸��� ����
		System.out.printf("�������ݾ�%28s\n", sb.format(k11_sum));
		// õ�ڸ����� �޸��� ����
		System.out.printf("-----------------------------------------\n");
		System.out.printf("0012KEB�ϳ�        541707**0484/35860658\n");
		System.out.printf("ī�����(IC)            �Ͻú�/%s\n", sb.format(k11_sum));
		// õ�ڸ����� �޸��� ����
		System.out.printf("-----------------------------------------\n");
		System.out.printf("              [�ż�������Ʈ ����]\n");
		System.out.printf("��*�� �������� ����Ʈ ��Ȳ�Դϴ�.\n");
		System.out.printf("��ȸ�߻�����Ʈ         9350**9995    164\n");
		System.out.printf("����(����)����Ʈ          5,637(   5,473)\n");
		System.out.printf("*�ż�������Ʈ ��ȿ�Ⱓ�� 2���Դϴ�.\n");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("    ���űݾױ��� ���������ð� �ڵ��ο�\n");
		System.out.printf("������ȣ:                       34��****\n");
		System.out.printf("�����ð�:            %s\n", k11_Cartime);
		System.out.printf("-----------------------------------------\n");
		System.out.printf("ĳ��:084599 ��oo                   1150\n");
		System.out.printf("      lIllIllllIllllIllIllllIllIllllIllI \n");
		System.out.printf("       %s/00119861/00164980/31\n",k11_today);
	}
}