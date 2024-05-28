/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.deadline.waiters;

import javax.annotation.Generated;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.deadline.AWSDeadline;
import com.amazonaws.services.deadline.model.*;
import com.amazonaws.waiters.*;

import java.util.concurrent.ExecutorService;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSDeadlineWaiters {

    /**
     * Represents the service client
     */
    private final AWSDeadline client;

    private final ExecutorService executorService = WaiterExecutorServiceFactory.buildExecutorServiceForWaiter("AWSDeadlineWaiters");

    /**
     * Constructs a new AWSDeadlineWaiters with the given client
     * 
     * @param client
     *        Service client
     */
    @SdkInternalApi
    public AWSDeadlineWaiters(AWSDeadline client) {
        this.client = client;
    }

    /**
     * Builds a QueueScheduling waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetQueueRequest> queueScheduling() {

        return new WaiterBuilder<GetQueueRequest, GetQueueResult>().withSdkFunction(new GetQueueFunction(client))
                .withAcceptors(new QueueScheduling.IsSCHEDULINGMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(70), new FixedDelayStrategy(10)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a JobCreateComplete waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetJobRequest> jobCreateComplete() {

        return new WaiterBuilder<GetJobRequest, GetJobResult>()
                .withSdkFunction(new GetJobFunction(client))
                .withAcceptors(new JobCreateComplete.IsCREATE_COMPLETEMatcher(), new JobCreateComplete.IsUPDATE_IN_PROGRESSMatcher(),
                        new JobCreateComplete.IsUPDATE_FAILEDMatcher(), new JobCreateComplete.IsUPDATE_SUCCEEDEDMatcher(),
                        new JobCreateComplete.IsUPLOAD_FAILEDMatcher(), new JobCreateComplete.IsCREATE_FAILEDMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(120), new FixedDelayStrategy(1)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a QueueFleetAssociationStopped waiter by using custom parameters waiterParameters and other parameters
     * defined in the waiters specification, and then polls until it determines whether the resource entered the desired
     * state or not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetQueueFleetAssociationRequest> queueFleetAssociationStopped() {

        return new WaiterBuilder<GetQueueFleetAssociationRequest, GetQueueFleetAssociationResult>()
                .withSdkFunction(new GetQueueFleetAssociationFunction(client)).withAcceptors(new QueueFleetAssociationStopped.IsSTOPPEDMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(60), new FixedDelayStrategy(10)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a FleetActive waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetFleetRequest> fleetActive() {

        return new WaiterBuilder<GetFleetRequest, GetFleetResult>().withSdkFunction(new GetFleetFunction(client))
                .withAcceptors(new FleetActive.IsACTIVEMatcher(), new FleetActive.IsCREATE_FAILEDMatcher(), new FleetActive.IsUPDATE_FAILEDMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(180), new FixedDelayStrategy(5)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a LicenseEndpointDeleted waiter by using custom parameters waiterParameters and other parameters defined
     * in the waiters specification, and then polls until it determines whether the resource entered the desired state
     * or not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetLicenseEndpointRequest> licenseEndpointDeleted() {

        return new WaiterBuilder<GetLicenseEndpointRequest, GetLicenseEndpointResult>().withSdkFunction(new GetLicenseEndpointFunction(client))
                .withAcceptors(new LicenseEndpointDeleted.IsResourceNotFoundExceptionMatcher(), new LicenseEndpointDeleted.IsNOT_READYMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(234), new FixedDelayStrategy(10)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a QueueSchedulingBlocked waiter by using custom parameters waiterParameters and other parameters defined
     * in the waiters specification, and then polls until it determines whether the resource entered the desired state
     * or not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetQueueRequest> queueSchedulingBlocked() {

        return new WaiterBuilder<GetQueueRequest, GetQueueResult>().withSdkFunction(new GetQueueFunction(client))
                .withAcceptors(new QueueSchedulingBlocked.IsSCHEDULING_BLOCKEDMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(30), new FixedDelayStrategy(10)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a LicenseEndpointValid waiter by using custom parameters waiterParameters and other parameters defined in
     * the waiters specification, and then polls until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetLicenseEndpointRequest> licenseEndpointValid() {

        return new WaiterBuilder<GetLicenseEndpointRequest, GetLicenseEndpointResult>().withSdkFunction(new GetLicenseEndpointFunction(client))
                .withAcceptors(new LicenseEndpointValid.IsREADYMatcher(), new LicenseEndpointValid.IsNOT_READYMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(114), new FixedDelayStrategy(10)))
                .withExecutorService(executorService).build();
    }

    public void shutdown() {
        executorService.shutdown();
    }
}
