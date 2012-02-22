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
package com.amazonaws.services.simpleworkflow.flow.examples.deployment;

import java.util.List;

import com.amazonaws.services.simpleworkflow.flow.annotations.Activities;
import com.amazonaws.services.simpleworkflow.flow.annotations.ActivityRegistrationOptions;
import com.amazonaws.services.simpleworkflow.flow.common.FlowConstants;

@Activities(version = "1.0")
// NO_DEFAULT_TASK_LIST mandates that task list is specified when activity is called
@ActivityRegistrationOptions(defaultTaskList = FlowConstants.NO_DEFAULT_TASK_LIST,
        defaultTaskScheduleToStartTimeoutSeconds = 300, defaultTaskStartToCloseTimeoutSeconds = 300)
public interface DeploymentActivities {

    /**
     * @return dataSource
     */
    public String deployDatabase();

    /**
     * @param dataSources
     *            used to access database
     * @return URL used to access appserver
     */
    public String deployAppServer(List<String> dataSources);

    /**
     * @param dataSource
     *            dataSources used to access database
     * @param appServerUrls
     *            URLs used to access appservers
     * @return URL used to access webserver
     */
    public String deployWebServer(List<String> appServerUrls, List<String> dataSources);
    
    /**
     * @param frontendUrls URLs used to acccess frontends
     * @return URL for the load balancer
     */
    public String deployLoadBalancer(List<String> frontendUrls);

}
