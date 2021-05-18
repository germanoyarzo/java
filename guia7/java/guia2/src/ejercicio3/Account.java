package ejercicio3;
import java.util.UUID;

public class Account {

    private UUID uuid;
    private double balance;
    private Client2 client;
    private int contOperation=0;
    private String operations[]= new String[10];

    public Account(double balance, Client2 client)
    {
        this.uuid= UUID.randomUUID();
        this.balance=balance;
        this.client=client;

    }

    ///region GETTERS and SETTERS

    public UUID getUuid(){
        return uuid;
    }
    public double getBalance(){
        return balance;
    }
    public Client2 getClient(){
        return client;
    }
    public void setUuid(UUID uuid){
        this.uuid=uuid;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public void setClient(Client2 client){
        this.client=client;
    }
    public int getContaOperation() {
        return contOperation;
    }

    public String[] getOperations() {
        return operations;
    }
    ///endregion

    public double deposit(double deposito){

        if(this.contOperation==10){
            this.contOperation=0;
        }
            this.operations[contOperation]=" The client "+ client+ "deposit: $ \n"+ deposito;
        System.out.println(operations[contOperation]);
            this.contOperation++;


        return  this.balance=this.balance+deposito;
    }
  ///TODO revisar
    public double extraction(double extraction){

            double tempBalance = this.balance-extraction;
            if( tempBalance >= -2000)
            {
                this.balance=this.balance-extraction;
                if(this.contOperation==10){
                    this.contOperation=0; /// si es igual a 10 o mayor comienzo desde 0

                }

                    operations[contOperation]=" The client"+ this.client+ "extract : $"+ extraction;
                System.out.println(operations[contOperation]);
                   this.contOperation++; ///


            }else
            {
                System.out.println("Insufficient balance \n");
            }


        return this.balance;
    }


    @Override
    public String toString(){
        return "\n ID: "+uuid.toString().substring(0,10)+
                "\n Balance: $"+ this.balance+
                "\n Client: "+this.client;


    }

}

