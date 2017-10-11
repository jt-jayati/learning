package com.jt.core.services;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition()
public @interface ConfigurableOsgiService {

    @AttributeDefinition(name="tt1")
    String getTrialField();

    @AttributeDefinition(name="testcheck", type= AttributeType.BOOLEAN)
    boolean getCheck() default true;

    String test() default "Jayati";
}
