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
package com.amazonaws.services.opsworks.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * DescribeDeploymentsRequest Marshaller
 */
public class DescribeDeploymentsRequestMarshaller implements Marshaller<Request<DescribeDeploymentsRequest>, DescribeDeploymentsRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public DescribeDeploymentsRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<DescribeDeploymentsRequest> marshall(DescribeDeploymentsRequest describeDeploymentsRequest) {

        if (describeDeploymentsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeDeploymentsRequest> request = new DefaultRequest<DescribeDeploymentsRequest>(describeDeploymentsRequest, "AWSOpsWorks");
        request.addHeader("X-Amz-Target", "OpsWorks_20130218.DescribeDeployments");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (describeDeploymentsRequest.getStackId() != null) {
                jsonGenerator.writeFieldName("StackId").writeValue(describeDeploymentsRequest.getStackId());
            }
            if (describeDeploymentsRequest.getAppId() != null) {
                jsonGenerator.writeFieldName("AppId").writeValue(describeDeploymentsRequest.getAppId());
            }

            com.amazonaws.internal.SdkInternalList<String> deploymentIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeDeploymentsRequest
                    .getDeploymentIds();
            if (!deploymentIdsList.isEmpty() || !deploymentIdsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("DeploymentIds");
                jsonGenerator.writeStartArray();
                for (String deploymentIdsListValue : deploymentIdsList) {
                    if (deploymentIdsListValue != null) {
                        jsonGenerator.writeValue(deploymentIdsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length", Integer.toString(content.length));
            request.addHeader("Content-Type", protocolFactory.getContentType());
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
