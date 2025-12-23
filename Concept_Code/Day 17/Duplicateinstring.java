public class Duplicateinstring {
    public static void removeDuplicates(String str, int index, StringBuilder newstr, boolean map[])
    {
        if(index==str.length())
        {
            System.out.println(newstr);
            return;
        }
        char ch=str.charAt(index);
        if(map[ch-'a']== true)
        {
            removeDuplicates(str, index+1, newstr, map);
        }
        else{
            map[ch-'a']= true;
            removeDuplicates(str, index+1, newstr.append(ch), map);
        }

    }
    public static void main(String[] args) {
        String str ="apnnnaacollleggeee";
        StringBuilder sb = new StringBuilder("");
        removeDuplicates(str, 0, sb, new boolean [26]);
        
    }
    
}
