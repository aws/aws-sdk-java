/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.proton.waiters;

import javax.annotation.Generated;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.proton.AWSProton;
import com.amazonaws.services.proton.model.*;
import com.amazonaws.waiters.*;

import java.util.concurrent.ExecutorService;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSProtonWaiters {

    /**
     * Represents the service client
     */
    private final AWSProton client;

    private final ExecutorService executorService = WaiterExecutorServiceFactory.buildExecutorServiceForWaiter("AWSProtonWaiters");

    /**
     * Constructs a new AWSProtonWaiters with the given client
     * 
     * @param client
     *        Service client
     */
    @SdkInternalApi
    public AWSProtonWaiters(AWSProton client) {
        this.client = client;
    }

    /**
     * Builds a ServiceInstanceDeployed waiter by using custom parameters waiterParameters and other parameters defined
     * in the waiters specification, and then polls until it determines whether the resource entered the desired state
     * or not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetServiceInstanceRequest> serviceInstanceDeployed() {

        return new WaiterBuilder<GetServiceInstanceRequest, GetServiceInstanceResult>().withSdkFunction(new GetServiceInstanceFunction(client))
                .withAcceptors(new ServiceInstanceDeployed.IsSUCCEEDEDMatcher(), new ServiceInstanceDeployed.IsFAILEDMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(999), new FixedDelayStrategy(5)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a ServiceCreated waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetServiceRequest> serviceCreated() {

        return new WaiterBuilder<GetServiceRequest, GetServiceResult>()
                .withSdkFunction(new GetServiceFunction(client))
                .withAcceptors(new ServiceCreated.IsACTIVEMatcher(), new ServiceCreated.IsCREATE_FAILED_CLEANUP_COMPLETEMatcher(),
                        new ServiceCreated.IsCREATE_FAILED_CLEANUP_FAILEDMatcher(), new ServiceCreated.IsCREATE_FAILEDMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(999), new FixedDelayStrategy(5)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a EnvironmentDeployed waiter by using custom parameters waiterParameters and other parameters defined in
     * the waiters specification, and then polls until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetEnvironmentRequest> environmentDeployed() {

        return new WaiterBuilder<GetEnvironmentRequest, GetEnvironmentResult>().withSdkFunction(new GetEnvironmentFunction(client))
                .withAcceptors(new EnvironmentDeployed.IsSUCCEEDEDMatcher(), new EnvironmentDeployed.IsFAILEDMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(999), new FixedDelayStrategy(5)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a ServiceTemplateVersionRegistered waiter by using custom parameters waiterParameters and other parameters
     * defined in the waiters specification, and then polls until it determines whether the resource entered the desired
     * state or not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetServiceTemplateVersionRequest> serviceTemplateVersionRegistered() {

        return new WaiterBuilder<GetServiceTemplateVersionRequest, GetServiceTemplateVersionResult>()
                .withSdkFunction(new GetServiceTemplateVersionFunction(client))
                .withAcceptors(new ServiceTemplateVersionRegistered.IsDRAFTMatcher(), new ServiceTemplateVersionRegistered.IsPUBLISHEDMatcher(),
                        new ServiceTemplateVersionRegistered.IsREGISTRATION_FAILEDMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(150), new FixedDelayStrategy(2)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a ServicePipelineDeployed waiter by using custom parameters waiterParameters and other parameters defined
     * in the waiters specification, and then polls until it determines whether the resource entered the desired state
     * or not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetServiceRequest> servicePipelineDeployed() {

        return new WaiterBuilder<GetServiceRequest, GetServiceResult>().withSdkFunction(new GetServiceFunction(client))
                .withAcceptors(new ServicePipelineDeployed.IsSUCCEEDEDMatcher(), new ServicePipelineDeployed.IsFAILEDMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(360), new FixedDelayStrategy(10)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a ServiceUpdated waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetServiceRequest> serviceUpdated() {

        return new WaiterBuilder<GetServiceRequest, GetServiceResult>()
                .withSdkFunction(new GetServiceFunction(client))
                .withAcceptors(new ServiceUpdated.IsACTIVEMatcher(), new ServiceUpdated.IsUPDATE_FAILED_CLEANUP_COMPLETEMatcher(),
                        new ServiceUpdated.IsUPDATE_FAILED_CLEANUP_FAILEDMatcher(), new ServiceUpdated.IsUPDATE_FAILEDMatcher(),
                        new ServiceUpdated.IsUPDATE_COMPLETE_CLEANUP_FAILEDMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(999), new FixedDelayStrategy(5)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a ServiceDeleted waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetServiceRequest> serviceDeleted() {

        return new WaiterBuilder<GetServiceRequest, GetServiceResult>().withSdkFunction(new GetServiceFunction(client))
                .withAcceptors(new ServiceDeleted.IsResourceNotFoundExceptionMatcher(), new ServiceDeleted.IsDELETE_FAILEDMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(999), new FixedDelayStrategy(5)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a EnvironmentTemplateVersionRegistered waiter by using custom parameters waiterParameters and other
     * parameters defined in the waiters specification, and then polls until it determines whether the resource entered
     * the desired state or not, where polling criteria is bound by either default polling strategy or custom polling
     * strategy.
     */
    public Waiter<GetEnvironmentTemplateVersionRequest> environmentTemplateVersionRegistered() {

        return new WaiterBuilder<GetEnvironmentTemplateVersionRequest, GetEnvironmentTemplateVersionResult>()
                .withSdkFunction(new GetEnvironmentTemplateVersionFunction(client))
                .withAcceptors(new EnvironmentTemplateVersionRegistered.IsDRAFTMatcher(), new EnvironmentTemplateVersionRegistered.IsPUBLISHEDMatcher(),
                        new EnvironmentTemplateVersionRegistered.IsREGISTRATION_FAILEDMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(150), new FixedDelayStrategy(2)))
                .withExecutorService(executorService).build();
    }

    public void shutdown() {
        executorService.shutdown();
    }
}
