package javasemana21;

public class Venta {
    
    /***************
     *  ATRIBUTOS  *
     ***************/
    
    String  cod,
            nom;
    double  precio;
    int     cant,
            tv;
    
    /*******************
    *  CONSTRUCTORES  *
    *******************/
    
    public Venta(String cod,String nom,double precio,int cant,int tv)
    {  this.cod=cod;
       this.nom=nom;
       this.precio=precio;
       this.cant=cant;  
       this.tv=tv;
    }

    /***************
    *  FUNCIONES  *
    ***************/
    
    public double calculaimporte()
    {
        double impor;
        impor=precio*cant;
        return impor;
    }
    public double calculointeres()
    {  double interes;
         if(tv==0)
             interes=0.15*calculaimporte();
         else
             interes=0;
         return interes;
    }
    public double calculodescuento()
    {  double  descuento;
          if(tv==1)
              descuento=0.12*calculaimporte();
          else
              descuento=0;
          return descuento;
    }
    public double calculopago()
    {    double pago;
            pago=calculaimporte()+calculointeres()-calculodescuento();
            return pago;
    }
}
