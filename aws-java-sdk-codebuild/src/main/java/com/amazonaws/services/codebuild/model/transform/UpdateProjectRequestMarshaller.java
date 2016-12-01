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
 * UpdateProjectRequest Marshaller
 */
public class UpdateProjectRequestMarshaller implements Marshaller<Request<UpdateProjectRequest>, UpdateProjectRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public UpdateProjectRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<UpdateProjectRequest> marshall(UpdateProjectRequest updateProjectRequest) {

        if (updateProjectRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateProjectRequest> request = new DefaultRequest<UpdateProjectRequest>(updateProjectRequest, "AWSCodeBuild");
        request.addHeader("X-Amz-Target", "CodeBuild_20161006.UpdateProject");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (updateProjectRequest.getName() != null) {
                jsonGenerator.writeFieldName("name").writeValue(updateProjectRequest.getName());
            }
            if (updateProjectRequest.getDescription() != null) {
                jsonGenerator.writeFieldName("description").writeValue(updateProjectRequest.getDescription());
            }
            if (updateProjectRequest.getSource() != null) {
                jsonGenerator.writeFieldName("source");
                ProjectSourceJsonMarshaller.getInstance().marshall(updateProjectRequest.getSource(), jsonGenerator);
            }
            if (updateProjectRequest.getArtifacts() != null) {
                jsonGenerator.writeFieldName("artifacts");
                ProjectArtifactsJsonMarshaller.getInstance().marshall(updateProjectRequest.getArtifacts(), jsonGenerator);
            }
            if (updateProjectRequest.getEnvironment() != null) {
                jsonGenerator.writeFieldName("environment");
                ProjectEnvironmentJsonMarshaller.getInstance().marshall(updateProjectRequest.getEnvironment(), jsonGenerator);
            }
            if (updateProjectRequest.getServiceRole() != null) {
                jsonGenerator.writeFieldName("serviceRole").writeValue(updateProjectRequest.getServiceRole());
            }
            if (updateProjectRequest.getTimeoutInMinutes() != null) {
                jsonGenerator.writeFieldName("timeoutInMinutes").writeValue(updateProjectRequest.getTimeoutInMinutes());
            }
            if (updateProjectRequest.getEncryptionKey() != null) {
                jsonGenerator.writeFieldName("encryptionKey").writeValue(updateProjectRequest.getEncryptionKey());
            }

            java.util.List<Tag> tagsList = updateProjectRequest.getTags();
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
