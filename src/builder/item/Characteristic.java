package builder.item;


public class Characteristic {
    private String brand;
    private String color;
    private String ram;
    private String cpu;
    private String os;
    private String weight;
    private String memory;
    private String memoryType;
    private String battery;
    private String body;
    private String wheel;

    private Characteristic(Builder builder) {
        this.brand = builder.brand;
        this.ram = builder.ram;
        this.wheel = builder.wheel;
    }
    public static Builder builder() {
        return  new Builder();
    }
   public static class Builder {
       private String brand;
       private String ram;
       private String wheel;

       //сетеры
       public Builder brand(String brand) {
           this.brand = brand;
           return this;
       }
       public Builder ram(String ram) {
           this.ram = ram;
           return this;
       }
       public Builder wheel(String wheel) {
           this.wheel = wheel;
           return this;
       }
       public Characteristic build() {
           return new Characteristic(this);
       }

   }

    @Override
    public String toString() {
        return "Characteristic{" +
                "brand='" + brand + '\'' +
                ", ram='" + ram + '\'' +
                ", wheel='" + wheel + '\'' +
                '}';
    }
}
