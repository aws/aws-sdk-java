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
 * ModifyTenantDatabaseRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyTenantDatabaseRequestMarshaller implements Marshaller<Request<ModifyTenantDatabaseRequest>, ModifyTenantDatabaseRequest> {

    public Request<ModifyTenantDatabaseRequest> marshall(ModifyTenantDatabaseRequest modifyTenantDatabaseRequest) {

        if (modifyTenantDatabaseRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyTenantDatabaseRequest> request = new DefaultRequest<ModifyTenantDatabaseRequest>(modifyTenantDatabaseRequest, "AmazonRDS");
        request.addParameter("Action", "ModifyTenantDatabase");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyTenantDatabaseRequest.getDBInstanceIdentifier() != null) {
            request.addParameter("DBInstanceIdentifier", StringUtils.fromString(modifyTenantDatabaseRequest.getDBInstanceIdentifier()));
        }

        if (modifyTenantDatabaseRequest.getTenantDBName() != null) {
            request.addParameter("TenantDBName", StringUtils.fromString(modifyTenantDatabaseRequest.getTenantDBName()));
        }

        if (modifyTenantDatabaseRequest.getMasterUserPassword() != null) {
            request.addParameter("MasterUserPassword", StringUtils.fromString(modifyTenantDatabaseRequest.getMasterUserPassword()));
        }

        if (modifyTenantDatabaseRequest.getNewTenantDBName() != null) {
            request.addParameter("NewTenantDBName", StringUtils.fromString(modifyTenantDatabaseRequest.getNewTenantDBName()));
        }

        return request;
    }

}
