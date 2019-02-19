public class AccountErrorException extends RuntimeException  {
        public AccountErrorException(String msg){
            super(msg);
        }
        public AccountErrorException(Exception ex){
            super(ex);
        }

}
