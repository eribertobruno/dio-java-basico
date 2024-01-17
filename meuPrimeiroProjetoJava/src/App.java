public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(nomeCompleto("Eriberto ", "Bruno"));
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(segundoNome);
    }
}
