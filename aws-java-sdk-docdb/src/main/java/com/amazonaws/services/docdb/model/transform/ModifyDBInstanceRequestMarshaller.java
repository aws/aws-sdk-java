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
package com.amazonaws.services.docdb.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.docdb.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * ModifyDBInstanceRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyDBInstanceRequestMarshaller implements Marshaller<Request<ModifyDBInstanceRequest>, ModifyDBInstanceRequest> {

    public Request<ModifyDBInstanceRequest> marshall(ModifyDBInstanceRequest modifyDBInstanceRequest) {

        if (modifyDBInstanceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyDBInstanceRequest> request = new DefaultRequest<ModifyDBInstanceRequest>(modifyDBInstanceRequest, "AmazonDocDB");
        request.addParameter("Action", "ModifyDBInstance");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyDBInstanceRequest.getDBInstanceIdentifier() != null) {
            request.addParameter("DBInstanceIdentifier", StringUtils.fromString(modifyDBInstanceRequest.getDBInstanceIdentifier()));
        }

        if (modifyDBInstanceRequest.getDBInstanceClass() != null) {
            request.addParameter("DBInstanceClass", StringUtils.fromString(modifyDBInstanceRequest.getDBInstanceClass()));
        }

        if (modifyDBInstanceRequest.getApplyImmediately() != null) {
            request.addParameter("ApplyImmediately", StringUtils.fromBoolean(modifyDBInstanceRequest.getApplyImmediately()));
        }

        if (modifyDBInstanceRequest.getPreferredMaintenanceWindow() != null) {
            request.addParameter("PreferredMaintenanceWindow", StringUtils.fromString(modifyDBInstanceRequest.getPreferredMaintenanceWindow()));
        }

        if (modifyDBInstanceRequest.getAutoMinorVersionUpgrade() != null) {
            request.addParameter("AutoMinorVersionUpgrade", StringUtils.fromBoolean(modifyDBInstanceRequest.getAutoMinorVersionUpgrade()));
        }

        if (modifyDBInstanceRequest.getNewDBInstanceIdentifier() != null) {
            request.addParameter("NewDBInstanceIdentifier", StringUtils.fromString(modifyDBInstanceRequest.getNewDBInstanceIdentifier()));
        }

        if (modifyDBInstanceRequest.getPromotionTier() != null) {
            request.addParameter("PromotionTier", StringUtils.fromInteger(modifyDBInstanceRequest.getPromotionTier()));
        }

        return request;
    }

}
