package OOPsesi6.BangunDatar;

public abstract class BangunDatar {
    
String warna;
String getname(){
    return warna;

}

void setwarna (String warna){

    this.warna= warna;
}

abstract float getLuas();

}
