public class SensorActuador 
{
    private int Temperatura;
    private int minTemp;
    private int maxTemp;
    
    public SensorActuador(int temp, int min, int max){
        this.Temperatura = temp;
        this.minTemp = min;
        this.maxTemp = max;
    }
    
    public int getTemperatura(){
       return this.Temperatura;
    }
    
    public void disminuirTemp(int i){
        if (this.Temperatura - 1 >= this.minTemp){
            this.Temperatura -=i;
        }
    }
    
    public void aumentarTemp(int i){
        if (this.Temperatura + 1 < this.minTemp){
            this.Temperatura +=i;
        }
    }
}