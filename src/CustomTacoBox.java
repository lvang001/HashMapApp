public class CustomTacoBox {

    private int tacos;

    public CustomTacoBox(int tacos) {
        this.tacos = tacos;
    }

    public int tacosRemaining() {
        return this.tacos;
    }

    public void eat() {
        this.tacos -= 1;
        if (this.tacos < 0) {
            this.tacos = 0;
        }
    }
}
