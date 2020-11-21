/*
NAMA   : MUHAMMAD AZRAQI SAPUTRA
KELAS  : PBO2
NIM    : 10116397
Deskripsi Program : Siapa Kamu
 */
package pbo210116397latihan52siapakamu;

/**
 *
 * @author Zetro
 */
public class Mahasiswa extends Manusia{
    private String nim;
    private String kelas;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    
    public void kelasApa(){
        System.out.println("Saya Azraqi umur 22 tahun sedang balajar dikelas PBO2");  
    } 
    
    
    @Override
    public void siapaKamu(){
        System.out.println("Saya Mahasiswa");
    }

}
