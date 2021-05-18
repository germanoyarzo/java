package ejercicio4;

public class CuentaBanco {

    private int id;
    private String name;
    private double balance;

    public CuentaBanco(int id, String name, double balance){///metodo constructor

        this.id=id;
        this.name=name;
        this.balance=balance;
    }

    ///SETTERS Y GETTERS
    public int getId(){return id;}
    public String getName(){ return name;}
    public double getBalance(){ return balance;}

    public double credito(double deposito){
        this.balance=this.balance+deposito;
    return  balance;
    }

   public double debito(double extracion){
        if(this.balance<extracion)
        {
            System.out.println("Dinero insuficiente, ingrese otro importe a debitar");
        }else{

            this.balance=this.balance-extracion;

        }
       return this.balance;

   }


    @Override
    public String toString(){
        return  "\n ID: "+ this.id + "\n Name: "+ this.name+ "\n Balance: $" + this.balance;
    }

}
