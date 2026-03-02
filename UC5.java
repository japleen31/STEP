public class UC5 {
    public static void main(String[] args) {
        
        String[] Star ={
        String.join(" ","   ***   "," ","   ***   "," ","******   "," ","   *****"),
        String.join(" "," **   ** "," "," **   ** "," ","**    ** "," "," **     "),
        String.join(" ","**     **"," ","**     **"," ","**     **"," ","**      "),
        String.join(" ","**     **"," ","**     **"," ","**    ** "," "," **     "),
        String.join(" ","**     **"," ","**     **"," ","******   "," ","  ***   "),
        String.join(" ","**     **"," ","**     **"," ","**       "," ","     ** "),
        String.join(" ","**     **"," ","**     **"," ","**       "," ","      **"),
        String.join(" "," **   ** "," "," **   ** "," ","**       "," ","     **"),
        String.join(" ","   ***   "," ","   ***   "," ","**       "," ","*****   ")
        };
    for (String line : Star) {
            System.out.println(line);
        }
    }
}
