/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.util;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import utils.EnvironmentVariableHelper;

public class TraceIdEnvironmentVariableTest {
    private static final String FUNCTION_NAME_ENV = "AWS_LAMBDA_FUNCTION_NAME";
    private static final String TRACE_ID_ENV = "_X_AMZN_TRACE_ID";
    private static final String TRACE_ID_SYSTEM_PROPERTY = "com.amazonaws.xray.traceHeader";

    private static final EnvironmentVariableHelper helper = new EnvironmentVariableHelper();

    @Before
    public void setup() {
        helper.remove(FUNCTION_NAME_ENV);
        helper.remove(TRACE_ID_ENV);
        System.clearProperty(TRACE_ID_SYSTEM_PROPERTY);
    }

    @After
    public void restoreOriginal() {
        helper.reset();
        System.clearProperty(TRACE_ID_SYSTEM_PROPERTY);
    }

    @Test
    public void noEnvSettings_doesNotReturnTraceId() {
        Assert.assertNull(RuntimeHttpUtils.getLambdaEnvironmentTraceId());
    }

    @Test
    public void correctEnvSettings_ReturnsTraceId() {
        helper.set(FUNCTION_NAME_ENV, "foo");
        helper.set(TRACE_ID_ENV, "bar");
        Assert.assertEquals("bar", RuntimeHttpUtils.getLambdaEnvironmentTraceId());
    }

    @Test
    public void noLambdaFunctionNameEnv_doesNotReturnTraceId() {
        helper.set(TRACE_ID_ENV, "bar");
        Assert.assertNull(RuntimeHttpUtils.getLambdaEnvironmentTraceId());
    }

    @Test
    public void noTraceIdEnv_doesNotReturnTraceId() {
        helper.set(FUNCTION_NAME_ENV, "foo");
        Assert.assertNull(RuntimeHttpUtils.getLambdaEnvironmentTraceId());
    }

    @Test
    public void sysPropNoEnv_ReturnsTraceId() {
        helper.set(FUNCTION_NAME_ENV, "foo");
        System.setProperty(TRACE_ID_SYSTEM_PROPERTY, "bar");
        Assert.assertEquals("bar", RuntimeHttpUtils.getLambdaEnvironmentTraceId());
    }

    @Test
    public void sysPropAndEnv_ReturnsTraceIdFromSysProp() {
        helper.set(FUNCTION_NAME_ENV, "foo");
        helper.set(TRACE_ID_ENV, "bar");
        System.setProperty(TRACE_ID_SYSTEM_PROPERTY, "buz");
        Assert.assertEquals("buz", RuntimeHttpUtils.getLambdaEnvironmentTraceId());
    }
}
