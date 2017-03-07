/*
 * Copyright 2012-2017 Amazon Technologies, Inc.
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
package com.amazonaws.services.s3.transfer.internal;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;

import org.hamcrest.Matcher;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsNull;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.s3.model.AmazonS3Exception;

@RunWith(Parameterized.class)
public class AbstractTransferRethrowExecutionExceptionTest {

    @Rule
    public final ExpectedException thrown = ExpectedException.none();

    private final ExecutionException executionException;
    private final Class<? extends Throwable> expectedException;
    private final Class<? extends Throwable> causeOfExpectedException;
    private AbstractTransfer cut;

    public AbstractTransferRethrowExecutionExceptionTest(final ExecutionException executionException,
            final Class<? extends Throwable> expectedException,
            final Class<? extends Throwable> causeOfExpectedException) {
        this.executionException = executionException;
        this.expectedException = expectedException;
        this.causeOfExpectedException = causeOfExpectedException;
    }

    @Parameters(name = "ExecutionException: {0}, Expected Exception: {1}, Cause of Expected Exception: {2}")
    public static List<Object[]> parameters() {
        return Arrays.asList(new Object[][] {
                { new ExecutionException(null), AmazonClientException.class, ExecutionException.class },
                { new ExecutionException(new IllegalStateException()), AmazonClientException.class,
                        IllegalStateException.class },
                { new ExecutionException(new AmazonClientException("")), AmazonClientException.class, null },
                { new ExecutionException(new AmazonServiceException("")), AmazonServiceException.class, null },
                { new ExecutionException(new AmazonS3Exception("")), AmazonS3Exception.class, null },
                { new ExecutionException(new ExecutionException(null)), AmazonClientException.class,
                        ExecutionException.class },
                { new ExecutionException(new ExecutionException(new IllegalStateException())),
                        AmazonClientException.class, IllegalStateException.class },
                { new ExecutionException(new ExecutionException(new AmazonClientException(""))),
                        AmazonClientException.class, null },
                { new ExecutionException(new ExecutionException(new AmazonServiceException(""))),
                        AmazonServiceException.class, null },
                { new ExecutionException(new ExecutionException(new AmazonS3Exception(""))), AmazonS3Exception.class,
                        null }, });
    }

    @Test
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public void rethrowExecutionException() {
        thrown.expect(expectedException);
        if (causeOfExpectedException != null) {
            thrown.expectCause(Is.isA(causeOfExpectedException));
        } else {
            thrown.expectCause((Matcher) IsNull.nullValue());
        }

        cut.rethrowExecutionException(executionException);
    }

    @Before
    public void setup() {
        cut = new AbstractTransfer("description", null, null) {
        };
    }
}
