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
package com.amazonaws.services.simpleworkflow.flow.common;

import java.lang.reflect.Method;

import com.amazonaws.services.simpleworkflow.model.PredefinedDuration;


public final class FlowHelpers {
    
    public static String secondsToDuration(Long seconds) {
        if (seconds == null || seconds == FlowConstants.NONE) {
            return PredefinedDuration.NONE.toString();
        } else if (seconds == FlowConstants.USE_REGISTERED_DEFAULTS) {
            return null;
        }
        
        return Long.toString(seconds);
    }
    
    public static Object[] validateInput(Method method, Object[] args) {
        Class<?>[] paramterTypes = method.getParameterTypes();
        int numberOfParameters = paramterTypes.length;
        if (args == null || args.length != numberOfParameters) {
            throw new IllegalStateException("Number of parameters does not match args size.");
        }
        
        int index = 0;
        for (Class<?> paramType: paramterTypes) {
            Object argument = args[index];
            if (argument != null && !paramType.isAssignableFrom(argument.getClass())) {
                throw new IllegalStateException("Param type '" + paramType.getName() + "' is not assigable from '" 
                        + argument.getClass().getName() + "'.");
            }
            
            index++;
        }
        
        return args;
    }

}
