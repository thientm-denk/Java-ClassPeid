/*

 */
package runtime;

import data.Author;
import data.Book;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
  tạo chương trình quản lý thư viện
gồm 2 class sau
Author
    name nickname old birthday;
    tạo phểu hàm không đối số
    tạo phểu có đối số 
    tạo phểu có đối số là nickname
    tạo getter không tạo setter
    tạo hàm nhập thông tin tác giả
    nhưng nếu tác giả đã tồn tại trong danh sách thì k cho
    ép nhập lại
    tạo hàm showInfor
Book
    bookName createAt nickName
    tạo có đối số và k có đồi số
    tạo getter anh setter
    tạo hàm input//nếu mà sách này có tác giả mà 
    có tên trong danh sách tác giả thì bỏ qua
    nếu tác giả của cuốn sách mà chưa có tồn tại trong ds
    thì thêm mới
program:
    menu
    1.Nhập thông tin sách in ra màn hình
    2.Hiển thị thông tin sách ra màn hình
    3.Nhập thông tin tác giả
    4.Tìm kiếm sách theo bút danh
    5.Thoát
 */
public class Program {
    public static void main(String[] args) {
        ArrayList<Author> authorList = new ArrayList<>();
        ArrayList<Book> bookList = new ArrayList<>();
        
        int choose;
        
        Scanner scanner = new Scanner(System.in);
        
        do {
            showMenu();
            System.out.println("Vui lòng nhạp lựa chọn");
            //choose =scanner.nextInt();
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1: {
                    Book book = new Book();
                    book.input();
                    boolean isFind = false;
                    for (Author aut : authorList) {
                        if(aut.getNickname().equalsIgnoreCase(book.getNickname())) {
                            isFind = true;
                            break;
                        }
                        
                    }
                    if (!isFind){
                        Author aut = new Author(book.getNickname());
                        aut.input();
                        authorList.add(aut);
                    }
                    break;
                }
                case 2: {
                    for (Book book : bookList) {
                        book.showInfor(); 
                    }
                    
                    break;
                }
                case 3: {
                    System.out.println("Nhập tác giả");
                    Author newAut = new Author();
                    newAut.input();
                    authorList.add(newAut);
                    break;
                }
                case 4: {
                    String key;
                    System.out.println("Nhập bút danh của tác giả bạn muốn tìm sách: ");
                    key = scanner.nextLine();
                    int count = 0;
                    for (Book o : bookList) {
                        if(o.getNickname().equalsIgnoreCase(key)){
                            count++;
                            o.showInfor();
                        }
                    }
                    if (count == 0) {
                        System.out.println("Không có cuốn sách nào");
                    }
                    break;
                }
                case 5: {
                    
                    break;
                }
                default: {
                    System.out.println("Vui long nhap tu 1 den 5");
                    break;
                }
            }
        } while (choose != 5);
    }
    public static void showMenu() {
        System.out.println("Show menu: ");
        System.out.println("1.Nhập thông tin sách in ra màn hình");
        System.out.println("2.Hiển thị thông tin sách ra màn hình");
        System.out.println("3.Nhập thông tin tác giả");
        System.out.println("4.Tìm kiếm sách theo bút danh");
        System.out.println("5.Thoát");
    }
    
}
