/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.demo2105;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Buu
 */
public class Tester {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, ParseException {
        /*DanhMuc dt = new DanhMuc("DONG TU");
        DanhMuc tt = new DanhMuc("TINH TU");
        DanhMuc th = new DanhMuc("TONG HOP");
        
        Question q1 = new MultipleChoice("(1)", Level.getEasy(), dt);
        Choices c1 = new Choices("is", false, null);
        Choices c2 = new Choices("am", true, "I + am");
        Choices c3 = new Choices("are", false, null);
        Choices c4 = new Choices("were", false, null);
        
        q1.themPhuongAn(c1);
        q1.themPhuongAn(c2);
        q1.themPhuongAn(c3);
        q1.themPhuongAn(c4);
        
        Question q2 = new MultipleChoice("(2)", Level.getEasy(), tt);
        Choices c5 = new Choices("black", true, "To be + adj + noun and best fit");
        Choices c6 = new Choices("crazy", false, null);
        Choices c7 = new Choices("fish", false, null);
        Choices c8 = new Choices("foggy", false, null);
        
        q2.themPhuongAn(c5);
        q2.themPhuongAn(c6);
        q2.themPhuongAn(c7);
        q2.themPhuongAn(c8);
        
        Scanner scanner = new Scanner(System.in);
        QuanLyCauHoi ds = new QuanLyCauHoi();
        ds.themCauHoi(q1);
        ds.themCauHoi(q2);
        ds.luyenTapMultiple(scanner);
        
        Question q3 = new InComplete("I .(1). a student. I have .(2). eyes", Level.getEasy(), th);
        q3.themCauHoi(q1);
        q3.themCauHoi(q2);
        ds.themCauHoi(q3);
        ds.luyenTapInComplete(scanner);
        
        Question q4 = new Conversation("Dear Helen,\n"
                + "I would like to congratulate you on organising such an excellent and informative workshop."
                + "I know a lot of people learnt a great deal from it.  Can you pass on my "
                + "thanks to Doctor Friedman for his fascinating talk on Staff Motivation?"
                + "I realise how lucky we were that he was able to find the time for us."
                + "The feedback from the staff was very positive.  Let’s hope we actually"
                + "see an improvement in staff motivation as a result!\n"
                + "By the way, I’m missing my list of addresses of the delegates who attended."
                + "Did I happen to leave it in your office?  It’s just that I haven’t seen it since our meeting on Friday.\n"
                + "Thanks again for a great day,\n"
                + "Anne", Level.getEasy(), th);
        Question q5 = new MultipleChoice("What is the main objective of the message?", Level.getEasy(), th);
        Choices c51 = new Choices("to inform", false, null);
        Choices c52 = new Choices("to accuse", false, null);
        Choices c53 = new Choices("to make a request", false, null);
        Choices c54 = new Choices("to praise", true, null);
        q5.themPhuongAn(c51);
        q5.themPhuongAn(c52);
        q5.themPhuongAn(c53);
        q5.themPhuongAn(c54);
        
        Question q6 = new MultipleChoice("What can be implied about the workshop?", Level.getEasy(), th);
        Choices c61 = new Choices("All the delegates were staff from the same office.", false, null);
        Choices c62 = new Choices("It included several talks.", false, null);
        Choices c63 = new Choices("It lasted one day.", true, null);
        Choices c64 = new Choices("Motivation was the only topic discussed.", false, null);
        q6.themPhuongAn(c61);
        q6.themPhuongAn(c62);
        q6.themPhuongAn(c63);
        q6.themPhuongAn(c64);
        
        Question q7 = new MultipleChoice("What can be implied about Dr Friedman?", Level.getEasy(), th);
        Choices c71 = new Choices("He works in the same office as Anne.", false, null);
        Choices c72 = new Choices("He has a very busy schedule.", true, null);
        Choices c73 = new Choices("He is a leading expert on staff motivation.", false, null);
        Choices c74 = new Choices("Anne knows him better than Helen does.", false, null);
        q7.themPhuongAn(c71);
        q7.themPhuongAn(c72);
        q7.themPhuongAn(c73);
        q7.themPhuongAn(c74);
        
        Question q8 = new MultipleChoice("What has happened to the address list?", Level.getEasy(), th);
        Choices c81 = new Choices("Anne has lost it.", true, null);
        Choices c82 = new Choices("Anne has found it.", false, null);
        Choices c83 = new Choices("Anne has sent it to Helen.", false, null);
        Choices c84 = new Choices("Anne has completed it.", false, null);
        q8.themPhuongAn(c81);
        q8.themPhuongAn(c82);
        q8.themPhuongAn(c83);
        q8.themPhuongAn(c84);
        
        q4.themCauHoi(q5);
        q4.themCauHoi(q6);
        q4.themCauHoi(q7);
        q4.themCauHoi(q8);
        
        System.out.println(q4);
        
       // List<Question> kq = ds.timTheoMucDo("hard");
        //for(Question q : kq){
        //    System.out.println(q);
       // }
        /*System.out.println("Driver loading...");
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded");
        
        System.out.println("Connecting...");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/nhap1", "root", "123456789");
        System.out.println("Connected");
        
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery("SELECT * FROM question;");
        while(rs.next()){
            int id = rs.getInt("questionID");
            String content = rs.getString("content");
            System.out.printf("%d - %s\n", id, content);
        }
        
        stm.close();
        conn.close();*/
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Log in");
        System.out.println("2. Register");
        System.out.print("\nYour choice: ");
        String c = scanner.nextLine();
        switch(c){
            case "1":
                User u1 = new User();
               
                break;
            case "2":
                User u = User.register(scanner);
                break;
            default:
                break;
        }
    }
}
