package org.example;

public class Empleado {
    public int id;
    public String nombre;
    public int salario;

    public Empleado (String nombre,int salario,int id)
    {
        this.nombre=nombre;
        this.salario=salario;
        this.id=id;
    }
    public int getId(){
        return id;
    }
}
