package com.khilman.www.learngoogleapi.data.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Rute {

    //MENGAMBIL OBJECT JSON
    @SerializedName("data")
    public List<Data> products;


    public List<Data> getProducts() {
        return products;
    }


    public class  Data{
        @SerializedName("id")
        private int id;
        @SerializedName("categori_rute")
        private int caetgori_rute;
        @SerializedName("jarak")
        private String jarak;
        @SerializedName("waktu")
        private String waktu;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getCaetgori_rute() {
            return caetgori_rute;
        }

        public void setCaetgori_rute(int caetgori_rute) {
            this.caetgori_rute = caetgori_rute;
        }

        public String getJarak() {
            return jarak;
        }

        public void setJarak(String jarak) {
            this.jarak = jarak;
        }

        public String getWaktu() {
            return waktu;
        }

        public void setWaktu(String waktu) {
            this.waktu = waktu;
        }



    }
}
