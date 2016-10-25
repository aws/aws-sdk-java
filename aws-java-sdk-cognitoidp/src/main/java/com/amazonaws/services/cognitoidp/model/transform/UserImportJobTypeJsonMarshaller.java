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
package com.amazonaws.services.cognitoidp.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cognitoidp.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * UserImportJobTypeMarshaller
 */
public class UserImportJobTypeJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(UserImportJobType userImportJobType, StructuredJsonGenerator jsonGenerator) {

        if (userImportJobType == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (userImportJobType.getJobName() != null) {
                jsonGenerator.writeFieldName("JobName").writeValue(userImportJobType.getJobName());
            }
            if (userImportJobType.getJobId() != null) {
                jsonGenerator.writeFieldName("JobId").writeValue(userImportJobType.getJobId());
            }
            if (userImportJobType.getUserPoolId() != null) {
                jsonGenerator.writeFieldName("UserPoolId").writeValue(userImportJobType.getUserPoolId());
            }
            if (userImportJobType.getPreSignedUrl() != null) {
                jsonGenerator.writeFieldName("PreSignedUrl").writeValue(userImportJobType.getPreSignedUrl());
            }
            if (userImportJobType.getCreationDate() != null) {
                jsonGenerator.writeFieldName("CreationDate").writeValue(userImportJobType.getCreationDate());
            }
            if (userImportJobType.getStartDate() != null) {
                jsonGenerator.writeFieldName("StartDate").writeValue(userImportJobType.getStartDate());
            }
            if (userImportJobType.getCompletionDate() != null) {
                jsonGenerator.writeFieldName("CompletionDate").writeValue(userImportJobType.getCompletionDate());
            }
            if (userImportJobType.getStatus() != null) {
                jsonGenerator.writeFieldName("Status").writeValue(userImportJobType.getStatus());
            }
            if (userImportJobType.getCloudWatchLogsRoleArn() != null) {
                jsonGenerator.writeFieldName("CloudWatchLogsRoleArn").writeValue(userImportJobType.getCloudWatchLogsRoleArn());
            }
            if (userImportJobType.getImportedUsers() != null) {
                jsonGenerator.writeFieldName("ImportedUsers").writeValue(userImportJobType.getImportedUsers());
            }
            if (userImportJobType.getSkippedUsers() != null) {
                jsonGenerator.writeFieldName("SkippedUsers").writeValue(userImportJobType.getSkippedUsers());
            }
            if (userImportJobType.getFailedUsers() != null) {
                jsonGenerator.writeFieldName("FailedUsers").writeValue(userImportJobType.getFailedUsers());
            }
            if (userImportJobType.getCompletionMessage() != null) {
                jsonGenerator.writeFieldName("CompletionMessage").writeValue(userImportJobType.getCompletionMessage());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static UserImportJobTypeJsonMarshaller instance;

    public static UserImportJobTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UserImportJobTypeJsonMarshaller();
        return instance;
    }

}
