package com.cakebaker.aman.cakeBakerArtifacts;

import org.springframework.stereotype.Component;

@Component
public class StrawBerrySyrup implements Syrup{
    @Override
    public String getSyrupType() {
        return "StrawBerry Syrup Added";
    }
}
