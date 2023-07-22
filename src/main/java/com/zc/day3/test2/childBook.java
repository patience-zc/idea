package com.zc.day3.test2;

/**
 * ClassName:childBook
 * Package:com.zc.day3.test2
 * Description:
 *
 * @date:2023/7/19 14:46
 * @author:zc
 */
public class childBook extends book {
    private String[] childPhase = {"幼儿", "儿童", "少年"};

    public childBook() {
    }

    public childBook(String bookid, String name, String author, String price, String[] childPhase) {
        super(bookid, name, author, price);
        this.childPhase = childPhase;
    }

    public String[] getChildPhase() {
        return childPhase;
    }

    public void setChildPhase(String[] childPhase) {
        this.childPhase = childPhase;
    }

    public void talking() {
        System.out.println("这是个有声读物");
    }

    public void talking(String name) {
        System.out.println(name + "是个有声读物");
    }

    public void talking(String name, int price) {
        System.out.println(name + "有声读物是" + price);
    }

    @Override
    public String toString() {
        return "childBook{" +
                "bookid=" + super.getBookid() +"\n"+
                "name=" + super.getName() +"\n"+
                "author=" + super.getAuthor() +"\n"+
                "price=" + super.getPrice() +"\n"+
                "childPhase=" + this.childPhase +"\n"+
                '}';
    }
}
