
package data;

import java.util.Scanner;

/**
 Book
    bookName createAt nickName
    tạo có đối số và k có đồi số
    tạo getter anh setter
    tạo hàm input//nếu mà sách này có tác giả mà 
    có tên trong danh sách tác giả thì bỏ qua
    nếu tác giả của cuốn sách mà chưa có tồn tại trong ds
    thì thêm mới
 */
public class Book {
    private String bookName;
    private String createAt;
    private String nickname;

    public Book() {
    }

    public Book(String bookName, String createAt, String nickname) {
        this.bookName = bookName;
        this.createAt = createAt;
        this.nickname = nickname;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sách: ");
        this.bookName = sc.nextLine();
        
        System.out.println("Nhập ngày sản xuất: ");
        this.createAt = sc.nextLine();
        
        System.out.println("Nhập nickname của tác giả: ");
        this.nickname = sc.nextLine();
    }
    public void showInfor(){
        System.out.printf("|%20s|%-20s|%20s\n", 
                bookName, nickname, createAt);
    }
    
    
    
    
    
    
}
