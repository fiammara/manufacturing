package com.smartmanufacturing.update.model;

import javax.persistence.*;


@Entity
@Table(name = "excel")
public class ExcelData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String uzsakymas;
    private double m10;
    private double m20;
    private double m30;
    private double m40;
    private double m50;
    private double m60;
    private double m70;
    private double m80;
    private double w10;
    private double w20;
    private double w30;
    private double w40;
    private double w45;
    private double w50;
    private double w55;
    private double w60;
    private double w70;
    private double w80;
    private double w90;
    private double w100;
    private double kiekis;
    private double kaina;
    private double medz_kaina;
    private double skirtingu_medz_kiekis;
    private double daliu_kiekis;
    private double skirtingu_daliu_kiekis;
    private double vn;
    private double m;
    private double m2;
    private double m3;
    private double kg;
    private double kp;
    private double l;
    private double furn_type;
    private String fixed_customer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUzsakymas() {
        return uzsakymas;
    }

    public void setUzsakymas(String uzsakymas) {
        this.uzsakymas = uzsakymas;
    }

    public double getM10() {
        return m10;
    }

    public void setM10(double m10) {
        this.m10 = m10;
    }

    public double getM20() {
        return m20;
    }

    public void setM20(double m20) {
        this.m20 = m20;
    }

    public double getM30() {
        return m30;
    }

    public void setM30(double m30) {
        this.m30 = m30;
    }

    public double getM40() {
        return m40;
    }

    public void setM40(double m40) {
        this.m40 = m40;
    }

    public double getM50() {
        return m50;
    }

    public void setM50(double m50) {
        this.m50 = m50;
    }

    public double getM60() {
        return m60;
    }

    public void setM60(double m60) {
        this.m60 = m60;
    }

    public double getM70() {
        return m70;
    }

    public void setM70(double m70) {
        this.m70 = m70;
    }

    public double getM80() {
        return m80;
    }

    public void setM80(double m80) {
        this.m80 = m80;
    }

    public double getW10() {
        return w10;
    }

    public void setW10(double w10) {
        this.w10 = w10;
    }

    public double getW20() {
        return w20;
    }

    public void setW20(double w20) {
        this.w20 = w20;
    }

    public double getW30() {
        return w30;
    }

    public void setW30(double w30) {
        this.w30 = w30;
    }

    public double getW40() {
        return w40;
    }

    public void setW40(double w40) {
        this.w40 = w40;
    }

    public double getW45() {
        return w45;
    }

    public void setW45(double w45) {
        this.w45 = w45;
    }

    public double getW50() {
        return w50;
    }

    public void setW50(double w50) {
        this.w50 = w50;
    }

    public double getW55() {
        return w55;
    }

    public void setW55(double w55) {
        this.w55 = w55;
    }

    public double getW60() {
        return w60;
    }

    public void setW60(double w60) {
        this.w60 = w60;
    }

    public double getW70() {
        return w70;
    }

    public void setW70(double w70) {
        this.w70 = w70;
    }

    public double getW80() {
        return w80;
    }

    public void setW80(double w80) {
        this.w80 = w80;
    }

    public double getW90() {
        return w90;
    }

    public void setW90(double w90) {
        this.w90 = w90;
    }

    public double getW100() {
        return w100;
    }

    public void setW100(double w100) {
        this.w100 = w100;
    }

    public double getKiekis() {
        return kiekis;
    }

    public void setKiekis(double kiekis) {
        this.kiekis = kiekis;
    }

    public double getKaina() {
        return kaina;
    }

    public void setKaina(double kaina) {
        this.kaina = kaina;
    }

    public double getMedz_kaina() {
        return medz_kaina;
    }

    public void setMedz_kaina(double medz_kaina) {
        this.medz_kaina = medz_kaina;
    }

    public double getSkirtingu_medz_kiekis() {
        return skirtingu_medz_kiekis;
    }

    public void setSkirtingu_medz_kiekis(double skirtingu_medz_kiekis) {
        this.skirtingu_medz_kiekis = skirtingu_medz_kiekis;
    }

    public double getDaliu_kiekis() {
        return daliu_kiekis;
    }

    public void setDaliu_kiekis(double daliu_kiekis) {
        this.daliu_kiekis = daliu_kiekis;
    }

    public double getSkirtingu_daliu_kiekis() {
        return skirtingu_daliu_kiekis;
    }

    public void setSkirtingu_daliu_kiekis(double skirtingu_daliu_kiekis) {
        this.skirtingu_daliu_kiekis = skirtingu_daliu_kiekis;
    }

    public double getVn() {
        return vn;
    }

    public void setVn(double vn) {
        this.vn = vn;
    }

    public double getM() {
        return m;
    }

    public void setM(double m) {
        this.m = m;
    }

    public double getM2() {
        return m2;
    }

    public void setM2(double m2) {
        this.m2 = m2;
    }

    public double getM3() {
        return m3;
    }

    public void setM3(double m3) {
        this.m3 = m3;
    }

    public double getKg() {
        return kg;
    }

    public void setKg(double kg) {
        this.kg = kg;
    }

    public double getKp() {
        return kp;
    }

    public void setKp(double kp) {
        this.kp = kp;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double getFurn_type() {
        return furn_type;
    }

    public void setFurn_type(double furn_type) {
        this.furn_type = furn_type;
    }

    public String getFixed_customer() {
        return fixed_customer;
    }

    public void setFixed_customer(String fixed_customer) {
        this.fixed_customer = fixed_customer;
    }


}
