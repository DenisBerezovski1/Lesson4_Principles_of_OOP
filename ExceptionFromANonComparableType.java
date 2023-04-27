public class ExceptionFromANonComparableType extends Exception{
    public ExceptionFromANonComparableType(String type) {
        super(String.format("Type %s is not comparable", type));
    }
}
