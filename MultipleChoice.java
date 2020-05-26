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
public class MultipleChoice extends Question{
    private final String[] LABELS = {"A", "B", "C", "D"};
    private List<Choices> phuongAn ;
            
    public MultipleChoice(String nd, String lv, DanhMuc dm){
        super(nd, lv, dm);
        phuongAn = new ArrayList<>();
    }

    public void themPhuongAn(Choices c){
        this.phuongAn.add(c);
    }
    
    public boolean checkAnswer(String kw){
        for(int i = 0; i < phuongAn.size(); i++){
            if(this.phuongAn.get(i).isCorrect() == true && LABELS[i].equals(kw.toUpperCase())){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String s = super.toString();
        int n = this.phuongAn.size() - LABELS.length;
        if(n < 0){
            for(int i = 0; i < this.phuongAn.size(); i++){
                s = s + LABELS[i] + ". " + this.phuongAn.get(i).getNoiDung() + "\n";
            }   
        }
        else{
            for(int i = 0; i < LABELS.length; i++){
                s = s + LABELS[i] + ". " + this.phuongAn.get(i).getNoiDung() + "\n";
            }
        }
        return s + "\n";
    }
    
    
    
    /**
     * @return the phuongAn
     */
    public List<Choices> getPhuongAn() {
        return phuongAn;
    }

    /**
     * @param phuongAn the phuongAn to set
     */
    public void setPhuongAn(List<Choices> phuongAn) {
        this.phuongAn = phuongAn;
    }
    
    
}
