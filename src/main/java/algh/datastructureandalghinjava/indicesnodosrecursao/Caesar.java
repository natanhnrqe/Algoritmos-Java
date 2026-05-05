package algh.datastructureandalghinjava.indicesnodosrecursao;

public class Caesar {

    public static final int ALPHASIZE = 26; // Alfabeto em ingles (somente letras maisculas)
    public static final char[] alpha = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
            'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    protected char[] encrypt = new char[ALPHASIZE]; // Arranjo de criptografar
    protected char[] decrypt = new char[ALPHASIZE]; // Arranjo de criptografar

    /** Construtor que inicialializa os arranjos de criptografar e criptografar */
    public Caesar() {
        for (int i = 0; i < ALPHASIZE; i++)
            encrypt[i] = alpha[(i + 3)% ALPHASIZE]; // gira o alfabeto 3 posicoes
        for (int i = 0; i < ALPHASIZE; i++)
            decrypt[encrypt[i] - 'A'] = alpha[i]; // descriptografar eh o contrario da criptografia
    }

    /** Metodo de criptografia */
    public String encrypt(String secret){
        char[] mess = secret.toCharArray();         // o arranjo com a mensagem
        for (int i = 0; i < mess.length; i++)       // laco de criptografia
            if (Character.isUpperCase(mess[i]))     // tem-se uma letra para trocar
                mess[i] = encrypt[mess[i] - 'A'];   // usa a letra como indice
        return new String(mess);
    }

    /** Metodo de descriptografia */
    public String decrypt(String secret){
        char[] mess = secret.toCharArray();         // o arranjo com a mensagem
        for (int i = 0; i < mess.length; i++)       // laco de descriptografia
            if (Character.isUpperCase(mess[i]))     // tem-se uma letra para trocar
                mess[i] = decrypt[mess[i] - 'A'];   // usa a letra como indice
        return new String(mess);
    }

    public static void main(String[] args) {
        Caesar cipher = new Caesar();
        System.out.println("Ordem de criptografia: " + new String(cipher.encrypt));
        System.out.println("Ordem de descriptografia: " + new String(cipher.decrypt));

        String secret = "NAO PODEM DESCOBRIR QUE EU JOGO LOL";
        secret = cipher.encrypt(secret);
        System.out.println(secret);
        secret = cipher.decrypt(secret);
        System.out.println(secret);

    }
}
