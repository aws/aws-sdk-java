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

package com.amazonaws.waiters;

import com.amazonaws.AmazonServiceException;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CompositeAcceptorTest {

    @Test(expected = IllegalArgumentException.class)
    public void nullWaiterAcceptorList() {
        CompositeAcceptor compositeAcceptor = new CompositeAcceptor(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void emptyWaiterAcceptorList() {
        List<WaiterAcceptor> waiterAcceptorsList = new ArrayList<WaiterAcceptor>();
        CompositeAcceptor compositeAcceptor = new CompositeAcceptor(waiterAcceptorsList);
    }

    @Test
    public void responseMatchExpected() throws Exception {
        List<WaiterAcceptor> waiterAcceptorsList = new ArrayList<WaiterAcceptor>();
        waiterAcceptorsList.add(new TestExceptionAcceptor());
        waiterAcceptorsList.add(new TestResultAcceptor());
        CompositeAcceptor compositeAcceptor = new CompositeAcceptor(waiterAcceptorsList);
        Assert.assertEquals("Response output doesn't match expected output.", WaiterState.SUCCESS, compositeAcceptor.accepts(new DescribeTableResult()));
    }

    @Test
    public void responseNotMatchExpected() throws Exception {
        List<WaiterAcceptor> waiterAcceptorsList = new ArrayList<WaiterAcceptor>();
        waiterAcceptorsList.add(new TestExceptionAcceptor());
        CompositeAcceptor compositeAcceptor = new CompositeAcceptor(waiterAcceptorsList);
        Assert.assertEquals("Response output doesn't match expected output.", WaiterState.RETRY, compositeAcceptor.accepts(new DescribeTableResult()));
    }

    @Test (expected = AmazonServiceException.class)
    public void exceptionNotMatchExpected() throws Exception {
        List<WaiterAcceptor> waiterAcceptorsList = new ArrayList<WaiterAcceptor>();
        waiterAcceptorsList.add(new TestResultAcceptor());
        CompositeAcceptor compositeAcceptor = new CompositeAcceptor(waiterAcceptorsList);
        Assert.assertEquals("Exception thrown doesn't match expected exception.", WaiterState.RETRY, compositeAcceptor.accepts(new AmazonServiceException("")));
    }

    @Test
    public void exceptionMatchExpected() throws Exception {
        List<WaiterAcceptor> waiterAcceptorsList = new ArrayList<WaiterAcceptor>();
        waiterAcceptorsList.add(new TestResultAcceptor());
        waiterAcceptorsList.add(new TestExceptionAcceptor());
        CompositeAcceptor compositeAcceptor = new CompositeAcceptor(waiterAcceptorsList);
        Assert.assertEquals("Exception thrown doesn't match expected exception.", WaiterState.RETRY, compositeAcceptor.accepts(new ResourceNotFoundException("")));
    }

    class DescribeTableResult {
        private String tableName;
    }

    class TestResultAcceptor extends WaiterAcceptor<DescribeTableResult> {

        public boolean matches(DescribeTableResult result) {
            return true;
        }
        public WaiterState getState() {
            return WaiterState.SUCCESS;
        }

    }

    class TestExceptionAcceptor extends WaiterAcceptor<DescribeTableResult> {

        public boolean matches(AmazonServiceException e) {
            return e instanceof ResourceNotFoundException;
        }

        public WaiterState getState() {
            return WaiterState.RETRY;
        }
    }

    static class ResourceNotFoundException extends AmazonServiceException {
        public ResourceNotFoundException(String message) {
            super(message);
        }
    }
}
