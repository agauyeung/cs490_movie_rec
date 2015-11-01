 package models;

import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;
 
 public static class Login {

    public String email;
    public String password;
    
    public String validate() {
        if (User.authenticate(email, password) == null) {
          return "Invalid user or password";
        }
        return null;
    }
}