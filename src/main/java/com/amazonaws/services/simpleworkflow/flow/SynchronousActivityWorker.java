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

import java.util.List;

import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow;
import com.amazonaws.services.simpleworkflow.flow.generic.ActivityImplementation;
import com.amazonaws.services.simpleworkflow.flow.pojo.POJOActivityImplementationFactory;
import com.amazonaws.services.simpleworkflow.flow.worker.ExponentialRetryParameters;
import com.amazonaws.services.simpleworkflow.flow.worker.GenericActivityWorker;
import com.amazonaws.services.simpleworkflow.flow.worker.SynchronousActivityTaskPoller;
import com.amazonaws.services.simpleworkflow.model.ActivityType;

public class SynchronousActivityWorker {

    private final SynchronousActivityTaskPoller poller;

    private final POJOActivityImplementationFactory factory = new POJOActivityImplementationFactory();

    public SynchronousActivityWorker() {
        poller = new SynchronousActivityTaskPoller();
        poller.setActivityImplementationFactory(factory);
    }

    public SynchronousActivityWorker(AmazonSimpleWorkflow service, String domain, String taskListToPoll) {
        poller = new SynchronousActivityTaskPoller(service, domain, taskListToPoll, factory);
    }

    public boolean pollAndProcessSingleActivityTask() throws Throwable {
        return poller.pollAndProcessSingleTask();
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

    public AmazonSimpleWorkflow getService() {
        return poller.getService();
    }

    public void setService(AmazonSimpleWorkflow service) {
        poller.setService(service);
    }

    public String getDomain() {
        return poller.getDomain();
    }

    public void setDomain(String domain) {
        poller.setDomain(domain);
    }

    public String getPollTaskList() {
        return poller.getPollTaskList();
    }

    public void setTaskListToPoll(String taskList) {
        poller.setTaskListToPoll(taskList);
    }

    public String getIdentity() {
        return poller.getIdentity();
    }

    public void setIdentity(String identity) {
        poller.setIdentity(identity);
    }

    public ExponentialRetryParameters getReportCompletionRetryParameters() {
        return poller.getReportCompletionRetryParameters();
    }

    public void setReportCompletionRetryParameters(ExponentialRetryParameters reportCompletionRetryParameters) {
        poller.setReportCompletionRetryParameters(reportCompletionRetryParameters);
    }

    public ExponentialRetryParameters getReportFailureRetryParameters() {
        return poller.getReportFailureRetryParameters();
    }

    public void setReportFailureRetryParameters(ExponentialRetryParameters reportFailureRetryParameters) {
        poller.setReportFailureRetryParameters(reportFailureRetryParameters);
    }

    public String getTaskListToPoll() {
        return poller.getTaskListToPoll();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "[poller=" + poller + ", factory=" + factory + "]";
    }

    public void registerTypesToPoll() throws Exception {
        GenericActivityWorker.registerActivityTypes(getService(), getDomain(), getTaskListToPoll(), factory);
    }
}
