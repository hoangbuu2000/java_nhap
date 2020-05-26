/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.demo2105;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Buu
 */
public class QuanLyCauHoi {
    private List<Question> ds = new ArrayList<>() ;
    
    public void themCauHoi(Question q){
        this.ds.add(q);
    }
    
    public List<Question> getMultipleChoice(){
        List<Question> k  = new ArrayList<>();
        for(Question q : ds){
            if(q instanceof MultipleChoice)
                k.add(q);
        }
        return k;
    }
    
    public List<Question> getInComplete(){
        List<Question> k = new ArrayList<>();
        for(Question q : ds){
            if(q instanceof InComplete)
                k.add(q);
        }
        return k;
    }
    
    public void luyenTapMultiple(Scanner scanner){
        Collections.shuffle(this.getMultipleChoice());
        for(Question q : this.getMultipleChoice()){
            System.out.println(q);
            System.out.print("\nTra loi: ");
            String kw = scanner.nextLine();
            
            MultipleChoice c = (MultipleChoice) q; //Ép kiểu để truy cập được vào list các phương án của multiplechoice
            String gt = "";
            for(Choices cs : c.getPhuongAn()){
                if(cs.isCorrect())
                    gt = String.format("Dap an: %s\nGiai thich: %s", cs.getNoiDung(), cs.getGhiChu());
            }
            
            if(q.checkAnswer(kw))
                System.out.println("CORRECT!");
            else
                System.out.println("INCORRECT!");
            
            System.out.println(gt + "\n");
        }
    }
    
    public void luyenTapInComplete(Scanner scanner){
        Collections.shuffle(this.getInComplete());
        for(Question q : this.getInComplete()){
            System.out.println(q);
            InComplete i = (InComplete) q;
            for(MultipleChoice c : i.getQuestion()){
                System.out.print("Tra loi cho cau " + c.getNoiDung() + ": ");
                String kw = scanner.nextLine();
                if(c.checkAnswer(kw))
                    System.out.println("CORRECT!\n");
                else
                    System.out.println("INCORRECT!\n");
            }
        }
    }
    
    public List<Question> timTheoNoiDung(String nd){
        List<Question> kq = new ArrayList<>();
        for(Question q : ds){
            if(q.getNoiDung().toUpperCase().contains(nd.toUpperCase()))
                kq.add(q);
        }
        return kq;
    }
    
    public List<Question> timTheoDanhMuc(String dm){
        List<Question> kq = new ArrayList<>();
        for(Question q : ds){
            if(q.getDanhMuc().toString().equals(dm.toUpperCase()))
                kq.add(q);
        }
        return kq;
    }
    
    public List<Question> timTheoMucDo(String lv){
        List<Question> kq = new ArrayList<>();
        for(Question q : ds){
            if(q.getMucDo().equals(lv.toUpperCase()))
                kq.add(q);
        }
        return kq;
    }
}
