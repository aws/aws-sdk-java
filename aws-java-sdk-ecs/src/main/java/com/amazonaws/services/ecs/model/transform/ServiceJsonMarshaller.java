/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ecs.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ServiceMarshaller
 */
public class ServiceJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Service service, StructuredJsonGenerator jsonGenerator) {

        if (service == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (service.getServiceArn() != null) {
                jsonGenerator.writeFieldName("serviceArn").writeValue(service.getServiceArn());
            }
            if (service.getServiceName() != null) {
                jsonGenerator.writeFieldName("serviceName").writeValue(service.getServiceName());
            }
            if (service.getClusterArn() != null) {
                jsonGenerator.writeFieldName("clusterArn").writeValue(service.getClusterArn());
            }

            com.amazonaws.internal.SdkInternalList<LoadBalancer> loadBalancersList = (com.amazonaws.internal.SdkInternalList<LoadBalancer>) service
                    .getLoadBalancers();
            if (!loadBalancersList.isEmpty() || !loadBalancersList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("loadBalancers");
                jsonGenerator.writeStartArray();
                for (LoadBalancer loadBalancersListValue : loadBalancersList) {
                    if (loadBalancersListValue != null) {

                        LoadBalancerJsonMarshaller.getInstance().marshall(loadBalancersListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (service.getStatus() != null) {
                jsonGenerator.writeFieldName("status").writeValue(service.getStatus());
            }
            if (service.getDesiredCount() != null) {
                jsonGenerator.writeFieldName("desiredCount").writeValue(service.getDesiredCount());
            }
            if (service.getRunningCount() != null) {
                jsonGenerator.writeFieldName("runningCount").writeValue(service.getRunningCount());
            }
            if (service.getPendingCount() != null) {
                jsonGenerator.writeFieldName("pendingCount").writeValue(service.getPendingCount());
            }
            if (service.getTaskDefinition() != null) {
                jsonGenerator.writeFieldName("taskDefinition").writeValue(service.getTaskDefinition());
            }
            if (service.getDeploymentConfiguration() != null) {
                jsonGenerator.writeFieldName("deploymentConfiguration");
                DeploymentConfigurationJsonMarshaller.getInstance().marshall(service.getDeploymentConfiguration(), jsonGenerator);
            }

            com.amazonaws.internal.SdkInternalList<Deployment> deploymentsList = (com.amazonaws.internal.SdkInternalList<Deployment>) service.getDeployments();
            if (!deploymentsList.isEmpty() || !deploymentsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("deployments");
                jsonGenerator.writeStartArray();
                for (Deployment deploymentsListValue : deploymentsList) {
                    if (deploymentsListValue != null) {

                        DeploymentJsonMarshaller.getInstance().marshall(deploymentsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (service.getRoleArn() != null) {
                jsonGenerator.writeFieldName("roleArn").writeValue(service.getRoleArn());
            }

            com.amazonaws.internal.SdkInternalList<ServiceEvent> eventsList = (com.amazonaws.internal.SdkInternalList<ServiceEvent>) service.getEvents();
            if (!eventsList.isEmpty() || !eventsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("events");
                jsonGenerator.writeStartArray();
                for (ServiceEvent eventsListValue : eventsList) {
                    if (eventsListValue != null) {

                        ServiceEventJsonMarshaller.getInstance().marshall(eventsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (service.getCreatedAt() != null) {
                jsonGenerator.writeFieldName("createdAt").writeValue(service.getCreatedAt());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ServiceJsonMarshaller instance;

    public static ServiceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ServiceJsonMarshaller();
        return instance;
    }

}
