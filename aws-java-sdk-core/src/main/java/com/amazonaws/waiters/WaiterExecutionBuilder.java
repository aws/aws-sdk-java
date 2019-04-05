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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.annotation.SdkProtectedApi;

import java.util.ArrayList;
import java.util.List;

@SdkProtectedApi
public class WaiterExecutionBuilder<Input extends AmazonWebServiceRequest, Output> {

    private SdkFunction<Input, Output> sdkFunction;

    private Input request;

    private PollingStrategy pollingStrategy;

    private List<WaiterAcceptor<Output>> acceptors = new ArrayList<WaiterAcceptor<Output>>();

    public WaiterExecutionBuilder<Input, Output> withSdkFunction(SdkFunction sdkFunction) {
        this.sdkFunction = sdkFunction;
        return this;
    }

    public WaiterExecutionBuilder<Input, Output> withRequest(Input request) {
        this.request = request;
        return this;
    }


    public WaiterExecutionBuilder<Input, Output> withPollingStrategy(PollingStrategy pollingStrategy) {
        this.pollingStrategy = pollingStrategy;
        return this;
    }

    public WaiterExecutionBuilder<Input, Output> withAcceptors(List<WaiterAcceptor<Output>> acceptors) {
        this.acceptors = acceptors;
        return this;
    }

    public Input getRequest() {
        return this.request;
    }

    public List<WaiterAcceptor<Output>> getAcceptorsList() {
        return this.acceptors;
    }

    public SdkFunction<Input, Output> getSdkFunction() {
        return this.sdkFunction;
    }

    public PollingStrategy getPollingStrategy() {
        return this.pollingStrategy;
    }

    public WaiterExecution<Input, Output> build() {
        return new WaiterExecution<Input, Output>(this);
    }

}
