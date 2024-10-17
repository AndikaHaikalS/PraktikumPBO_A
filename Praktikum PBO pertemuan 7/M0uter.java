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

    public static void main(String[] args) throws Exception {
        
        M0uter that = new M0uter();
        that.go((int) (Math.random() * 100), (int) (Math.random() * 100));
    }
}
