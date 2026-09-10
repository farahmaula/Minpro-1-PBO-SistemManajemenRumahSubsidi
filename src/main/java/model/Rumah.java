/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ACER
 */
public class Rumah {
    private String idRumah;
    private String unit;
    private String tipeRumah;
    private String status;
    private double harga;

    public Rumah(String idRumah, String unit, String tipeRumah, double harga, String status) {
        this.idRumah = idRumah;
        this.unit = unit;
        this.tipeRumah = tipeRumah;
        this.harga = harga;
        this.status = status;
    
    }

    public String getIdRumah() {
        return idRumah;
    }

    public void setIdRumah(String idRumah) {
        this.idRumah = idRumah;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getTipeRumah() {
        return tipeRumah;
    }

    public void setTipeRumah(String tipeRumah) {
        this.tipeRumah = tipeRumah;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void tampilkanData() {
        System.out.println("ID Rumah      : " + idRumah);
        System.out.println("Unit          : " + unit);
        System.out.println("Tipe Rumah    : " + tipeRumah);
        System.out.println("Harga         : Rp. " + harga);
        System.out.println("Status        : " + status);
    }
}
