import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static HashMap<Character, String> encyrptmap = new HashMap<>();
    public static HashMap<String, Character> decryptMap = new HashMap<>();

    public static void main(String[] args) {
        encyrptmap.put('a', "˙");
        encyrptmap.put('b', "˟");
        encyrptmap.put('c', "˩");
        encyrptmap.put('ç', "˦");
        encyrptmap.put('d', "˫");
        encyrptmap.put('e', "˰");
        encyrptmap.put('f', "˯");
        encyrptmap.put('g', "˒");
        encyrptmap.put('ğ', "˔");
        encyrptmap.put('h', "˕");
        encyrptmap.put('ı', "˘");
        encyrptmap.put('i', "ˇ");
        encyrptmap.put('j', "ˑ");
        encyrptmap.put('k', "˙");
        encyrptmap.put('l', "ˢ");
        encyrptmap.put('m', "ˤ");
        encyrptmap.put('n', "˻");
        encyrptmap.put('o', "˽");
        encyrptmap.put('ö', "˲");
        encyrptmap.put('p', "˵");
        encyrptmap.put('r', "˼");
        encyrptmap.put('s', "˯");
        encyrptmap.put('ş', "ˬ");
        encyrptmap.put('t', "˩");
        encyrptmap.put('u', "˱");
        encyrptmap.put('ü', "˷");
        encyrptmap.put('v', "˪");
        encyrptmap.put('y', "˫");
        encyrptmap.put('z', "˭");

        encyrptmap.put('A', "˿");
        encyrptmap.put('B', "˸");
        encyrptmap.put('C', "˴");
        encyrptmap.put('Ç', "˶");
        encyrptmap.put('D', "˹");
        encyrptmap.put('E', "˺");
        encyrptmap.put('F', "˻");
        encyrptmap.put('G', "˼");
        encyrptmap.put('Ğ', "˾");
        encyrptmap.put('H', "˿");
        encyrptmap.put('I', "̀");
        encyrptmap.put('İ', "́");
        encyrptmap.put('J', "̂");
        encyrptmap.put('K', "̃");
        encyrptmap.put('L', "̄");
        encyrptmap.put('M', "̅");
        encyrptmap.put('N', "̇");
        encyrptmap.put('O', "̈");
        encyrptmap.put('Ö', "̉");
        encyrptmap.put('P', "̊");
        encyrptmap.put('R', "̋");
        encyrptmap.put('S', "̌");
        encyrptmap.put('Ş', "̍");
        encyrptmap.put('T', "̎");
        encyrptmap.put('U', "̏");
        encyrptmap.put('Ü', "̐");
        encyrptmap.put('V', "̑");
        encyrptmap.put('Y', "̒");
        encyrptmap.put('Z', "̓");

        encyrptmap.put('0', "̔");
        encyrptmap.put('1', "̕");
        encyrptmap.put('2', "̖");
        encyrptmap.put('3', "̗");
        encyrptmap.put('4', "̘");
        encyrptmap.put('5', "̙");
        encyrptmap.put('6', "̚");
        encyrptmap.put('7', "̛");
        encyrptmap.put('8', "̜");
        encyrptmap.put('9', "̝");

        encyrptmap.put('.', "̞");
        encyrptmap.put(',', "̟");
        encyrptmap.put('\'', "̠");
        encyrptmap.put('\"', "̡");
        encyrptmap.put(';', "̢");
        encyrptmap.put(':', "̣");
        encyrptmap.put('!', "̤");
        encyrptmap.put('?', "̥");
        encyrptmap.put('-', "̦");
        encyrptmap.put('_', "̧");
        encyrptmap.put('/', "̨");
        encyrptmap.put('\\', "̩");
        encyrptmap.put('(', "̪");
        encyrptmap.put(')', "̫");
        encyrptmap.put('[', "̬");
        encyrptmap.put(']', "̭");
        encyrptmap.put('{', "̮");
        encyrptmap.put('}', "̯");


        for (HashMap.Entry<Character, String> entry : encyrptmap.entrySet()) {
            decryptMap.put(entry.getValue(), entry.getKey());
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("İşlem seç knk: Decrypt için '1', Encrypt için '2': ");
        String choice = scanner.nextLine();

        if (choice.equals("1")) {
            System.out.println("Şifrelenmiş stringi yaz knk:");
            String encryptedInput = scanner.nextLine();
            System.out.println("Decrypted string: " + DecryptString(encryptedInput));
        } else if (choice.equals("2")) {
            System.out.println("Şifrelenecek stringi yaz knk:");
            String plainInput = scanner.nextLine();
            System.out.println("Encrypted string: " + EncryptString(plainInput));
        } else {
            System.out.println("Hatalı giriş. Lütfen sadece '1' veya '2' giriniz.");
        }

        scanner.close();
    }

    public static String EncryptString(String string) {
        StringBuilder ec = new StringBuilder();
        for (char c : string.toCharArray()) {
            if (encyrptmap.containsKey(c)) {
                ec.append(encyrptmap.get(c));
            } else {
                ec.append(c);
            }
        }
        return ec.toString();
    }

    public static String DecryptString(String string) {
        StringBuilder dc = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            String currentChar = String.valueOf(string.charAt(i));
            if (decryptMap.containsKey(currentChar)) {
                dc.append(decryptMap.get(currentChar));
            } else {
                dc.append(currentChar);
            }
        }
        return dc.toString();
    }
}
