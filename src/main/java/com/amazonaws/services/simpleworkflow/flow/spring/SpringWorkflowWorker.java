/*
 * Copyright 2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpleworkflow.flow.spring;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.TimeUnit;

import org.springframework.context.SmartLifecycle;

import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow;
import com.amazonaws.services.simpleworkflow.flow.DataConverter;
import com.amazonaws.services.simpleworkflow.flow.WorkerBase;
import com.amazonaws.services.simpleworkflow.flow.worker.GenericWorkflowWorker;
import com.amazonaws.services.simpleworkflow.model.WorkflowType;

/**
 * To be used with Spring. Assumes that injected implementation bean has
 * "workflow" scope. Otherwise the same object instance will be reused for
 * multiple decisions which is guaranteed to break replay if any instance fields
 * are used.
 */
public class SpringWorkflowWorker implements WorkerBase, SmartLifecycle {

    private final GenericWorkflowWorker genericWorker;

    private final SpringWorkflowDefinitionFactoryFactory factoryFactory = new SpringWorkflowDefinitionFactoryFactory();

    private int startPhase;

    private long terminationTimeoutSeconds = 60;

    private boolean disableAutoStartup;

    public SpringWorkflowWorker() {
        genericWorker = new GenericWorkflowWorker();
        genericWorker.setWorkflowDefinitionFactoryFactory(factoryFactory);
    }

    public SpringWorkflowWorker(AmazonSimpleWorkflow service, String domain, String taskListToPoll) {
        genericWorker = new GenericWorkflowWorker(service, domain, taskListToPoll);
        genericWorker.setWorkflowDefinitionFactoryFactory(factoryFactory);
    }

    public AmazonSimpleWorkflow getService() {
        return genericWorker.getService();
    }

    public void setService(AmazonSimpleWorkflow service) {
        genericWorker.setService(service);
    }

    public String getDomain() {
        return genericWorker.getDomain();
    }

    public void setDomain(String domain) {
        genericWorker.setDomain(domain);
    }

    public boolean isRegisterDomain() {
        return genericWorker.isRegisterDomain();
    }

    public void setRegisterDomain(boolean registerDomain) {
        genericWorker.setRegisterDomain(registerDomain);
    }

    public long getDomainRetentionPeriodInDays() {
        return genericWorker.getDomainRetentionPeriodInDays();
    }

    public void setDomainRetentionPeriodInDays(long domainRetentionPeriodInDays) {
        genericWorker.setDomainRetentionPeriodInDays(domainRetentionPeriodInDays);
    }

    public String getTaskListToPoll() {
        return genericWorker.getTaskListToPoll();
    }

    public void setTaskListToPoll(String taskListToPoll) {
        genericWorker.setTaskListToPoll(taskListToPoll);
    }

    public DataConverter getDataConverter() {
        return factoryFactory.getDataConverter();
    }

    public void setDataConverter(DataConverter converter) {
        factoryFactory.setDataConverter(converter);
    }

    public double getMaximumPollRatePerSecond() {
        return genericWorker.getMaximumPollRatePerSecond();
    }

    public void setMaximumPollRatePerSecond(double maximumPollRatePerSecond) {
        genericWorker.setMaximumPollRatePerSecond(maximumPollRatePerSecond);
    }

    public int getMaximumPollRateIntervalMilliseconds() {
        return genericWorker.getMaximumPollRateIntervalMilliseconds();
    }

    public void setMaximumPollRateIntervalMilliseconds(int maximumPollRateIntervalMilliseconds) {
        genericWorker.setMaximumPollRateIntervalMilliseconds(maximumPollRateIntervalMilliseconds);
    }

    public UncaughtExceptionHandler getUncaughtExceptionHandler() {
        return genericWorker.getUncaughtExceptionHandler();
    }

    public void setUncaughtExceptionHandler(UncaughtExceptionHandler uncaughtExceptionHandler) {
        genericWorker.setUncaughtExceptionHandler(uncaughtExceptionHandler);
    }

    public String getIdentity() {
        return genericWorker.getIdentity();
    }

    public void setIdentity(String identity) {
        genericWorker.setIdentity(identity);
    }

