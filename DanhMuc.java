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
class DanhMuc {
    private String noiDung;
    
    public DanhMuc(String nd){
        this.noiDung = nd;
    }

    @Override
    public String toString() {
        return this.noiDung;
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
    
    
}
