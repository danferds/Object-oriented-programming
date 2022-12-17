package tamagotchi;

public class Pet {
    private int energyMax, hungryMax, cleanMax;
    private int energy, hungry, shower;
    private int diamonds;
    private int age;
    private boolean alive;
    
    public Pet(int energy, int hungry, int shower) {
        this.energyMax = energy;
        this.hungryMax = hungry; 
        this.cleanMax = shower;
        this.energy = this.energyMax;
        this.hungry = this.hungryMax;
        this.shower = this.cleanMax;
        this.diamonds = 0;
        this.age = 0;
        this.alive = true;
    }

    void setEnergy(int value) {
        if(value <= 0){
            this.energy = 0;
            System.out.println("fail: pet morreu de fraqueza");
            this.alive = false;
        }
        else if(value > this.energyMax)
            this.energy = this.energyMax;
        else
            this.energy = value;
    }

    public void setHungry(int value) {
        if(value <= 0) {
            this.hungry = 0;
            System.out.println("fail: pet morreu de fome");
            this.alive = false;
        } else if(value > this.hungryMax) 
            this.hungry = this.hungryMax;
        else
            this.hungry = value;
    }

    void setClean(int value) {
      if(value <= 0) {
        this.shower = 0;
        System.out.println("fail: pet morreu de sujeira");
        this.alive = false;
        } else if(value > this.cleanMax) 
            this.shower = this.cleanMax;
        else
            this.shower = value;
    }

    private boolean testAlive() {
        return (this.alive) ? true:false;
    }

    public void play(){
        if(testAlive()) {
            setEnergy(getEnergy() - 2);
            setHungry(getHungry() - 1);
            setClean(getClean() - 3);
            this.diamonds++;
            this.age++;
        } else
            System.out.println("fail: pet esta morto");

    }

    public void shower() {
        if(testAlive()) {
            setEnergy(getEnergy() - 3);
            setHungry(getHungry() - 1);
            setClean(getCleanMax());
            this.age += 2;
        } else
            System.out.println("fail: pet esta morto");
    }

    public void eat() {
        if(testAlive()) {
            setEnergy(getEnergy() - 1);
            setHungry(getHungry() + 4);
            setClean(getClean() - 2);
            this.age++;
        } else
            System.out.println("fail: pet esta morto");
    }

    public void sleep() {
        if(testAlive()) {
            if((getEnergyMax() - getEnergy()) < 5) {
                System.out.println("fail: nao esta com sono");
            } else {
                setEnergy(getEnergyMax());
                setHungry(getHungry() - 1);
                this.age += getEnergy() - getCleanMax();
            }
        } else {
            System.out.println("fail: pet esta morto");
        }
    }

    int getClean() { return this.shower; }
    int getHungry() {return this.hungry;}
    int getEnergy() {return this.energy;} 
    int getEnergyMax() {return this.energyMax;}
    int getCleanMax() {return this.cleanMax;}
    int getHungryMax() {return this.hungryMax;}
    int getDiamonds() { return this.diamonds; }
    int getAge() { return this.age; }

    public String toString() {
        return String.format("E:%d/%d, S:%d/%d, L:%d/%d, D:%d, I:%d", getEnergy(), getEnergyMax(), 
        getHungry(), getHungryMax(), getClean(), getCleanMax(), getDiamonds(), getAge());
    }
}