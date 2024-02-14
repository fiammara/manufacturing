package com.smartmanufacturing.update.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String order_id;
    private String invoice_ad;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date invoice_date;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date pay_date;
    private Long id_seller;
    private Long id_client;
    private float price_net;
    private float price;
    private String currency;
    private String source;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getInvoice_ad() {
        return invoice_ad;
    }

    public void setInvoice_ad(String invoice_ad) {
        this.invoice_ad = invoice_ad;
    }

    public Date getInvoice_date() {
        return invoice_date;
    }

    public void setInvoice_date(Date invoice_date) {
        this.invoice_date = invoice_date;
    }

    public Date getPay_date() {
        return pay_date;
    }

    public void setPay_date(Date pay_date) {
        this.pay_date = pay_date;
    }

    public Long getId_seller() {
        return id_seller;
    }

    public void setId_seller(Long id_seller) {
        this.id_seller = id_seller;
    }

    public Long getId_client() {
        return id_client;
    }

    public void setId_client(Long id_client) {
        this.id_client = id_client;
    }

    public float getPrice_net() {
        return price_net;
    }

    public void setPrice_net(float price_net) {
        this.price_net = price_net;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

}
