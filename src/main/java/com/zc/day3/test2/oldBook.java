package com.zc.day3.test2;

/**
 * ClassName:oldBook
 * Package:com.zc.day3.test2
 * Description:
 *
 * @date:2023/7/19 14:57
 * @author:zc
 */
public class oldBook extends book {
    private String publicTime;

    public oldBook() {
    }

    public oldBook(String bookid, String name, String author, String price, String publicTime) {
        super(bookid, name, author, price);
        this.publicTime = publicTime;
    }

    public String getPublicTime() {
        return publicTime;
    }

    public void setPublicTime(String publicTime) {
        this.publicTime = publicTime;
    }

    public void thick() {
        System.out.println("书体很厚重");
    }

    @Override
    public String toString() {
        return "oldBook{" +
                "bookid=" + super.getBookid() + "\n" +
                "name=" + super.getName() + "\n" +
                "author=" + super.getAuthor() + "\n" +
                "price=" + super.getPrice() + "\n" +
                "publicTime=" + publicTime + "\n" +
                '}';
    }
}
