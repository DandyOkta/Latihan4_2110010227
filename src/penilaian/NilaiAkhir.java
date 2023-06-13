/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penilaian;

/**
 *
 * @author acer
 */
public class NilaiAkhir extends Mahasiswa {
    int uts, uas, tugas;

    NilaiAkhir(int uts, int uas, int tugas, String nama, String npm) {
        super(nama,npm);
        this.uts = uts;
        this.uas = uas;
        this.tugas = tugas;
    }
    
    double hitungNilaiAkhir(){
        return 0.3*uts + 0.3*uas + 0.4*tugas;
}

    @Override
    public void setNpm(String npm) {
        super.setNpm(npm); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNpm() {
        return super.getNpm(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNama(String nama) {
        super.setNama(nama); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNama() {
        return super.getNama(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
