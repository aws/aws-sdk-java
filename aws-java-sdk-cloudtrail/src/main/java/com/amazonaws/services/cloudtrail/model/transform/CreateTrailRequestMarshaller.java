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
import com.amazonaws.services.cloudtrail.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * CreateTrailRequest Marshaller
 */
public class CreateTrailRequestMarshaller implements
        Marshaller<Request<CreateTrailRequest>, CreateTrailRequest> {

    public Request<CreateTrailRequest> marshall(
            CreateTrailRequest createTrailRequest) {

        if (createTrailRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<CreateTrailRequest> request = new DefaultRequest<CreateTrailRequest>(
                createTrailRequest, "AWSCloudTrail");
        request.addHeader("X-Amz-Target",
                "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101.CreateTrail");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            StringWriter stringWriter = new StringWriter();
            JSONWriter jsonWriter = new JSONWriter(stringWriter);

            jsonWriter.object();

            if (createTrailRequest.getName() != null) {
                jsonWriter.key("Name").value(createTrailRequest.getName());
            }

            if (createTrailRequest.getS3BucketName() != null) {
                jsonWriter.key("S3BucketName").value(
                        createTrailRequest.getS3BucketName());
            }

            if (createTrailRequest.getS3KeyPrefix() != null) {
                jsonWriter.key("S3KeyPrefix").value(
                        createTrailRequest.getS3KeyPrefix());
            }

            if (createTrailRequest.getSnsTopicName() != null) {
                jsonWriter.key("SnsTopicName").value(
                        createTrailRequest.getSnsTopicName());
            }

            if (createTrailRequest.getIncludeGlobalServiceEvents() != null) {
                jsonWriter.key("IncludeGlobalServiceEvents").value(
                        createTrailRequest.getIncludeGlobalServiceEvents());
            }

            if (createTrailRequest.getIsMultiRegionTrail() != null) {
                jsonWriter.key("IsMultiRegionTrail").value(
                        createTrailRequest.getIsMultiRegionTrail());
            }

            if (createTrailRequest.getEnableLogFileValidation() != null) {
                jsonWriter.key("EnableLogFileValidation").value(
                        createTrailRequest.getEnableLogFileValidation());
            }

            if (createTrailRequest.getCloudWatchLogsLogGroupArn() != null) {
                jsonWriter.key("CloudWatchLogsLogGroupArn").value(
                        createTrailRequest.getCloudWatchLogsLogGroupArn());
            }

            if (createTrailRequest.getCloudWatchLogsRoleArn() != null) {
                jsonWriter.key("CloudWatchLogsRoleArn").value(
                        createTrailRequest.getCloudWatchLogsRoleArn());
            }

            if (createTrailRequest.getKmsKeyId() != null) {
                jsonWriter.key("KmsKeyId").value(
                        createTrailRequest.getKmsKeyId());
            }

            jsonWriter.endObject();

            String snippet = stringWriter.toString();
            byte[] content = snippet.getBytes(UTF8);
            request.setContent(new StringInputStream(snippet));
            request.addHeader("Content-Length",
                    Integer.toString(content.length));
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
