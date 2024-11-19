package com.cakebaker.aman.cakeBakerArtifacts;

import org.springframework.stereotype.Component;

@Component
public class StrawBerryFrosting implements Frosting{
    @Override
    public String getFrostingType() {
        return "StrawBerry Frosting Added";
    }
}
