package model;

public class Room {
    public int name;
    public String type;
    public int price;

    public Room(int name, String type, int price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Room{" +
                "name=" + name +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}

