/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.demo2105;

/**
 *
 * @author Buu
 */
public abstract class Question {
    private String noiDung;
    private String mucDo;
    private DanhMuc danhMuc;
    
    public Question(String nd, String lv, DanhMuc dm){
        this.noiDung = nd;
        this.mucDo = lv;
        this.danhMuc = dm;
    }

    @Override
    public String toString() {
        return String.format("%s\n", this.noiDung);
    }
    
    public void themPhuongAn(Choices c){}
    public boolean checkAnswer(String kw){return true;}
    public void themCauHoi(Question q){}
    

    /**
     * @return the noiDung
     */
    public String getNoiDung() {
        return noiDung;
    }

    /**
     * @param noiDung the noiDung to set
     */
    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    /**
     * @return the mucDo
     */
    public String getMucDo() {
        return mucDo;
    }

    /**
     * @param mucDo the mucDo to set
     */
    public void setMucDo(String mucDo) {
        this.mucDo = mucDo;
    }

    /**
     * @return the danhMuc
     */
    public DanhMuc getDanhMuc() {
        return danhMuc;
    }

    /**
     * @param danhMuc the danhMuc to set
     */
    public void setDanhMuc(DanhMuc danhMuc) {
        this.danhMuc = danhMuc;
    }
    
    
}
