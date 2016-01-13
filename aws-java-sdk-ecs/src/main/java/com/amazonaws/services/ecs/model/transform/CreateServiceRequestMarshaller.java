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
import static com.amazonaws.util.StringUtils.COMMA_SEPARATOR;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ecs.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * CreateServiceRequest Marshaller
 */
public class CreateServiceRequestMarshaller implements
        Marshaller<Request<CreateServiceRequest>, CreateServiceRequest> {

    public Request<CreateServiceRequest> marshall(
            CreateServiceRequest createServiceRequest) {

        if (createServiceRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<CreateServiceRequest> request = new DefaultRequest<CreateServiceRequest>(
                createServiceRequest, "AmazonECS");
        request.addHeader("X-Amz-Target",
                "AmazonEC2ContainerServiceV20141113.CreateService");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            StringWriter stringWriter = new StringWriter();
            JSONWriter jsonWriter = new JSONWriter(stringWriter);

            jsonWriter.object();

            if (createServiceRequest.getCluster() != null) {
                jsonWriter.key("cluster").value(
                        createServiceRequest.getCluster());
            }

            if (createServiceRequest.getServiceName() != null) {
                jsonWriter.key("serviceName").value(
                        createServiceRequest.getServiceName());
            }

            if (createServiceRequest.getTaskDefinition() != null) {
                jsonWriter.key("taskDefinition").value(
                        createServiceRequest.getTaskDefinition());
            }

            com.amazonaws.internal.SdkInternalList<LoadBalancer> loadBalancersList = (com.amazonaws.internal.SdkInternalList<LoadBalancer>) createServiceRequest
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

            if (createServiceRequest.getDesiredCount() != null) {
                jsonWriter.key("desiredCount").value(
                        createServiceRequest.getDesiredCount());
            }

            if (createServiceRequest.getClientToken() != null) {
                jsonWriter.key("clientToken").value(
                        createServiceRequest.getClientToken());
            }

            if (createServiceRequest.getRole() != null) {
                jsonWriter.key("role").value(createServiceRequest.getRole());
            }

            if (createServiceRequest.getDeploymentConfiguration() != null) {
                jsonWriter.key("deploymentConfiguration");
                DeploymentConfigurationJsonMarshaller.getInstance().marshall(
                        createServiceRequest.getDeploymentConfiguration(),
                        jsonWriter);
            }

            jsonWriter.endObject();

            String snippet = stringWriter.toString();
            byte[] content = snippet.getBytes(UTF8);
            request.setContent(new StringInputStream(snippet));
            request.addHeader("Content-Length",
                    Integer.toString(content.length));
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
