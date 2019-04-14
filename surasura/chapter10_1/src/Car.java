class Car {
    private int speed;
    
    Car() {
        this.speed = 0;
    }
        
    int getSpeed(){
        return this.speed;
    }
    
    void speedUp(int value){
        this.speed += value;
    }
    
    void speedDown(int value){
        this.speed -= value;
    }
    
}