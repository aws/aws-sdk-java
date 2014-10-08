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
package com.amazonaws.services.simpleworkflow.flow.pojo;

import java.lang.reflect.Method;

import com.amazonaws.services.simpleworkflow.flow.DataConverter;


class MethodConverterPair {
    private final Method method;
    private final DataConverter converter;
    public MethodConverterPair(Method method, DataConverter converter) {
        super();
        this.method = method;
        this.converter = converter;
    }
    
    Method getMethod() {
        return method;
    }
    
    DataConverter getConverter() {
        return converter;
    }
}