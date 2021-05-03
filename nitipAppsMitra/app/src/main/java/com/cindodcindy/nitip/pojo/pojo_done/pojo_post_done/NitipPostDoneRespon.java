
package com.cindodcindy.nitip.pojo.pojo_done.pojo_post_done;

//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("jsonschema2pojo")
public class NitipPostDoneRespon {

    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("updatedAt")
    @Expose
    private String updatedAt;
    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("tanggalBarangTiba")
    @Expose
    private String tanggalBarangTiba;
    @SerializedName("diterimaOleh")
    @Expose
    private String diterimaOleh;
    @SerializedName("lokasiBarangDiterima")
    @Expose
    private String lokasiBarangDiterima;
    @SerializedName("idSeller")
    @Expose
    private long idSeller;
    @SerializedName("idBuyer")
    @Expose
    private long idBuyer;
    @SerializedName("namaPembeli")
    @Expose
    private String namaPembeli;
    @SerializedName("alamatPembeli")
    @Expose
    private String alamatPembeli;
    @SerializedName("alamatPenerima")
    @Expose
    private String alamatPenerima;
    @SerializedName("namaPenerima")
    @Expose
    private String namaPenerima;
    @SerializedName("jenisBarangKirim")
    @Expose
    private String jenisBarangKirim;
    @SerializedName("kapasitasBarang")
    @Expose
    private String kapasitasBarang;
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
    @SerializedName("noRek")
    @Expose
    private String noRek;
    @SerializedName("jenisBank")
    @Expose
    private String jenisBank;
    @SerializedName("bankPengirim")
    @Expose
    private String bankPengirim;
    @SerializedName("tanggalTransfer")
    @Expose
    private String tanggalTransfer;
    @SerializedName("penerimaAn")
    @Expose
    private Object penerimaAn;
    @SerializedName("pengirimAn")
    @Expose
    private Object pengirimAn;

    /**
     * No args constructor for use in serialization
     * 
     */
    public NitipPostDoneRespon() {
    }

    /**
     * 
     * @param bankPengirim
     * @param namaPenerima
     * @param jenisBarang
     * @param diterimaOleh
     * @param createdAt
     * @param namaPenjual
     * @param tanggalTransfer
     * @param idSeller
     * @param noRek
     * @param namaPembeli
     * @param kapasitasBarang
     * @param alamatPembeli
     * @param id
     * @param kapasitas
     * @param jamBerangkat
     * @param updatedAt
     * @param pengirimAn
     * @param alamatPenerima
     * @param jenisBank
     * @param tanggalBerangkat
     * @param jamTiba
     * @param tanggalBarangTiba
     * @param tujuan
     * @param asal
     * @param hargaBagasi
     * @param lokasiBarangDiterima
     * @param jenisBarangKirim
     * @param idBuyer
     * @param tanggalTiba
     * @param penerimaAn
     */
    public NitipPostDoneRespon(String createdAt, String updatedAt, long id, String tanggalBarangTiba, String diterimaOleh, String lokasiBarangDiterima, long idSeller, long idBuyer, String namaPembeli, String alamatPembeli, String alamatPenerima, String namaPenerima, String jenisBarangKirim, String kapasitasBarang, String namaPenjual, String asal, String tujuan, String tanggalBerangkat, String jamBerangkat, String tanggalTiba, String jamTiba, String kapasitas, String jenisBarang, String hargaBagasi, String noRek, String jenisBank, String bankPengirim, String tanggalTransfer, Object penerimaAn, Object pengirimAn) {
        super();
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.id = id;
        this.tanggalBarangTiba = tanggalBarangTiba;
        this.diterimaOleh = diterimaOleh;
        this.lokasiBarangDiterima = lokasiBarangDiterima;
        this.idSeller = idSeller;
        this.idBuyer = idBuyer;
        this.namaPembeli = namaPembeli;
        this.alamatPembeli = alamatPembeli;
        this.alamatPenerima = alamatPenerima;
        this.namaPenerima = namaPenerima;
        this.jenisBarangKirim = jenisBarangKirim;
        this.kapasitasBarang = kapasitasBarang;
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
        this.noRek = noRek;
        this.jenisBank = jenisBank;
        this.bankPengirim = bankPengirim;
        this.tanggalTransfer = tanggalTransfer;
        this.penerimaAn = penerimaAn;
        this.pengirimAn = pengirimAn;
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

    public String getTanggalBarangTiba() {
        return tanggalBarangTiba;
    }

    public void setTanggalBarangTiba(String tanggalBarangTiba) {
        this.tanggalBarangTiba = tanggalBarangTiba;
    }

    public String getDiterimaOleh() {
        return diterimaOleh;
    }

    public void setDiterimaOleh(String diterimaOleh) {
        this.diterimaOleh = diterimaOleh;
    }

    public String getLokasiBarangDiterima() {
        return lokasiBarangDiterima;
    }

    public void setLokasiBarangDiterima(String lokasiBarangDiterima) {
        this.lokasiBarangDiterima = lokasiBarangDiterima;
    }

    public long getIdSeller() {
        return idSeller;
    }

    public void setIdSeller(long idSeller) {
        this.idSeller = idSeller;
    }

    public long getIdBuyer() {
        return idBuyer;
    }

    public void setIdBuyer(long idBuyer) {
        this.idBuyer = idBuyer;
    }

    public String getNamaPembeli() {
        return namaPembeli;
    }

    public void setNamaPembeli(String namaPembeli) {
        this.namaPembeli = namaPembeli;
    }

    public String getAlamatPembeli() {
        return alamatPembeli;
    }

    public void setAlamatPembeli(String alamatPembeli) {
        this.alamatPembeli = alamatPembeli;
    }

    public String getAlamatPenerima() {
        return alamatPenerima;
    }

    public void setAlamatPenerima(String alamatPenerima) {
        this.alamatPenerima = alamatPenerima;
    }

    public String getNamaPenerima() {
        return namaPenerima;
    }

    public void setNamaPenerima(String namaPenerima) {
        this.namaPenerima = namaPenerima;
    }

    public String getJenisBarangKirim() {
        return jenisBarangKirim;
    }

    public void setJenisBarangKirim(String jenisBarangKirim) {
        this.jenisBarangKirim = jenisBarangKirim;
    }

    public String getKapasitasBarang() {
        return kapasitasBarang;
    }

    public void setKapasitasBarang(String kapasitasBarang) {
        this.kapasitasBarang = kapasitasBarang;
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

    public String getNoRek() {
        return noRek;
    }

    public void setNoRek(String noRek) {
        this.noRek = noRek;
    }

    public String getJenisBank() {
        return jenisBank;
    }

    public void setJenisBank(String jenisBank) {
        this.jenisBank = jenisBank;
    }

    public String getBankPengirim() {
        return bankPengirim;
    }

    public void setBankPengirim(String bankPengirim) {
        this.bankPengirim = bankPengirim;
    }

    public String getTanggalTransfer() {
        return tanggalTransfer;
    }

    public void setTanggalTransfer(String tanggalTransfer) {
        this.tanggalTransfer = tanggalTransfer;
    }

    public Object getPenerimaAn() {
        return penerimaAn;
    }

    public void setPenerimaAn(Object penerimaAn) {
        this.penerimaAn = penerimaAn;
    }

    public Object getPengirimAn() {
        return pengirimAn;
    }

    public void setPengirimAn(Object pengirimAn) {
        this.pengirimAn = pengirimAn;
    }

}
