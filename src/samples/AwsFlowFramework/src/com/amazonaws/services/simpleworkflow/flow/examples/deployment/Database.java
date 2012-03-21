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

import org.springframework.beans.factory.annotation.Autowired;

import com.amazonaws.services.simpleworkflow.flow.ActivitySchedulingOptions;
import com.amazonaws.services.simpleworkflow.flow.core.Promise;

public class Database extends DeployableBase {

    @Autowired
    private DeploymentActivitiesClient activities;

    @Override
    protected Promise<String> deploySelf() {
        // Use host name as taskList to route request to appropriate host
        ActivitySchedulingOptions options = new ActivitySchedulingOptions();
        options.setTaskList(getHost());
        return activities.deployDatabase(options);
    }

}
