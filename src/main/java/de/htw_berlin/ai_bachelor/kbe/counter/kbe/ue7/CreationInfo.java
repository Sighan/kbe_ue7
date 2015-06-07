/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.htw_berlin.ai_bachelor.kbe.counter.kbe.ue7;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @author dan
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface CreationInfo {
    String author() default "DefaultAuthor";
    String description();
    String[] tags() default {};
    Class baseClass() default Object.class; //Every class extends object.
    Class[] interfaces() default {}; //A class can have 0 interfaces
}
