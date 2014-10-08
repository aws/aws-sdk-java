/*
 * Copyright 2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpleworkflow.flow.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Optional annotation used on activity methods to override the name 
 * and version.
 * 
 * @see Activities
 * @author fateev, samar
 *
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Activity {

    /**
     * This is used to override the name of ActivityType.
     * Default is empty string which means to use the method name.
     */
    String name() default "";

    /**
     * This is used to override the version of ActivityType.
     * Default is empty string which means to use the version specified on
     * {@link Activities} annotation for the interface.  If 
     * {@link Activities#version()} is also empty string then AWS Flow Framework
     * annotation processor reports an error.
     */
    String version() default "";

}
