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
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;

@SdkProtectedApi
public class WaiterBuilder<Input extends AmazonWebServiceRequest, Output> {

    private SdkFunction<Input, Output> sdkFunction;

    private List<WaiterAcceptor<Output>> acceptors = new ArrayList<WaiterAcceptor<Output>>();

    private PollingStrategy defaultPollingStrategy;

    private ExecutorService executorService;

    public WaiterBuilder<Input, Output> withSdkFunction(SdkFunction<Input, Output> sdkFunction) {
        this.sdkFunction = sdkFunction;
        return this;
    }

    public WaiterBuilder<Input, Output> withAcceptors(WaiterAcceptor<Output>... acceptors) {
        Collections.addAll(this.acceptors, acceptors);
        return this;
    }

    public WaiterBuilder<Input, Output> withDefaultPollingStrategy(PollingStrategy pollingStrategy) {
        this.defaultPollingStrategy = pollingStrategy;
        return this;
    }

    public WaiterBuilder<Input, Output> withExecutorService(ExecutorService executorService) {
        this.executorService = executorService;
        return this;
    }

    public List<WaiterAcceptor<Output>> getAcceptor() {
        return this.acceptors;
    }

    public SdkFunction<Input, Output> getSdkFunction() {
        return this.sdkFunction;
    }

    PollingStrategy getDefaultPollingStrategy() {
        return this.defaultPollingStrategy;
    }

    public ExecutorService getExecutorService() {
        return this.executorService;
    }

    public Waiter<Input> build() {
        return new WaiterImpl<Input, Output>(this);
    }

}
