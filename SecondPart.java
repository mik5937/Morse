package TmpPack;

import java.util.HashSet;
import java.util.Iterator;

class SecondPart{
    static HashSet<Statistics> hs = new HashSet<Statistics>();
    static void add(char ch){
        Statistics tmp = new Statistics(ch);
        if(!hs.contains(tmp)){
            hs.add(tmp);
        }
    }
    static HashSet<Statistics> getStatistics(){
        return hs;
    }
    static void printStatistics(){
        Iterator<Statistics> i = hs.iterator();
        while (i.hasNext()){
            Statistics tmp = i.next();
            System.out.println(tmp.print());
        }
    }
}