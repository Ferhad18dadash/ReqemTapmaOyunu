package Package1;

import java.util.Random;
import java.util.Scanner;

public class SayiTahminOuyun {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Oyuna xos geldiniz cetinlik derecesin secin \n 1-sade \n 2-orta \n 3- cetin\n 4-oyunu bitir:");
		while (true) {
			int f = scan.nextInt();
			if (f == 1) {
				System.out.println("siz sadə oyunu secdiniz Uqurlar\n eded daxil edin!\n");

				int sayi1, tahmin = 0;
				int sayi = rand.nextInt(100);
				String r = "tapa bilmədiz!axdardiginiz ədəd";
				while (true) {
					while (tahmin != 7) {
						sayi1 = scan.nextInt();
						if (sayi1 < sayi) {
							System.out.println("daha boyuk eded daxil edin!");

						} else if (sayi1 > sayi) {
							System.out.println("daha kicik eded daxil edin");
						} else {
							r = "tebrikler siz qazandiniz" + tahmin + "defeye tapdiz";
							break;
						}

						tahmin += 1;
					}
					System.out.println(r);
					System.out.println("yeniden oynamaq ucun 2;bitirmek ucun 1 seciniz");
					int s = scan.nextInt();
					if (s == 1) {

						System.out.println("saqolun");
						break;
					}
					else {
						tahmin = 0;
					}
				}
			}
			if (f == 2) {
				System.out.println("siz  orta oyunu secdiniz secdiniz Uqurlar\n eded daxil edin!\n");

				int sayi1, tahmin = 0;
				int sayi = rand.nextInt(100);
				String r = "tapa bilmədiz!axdardiginiz ədəd" + sayi;
				while (true) {
					while (tahmin != 6) {
						sayi1 = scan.nextInt();
						if (sayi1 < sayi) {
							System.out.println("daha boyuk eded daxil edin!");

						} else if (sayi1 > sayi) {
							System.out.println("daha kicik eded daxil edin");
						} else {
							r = "tebrikler siz qazandiniz" + tahmin + "defeye tapdiz";
							break;
						}

						tahmin += 1;
					}
					System.out.println(r);
					System.out.println("yeniden oynamaq ucun 2;bitirmek ucun 1 seciniz");
					int s = scan.nextInt();
					if (s == 1) {

						System.out.println("saqolun");
						break;
					} else {
						tahmin = 0;
					}
				}
			}
			if (f == 3) {

				System.out.println("siz cetin  oyunu secdiniz Uqurlar\n eded daxil edin!\n");

				int sayi1, tahmin = 0;
				int sayi = rand.nextInt(100);
				String r = "tapa bilmədiz!axdardiginiz ədəd" + sayi;
				while (true) {
					while (tahmin != 5) {
						sayi1 = scan.nextInt();
						if (sayi1 < sayi) {
							System.out.println("daha boyuk eded daxil edin!");

						} else if (sayi1 > sayi) {
							System.out.println("daha kicik eded daxil edin");
						} else {
							r = "tebrikler siz qazandiniz,ededi" + tahmin + "defeye tapdiz";
							break;
						}

						tahmin += 1;
					}
					System.out.println(r);
					System.out.println("yeniden oynamaq ucun 2;bitirmek ucun 1 seciniz");
					int s = scan.nextInt();
					if (s == 1) {

						System.out.println("saqolun");
						break;
					} else {
						tahmin = 0;
					}
				}
			}
			System.out.println("oyunda cetinlik derecesin secin\\n1-sade\\n2-orta\\n 3- cetin\\n 4-oyunu bitir:");
			if (f == 4) {
				System.out.println("oyundan cixdiniz saqolun");
				break;
			}

		}
	}

}
