package com.example.phongo.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class CuDan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String sdt;

    private String diaChi;

    @ManyToOne
    private CanHo canHo;

    private Date ngayThue;//ngay thue hoac ngay mua

    public CuDan(long id, String name, String sdt, String diaChi, CanHo canHo, Date ngayThue) {
        this.id = id;
        this.name = name;
        this.sdt = sdt;
        this.diaChi = diaChi;
        this.canHo = canHo;
        this.ngayThue = ngayThue;
    }
    public CuDan(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public CanHo getCanHo() {
        return canHo;
    }

    public void setCanHo(CanHo canHo) {
        this.canHo = canHo;
    }

    public Date getNgayThue() {
        return ngayThue;
    }

    public void setNgayThue(Date ngayThue) {
        this.ngayThue = ngayThue;
    }
}
