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
public class InComplete extends Question{
    private List<MultipleChoice> question ;
    
    public InComplete(String nd, String lv, DanhMuc dm){
        super(nd, lv, dm);
        question = new ArrayList<>();
    }
    
    public void themCauHoi(Question q){
        MultipleChoice c = (MultipleChoice) q;
        this.getQuestion().add(c);
    }

    @Override
    public String toString() {
        String s = super.toString();
        for(MultipleChoice c : getQuestion()){
            s = s + c;
        }
        return s;
    }

    /**
     * @return the question
     */
    public List<MultipleChoice> getQuestion() {
        return question;
    }

    /**
     * @param question the question to set
     */
    public void setQuestion(List<MultipleChoice> question) {
        this.question = question;
    }
    
    
}
