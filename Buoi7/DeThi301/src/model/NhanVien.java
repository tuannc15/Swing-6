/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
import java.util.UUID;

/**
 *
 * @author nctuan
 */
public class NhanVien {

    private String Id;
    private String Ma;
    private String Ho;
    private String TenDem;
    private String Ten;
    private String GioiTinh;
    private String DiaChi;
    private Date NgaySinh;

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public String getHo() {
        return Ho;
    }

    public void setHo(String Ho) {
        this.Ho = Ho;
    }

    public String getTenDem() {
        return TenDem;
    }

    public void setTenDem(String TenDem) {
        this.TenDem = TenDem;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public NhanVien(String Id, String Ma, String Ho, String TenDem, String Ten, String GioiTinh, String DiaChi, Date NgaySinh) {
        this.Id = Id;
        this.Ma = Ma;
        this.Ho = Ho;
        this.TenDem = TenDem;
        this.Ten = Ten;
        this.GioiTinh = GioiTinh;
        this.DiaChi = DiaChi;
        this.NgaySinh = NgaySinh;
    }

    public NhanVien(String Ma, String Ho, String TenDem, String Ten, String GioiTinh, String DiaChi, Date NgaySinh) {
        this.Ma = Ma;
        this.Ho = Ho;
        this.TenDem = TenDem;
        this.Ten = Ten;
        this.GioiTinh = GioiTinh;
        this.DiaChi = DiaChi;
        this.NgaySinh = NgaySinh;
    }



}
