package com.yazan.test.controller;
import com.yazan.test.modules.Users;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/Users")
public class UsersController
{

    //-----------------------------Select------------------------------------------------------------------
    @GetMapping(path = "/selectall")
    public List<Users> selectall()
    {
        //Database
        List<Users> users = new ArrayList<Users>();
        users.add(new Users("yazan",1));
        users.add(new Users("sari",2));

        return users;
    }

    @GetMapping(path = "/select/{id}")
    public  Users select(@PathVariable int  id)
    {
        //Database
        List<Users> users = new ArrayList<Users>();
        users.add(new Users("yazan",1));
        users.add(new Users("sari",2));


        Users filtered = users.stream().filter(u -> Integer.toString(id).equals(Integer.toString(u.getId()))).findAny().orElse(null);
        filtered.setStatus("filtered");
        return filtered;
    }

//-----------------------------Save/Update------------------------------------------------------------------

    @PostMapping(path = "/save")
    public List<Users> save(@RequestBody Users user)
    {
        //Database
        List<Users> users = new ArrayList<Users>();
        users.add(new Users("yazan",1));
        users.add(new Users("sari",2));

         //----- New User
        if(user.getId()==0)
        {   user.setId(100);
            users.add(user);
            user.setStatus("Saved");
        }
        //----- Update User
        else
        {

            // ---Find the user and remove it
            Users filtered = users.stream().filter(u -> Integer.toString(user.getId()).equals(Integer.toString(u.getId()))).findAny().orElse(null);
            users.remove(filtered);

            // ---update the value and add it again
            filtered.setName(user.getName());
            users.add(filtered);
            user.setStatus("Updated");
        }

        return users;
    }

//-----------------------------Delete------------------------------------------------------------------

    @PostMapping(path = "/delete")
    public List<Users> delete(@RequestBody Users user){

        //Database
        List<Users> users = new ArrayList<Users>();
        users.add(new Users("yazan",1));
        users.add(new Users("sari",2));


        Users filtered = users.stream().filter(u -> Integer.toString(user.getId()).equals(Integer.toString(u.getId()))).findAny().orElse(null);
        users.remove(filtered);

        return users;
    }
}
