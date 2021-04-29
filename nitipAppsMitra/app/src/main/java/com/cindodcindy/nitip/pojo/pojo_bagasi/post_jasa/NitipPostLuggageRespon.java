
package com.cindodcindy.nitip.pojo.pojo_bagasi.post_jasa;

//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("jsonschema2pojo")
public class NitipPostLuggageRespon {

    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("updatedAt")
    @Expose
    private String updatedAt;
    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("namaPenjual")
    @Expose
    private String namaPenjual;
    @SerializedName("asal")
    @Expose
    private String asal;
    @SerializedName("tujuan")
    @Expose
    private String tujuan;
    @SerializedName("tanggalBerangkat")
    @Expose
    private String tanggalBerangkat;
    @SerializedName("jamBerangkat")
    @Expose
    private String jamBerangkat;
    @SerializedName("tanggalTiba")
    @Expose
    private String tanggalTiba;
    @SerializedName("jamTiba")
    @Expose
    private String jamTiba;
    @SerializedName("kapasitas")
    @Expose
    private String kapasitas;
    @SerializedName("jenisBarang")
    @Expose
    private String jenisBarang;
    @SerializedName("hargaBagasi")
    @Expose
    private String hargaBagasi;
    @SerializedName("id_seller")
    @Expose
    private long idSeller;

    /**
     * No args constructor for use in serialization
     * 
     */
    public NitipPostLuggageRespon() {
    }

    /**
     * 
     * @param jenisBarang
     * @param tanggalBerangkat
     * @param jamTiba
     * @param tujuan
     * @param asal
     * @param hargaBagasi
     * @param createdAt
     * @param namaPenjual
     * @param idSeller
     * @param tanggalTiba
     * @param id
     * @param kapasitas
     * @param jamBerangkat
     * @param updatedAt
     */
    public NitipPostLuggageRespon(String createdAt, String updatedAt, long id, String namaPenjual, String asal, String tujuan, String tanggalBerangkat, String jamBerangkat, String tanggalTiba, String jamTiba, String kapasitas, String jenisBarang, String hargaBagasi, long idSeller) {
        super();
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.id = id;
        this.namaPenjual = namaPenjual;
        this.asal = asal;
        this.tujuan = tujuan;
        this.tanggalBerangkat = tanggalBerangkat;
        this.jamBerangkat = jamBerangkat;
        this.tanggalTiba = tanggalTiba;
        this.jamTiba = jamTiba;
        this.kapasitas = kapasitas;
        this.jenisBarang = jenisBarang;
        this.hargaBagasi = hargaBagasi;
        this.idSeller = idSeller;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNamaPenjual() {
        return namaPenjual;
    }

    public void setNamaPenjual(String namaPenjual) {
        this.namaPenjual = namaPenjual;
    }

    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public String getTanggalBerangkat() {
        return tanggalBerangkat;
    }

    public void setTanggalBerangkat(String tanggalBerangkat) {
        this.tanggalBerangkat = tanggalBerangkat;
    }

    public String getJamBerangkat() {
        return jamBerangkat;
    }

    public void setJamBerangkat(String jamBerangkat) {
        this.jamBerangkat = jamBerangkat;
    }

    public String getTanggalTiba() {
        return tanggalTiba;
    }

    public void setTanggalTiba(String tanggalTiba) {
        this.tanggalTiba = tanggalTiba;
    }

    public String getJamTiba() {
        return jamTiba;
    }

    public void setJamTiba(String jamTiba) {
        this.jamTiba = jamTiba;
    }

    public String getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(String kapasitas) {
        this.kapasitas = kapasitas;
    }

    public String getJenisBarang() {
        return jenisBarang;
    }

    public void setJenisBarang(String jenisBarang) {
        this.jenisBarang = jenisBarang;
    }

    public String getHargaBagasi() {
        return hargaBagasi;
    }

    public void setHargaBagasi(String hargaBagasi) {
        this.hargaBagasi = hargaBagasi;
    }

    public long getIdSeller() {
        return idSeller;
    }

    public void setIdSeller(long idSeller) {
        this.idSeller = idSeller;
    }

}
