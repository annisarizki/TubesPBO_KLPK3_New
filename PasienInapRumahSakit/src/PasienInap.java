/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasieninaprumahsakit;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS PC
 */
public class PasienInap {
    private Pasien pasien;
    private Dokter dokter;
	private List<String> diagnose = new ArrayList<String>();
	private int nDiagnose;
	
	public PasienInap(Pasien p){
		this.pasien = p;
                nDiagnose = 0;
	}
	
	public void setDokter(Dokter d){
		this.dokter = d;
	}
	public void setPasien(Pasien p){
		this.pasien = p;
	}
	public Pasien getPasien(){
            return pasien;
        }
        public Dokter getDokter(){
            return this.dokter;
        }
	public void addDiagnosa(String d){
		diagnose.add(d);
		nDiagnose++;
	}
	
	public String getDiagnose(int i){
		return diagnose.get(i);
	}
	
	public void deleteDiagnose(int i){
		diagnose.remove(i);
	}
        public int getNDiagnose(){
            return diagnose.size();
        }
        
}