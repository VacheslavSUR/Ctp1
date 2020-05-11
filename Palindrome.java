public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length;i++){
            String k = args[i];
            if (lePalendrome(k))
            {
                System.out.println(k+"");}  //вывод результата
        }
    }
    public static String reverseString(String k){
        String S1 = "";       //создание пустой строки
        for (int i = k.length()-1;i>=0;i--) { //проверка начальной строки
            S1 += k.charAt(i);
        }
        return S1;
    }
    public static Boolean isPalendrome(String tape){ //возврат true или false
        return S1.equals(reverseString(tape));     //в случае полного совпадения
    }
}
