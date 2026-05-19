package academy.devdojo.maratonajava.javacore.Ycolecoes.domain;

import java.util.Objects;

public class Manga implements Comparable<Manga> {
    private Long id;
    private String nome;
    private double preco;

    public Manga(Long id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Manga manga)) return false;
        return Double.compare(preco, manga.preco) == 0 && Objects.equals(id, manga.id) && Objects.equals(nome, manga.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, preco);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public int compareTo(Manga outroManga) {
        // negativo se o this < outroManga
        // se this == outroManga, return 0
        // positivo se this > outroManga
        if(this.id < outroManga.id) return -1;
        else if(this.id > outroManga.id) return 1;
        return 0;
    }
}
