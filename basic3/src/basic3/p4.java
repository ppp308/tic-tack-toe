package basic3;

//5��.������,���� 2021.04.14������
//������ ���1
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class p4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sc = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		// �ý��� ��¥�� �ð��� ������ ��ȯ�ϴ� Ŭ����
		DecimalFormat sb = new DecimalFormat("###,###,###");
		// 1000�� �ڸ����� �޸� ���
		Date time = new Date();
		// �ý��� ��¥�� �ð��� �������� Ŭ����
		String k11_date = sc.format(time);
		// ��¥�� �ð��� ������ ����
		double k11_iprice = 33000;
		// �հ� ����
		double k11_price = (k11_iprice / 1.1);
		// �հ踦 �̿��Ͽ� �ݾ� ����
		double k11_tax = (k11_price * 0.1);
		// �հԸ� �̿��Ͽ� �ΰ��� ����
		System.out.printf("�ſ����\n");
		System.out.printf("�ܸ��� : 2N68665898             ��ǥ��ȣ : 041218\n");
		System.out.printf("������ : �Ѿ��ġ�\n");
		System.out.printf("��  �� : ��⼺���� �д籸 Ȳ����� 351����  10 .\n");
		System.out.printf("1��\n");
		System.out.printf("��ǥ�� : ��â��\n");
		System.out.printf("����� : 752-53-00558               TEL : 7055695\n");
		System.out.printf("------------------------------------------------\n");
		System.out.printf("��    ��                             %s    ��\n", sb.format(k11_price));
		// �ݾ׿� õ�ڸ��� �޸� ����
		System.out.printf("�� �� ��                              %s    ��\n", sb.format(k11_tax));
		// �ΰ����� õ�ڸ��� �޸� ����
		System.out.printf("��    ��                             %s    ��\n", sb.format(k11_iprice));
		// �հ迡 õ�ڸ��� �޸� ����
		System.out.printf("-------------------------------------------------\n");
		System.out.printf("�츮ī��\n");
		System.out.printf("ī���ȣ : 5387-20**-****-4613(S)          �Ͻú�\n");
		System.out.printf("�ŷ��Ͻ� : %s\n", k11_date);
		// �ý��� ��¥�� �ð��� �ش��������� ��ȯ�Ͽ� �ݿ�
		System.out.printf("���ι�ȣ : 70404427\n");
		System.out.printf("�ŷ���ȣ : 357734873739\n");
		System.out.printf("���� : ��ī���       ���� : 720068568\n");
		System.out.printf("�˸� : EDC����ǥ\n");
		System.out.printf("���� : TEL)1544-4700\n");
		System.out.printf("-------------------------------------------------\n");
		System.out.printf("                     * �����մϴ� * \n");
		System.out.printf("                                ǥ��v2.08_20200212 \n");

	}

}
