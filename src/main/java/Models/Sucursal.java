/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.ArrayList;

/**
 *
 * @author hfyh
 */
public class Sucursal {
    private Integer idSucursal;
    private String nombre;
    private String direccion;
    private Double porcentajeGananciaAdmin;
    private Double porcentajeGananciaSucursal;
    private String telefono;
    private Integer idAdmin;
    private boolean status;

    public Sucursal(Integer idSucursal, String nombre, String direccion, Double porcentajeGananciaAdmin, Double porcentajeGananciaSucursal, String telefono, Integer idAdmin, boolean status) {
        this.idSucursal = idSucursal;
        this.nombre = nombre;
        this.direccion = direccion;
        this.porcentajeGananciaAdmin = porcentajeGananciaAdmin;
        this.porcentajeGananciaSucursal = porcentajeGananciaSucursal;
        this.telefono = telefono;
        this.idAdmin = idAdmin;
        this.status = status;
    }

    public Integer getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(Integer idSucursal) {
        this.idSucursal = idSucursal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Double getPorcentajeGananciaAdmin() {
        return porcentajeGananciaAdmin;
    }

    public void setPorcentajeGananciaAdmin(Double porcentajeGananciaAdmin) {
        this.porcentajeGananciaAdmin = porcentajeGananciaAdmin;
    }

    public Double getPorcentajeGananciaSucursal() {
        return porcentajeGananciaSucursal;
    }

    public void setPorcentajeGananciaSucursal(Double porcentajeGananciaSucursal) {
        this.porcentajeGananciaSucursal = porcentajeGananciaSucursal;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Integer getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(Integer idAdmin) {
        this.idAdmin = idAdmin;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
