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

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import com.amazonaws.services.simpleworkflow.flow.ActivitySchedulingOptions;
import com.amazonaws.services.simpleworkflow.flow.core.Promise;


public class AppServer extends DeployableBase {

    private List<Database> databases;
    
    @Autowired
    private DeploymentActivitiesClient activities;

    public List<Database> getDatabases() {
        return databases;
    }
    
    public void setDatabases(List<Database> databases) {
        this.databases = databases;
    }

    @PostConstruct
    public void init() {
        addDependsOn(databases);
    }
    
    @Override
    protected Promise<String> deploySelf() {
        List<String> dataSources = new ArrayList<String>();
        for (Database db : databases) {
            // It is safe to call Promise.get() here as deploySelf is called after
            // all Databases AppServer depends on are already deployed
            dataSources.add(db.getUrl().get());
        }
        // Use host name as taskList to route request to appropriate host
        ActivitySchedulingOptions options = new ActivitySchedulingOptions();
        options.setTaskList(getHost());
        return activities.deployAppServer(dataSources, options);
    }
    
}
