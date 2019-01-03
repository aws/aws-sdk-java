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
 * RestoreDBInstanceToPointInTimeRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RestoreDBInstanceToPointInTimeRequestMarshaller implements
        Marshaller<Request<RestoreDBInstanceToPointInTimeRequest>, RestoreDBInstanceToPointInTimeRequest> {

    public Request<RestoreDBInstanceToPointInTimeRequest> marshall(RestoreDBInstanceToPointInTimeRequest restoreDBInstanceToPointInTimeRequest) {

        if (restoreDBInstanceToPointInTimeRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<RestoreDBInstanceToPointInTimeRequest> request = new DefaultRequest<RestoreDBInstanceToPointInTimeRequest>(
                restoreDBInstanceToPointInTimeRequest, "AmazonRDS");
        request.addParameter("Action", "RestoreDBInstanceToPointInTime");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (restoreDBInstanceToPointInTimeRequest.getSourceDBInstanceIdentifier() != null) {
            request.addParameter("SourceDBInstanceIdentifier", StringUtils.fromString(restoreDBInstanceToPointInTimeRequest.getSourceDBInstanceIdentifier()));
        }

        if (restoreDBInstanceToPointInTimeRequest.getTargetDBInstanceIdentifier() != null) {
            request.addParameter("TargetDBInstanceIdentifier", StringUtils.fromString(restoreDBInstanceToPointInTimeRequest.getTargetDBInstanceIdentifier()));
        }

        if (restoreDBInstanceToPointInTimeRequest.getRestoreTime() != null) {
            request.addParameter("RestoreTime", StringUtils.fromDate(restoreDBInstanceToPointInTimeRequest.getRestoreTime()));
        }

        if (restoreDBInstanceToPointInTimeRequest.getUseLatestRestorableTime() != null) {
            request.addParameter("UseLatestRestorableTime", StringUtils.fromBoolean(restoreDBInstanceToPointInTimeRequest.getUseLatestRestorableTime()));
        }

        if (restoreDBInstanceToPointInTimeRequest.getDBInstanceClass() != null) {
            request.addParameter("DBInstanceClass", StringUtils.fromString(restoreDBInstanceToPointInTimeRequest.getDBInstanceClass()));
        }

        if (restoreDBInstanceToPointInTimeRequest.getPort() != null) {
            request.addParameter("Port", StringUtils.fromInteger(restoreDBInstanceToPointInTimeRequest.getPort()));
        }

        if (restoreDBInstanceToPointInTimeRequest.getAvailabilityZone() != null) {
            request.addParameter("AvailabilityZone", StringUtils.fromString(restoreDBInstanceToPointInTimeRequest.getAvailabilityZone()));
        }

        if (restoreDBInstanceToPointInTimeRequest.getDBSubnetGroupName() != null) {
            request.addParameter("DBSubnetGroupName", StringUtils.fromString(restoreDBInstanceToPointInTimeRequest.getDBSubnetGroupName()));
        }

        if (restoreDBInstanceToPointInTimeRequest.getMultiAZ() != null) {
            request.addParameter("MultiAZ", StringUtils.fromBoolean(restoreDBInstanceToPointInTimeRequest.getMultiAZ()));
        }

        if (restoreDBInstanceToPointInTimeRequest.getPubliclyAccessible() != null) {
            request.addParameter("PubliclyAccessible", StringUtils.fromBoolean(restoreDBInstanceToPointInTimeRequest.getPubliclyAccessible()));
        }

        if (restoreDBInstanceToPointInTimeRequest.getAutoMinorVersionUpgrade() != null) {
            request.addParameter("AutoMinorVersionUpgrade", StringUtils.fromBoolean(restoreDBInstanceToPointInTimeRequest.getAutoMinorVersionUpgrade()));
        }

        if (restoreDBInstanceToPointInTimeRequest.getLicenseModel() != null) {
            request.addParameter("LicenseModel", StringUtils.fromString(restoreDBInstanceToPointInTimeRequest.getLicenseModel()));
        }

        if (restoreDBInstanceToPointInTimeRequest.getDBName() != null) {
            request.addParameter("DBName", StringUtils.fromString(restoreDBInstanceToPointInTimeRequest.getDBName()));
        }

        if (restoreDBInstanceToPointInTimeRequest.getEngine() != null) {
            request.addParameter("Engine", StringUtils.fromString(restoreDBInstanceToPointInTimeRequest.getEngine()));
        }

        if (restoreDBInstanceToPointInTimeRequest.getIops() != null) {
            request.addParameter("Iops", StringUtils.fromInteger(restoreDBInstanceToPointInTimeRequest.getIops()));
        }

        if (restoreDBInstanceToPointInTimeRequest.getOptionGroupName() != null) {
            request.addParameter("OptionGroupName", StringUtils.fromString(restoreDBInstanceToPointInTimeRequest.getOptionGroupName()));
        }

        if (restoreDBInstanceToPointInTimeRequest.getCopyTagsToSnapshot() != null) {
            request.addParameter("CopyTagsToSnapshot", StringUtils.fromBoolean(restoreDBInstanceToPointInTimeRequest.getCopyTagsToSnapshot()));
        }

        if (!restoreDBInstanceToPointInTimeRequest.getTags().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<Tag>) restoreDBInstanceToPointInTimeRequest.getTags()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) restoreDBInstanceToPointInTimeRequest
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

        if (restoreDBInstanceToPointInTimeRequest.getStorageType() != null) {
            request.addParameter("StorageType", StringUtils.fromString(restoreDBInstanceToPointInTimeRequest.getStorageType()));
        }

        if (restoreDBInstanceToPointInTimeRequest.getTdeCredentialArn() != null) {
            request.addParameter("TdeCredentialArn", StringUtils.fromString(restoreDBInstanceToPointInTimeRequest.getTdeCredentialArn()));
        }

        if (restoreDBInstanceToPointInTimeRequest.getTdeCredentialPassword() != null) {
            request.addParameter("TdeCredentialPassword", StringUtils.fromString(restoreDBInstanceToPointInTimeRequest.getTdeCredentialPassword()));
        }

        if (!restoreDBInstanceToPointInTimeRequest.getVpcSecurityGroupIds().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) restoreDBInstanceToPointInTimeRequest.getVpcSecurityGroupIds()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> vpcSecurityGroupIdsList = (com.amazonaws.internal.SdkInternalList<String>) restoreDBInstanceToPointInTimeRequest
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

        if (restoreDBInstanceToPointInTimeRequest.getDomain() != null) {
            request.addParameter("Domain", StringUtils.fromString(restoreDBInstanceToPointInTimeRequest.getDomain()));
        }

        if (restoreDBInstanceToPointInTimeRequest.getDomainIAMRoleName() != null) {
            request.addParameter("DomainIAMRoleName", StringUtils.fromString(restoreDBInstanceToPointInTimeRequest.getDomainIAMRoleName()));
        }

        if (restoreDBInstanceToPointInTimeRequest.getEnableIAMDatabaseAuthentication() != null) {
            request.addParameter("EnableIAMDatabaseAuthentication",
                    StringUtils.fromBoolean(restoreDBInstanceToPointInTimeRequest.getEnableIAMDatabaseAuthentication()));
        }

        if (!restoreDBInstanceToPointInTimeRequest.getEnableCloudwatchLogsExports().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) restoreDBInstanceToPointInTimeRequest.getEnableCloudwatchLogsExports()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> enableCloudwatchLogsExportsList = (com.amazonaws.internal.SdkInternalList<String>) restoreDBInstanceToPointInTimeRequest
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

        if (!restoreDBInstanceToPointInTimeRequest.getProcessorFeatures().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<ProcessorFeature>) restoreDBInstanceToPointInTimeRequest.getProcessorFeatures()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<ProcessorFeature> processorFeaturesList = (com.amazonaws.internal.SdkInternalList<ProcessorFeature>) restoreDBInstanceToPointInTimeRequest
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

        if (restoreDBInstanceToPointInTimeRequest.getUseDefaultProcessorFeatures() != null) {
            request.addParameter("UseDefaultProcessorFeatures", StringUtils.fromBoolean(restoreDBInstanceToPointInTimeRequest.getUseDefaultProcessorFeatures()));
        }

        if (restoreDBInstanceToPointInTimeRequest.getDBParameterGroupName() != null) {
            request.addParameter("DBParameterGroupName", StringUtils.fromString(restoreDBInstanceToPointInTimeRequest.getDBParameterGroupName()));
        }

        if (restoreDBInstanceToPointInTimeRequest.getDeletionProtection() != null) {
            request.addParameter("DeletionProtection", StringUtils.fromBoolean(restoreDBInstanceToPointInTimeRequest.getDeletionProtection()));
        }

        if (restoreDBInstanceToPointInTimeRequest.getSourceDbiResourceId() != null) {
            request.addParameter("SourceDbiResourceId", StringUtils.fromString(restoreDBInstanceToPointInTimeRequest.getSourceDbiResourceId()));
        }

        return request;
    }

}
