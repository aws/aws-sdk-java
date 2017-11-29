/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.waiters;

import javax.annotation.Generated;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.sagemaker.AmazonSageMaker;
import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.waiters.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonSageMakerWaiters {

    /**
     * Represents the service client
     */
    private final AmazonSageMaker client;

    private final ExecutorService executorService = Executors.newFixedThreadPool(50);

    /**
     * Constructs a new AmazonSageMakerWaiters with the given client
     * 
     * @param client
     *        Service client
     */
    @SdkInternalApi
    public AmazonSageMakerWaiters(AmazonSageMaker client) {
        this.client = client;
    }

    /**
     * Builds a TrainingJob_Stopped waiter by using custom parameters waiterParameters and other parameters defined in
     * the waiters specification, and then polls until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeTrainingJobRequest> trainingJob_Stopped() {

        return new WaiterBuilder<DescribeTrainingJobRequest, DescribeTrainingJobResult>()
                .withSdkFunction(new DescribeTrainingJobFunction(client))
                .withAcceptors(new TrainingJob_Stopped.IsCompletedMatcher(), new TrainingJob_Stopped.IsStoppingMatcher(),
                        new TrainingJob_Stopped.IsStoppedMatcher(), new TrainingJob_Stopped.IsThrottlingExceptionMatcher(),
                        new TrainingJob_Stopped.IsValidationExceptionMatcher(), new TrainingJob_Stopped.IsFailedMatcher(),
                        new TrainingJob_Stopped.IsDeletingMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(120), new FixedDelayStrategy(120)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a TrainingJob_Deleted waiter by using custom parameters waiterParameters and other parameters defined in
     * the waiters specification, and then polls until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeTrainingJobRequest> trainingJob_Deleted() {

        return new WaiterBuilder<DescribeTrainingJobRequest, DescribeTrainingJobResult>()
                .withSdkFunction(new DescribeTrainingJobFunction(client))
                .withAcceptors(new TrainingJob_Deleted.IsValidationExceptionMatcher(), new TrainingJob_Deleted.IsDeletingMatcher(),
                        new TrainingJob_Deleted.IsThrottlingExceptionMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(120), new FixedDelayStrategy(120)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a Endpoint_Updated waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeEndpointRequest> endpoint_Updated() {

        return new WaiterBuilder<DescribeEndpointRequest, DescribeEndpointResult>()
                .withSdkFunction(new DescribeEndpointFunction(client))
                .withAcceptors(new Endpoint_Updated.Is200Matcher(), new Endpoint_Updated.IsUpdatingMatcher(), new Endpoint_Updated.IsRollingBackMatcher(),
                        new Endpoint_Updated.IsFailedMatcher(), new Endpoint_Updated.IsThrottlingExceptionMatcher(),
                        new Endpoint_Updated.IsValidationExceptionMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(120), new FixedDelayStrategy(120)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a NotebookInstance_Running waiter by using custom parameters waiterParameters and other parameters defined
     * in the waiters specification, and then polls until it determines whether the resource entered the desired state
     * or not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeNotebookInstanceRequest> notebookInstance_Running() {

        return new WaiterBuilder<DescribeNotebookInstanceRequest, DescribeNotebookInstanceResult>()
                .withSdkFunction(new DescribeNotebookInstanceFunction(client))
                .withAcceptors(new NotebookInstance_Running.IsInServiceMatcher(), new NotebookInstance_Running.IsThrottlingExceptionMatcher(),
                        new NotebookInstance_Running.IsFailedMatcher(), new NotebookInstance_Running.IsStoppedMatcher(),
                        new NotebookInstance_Running.IsStoppingMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(120), new FixedDelayStrategy(120)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a NotebookInstance_Deleted waiter by using custom parameters waiterParameters and other parameters defined
     * in the waiters specification, and then polls until it determines whether the resource entered the desired state
     * or not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeNotebookInstanceRequest> notebookInstance_Deleted() {

        return new WaiterBuilder<DescribeNotebookInstanceRequest, DescribeNotebookInstanceResult>()
                .withSdkFunction(new DescribeNotebookInstanceFunction(client))
                .withAcceptors(new NotebookInstance_Deleted.IsValidationExceptionMatcher(), new NotebookInstance_Deleted.IsDeletingMatcher(),
                        new NotebookInstance_Deleted.IsThrottlingExceptionMatcher(), new NotebookInstance_Deleted.IsFailedMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(120), new FixedDelayStrategy(120)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a Endpoint_Created waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeEndpointRequest> endpoint_Created() {

        return new WaiterBuilder<DescribeEndpointRequest, DescribeEndpointResult>()
                .withSdkFunction(new DescribeEndpointFunction(client))
                .withAcceptors(new Endpoint_Created.IsInServiceMatcher(), new Endpoint_Created.IsCreatingMatcher(), new Endpoint_Created.IsFailedMatcher(),
                        new Endpoint_Created.IsThrottlingExceptionMatcher(), new Endpoint_Created.IsValidationExceptionMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(120), new FixedDelayStrategy(120)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a NotebookInstance_Stopped waiter by using custom parameters waiterParameters and other parameters defined
     * in the waiters specification, and then polls until it determines whether the resource entered the desired state
     * or not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeNotebookInstanceRequest> notebookInstance_Stopped() {

        return new WaiterBuilder<DescribeNotebookInstanceRequest, DescribeNotebookInstanceResult>()
                .withSdkFunction(new DescribeNotebookInstanceFunction(client))
                .withAcceptors(new NotebookInstance_Stopped.IsStoppedMatcher(), new NotebookInstance_Stopped.IsStoppingMatcher(),
                        new NotebookInstance_Stopped.IsThrottlingExceptionMatcher(), new NotebookInstance_Stopped.IsFailedMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(120), new FixedDelayStrategy(120)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a Endpoint_Deleted waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeEndpointRequest> endpoint_Deleted() {

        return new WaiterBuilder<DescribeEndpointRequest, DescribeEndpointResult>()
                .withSdkFunction(new DescribeEndpointFunction(client))
                .withAcceptors(new Endpoint_Deleted.IsValidationExceptionMatcher(), new Endpoint_Deleted.IsDeletingMatcher(),
                        new Endpoint_Deleted.IsFailedMatcher(), new Endpoint_Deleted.IsThrottlingExceptionMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(120), new FixedDelayStrategy(120)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a TrainingJob_Created waiter by using custom parameters waiterParameters and other parameters defined in
     * the waiters specification, and then polls until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeTrainingJobRequest> trainingJob_Created() {

        return new WaiterBuilder<DescribeTrainingJobRequest, DescribeTrainingJobResult>()
                .withSdkFunction(new DescribeTrainingJobFunction(client))
                .withAcceptors(new TrainingJob_Created.IsCreatedMatcher(), new TrainingJob_Created.IsCompletedMatcher(),
                        new TrainingJob_Created.IsInProgressMatcher(), new TrainingJob_Created.IsFailedMatcher(), new TrainingJob_Created.IsStoppingMatcher(),
                        new TrainingJob_Created.IsStoppedMatcher(), new TrainingJob_Created.IsDeletingMatcher(),
                        new TrainingJob_Created.IsValidationExceptionMatcher(), new TrainingJob_Created.IsThrottlingExceptionMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(120), new FixedDelayStrategy(120)))
                .withExecutorService(executorService).build();
    }

    public void shutdown() {
        executorService.shutdown();
    }
}
