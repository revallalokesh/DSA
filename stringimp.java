public class stringimp {
    public static void main(String[] args) {
        String gg = "zZSDSDFSd";
        StringBuilder kk = new StringBuilder(gg);
        StringBuilder mm = new StringBuilder();
        String ans = kk.reverse().toString();
        for(int i=0;i<ans.length();i++){
            char ch = ans.charAt(i);
            if(ch == 'Z'){
                mm.append('A');
            } else if(ch == 'z'){
                mm.append('a');
            } else {
                mm.append((char)(ch+1));
            }
        }
        System.out.println(mm.toString());
    }
}
