public class userLoginCustomException extends RuntimeException{
    private static String PREFIX_ERROR_CODE = "U_";
    public userLoginCustomException(String message, int errorCode) {
        super(message+ " error code: "+ PREFIX_ERROR_CODE+errorCode);
    }
}
