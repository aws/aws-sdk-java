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
 * CreateGlobalClusterRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateGlobalClusterRequestMarshaller implements Marshaller<Request<CreateGlobalClusterRequest>, CreateGlobalClusterRequest> {

    public Request<CreateGlobalClusterRequest> marshall(CreateGlobalClusterRequest createGlobalClusterRequest) {

        if (createGlobalClusterRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateGlobalClusterRequest> request = new DefaultRequest<CreateGlobalClusterRequest>(createGlobalClusterRequest, "AmazonRDS");
        request.addParameter("Action", "CreateGlobalCluster");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (createGlobalClusterRequest.getGlobalClusterIdentifier() != null) {
            request.addParameter("GlobalClusterIdentifier", StringUtils.fromString(createGlobalClusterRequest.getGlobalClusterIdentifier()));
        }

        if (createGlobalClusterRequest.getSourceDBClusterIdentifier() != null) {
            request.addParameter("SourceDBClusterIdentifier", StringUtils.fromString(createGlobalClusterRequest.getSourceDBClusterIdentifier()));
        }

        if (createGlobalClusterRequest.getEngine() != null) {
            request.addParameter("Engine", StringUtils.fromString(createGlobalClusterRequest.getEngine()));
        }

        if (createGlobalClusterRequest.getEngineVersion() != null) {
            request.addParameter("EngineVersion", StringUtils.fromString(createGlobalClusterRequest.getEngineVersion()));
        }

        if (createGlobalClusterRequest.getDeletionProtection() != null) {
            request.addParameter("DeletionProtection", StringUtils.fromBoolean(createGlobalClusterRequest.getDeletionProtection()));
        }

        if (createGlobalClusterRequest.getDatabaseName() != null) {
            request.addParameter("DatabaseName", StringUtils.fromString(createGlobalClusterRequest.getDatabaseName()));
        }

        if (createGlobalClusterRequest.getStorageEncrypted() != null) {
            request.addParameter("StorageEncrypted", StringUtils.fromBoolean(createGlobalClusterRequest.getStorageEncrypted()));
        }

        return request;
    }

}
