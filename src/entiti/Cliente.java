package entiti;

public abstract class Cliente extends Usuario {
    private String identificador;

    public Cliente(String nome, String email, String senha, String id) {
        super(nome, email, senha);
        this.setIdentificador(id);
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getIdentificador() {
        return identificador;
    }

    @Override
    public String toString() {
        return "Cliente " + getNome() + " <" + getEmail() + "> ";
    }
}
