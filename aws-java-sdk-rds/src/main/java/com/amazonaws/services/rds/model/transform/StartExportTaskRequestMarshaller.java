/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StartExportTaskRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartExportTaskRequestMarshaller implements Marshaller<Request<StartExportTaskRequest>, StartExportTaskRequest> {

    public Request<StartExportTaskRequest> marshall(StartExportTaskRequest startExportTaskRequest) {

        if (startExportTaskRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<StartExportTaskRequest> request = new DefaultRequest<StartExportTaskRequest>(startExportTaskRequest, "AmazonRDS");
        request.addParameter("Action", "StartExportTask");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (startExportTaskRequest.getExportTaskIdentifier() != null) {
            request.addParameter("ExportTaskIdentifier", StringUtils.fromString(startExportTaskRequest.getExportTaskIdentifier()));
        }

        if (startExportTaskRequest.getSourceArn() != null) {
            request.addParameter("SourceArn", StringUtils.fromString(startExportTaskRequest.getSourceArn()));
        }

        if (startExportTaskRequest.getS3BucketName() != null) {
            request.addParameter("S3BucketName", StringUtils.fromString(startExportTaskRequest.getS3BucketName()));
        }

        if (startExportTaskRequest.getIamRoleArn() != null) {
            request.addParameter("IamRoleArn", StringUtils.fromString(startExportTaskRequest.getIamRoleArn()));
        }

        if (startExportTaskRequest.getKmsKeyId() != null) {
            request.addParameter("KmsKeyId", StringUtils.fromString(startExportTaskRequest.getKmsKeyId()));
        }

        if (startExportTaskRequest.getS3Prefix() != null) {
            request.addParameter("S3Prefix", StringUtils.fromString(startExportTaskRequest.getS3Prefix()));
        }

        if (!startExportTaskRequest.getExportOnly().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) startExportTaskRequest.getExportOnly()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> exportOnlyList = (com.amazonaws.internal.SdkInternalList<String>) startExportTaskRequest
                    .getExportOnly();
            int exportOnlyListIndex = 1;

            for (String exportOnlyListValue : exportOnlyList) {
                if (exportOnlyListValue != null) {
                    request.addParameter("ExportOnly.member." + exportOnlyListIndex, StringUtils.fromString(exportOnlyListValue));
                }
                exportOnlyListIndex++;
            }
        }

        return request;
    }

}
