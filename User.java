/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.demo2105;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Buu
 */
public class User {
    private String username;
    private String password;
    private String hoTen;
    private String queQuan;
    private String gioiTinh;
    private Date ngaySinh;
    private Date ngayGiaNhap;
    
    public User(){}
    
    public User(String un, String pass, String ht, String qq, String gt, Date ns, Date ngn){
        this.username = un;
        this.password = pass;
        this.hoTen = ht;
        this.queQuan = qq;
        this.gioiTinh = gt;
        this.ngaySinh = ns;
        this.ngayGiaNhap = ngn;
    }
    
    public static User register(Scanner scanner) throws ParseException{
        System.out.print("Full name: ");
        String ht = scanner.nextLine();
        System.out.print("Username: "); //Tai len tu csdl xem co trung hay khong?
        String us = scanner.nextLine();
        System.out.print("Password: ");
        String ps = scanner.nextLine();
        System.out.print("Gender: ");
        String gt = scanner.nextLine();
        System.out.println("Date of birth(dd/mm/yyyy): ");
        String ns = scanner.nextLine();
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Country: ");
        String qq = scanner.nextLine();
        System.out.println();
        return new User(us, ps, ht, qq, gt, f.parse(ns), new Date());
    }
    
    public static void logIn(Scanner scanner){
        System.out.print("Username: ");
        String u = scanner.nextLine();
        System.out.print("Password: ");
        String p = scanner.nextLine();
    }

    @Override
    public String toString() {
        return String.format("Full name: %s\nUsername: %s\nPassword: %s\n"
                + "Gender: %s\nDate of birth: %s\nCountry: %s\nDate of start: %s\n",
                this.hoTen, this.username, this.password, this.gioiTinh, this.ngaySinh, this.queQuan, this.ngayGiaNhap);
    }
    
    

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the hoTen
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * @param hoTen the hoTen to set
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    /**
     * @return the queQuan
     */
    public String getQueQuan() {
        return queQuan;
    }

    /**
     * @param queQuan the queQuan to set
     */
    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    /**
     * @return the gioiTinh
     */
    public String getGioiTinh() {
        return gioiTinh;
    }

    /**
     * @param gioiTinh the gioiTinh to set
     */
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    /**
     * @return the ngaySinh
     */
    public Date getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
     */
    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    /**
     * @return the ngayGiaNhap
     */
    public Date getNgayGiaNhap() {
        return ngayGiaNhap;
    }

    /**
     * @param ngayGiaNhap the ngayGiaNhap to set
     */
    public void setNgayGiaNhap(Date ngayGiaNhap) {
        this.ngayGiaNhap = ngayGiaNhap;
    }
    
    
}
