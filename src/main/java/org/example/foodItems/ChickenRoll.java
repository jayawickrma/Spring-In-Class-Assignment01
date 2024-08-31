package org.example.foodItems;


import org.example.Anootation.finalPreference;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@finalPreference
class ChickenRoll {
    //final preference

    public ChickenRoll() {

    }

    public void roll() {
        System.out.println("Mahesh's Final Preference is ChickenRoll");
    }

}
