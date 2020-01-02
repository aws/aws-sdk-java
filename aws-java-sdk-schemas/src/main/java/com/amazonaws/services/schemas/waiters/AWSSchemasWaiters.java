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
package com.amazonaws.services.schemas.waiters;

import javax.annotation.Generated;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.schemas.AWSSchemas;
import com.amazonaws.services.schemas.model.*;
import com.amazonaws.waiters.*;

import java.util.concurrent.ExecutorService;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSSchemasWaiters {

    /**
     * Represents the service client
     */
    private final AWSSchemas client;

    private final ExecutorService executorService = WaiterExecutorServiceFactory.buildExecutorServiceForWaiter("AWSSchemasWaiters");

    /**
     * Constructs a new AWSSchemasWaiters with the given client
     * 
     * @param client
     *        Service client
     */
    @SdkInternalApi
    public AWSSchemasWaiters(AWSSchemas client) {
        this.client = client;
    }

    /**
     * Builds a CodeBindingExists waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeCodeBindingRequest> codeBindingExists() {

        return new WaiterBuilder<DescribeCodeBindingRequest, DescribeCodeBindingResult>()
                .withSdkFunction(new DescribeCodeBindingFunction(client))
                .withAcceptors(new CodeBindingExists.IsCREATE_COMPLETEMatcher(), new CodeBindingExists.IsCREATE_IN_PROGRESSMatcher(),
                        new CodeBindingExists.IsCREATE_FAILEDMatcher(), new CodeBindingExists.IsNotFoundExceptionMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(30), new FixedDelayStrategy(2)))
                .withExecutorService(executorService).build();
    }

    public void shutdown() {
        executorService.shutdown();
    }
}
