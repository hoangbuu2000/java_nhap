/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.demo2105;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Buu
 */
public class Conversation extends Question{
    private List<MultipleChoice> ds ;
    
    public Conversation(String nd, String lv, DanhMuc dm){
        super(nd, lv, dm);
        ds = new ArrayList<>();
    }
    
    public void themCauHoi(Question q){
        MultipleChoice c = (MultipleChoice) q;
        this.ds.add(c);
    }

    @Override
    public String toString() {
        String s = super.toString() + "\n";
        for(MultipleChoice c : ds){
            s = s + c;
        }
        return s;
    }
    
    
}
