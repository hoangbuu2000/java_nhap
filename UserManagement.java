/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.demo2105;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Buu
 */
public class UserManagement {
    private List<User> ds = new ArrayList<>();
    
    public void addUser(User u){
        this.getDs().add(u);
    }
    
    public void removeUser(User u){
        this.ds.remove(u);
    }
    
    public void updateUser(User u, Scanner scanner) throws ParseException{
        System.out.println("Please enter infomation need to be updated!!\n");
        System.out.print("Full name: ");
        u.setHoTen(scanner.nextLine());
        System.out.print("Password: ");
        u.setPassword(scanner.nextLine());
        System.out.print("Gender: ");
        u.setGioiTinh(scanner.nextLine());
        System.out.println("Date of birth(dd/mm/yyyy): ");
        String ns = scanner.nextLine();
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        u.setNgaySinh(f.parse(ns));
        System.out.print("Country: ");
        u.setQueQuan(scanner.nextLine());
    }
    
    public void viewList(){
        for(User u : this.ds){
            System.out.println(u);
        }
    }
    
    public List<User> lookUpByFullName(String fn){
        List<User> kq = new ArrayList<>();
        for(User u : this.ds){
            if(u.getHoTen().toUpperCase().equals(fn.toUpperCase()))
                kq.add(u);
        }
        return kq;
    }
    
    public List<User> lookUpByGender(String g){
        List<User> kq = new ArrayList<>();
        for(User u : this.ds){
            if(u.getGioiTinh().toLowerCase().equals(g.toLowerCase()))
                kq.add(u);
        }
        return kq;
    }
    
    public List<User> lookUpByDOB(String dob) throws ParseException{
        List<User> kq = new ArrayList<>();
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        for(User u : this.ds){
            if(u.getNgaySinh().equals(f.parse(dob)))
                kq.add(u);
        }
        return kq;
    }
    
    public List<User> lookUpByCountry(String c){
        List<User> kq = new ArrayList<>();
        for(User u : this.ds){
            if(u.getQueQuan().toLowerCase().equals(c.toLowerCase()))
                kq.add(u);
        }
        return kq;
    }

    /**
     * @return the ds
     */
    public List<User> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<User> ds) {
        this.ds = ds;
    }
    
    
}
