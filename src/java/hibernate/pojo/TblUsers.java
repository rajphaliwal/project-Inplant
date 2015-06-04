package hibernate.pojo;
// Generated 3 Jun, 2015 5:12:49 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * TblUsers generated by hbm2java
 */
public class TblUsers  implements java.io.Serializable {


     private String SUsername;
     private TblPlant tblPlant;
     private String SPassword;
     private String SPasswordMd5;
     private Boolean BRemoveTrip;
     private Boolean BViewTrip;
     private Boolean BNodeView;
     private Boolean BAddTrip;
     private Boolean BViewException;
     private Boolean BEndException;
     private Boolean BViewHistory;
     private Boolean BSetupNewPlant;
     private Boolean BPlantModify;
     private Boolean BAddUser;
     private Boolean BModifyUser;
     private Boolean BChangeCurrentPlant;
     private Boolean BAddVehicle;
     private Boolean BModifyVehicle;
     private Boolean BModifyDriver;
     private Boolean BAddDriver;
     private Boolean BViewDo;
     private Boolean BLoggedIn;
     private BigDecimal ITransporterId;
     private BigDecimal IDriverId;

    public TblUsers() {
    }

	
    public TblUsers(String SUsername, TblPlant tblPlant, String SPasswordMd5) {
        this.SUsername = SUsername;
        this.tblPlant = tblPlant;
        this.SPasswordMd5 = SPasswordMd5;
    }
    public TblUsers(String SUsername, TblPlant tblPlant, String SPassword, String SPasswordMd5, Boolean BRemoveTrip, Boolean BViewTrip, Boolean BNodeView, Boolean BAddTrip, Boolean BViewException, Boolean BEndException, Boolean BViewHistory, Boolean BSetupNewPlant, Boolean BPlantModify, Boolean BAddUser, Boolean BModifyUser, Boolean BChangeCurrentPlant, Boolean BAddVehicle, Boolean BModifyVehicle, Boolean BModifyDriver, Boolean BAddDriver, Boolean BViewDo, Boolean BLoggedIn, BigDecimal ITransporterId, BigDecimal IDriverId) {
       this.SUsername = SUsername;
       this.tblPlant = tblPlant;
       this.SPassword = SPassword;
       this.SPasswordMd5 = SPasswordMd5;
       this.BRemoveTrip = BRemoveTrip;
       this.BViewTrip = BViewTrip;
       this.BNodeView = BNodeView;
       this.BAddTrip = BAddTrip;
       this.BViewException = BViewException;
       this.BEndException = BEndException;
       this.BViewHistory = BViewHistory;
       this.BSetupNewPlant = BSetupNewPlant;
       this.BPlantModify = BPlantModify;
       this.BAddUser = BAddUser;
       this.BModifyUser = BModifyUser;
       this.BChangeCurrentPlant = BChangeCurrentPlant;
       this.BAddVehicle = BAddVehicle;
       this.BModifyVehicle = BModifyVehicle;
       this.BModifyDriver = BModifyDriver;
       this.BAddDriver = BAddDriver;
       this.BViewDo = BViewDo;
       this.BLoggedIn = BLoggedIn;
       this.ITransporterId = ITransporterId;
       this.IDriverId = IDriverId;
    }
   
    public String getSUsername() {
        return this.SUsername;
    }
    
    public void setSUsername(String SUsername) {
        this.SUsername = SUsername;
    }
    public TblPlant getTblPlant() {
        return this.tblPlant;
    }
    
    public void setTblPlant(TblPlant tblPlant) {
        this.tblPlant = tblPlant;
    }
    public String getSPassword() {
        return this.SPassword;
    }
    
    public void setSPassword(String SPassword) {
        this.SPassword = SPassword;
    }
    public String getSPasswordMd5() {
        return this.SPasswordMd5;
    }
    
    public void setSPasswordMd5(String SPasswordMd5) {
        this.SPasswordMd5 = SPasswordMd5;
    }
    public Boolean getBRemoveTrip() {
        return this.BRemoveTrip;
    }
    
