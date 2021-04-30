
package com.cindodcindy.nitip.pojo.pojo_konfirm.pojo_get_confirm;

//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("jsonschema2pojo")
public class Content {

    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("updatedAt")
    @Expose
    private String updatedAt;
    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("orderConfirmation")
    @Expose
    private String orderConfirmation;
    @SerializedName("waktuPembayaran")
    @Expose
    private String waktuPembayaran;
    @SerializedName("namaAkun")
    @Expose
    private String namaAkun;
    @SerializedName("noRek")
    @Expose
    private String noRek;
    @SerializedName("jenisBank")
    @Expose
    private String jenisBank;
    @SerializedName("jumlahBayar")
    @Expose
    private String jumlahBayar;
    @SerializedName("lokasiJemputbarang")
    @Expose
    private String lokasiJemputbarang;
    @SerializedName("jamJemputBarang")
    @Expose
    private String jamJemputBarang;
    @SerializedName("estimasiSampai")
    @Expose
    private String estimasiSampai;
    @SerializedName("id_seller")
    @Expose
    private long idSeller;
    @SerializedName("id_buyer")
    @Expose
    private String idBuyer;
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

    /**
     * No args constructor for use in serialization
     * 
     */
    public Content() {
    }

    /**
     * 
     * @param waktuPembayaran
     * @param namaPenerima
     * @param jenisBarang
     * @param lokasiJemputbarang
     * @param createdAt
     * @param namaPenjual
     * @param jumlahBayar
     * @param idSeller
     * @param noRek
     * @param namaPembeli
     * @param kapasitasBarang
     * @param alamatPembeli
     * @param id
     * @param estimasiSampai
     * @param kapasitas
     * @param jamBerangkat
     * @param namaAkun
     * @param updatedAt
     * @param jenisBank
     * @param alamatPenerima
     * @param tanggalBerangkat
     * @param jamJemputBarang
     * @param jamTiba
     * @param tujuan
     * @param asal
     * @param hargaBagasi
     * @param jenisBarangKirim
     * @param idBuyer
     * @param orderConfirmation
     * @param tanggalTiba
     */
    public Content(String createdAt, String updatedAt, long id, String orderConfirmation, String waktuPembayaran, String namaAkun, String noRek, String jenisBank, String jumlahBayar, String lokasiJemputbarang, String jamJemputBarang, String estimasiSampai, long idSeller, String idBuyer, String namaPembeli, String alamatPembeli, String alamatPenerima, String namaPenerima, String jenisBarangKirim, String kapasitasBarang, String namaPenjual, String asal, String tujuan, String tanggalBerangkat, String jamBerangkat, String tanggalTiba, String jamTiba, String kapasitas, String jenisBarang, String hargaBagasi) {
        super();
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.id = id;
        this.orderConfirmation = orderConfirmation;
        this.waktuPembayaran = waktuPembayaran;
        this.namaAkun = namaAkun;
        this.noRek = noRek;
        this.jenisBank = jenisBank;
        this.jumlahBayar = jumlahBayar;
        this.lokasiJemputbarang = lokasiJemputbarang;
        this.jamJemputBarang = jamJemputBarang;
        this.estimasiSampai = estimasiSampai;
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

    public String getOrderConfirmation() {
        return orderConfirmation;
    }

    public void setOrderConfirmation(String orderConfirmation) {
        this.orderConfirmation = orderConfirmation;
    }

    public String getWaktuPembayaran() {
        return waktuPembayaran;
    }

    public void setWaktuPembayaran(String waktuPembayaran) {
        this.waktuPembayaran = waktuPembayaran;
    }

    public String getNamaAkun() {
        return namaAkun;
    }

    public void setNamaAkun(String namaAkun) {
        this.namaAkun = namaAkun;
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

    public String getJumlahBayar() {
        return jumlahBayar;
    }

    public void setJumlahBayar(String jumlahBayar) {
        this.jumlahBayar = jumlahBayar;
    }

    public String getLokasiJemputbarang() {
        return lokasiJemputbarang;
    }

    public void setLokasiJemputbarang(String lokasiJemputbarang) {
        this.lokasiJemputbarang = lokasiJemputbarang;
    }

    public String getJamJemputBarang() {
        return jamJemputBarang;
    }

    public void setJamJemputBarang(String jamJemputBarang) {
        this.jamJemputBarang = jamJemputBarang;
    }

    public String getEstimasiSampai() {
        return estimasiSampai;
    }

    public void setEstimasiSampai(String estimasiSampai) {
        this.estimasiSampai = estimasiSampai;
    }

    public long getIdSeller() {
        return idSeller;
    }

    public void setIdSeller(long idSeller) {
        this.idSeller = idSeller;
    }

    public String getIdBuyer() {
        return idBuyer;
    }

    public void setIdBuyer(String idBuyer) {
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

}
