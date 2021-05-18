package ejercicio5;

public class Hora {
    private int hour;
    private int min;
    private int second;

    public Hora(int hour, int min, int second) {
        this.hour=(hour>=0 && hour<=23) ?hour: 0;// operador ternario, devuelve hora si cumple la condicion sino devuelve falso
        this.min=(min>=0 && min<=23) ?min: 0;// operador ternario, devuelve hora si cumple la condicion sino devuelve falso
        this.second=(second>=0 && second<=23) ?second: 0;// operador ternario, devuelve hora si cumple la condicion sino devuelve falso

       /// IS THE SAME THAT OPERADOR TERNARIO
        /*if (hour >= 0 && hour < 24) {
            this.hour = hour;
        } else {
            this.hour = 0; // arranca en 0 si la hora es distinta
        }
        if (min >= 0 && min < 60) {
            this.min = min;
        } else {
            this.min = 00;
        }
        if (second >= 0 && second < 60) {
            this.second = second;
        } else {
            this.second = 0;
        }*/
    }


   /// 2. Un método que avance en 1 segundo y devuelva la instancia del objeto
    private void sumarHour(){
        if(this.hour==23){
            this.hour=0;
        }else{
            this.hour++;
        }
    }
    private void sumarMin(){
        if(this.hour==59){
            this.min=0;
            sumarHour();
        }else {
            this.min++;
        }
    }
    public Hora sumarSeg(){
        if(this.second==59){
            this.second=0;
            sumarMin();
        }else{
            this.second++;
        }
        return this;
    }


    ///3. Un método que retroceda en 1 segundo y devuelva la instancia del objeto.
    private void restarHour(){
        if(this.hour==23){
            this.hour=0;
        }else{
            this.hour--;//  rest a second;
        }
    }
    private void restarMin(){
        if(this.min==59){
            this.min=0;
        }else{
            this.min--;//  rest a second;
        }
    }

    public Hora restarSeg(){
        if(this.second==59){
            this.second=0;
            restarSeg();
        }else{
            this.second--;
        }
        return this;
    }


    ///Getters
    public int getHour(){return hour;}
    public int getMin(){return min;}
    public int getSecond(){return second;}

    @Override
    public String toString(){

        String hh = String.format("%02d", hour);/// FORMAT TO 01 HOUR, 01 MIN 01 SECOND
        String mm = String.format("%02d", min);
        String ss = String.format("%02d", second);
        return " "+ hh+" : " + mm+ " : "+ ss;}

}
