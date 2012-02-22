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

public class DeploymentActivitiesImpl implements DeploymentActivities {

    @Override
    public String deployDatabase() {
        return "jdbc:foo/bar";
    }

    @Override
    public String deployAppServer(List<String> dataSources) {
        return "http://baz";
    }

    @Override
    public String deployWebServer(List<String> appServerUrls, List<String> dataSources) {
        return "http://webserver";
    }

    @Override
    public String deployLoadBalancer(List<String> frontendUrls) {
        return "http://myweb.com";
    }

}
