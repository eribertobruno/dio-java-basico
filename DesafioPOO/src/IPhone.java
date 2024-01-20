public class IPhone implements AparelhoTelefonico, Navegador, ReprodutorMusical {

    @Override
    public void tocar() {
        System.out.println("Tocando Musica");
    }

    @Override
    public void pausar() {
        System.out.println("Musica Pausada");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Musica Selecionada");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Pagina");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("pagina atualizada");
    }

    @Override
    public void ligar() {
        System.out.println("ligando");
    }

    @Override
    public void atender() {
        System.out.println("atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz");
    }
}