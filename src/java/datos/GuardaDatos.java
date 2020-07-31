/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author patri
 */
public class GuardaDatos {
    
 private String gerencia;
 private String departamento;
 private String area;
 private String encargado;
 private String requerimineto;

    public GuardaDatos(String gerencia, String departamento, String area, String encargado, String requerimineto) {
        this.gerencia = gerencia;
        this.departamento = departamento;
        this.area = area;
        this.encargado = encargado;
        this.requerimineto = requerimineto;
    }

    public String getGerencia() {
        return gerencia;
    }

    public void setGerencia(String gerencia) {
        this.gerencia = gerencia;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public String getRequerimineto() {
        return requerimineto;
    }

    public void setRequerimineto(String requerimineto) {
        this.requerimineto = requerimineto;
    }

 
}
