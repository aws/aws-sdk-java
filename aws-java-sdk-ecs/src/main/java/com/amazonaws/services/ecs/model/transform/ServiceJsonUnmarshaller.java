/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.ecs.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.ecs.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Service JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceJsonUnmarshaller implements Unmarshaller<Service, JsonUnmarshallerContext> {

    public Service unmarshall(JsonUnmarshallerContext context) throws Exception {
        Service service = new Service();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("serviceArn", targetDepth)) {
                    context.nextToken();
                    service.setServiceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("serviceName", targetDepth)) {
                    context.nextToken();
                    service.setServiceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("clusterArn", targetDepth)) {
                    context.nextToken();
                    service.setClusterArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("loadBalancers", targetDepth)) {
                    context.nextToken();
                    service.setLoadBalancers(new ListUnmarshaller<LoadBalancer>(LoadBalancerJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("serviceRegistries", targetDepth)) {
                    context.nextToken();
                    service.setServiceRegistries(new ListUnmarshaller<ServiceRegistry>(ServiceRegistryJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    service.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("desiredCount", targetDepth)) {
                    context.nextToken();
                    service.setDesiredCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("runningCount", targetDepth)) {
                    context.nextToken();
                    service.setRunningCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("pendingCount", targetDepth)) {
                    context.nextToken();
                    service.setPendingCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("launchType", targetDepth)) {
                    context.nextToken();
                    service.setLaunchType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("platformVersion", targetDepth)) {
                    context.nextToken();
                    service.setPlatformVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("taskDefinition", targetDepth)) {
                    context.nextToken();
                    service.setTaskDefinition(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("deploymentConfiguration", targetDepth)) {
                    context.nextToken();
                    service.setDeploymentConfiguration(DeploymentConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("taskSets", targetDepth)) {
                    context.nextToken();
                    service.setTaskSets(new ListUnmarshaller<TaskSet>(TaskSetJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("deployments", targetDepth)) {
                    context.nextToken();
                    service.setDeployments(new ListUnmarshaller<Deployment>(DeploymentJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("roleArn", targetDepth)) {
                    context.nextToken();
                    service.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("events", targetDepth)) {
                    context.nextToken();
                    service.setEvents(new ListUnmarshaller<ServiceEvent>(ServiceEventJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    service.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("placementConstraints", targetDepth)) {
                    context.nextToken();
                    service.setPlacementConstraints(new ListUnmarshaller<PlacementConstraint>(PlacementConstraintJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("placementStrategy", targetDepth)) {
                    context.nextToken();
                    service.setPlacementStrategy(new ListUnmarshaller<PlacementStrategy>(PlacementStrategyJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("networkConfiguration", targetDepth)) {
                    context.nextToken();
                    service.setNetworkConfiguration(NetworkConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("healthCheckGracePeriodSeconds", targetDepth)) {
                    context.nextToken();
                    service.setHealthCheckGracePeriodSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("schedulingStrategy", targetDepth)) {
                    context.nextToken();
                    service.setSchedulingStrategy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("deploymentController", targetDepth)) {
                    context.nextToken();
                    service.setDeploymentController(DeploymentControllerJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    service.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("createdBy", targetDepth)) {
                    context.nextToken();
                    service.setCreatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("enableECSManagedTags", targetDepth)) {
                    context.nextToken();
                    service.setEnableECSManagedTags(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("propagateTags", targetDepth)) {
                    context.nextToken();
                    service.setPropagateTags(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return service;
    }

    private static ServiceJsonUnmarshaller instance;

    public static ServiceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ServiceJsonUnmarshaller();
        return instance;
    }
}
