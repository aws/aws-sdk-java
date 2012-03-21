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

/**
 * For the sake of the example WebServer depends on both AppServers and Databases.
 * 
 * @author fateev
 */
public class WebServer extends DeployableBase {
    
    private List<Database> databases;
    
    private List<AppServer> appServers;
    
    @Autowired
    private DeploymentActivitiesClient activities;

    public List<Database> getDatabases() {
        return databases;
    }

    public void setDatabases(List<Database> databases) {
        this.databases = databases;
    }

    public List<AppServer> getAppServers() {
        return appServers;
    }
    
    public void setAppServers(List<AppServer> appServers) {
        this.appServers = appServers;
    }

    @PostConstruct
    public void init() {
        addDependsOn(databases);
        addDependsOn(appServers);
    }
    
    @Override
    protected Promise<String> deploySelf() {
        List<String> dataSources = new ArrayList<String>();
        for (Database db : databases) {
            // It is safe to call Promise.get() here as deploySelf is called after
            // all components WebServer depends on are already deployed
            dataSources.add(db.getUrl().get());
        }
        List<String> appServerUrls = new ArrayList<String>();
        for (AppServer appServer : appServers) {
            // It is safe to call Promise.get() here as deploySelf is called after
            // all components WebServer depends on are already deployed
            appServerUrls.add(appServer.getUrl().get());
        }
        // Use host name as taskList to route request to appropriate host
        ActivitySchedulingOptions options = new ActivitySchedulingOptions();
        options.setTaskList(getHost());
        return activities.deployWebServer(appServerUrls, dataSources, options);
    }
    
}
