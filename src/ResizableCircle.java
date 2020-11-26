public class ResizableCircle extends Circle implements Rezizable {
    public ResizableCircle(double radios){
        super(radios);
    }

    public void resize(int percent){
        this.radius *= percent / 100.0;
    }

    @Override
    public String toString() {
        return ResizableCircle{"+ super.toString()" + ""}
    }


}
