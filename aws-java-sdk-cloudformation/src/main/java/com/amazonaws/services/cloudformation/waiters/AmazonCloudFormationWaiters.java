/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudformation.waiters;

import javax.annotation.Generated;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.cloudformation.AmazonCloudFormation;
import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.waiters.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonCloudFormationWaiters {

    /**
     * Represents the service client
     */
    private final AmazonCloudFormation client;

    private final ExecutorService executorService = Executors.newFixedThreadPool(50);

    /**
     * Constructs a new AmazonCloudFormationWaiters with the given client
     * 
     * @param client
     *        Service client
     */
    @SdkInternalApi
    public AmazonCloudFormationWaiters(AmazonCloudFormation client) {
        this.client = client;
    }

    /**
     * Builds a StackExists waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeStacksRequest> stackExists() {

        return new WaiterBuilder<DescribeStacksRequest, DescribeStacksResult>().withSdkFunction(new DescribeStacksFunction(client))
                .withAcceptors(new HttpSuccessStatusAcceptor(WaiterState.SUCCESS), new StackExists.IsValidationErrorMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(20), new FixedDelayStrategy(5)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a StackCreateComplete waiter by using custom parameters waiterParameters and other parameters defined in
     * the waiters specification, and then polls until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeStacksRequest> stackCreateComplete() {

        return new WaiterBuilder<DescribeStacksRequest, DescribeStacksResult>()
                .withSdkFunction(new DescribeStacksFunction(client))
                .withAcceptors(new StackCreateComplete.IsCREATE_COMPLETEMatcher(), new StackCreateComplete.IsCREATE_FAILEDMatcher(),
                        new StackCreateComplete.IsDELETE_COMPLETEMatcher(), new StackCreateComplete.IsDELETE_FAILEDMatcher(),
                        new StackCreateComplete.IsROLLBACK_FAILEDMatcher(), new StackCreateComplete.IsROLLBACK_COMPLETEMatcher(),
                        new StackCreateComplete.IsValidationErrorMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(120), new FixedDelayStrategy(30)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a ChangeSetCreateComplete waiter by using custom parameters waiterParameters and other parameters defined
     * in the waiters specification, and then polls until it determines whether the resource entered the desired state
     * or not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeChangeSetRequest> changeSetCreateComplete() {

        return new WaiterBuilder<DescribeChangeSetRequest, DescribeChangeSetResult>()
                .withSdkFunction(new DescribeChangeSetFunction(client))
                .withAcceptors(new ChangeSetCreateComplete.IsCREATE_COMPLETEMatcher(), new ChangeSetCreateComplete.IsFAILEDMatcher(),
                        new ChangeSetCreateComplete.IsValidationErrorMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(120), new FixedDelayStrategy(30)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a StackDeleteComplete waiter by using custom parameters waiterParameters and other parameters defined in
     * the waiters specification, and then polls until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeStacksRequest> stackDeleteComplete() {

        return new WaiterBuilder<DescribeStacksRequest, DescribeStacksResult>()
                .withSdkFunction(new DescribeStacksFunction(client))
                .withAcceptors(new StackDeleteComplete.IsDELETE_COMPLETEMatcher(), new StackDeleteComplete.IsValidationErrorMatcher(),
                        new StackDeleteComplete.IsDELETE_FAILEDMatcher(), new StackDeleteComplete.IsCREATE_FAILEDMatcher(),
                        new StackDeleteComplete.IsROLLBACK_FAILEDMatcher(), new StackDeleteComplete.IsUPDATE_ROLLBACK_FAILEDMatcher(),
                        new StackDeleteComplete.IsUPDATE_ROLLBACK_IN_PROGRESSMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(120), new FixedDelayStrategy(30)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a StackUpdateComplete waiter by using custom parameters waiterParameters and other parameters defined in
     * the waiters specification, and then polls until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeStacksRequest> stackUpdateComplete() {

        return new WaiterBuilder<DescribeStacksRequest, DescribeStacksResult>()
                .withSdkFunction(new DescribeStacksFunction(client))
                .withAcceptors(new StackUpdateComplete.IsUPDATE_COMPLETEMatcher(), new StackUpdateComplete.IsUPDATE_FAILEDMatcher(),
                        new StackUpdateComplete.IsUPDATE_ROLLBACK_FAILEDMatcher(), new StackUpdateComplete.IsUPDATE_ROLLBACK_COMPLETEMatcher(),
                        new StackUpdateComplete.IsValidationErrorMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(120), new FixedDelayStrategy(30)))
                .withExecutorService(executorService).build();
    }

    public void shutdown() {
        executorService.shutdown();
    }
}
