package com.devbycm.hdoj1004;

import java.util.*;

/**
 * @author Centimitr
 */
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        List<String> list = new ArrayList<String>();

        while(in.hasNext()){
            int num = in.nextInt();
            if(num==0){break;}
            //read
            for(int i=0;i<num;i++){
                list.add(in.next());
            }
            //sort
            Collections.sort(list);
            //getmost
            String mostname = list.get(0);
            int mostnum = 1;
            String curname ="";
            int curnum = 0;
            Iterator<String> iterator = list.iterator();
            while (iterator.hasNext()){
                String iteratorName = iterator.next();
                if(iteratorName.equals(curname)){
                    curnum++;
                    if(curnum>mostnum){
                        mostnum=curnum;
                        mostname = iteratorName;
                    }
                }
                else {
                    curname = iteratorName;
                    curnum=1;
                }
            }
            System.out.println(mostname);
            list.clear();
        }
    }
}
