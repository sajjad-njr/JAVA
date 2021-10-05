package oop;

abstract class Abstract_demo {
    int price;
    String name;
    Abstract_demo()
    {

    }
    Abstract_demo(int i , String s)
    {
        this.price = i;
        this.name = s;
    }
    abstract  void speedLimit();
}
