package br.com.zupacademy.kevin.transacoes.kafka.record;

public class CartaoRecord {
    private String id;
    private String email;

    public CartaoRecord(String id, String email) {
        this.id = id;
        this.email = email;
    }

    @Deprecated
    public CartaoRecord() {
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Cartao{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
