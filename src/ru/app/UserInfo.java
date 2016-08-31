package ru.app;

public class UserInfo {
	

	 String   UserName  = "";
	  String  ErrorText  = "";
	  boolean  LoginFlag = false;
	  
	  public UserInfo()
	  {
	    ;
	  }
	  
	  public String GetUser()
	  {
	    return UserName;
	  }
	  
	  public void Login(String TheUser)
	  {
	    LoginFlag = true;
	    ErrorText = "";
	    UserName = TheUser;
	  }
	  
	  public void SetError(String TheText)
	  {
	    ErrorText = TheText;
	  }
	  
	  public String GetError()
	  {
	    return ErrorText;
	  }
	  
	  public String IsLogin()
	  {
	    if (LoginFlag)
	      return "true";
	    return "false";
	  }
	  
	  public void Logout()
	  {
	    LoginFlag = false;
	    UserName = "";
	    ErrorText = "";
	  }
	}
	 
