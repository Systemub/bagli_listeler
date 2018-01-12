package test;

public class Test {
    Test ilk=null,son=null;
    Test next;
   
    Test(){}
    
    
    int sayi;
    
    
    Test(int sayi){
    this.sayi=sayi;
    
    }
    
    public void ekle(int gelen){
    Test t= new Test(gelen);
    if(ilk==null){
    ilk=t;
    son=t;
    
    }
    else{
    son.next=t;
    son=t;
    
    }
    }
    public void liste(){
        Test gecici=ilk;
    while(gecici!=null){
  
        System.out.println(gecici.sayi);
          gecici=gecici.next;
    
    }
 }
    
    
    
   
    public static void main(String[] args) {
        Test ref=new Test();
        ref.ekle(5);
        ref.ekle(10);
        ref.liste();
    }
    
}
