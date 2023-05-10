package com.example.phongo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class DichVu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String tenDV;

    private Date ngayThucHien;

    public DichVu() {
    }

    public DichVu(long id, String tenDV, Date ngayThucHien) {
        this.id = id;
        this.tenDV = tenDV;
        this.ngayThucHien = ngayThucHien;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTenDV() {
        return tenDV;
    }

    public void setTenDV(String tenDV) {
        this.tenDV = tenDV;
    }

    public Date getNgayThucHien() {
        return ngayThucHien;
    }

    public void setNgayThucHien(Date ngayThucHien) {
        this.ngayThucHien = ngayThucHien;
    }
}
