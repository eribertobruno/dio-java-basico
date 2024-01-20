public class Principal {
    public static void main(String[] args) {
        IPhone iphone = new IPhone();
        ReprodutorMusical ipod = iphone;
        iphone.atender();
        ipod.tocar();
    }
}
