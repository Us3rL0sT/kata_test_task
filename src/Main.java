import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите числа и операцию между ними:");

        String str = in.nextLine();

        calc(str);
    }

    public static String calc(String input) {

        String[] words = input.split(" ");
        if (words.length > 3) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
                System.exit(1);
            }
        }
        else if (words.length == 1 || words.length == 2) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("строка не является математической операцией");
                System.exit(1);
            }
        }
        String input1 = words[0]; // \\
        String action = words[1]; // -- -- запись из массива в переменные
        String input2 = words[2]; // //
        byte number1 = 0;
        byte number2 = 0;
        boolean rim1;
        boolean rim2;
        switch (input1){
            case ("I"):
                number1 = 1;
                rim1 = true;
                break;
            case ("II"):
                number1 = 2;
                rim1 = true;
                break;
            case ("III"):
                number1 = 3;
                rim1 = true;
                break;
            case ("IV"):
                number1 = 4;
                rim1 = true;
                break;
            case ("V"):
                number1 = 5;
                rim1 = true;
                break;
            case ("VI"):
                number1 = 6;
                rim1 = true;
                break;
            case ("VII"):
                number1 = 7;
                rim1 = true;
                break;
            case ("VIII"):
                number1 = 8;
                rim1 = true;
                break;
            case ("IX"):
                number1 = 9;
                rim1 = true;
                break;
            case ("X"):
                number1 = 10;
                rim1 = true;
                break;
            default:
                number1 = Byte.parseByte(input1);
                rim1 = false;
                break;
        } // ввод первого римского числа

        switch (input2){
            case ("I"):
                number2 = 1;
                rim2 = true;
                break;
            case ("II"):
                number2 = 2;
                rim2 = true;
                break;
            case ("III"):
                number2 = 3;
                rim2 = true;
                break;
            case ("IV"):
                number2 = 4;
                rim2 = true;
                break;
            case ("V"):
                number2 = 5;
                rim2 = true;
                break;
            case ("VI"):
                number2 = 6;
                rim2 = true;
                break;
            case ("VII"):
                number2 = 7;
                rim2 = true;
                break;
            case ("VIII"):
                number2 = 8;
                rim2 = true;
                break;
            case ("IX"):
                number2 = 9;
                rim2 = true;
                break;
            case ("X"):
                number2 = 10;
                rim2 = true;
                break;
            default:
                number2 = Byte.parseByte(input2);
                rim2 = false;
                break;
        } // ввод второго римского числа

        if ((number1 >= 0 && number1 <= 10) && (number2 >= 0 && number2 <= 10)) {
            if (rim1 == false && rim2 == false) {
                String result;
                switch (action) {
                    case ("+"):
                        result = String.valueOf(number1 + number2);
                        System.out.println(result);
                        return result;
                    case("-"):
                        result = String.valueOf(number1 - number2);
                        System.out.println(result);
                        return result;
                    case("*"):
                        result = String.valueOf(number1 * number2);
                        System.out.println(result);
                        return result;
                    case("/"):
                        result = String.valueOf(number1 / number2);
                        System.out.println(result);
                        return result;


                }
            }
            else if ((rim1 == true && rim2 == false) || (rim1 == false && rim2 == true)) {
                try {
                    throw new Exception();
                } catch (Exception e) {
                    System.out.println("используются одновременно разные системы счисления");
                }
            }
            else {
                String result;
                switch (action) {
                    case ("+"):
                        result = String.valueOf(number1 + number2);
                        switch (result){
                            case ("1"):
                                result = "I";
                                break;
                            case ("2"):
                                result = "II";
                                break;
                            case ("3"):
                                result = "III";
                                break;
                            case ("4"):
                                result = "IV";
                                break;
                            case ("5"):
                                result = "V";
                                break;
                            case ("6"):
                                result = "VI";
                                break;
                            case ("7"):
                                result = "VII";
                                break;
                            case ("8"):
                                result = "VIII";
                                break;
                            case ("9"):
                                result = "IX";
                                break;
                            case ("10"):
                                result = "X";
                                break;
                            case ("11"):
                                result = "XI";
                                break;
                            case ("12"):
                                result = "XII";
                                break;
                            case ("13"):
                                result = "XIII";
                                break;
                            case ("14"):
                                result = "XIV";
                                break;
                            case ("15"):
                                result = "XV";
                                break;
                            case ("16"):
                                result = "XVI";
                                break;
                            case ("17"):
                                result = "XVII";
                                break;
                            case ("18"):
                                result = "XVIII";
                                break;
                            case ("19"):
                                result = "XIX";
                                break;
                            case ("20"):
                                result = "XX";
                                break;
                        }
                        System.out.println(result);
                        return result;
                    case("-"):
                        int checkrim;
                        checkrim = number1 - number2;
                        if (checkrim < 1) {
                            try {
                                throw new Exception();
                            } catch (Exception e) {
                                System.out.println("в римской системе нет отрицательных чисел");
                            }
                            break;
                        }
                        result = String.valueOf(number1 - number2);

                        switch (result){
                            case ("1"):
                                result = "I";
                                break;
                            case ("2"):
                                result = "II";
                                break;
                            case ("3"):
                                result = "III";
                                break;
                            case ("4"):
                                result = "IV";
                                break;
                            case ("5"):
                                result = "V";
                                break;
                            case ("6"):
                                result = "VI";
                                break;
                            case ("7"):
                                result = "VII";
                                break;
                            case ("8"):
                                result = "VIII";
                                break;
                            case ("9"):
                                result = "IX";
                                break;
                        }
                        System.out.println(result);
                        return result;
                    case("*"):
                        result = String.valueOf(number1 * number2);
                        switch (result){ // без понятия как автоматизировать, а до 100 прописывать не хочется)
                            case ("1"):
                                result = "I";
                                break;
                            case ("2"):
                                result = "II";
                                break;
                            case ("3"):
                                result = "III";
                                break;
                            case ("4"):
                                result = "IV";
                                break;
                            case ("5"):
                                result = "V";
                                break;
                            case ("6"):
                                result = "VI";
                                break;
                            case ("7"):
                                result = "VII";
                                break;
                            case ("8"):
                                result = "VIII";
                                break;
                            case ("9"):
                                result = "IX";
                                break;
                            case ("10"):
                                result = "X";
                                break;
                            case ("11"):
                                result = "XI";
                                break;
                            case ("12"):
                                result = "XII";
                                break;
                            case ("13"):
                                result = "XIII";
                                break;
                            case ("14"):
                                result = "XIV";
                                break;
                            case ("15"):
                                result = "XV";
                                break;
                            case ("16"):
                                result = "XVI";
                                break;
                            case ("17"):
                                result = "XVII";
                                break;
                            case ("18"):
                                result = "XVIII";
                                break;
                            case ("19"):
                                result = "XIX";
                                break;
                            case ("20"):
                                result = "XX";
                                break;
                            case ("21"):
                                result = "XXI";
                                break;
                            case ("24"):
                                result = "XXIV";
                                break;
                            case ("27"):
                                result = "XXVII";
                                break;
                            case ("28"):
                                result = "XXVIII";
                                break;
                            case ("30"):
                                result = "XXX";
                                break;
                            case ("32"):
                                result = "XXXII";
                                break;
                        }

                        System.out.println(result);
                        return result;
                    case("/"):
                        result = String.valueOf(number1 / number2);
                        switch (result){
                            case ("1"):
                                result = "I";
                                break;
                            case ("2"):
                                result = "II";
                                break;
                            case ("3"):
                                result = "III";
                                break;
                            case ("4"):
                                result = "IV";
                                break;
                            case ("5"):
                                result = "V";
                                break;
                            case ("6"):
                                result = "VI";
                                break;
                            case ("7"):
                                result = "VII";
                                break;
                            case ("8"):
                                result = "VIII";
                                break;
                            case ("9"):
                                result = "IX";
                                break;
                            case ("10"):
                                result = "X";
                                break;
                        }
                        System.out.println(result);
                        return result;
                    default:
                        try {
                            throw new Exception();
                        } catch (Exception e) {
                            System.out.println("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
                        }
                }
            }

        } else {
            System.out.println("Числа должны быть от 1 до 10 включительно.");
        }




        return input;
    }


}