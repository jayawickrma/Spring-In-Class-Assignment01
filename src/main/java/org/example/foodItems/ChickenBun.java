package org.example.foodItems;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier
public class ChickenBun {
    //3rd preference

    public ChickenBun(){
        System.out.println("ChickenBun");
    }

    public void thirdPreference(){
        System.out.println("Mahesh's 3rd preference is ChickenBun! ");
    }

}
