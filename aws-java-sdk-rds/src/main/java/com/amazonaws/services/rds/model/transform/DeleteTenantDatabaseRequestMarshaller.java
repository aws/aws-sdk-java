/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * DeleteTenantDatabaseRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteTenantDatabaseRequestMarshaller implements Marshaller<Request<DeleteTenantDatabaseRequest>, DeleteTenantDatabaseRequest> {

    public Request<DeleteTenantDatabaseRequest> marshall(DeleteTenantDatabaseRequest deleteTenantDatabaseRequest) {

        if (deleteTenantDatabaseRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteTenantDatabaseRequest> request = new DefaultRequest<DeleteTenantDatabaseRequest>(deleteTenantDatabaseRequest, "AmazonRDS");
        request.addParameter("Action", "DeleteTenantDatabase");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (deleteTenantDatabaseRequest.getDBInstanceIdentifier() != null) {
            request.addParameter("DBInstanceIdentifier", StringUtils.fromString(deleteTenantDatabaseRequest.getDBInstanceIdentifier()));
        }

        if (deleteTenantDatabaseRequest.getTenantDBName() != null) {
            request.addParameter("TenantDBName", StringUtils.fromString(deleteTenantDatabaseRequest.getTenantDBName()));
        }

        if (deleteTenantDatabaseRequest.getSkipFinalSnapshot() != null) {
            request.addParameter("SkipFinalSnapshot", StringUtils.fromBoolean(deleteTenantDatabaseRequest.getSkipFinalSnapshot()));
        }

        if (deleteTenantDatabaseRequest.getFinalDBSnapshotIdentifier() != null) {
            request.addParameter("FinalDBSnapshotIdentifier", StringUtils.fromString(deleteTenantDatabaseRequest.getFinalDBSnapshotIdentifier()));
        }

        return request;
    }

}
