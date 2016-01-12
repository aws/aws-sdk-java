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

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elastictranscoder.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * CreateJobRequest Marshaller
 */
public class CreateJobRequestMarshaller implements
        Marshaller<Request<CreateJobRequest>, CreateJobRequest> {

    private static final String DEFAULT_CONTENT_TYPE = "";

    public Request<CreateJobRequest> marshall(CreateJobRequest createJobRequest) {

        if (createJobRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<CreateJobRequest> request = new DefaultRequest<CreateJobRequest>(
                createJobRequest, "AmazonElasticTranscoder");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/2012-09-25/jobs";

        request.setResourcePath(uriResourcePath);

        try {
            StringWriter stringWriter = new StringWriter();
            JSONWriter jsonWriter = new JSONWriter(stringWriter);

            jsonWriter.object();

            if (createJobRequest.getPipelineId() != null) {
                jsonWriter.key("PipelineId").value(
                        createJobRequest.getPipelineId());
            }

            if (createJobRequest.getInput() != null) {
                jsonWriter.key("Input");
                JobInputJsonMarshaller.getInstance().marshall(
                        createJobRequest.getInput(), jsonWriter);
            }

            if (createJobRequest.getOutput() != null) {
                jsonWriter.key("Output");
                CreateJobOutputJsonMarshaller.getInstance().marshall(
                        createJobRequest.getOutput(), jsonWriter);
            }

            com.amazonaws.internal.SdkInternalList<CreateJobOutput> outputsList = (com.amazonaws.internal.SdkInternalList<CreateJobOutput>) createJobRequest
                    .getOutputs();
            if (!outputsList.isEmpty() || !outputsList.isAutoConstruct()) {
                jsonWriter.key("Outputs");
                jsonWriter.array();
                for (CreateJobOutput outputsListValue : outputsList) {
                    if (outputsListValue != null) {

                        CreateJobOutputJsonMarshaller.getInstance().marshall(
                                outputsListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            if (createJobRequest.getOutputKeyPrefix() != null) {
                jsonWriter.key("OutputKeyPrefix").value(
                        createJobRequest.getOutputKeyPrefix());
            }

            com.amazonaws.internal.SdkInternalList<CreateJobPlaylist> playlistsList = (com.amazonaws.internal.SdkInternalList<CreateJobPlaylist>) createJobRequest
                    .getPlaylists();
            if (!playlistsList.isEmpty() || !playlistsList.isAutoConstruct()) {
                jsonWriter.key("Playlists");
                jsonWriter.array();
                for (CreateJobPlaylist playlistsListValue : playlistsList) {
                    if (playlistsListValue != null) {

                        CreateJobPlaylistJsonMarshaller.getInstance().marshall(
                                playlistsListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            com.amazonaws.internal.SdkInternalMap<String, String> userMetadataMap = (com.amazonaws.internal.SdkInternalMap<String, String>) createJobRequest
                    .getUserMetadata();
            if (!userMetadataMap.isEmpty()
                    || !userMetadataMap.isAutoConstruct()) {
                jsonWriter.key("UserMetadata");
                jsonWriter.object();

                for (Map.Entry<String, String> userMetadataMapValue : userMetadataMap
                        .entrySet()) {
                    if (userMetadataMapValue.getValue() != null) {
                        jsonWriter.key(userMetadataMapValue.getKey());

                        jsonWriter.value(userMetadataMapValue.getValue());
                    }
                }
                jsonWriter.endObject();
            }

            jsonWriter.endObject();

            String snippet = stringWriter.toString();
            byte[] content = snippet.getBytes(UTF8);
            request.setContent(new StringInputStream(snippet));
            request.addHeader("Content-Length",
                    Integer.toString(content.length));
            if (!request.getHeaders().containsKey("Content-Type")) {
                request.addHeader("Content-Type", DEFAULT_CONTENT_TYPE);
            }
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
