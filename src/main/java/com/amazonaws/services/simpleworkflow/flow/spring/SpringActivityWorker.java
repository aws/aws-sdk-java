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
package com.amazonaws.services.simpleworkflow.flow.spring;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.context.SmartLifecycle;

import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow;
import com.amazonaws.services.simpleworkflow.flow.DataConverter;
import com.amazonaws.services.simpleworkflow.flow.WorkerBase;
import com.amazonaws.services.simpleworkflow.flow.pojo.POJOActivityImplementationFactory;
import com.amazonaws.services.simpleworkflow.flow.worker.GenericActivityWorker;
import com.amazonaws.services.simpleworkflow.model.ActivityType;

public class SpringActivityWorker implements WorkerBase, SmartLifecycle {
    
    private final GenericActivityWorker genericWorker;
    
    private final POJOActivityImplementationFactory factory = new POJOActivityImplementationFactory(); 

    private int startPhase;

    private long terminationTimeoutSeconds = 60;

    private boolean disableAutoStartup;
    
    public SpringActivityWorker() {
        genericWorker = new GenericActivityWorker();
        genericWorker.setActivityImplementationFactory(factory);
    }

    public SpringActivityWorker(AmazonSimpleWorkflow service, String domain, String taskListToPoll) {
        genericWorker = new GenericActivityWorker(service, domain, taskListToPoll);
        genericWorker.setActivityImplementationFactory(factory);
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
        return factory.getDataConverter();
    }

    public void setDataConverter(DataConverter dataConverter) {
        factory.setDataConverter(dataConverter);
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

    public String getIdentity() {
        return genericWorker.getIdentity();
    }
    
    public void setIdentity(String identity) {
        genericWorker.setIdentity(identity);
    }
    
    public UncaughtExceptionHandler getUncaughtExceptionHandler() {
        return genericWorker.getUncaughtExceptionHandler();
    }

    public void setUncaughtExceptionHandler(UncaughtExceptionHandler uncaughtExceptionHandler) {
        genericWorker.setUncaughtExceptionHandler(uncaughtExceptionHandler);
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
    
    public int getTaskExecutorThreadPoolSize() {
        return genericWorker.getTaskExecutorThreadPoolSize();
    }

    public void setTaskExecutorThreadPoolSize(int taskExecutorThreadPoolSize) {
        genericWorker.setTaskExecutorThreadPoolSize(taskExecutorThreadPoolSize);
    }
    
    public boolean isDisableServiceShutdownOnStop() {
        return genericWorker.isDisableServiceShutdownOnStop();
    }
    
    public void setDisableServiceShutdownOnStop(boolean disableServiceShutdownOnStop) {
        genericWorker.setDisableServiceShutdownOnStop(disableServiceShutdownOnStop);
    }
    
    public void suspendPolling() {
        genericWorker.suspendPolling();
    }

    public void resumePolling() {
        genericWorker.resumePolling();
    }
    
    @Override
    public void start() {
        genericWorker.start();
    }
    
    public void stopNow() {
        genericWorker.shutdownNow();
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
    public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
        return genericWorker.awaitTermination(timeout, unit);
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
    
    public boolean isRunning() {
        return genericWorker.isRunning();
    }
    
    public void setActivitiesImplementations(Iterable<Object> activitiesImplementations)
            throws InstantiationException, IllegalAccessException, SecurityException, NoSuchMethodException {
        for (Object activitiesImplementation : activitiesImplementations) {
            addActivitiesImplementation(activitiesImplementation);
        }
    }
    
    public Iterable<Object> getActivitiesImplementations() {
        return factory.getActivitiesImplementations();
    }
    
    public List<ActivityType> addActivitiesImplementation(Object activitiesImplementation)
            throws InstantiationException, IllegalAccessException, SecurityException, NoSuchMethodException {
        return factory.addActivitiesImplementation(activitiesImplementation);
    }

    @Override
    public void registerTypesToPoll() {
        genericWorker.registerTypesToPoll();
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
    public String toString() {
        return this.getClass().getSimpleName() + "[genericWorker=" + genericWorker + ", factory=" + factory + "]";
    }


}
