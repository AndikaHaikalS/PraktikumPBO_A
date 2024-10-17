public class Main {
    
    public class Luar {
        String namaLuar = "Variabel luar";

        public class Dalam {
            String namaDalam = "Variabel dalam";

            public void tampilkanInfo() {
                System.out.println(namaLuar);  
                System.out.println(namaDalam); 
            }
        }
    }

    
    public class M0uter {
        private int m = (int) (Math.random() * 100);

        public void go(final int x, final int y) {
            final int a = x + y;
            final int b = x - y;

            class MInner {
                public void method() {
                    System.out.println("m = " + m);
                    System.out.println("x = " + x);
                    System.out.println("y = " + y);
                    System.out.println("a = " + a);
                    System.out.println("b = " + b);
                }
            }

            MInner that = new MInner(); 
            that.method(); 
        }
    }

    
    public static void main(String[] args) {
        
        Main mainProgram = new Main();
        Luar luar = mainProgram.new Luar();
        Luar.Dalam dalam = luar.new Dalam();
        System.out.println("Informasi dari kelas Luar dan Dalam:");
        dalam.tampilkanInfo();

       
        System.out.println("\nInformasi dari kelas M0uter:");
        M0uter m0uter = mainProgram.new M0uter();
        m0uter.go((int) (Math.random() * 100), (int) (Math.random() * 100));
    }
}
