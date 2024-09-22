package me.lucas.srp.depois;

public class PessoaFormatador {
    public String formatarNomeEmail(Pessoa pessoa) {
        return pessoa.getNome() + " - " + pessoa.getEmail();
    }
}
