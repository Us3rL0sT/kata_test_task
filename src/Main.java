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
        byte number1;
        byte number2;
        boolean rim1;
        boolean rim2;
        switch (input1) {
            case ("I") -> {
                number1 = 1;
                rim1 = true;
            }
            case ("II") -> {
                number1 = 2;
                rim1 = true;
            }
            case ("III") -> {
                number1 = 3;
                rim1 = true;
            }
            case ("IV") -> {
                number1 = 4;
                rim1 = true;
            }
            case ("V") -> {
                number1 = 5;
                rim1 = true;
            }
            case ("VI") -> {
                number1 = 6;
                rim1 = true;
            }
            case ("VII") -> {
                number1 = 7;
                rim1 = true;
            }
            case ("VIII") -> {
                number1 = 8;
                rim1 = true;
            }
            case ("IX") -> {
                number1 = 9;
                rim1 = true;
            }
            case ("X") -> {
                number1 = 10;
                rim1 = true;
            }
            default -> {
                number1 = Byte.parseByte(input1);
                rim1 = false;
            }
        } // ввод первого римского числа

        switch (input2) {
            case ("I") -> {
                number2 = 1;
                rim2 = true;
            }
            case ("II") -> {
                number2 = 2;
                rim2 = true;
            }
            case ("III") -> {
                number2 = 3;
                rim2 = true;
            }
            case ("IV") -> {
                number2 = 4;
                rim2 = true;
            }
            case ("V") -> {
                number2 = 5;
                rim2 = true;
            }
            case ("VI") -> {
                number2 = 6;
                rim2 = true;
            }
            case ("VII") -> {
                number2 = 7;
                rim2 = true;
            }
            case ("VIII") -> {
                number2 = 8;
                rim2 = true;
            }
            case ("IX") -> {
                number2 = 9;
                rim2 = true;
            }
            case ("X") -> {
                number2 = 10;
                rim2 = true;
            }
            default -> {
                number2 = Byte.parseByte(input2);
                rim2 = false;
            }
        } // ввод второго римского числа

        if ((number1 >= 0 && number1 <= 10) && (number2 >= 0 && number2 <= 10)) {
            if (!rim1 && !rim2) {
                String result;
                switch (action) {
                    case ("+") -> {
                        result = String.valueOf(number1 + number2);
                        System.out.println(result);
                        return result;
                    }
                    case ("-") -> {
                        result = String.valueOf(number1 - number2);
                        System.out.println(result);
                        return result;
                    }
                    case ("*") -> {
                        result = String.valueOf(number1 * number2);
                        System.out.println(result);
                        return result;
                    }
                    case ("/") -> {
                        result = String.valueOf(number1 / number2);
                        System.out.println(result);
                        return result;
                    }
                }
            }
            else if ((rim1 && !rim2) || (!rim1 && rim2)) {
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
                        result = switch (result) {
                            case ("1") -> "I";
                            case ("2") -> "II";
                            case ("3") -> "III";
                            case ("4") -> "IV";
                            case ("5") -> "V";
                            case ("6") -> "VI";
                            case ("7") -> "VII";
                            case ("8") -> "VIII";
                            case ("9") -> "IX";
                            case ("10") -> "X";
                            case ("11") -> "XI";
                            case ("12") -> "XII";
                            case ("13") -> "XIII";
                            case ("14") -> "XIV";
                            case ("15") -> "XV";
                            case ("16") -> "XVI";
                            case ("17") -> "XVII";
                            case ("18") -> "XVIII";
                            case ("19") -> "XIX";
                            case ("20") -> "XX";
                            default -> result;
                        };
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

                        result = switch (result) {
                            case ("1") -> "I";
                            case ("2") -> "II";
                            case ("3") -> "III";
                            case ("4") -> "IV";
                            case ("5") -> "V";
                            case ("6") -> "VI";
                            case ("7") -> "VII";
                            case ("8") -> "VIII";
                            case ("9") -> "IX";
                            default -> result;
                        };
                        System.out.println(result);
                        return result;
                    case("*"):
                        result = String.valueOf(number1 * number2);
                        result = switch (result) { // без понятия как автоматизировать, а до 100 прописывать не хочется)
                            case ("1") -> "I";
                            case ("2") -> "II";
                            case ("3") -> "III";
                            case ("4") -> "IV";
                            case ("5") -> "V";
                            case ("6") -> "VI";
                            case ("7") -> "VII";
                            case ("8") -> "VIII";
                            case ("9") -> "IX";
                            case ("10") -> "X";
                            case ("11") -> "XI";
                            case ("12") -> "XII";
                            case ("13") -> "XIII";
                            case ("14") -> "XIV";
                            case ("15") -> "XV";
                            case ("16") -> "XVI";
                            case ("17") -> "XVII";
                            case ("18") -> "XVIII";
                            case ("19") -> "XIX";
                            case ("20") -> "XX";
                            case ("21") -> "XXI";
                            case ("24") -> "XXIV";
                            case ("27") -> "XXVII";
                            case ("28") -> "XXVIII";
                            case ("30") -> "XXX";
                            case ("32") -> "XXXII";
                            default -> result;
                        };

                        System.out.println(result);
                        return result;
                    case("/"):
                        result = String.valueOf(number1 / number2);
                        result = switch (result) {
                            case ("1") -> "I";
                            case ("2") -> "II";
                            case ("3") -> "III";
                            case ("4") -> "IV";
                            case ("5") -> "V";
                            case ("6") -> "VI";
                            case ("7") -> "VII";
                            case ("8") -> "VIII";
                            case ("9") -> "IX";
                            case ("10") -> "X";
                            default -> result;
                        };
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