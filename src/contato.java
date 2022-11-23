public class contato {
    private Integer cid;
    private String nome;
    private String sobrenome;
    private String grupoc;
    private String telefone;
    private String email;
    private String endereco;
    private byte[] foto;
    private int uid;

    
    public contato() {}

   
    public contato(Integer cid, String nome, String sobrenome, String grupoc, String telefone, String email, String endereco, byte[] foto, int uid) {
        this.cid = cid;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.grupoc = grupoc;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.foto = foto;
        this.uid = uid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getGrupoc() {
        return grupoc;
    }

    public void setGrupoc(String grupoc) {
        this.grupoc = grupoc;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }
    
    
    
    
    
}
