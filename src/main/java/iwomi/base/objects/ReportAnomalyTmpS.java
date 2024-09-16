/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iwomi.base.objects;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author User
 */
@Entity
@Table(name = "srpanomtmp")
public class ReportAnomalyTmpS {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String etab;

    private Double mntg;
    private Double mntd;
    public void setId(Long id) {
            this.id = id;
    }
    public void setEtab(String etab) {
            this.etab = etab;
    }
    public void setMntg(Double mntg) {
            this.mntg = mntg;
    }
    public void setMntd(Double mntd) {
            this.mntd = mntd;
    }
    public void setCg(String cg) {
            this.cg = cg;
    }
    public void setDar(Date dar) {
            this.dar = dar;
    }
    public void setType(String type) {
            this.type = type;
    }
    public void setCd(String cd) {
            this.cd = cd;
    }
    public void setCuser(String cuser) {
            this.cuser = cuser;
    }
    public void setMuser(String muser) {
            this.muser = muser;
    }
    public void setCrdt(Date crdt) {
            this.crdt = crdt;
    }
    public void setMdfi(Date mdfi) {
            this.mdfi = mdfi;
    }
    public void setFichier(String fichier) {
            this.fichier = fichier;
    }
    public void setSign(String sign) {
            this.sign = sign;
    }
    private String cg;
    private Date dar;
    private String type;
    private String cd;
    private String cuser;
    private String muser;
    private Date crdt;
    private Date mdfi;
    private String fichier;
    private String sign;

    public ReportAnomalyTmpS() {

    }
    public Long getId() {
            return id;
    }
    public String getEtab() {
            return etab;
    }
    public String getFichier() {
            return fichier;
    }
    public Double getMntg() {
            return mntg;
    }
    public Double getMntd() {
            return mntd;
    }
    
    public Date getDar() {
            return dar;
    }
    
    public void setDar() {
            this.dar = dar;
    }
    
    public String getCuser() {
            return cuser;
    }
    public String getMuser() {
            return muser;
    }
    public Date getCrdt() {
            return crdt;
    }
    public Date getMdfi() {
            return mdfi;
    }
    public String getCg() {
            return cg;
    }
    public String getType() {
            return type;
    }
    public String getCd() {
            return cd;
    }
    public String getSign() {
            return sign;
    }
    public ReportAnomalyTmpS(String etab, Date dar, Double mntg, Double mntd, 
            String cuser, String muser,String cg,String cd,String type,String fichier,String sign) {
            super();
            this.etab = etab;
            this.dar = dar;
            this.mntg = mntg;
            this.mntd = mntd;
            this.cuser = cuser;
            this.muser = cuser;
            this.cg = cg;
            this.type = type;
            this.cd = cd;
            this.fichier = fichier;
            this.sign = sign;
            
            
    }
}
