/*
 * Copyright 2011-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.internal;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ExceptionUtilsTest {
    @Test
    public void exceptionStackTrace_includesStackTrace() {
        RuntimeException ex = new RuntimeException("error!");

        StackTraceElement e = new StackTraceElement("MyClass", "someMethod", "MyClass.java", 1);
        StackTraceElement[] elements = new StackTraceElement[]{ e };
        ex.setStackTrace(elements);

        String stackTrace = ExceptionUtils.exceptionStackTrace(ex);

        assertThat(stackTrace.contains("error!"), is(true));
        assertThat(stackTrace.contains("MyClass.java:1"), is(true));
    }
}
