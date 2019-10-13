class Band {
    int id;
    String nama_band;
    String genre;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama_band() {
        return nama_band;
    }

    public void setNama_band(String nama_band) {
        this.nama_band = nama_band;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return id + ", " + nama_band + ", " + genre;
    }

    


}