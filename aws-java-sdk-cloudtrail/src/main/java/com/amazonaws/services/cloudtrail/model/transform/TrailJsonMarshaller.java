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

package com.amazonaws.services.cloudtrail.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.cloudtrail.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * TrailMarshaller
 */
public class TrailJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(Trail trail, JSONWriter jsonWriter) {
        if (trail == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (trail.getName() != null) {
                jsonWriter.key("Name").value(trail.getName());
            }

            if (trail.getS3BucketName() != null) {
                jsonWriter.key("S3BucketName").value(trail.getS3BucketName());
            }

            if (trail.getS3KeyPrefix() != null) {
                jsonWriter.key("S3KeyPrefix").value(trail.getS3KeyPrefix());
            }

            if (trail.getSnsTopicName() != null) {
                jsonWriter.key("SnsTopicName").value(trail.getSnsTopicName());
            }

            if (trail.getIncludeGlobalServiceEvents() != null) {
                jsonWriter.key("IncludeGlobalServiceEvents").value(
                        trail.getIncludeGlobalServiceEvents());
            }

            if (trail.getIsMultiRegionTrail() != null) {
                jsonWriter.key("IsMultiRegionTrail").value(
                        trail.getIsMultiRegionTrail());
            }

            if (trail.getHomeRegion() != null) {
                jsonWriter.key("HomeRegion").value(trail.getHomeRegion());
            }

            if (trail.getTrailARN() != null) {
                jsonWriter.key("TrailARN").value(trail.getTrailARN());
            }

            if (trail.getLogFileValidationEnabled() != null) {
                jsonWriter.key("LogFileValidationEnabled").value(
                        trail.getLogFileValidationEnabled());
            }

            if (trail.getCloudWatchLogsLogGroupArn() != null) {
                jsonWriter.key("CloudWatchLogsLogGroupArn").value(
                        trail.getCloudWatchLogsLogGroupArn());
            }

            if (trail.getCloudWatchLogsRoleArn() != null) {
                jsonWriter.key("CloudWatchLogsRoleArn").value(
                        trail.getCloudWatchLogsRoleArn());
            }

            if (trail.getKmsKeyId() != null) {
                jsonWriter.key("KmsKeyId").value(trail.getKmsKeyId());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static TrailJsonMarshaller instance;

    public static TrailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TrailJsonMarshaller();
        return instance;
    }

}
