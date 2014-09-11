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
package com.amazonaws.services.simpleworkflow.flow.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;

import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.core.Settable;
import com.amazonaws.services.simpleworkflow.flow.core.Task;

class AsynchronousAspectTask extends Task {
    
    ProceedingJoinPoint pjp;
    @SuppressWarnings("rawtypes")
	Settable returnValue = new Settable();

    @SuppressWarnings("rawtypes")
	public AsynchronousAspectTask(Boolean daemon, ProceedingJoinPoint pjp, Promise[] waitFor) {
        super(daemon, "_aroundBody", true, 7, waitFor);
        this.pjp = pjp;
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
    protected void doExecute() throws Throwable {
        Object result = pjp.proceed();
        if (result != null && !(result instanceof Promise)) {
            throw new RuntimeException("@Asynchronous annotation is allowed only for methods with void or Promise return types: " 
            		+ pjp.getStaticPart().getSignature().getName());
        }
        
        if (result != null) {
        	returnValue.chain((Promise)result);
        } else {
            returnValue.set(null);
        }
    }
    
    @SuppressWarnings("rawtypes")
	public Promise getReturnValue() {
        return returnValue;
    }
}
