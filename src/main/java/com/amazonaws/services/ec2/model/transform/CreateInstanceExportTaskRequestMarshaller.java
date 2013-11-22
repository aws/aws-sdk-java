/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Create Instance Export Task Request Marshaller
 */
public class CreateInstanceExportTaskRequestMarshaller implements Marshaller<Request<CreateInstanceExportTaskRequest>, CreateInstanceExportTaskRequest> {

    public Request<CreateInstanceExportTaskRequest> marshall(CreateInstanceExportTaskRequest createInstanceExportTaskRequest) {

        if (createInstanceExportTaskRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<CreateInstanceExportTaskRequest> request = new DefaultRequest<CreateInstanceExportTaskRequest>(createInstanceExportTaskRequest, "AmazonEC2");
        request.addParameter("Action", "CreateInstanceExportTask");
        request.addParameter("Version", "2013-10-15");

        if (createInstanceExportTaskRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(createInstanceExportTaskRequest.getDescription()));
        }
        if (createInstanceExportTaskRequest.getInstanceId() != null) {
            request.addParameter("InstanceId", StringUtils.fromString(createInstanceExportTaskRequest.getInstanceId()));
        }
        if (createInstanceExportTaskRequest.getTargetEnvironment() != null) {
            request.addParameter("TargetEnvironment", StringUtils.fromString(createInstanceExportTaskRequest.getTargetEnvironment()));
        }
        ExportToS3TaskSpecification exportToS3TaskSpecificationExportToS3Task = createInstanceExportTaskRequest.getExportToS3Task();
        if (exportToS3TaskSpecificationExportToS3Task != null) {
            if (exportToS3TaskSpecificationExportToS3Task.getDiskImageFormat() != null) {
                request.addParameter("ExportToS3.DiskImageFormat", StringUtils.fromString(exportToS3TaskSpecificationExportToS3Task.getDiskImageFormat()));
            }
            if (exportToS3TaskSpecificationExportToS3Task.getContainerFormat() != null) {
                request.addParameter("ExportToS3.ContainerFormat", StringUtils.fromString(exportToS3TaskSpecificationExportToS3Task.getContainerFormat()));
            }
            if (exportToS3TaskSpecificationExportToS3Task.getS3Bucket() != null) {
                request.addParameter("ExportToS3.S3Bucket", StringUtils.fromString(exportToS3TaskSpecificationExportToS3Task.getS3Bucket()));
            }
            if (exportToS3TaskSpecificationExportToS3Task.getS3Prefix() != null) {
                request.addParameter("ExportToS3.S3Prefix", StringUtils.fromString(exportToS3TaskSpecificationExportToS3Task.getS3Prefix()));
            }
        }


        return request;
    }
}
