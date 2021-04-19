package basic3;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
//5강.리포팅 연습 2021.04.19 박재희
//영수증 출력4
public class printpaper2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sc = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		// 현재 시간 출력
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:dd");
		// 시간도 포함하여 출력
		DecimalFormat sb = new DecimalFormat("###,###,###");
		// 천에 자리마다 콤마를 찍음
		Calendar cal = Calendar.getInstance();
		// 캘린더 자체를 옴
		Date time = new Date();
		// 현재 날짜를 가져옴
		cal.add(Calendar.HOUR, -1);
		// 캘린더를 가져와서 시간에서 -1을 함
		String k11_date = sc.format(time);
		// 오늘날짜만 있는 형태를 가져옴
		String k11_Cartime = sf.format(cal.getTime());
		// -1 한 시간도 포함하여 출력
		
		String[] k11_itemname = { "비비고토종김들기름", "간편한자른미역", "씻은당근", "더블링나일론깡롤", "냉동훈제연어",
				"육개장라면120g*5", "국내산삼겹살찌개", "오뚜기진비빔면156g", "볶은버섯세트", "딸기", "블루베리",
				"순살닭강정(g)", "무지양말3족", "패턴양말5족", "프리미엄생연어초밥", "그릭요거트 남양500", "서울우유",
				"식용유", "진라면소컵(매)65g*6", "케라시스앰플트리트", "푸르밀미숫가루우유", "자일로스갈색설탕500g", "오렌지",
				"손질냉동오징어", "루카나인10개입", "계란 12개입 ", "시금치", "바나나", "초코파이", "포도" };
		// 품목 변수 선언
		int[] k11_price = { 7500, 6900, 5980, 3300, 5500, 3380, 6610, 2750, 10800, 4980, 2480, 7920, 4980, 4980, 7130,
				3980, 4480, 4980, 3210, 6950, 2980, 1990, 1980, 3980, 4480, 3480, 7980, 1000, 2500, 3300 };
		// 가격 변수 선언
		int[] k11_num = { 2, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1, 2, 4, 1 };
		// 수량 변수 선언
		boolean[] k11_taxfree = { false, false, false, false, false, false, true, false, true, true, false, false,
				false, false, false, false, true, false, false, false, false, false, false, false, false, true, false,
				false, false, false };
		// 면세 등을 결정하는 변수
	
		int k11_itemcount = 0;
		// 수량 변수 초기화
		int k11_taxfreetotal = 0;
		// 면세 총합 초기화
		int k11_taxtotal = 0;
		// 세금 초기화
		double k11_tax = 0;
		// 세금 초기화
		double k11_sum = 0;
		// 합계 초기화
		System.out.printf("emart");
		System.out.printf("이마트 죽전점 (031)888-1234\n");
		System.out.printf("     206-86-50913 강희석\n");
		System.out.printf("     용인 수지구 포은대로 552\n");
		System.out.printf("영수증 미지참시 교환/환불 불가\n");
		System.out.printf("정상상품에 한함, 30일 이내(신선 7일)\n");
		System.out.printf("※일부 브랜드매장 제외(매장 고지물참조)\n");
		System.out.printf("교환/환불 구매점에서 가능(결제카드 지참)\n");
		System.out.printf("\n");
		System.out.printf("[구 매]%s           POS:0011-9861\n", k11_date);
		// 현재 시스템상 날짜,시간을 가져옴
		System.out.printf("-----------------------------------------------\n");
		System.out.printf("상품명             단가      수량         금액\n");
		System.out.printf("-----------------------------------------------\n");

		for (int i = 0; i < k11_itemname.length; i++) {
			// 품목명으로 선언한 변수 길이만큼 출력
			// 0~29
			if (k11_itemname[i].length() >= 7) {
				// 각 품목명의 길이가 7보다 클때
				k11_itemname[i] = k11_itemname[i].substring(0, 6);
				// 각 품목명의 6까지 가져옴
			} else {

			}

			int num = 12 - k11_itemname[i].getBytes().length;
			// 만약에 품목명이 모두 한글로 차있다면 6*2=12
			// 12 - 품목명길이의 바이트
			// 6길이 글자 - 실제 글자 길이 = 공백
			for (int j = 0; j < num; j++) {
				k11_itemname[i] = k11_itemname[i] + " ";
				// 공백의 길이만큼 글자+공백을 만듬
			}

			if (k11_taxfree[i] == true) {
				// 만약에 면세 품목이라면
				System.out.printf("* %s %10s %6d %14s\n", k11_itemname[i], sb.format(k11_price[i]), k11_num[i],
						sb.format(k11_price[i]));
				// 별표를 붙이고 출력함

			} else {
				// 면세 품목이 아니라면
				System.out.printf("  %s %10s %6d %14s\n", k11_itemname[i], sb.format(k11_price[i]), k11_num[i],
						sb.format(k11_price[i]));
				// 별표를 붙이지 않고 출력
			}

			if ((i + 1) % 5 == 0) {
				// 만약에 품목의 개수가 5라면
				System.out.printf("-----------------------------------------------\n");
				// 5개 마다 해당 출력문이 나오게 함
			} else {
				// 그게 아니라면 그냥 출력
			}

		}

		for (int i = 0; i < k11_num.length; i++) {
			// 총 품목수량의 길이만큼 돌아감
			k11_itemcount++;
			// count를 모두 더하여 출력
		}
		System.out.printf("\t\t    총 품목 수량 %14d\n", k11_itemcount);
		// 결과 출력
		for (int i = 0; i < k11_itemname.length; i++) {
			// 품목명의 길이만큼 돌면서
			if (k11_taxfree[i] == true) {
				// 만약에 면세 품목이라면
				k11_taxfreetotal = k11_taxfreetotal + k11_price[i] * k11_num[i];
				// 해당과 같은 계산을 하고 taxfreetotal에 더함
			} else {
				k11_taxtotal = k11_taxtotal + k11_price[i] * k11_num[i];
				// 그게 아니라면 taxtotal에 저장하며
				k11_tax = k11_taxtotal * 0.1;
				// 과세가격의 세금을 따로 구함
			}
			k11_sum = k11_taxtotal + k11_taxfreetotal;
			// 총 결제대상금액은 면세품목 + 과세품목
		}
		System.out.printf("\t\t(*) 면세 물품 %17s\n", sb.format(k11_taxfreetotal));
		// 천자리마다 콤마를 찍음
		System.out.printf("\t\t    과세 물품 %17s\n", sb.format(k11_taxtotal));
		// 천자리마다 콤마를 찍음
		System.out.printf("\t\t    부가세 %20s\n", sb.format(k11_tax));
		// 천자리마다 콤마를 찍음
		System.out.printf("\t\t    합계 %22s\n", sb.format(k11_sum));
		// 천자리마다 콤마를 찍음
		System.out.printf("결제대상금액 %34s\n", sb.format(k11_sum));
		// 천자리마다 콤마를 찍음
		System.out.printf("-----------------------------------------------\n");
		System.out.printf("0012KEB하나               541707**0484/35860658\n");
		System.out.printf("카드결제(IC)                     일시불/%s\n", sb.format(k11_sum));
		// 천자리마다 콤마를 찍음
		System.out.printf("-----------------------------------------------\n");
		System.out.printf("                   [신세계포인트 적립]\n");
		System.out.printf("박*희 고객님의 포인트 현황입니다.\n");
		System.out.printf("금회발생포인트           9350**9995         164\n");
		System.out.printf("누계(가용)포인트           5,637(        5,473)\n");
		System.out.printf("*신세계포인트 유효기간은 2년입니다.\n");
		System.out.printf("-----------------------------------------------\n");
		System.out.printf("        구매금액기준 무료주차시간 자동부여\n");
		System.out.printf("차량번호:                              34저****\n");
		System.out.printf("입차시간:                  %20s\n", k11_Cartime);
		System.out.printf("-----------------------------------------------\n");
		System.out.printf("캐셔:084599 양oo                           1150\n");
		System.out.printf("   llIllIllIllllIllllIllIllllIllIllllIllIllll      \n");
		System.out.printf("       20210303/00119861/00164980/31\n");
	}
}