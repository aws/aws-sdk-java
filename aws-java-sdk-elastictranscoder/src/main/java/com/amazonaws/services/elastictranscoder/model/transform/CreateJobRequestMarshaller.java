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
package com.amazonaws.services.elastictranscoder.model.transform;

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

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elastictranscoder.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.SdkHttpUtils;
import com.amazonaws.protocol.json.*;

/**
 * CreateJobRequest Marshaller
 */
public class CreateJobRequestMarshaller implements Marshaller<Request<CreateJobRequest>, CreateJobRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public CreateJobRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<CreateJobRequest> marshall(CreateJobRequest createJobRequest) {

        if (createJobRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateJobRequest> request = new DefaultRequest<CreateJobRequest>(createJobRequest, "AmazonElasticTranscoder");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/2012-09-25/jobs";

        request.setResourcePath(uriResourcePath);

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();
            jsonGenerator.writeStartObject();

            if (createJobRequest.getPipelineId() != null) {
                jsonGenerator.writeFieldName("PipelineId").writeValue(createJobRequest.getPipelineId());
            }
            if (createJobRequest.getInput() != null) {
                jsonGenerator.writeFieldName("Input");
                JobInputJsonMarshaller.getInstance().marshall(createJobRequest.getInput(), jsonGenerator);
            }

            com.amazonaws.internal.SdkInternalList<JobInput> inputsList = (com.amazonaws.internal.SdkInternalList<JobInput>) createJobRequest.getInputs();
            if (!inputsList.isEmpty() || !inputsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Inputs");
                jsonGenerator.writeStartArray();
                for (JobInput inputsListValue : inputsList) {
                    if (inputsListValue != null) {

                        JobInputJsonMarshaller.getInstance().marshall(inputsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (createJobRequest.getOutput() != null) {
                jsonGenerator.writeFieldName("Output");
                CreateJobOutputJsonMarshaller.getInstance().marshall(createJobRequest.getOutput(), jsonGenerator);
            }

            com.amazonaws.internal.SdkInternalList<CreateJobOutput> outputsList = (com.amazonaws.internal.SdkInternalList<CreateJobOutput>) createJobRequest
                    .getOutputs();
            if (!outputsList.isEmpty() || !outputsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Outputs");
                jsonGenerator.writeStartArray();
                for (CreateJobOutput outputsListValue : outputsList) {
                    if (outputsListValue != null) {

                        CreateJobOutputJsonMarshaller.getInstance().marshall(outputsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (createJobRequest.getOutputKeyPrefix() != null) {
                jsonGenerator.writeFieldName("OutputKeyPrefix").writeValue(createJobRequest.getOutputKeyPrefix());
            }

            com.amazonaws.internal.SdkInternalList<CreateJobPlaylist> playlistsList = (com.amazonaws.internal.SdkInternalList<CreateJobPlaylist>) createJobRequest
                    .getPlaylists();
            if (!playlistsList.isEmpty() || !playlistsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Playlists");
                jsonGenerator.writeStartArray();
                for (CreateJobPlaylist playlistsListValue : playlistsList) {
                    if (playlistsListValue != null) {

                        CreateJobPlaylistJsonMarshaller.getInstance().marshall(playlistsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            com.amazonaws.internal.SdkInternalMap<String, String> userMetadataMap = (com.amazonaws.internal.SdkInternalMap<String, String>) createJobRequest
                    .getUserMetadata();
            if (!userMetadataMap.isEmpty() || !userMetadataMap.isAutoConstruct()) {
                jsonGenerator.writeFieldName("UserMetadata");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> userMetadataMapValue : userMetadataMap.entrySet()) {
                    if (userMetadataMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(userMetadataMapValue.getKey());

                        jsonGenerator.writeValue(userMetadataMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length", Integer.toString(content.length));
            if (!request.getHeaders().containsKey("Content-Type")) {
                request.addHeader("Content-Type", protocolFactory.getContentType());
            }
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
