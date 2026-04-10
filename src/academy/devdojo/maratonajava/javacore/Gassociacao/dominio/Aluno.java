package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno(String nome, int idade, Seminario seminario) {
        this(nome, idade);
        this.seminario = seminario;
    }

    public void imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (this.seminario != null) {
            System.out.println("Seminário: " + this.seminario.getTitulo());
            System.out.println("Local: " + this.seminario.getLocal().getEndereco());
            if(this.seminario.getAlunos() != null){
                System.out.println("Inscritos:");
                for(Aluno aluno : this.seminario.getAlunos()){
                    aluno.imprime();
                }
            }

        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
