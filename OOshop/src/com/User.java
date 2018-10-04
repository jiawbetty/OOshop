package com;


public class User {
	
    private String account;
    private String password;
    private String email;
    jdbcmysql sql=new jdbcmysql();
    
    public User(String account, String password, String email) {
        this.account = account;
        this.password = password;
        this.email = email;
    }
    public String getAccount() {
    	return account;
    	
    }
    public String getPassword() {
    	return password;
    	
    }
    public String getEmail() {
    	return email;
    	
    }
    public void signUp(User u) {
    	sql.connectDB(u); 
    	
    }

	public String searchAccount(String ra) {
		// TODO Auto-generated method stub
		return sql.queryDB(ra);
		
	}
}
