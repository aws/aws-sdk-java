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
 * PipelineMarshaller
 */
public class PipelineJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(Pipeline pipeline, JSONWriter jsonWriter) {
        if (pipeline == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (pipeline.getId() != null) {
                jsonWriter.key("Id").value(pipeline.getId());
            }

            if (pipeline.getArn() != null) {
                jsonWriter.key("Arn").value(pipeline.getArn());
            }

            if (pipeline.getName() != null) {
                jsonWriter.key("Name").value(pipeline.getName());
            }

            if (pipeline.getStatus() != null) {
                jsonWriter.key("Status").value(pipeline.getStatus());
            }

            if (pipeline.getInputBucket() != null) {
                jsonWriter.key("InputBucket").value(pipeline.getInputBucket());
            }

            if (pipeline.getOutputBucket() != null) {
                jsonWriter.key("OutputBucket")
                        .value(pipeline.getOutputBucket());
            }

            if (pipeline.getRole() != null) {
                jsonWriter.key("Role").value(pipeline.getRole());
            }

            if (pipeline.getAwsKmsKeyArn() != null) {
                jsonWriter.key("AwsKmsKeyArn")
                        .value(pipeline.getAwsKmsKeyArn());
            }

            if (pipeline.getNotifications() != null) {
                jsonWriter.key("Notifications");
                NotificationsJsonMarshaller.getInstance().marshall(
                        pipeline.getNotifications(), jsonWriter);
            }

            if (pipeline.getContentConfig() != null) {
                jsonWriter.key("ContentConfig");
                PipelineOutputConfigJsonMarshaller.getInstance().marshall(
                        pipeline.getContentConfig(), jsonWriter);
            }

            if (pipeline.getThumbnailConfig() != null) {
                jsonWriter.key("ThumbnailConfig");
                PipelineOutputConfigJsonMarshaller.getInstance().marshall(
                        pipeline.getThumbnailConfig(), jsonWriter);
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static PipelineJsonMarshaller instance;

    public static PipelineJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PipelineJsonMarshaller();
        return instance;
    }

}
