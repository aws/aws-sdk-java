/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.augmentedairuntime;

import javax.annotation.Generated;

import com.amazonaws.services.augmentedairuntime.model.*;

/**
 * Abstract implementation of {@code AmazonAugmentedAIRuntimeAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonAugmentedAIRuntimeAsync extends AbstractAmazonAugmentedAIRuntime implements AmazonAugmentedAIRuntimeAsync {

    protected AbstractAmazonAugmentedAIRuntimeAsync() {
    }

    @Override
    public java.util.concurrent.Future<DeleteHumanLoopResult> deleteHumanLoopAsync(DeleteHumanLoopRequest request) {

        return deleteHumanLoopAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteHumanLoopResult> deleteHumanLoopAsync(DeleteHumanLoopRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteHumanLoopRequest, DeleteHumanLoopResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeHumanLoopResult> describeHumanLoopAsync(DescribeHumanLoopRequest request) {

        return describeHumanLoopAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeHumanLoopResult> describeHumanLoopAsync(DescribeHumanLoopRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeHumanLoopRequest, DescribeHumanLoopResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListHumanLoopsResult> listHumanLoopsAsync(ListHumanLoopsRequest request) {

        return listHumanLoopsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListHumanLoopsResult> listHumanLoopsAsync(ListHumanLoopsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListHumanLoopsRequest, ListHumanLoopsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartHumanLoopResult> startHumanLoopAsync(StartHumanLoopRequest request) {

        return startHumanLoopAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartHumanLoopResult> startHumanLoopAsync(StartHumanLoopRequest request,
            com.amazonaws.handlers.AsyncHandler<StartHumanLoopRequest, StartHumanLoopResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopHumanLoopResult> stopHumanLoopAsync(StopHumanLoopRequest request) {

        return stopHumanLoopAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopHumanLoopResult> stopHumanLoopAsync(StopHumanLoopRequest request,
            com.amazonaws.handlers.AsyncHandler<StopHumanLoopRequest, StopHumanLoopResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
