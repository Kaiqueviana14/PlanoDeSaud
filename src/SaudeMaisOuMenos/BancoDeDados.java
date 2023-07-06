package SaudeMaisOuMenos;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BancoDeDados{
    
   
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Dependente> dependentes = new ArrayList<>();
    private ArrayList<Especialidade> especialidades = new ArrayList<>();
    private ArrayList<Usuario> usuario = new ArrayList<>();
    private ArrayList<PlanoSaude> listaplanosSaudes = new ArrayList<>();
    private ArrayList<Double> salarios = new ArrayList<>();
    private ArrayList<String> planos  = new ArrayList<>();
    private ArrayList<Gerente> gerentes = new ArrayList<>();
    private ArrayList<Vendedor> vendedor = new ArrayList<>();
    private ArrayList<Atendente> atendente = new ArrayList<>();

    public ArrayList<Gerente> getGerentes() {
        return gerentes;
    }

    public void setGerentes(ArrayList<Gerente> gerentes) {
        this.gerentes = gerentes;
    }

    public ArrayList<Vendedor> getVendedor() {
        return vendedor;
    }

    public void setVendedor(ArrayList<Vendedor> vendedor) {
        this.vendedor = vendedor;
    }

    public ArrayList<Atendente> getAtendente() {
        return atendente;
    }

    public void setAtendente(ArrayList<Atendente> atendente) {
        this.atendente = atendente;
    }

   
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Dependente> getDependentes() {
        return dependentes;
    }

    public void setDependentes(ArrayList<Dependente> dependentes) {
        this.dependentes = dependentes;
    }

    public ArrayList<Especialidade> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(ArrayList<Especialidade> especialidades) {
        this.especialidades = especialidades;
    }

    public ArrayList<Usuario> getUsuario() {
        return usuario;
    }

    public void setUsuario(ArrayList<Usuario> usuario) {
        this.usuario = usuario;
    }

    public ArrayList<PlanoSaude> getListaplanosSaudes() {
        return listaplanosSaudes;
    }

    public void setListaplanosSaudes(ArrayList<PlanoSaude> listaplanosSaudes) {
        this.listaplanosSaudes = listaplanosSaudes;
    }

    public ArrayList<Double> getSalarios() {
        return salarios;
    }

    public void setSalarios(ArrayList<Double> salarios) {
        this.salarios = salarios;
    }

    public ArrayList<String> getPlanos() {
        return planos;
    }

    public void setPlanos(ArrayList<String> planos) {
        this.planos = planos;
    }

   
}

