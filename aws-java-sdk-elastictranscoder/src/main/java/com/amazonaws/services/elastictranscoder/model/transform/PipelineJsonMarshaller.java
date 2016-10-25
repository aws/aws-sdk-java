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
 * PipelineMarshaller
 */
public class PipelineJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Pipeline pipeline, StructuredJsonGenerator jsonGenerator) {

        if (pipeline == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (pipeline.getId() != null) {
                jsonGenerator.writeFieldName("Id").writeValue(pipeline.getId());
            }
            if (pipeline.getArn() != null) {
                jsonGenerator.writeFieldName("Arn").writeValue(pipeline.getArn());
            }
            if (pipeline.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(pipeline.getName());
            }
            if (pipeline.getStatus() != null) {
                jsonGenerator.writeFieldName("Status").writeValue(pipeline.getStatus());
            }
            if (pipeline.getInputBucket() != null) {
                jsonGenerator.writeFieldName("InputBucket").writeValue(pipeline.getInputBucket());
            }
            if (pipeline.getOutputBucket() != null) {
                jsonGenerator.writeFieldName("OutputBucket").writeValue(pipeline.getOutputBucket());
            }
            if (pipeline.getRole() != null) {
                jsonGenerator.writeFieldName("Role").writeValue(pipeline.getRole());
            }
            if (pipeline.getAwsKmsKeyArn() != null) {
                jsonGenerator.writeFieldName("AwsKmsKeyArn").writeValue(pipeline.getAwsKmsKeyArn());
            }
            if (pipeline.getNotifications() != null) {
                jsonGenerator.writeFieldName("Notifications");
                NotificationsJsonMarshaller.getInstance().marshall(pipeline.getNotifications(), jsonGenerator);
            }
            if (pipeline.getContentConfig() != null) {
                jsonGenerator.writeFieldName("ContentConfig");
                PipelineOutputConfigJsonMarshaller.getInstance().marshall(pipeline.getContentConfig(), jsonGenerator);
            }
            if (pipeline.getThumbnailConfig() != null) {
                jsonGenerator.writeFieldName("ThumbnailConfig");
                PipelineOutputConfigJsonMarshaller.getInstance().marshall(pipeline.getThumbnailConfig(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static PipelineJsonMarshaller instance;

    public static PipelineJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PipelineJsonMarshaller();
        return instance;
    }

}
