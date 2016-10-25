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

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudtrail.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * UpdateTrailRequest Marshaller
 */
public class UpdateTrailRequestMarshaller implements Marshaller<Request<UpdateTrailRequest>, UpdateTrailRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public UpdateTrailRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<UpdateTrailRequest> marshall(UpdateTrailRequest updateTrailRequest) {

        if (updateTrailRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateTrailRequest> request = new DefaultRequest<UpdateTrailRequest>(updateTrailRequest, "AWSCloudTrail");
        request.addHeader("X-Amz-Target", "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101.UpdateTrail");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (updateTrailRequest.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(updateTrailRequest.getName());
            }
            if (updateTrailRequest.getS3BucketName() != null) {
                jsonGenerator.writeFieldName("S3BucketName").writeValue(updateTrailRequest.getS3BucketName());
            }
            if (updateTrailRequest.getS3KeyPrefix() != null) {
                jsonGenerator.writeFieldName("S3KeyPrefix").writeValue(updateTrailRequest.getS3KeyPrefix());
            }
            if (updateTrailRequest.getSnsTopicName() != null) {
                jsonGenerator.writeFieldName("SnsTopicName").writeValue(updateTrailRequest.getSnsTopicName());
            }
            if (updateTrailRequest.getIncludeGlobalServiceEvents() != null) {
                jsonGenerator.writeFieldName("IncludeGlobalServiceEvents").writeValue(updateTrailRequest.getIncludeGlobalServiceEvents());
            }
            if (updateTrailRequest.getIsMultiRegionTrail() != null) {
                jsonGenerator.writeFieldName("IsMultiRegionTrail").writeValue(updateTrailRequest.getIsMultiRegionTrail());
            }
            if (updateTrailRequest.getEnableLogFileValidation() != null) {
                jsonGenerator.writeFieldName("EnableLogFileValidation").writeValue(updateTrailRequest.getEnableLogFileValidation());
            }
            if (updateTrailRequest.getCloudWatchLogsLogGroupArn() != null) {
                jsonGenerator.writeFieldName("CloudWatchLogsLogGroupArn").writeValue(updateTrailRequest.getCloudWatchLogsLogGroupArn());
            }
            if (updateTrailRequest.getCloudWatchLogsRoleArn() != null) {
                jsonGenerator.writeFieldName("CloudWatchLogsRoleArn").writeValue(updateTrailRequest.getCloudWatchLogsRoleArn());
            }
            if (updateTrailRequest.getKmsKeyId() != null) {
                jsonGenerator.writeFieldName("KmsKeyId").writeValue(updateTrailRequest.getKmsKeyId());
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
