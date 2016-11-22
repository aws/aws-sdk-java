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
package com.amazonaws.services.cloudtrail.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cloudtrail.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * TrailMarshaller
 */
public class TrailJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Trail trail, StructuredJsonGenerator jsonGenerator) {

        if (trail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (trail.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(trail.getName());
            }
            if (trail.getS3BucketName() != null) {
                jsonGenerator.writeFieldName("S3BucketName").writeValue(trail.getS3BucketName());
            }
            if (trail.getS3KeyPrefix() != null) {
                jsonGenerator.writeFieldName("S3KeyPrefix").writeValue(trail.getS3KeyPrefix());
            }
            if (trail.getSnsTopicName() != null) {
                jsonGenerator.writeFieldName("SnsTopicName").writeValue(trail.getSnsTopicName());
            }
            if (trail.getSnsTopicARN() != null) {
                jsonGenerator.writeFieldName("SnsTopicARN").writeValue(trail.getSnsTopicARN());
            }
            if (trail.getIncludeGlobalServiceEvents() != null) {
                jsonGenerator.writeFieldName("IncludeGlobalServiceEvents").writeValue(trail.getIncludeGlobalServiceEvents());
            }
            if (trail.getIsMultiRegionTrail() != null) {
                jsonGenerator.writeFieldName("IsMultiRegionTrail").writeValue(trail.getIsMultiRegionTrail());
            }
            if (trail.getHomeRegion() != null) {
                jsonGenerator.writeFieldName("HomeRegion").writeValue(trail.getHomeRegion());
            }
            if (trail.getTrailARN() != null) {
                jsonGenerator.writeFieldName("TrailARN").writeValue(trail.getTrailARN());
            }
            if (trail.getLogFileValidationEnabled() != null) {
                jsonGenerator.writeFieldName("LogFileValidationEnabled").writeValue(trail.getLogFileValidationEnabled());
            }
            if (trail.getCloudWatchLogsLogGroupArn() != null) {
                jsonGenerator.writeFieldName("CloudWatchLogsLogGroupArn").writeValue(trail.getCloudWatchLogsLogGroupArn());
            }
            if (trail.getCloudWatchLogsRoleArn() != null) {
                jsonGenerator.writeFieldName("CloudWatchLogsRoleArn").writeValue(trail.getCloudWatchLogsRoleArn());
            }
            if (trail.getKmsKeyId() != null) {
                jsonGenerator.writeFieldName("KmsKeyId").writeValue(trail.getKmsKeyId());
            }
            if (trail.getHasCustomEventSelectors() != null) {
                jsonGenerator.writeFieldName("HasCustomEventSelectors").writeValue(trail.getHasCustomEventSelectors());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static TrailJsonMarshaller instance;

    public static TrailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TrailJsonMarshaller();
        return instance;
    }

}
