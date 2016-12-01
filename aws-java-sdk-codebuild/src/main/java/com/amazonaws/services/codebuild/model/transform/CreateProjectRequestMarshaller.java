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
 * CreateProjectRequest Marshaller
 */
public class CreateProjectRequestMarshaller implements Marshaller<Request<CreateProjectRequest>, CreateProjectRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public CreateProjectRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<CreateProjectRequest> marshall(CreateProjectRequest createProjectRequest) {

        if (createProjectRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateProjectRequest> request = new DefaultRequest<CreateProjectRequest>(createProjectRequest, "AWSCodeBuild");
        request.addHeader("X-Amz-Target", "CodeBuild_20161006.CreateProject");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (createProjectRequest.getName() != null) {
                jsonGenerator.writeFieldName("name").writeValue(createProjectRequest.getName());
            }
            if (createProjectRequest.getDescription() != null) {
                jsonGenerator.writeFieldName("description").writeValue(createProjectRequest.getDescription());
            }
            if (createProjectRequest.getSource() != null) {
                jsonGenerator.writeFieldName("source");
                ProjectSourceJsonMarshaller.getInstance().marshall(createProjectRequest.getSource(), jsonGenerator);
            }
            if (createProjectRequest.getArtifacts() != null) {
                jsonGenerator.writeFieldName("artifacts");
                ProjectArtifactsJsonMarshaller.getInstance().marshall(createProjectRequest.getArtifacts(), jsonGenerator);
            }
            if (createProjectRequest.getEnvironment() != null) {
                jsonGenerator.writeFieldName("environment");
                ProjectEnvironmentJsonMarshaller.getInstance().marshall(createProjectRequest.getEnvironment(), jsonGenerator);
            }
            if (createProjectRequest.getServiceRole() != null) {
                jsonGenerator.writeFieldName("serviceRole").writeValue(createProjectRequest.getServiceRole());
            }
            if (createProjectRequest.getTimeoutInMinutes() != null) {
                jsonGenerator.writeFieldName("timeoutInMinutes").writeValue(createProjectRequest.getTimeoutInMinutes());
            }
            if (createProjectRequest.getEncryptionKey() != null) {
                jsonGenerator.writeFieldName("encryptionKey").writeValue(createProjectRequest.getEncryptionKey());
            }

            java.util.List<Tag> tagsList = createProjectRequest.getTags();
            if (tagsList != null) {
                jsonGenerator.writeFieldName("tags");
                jsonGenerator.writeStartArray();
                for (Tag tagsListValue : tagsList) {
                    if (tagsListValue != null) {

                        TagJsonMarshaller.getInstance().marshall(tagsListValue, jsonGenerator);
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
