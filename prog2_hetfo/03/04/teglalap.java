public class teglalap {
    private int magassag;
    private int hossz;


    public teglalap(int magassag, int hossz) {
        this.magassag = magassag;
        this.hossz = hossz;

    }

    @Override
    public String toString() {
        return String.format("Teglalap magassaga: %d, hossza: %d", this.magassag, this.hossz);
    }

    public int terulet() {
        return this.magassag * this.hossz;
    }

    public int kerulet() {
        return (this.magassag + this.hossz) * 2;
    }

    public int melyik_terulete_nagyobb(teglalap t2) {
        if (t2.terulet() > this.terulet()) {
            return 1;
        } else if (t2.terulet() == this.terulet()){
            return 0;
        } else {
            return -1;
        }
    }
    
}

