/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lexmodelsv2.waiters;

import javax.annotation.Generated;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.lexmodelsv2.AmazonLexModelsV2;
import com.amazonaws.services.lexmodelsv2.model.*;
import com.amazonaws.waiters.*;

import java.util.concurrent.ExecutorService;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonLexModelsV2Waiters {

    /**
     * Represents the service client
     */
    private final AmazonLexModelsV2 client;

    private final ExecutorService executorService = WaiterExecutorServiceFactory.buildExecutorServiceForWaiter("AmazonLexModelsV2Waiters");

    /**
     * Constructs a new AmazonLexModelsV2Waiters with the given client
     * 
     * @param client
     *        Service client
     */
    @SdkInternalApi
    public AmazonLexModelsV2Waiters(AmazonLexModelsV2 client) {
        this.client = client;
    }

    /**
     * Builds a BotExportCompleted waiter by using custom parameters waiterParameters and other parameters defined in
     * the waiters specification, and then polls until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeExportRequest> botExportCompleted() {

        return new WaiterBuilder<DescribeExportRequest, DescribeExportResult>()
                .withSdkFunction(new DescribeExportFunction(client))
                .withAcceptors(new BotExportCompleted.IsCompletedMatcher(), new BotExportCompleted.IsDeletingMatcher(),
                        new BotExportCompleted.IsFailedMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(35), new FixedDelayStrategy(10)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a BotAvailable waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeBotRequest> botAvailable() {

        return new WaiterBuilder<DescribeBotRequest, DescribeBotResult>()
                .withSdkFunction(new DescribeBotFunction(client))
                .withAcceptors(new BotAvailable.IsAvailableMatcher(), new BotAvailable.IsDeletingMatcher(), new BotAvailable.IsFailedMatcher(),
                        new BotAvailable.IsInactiveMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(35), new FixedDelayStrategy(10)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a BotAliasAvailable waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeBotAliasRequest> botAliasAvailable() {

        return new WaiterBuilder<DescribeBotAliasRequest, DescribeBotAliasResult>().withSdkFunction(new DescribeBotAliasFunction(client))
                .withAcceptors(new BotAliasAvailable.IsAvailableMatcher(), new BotAliasAvailable.IsFailedMatcher(), new BotAliasAvailable.IsDeletingMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(35), new FixedDelayStrategy(10)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a BotImportCompleted waiter by using custom parameters waiterParameters and other parameters defined in
     * the waiters specification, and then polls until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeImportRequest> botImportCompleted() {

        return new WaiterBuilder<DescribeImportRequest, DescribeImportResult>()
                .withSdkFunction(new DescribeImportFunction(client))
                .withAcceptors(new BotImportCompleted.IsCompletedMatcher(), new BotImportCompleted.IsDeletingMatcher(),
                        new BotImportCompleted.IsFailedMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(35), new FixedDelayStrategy(10)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a BotVersionAvailable waiter by using custom parameters waiterParameters and other parameters defined in
     * the waiters specification, and then polls until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeBotVersionRequest> botVersionAvailable() {

        return new WaiterBuilder<DescribeBotVersionRequest, DescribeBotVersionResult>()
                .withSdkFunction(new DescribeBotVersionFunction(client))
                .withAcceptors(new BotVersionAvailable.IsAvailableMatcher(), new BotVersionAvailable.IsDeletingMatcher(),
                        new BotVersionAvailable.IsFailedMatcher(), new HttpFailureStatusAcceptor(404, WaiterState.RETRY))
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(35), new FixedDelayStrategy(10)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a BotLocaleExpressTestingAvailable waiter by using custom parameters waiterParameters and other parameters
     * defined in the waiters specification, and then polls until it determines whether the resource entered the desired
     * state or not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeBotLocaleRequest> botLocaleExpressTestingAvailable() {

        return new WaiterBuilder<DescribeBotLocaleRequest, DescribeBotLocaleResult>()
                .withSdkFunction(new DescribeBotLocaleFunction(client))
                .withAcceptors(new BotLocaleExpressTestingAvailable.IsBuiltMatcher(), new BotLocaleExpressTestingAvailable.IsReadyExpressTestingMatcher(),
                        new BotLocaleExpressTestingAvailable.IsDeletingMatcher(), new BotLocaleExpressTestingAvailable.IsFailedMatcher(),
                        new BotLocaleExpressTestingAvailable.IsNotBuiltMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(35), new FixedDelayStrategy(10)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a BotLocaleBuilt waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeBotLocaleRequest> botLocaleBuilt() {

        return new WaiterBuilder<DescribeBotLocaleRequest, DescribeBotLocaleResult>()
                .withSdkFunction(new DescribeBotLocaleFunction(client))
                .withAcceptors(new BotLocaleBuilt.IsBuiltMatcher(), new BotLocaleBuilt.IsDeletingMatcher(), new BotLocaleBuilt.IsFailedMatcher(),
                        new BotLocaleBuilt.IsNotBuiltMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(35), new FixedDelayStrategy(10)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a BotLocaleCreated waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeBotLocaleRequest> botLocaleCreated() {

        return new WaiterBuilder<DescribeBotLocaleRequest, DescribeBotLocaleResult>()
                .withSdkFunction(new DescribeBotLocaleFunction(client))
                .withAcceptors(new BotLocaleCreated.IsBuiltMatcher(), new BotLocaleCreated.IsReadyExpressTestingMatcher(),
                        new BotLocaleCreated.IsNotBuiltMatcher(), new BotLocaleCreated.IsDeletingMatcher(), new BotLocaleCreated.IsFailedMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(35), new FixedDelayStrategy(10)))
                .withExecutorService(executorService).build();
    }

    public void shutdown() {
        executorService.shutdown();
    }
}
