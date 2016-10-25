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
package com.amazonaws.services.codedeploy.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * CreateDeploymentRequest Marshaller
 */
public class CreateDeploymentRequestMarshaller implements Marshaller<Request<CreateDeploymentRequest>, CreateDeploymentRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public CreateDeploymentRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<CreateDeploymentRequest> marshall(CreateDeploymentRequest createDeploymentRequest) {

        if (createDeploymentRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateDeploymentRequest> request = new DefaultRequest<CreateDeploymentRequest>(createDeploymentRequest, "AmazonCodeDeploy");
        request.addHeader("X-Amz-Target", "CodeDeploy_20141006.CreateDeployment");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (createDeploymentRequest.getApplicationName() != null) {
                jsonGenerator.writeFieldName("applicationName").writeValue(createDeploymentRequest.getApplicationName());
            }
            if (createDeploymentRequest.getDeploymentGroupName() != null) {
                jsonGenerator.writeFieldName("deploymentGroupName").writeValue(createDeploymentRequest.getDeploymentGroupName());
            }
            if (createDeploymentRequest.getRevision() != null) {
                jsonGenerator.writeFieldName("revision");
                RevisionLocationJsonMarshaller.getInstance().marshall(createDeploymentRequest.getRevision(), jsonGenerator);
            }
            if (createDeploymentRequest.getDeploymentConfigName() != null) {
                jsonGenerator.writeFieldName("deploymentConfigName").writeValue(createDeploymentRequest.getDeploymentConfigName());
            }
            if (createDeploymentRequest.getDescription() != null) {
                jsonGenerator.writeFieldName("description").writeValue(createDeploymentRequest.getDescription());
            }
            if (createDeploymentRequest.getIgnoreApplicationStopFailures() != null) {
                jsonGenerator.writeFieldName("ignoreApplicationStopFailures").writeValue(createDeploymentRequest.getIgnoreApplicationStopFailures());
            }
            if (createDeploymentRequest.getAutoRollbackConfiguration() != null) {
                jsonGenerator.writeFieldName("autoRollbackConfiguration");
                AutoRollbackConfigurationJsonMarshaller.getInstance().marshall(createDeploymentRequest.getAutoRollbackConfiguration(), jsonGenerator);
            }
            if (createDeploymentRequest.getUpdateOutdatedInstancesOnly() != null) {
                jsonGenerator.writeFieldName("updateOutdatedInstancesOnly").writeValue(createDeploymentRequest.getUpdateOutdatedInstancesOnly());
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
