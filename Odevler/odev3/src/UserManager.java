public class UserManager  {
    public void add(User user){
        System.out.println("Id: "+ user.getId()+ "\n İsim: "+ user.getName() +"\n Soyisim: " + user.getSurName() + "\n Mail: "+ user.getMail() + "\n Sisteme eklendi." );
    }
    public void multiAdd(User[] users){
        for (User user : users){
            System.out.println("---------");
           add(user);
        }
    } //bulk

}
