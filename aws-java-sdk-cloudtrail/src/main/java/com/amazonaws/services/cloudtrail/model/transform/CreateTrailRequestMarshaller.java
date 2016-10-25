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
 * CreateTrailRequest Marshaller
 */
public class CreateTrailRequestMarshaller implements Marshaller<Request<CreateTrailRequest>, CreateTrailRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public CreateTrailRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<CreateTrailRequest> marshall(CreateTrailRequest createTrailRequest) {

        if (createTrailRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateTrailRequest> request = new DefaultRequest<CreateTrailRequest>(createTrailRequest, "AWSCloudTrail");
        request.addHeader("X-Amz-Target", "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101.CreateTrail");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (createTrailRequest.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(createTrailRequest.getName());
            }
            if (createTrailRequest.getS3BucketName() != null) {
                jsonGenerator.writeFieldName("S3BucketName").writeValue(createTrailRequest.getS3BucketName());
            }
            if (createTrailRequest.getS3KeyPrefix() != null) {
                jsonGenerator.writeFieldName("S3KeyPrefix").writeValue(createTrailRequest.getS3KeyPrefix());
            }
            if (createTrailRequest.getSnsTopicName() != null) {
                jsonGenerator.writeFieldName("SnsTopicName").writeValue(createTrailRequest.getSnsTopicName());
            }
            if (createTrailRequest.getIncludeGlobalServiceEvents() != null) {
                jsonGenerator.writeFieldName("IncludeGlobalServiceEvents").writeValue(createTrailRequest.getIncludeGlobalServiceEvents());
            }
            if (createTrailRequest.getIsMultiRegionTrail() != null) {
                jsonGenerator.writeFieldName("IsMultiRegionTrail").writeValue(createTrailRequest.getIsMultiRegionTrail());
            }
            if (createTrailRequest.getEnableLogFileValidation() != null) {
                jsonGenerator.writeFieldName("EnableLogFileValidation").writeValue(createTrailRequest.getEnableLogFileValidation());
            }
            if (createTrailRequest.getCloudWatchLogsLogGroupArn() != null) {
                jsonGenerator.writeFieldName("CloudWatchLogsLogGroupArn").writeValue(createTrailRequest.getCloudWatchLogsLogGroupArn());
            }
            if (createTrailRequest.getCloudWatchLogsRoleArn() != null) {
                jsonGenerator.writeFieldName("CloudWatchLogsRoleArn").writeValue(createTrailRequest.getCloudWatchLogsRoleArn());
            }
            if (createTrailRequest.getKmsKeyId() != null) {
                jsonGenerator.writeFieldName("KmsKeyId").writeValue(createTrailRequest.getKmsKeyId());
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
