/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

package com.amazonaws.services.ecs.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.ecs.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * ServiceMarshaller
 */
public class ServiceJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(Service service, JSONWriter jsonWriter) {
        if (service == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (service.getServiceArn() != null) {
                jsonWriter.key("serviceArn").value(service.getServiceArn());
            }

            if (service.getServiceName() != null) {
                jsonWriter.key("serviceName").value(service.getServiceName());
            }

            if (service.getClusterArn() != null) {
                jsonWriter.key("clusterArn").value(service.getClusterArn());
            }

            com.amazonaws.internal.SdkInternalList<LoadBalancer> loadBalancersList = (com.amazonaws.internal.SdkInternalList<LoadBalancer>) service
                    .getLoadBalancers();
            if (!loadBalancersList.isEmpty()
                    || !loadBalancersList.isAutoConstruct()) {
                jsonWriter.key("loadBalancers");
                jsonWriter.array();
                for (LoadBalancer loadBalancersListValue : loadBalancersList) {
                    if (loadBalancersListValue != null) {

                        LoadBalancerJsonMarshaller.getInstance().marshall(
                                loadBalancersListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            if (service.getStatus() != null) {
                jsonWriter.key("status").value(service.getStatus());
            }

            if (service.getDesiredCount() != null) {
                jsonWriter.key("desiredCount").value(service.getDesiredCount());
            }

            if (service.getRunningCount() != null) {
                jsonWriter.key("runningCount").value(service.getRunningCount());
            }

            if (service.getPendingCount() != null) {
                jsonWriter.key("pendingCount").value(service.getPendingCount());
            }

            if (service.getTaskDefinition() != null) {
                jsonWriter.key("taskDefinition").value(
                        service.getTaskDefinition());
            }

            if (service.getDeploymentConfiguration() != null) {
                jsonWriter.key("deploymentConfiguration");
                DeploymentConfigurationJsonMarshaller.getInstance().marshall(
                        service.getDeploymentConfiguration(), jsonWriter);
            }

            com.amazonaws.internal.SdkInternalList<Deployment> deploymentsList = (com.amazonaws.internal.SdkInternalList<Deployment>) service
                    .getDeployments();
            if (!deploymentsList.isEmpty()
                    || !deploymentsList.isAutoConstruct()) {
                jsonWriter.key("deployments");
                jsonWriter.array();
                for (Deployment deploymentsListValue : deploymentsList) {
                    if (deploymentsListValue != null) {

                        DeploymentJsonMarshaller.getInstance().marshall(
                                deploymentsListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            if (service.getRoleArn() != null) {
                jsonWriter.key("roleArn").value(service.getRoleArn());
            }

            com.amazonaws.internal.SdkInternalList<ServiceEvent> eventsList = (com.amazonaws.internal.SdkInternalList<ServiceEvent>) service
                    .getEvents();
            if (!eventsList.isEmpty() || !eventsList.isAutoConstruct()) {
                jsonWriter.key("events");
                jsonWriter.array();
                for (ServiceEvent eventsListValue : eventsList) {
                    if (eventsListValue != null) {

                        ServiceEventJsonMarshaller.getInstance().marshall(
                                eventsListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ServiceJsonMarshaller instance;

    public static ServiceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ServiceJsonMarshaller();
        return instance;
    }

}
