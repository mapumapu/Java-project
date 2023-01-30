public class TipeDataBukanPrimitif {
    public static void main(String[] args) {

        //non primitive datatype
        Integer thisInteger = 100;
        Byte thisByte = 101;
        Long thisLong = null;

        System.out.println(thisLong);

        //convert primitive datatype to non primitive

        int integerPrimitive = 102;
        Integer integerNonPrimitive = integerPrimitive;

        System.out.println(integerNonPrimitive);

        //convert from primitive datatype using method
        //int to short or short to byte

        int age = 25;

        Integer thisObject = age;

        byte ageByte = thisObject.byteValue();
        long ageLong = thisObject.longValue();

        Integer thisObjek = 200;
        thisObjek.byteValue(); //change to byte datatype
        thisObjek.floatValue(); //change to float datatype


    }
}
