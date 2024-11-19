package com.cakebaker.aman.cakeBakerArtifacts;

import org.springframework.stereotype.Component;

@Component
public class ChocolateFrosting implements Frosting{

    @Override
    public String getFrostingType() {
        return "Chocolate Frosting Added";
    }
}
