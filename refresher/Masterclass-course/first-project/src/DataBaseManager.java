public abstract class DataBaseManager {

    public DataBaseManager(String dbName) {
    }

    abstract void connect();
   abstract void dissconnect();
   abstract void select(String query);
   abstract void deleteByID(int id);
   public void test()
   {
       System.out.println(Database.name);
   }


}
