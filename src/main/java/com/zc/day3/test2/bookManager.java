package com.zc.day3.test2;

import java.util.Scanner;

/**
 * ClassName:bookManager
 * Package:com.zc.day3.test2
 * Description:
 *
 * @date:2023/7/19 15:02
 * @author:zc
 */
public class bookManager {
    book[] books = new book[10];

    public boolean addBook(book b) {
        int i;
        if (books[9] != null)
            return false;
        Scanner sc = new Scanner(System.in);
        for (i = 0; i < 10; i++) {
            if (books[i] == null) {
                System.out.printf("请输入书籍号");
                books[i].setBookid(sc.next());
                System.out.printf("请输入书名");
                books[i].setName(sc.next());
                System.out.printf("请输入作者");
                books[i].setAuthor(sc.next());
                System.out.printf("请输入价格");
                books[i].setPrice(sc.next());
            }
        }
        return true;
    }

    public void showAll() {
        int i;
        for (i = 0; i < 10 && books[i] != null; i++) {
            System.out.printf(books[i].toString());
        }
    }

    public void sortPrice() {
        int i, j;
        book temp;
        for (i = 0; books[i] != null; i++) {
            temp=books[i];
            for (j = i+1; books[j] != null; j++) {
                if (Integer.valueOf(temp.getPrice())<Integer.valueOf(books[j].getPrice())){
                    temp = books[j];
                }
            }
            books[j] = books[i];
            books[i] =temp;
        }
        showAll();
    }
}
