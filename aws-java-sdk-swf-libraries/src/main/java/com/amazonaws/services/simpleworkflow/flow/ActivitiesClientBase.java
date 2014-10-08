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

import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.generic.GenericActivityClient;
import com.amazonaws.services.simpleworkflow.model.ActivityType;

public abstract class ActivitiesClientBase implements ActivitiesClient {

  protected DynamicActivitiesClientImpl dynamicActivitiesClient;
    
    protected ActivitiesClientBase(GenericActivityClient genericClient, DataConverter dataConverter,
            ActivitySchedulingOptions schedulingOptions) {
        this.dynamicActivitiesClient = new DynamicActivitiesClientImpl(schedulingOptions, dataConverter, genericClient);
    }

    protected <T> Promise<T> scheduleActivity(ActivityType activityType, Promise<?>[] arguments,
            ActivitySchedulingOptions optionsOverride, Class<T> returnType, Promise<?>... waitFor) {
        return dynamicActivitiesClient.scheduleActivity(activityType, arguments, optionsOverride, returnType, waitFor);
    }

    protected <T> Promise<T> scheduleActivity(ActivityType activityType, Object[] arguments,
            ActivitySchedulingOptions optionsOverride, Class<T> returnType, Promise<?>... waitFor) {
        return dynamicActivitiesClient.scheduleActivity(activityType, arguments, optionsOverride, returnType, waitFor);
    }

    @Override
    public DataConverter getDataConverter() {
        return dynamicActivitiesClient.getDataConverter();
    }

    public void setDataConverter(DataConverter converter) {
        dynamicActivitiesClient.setDataConverter(converter);
    }

    @Override
    public ActivitySchedulingOptions getSchedulingOptions() {
        return dynamicActivitiesClient.getSchedulingOptions();
    }

    public void setSchedulingOptions(ActivitySchedulingOptions schedulingOptions) {
        dynamicActivitiesClient.setSchedulingOptions(schedulingOptions);
    }

    @Override
    public GenericActivityClient getGenericClient() {
        return dynamicActivitiesClient.getGenericClient();
    }

    public void setGenericClient(GenericActivityClient genericClient) {
        dynamicActivitiesClient.setGenericClient(genericClient);
    }
}
