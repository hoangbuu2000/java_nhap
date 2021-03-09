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
/* test ssh */
class Choices {
    private String noiDung;
    private boolean correct;
    private String ghiChu;
    
    public Choices(String nd, boolean cr, String gt){
        this.noiDung = nd;
        this.correct = cr;
        this.ghiChu = gt;
    }

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
     * @return the correct
     */
    public boolean isCorrect() {
        return correct;
    }

    /**
     * @param correct the correct to set
     */
    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    /**
     * @return the ghiChu
     */
    public String getGhiChu() {
        return ghiChu;
    }

    /**
     * @param ghiChu the ghiChu to set
     */
    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
    
    
}
