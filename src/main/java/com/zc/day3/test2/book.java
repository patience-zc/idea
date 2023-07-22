package com.zc.day3.test2;

/**
 * ClassName:book
 * Package:com.zc.day3.test2
 * Description:
 *
 * @date:2023/7/19 14:43
 * @author:zc
 */
public class book {
    private String bookid;
    private String name;
    private String author;
    private String price;

    public book() {
    }

    public book(String bookid, String name, String author, String price) {
        this.bookid = bookid;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "book{" +
                "bookid='" + bookid + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
