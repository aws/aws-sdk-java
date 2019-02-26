/*
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lambda.invoke;

import java.lang.reflect.Method;

/**
 * Determine function name from the {@link LambdaFunction} annotation's functionName attribute if
 * present otherwise uses the method name.
 */
public class DefaultLambdaFunctionNameResolver implements LambdaFunctionNameResolver {

    @Override
    public String getFunctionName(Method method, LambdaFunction annotation, LambdaInvokerFactoryConfig config) {
        String functionName = annotation.functionName();
        if (functionName.isEmpty()) {
            functionName = method.getName();
        }
        return functionName;
    }
}