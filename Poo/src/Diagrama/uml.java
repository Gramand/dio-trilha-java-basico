package Diagrama;

class ReprodutorMusical {
        -Musicas[] musicas

        + tocar() void
        + pausar() void
        + shuffle() void
        + baixarMusica() void
        + repetirMusica() boolean
        + musicaBaixada()boolean
        + selecionarMusica(String nomeMusica) void
        - conectadoNaInternet() boolean
}

class AparelhoTelefonico {
        -Contatos[] contatos

        - existeSinal() boolean
        + fazerChamada(String numeroTelefonico) void
        + atender() void
        + recusar() void
        + contatoBloqueado() boolean
        + iniciarCorreioVoz() void
}

class NavegadorInternet {
        - conectadoNaInternet() boolean
        + exibirPagina(String urlDoSite)void
        + abrirNovaAba() void
        + fecharAba() void
        + atualizarAPagina() boolean

}

class iPhone {
}

iPhone <-- ReprodutorMusical
iPhone <-- AparelhoTelefonico
iPhone <-- NavegadorInternet