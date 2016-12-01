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
package com.amazonaws.services.codebuild.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.codebuild.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * StartBuildRequest Marshaller
 */
public class StartBuildRequestMarshaller implements Marshaller<Request<StartBuildRequest>, StartBuildRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public StartBuildRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<StartBuildRequest> marshall(StartBuildRequest startBuildRequest) {

        if (startBuildRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<StartBuildRequest> request = new DefaultRequest<StartBuildRequest>(startBuildRequest, "AWSCodeBuild");
        request.addHeader("X-Amz-Target", "CodeBuild_20161006.StartBuild");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (startBuildRequest.getProjectName() != null) {
                jsonGenerator.writeFieldName("projectName").writeValue(startBuildRequest.getProjectName());
            }
            if (startBuildRequest.getSourceVersion() != null) {
                jsonGenerator.writeFieldName("sourceVersion").writeValue(startBuildRequest.getSourceVersion());
            }
            if (startBuildRequest.getArtifactsOverride() != null) {
                jsonGenerator.writeFieldName("artifactsOverride");
                ProjectArtifactsJsonMarshaller.getInstance().marshall(startBuildRequest.getArtifactsOverride(), jsonGenerator);
            }

            java.util.List<EnvironmentVariable> environmentVariablesOverrideList = startBuildRequest.getEnvironmentVariablesOverride();
            if (environmentVariablesOverrideList != null) {
                jsonGenerator.writeFieldName("environmentVariablesOverride");
                jsonGenerator.writeStartArray();
                for (EnvironmentVariable environmentVariablesOverrideListValue : environmentVariablesOverrideList) {
                    if (environmentVariablesOverrideListValue != null) {

                        EnvironmentVariableJsonMarshaller.getInstance().marshall(environmentVariablesOverrideListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (startBuildRequest.getBuildspecOverride() != null) {
                jsonGenerator.writeFieldName("buildspecOverride").writeValue(startBuildRequest.getBuildspecOverride());
            }
            if (startBuildRequest.getTimeoutInMinutesOverride() != null) {
                jsonGenerator.writeFieldName("timeoutInMinutesOverride").writeValue(startBuildRequest.getTimeoutInMinutesOverride());
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
