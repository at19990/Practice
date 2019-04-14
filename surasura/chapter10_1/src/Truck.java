final class Truck extends Car {
    private int payload = 0;
    
    int getPayload(){
        return this.payload;
    }
    
    void addPayload(int value){
        this.payload += value;
    }
    
    void deletePayload(int value){
        this.payload -= value;
    }
}