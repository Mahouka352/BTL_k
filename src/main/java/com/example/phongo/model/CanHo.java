package com.example.phongo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
public class CanHo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String maCH;

    private String tenCH;

    //true ddang co ng o false chua co ai o
    private boolean trangthai;

    @ManyToOne
    private DichVu dichVu;

    @ManyToOne
    private ChungCu chungCu;

    private float gia;



    public CanHo(long id, String maCH, String tenCH, boolean trangthai, ChungCu chungCu, float gia, DichVu dichVu) {
        this.id = id;
        this.maCH = maCH;
        this.tenCH = tenCH;
        this.trangthai = trangthai;
        this.chungCu = chungCu;
        this.gia = gia;
        this.dichVu = dichVu;
    }
    public CanHo(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMaCH() {
        return maCH;
    }

    public void setMaCH(String maCH) {
        this.maCH = maCH;
    }

    public String getTenCH() {
        return tenCH;
    }

    public void setTenCH(String tenCH) {
        this.tenCH = tenCH;
    }

    public boolean isTrangthai() {
        return trangthai;
    }

    public void setTrangthai(boolean trangthai) {
        this.trangthai = trangthai;
    }

    public ChungCu getChungCu() {
        return chungCu;
    }

    public void setChungCu(ChungCu chungCu) {
        this.chungCu = chungCu;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public DichVu getDichVu() {
        return dichVu;
    }

    public void setDichVu(DichVu dichVu) {
        this.dichVu = dichVu;
    }
}
