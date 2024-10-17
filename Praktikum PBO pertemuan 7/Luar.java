public class Luar {
    String namaLuar = "Variabel luar";

    public class Dalam {
        String namaDalam = "Variabel dalam";

        public void tampilkanInfo() {
            System.out.println(namaLuar);  
            System.out.println(namaDalam); 
        }
    }
    
    public static void main(String[] args) {
        Luar luar = new Luar();
        Luar.Dalam dalam = luar.new Dalam();
        dalam.tampilkanInfo();
    }
}
