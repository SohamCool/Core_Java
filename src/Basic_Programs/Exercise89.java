package Basic_Programs;

public class Exercise89 {
    static{
        try{
            int b =250/0;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        //throw new Exception("Exception occured");
    }
    public static void main(String[] args) throws Exception {
        throw new Exception("Exception");
    }
}
