/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.htw_berlin.ai_bachelor.kbe.counter.kbe.ue7;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author dan
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
            Class<ImplementingClass> cl = ImplementingClass.class;
            printCreationInfo(cl.getAnnotation(CreationInfo.class));
    }    
    
    private static void printCreationInfo(CreationInfo ci) throws Exception {
        System.out.println("Printing Creation Info");
        /*ArrayList<String> defMethods = new ArrayList<String>();
        for (Method md : Override.class.getMethods()) {
            System.out.println(md.getName());
            defMethods.add(md.getName());
        }
        for (Method md : ci.getClass().getMethods()) {
            if (!defMethods.contains(md.getName())){
                System.out.print(md.getName() + ": ");
                System.out.println(md.invoke(ci,(Object[])null));
            }
        }*/
        System.out.println("Author: " + ci.author());
        System.out.println("Description: " + ci.description());
        System.out.println("Tags: " + Arrays.toString(ci.tags()));
        System.out.println("Baseclass: " + ci.baseClass());
        System.out.println("Interfaces: " + Arrays.toString(ci.interfaces()));
    }
}
