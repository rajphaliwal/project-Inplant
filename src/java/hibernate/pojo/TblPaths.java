package hibernate.pojo;
// Generated 3 Jun, 2015 5:12:49 PM by Hibernate Tools 4.3.1


import java.io.Serializable;

/**
 * TblPaths generated by hbm2java
 */
public class TblPaths  implements java.io.Serializable {


     private String TName;
     private TblPlant tblPlant;
     private Serializable IArrPath;

    public TblPaths() {
    }

	
    public TblPaths(String TName, TblPlant tblPlant) {
        this.TName = TName;
        this.tblPlant = tblPlant;
    }
    public TblPaths(String TName, TblPlant tblPlant, Serializable IArrPath) {
       this.TName = TName;
       this.tblPlant = tblPlant;
       this.IArrPath = IArrPath;
    }
   
    public String getTName() {
        return this.TName;
    }
    
    public void setTName(String TName) {
        this.TName = TName;
    }
    public TblPlant getTblPlant() {
        return this.tblPlant;
    }
    
    public void setTblPlant(TblPlant tblPlant) {
        this.tblPlant = tblPlant;
    }
    public Serializable getIArrPath() {
        return this.IArrPath;
    }
    
    public void setIArrPath(Serializable IArrPath) {
        this.IArrPath = IArrPath;
    }




}