    public long getPollBackoffInitialInterval() {
        return genericWorker.getPollBackoffInitialInterval();
    }

    public void setPollBackoffInitialInterval(long backoffInitialInterval) {
        genericWorker.setPollBackoffInitialInterval(backoffInitialInterval);
    }

    public long getPollBackoffMaximumInterval() {
        return genericWorker.getPollBackoffMaximumInterval();
    }

    public void setPollBackoffMaximumInterval(long backoffMaximumInterval) {
        genericWorker.setPollBackoffMaximumInterval(backoffMaximumInterval);
    }

    public boolean isDisableServiceShutdownOnStop() {
        return genericWorker.isDisableServiceShutdownOnStop();
    }

    public void setDisableServiceShutdownOnStop(boolean disableServiceShutdownOnStop) {
        genericWorker.setDisableServiceShutdownOnStop(disableServiceShutdownOnStop);
    }

    public double getPollBackoffCoefficient() {
        return genericWorker.getPollBackoffCoefficient();
    }

    public void setPollBackoffCoefficient(double backoffCoefficient) {
        genericWorker.setPollBackoffCoefficient(backoffCoefficient);
    }

    public int getPollThreadCount() {
        return genericWorker.getPollThreadCount();
    }

    public void setPollThreadCount(int threadCount) {
        genericWorker.setPollThreadCount(threadCount);
    }

    public void suspendPolling() {
        genericWorker.suspendPolling();
    }

    public void resumePolling() {
        genericWorker.resumePolling();
    }

    public Iterable<WorkflowType> getWorkflowTypesToRegister() {
        return factoryFactory.getWorkflowTypesToRegister();
    }

    @Override
    public void start() {
        genericWorker.start();
    }

    @Override
    public void shutdown() {
        genericWorker.shutdown();
    }

    @Override
    public void shutdownNow() {
        genericWorker.shutdownNow();
    }

    @Override
    public boolean shutdownAndAwaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
        return genericWorker.shutdownAndAwaitTermination(timeout, unit);
    }

    public void stopNow() {
        genericWorker.shutdownNow();
    }

    public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
        return genericWorker.awaitTermination(timeout, unit);
    }

    public void setWorkflowImplementations(Iterable<Object> workflowImplementations)
            throws InstantiationException, IllegalAccessException {
        for (Object workflowImplementation : workflowImplementations) {
            addWorkflowImplementation(workflowImplementation);
        }
    }

    public Iterable<Object> getWorkflowImplementations() {
        return factoryFactory.getWorkflowImplementations();
    }

    public void addWorkflowImplementation(Object workflowImplementation) throws InstantiationException, IllegalAccessException {
        factoryFactory.addWorkflowImplementation(workflowImplementation);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "[genericWorker=" + genericWorker + ", factoryFactory=" + factoryFactory + "]";
    }

    @Override
    public void stop() {
        shutdown();
        try {
            awaitTermination(terminationTimeoutSeconds, TimeUnit.SECONDS);
        }
        catch (InterruptedException e) {
        }
    }

    @Override
    public boolean isRunning() {
        return genericWorker.isRunning();
    }

    /**
     * @return default is 0
     */
    @Override
    public int getPhase() {
        return startPhase;
    }

    public void setPhase(int startPhase) {
        this.startPhase = startPhase;
    }

    @Override
    public boolean isAutoStartup() {
        return !disableAutoStartup;
    }

    public long getTerminationTimeoutSeconds() {
        return terminationTimeoutSeconds;
    }

    public void setTerminationTimeoutSeconds(long terminationTimeoutSeconds) {
        this.terminationTimeoutSeconds = terminationTimeoutSeconds;
    }

    public boolean isDisableAutoStartup() {
        return disableAutoStartup;
    }

    public void setDisableAutoStartup(boolean disableAutoStartup) {
        this.disableAutoStartup = disableAutoStartup;
    }

    @Override
    public void stop(Runnable callback) {
        stop();
        callback.run();
    }

    @Override
    public void registerTypesToPoll() {
        genericWorker.registerTypesToPoll();
    }

}
