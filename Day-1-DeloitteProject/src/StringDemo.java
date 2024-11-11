public class StringDemo {
    public static void main(String[] args) {
        String str="CloudThat"; //Refer String
        str=str +"Training";  //create a new string

        System.out.println(str);


        String str2 ="CloudThat" ;//refer the same object
        String str1=new String("CloudThat"); //Crate anew object
        String str3=new String("CloudThat");//another new objects for you in heap memory

        System.out.println("str is equal to str3" + str.equals(str3)); //check the content
        System.out.println("str3 value is equal to str1" +str3.equals(str1)); // check the content

        System.out.println("str3==str1" +(str3==str1));//It will check heap memory
        System.out.println(("str==str2" +(str==str2))); //check the memory

    }




}
