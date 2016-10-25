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
package com.amazonaws.services.rds.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * CreateDBInstanceReadReplicaRequest Marshaller
 */

public class CreateDBInstanceReadReplicaRequestMarshaller implements
        Marshaller<Request<CreateDBInstanceReadReplicaRequest>, CreateDBInstanceReadReplicaRequest> {

    public Request<CreateDBInstanceReadReplicaRequest> marshall(CreateDBInstanceReadReplicaRequest createDBInstanceReadReplicaRequest) {

        if (createDBInstanceReadReplicaRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateDBInstanceReadReplicaRequest> request = new DefaultRequest<CreateDBInstanceReadReplicaRequest>(createDBInstanceReadReplicaRequest,
                "AmazonRDS");
        request.addParameter("Action", "CreateDBInstanceReadReplica");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (createDBInstanceReadReplicaRequest.getDBInstanceIdentifier() != null) {
            request.addParameter("DBInstanceIdentifier", StringUtils.fromString(createDBInstanceReadReplicaRequest.getDBInstanceIdentifier()));
        }

        if (createDBInstanceReadReplicaRequest.getSourceDBInstanceIdentifier() != null) {
            request.addParameter("SourceDBInstanceIdentifier", StringUtils.fromString(createDBInstanceReadReplicaRequest.getSourceDBInstanceIdentifier()));
        }

        if (createDBInstanceReadReplicaRequest.getDBInstanceClass() != null) {
            request.addParameter("DBInstanceClass", StringUtils.fromString(createDBInstanceReadReplicaRequest.getDBInstanceClass()));
        }

        if (createDBInstanceReadReplicaRequest.getAvailabilityZone() != null) {
            request.addParameter("AvailabilityZone", StringUtils.fromString(createDBInstanceReadReplicaRequest.getAvailabilityZone()));
        }

        if (createDBInstanceReadReplicaRequest.getPort() != null) {
            request.addParameter("Port", StringUtils.fromInteger(createDBInstanceReadReplicaRequest.getPort()));
        }

        if (createDBInstanceReadReplicaRequest.getAutoMinorVersionUpgrade() != null) {
            request.addParameter("AutoMinorVersionUpgrade", StringUtils.fromBoolean(createDBInstanceReadReplicaRequest.getAutoMinorVersionUpgrade()));
        }

        if (createDBInstanceReadReplicaRequest.getIops() != null) {
            request.addParameter("Iops", StringUtils.fromInteger(createDBInstanceReadReplicaRequest.getIops()));
        }

        if (createDBInstanceReadReplicaRequest.getOptionGroupName() != null) {
            request.addParameter("OptionGroupName", StringUtils.fromString(createDBInstanceReadReplicaRequest.getOptionGroupName()));
        }

        if (createDBInstanceReadReplicaRequest.getPubliclyAccessible() != null) {
            request.addParameter("PubliclyAccessible", StringUtils.fromBoolean(createDBInstanceReadReplicaRequest.getPubliclyAccessible()));
        }

        com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createDBInstanceReadReplicaRequest.getTags();
        if (!tagsList.isEmpty() || !tagsList.isAutoConstruct()) {
            int tagsListIndex = 1;

            for (Tag tagsListValue : tagsList) {

                if (tagsListValue.getKey() != null) {
                    request.addParameter("Tags.Tag." + tagsListIndex + ".Key", StringUtils.fromString(tagsListValue.getKey()));
                }

                if (tagsListValue.getValue() != null) {
                    request.addParameter("Tags.Tag." + tagsListIndex + ".Value", StringUtils.fromString(tagsListValue.getValue()));
                }
                tagsListIndex++;
            }
        }

        if (createDBInstanceReadReplicaRequest.getDBSubnetGroupName() != null) {
            request.addParameter("DBSubnetGroupName", StringUtils.fromString(createDBInstanceReadReplicaRequest.getDBSubnetGroupName()));
        }

        if (createDBInstanceReadReplicaRequest.getStorageType() != null) {
            request.addParameter("StorageType", StringUtils.fromString(createDBInstanceReadReplicaRequest.getStorageType()));
        }

        if (createDBInstanceReadReplicaRequest.getCopyTagsToSnapshot() != null) {
            request.addParameter("CopyTagsToSnapshot", StringUtils.fromBoolean(createDBInstanceReadReplicaRequest.getCopyTagsToSnapshot()));
        }

        if (createDBInstanceReadReplicaRequest.getMonitoringInterval() != null) {
            request.addParameter("MonitoringInterval", StringUtils.fromInteger(createDBInstanceReadReplicaRequest.getMonitoringInterval()));
        }

        if (createDBInstanceReadReplicaRequest.getMonitoringRoleArn() != null) {
            request.addParameter("MonitoringRoleArn", StringUtils.fromString(createDBInstanceReadReplicaRequest.getMonitoringRoleArn()));
        }

        return request;
    }

}