    public void setBRemoveTrip(Boolean BRemoveTrip) {
        this.BRemoveTrip = BRemoveTrip;
    }
    public Boolean getBViewTrip() {
        return this.BViewTrip;
    }
    
    public void setBViewTrip(Boolean BViewTrip) {
        this.BViewTrip = BViewTrip;
    }
    public Boolean getBNodeView() {
        return this.BNodeView;
    }
    
    public void setBNodeView(Boolean BNodeView) {
        this.BNodeView = BNodeView;
    }
    public Boolean getBAddTrip() {
        return this.BAddTrip;
    }
    
    public void setBAddTrip(Boolean BAddTrip) {
        this.BAddTrip = BAddTrip;
    }
    public Boolean getBViewException() {
        return this.BViewException;
    }
    
    public void setBViewException(Boolean BViewException) {
        this.BViewException = BViewException;
    }
    public Boolean getBEndException() {
        return this.BEndException;
    }
    
    public void setBEndException(Boolean BEndException) {
        this.BEndException = BEndException;
    }
    public Boolean getBViewHistory() {
        return this.BViewHistory;
    }
    
    public void setBViewHistory(Boolean BViewHistory) {
        this.BViewHistory = BViewHistory;
    }
    public Boolean getBSetupNewPlant() {
        return this.BSetupNewPlant;
    }
    
    public void setBSetupNewPlant(Boolean BSetupNewPlant) {
        this.BSetupNewPlant = BSetupNewPlant;
    }
    public Boolean getBPlantModify() {
        return this.BPlantModify;
    }
    
    public void setBPlantModify(Boolean BPlantModify) {
        this.BPlantModify = BPlantModify;
    }
    public Boolean getBAddUser() {
        return this.BAddUser;
    }
    
    public void setBAddUser(Boolean BAddUser) {
        this.BAddUser = BAddUser;
    }
    public Boolean getBModifyUser() {
        return this.BModifyUser;
    }
    
    public void setBModifyUser(Boolean BModifyUser) {
        this.BModifyUser = BModifyUser;
    }
    public Boolean getBChangeCurrentPlant() {
        return this.BChangeCurrentPlant;
    }
    
    public void setBChangeCurrentPlant(Boolean BChangeCurrentPlant) {
        this.BChangeCurrentPlant = BChangeCurrentPlant;
    }
    public Boolean getBAddVehicle() {
        return this.BAddVehicle;
    }
    
    public void setBAddVehicle(Boolean BAddVehicle) {
        this.BAddVehicle = BAddVehicle;
    }
    public Boolean getBModifyVehicle() {
        return this.BModifyVehicle;
    }
    
    public void setBModifyVehicle(Boolean BModifyVehicle) {
        this.BModifyVehicle = BModifyVehicle;
    }
    public Boolean getBModifyDriver() {
        return this.BModifyDriver;
    }
    
    public void setBModifyDriver(Boolean BModifyDriver) {
        this.BModifyDriver = BModifyDriver;
    }
    public Boolean getBAddDriver() {
        return this.BAddDriver;
    }
    
    public void setBAddDriver(Boolean BAddDriver) {
        this.BAddDriver = BAddDriver;
    }
    public Boolean getBViewDo() {
        return this.BViewDo;
    }
    
    public void setBViewDo(Boolean BViewDo) {
        this.BViewDo = BViewDo;
    }
    public Boolean getBLoggedIn() {
        return this.BLoggedIn;
    }
    
    public void setBLoggedIn(Boolean BLoggedIn) {
        this.BLoggedIn = BLoggedIn;
    }
    public BigDecimal getITransporterId() {
        return this.ITransporterId;
    }
    
    public void setITransporterId(BigDecimal ITransporterId) {
        this.ITransporterId = ITransporterId;
    }
    public BigDecimal getIDriverId() {
        return this.IDriverId;
    }
    
    public void setIDriverId(BigDecimal IDriverId) {
        this.IDriverId = IDriverId;
    }




}


