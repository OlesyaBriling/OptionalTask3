import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Srznach {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите количество чисел ");
        int n = Integer.parseInt(br.readLine());
        String Numbers[] = new String[n];
        System.out.println("Введите числа");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            Numbers[i] = String.valueOf(Integer.parseInt(br.readLine()));
            sum += Numbers[i].length();
        }
        System.out.println("Сумма длин всех чисел " +sum);
        double arg = sum / n;
        System.out.println("Средняя длина числа "+arg);
    for (int i = 0; i < n; i++ ) {
        if (Numbers[i].length() > arg) {
            System.out.print(Numbers[i]+" - ");
            System.out.print("длина числа "+Numbers[i].length() + "\n" );
        }
    }
    }



}


