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
package com.amazonaws.services.glacier.waiters;

import javax.annotation.Generated;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.glacier.AmazonGlacier;
import com.amazonaws.services.glacier.model.*;
import com.amazonaws.waiters.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonGlacierWaiters {

    /**
     * Represents the service client
     */
    private final AmazonGlacier client;

    private final ExecutorService executorService = Executors.newFixedThreadPool(50);

    /**
     * Constructs a new AmazonGlacierWaiters with the given client
     * 
     * @param client
     *        Service client
     */
    @SdkInternalApi
    public AmazonGlacierWaiters(AmazonGlacier client) {
        this.client = client;
    }

    /**
     * Builds a VaultExists waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeVaultRequest> vaultExists() {

        return new WaiterBuilder<DescribeVaultRequest, DescribeVaultResult>().withSdkFunction(new DescribeVaultFunction(client))
                .withAcceptors(new HttpSuccessStatusAcceptor(WaiterState.SUCCESS), new VaultExists.IsResourceNotFoundExceptionMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(15), new FixedDelayStrategy(3)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a VaultNotExists waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeVaultRequest> vaultNotExists() {

        return new WaiterBuilder<DescribeVaultRequest, DescribeVaultResult>().withSdkFunction(new DescribeVaultFunction(client))
                .withAcceptors(new HttpSuccessStatusAcceptor(WaiterState.RETRY), new VaultNotExists.IsResourceNotFoundExceptionMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(15), new FixedDelayStrategy(3)))
                .withExecutorService(executorService).build();
    }

    public void shutdown() {
        executorService.shutdown();
    }
}
