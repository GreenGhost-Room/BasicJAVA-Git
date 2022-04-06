class Box{
    int x;
    public Box(int x){
        this.x=x;
    }
}
class Box2 extends Box{
    int y;
    public Box2(int x,int y){
        super(x);
        this.y=y;

    }

}
class Box3 extends Box2{
    int z;
    public Box3(int x,int y,int z){
        super(x,y);
        this.z=z;
        System.out.printf("%d%d%d",x,y,z);
    }
    public void Volume(){
        int v;
        v=x*y*z;
        System.out.println("volume: "+v);
    }
}
public class voulmeBox {
    public static void main(String[] args) {
        Box3 b=new Box3(2, 3, 4);
        b.Volume();
       
        
    }
    
}
