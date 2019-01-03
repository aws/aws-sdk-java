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
 * RestoreDBInstanceFromDBSnapshotRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RestoreDBInstanceFromDBSnapshotRequestMarshaller implements
        Marshaller<Request<RestoreDBInstanceFromDBSnapshotRequest>, RestoreDBInstanceFromDBSnapshotRequest> {

    public Request<RestoreDBInstanceFromDBSnapshotRequest> marshall(RestoreDBInstanceFromDBSnapshotRequest restoreDBInstanceFromDBSnapshotRequest) {

        if (restoreDBInstanceFromDBSnapshotRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<RestoreDBInstanceFromDBSnapshotRequest> request = new DefaultRequest<RestoreDBInstanceFromDBSnapshotRequest>(
                restoreDBInstanceFromDBSnapshotRequest, "AmazonRDS");
        request.addParameter("Action", "RestoreDBInstanceFromDBSnapshot");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (restoreDBInstanceFromDBSnapshotRequest.getDBInstanceIdentifier() != null) {
            request.addParameter("DBInstanceIdentifier", StringUtils.fromString(restoreDBInstanceFromDBSnapshotRequest.getDBInstanceIdentifier()));
        }

        if (restoreDBInstanceFromDBSnapshotRequest.getDBSnapshotIdentifier() != null) {
            request.addParameter("DBSnapshotIdentifier", StringUtils.fromString(restoreDBInstanceFromDBSnapshotRequest.getDBSnapshotIdentifier()));
        }

        if (restoreDBInstanceFromDBSnapshotRequest.getDBInstanceClass() != null) {
            request.addParameter("DBInstanceClass", StringUtils.fromString(restoreDBInstanceFromDBSnapshotRequest.getDBInstanceClass()));
        }

        if (restoreDBInstanceFromDBSnapshotRequest.getPort() != null) {
            request.addParameter("Port", StringUtils.fromInteger(restoreDBInstanceFromDBSnapshotRequest.getPort()));
        }

        if (restoreDBInstanceFromDBSnapshotRequest.getAvailabilityZone() != null) {
            request.addParameter("AvailabilityZone", StringUtils.fromString(restoreDBInstanceFromDBSnapshotRequest.getAvailabilityZone()));
        }

        if (restoreDBInstanceFromDBSnapshotRequest.getDBSubnetGroupName() != null) {
            request.addParameter("DBSubnetGroupName", StringUtils.fromString(restoreDBInstanceFromDBSnapshotRequest.getDBSubnetGroupName()));
        }

        if (restoreDBInstanceFromDBSnapshotRequest.getMultiAZ() != null) {
            request.addParameter("MultiAZ", StringUtils.fromBoolean(restoreDBInstanceFromDBSnapshotRequest.getMultiAZ()));
        }

        if (restoreDBInstanceFromDBSnapshotRequest.getPubliclyAccessible() != null) {
            request.addParameter("PubliclyAccessible", StringUtils.fromBoolean(restoreDBInstanceFromDBSnapshotRequest.getPubliclyAccessible()));
        }

        if (restoreDBInstanceFromDBSnapshotRequest.getAutoMinorVersionUpgrade() != null) {
            request.addParameter("AutoMinorVersionUpgrade", StringUtils.fromBoolean(restoreDBInstanceFromDBSnapshotRequest.getAutoMinorVersionUpgrade()));
        }

        if (restoreDBInstanceFromDBSnapshotRequest.getLicenseModel() != null) {
            request.addParameter("LicenseModel", StringUtils.fromString(restoreDBInstanceFromDBSnapshotRequest.getLicenseModel()));
        }

        if (restoreDBInstanceFromDBSnapshotRequest.getDBName() != null) {
            request.addParameter("DBName", StringUtils.fromString(restoreDBInstanceFromDBSnapshotRequest.getDBName()));
        }

        if (restoreDBInstanceFromDBSnapshotRequest.getEngine() != null) {
            request.addParameter("Engine", StringUtils.fromString(restoreDBInstanceFromDBSnapshotRequest.getEngine()));
        }

        if (restoreDBInstanceFromDBSnapshotRequest.getIops() != null) {
            request.addParameter("Iops", StringUtils.fromInteger(restoreDBInstanceFromDBSnapshotRequest.getIops()));
        }

        if (restoreDBInstanceFromDBSnapshotRequest.getOptionGroupName() != null) {
            request.addParameter("OptionGroupName", StringUtils.fromString(restoreDBInstanceFromDBSnapshotRequest.getOptionGroupName()));
        }

        if (!restoreDBInstanceFromDBSnapshotRequest.getTags().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<Tag>) restoreDBInstanceFromDBSnapshotRequest.getTags()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) restoreDBInstanceFromDBSnapshotRequest
                    .getTags();
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

        if (restoreDBInstanceFromDBSnapshotRequest.getStorageType() != null) {
            request.addParameter("StorageType", StringUtils.fromString(restoreDBInstanceFromDBSnapshotRequest.getStorageType()));
        }

        if (restoreDBInstanceFromDBSnapshotRequest.getTdeCredentialArn() != null) {
            request.addParameter("TdeCredentialArn", StringUtils.fromString(restoreDBInstanceFromDBSnapshotRequest.getTdeCredentialArn()));
        }

        if (restoreDBInstanceFromDBSnapshotRequest.getTdeCredentialPassword() != null) {
            request.addParameter("TdeCredentialPassword", StringUtils.fromString(restoreDBInstanceFromDBSnapshotRequest.getTdeCredentialPassword()));
        }

        if (!restoreDBInstanceFromDBSnapshotRequest.getVpcSecurityGroupIds().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) restoreDBInstanceFromDBSnapshotRequest.getVpcSecurityGroupIds()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> vpcSecurityGroupIdsList = (com.amazonaws.internal.SdkInternalList<String>) restoreDBInstanceFromDBSnapshotRequest
                    .getVpcSecurityGroupIds();
            int vpcSecurityGroupIdsListIndex = 1;

            for (String vpcSecurityGroupIdsListValue : vpcSecurityGroupIdsList) {
                if (vpcSecurityGroupIdsListValue != null) {
                    request.addParameter("VpcSecurityGroupIds.VpcSecurityGroupId." + vpcSecurityGroupIdsListIndex,
                            StringUtils.fromString(vpcSecurityGroupIdsListValue));
                }
                vpcSecurityGroupIdsListIndex++;
            }
        }

        if (restoreDBInstanceFromDBSnapshotRequest.getDomain() != null) {
            request.addParameter("Domain", StringUtils.fromString(restoreDBInstanceFromDBSnapshotRequest.getDomain()));
        }

        if (restoreDBInstanceFromDBSnapshotRequest.getCopyTagsToSnapshot() != null) {
            request.addParameter("CopyTagsToSnapshot", StringUtils.fromBoolean(restoreDBInstanceFromDBSnapshotRequest.getCopyTagsToSnapshot()));
        }

        if (restoreDBInstanceFromDBSnapshotRequest.getDomainIAMRoleName() != null) {
            request.addParameter("DomainIAMRoleName", StringUtils.fromString(restoreDBInstanceFromDBSnapshotRequest.getDomainIAMRoleName()));
        }

        if (restoreDBInstanceFromDBSnapshotRequest.getEnableIAMDatabaseAuthentication() != null) {
            request.addParameter("EnableIAMDatabaseAuthentication",
                    StringUtils.fromBoolean(restoreDBInstanceFromDBSnapshotRequest.getEnableIAMDatabaseAuthentication()));
        }

        if (!restoreDBInstanceFromDBSnapshotRequest.getEnableCloudwatchLogsExports().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) restoreDBInstanceFromDBSnapshotRequest.getEnableCloudwatchLogsExports())
                        .isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> enableCloudwatchLogsExportsList = (com.amazonaws.internal.SdkInternalList<String>) restoreDBInstanceFromDBSnapshotRequest
                    .getEnableCloudwatchLogsExports();
            int enableCloudwatchLogsExportsListIndex = 1;

            for (String enableCloudwatchLogsExportsListValue : enableCloudwatchLogsExportsList) {
                if (enableCloudwatchLogsExportsListValue != null) {
                    request.addParameter("EnableCloudwatchLogsExports.member." + enableCloudwatchLogsExportsListIndex,
                            StringUtils.fromString(enableCloudwatchLogsExportsListValue));
                }
                enableCloudwatchLogsExportsListIndex++;
            }
        }

        if (!restoreDBInstanceFromDBSnapshotRequest.getProcessorFeatures().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<ProcessorFeature>) restoreDBInstanceFromDBSnapshotRequest.getProcessorFeatures())
                        .isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<ProcessorFeature> processorFeaturesList = (com.amazonaws.internal.SdkInternalList<ProcessorFeature>) restoreDBInstanceFromDBSnapshotRequest
                    .getProcessorFeatures();
            int processorFeaturesListIndex = 1;

            for (ProcessorFeature processorFeaturesListValue : processorFeaturesList) {

                if (processorFeaturesListValue.getName() != null) {
                    request.addParameter("ProcessorFeatures.ProcessorFeature." + processorFeaturesListIndex + ".Name",
                            StringUtils.fromString(processorFeaturesListValue.getName()));
                }

                if (processorFeaturesListValue.getValue() != null) {
                    request.addParameter("ProcessorFeatures.ProcessorFeature." + processorFeaturesListIndex + ".Value",
                            StringUtils.fromString(processorFeaturesListValue.getValue()));
                }
                processorFeaturesListIndex++;
            }
        }

        if (restoreDBInstanceFromDBSnapshotRequest.getUseDefaultProcessorFeatures() != null) {
            request.addParameter("UseDefaultProcessorFeatures",
                    StringUtils.fromBoolean(restoreDBInstanceFromDBSnapshotRequest.getUseDefaultProcessorFeatures()));
        }

        if (restoreDBInstanceFromDBSnapshotRequest.getDBParameterGroupName() != null) {
            request.addParameter("DBParameterGroupName", StringUtils.fromString(restoreDBInstanceFromDBSnapshotRequest.getDBParameterGroupName()));
        }

        if (restoreDBInstanceFromDBSnapshotRequest.getDeletionProtection() != null) {
            request.addParameter("DeletionProtection", StringUtils.fromBoolean(restoreDBInstanceFromDBSnapshotRequest.getDeletionProtection()));
        }

        return request;
    }

}
