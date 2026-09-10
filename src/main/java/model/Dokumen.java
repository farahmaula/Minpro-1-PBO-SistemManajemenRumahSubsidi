/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ACER
 */
public class Dokumen {
    private String idDokumen;
    private String nikPembeli;
    private String namaDokumen;
    private String statusVerifikasi;

    public Dokumen(String idDokumen, String nikPembeli, String namaDokumen, String statusVerifikasi) {
        this.idDokumen = idDokumen;
        this.nikPembeli = nikPembeli;
        this.namaDokumen = namaDokumen;
        this.statusVerifikasi = statusVerifikasi;
    }

    public String getIdDokumen() {
        return idDokumen;
    }

    public void setIdDokumen(String idDokumen) {
        this.idDokumen = idDokumen;
    }

    public String getNikPembeli() {
        return nikPembeli;
    }

    public void setNikPembeli(String nikPembeli) {
        this.nikPembeli = nikPembeli;
    }

    public String getNamaDokumen() {
        return namaDokumen;
    }

    public void setNamaDokumen(String namaDokumen) {
        this.namaDokumen = namaDokumen;
    }

    public String getStatusVerifikasi() {
        return statusVerifikasi;
    }

    public void setStatusVerifikasi(String statusVerifikasi) {
        this.statusVerifikasi = statusVerifikasi;
    }

    public void tampilkanData() {
        System.out.println("ID Dokumen   : " + idDokumen);
        System.out.println("NIK Pembeli  : " + nikPembeli);
        System.out.println("Nama Dokumen : " + namaDokumen);
        System.out.println("Status       : " + statusVerifikasi);
    }
}
