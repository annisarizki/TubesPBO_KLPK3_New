/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasieninaprumahsakit;

/**
 *
 * @author ASUS PC
 */
public class Dokter extends Orang {
    private String idDokter;
	private String spesialis;
	private int jamKerja;
	
	public Dokter(String idDokter, String spesialis, int jamKerja,String nama, char jenisKelamin, int umur){
		super(nama,jenisKelamin,umur);
                this.idDokter = idDokter;
		this.spesialis = spesialis;
		this.jamKerja = jamKerja;
	}
	public String getIdDokter(){
		return idDokter;
	}
	public String getSpesialis(){
		return spesialis;
	}
	public int getJamKerja(){
		return jamKerja;
	}
}
