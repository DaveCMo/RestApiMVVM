package com.codingwithmitch.foodrecipes.requests.SWCTests;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class GenerateNewPlayerJson {


    public int lastLoginTime = 0;
    public boolean pickupMessages = true;
    @SerializedName("commands")
    public List<GeneratePlayerCommand> commands = new ArrayList<>();

    public GenerateNewPlayerJson() {
        GeneratePlayerCommand generatePlayerCommand = new GeneratePlayerCommand();
        commands.add(generatePlayerCommand);


    }


//{"lastLoginTime":0,"pickupMessages":true,"commands":[{"action":"auth.preauth.generatePlayer"}]}

}
