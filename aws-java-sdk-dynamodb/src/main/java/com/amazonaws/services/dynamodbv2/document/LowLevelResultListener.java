/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodbv2.document;

/**
 * Can be used to listen to the event of receiving a low level result of type R
 * from the server side.
 * 
 * @param <R>
 *            low level result type
 */
public abstract class LowLevelResultListener<R> {
    public static final LowLevelResultListener<?> NONE = 
        new LowLevelResultListener<Object>() {
            @Override public void onLowLevelResult(Object result) {}
        };

    @SuppressWarnings("unchecked")
    public static <T> LowLevelResultListener<T> none() {
        return (LowLevelResultListener<T>) NONE;
    }

    public abstract void onLowLevelResult(R lowLevelResult);
}
