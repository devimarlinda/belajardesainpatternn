package dip;

class Lampu {
    public void nyalakan() {
        System.out.println("Lampu menyala");
    }
}

class KipasAngin {
    public void nyalakan() {
        System.out.println("Kipas Angin menyala");
    }
}

class Tombol {
    private Lampu lampu;
    private KipasAngin kipas;

    // Konstruktor untuk menginisialisasi objek Lampu
    public Tombol(Lampu lampu) {
        this.lampu = lampu;
    }

    // Konstruktor untuk menginisialisasi objek KipasAngin
    public Tombol(KipasAngin kipas) {
        this.kipas = kipas;
    }

    public void tekanLampu() {
        if (lampu != null) {
            lampu.nyalakan();
        }
    }

    public void tekanKipas() {
        if (kipas != null) {
            kipas.nyalakan();
        }
    }
}

// Penggunaan
class Main {
    public static void main(String[] args) {
        Lampu lampu = new Lampu();
        Tombol tombolLampu = new Tombol(lampu);
        tombolLampu.tekanLampu();

        KipasAngin kipas = new KipasAngin();
        Tombol tombolKipas = new Tombol(kipas);
        tombolKipas.tekanKipas();
    }
}
