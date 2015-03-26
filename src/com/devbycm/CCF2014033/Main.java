package com.devbycm.CCF2014033;

import java.util.*;

/**
 * @author Centimitr
 */
public class Main {
    public static void main(String[] args){
        new Main().run();
    }
    public void run(){
        Scanner in = new Scanner(System.in);
        //record type
        String arg = in.next()+" ";
        TreeSet<String> notHasParamSet = new TreeSet<String>();
        TreeSet<String> hasParamSet = new TreeSet<String>();
        for (int i=0;i<arg.length()-1;i++){
            if (arg.charAt(i)!=':'){
                if (arg.charAt(i+1)==':'){
                    hasParamSet.add(arg.charAt(i)+"");
                }else {
                    notHasParamSet.add(arg.charAt(i)+"");
                }
            }
        }
        //read
        int N = in.nextInt();
        in.next();
        for (int i=0;i<N;i++){
            String command = in.nextLine();
            //collect args
            TreeMap<String,String> map = new TreeMap<String,String>();
            Scanner lin = new Scanner(command);
            while (lin.hasNext()){
                String curStr = lin.next();
                if (curStr.equals("ls"))continue;
                else if (curStr.charAt(0)=='-'&&curStr.length()>1){
                    if (hasParamSet.contains(curStr.charAt(1)+"")){
                        if (lin.hasNext()){
                            String nextStr =lin.next();
                            if (nextStr.charAt(0)=='-'&&nextStr.length()>1){
                                map.put(nextStr.charAt(1)+"","no");
                            }else {
                                map.put(curStr.charAt(1)+"",nextStr);
                            }
                        }
                    }else if (notHasParamSet.contains(curStr.charAt(1)+"")){
                        map.put(curStr.charAt(1)+"","no");
                    }else{
                        break;
                    }
                }else{
                        break;
                }
            }
            //output
            System.out.printf("Case "+(i+1)+":");
            Iterator it = map.keySet().iterator();
            while (it.hasNext()){
                String key = it.next()+"";
                if (notHasParamSet.contains(key)){
                    System.out.printf(" -%s",key);
                }else if (hasParamSet.contains(key)){
                    System.out.printf(" -%s %s",key,map.get(key));
                }
            }
            System.out.println();
        }
    }
}
