package org.example;

public class Tabla {

    Empleado[] T;

    public Tabla(){
        this.T=new Empleado[1000];
    }

    public void insertar(Empleado empleado){
        T[multiplicacion(empleado.id)]=empleado;
    }

    public int multiplicacion (int x){
        //System.out.println("clave ingresada: "+x);
        double mult,resta,copy;
        int rtado;
        mult=0.6180334*x;
        //System.out.println("rtado multiplicacion: "+mult);
        copy=(int)Math.floor(mult);
        resta=(mult-copy);
        resta=resta*1000;
        //System.out.println("rtado resta: "+resta);
        rtado=(int)Math.floor(resta);
        //System.out.println("Clave transformada: "+rtado);
        return rtado;
    }

    public void muestra(){
        System.out.println("             -- E M P L E A D O S --");
        for (int i=0;i<T.length;i++){
            if(T[i]!=null)
            {
                System.out.println("El empleado se ubico en la posicion: "+i+ " y su clave era : "+T[i].getId());
            }
        }
    }

}
