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
package com.amazonaws.services.docdb.waiters;

import javax.annotation.Generated;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.docdb.AmazonDocDB;
import com.amazonaws.services.docdb.model.*;
import com.amazonaws.waiters.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonDocDBWaiters {

    /**
     * Represents the service client
     */
    private final AmazonDocDB client;

    private final ExecutorService executorService = Executors.newFixedThreadPool(50);

    /**
     * Constructs a new AmazonDocDBWaiters with the given client
     * 
     * @param client
     *        Service client
     */
    @SdkInternalApi
    public AmazonDocDBWaiters(AmazonDocDB client) {
        this.client = client;
    }

    /**
     * Builds a DBInstanceAvailable waiter by using custom parameters waiterParameters and other parameters defined in
     * the waiters specification, and then polls until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeDBInstancesRequest> dBInstanceAvailable() {

        return new WaiterBuilder<DescribeDBInstancesRequest, DescribeDBInstancesResult>()
                .withSdkFunction(new DescribeDBInstancesFunction(client))
                .withAcceptors(new DBInstanceAvailable.IsAvailableMatcher(), new DBInstanceAvailable.IsDeletedMatcher(),
                        new DBInstanceAvailable.IsDeletingMatcher(), new DBInstanceAvailable.IsFailedMatcher(),
                        new DBInstanceAvailable.IsIncompatiblerestoreMatcher(), new DBInstanceAvailable.IsIncompatibleparametersMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(60), new FixedDelayStrategy(30)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a DBInstanceDeleted waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeDBInstancesRequest> dBInstanceDeleted() {

        return new WaiterBuilder<DescribeDBInstancesRequest, DescribeDBInstancesResult>()
                .withSdkFunction(new DescribeDBInstancesFunction(client))
                .withAcceptors(new DBInstanceDeleted.IsDeletedMatcher(), new DBInstanceDeleted.IsDBInstanceNotFoundMatcher(),
                        new DBInstanceDeleted.IsCreatingMatcher(), new DBInstanceDeleted.IsModifyingMatcher(), new DBInstanceDeleted.IsRebootingMatcher(),
                        new DBInstanceDeleted.IsResettingmastercredentialsMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(60), new FixedDelayStrategy(30)))
                .withExecutorService(executorService).build();
    }

    public void shutdown() {
        executorService.shutdown();
    }
}
