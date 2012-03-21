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
package com.amazonaws.services.simpleworkflow.flow;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.List;
import java.util.concurrent.TimeUnit;

import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow;
import com.amazonaws.services.simpleworkflow.flow.generic.ActivityImplementation;
import com.amazonaws.services.simpleworkflow.flow.pojo.POJOActivityImplementationFactory;
import com.amazonaws.services.simpleworkflow.flow.worker.GenericActivityWorker;
import com.amazonaws.services.simpleworkflow.model.ActivityType;

public class ActivityWorker implements WorkerBase {

    private final GenericActivityWorker genericWorker;

    private final POJOActivityImplementationFactory factory = new POJOActivityImplementationFactory();

    public ActivityWorker(AmazonSimpleWorkflow service, String domain, String taskListToPoll) {
        genericWorker = new GenericActivityWorker(service, domain, taskListToPoll);
        genericWorker.setActivityImplementationFactory(factory);
    }

    public void setActivitiesImplementations(Iterable<Object> activitiesImplementations)
            throws InstantiationException, IllegalAccessException, SecurityException, NoSuchMethodException {
        factory.setActivitiesImplementations(activitiesImplementations);
    }

    public Iterable<Object> getActivitiesImplementations() {
        return factory.getActivitiesImplementations();
    }

    public List<ActivityType> addActivitiesImplementations(Iterable<Object> activitiesImplementations)
            throws InstantiationException, IllegalAccessException, SecurityException, NoSuchMethodException {
        return factory.addActivitiesImplementations(activitiesImplementations);
    }

    public List<ActivityType> addActivitiesImplementations(Iterable<Object> activitiesImplementations, DataConverter dataConverter)
            throws InstantiationException, IllegalAccessException, SecurityException, NoSuchMethodException {
        return factory.addActivitiesImplementations(activitiesImplementations, dataConverter);
    }

    public List<ActivityType> addActivitiesImplementation(Object activitiesImplementation)
            throws InstantiationException, IllegalAccessException, SecurityException, NoSuchMethodException {
        return factory.addActivitiesImplementation(activitiesImplementation);
    }

    public List<ActivityType> addActivitiesImplementation(Object activitiesImplementation, DataConverter converter)
            throws InstantiationException, IllegalAccessException, SecurityException, NoSuchMethodException {
        return factory.addActivitiesImplementation(activitiesImplementation, converter);
    }

    public Iterable<ActivityType> getActivityTypesToRegister() {
        return factory.getActivityTypesToRegister();
    }

    public ActivityImplementation getActivityImplementation(ActivityType activityType) {
        return factory.getActivityImplementation(activityType);
    }

    public DataConverter getDataConverter() {
        return factory.getDataConverter();
    }

    public void setDataConverter(DataConverter dataConverter) {
        factory.setDataConverter(dataConverter);
    }

    public int getTaskExecutorThreadPoolSize() {
        return genericWorker.getTaskExecutorThreadPoolSize();
    }

    public void setTaskExecutorThreadPoolSize(int taskExecutorThreadPoolSize) {
        genericWorker.setTaskExecutorThreadPoolSize(taskExecutorThreadPoolSize);
    }

    @Override
    public boolean shutdownAndAwaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
        return genericWorker.shutdownAndAwaitTermination(timeout, unit);
    }

    @Override
    public void shutdownNow() {
        genericWorker.shutdownNow();
    }

    @Override
    public AmazonSimpleWorkflow getService() {
        return genericWorker.getService();
    }

    @Override
    public String getDomain() {
        return genericWorker.getDomain();
    }

    @Override
    public boolean isRegisterDomain() {
        return genericWorker.isRegisterDomain();
    }

    @Override
    public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
        return genericWorker.awaitTermination(timeout, unit);
    }

    @Override
    public void setRegisterDomain(boolean registerDomain) {
        genericWorker.setRegisterDomain(registerDomain);
    }

    @Override
    public long getDomainRetentionPeriodInDays() {
        return genericWorker.getDomainRetentionPeriodInDays();
    }

    @Override
    public void setDomainRetentionPeriodInDays(long days) {
        genericWorker.setDomainRetentionPeriodInDays(days);
    }

    @Override
    public String getTaskListToPoll() {
        return genericWorker.getTaskListToPoll();
    }

    @Override
    public double getMaximumPollRatePerSecond() {
        return genericWorker.getMaximumPollRatePerSecond();
    }

    @Override
    public void setMaximumPollRatePerSecond(double maximumPollRatePerSecond) {
        genericWorker.setMaximumPollRatePerSecond(maximumPollRatePerSecond);
    }

    @Override
    public int getMaximumPollRateIntervalMilliseconds() {
        return genericWorker.getMaximumPollRateIntervalMilliseconds();
    }

    @Override
    public void setMaximumPollRateIntervalMilliseconds(int maximumPollRateIntervalMilliseconds) {
        genericWorker.setMaximumPollRateIntervalMilliseconds(maximumPollRateIntervalMilliseconds);
    }

    @Override
    public UncaughtExceptionHandler getUncaughtExceptionHandler() {
        return genericWorker.getUncaughtExceptionHandler();
    }

    @Override
    public void setUncaughtExceptionHandler(UncaughtExceptionHandler uncaughtExceptionHandler) {
        genericWorker.setUncaughtExceptionHandler(uncaughtExceptionHandler);
    }

    @Override
    public String getIdentity() {
        return genericWorker.getIdentity();
    }

    @Override
    public void setIdentity(String identity) {
        genericWorker.setIdentity(identity);
    }

    @Override
    public long getPollBackoffInitialInterval() {
        return genericWorker.getPollBackoffInitialInterval();
    }

    @Override
    public void setPollBackoffInitialInterval(long backoffInitialInterval) {
        genericWorker.setPollBackoffInitialInterval(backoffInitialInterval);
    }

    @Override
    public long getPollBackoffMaximumInterval() {
        return genericWorker.getPollBackoffMaximumInterval();
    }

    @Override
    public void setPollBackoffMaximumInterval(long backoffMaximumInterval) {
        genericWorker.setPollBackoffMaximumInterval(backoffMaximumInterval);
    }

    @Override
    public boolean isDisableServiceShutdownOnStop() {
        return genericWorker.isDisableServiceShutdownOnStop();
    }

    @Override
    public void setDisableServiceShutdownOnStop(boolean disableServiceShutdownOnStop) {
        genericWorker.setDisableServiceShutdownOnStop(disableServiceShutdownOnStop);
    }

    @Override
    public double getPollBackoffCoefficient() {
        return genericWorker.getPollBackoffCoefficient();
    }

    @Override
    public void setPollBackoffCoefficient(double backoffCoefficient) {
        genericWorker.setPollBackoffCoefficient(backoffCoefficient);
    }

    @Override
    public int getPollThreadCount() {
        return genericWorker.getPollThreadCount();
    }

    @Override
    public void setPollThreadCount(int threadCount) {
        genericWorker.setPollThreadCount(threadCount);
    }

    @Override
    public void registerTypesToPoll() {
        genericWorker.registerTypesToPoll();
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
    public boolean isRunning() {
        return genericWorker.isRunning();
    }

    @Override
    public void suspendPolling() {
        genericWorker.suspendPolling();
    }

    @Override
    public void resumePolling() {
        genericWorker.resumePolling();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "[genericWorker=" + genericWorker + ", factory=" + factory + "]";
    }

}
