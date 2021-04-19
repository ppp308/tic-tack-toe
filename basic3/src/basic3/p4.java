package basic3;

//5강.리포팅,연습 2021.04.14박재희
//영수증 출력1
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class p4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sc = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		// 시스템 날짜와 시간의 형식을 변환하는 클래스
		DecimalFormat sb = new DecimalFormat("###,###,###");
		// 1000에 자리마다 콤마 출력
		Date time = new Date();
		// 시스템 날짜와 시간을 가져오는 클래스
		String k11_date = sc.format(time);
		// 날짜와 시간의 형식을 적용
		double k11_iprice = 33000;
		// 합계 지정
		double k11_price = (k11_iprice / 1.1);
		// 합계를 이용하여 금액 변수
		double k11_tax = (k11_price * 0.1);
		// 합게를 이용하여 부가세 변수
		System.out.printf("신용승인\n");
		System.out.printf("단말기 : 2N68665898             전표번호 : 041218\n");
		System.out.printf("가맹점 : 한양김치찌개\n");
		System.out.printf("주  소 : 경기성남시 분당구 황새울로 351번길  10 .\n");
		System.out.printf("1층\n");
		System.out.printf("대표자 : 유창신\n");
		System.out.printf("사업자 : 752-53-00558               TEL : 7055695\n");
		System.out.printf("------------------------------------------------\n");
		System.out.printf("금    액                             %s    원\n", sb.format(k11_price));
		// 금액에 천자리씩 콤마 적용
		System.out.printf("부 가 세                              %s    원\n", sb.format(k11_tax));
		// 부가세에 천자리씩 콤마 적용
		System.out.printf("합    계                             %s    원\n", sb.format(k11_iprice));
		// 합계에 천자리씩 콤마 적용
		System.out.printf("-------------------------------------------------\n");
		System.out.printf("우리카드\n");
		System.out.printf("카드번호 : 5387-20**-****-4613(S)          일시불\n");
		System.out.printf("거래일시 : %s\n", k11_date);
		// 시스템 날짜와 시간을 해당형식으로 변환하여 반영
		System.out.printf("승인번호 : 70404427\n");
		System.out.printf("거래번호 : 357734873739\n");
		System.out.printf("매입 : 비씨카드사       가맹 : 720068568\n");
		System.out.printf("알림 : EDC매출표\n");
		System.out.printf("문의 : TEL)1544-4700\n");
		System.out.printf("-------------------------------------------------\n");
		System.out.printf("                     * 감사합니다 * \n");
		System.out.printf("                                표준v2.08_20200212 \n");

	}

}
