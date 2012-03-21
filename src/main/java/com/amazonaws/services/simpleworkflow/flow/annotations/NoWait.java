/*
 * Copyright 2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpleworkflow.flow.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.amazonaws.services.simpleworkflow.flow.core.Promise;

/**
 * Used to mark {@link Promise} arguments of &#064;Asynchronous methods that should
 * not be waited for.
 * <p>
 * Example usage:
 * 
 * <pre>
 * <code>
 * &#064;Asynchronous
 * private void calculate(Promise<Integer> arg1, &#064;NoWait Settable<Integer> result) {
 *    ...
 *    result.set(r);
 * }
 * </code>
 * </pre>
 * 
 * @see Asynchronous
 * 
 * @author fateev
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
public @interface NoWait {

}
