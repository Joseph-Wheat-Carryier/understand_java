package com.banyuan.club;

public class Book {
    String name;
    private int pageNum;

    Book() {
        pageNum = 200;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageNum() {
        if (this.pageNum >= 200) {
            return this.pageNum;
        }else{
            System.out.println("页数不得小于200");
        }
        return this.pageNum;
    }

    public void detail() {
        System.out.print(this.toString());
    }


    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", pageNum=" + pageNum +
                '}';
    }
}
