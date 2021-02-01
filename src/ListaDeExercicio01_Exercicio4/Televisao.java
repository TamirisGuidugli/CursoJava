package ListaDeExercicio01_Exercicio4;

public class Televisao {

    private int volume;
    private int canal;

    public int aumentarVolume() {
        this.volume = this.volume + 1;
        return this.volume;
    }

    public int diminuirVolume() {
        if ( this.volume <= 0 ) {
            this.volume = 0;
            return this.volume;
        }

        this.volume = this.volume - 1;
        return this.volume;
    }

    public int aumentarCanal() {
        this.canal = this.canal + 1;
        return this.canal;
    }

    public int diminuirCanal() {
        this.canal = this.canal - 1;
        return this.canal;
    }

    public int mudarCanal(int canalEscolhido) {
        this.canal = canalEscolhido;
        return this.canal;
    }

    public int getVolume() {
        return this.volume;
    }

    public int getCanal() {
        return this.canal;
    }

}
