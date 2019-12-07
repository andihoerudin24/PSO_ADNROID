package com.khilman.www.learngoogleapi.data.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Rute {


    //MENGAMBIL OBJECT JSON
    @SerializedName("data")
    private Data data;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public class  Data{
        @SerializedName("id")
        private int id;
        @SerializedName("rute")
        private String rute ;
        @SerializedName("jarak1")
        private String jarak1;
        @SerializedName("waktu1")
        private String waktu1;

        @SerializedName("jarak2")
        private String jarak2;
        @SerializedName("waktu2")
        private String waktu2;
        @SerializedName("waktu_tercepat")
        private String waktu_tercepat;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getRute() {
            return rute;
        }

        public void setRute(String rute) {
            this.rute = rute;
        }

        public String getJarak1() {
            return jarak1;
        }

        public void setJarak1(String jarak1) {
            this.jarak1 = jarak1;
        }

        public String getWaktu1() {
            return waktu1;
        }

        public void setWaktu1(String waktu1) {
            this.waktu1 = waktu1;
        }

        public String getJarak2() {
            return jarak2;
        }

        public void setJarak2(String jarak2) {
            this.jarak2 = jarak2;
        }

        public String getWaktu2() {
            return waktu2;
        }

        public void setWaktu2(String waktu2) {
            this.waktu2 = waktu2;
        }

        public String getWaktu_tercepat() {
            return waktu_tercepat;
        }

        public void setWaktu_tercepat(String waktu_tercepat) {
            this.waktu_tercepat = waktu_tercepat;
        }
}
}
