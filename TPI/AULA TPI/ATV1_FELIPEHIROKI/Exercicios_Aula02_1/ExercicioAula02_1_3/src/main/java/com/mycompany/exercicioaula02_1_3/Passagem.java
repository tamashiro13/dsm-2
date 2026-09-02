/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicioaula02_1_3;
import javax.swing.JOptionPane;
/**
 *
 * @author fatec-dsm2
 */
public class Passagem {
    private String nomePassageiro;
    private String telefone;
    private String rg;
    
    private String localViagem;
    private String data;
    private String horario;
    private String numPoltrona;
    public String getNomePassageiro() {
        return nomePassageiro;
    }
    public void setNomePassageiro(String nomePassageiro) {
        this.nomePassageiro = nomePassageiro;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getLocalViagem() {
        return localViagem;
    }
    public void setLocalViagem(String localViagem) {
        this.localViagem = localViagem;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public String getNumPoltrona() {
        return numPoltrona;
    }
    public void setNumPoltrona(String numPoltrona) {
        this.numPoltrona = numPoltrona;
    }
    public void cadastrarDadosPassageiro(){
        setNomePassageiro (JOptionPane.showInputDialog("Digite o nome do passageiro: "));
        setTelefone (JOptionPane.showInputDialog("Digite o telefone do passageiro: "));
        setRg (JOptionPane.showInputDialog("Digite o rg do passageiro: "));
    }
    public void cadastrarDadosPassagem(){
        setLocalViagem (JOptionPane.showInputDialog("Digite o local da viagem:"));
        setData (JOptionPane.showInputDialog("Digite a data da viagem: "));
        setHorario (JOptionPane.showInputDialog("Digite o horário da viagem: "));
        setNumPoltrona (JOptionPane.showInputDialog("Digite o número da poltrona: "));
    }
    public String mostrarDadosPassageiro() {
        return "Nome: " + getNomePassageiro() + "\n" +
               "Telefone: " + getTelefone() + "\n" +
               "RG: " + getRg();
    }
    public void mostrarDadosPassagem() {
        JOptionPane.showMessageDialog(null, 
               "Local: " + getLocalViagem() + "\n" +
               "Data: " + getData() + "\n" +
               "Horário: " + getHorario() + "\n" +
               "Número Poltrona: " + getNumPoltrona());
    }
}