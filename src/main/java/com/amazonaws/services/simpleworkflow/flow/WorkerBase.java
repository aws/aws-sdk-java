/*
 * Copyright 2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleworkflow.flow;

import java.lang.Thread.UncaughtExceptionHandler;

import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow;

public interface WorkerBase extends SuspendableWorker {

    AmazonSimpleWorkflow getService();

    String getDomain();

    boolean isRegisterDomain();

    void setRegisterDomain(boolean registerDomain);

    long getDomainRetentionPeriodInDays();

    void setDomainRetentionPeriodInDays(long domainRetentionPeriodInDays);

    String getTaskListToPoll();

    double getMaximumPollRatePerSecond();

    void setMaximumPollRatePerSecond(double maximumPollRatePerSecond);

    int getMaximumPollRateIntervalMilliseconds();

    void setMaximumPollRateIntervalMilliseconds(int maximumPollRateIntervalMilliseconds);

    UncaughtExceptionHandler getUncaughtExceptionHandler();

    void setUncaughtExceptionHandler(UncaughtExceptionHandler uncaughtExceptionHandler);

    String getIdentity();

    void setIdentity(String identity);

    long getPollBackoffInitialInterval();

    void setPollBackoffInitialInterval(long backoffInitialInterval);

    long getPollBackoffMaximumInterval();

    void setPollBackoffMaximumInterval(long backoffMaximumInterval);

    boolean isDisableServiceShutdownOnStop();

    void setDisableServiceShutdownOnStop(boolean disableServiceShutdownOnStop);

    double getPollBackoffCoefficient();

    void setPollBackoffCoefficient(double backoffCoefficient);

    int getPollThreadCount();

    void setPollThreadCount(int threadCount);

    void registerTypesToPoll();

    boolean isRunning();

}
