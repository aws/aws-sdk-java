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
package com.amazonaws.services.simpleworkflow.flow.test;

import java.util.List;

import com.amazonaws.services.simpleworkflow.flow.DataConverter;
import com.amazonaws.services.simpleworkflow.flow.generic.ActivityImplementation;
import com.amazonaws.services.simpleworkflow.flow.pojo.POJOActivityImplementationFactory;
import com.amazonaws.services.simpleworkflow.model.ActivityType;


public class TestPOJOActivityImplementationWorker {

    private final POJOActivityImplementationFactory factory = new POJOActivityImplementationFactory();

    private final String taskList;
    
    public TestPOJOActivityImplementationWorker(String taskList) {
        this.taskList = taskList;
    }

    POJOActivityImplementationFactory getFactory() {
        return factory;
    }

    public String getTaskList() {
        return taskList;
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
    
}
