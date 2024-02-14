package com.smartmanufacturing.update.model;

import javax.persistence.*;

@Entity
@Table(name = "experttest")
public class ExpertTest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String bendrosop1_min;
    private String bendrosop1_true;
    private String bendrosop1_max;
    private String bendrosop2_min;
    private String bendrosop2_true;
    private String bendrosop2_max;
    private String bendrosop3_min;
    private String bendrosop3_true;
    private String bendrosop3_max;
    private String bendrosop4_min;
    private String bendrosop4_true;
    private String bendrosop4_max;

    private String opkoef1_min;
    private String opkoef1_true;
    private String opkoef1_max;
    private String opkoef2_min;
    private String opkoef2_true;
    private String opkoef2_max;
    private String opkoef3_min;
    private String opkoef3_true;
    private String opkoef3_max;
    private String opkoef4_min;
    private String opkoef4_true;
    private String opkoef4_max;


    private String kainos1_min;
    private String kainos1_true;
    private String kainos1_max;
    private String kainos2_min;
    private String kainos2_true;
    private String kainos2_max;
    private String kainos3_min;
    private String kainos3_true;
    private String kainos3_max;
    private String kainos4_min;
    private String kainos4_true;
    private String kainos4_max;

    private String darbai1_min;
    private String darbai1_true;
    private String darbai1_max;
    private String darbai2_min;
    private String darbai2_true;
    private String darbai2_max;
    private String darbai3_min;
    private String darbai3_true;
    private String darbai3_max;
    private String darbai4_min;
    private String darbai4_true;
    private String darbai4_max;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBendrosop1_min() {
        return bendrosop1_min;
    }

    public void setBendrosop1_min(String bendrosop1_min) {
        this.bendrosop1_min = bendrosop1_min;
    }

    public String getBendrosop1_true() {
        return bendrosop1_true;
    }

    public void setBendrosop1_true(String bendrosop1_true) {
        this.bendrosop1_true = bendrosop1_true;
    }

    public String getBendrosop1_max() {
        return bendrosop1_max;
    }

    public void setBendrosop1_max(String bendrosop1_max) {
        this.bendrosop1_max = bendrosop1_max;
    }

    public String getBendrosop2_min() {
        return bendrosop2_min;
    }

    public void setBendrosop2_min(String bendrosop2_min) {
        this.bendrosop2_min = bendrosop2_min;
    }

    public String getBendrosop2_true() {
        return bendrosop2_true;
    }

    public void setBendrosop2_true(String bendrosop2_true) {
        this.bendrosop2_true = bendrosop2_true;
    }

    public String getBendrosop2_max() {
        return bendrosop2_max;
    }

    public void setBendrosop2_max(String bendrosop2_max) {
        this.bendrosop2_max = bendrosop2_max;
    }

    public String getBendrosop3_min() {
        return bendrosop3_min;
    }

    public void setBendrosop3_min(String bendrosop3_min) {
        this.bendrosop3_min = bendrosop3_min;
    }

    public String getBendrosop3_true() {
        return bendrosop3_true;
    }

    public void setBendrosop3_true(String bendrosop3_true) {
        this.bendrosop3_true = bendrosop3_true;
    }

    public String getBendrosop3_max() {
        return bendrosop3_max;
    }

    public void setBendrosop3_max(String bendrosop3_max) {
        this.bendrosop3_max = bendrosop3_max;
    }

    public String getBendrosop4_min() {
        return bendrosop4_min;
    }

    public void setBendrosop4_min(String bendrosop4_min) {
        this.bendrosop4_min = bendrosop4_min;
    }

    public String getBendrosop4_true() {
        return bendrosop4_true;
    }

    public void setBendrosop4_true(String bendrosop4_true) {
        this.bendrosop4_true = bendrosop4_true;
    }

    public String getBendrosop4_max() {
        return bendrosop4_max;
    }

    public void setBendrosop4_max(String bendrosop4_max) {
        this.bendrosop4_max = bendrosop4_max;
    }

    public String getOpkoef1_min() {
        return opkoef1_min;
    }

    public void setOpkoef1_min(String opkoef1_min) {
        this.opkoef1_min = opkoef1_min;
    }

    public String getOpkoef1_true() {
        return opkoef1_true;
    }

    public void setOpkoef1_true(String opkoef1_true) {
        this.opkoef1_true = opkoef1_true;
    }

    public String getOpkoef1_max() {
        return opkoef1_max;
    }

    public void setOpkoef1_max(String opkoef1_max) {
        this.opkoef1_max = opkoef1_max;
    }

    public String getOpkoef2_min() {
        return opkoef2_min;
    }

    public void setOpkoef2_min(String opkoef2_min) {
        this.opkoef2_min = opkoef2_min;
    }

    public String getOpkoef2_true() {
        return opkoef2_true;
    }

    public void setOpkoef2_true(String opkoef2_true) {
        this.opkoef2_true = opkoef2_true;
    }

    public String getOpkoef2_max() {
        return opkoef2_max;
    }

    public void setOpkoef2_max(String opkoef2_max) {
        this.opkoef2_max = opkoef2_max;
    }

    public String getOpkoef3_min() {
        return opkoef3_min;
    }

    public void setOpkoef3_min(String opkoef3_min) {
        this.opkoef3_min = opkoef3_min;
    }

    public String getOpkoef3_true() {
        return opkoef3_true;
    }

    public void setOpkoef3_true(String opkoef3_true) {
        this.opkoef3_true = opkoef3_true;
    }

    public String getOpkoef3_max() {
        return opkoef3_max;
    }

    public void setOpkoef3_max(String opkoef3_max) {
        this.opkoef3_max = opkoef3_max;
    }

    public String getOpkoef4_min() {
        return opkoef4_min;
    }

    public void setOpkoef4_min(String opkoef4_min) {
        this.opkoef4_min = opkoef4_min;
    }

    public String getOpkoef4_true() {
        return opkoef4_true;
    }

    public void setOpkoef4_true(String opkoef4_true) {
        this.opkoef4_true = opkoef4_true;
    }

    public String getOpkoef4_max() {
        return opkoef4_max;
    }

    public void setOpkoef4_max(String opkoef4_max) {
        this.opkoef4_max = opkoef4_max;
    }

    public String getKainos1_min() {
        return kainos1_min;
    }

    public void setKainos1_min(String kainos1_min) {
        this.kainos1_min = kainos1_min;
    }

    public String getKainos1_true() {
        return kainos1_true;
    }

    public void setKainos1_true(String kainos1_true) {
        this.kainos1_true = kainos1_true;
    }

    public String getKainos1_max() {
        return kainos1_max;
    }

    public void setKainos1_max(String kainos1_max) {
        this.kainos1_max = kainos1_max;
    }

    public String getKainos2_min() {
        return kainos2_min;
    }

    public void setKainos2_min(String kainos2_min) {
        this.kainos2_min = kainos2_min;
    }

    public String getKainos2_true() {
        return kainos2_true;
    }

    public void setKainos2_true(String kainos2_true) {
        this.kainos2_true = kainos2_true;
    }

    public String getKainos2_max() {
        return kainos2_max;
    }

    public void setKainos2_max(String kainos2_max) {
        this.kainos2_max = kainos2_max;
    }

    public String getKainos3_min() {
        return kainos3_min;
    }

    public void setKainos3_min(String kainos3_min) {
        this.kainos3_min = kainos3_min;
    }

    public String getKainos3_true() {
        return kainos3_true;
    }

    public void setKainos3_true(String kainos3_true) {
        this.kainos3_true = kainos3_true;
    }

    public String getKainos3_max() {
        return kainos3_max;
    }

    public void setKainos3_max(String kainos3_max) {
        this.kainos3_max = kainos3_max;
    }

    public String getKainos4_min() {
        return kainos4_min;
    }

    public void setKainos4_min(String kainos4_min) {
        this.kainos4_min = kainos4_min;
    }

    public String getKainos4_true() {
        return kainos4_true;
    }

    public void setKainos4_true(String kainos4_true) {
        this.kainos4_true = kainos4_true;
    }

    public String getKainos4_max() {
        return kainos4_max;
    }

    public void setKainos4_max(String kainos4_max) {
        this.kainos4_max = kainos4_max;
    }

    public String getDarbai1_min() {
        return darbai1_min;
    }

    public void setDarbai1_min(String darbai1_min) {
        this.darbai1_min = darbai1_min;
    }

    public String getDarbai1_true() {
        return darbai1_true;
    }

    public void setDarbai1_true(String darbai1_true) {
        this.darbai1_true = darbai1_true;
    }

    public String getDarbai1_max() {
        return darbai1_max;
    }

    public void setDarbai1_max(String darbai1_max) {
        this.darbai1_max = darbai1_max;
    }

    public String getDarbai2_min() {
        return darbai2_min;
    }

    public void setDarbai2_min(String darbai2_min) {
        this.darbai2_min = darbai2_min;
    }

    public String getDarbai2_true() {
        return darbai2_true;
    }

    public void setDarbai2_true(String darbai2_true) {
        this.darbai2_true = darbai2_true;
    }

    public String getDarbai2_max() {
        return darbai2_max;
    }

    public void setDarbai2_max(String darbai2_max) {
        this.darbai2_max = darbai2_max;
    }

    public String getDarbai3_min() {
        return darbai3_min;
    }

    public void setDarbai3_min(String darbai3_min) {
        this.darbai3_min = darbai3_min;
    }

    public String getDarbai3_true() {
        return darbai3_true;
    }

    public void setDarbai3_true(String darbai3_true) {
        this.darbai3_true = darbai3_true;
    }

    public String getDarbai3_max() {
        return darbai3_max;
    }

    public void setDarbai3_max(String darbai3_max) {
        this.darbai3_max = darbai3_max;
    }

    public String getDarbai4_min() {
        return darbai4_min;
    }

    public void setDarbai4_min(String darbai4_min) {
        this.darbai4_min = darbai4_min;
    }

    public String getDarbai4_true() {
        return darbai4_true;
    }

    public void setDarbai4_true(String darbai4_true) {
        this.darbai4_true = darbai4_true;
    }

    public String getDarbai4_max() {
        return darbai4_max;
    }

    public void setDarbai4_max(String darbai4_max) {
        this.darbai4_max = darbai4_max;
    }

}
