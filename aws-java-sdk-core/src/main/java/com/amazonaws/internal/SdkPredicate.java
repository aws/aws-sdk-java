/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.internal;

/**
 * Similar to Predicate functional interface in Java 8
 */
public abstract class SdkPredicate<T> {

    /**
     * Evaluates this predicate on the given argument
     * 
     * @param t
     *            The input argument
     * @return true if the input argument matches the predicate, otherwise false
     */
    public abstract boolean test(T t);
}
