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

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elastictranscoder.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * JobMarshaller
 */
public class JobJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Job job, StructuredJsonGenerator jsonGenerator) {

        if (job == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (job.getId() != null) {
                jsonGenerator.writeFieldName("Id").writeValue(job.getId());
            }
            if (job.getArn() != null) {
                jsonGenerator.writeFieldName("Arn").writeValue(job.getArn());
            }
            if (job.getPipelineId() != null) {
                jsonGenerator.writeFieldName("PipelineId").writeValue(job.getPipelineId());
            }
            if (job.getInput() != null) {
                jsonGenerator.writeFieldName("Input");
                JobInputJsonMarshaller.getInstance().marshall(job.getInput(), jsonGenerator);
            }

            com.amazonaws.internal.SdkInternalList<JobInput> inputsList = (com.amazonaws.internal.SdkInternalList<JobInput>) job.getInputs();
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
            if (job.getOutput() != null) {
                jsonGenerator.writeFieldName("Output");
                JobOutputJsonMarshaller.getInstance().marshall(job.getOutput(), jsonGenerator);
            }

            com.amazonaws.internal.SdkInternalList<JobOutput> outputsList = (com.amazonaws.internal.SdkInternalList<JobOutput>) job.getOutputs();
            if (!outputsList.isEmpty() || !outputsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Outputs");
                jsonGenerator.writeStartArray();
                for (JobOutput outputsListValue : outputsList) {
                    if (outputsListValue != null) {

                        JobOutputJsonMarshaller.getInstance().marshall(outputsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (job.getOutputKeyPrefix() != null) {
                jsonGenerator.writeFieldName("OutputKeyPrefix").writeValue(job.getOutputKeyPrefix());
            }

            com.amazonaws.internal.SdkInternalList<Playlist> playlistsList = (com.amazonaws.internal.SdkInternalList<Playlist>) job.getPlaylists();
            if (!playlistsList.isEmpty() || !playlistsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Playlists");
                jsonGenerator.writeStartArray();
                for (Playlist playlistsListValue : playlistsList) {
                    if (playlistsListValue != null) {

                        PlaylistJsonMarshaller.getInstance().marshall(playlistsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (job.getStatus() != null) {
                jsonGenerator.writeFieldName("Status").writeValue(job.getStatus());
            }

            com.amazonaws.internal.SdkInternalMap<String, String> userMetadataMap = (com.amazonaws.internal.SdkInternalMap<String, String>) job
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
            if (job.getTiming() != null) {
                jsonGenerator.writeFieldName("Timing");
                TimingJsonMarshaller.getInstance().marshall(job.getTiming(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static JobJsonMarshaller instance;

    public static JobJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JobJsonMarshaller();
        return instance;
    }

}
