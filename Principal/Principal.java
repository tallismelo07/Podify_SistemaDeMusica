package projeto03.Principal;

import projeto03.modelo.Musica;
import projeto03.modelo.Podcast;
import projeto03.modelo.Preferidas;

public class Principal {
    public static void main(String[] args) {
        Musica musica01 = new Musica();

        musica01.setTitulo("Happy Nation");
        musica01.setArtista("Ace of Base");

        for (int i = 0; i < 1000; i++) {
            musica01.reproducao();
        }

        for (int i = 0; i < 50; i++) {
            musica01.curtidas();
        }

        Podcast podcast01 = new Podcast();

        podcast01.setTitulo("Felca - PodPah");
        podcast01.setHost("Igor e Mitico");

        for (int i = 0; i < 5000; i++) {
            podcast01.reproducao();
        }

        for (int i = 0; i < 1000; i++) {
            podcast01.curtidas();
        }

        Preferidas preferidas = new Preferidas();
        preferidas.inclui(podcast01);
        preferidas.inclui(musica01);
    }
}
