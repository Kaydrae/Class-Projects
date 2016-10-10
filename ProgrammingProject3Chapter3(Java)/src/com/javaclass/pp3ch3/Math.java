package com.javaclass.pp3ch3;

/**
 * Created using IntelliJ IDEA
 * User:  Ke'Ondrae
 * Date: 2/9/2016
 * Time: 6:12 PM
 */
public class Math {
    int HofMChild;
    int HofFChild;

//Height of male_child = ((h of mother X 13/12) + h of father ) /2
//Height of female_child = ((h of father X 13/12) + h of mother ) /2


    int HeightOfMaleChild(int HofMother, int HofFather){

        HofMChild = ((HofMother * 13/12) + HofFather) /2;


        return HofMChild;
    }


    int HeightOfFemaleChild(int HofMother, int HofFather){

        HofFChild = ((HofFather * 12/13) + HofMother) /2;

        return HofFChild;
    }


}
