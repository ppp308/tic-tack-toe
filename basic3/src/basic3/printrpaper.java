package basic3;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
//5��.������ ���� 2021.04.16 ������
//������ ���2
public class printrpaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sc = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		//���ϴ� ���·� ����ϱ� ���� �ҷ���
		SimpleDateFormat sf = new SimpleDateFormat("MM��dd��");
		//14�� ������ ��¥�� ���ϴ� ���·� ����ϱ� ���� �ҷ���
		Calendar cal = Calendar.getInstance();
		//��¥ �Լ� �ҷ�����
		DecimalFormat sb = new DecimalFormat("###,###,###");
		//1000�ڸ����� �޸����
		Date time = new Date();
		//���ó�¥ ��������
		cal.setTime(time);
		//���ó�¥ �ҷ�����
		String k11_date = sc.format(cal.getTime());
		//������ ���ڸ� ���ϴ� ���·� ����ؼ� ������ ����
		cal.add(Calendar.DATE, 14);
		//�ϼ��� 14���� ���ϱ� 
		String k11_afterdate = sf.format(cal.getTime());
		//14�� ���� ��¥�� ���ϴ� ���·� �����ͼ� ������ ����
		String k11_itemname1 = "ǻ��� �����ܿ븶��ũ(�ְ����)";
		//ù��° ǰ�� ����
		String k11_itemcode1 = "1031615";
		//ù��° ǰ���ڵ� ����
		int k11_price1 = 3000;
		//ù��° ���� ����
		int k11_amount1 = 1;
		//ù��° ǰ���� ���� ����
		String k11_itemname2 = "�����̵�ĸ���(������)(100ȣ)";
		//�ι�° ǰ�� ����
		String k11_itemcode2 = "11008152";
		//�ι�° ǰ���� �ڵ� ����
		int k11_price2 = 1000;
		//�ι�° ǰ�� ����
		int k11_amount2 = 1;
		//�ι�° ǰ�� ����
		String k11_itemname3 = "�������� ���׸�����ũ(�˷�̴�Ÿ��)";
		//����° ǰ�� 
		String k11_itemcode3 = "1022760";
		//����° ǰ�� �ڵ�
		int k11_price3 = 1000;
		//����° ǰ�� �ڵ� ����
		int k11_amount3 = 1;
		//������ ǰ�� ���� 
		double k11_total = k11_price1 * k11_amount1 + k11_price2 * k11_amount2 + k11_price3 * k11_amount3;
		//����*���� = �� ���� 
		double k11_totaltaxprice = (k11_total / 1.1);
		//�Ѱ��ݿ��� 1.1�� ���Ͽ� ������ ������ ���� ���ϱ�
		double k11_totaltax = (k11_total - k11_total / 1.1);
		//�� ���� - ���� ������ ���� = ����
		System.out.printf("                    \"���ΰ���, ���̼�\"\n");
		System.out.printf("(��)�Ƽ����̼�_�д缭����\n");
		System.out.printf("��ȭ:031-702-6016\n");
		System.out.printf("����:���� ������ ���μ�ȯ�� 2748 (���)\n");
		System.out.printf("��ǥ:������,��ȣ�� 213-81-52063\n");
		System.out.printf("����:��⵵ ������ �д籸 �д��53���� 11 (����\n");
		System.out.printf("��)\n");
		System.out.printf("=========================================\n");
		System.out.printf("         �Һ����߽ɰ濵(CCM)�������\n");
		System.out.printf("       ISO 9001 ǰ���濵�ý��� �������\n");
		System.out.printf("=========================================\n");
		System.out.printf("        ��ȯ/ȯ�� 14��(%s)�̳�,\n", k11_afterdate);
		//14�� ���Ŀ� ��¥�� �ڵ����� �ٲ�� ��,�Ϸ� ���
		System.out.printf("(����)������,����ī�� ���� �� ���Ը��忡�� ����\n");
		System.out.printf("       ����/���� �� �Ѽս� ��ȯ/ȯ�� �Ұ�\n");
		System.out.printf("         üũī�� ��� �� �ִ� 7�� �ҿ�\n");
		System.out.printf("=========================================\n");
		System.out.printf("[POS 1058231]                %s\n", k11_date);
		//�ý��� ��¥ ���
		System.out.printf("=========================================\n");
		System.out.printf("%14.14s  %5s %5s %9s\n", k11_itemname1, sb.format(k11_price1), sb.format(k11_amount1),
				sb.format(k11_price1));
		//ǰ���� ���̰� 15���� ���� �� �ְ� ����ϰ�, ������ ���⸦ ����
		System.out.printf("[%s]\n", k11_itemcode1);
		//�ڵ� ���
		System.out.printf("%12.15s  %7s %5s %9s\n", k11_itemname2, sb.format(k11_price2), sb.format(k11_amount2),
				sb.format(k11_price2));
		//ǰ���� ���̰� 15���� ���� �� �ְ� ����ϰ�, ������ ���⸦ ����
		System.out.printf("[%s]\n", k11_itemcode2);
		//�ڵ� ���
		System.out.printf("%9.14s  %s %5s %9s\n", k11_itemname3, sb.format(k11_price3), sb.format(k11_amount3),
				sb.format(k11_price3));
		//ǰ���� ���̰� 15���� ���� �� �ְ� ����ϰ�, ������ ���⸦ ����
		System.out.printf("[%s]\n", k11_itemcode3);
		//�ڵ� ���
		System.out.printf("                  �����հ�  %30s\n", sb.format(k11_totaltaxprice));
		//�����հ迡 �޸��� �ݿ��Ͽ� ���
		System.out.printf("                     �ΰ���  %30s\n", sb.format(k11_totaltax));
		//�ΰ����� �޸��� �ݿ��Ͽ� ���
		System.out.printf("-----------------------------------------\n");
		System.out.printf("�Ǹ��հ�   %47s\n", sb.format(k11_total));
		//�Ǹ��հ迡 �޸��� �ݿ��Ͽ� ���
		System.out.printf("=========================================\n");
		System.out.printf("�ſ�ī��   %47s\n", sb.format(k11_total));
		//�ſ�ī�忡 �Ǹ��հ踦 �޸��� �ݿ��Ͽ� ���
		System.out.printf("-----------------------------------------\n");
		System.out.printf("�츮ī��                            538720**********\n");
		System.out.printf("���ι�ȣ 77982843(0)             ���αݾ� %8s\n", sb.format(k11_total));
		//���ݿ� �޸��� �ݿ��Ͽ� ���
		System.out.printf("=========================================\n");
		System.out.printf("         %s �д缭����\n", k11_date);
		//�ý��� ��¥ ���
		System.out.printf("��ǰ �� ��Ÿ ����: 1522-4400\n");
		System.out.printf("����� �� �����̼� ���� ���� : 1599-2211\n");
		System.out.printf("                llIllllIllllIllllIllllIlllIllllIllllIllllIllllIllIllllIllllIllllIllIllllIllllI\n");
		//���ڵ�� ����� ������� ����..
		System.out.printf("                2112820610158231\n");
		System.out.printf("----------------------------------------\n");
		System.out.printf(" �� ���̼� ����� �� �Ǵ� Ȩ�������� �����ϼż� \n");
		System.out.printf("    ȸ������ �� �پ��� ������ ����������!  ��\n");

	}

}