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
package com.amazonaws.services.redshift.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * ModifyClusterMaintenanceRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyClusterMaintenanceRequestMarshaller implements Marshaller<Request<ModifyClusterMaintenanceRequest>, ModifyClusterMaintenanceRequest> {

    public Request<ModifyClusterMaintenanceRequest> marshall(ModifyClusterMaintenanceRequest modifyClusterMaintenanceRequest) {

        if (modifyClusterMaintenanceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyClusterMaintenanceRequest> request = new DefaultRequest<ModifyClusterMaintenanceRequest>(modifyClusterMaintenanceRequest,
                "AmazonRedshift");
        request.addParameter("Action", "ModifyClusterMaintenance");
        request.addParameter("Version", "2012-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyClusterMaintenanceRequest.getClusterIdentifier() != null) {
            request.addParameter("ClusterIdentifier", StringUtils.fromString(modifyClusterMaintenanceRequest.getClusterIdentifier()));
        }

        if (modifyClusterMaintenanceRequest.getDeferMaintenance() != null) {
            request.addParameter("DeferMaintenance", StringUtils.fromBoolean(modifyClusterMaintenanceRequest.getDeferMaintenance()));
        }

        if (modifyClusterMaintenanceRequest.getDeferMaintenanceIdentifier() != null) {
            request.addParameter("DeferMaintenanceIdentifier", StringUtils.fromString(modifyClusterMaintenanceRequest.getDeferMaintenanceIdentifier()));
        }

        if (modifyClusterMaintenanceRequest.getDeferMaintenanceStartTime() != null) {
            request.addParameter("DeferMaintenanceStartTime", StringUtils.fromDate(modifyClusterMaintenanceRequest.getDeferMaintenanceStartTime()));
        }

        if (modifyClusterMaintenanceRequest.getDeferMaintenanceEndTime() != null) {
            request.addParameter("DeferMaintenanceEndTime", StringUtils.fromDate(modifyClusterMaintenanceRequest.getDeferMaintenanceEndTime()));
        }

        if (modifyClusterMaintenanceRequest.getDeferMaintenanceDuration() != null) {
            request.addParameter("DeferMaintenanceDuration", StringUtils.fromInteger(modifyClusterMaintenanceRequest.getDeferMaintenanceDuration()));
        }

        return request;
    }

}
