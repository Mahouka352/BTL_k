package com.example.phongo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ChungCu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String tenCC;

    private String diaChi;

    private String nguoiQuanLy;

    public ChungCu(long id, String tenCC, String diaChi, String nguoiQuanLy) {
        this.id = id;
        this.tenCC = tenCC;
        this.diaChi = diaChi;
        this.nguoiQuanLy = nguoiQuanLy;
    }

    public ChungCu() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTenCC() {
        return tenCC;
    }

    public void setTenCC(String tenCC) {
        this.tenCC = tenCC;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getNguoiQuanLy() {
        return nguoiQuanLy;
    }

    public void setNguoiQuanLy(String nguoiQuanLy) {
        this.nguoiQuanLy = nguoiQuanLy;
    }
}
