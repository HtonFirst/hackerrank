package hackerrank;

public class AbstractExample {

    public static void main(String[] args) {

        MyBook newNovel = new MyBook();
        newNovel.setTitle("Three Fats Mans");

        System.out.println(newNovel.getTitle());

    }
}

abstract class Book {
    String title;
    abstract void setTitle(String s);

    String getTitle() {
        return title;
    }


}

class MyBook extends Book {
    String title;
    void setTitle(String s) {
        this.title = s;
    }

    String getTitle() {
        return this.title;
    }


}
