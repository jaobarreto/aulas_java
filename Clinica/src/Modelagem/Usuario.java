/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelagem;

import Controle.Conexao;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author jão
 */
public class Usuario {
    private int Codigo;
    private String nome;
    private String email;
    private String login;
    private String senha;
    private Conexao con = new Conexao();
    
    public Usuario() {
        this(0,"","","","");
    }

    public Usuario(int Codigo, String nome, String email, String login, String senha) {
        this.Codigo = Codigo;
        this.nome = nome;
        this.email = email;
        this.login = login;
        this.senha = senha;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public ResultSet logar(){
        ResultSet tabela;
        tabela = null;
        
        String sql = "select from usuario where login='" + getLogin() + " and senha=" + getSenha () + "";
        
        JOptionPane.showMessageDialog(null, sql);
        
        tabela = con.RetornarResultset (sql);
        
        return tabela;
}
    public void cadastrarUsuario(){           
      String sql= "Insert into usuarios(Nome,Email,Telefone,Senha)values "+
                "('"+ this.getCodigo()+"','"+this.getNome()+"','"+this.getEndereco()+"','"+ this.getComplemento()+"','"+ this.getRG()+"','"+ this.getCPF()+"','"+ this.getDataNascimento()+"' );
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registrado com sucesso"); 
}
}