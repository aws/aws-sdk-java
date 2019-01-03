/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * CreateInstanceExportTaskRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateInstanceExportTaskRequestMarshaller implements Marshaller<Request<CreateInstanceExportTaskRequest>, CreateInstanceExportTaskRequest> {

    public Request<CreateInstanceExportTaskRequest> marshall(CreateInstanceExportTaskRequest createInstanceExportTaskRequest) {

        if (createInstanceExportTaskRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateInstanceExportTaskRequest> request = new DefaultRequest<CreateInstanceExportTaskRequest>(createInstanceExportTaskRequest, "AmazonEC2");
        request.addParameter("Action", "CreateInstanceExportTask");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (createInstanceExportTaskRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(createInstanceExportTaskRequest.getDescription()));
        }

        ExportToS3TaskSpecification exportToS3Task = createInstanceExportTaskRequest.getExportToS3Task();
        if (exportToS3Task != null) {

            if (exportToS3Task.getContainerFormat() != null) {
                request.addParameter("ExportToS3.ContainerFormat", StringUtils.fromString(exportToS3Task.getContainerFormat()));
            }

            if (exportToS3Task.getDiskImageFormat() != null) {
                request.addParameter("ExportToS3.DiskImageFormat", StringUtils.fromString(exportToS3Task.getDiskImageFormat()));
            }

            if (exportToS3Task.getS3Bucket() != null) {
                request.addParameter("ExportToS3.S3Bucket", StringUtils.fromString(exportToS3Task.getS3Bucket()));
            }

            if (exportToS3Task.getS3Prefix() != null) {
                request.addParameter("ExportToS3.S3Prefix", StringUtils.fromString(exportToS3Task.getS3Prefix()));
            }
        }

        if (createInstanceExportTaskRequest.getInstanceId() != null) {
            request.addParameter("InstanceId", StringUtils.fromString(createInstanceExportTaskRequest.getInstanceId()));
        }

        if (createInstanceExportTaskRequest.getTargetEnvironment() != null) {
            request.addParameter("TargetEnvironment", StringUtils.fromString(createInstanceExportTaskRequest.getTargetEnvironment()));
        }

        return request;
    }

}
