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
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.elastictranscoder.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * JobMarshaller
 */
public class JobJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(Job job, JSONWriter jsonWriter) {
        if (job == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (job.getId() != null) {
                jsonWriter.key("Id").value(job.getId());
            }

            if (job.getArn() != null) {
                jsonWriter.key("Arn").value(job.getArn());
            }

            if (job.getPipelineId() != null) {
                jsonWriter.key("PipelineId").value(job.getPipelineId());
            }

            if (job.getInput() != null) {
                jsonWriter.key("Input");
                JobInputJsonMarshaller.getInstance().marshall(job.getInput(),
                        jsonWriter);
            }

            if (job.getOutput() != null) {
                jsonWriter.key("Output");
                JobOutputJsonMarshaller.getInstance().marshall(job.getOutput(),
                        jsonWriter);
            }

            com.amazonaws.internal.SdkInternalList<JobOutput> outputsList = (com.amazonaws.internal.SdkInternalList<JobOutput>) job
                    .getOutputs();
            if (!outputsList.isEmpty() || !outputsList.isAutoConstruct()) {
                jsonWriter.key("Outputs");
                jsonWriter.array();
                for (JobOutput outputsListValue : outputsList) {
                    if (outputsListValue != null) {

                        JobOutputJsonMarshaller.getInstance().marshall(
                                outputsListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            if (job.getOutputKeyPrefix() != null) {
                jsonWriter.key("OutputKeyPrefix").value(
                        job.getOutputKeyPrefix());
            }

            com.amazonaws.internal.SdkInternalList<Playlist> playlistsList = (com.amazonaws.internal.SdkInternalList<Playlist>) job
                    .getPlaylists();
            if (!playlistsList.isEmpty() || !playlistsList.isAutoConstruct()) {
                jsonWriter.key("Playlists");
                jsonWriter.array();
                for (Playlist playlistsListValue : playlistsList) {
                    if (playlistsListValue != null) {

                        PlaylistJsonMarshaller.getInstance().marshall(
                                playlistsListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            if (job.getStatus() != null) {
                jsonWriter.key("Status").value(job.getStatus());
            }

            com.amazonaws.internal.SdkInternalMap<String, String> userMetadataMap = (com.amazonaws.internal.SdkInternalMap<String, String>) job
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

            if (job.getTiming() != null) {
                jsonWriter.key("Timing");
                TimingJsonMarshaller.getInstance().marshall(job.getTiming(),
                        jsonWriter);
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static JobJsonMarshaller instance;

    public static JobJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JobJsonMarshaller();
        return instance;
    }

}
