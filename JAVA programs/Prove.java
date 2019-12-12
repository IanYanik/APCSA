public class Prove {
private boolean [] [] lights = new boolean[10][10];
//private boolean [] [] lights = { {true,false,true,false,true}
//                               {true,false,true,false,true}};
public static void main(String[] args) {
        //boolean [] [] lights = new boolean[10][10];
        //Prove e = new Prove();
        //e.setter();
        Prove d = new Prove();
        System.out.println(d.evaluateLight(1,1));
}
public void setter(){
lights[1][1] = true;
lights[1][2] = true;
lights[1][3] = true;
//lights[1][4] = true;



}
public boolean evaluateLight(int row, int col){
boolean [] [] lights = new boolean[10][10];
lights[1][1] = true;
lights[1][2] = true;
lights[1][3] = true;
lights[1][4] = true;
int tick = 0;
int numTrue = -1;
int numFalse = 0;
while(tick < lights.length){
if(lights[row][tick]==true){
numTrue++;
}
else{
numFalse++;
}
tick++;
}
if(lights[row][col]==true){
try{
double her = numTrue/2;
int him = her;
}
catch(Exception e){
return true;
}
return false;
}
else{
try{
int x = numTrue/3;
}
catch(Exception e){
return lights[row][col];
}
return true;
}

}
}
