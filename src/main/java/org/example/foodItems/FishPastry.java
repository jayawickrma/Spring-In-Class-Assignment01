package org.example.foodItems;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FishPastry {
    //second preference
    public FishPastry(){

    }
    public void secondPreference(){
        System.out.println("Mahesh's Second Preference is FishPastry !");
    }
}
