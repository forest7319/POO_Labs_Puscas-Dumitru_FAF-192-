public class H extends G
{
    protected String h;
    protected X x = new X("X in H");

    H(A a, B b, C c, D d, E e, F f, G g, String h) {
        super(a, b, c, d, e, f, g);
        this.h = h;
    }

    H(A a, B b, C c, D d, E e, F f, G g, H h){
        super(a, b, c, d, e, f,g);
        this.h = h.h;
    }

    public void getValue() {
        super.getValue();
        System.out.print(this.h + " ");
    }
}
