package com.cakebaker.aman.cakeBakerArtifacts;

public class CakeBaker {
    Frosting frosting;
    Syrup syrup;
    public CakeBaker(Frosting frosting,Syrup syrup){
        this.frosting = frosting;
        this.syrup = syrup;
    }
    public void bakeCake(){
        System.out.println("Cake Ready with "+ frosting.getFrostingType() +" and syrup "+syrup.getSyrupType());
    }
}
