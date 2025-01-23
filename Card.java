package CardApp1;
    

public class Card {
    int num[][] = new int[4][13];
    String[] mark = {"スペード","ハート","ダイヤ","クローバー"};
    int count,number,random_mark,random_num,result;
    boolean isUnique = true;

    void draw(){
        
        for (int i=0; i<4; i++){
            count=0;
            while (count<13) {
                number=(int)(Math.random()*13)+1;
                for (int j=0; j<count; j++){
                    if (num[i][j] == number){
                        isUnique = false;
                        break;}
                    else{
                        isUnique = true;}
                }
                if (isUnique == true){
                    num[i][count] = number;
                    count++;
                }
            }
        }
        random_mark=(int)(Math.random()*4);
        random_num=(int)(Math.random()*13);
        System.out.println("ランダムに選ばれたカード");
        System.out.println(mark[random_mark]+" : "+num[random_mark][random_num]);
        result=num[random_mark][random_num];
    }
}
