package app;

public class Box<T extends Human> {

    private T t;

    public Box(T t) {
        this.t = t;
    }

    public T getObject() {
        return this.t;
    }

    @Override
    public String toString() {
        return "Box{" +
                "t=" + t +
                '}';
    }
}
