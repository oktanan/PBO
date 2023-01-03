
package enkapsul;

public class Motor {
    private String namapemilik;
    private String jenismotor;
    private String platmotor;
    private String merekmotor;
    private String tahunrilis;
    
    public void setnamapemilik(String np){ //void(set) prosedur
      namapemilik = np;
    }
    public String getnamapemilik(){  //return = fungsi mengembalikan nilai
      return namapemilik;
    }
    public void setjenismotor(String jm){
      jenismotor = jm;
    }
    public String getjenismotor(){  
      return jenismotor;
    }
    public void setplatmotor(String pm){
      platmotor = pm;
    }
    public String getplatmotor(){  
      return platmotor;
    }
    public void setmerekmotor(String mm){
      merekmotor = mm;
    }
    public String getmerekmotor(){  
      return merekmotor;
    }
    public void settahunrilis(String tr){
      tahunrilis = tr;
    }
    public String gettahunrilis(){  
      return tahunrilis;
    }
    public void infoMotor(){
      System.out.println("Nama Pemilik = "+getnamapemilik());
      System.out.println("Jenis Motor = "+getjenismotor());
      System.out.println("Plat Motor = "+getplatmotor());
      System.out.println("Merek Motor = "+getmerekmotor());
      System.out.println("Tahun Rilis = "+gettahunrilis());
  }
}
