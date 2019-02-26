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

import java.util.List;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.docdb.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * RestoreDBClusterToPointInTimeRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RestoreDBClusterToPointInTimeRequestMarshaller implements
        Marshaller<Request<RestoreDBClusterToPointInTimeRequest>, RestoreDBClusterToPointInTimeRequest> {

    public Request<RestoreDBClusterToPointInTimeRequest> marshall(RestoreDBClusterToPointInTimeRequest restoreDBClusterToPointInTimeRequest) {

        if (restoreDBClusterToPointInTimeRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<RestoreDBClusterToPointInTimeRequest> request = new DefaultRequest<RestoreDBClusterToPointInTimeRequest>(restoreDBClusterToPointInTimeRequest,
                "AmazonDocDB");
        request.addParameter("Action", "RestoreDBClusterToPointInTime");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (restoreDBClusterToPointInTimeRequest.getDBClusterIdentifier() != null) {
            request.addParameter("DBClusterIdentifier", StringUtils.fromString(restoreDBClusterToPointInTimeRequest.getDBClusterIdentifier()));
        }

        if (restoreDBClusterToPointInTimeRequest.getSourceDBClusterIdentifier() != null) {
            request.addParameter("SourceDBClusterIdentifier", StringUtils.fromString(restoreDBClusterToPointInTimeRequest.getSourceDBClusterIdentifier()));
        }

        if (restoreDBClusterToPointInTimeRequest.getRestoreToTime() != null) {
            request.addParameter("RestoreToTime", StringUtils.fromDate(restoreDBClusterToPointInTimeRequest.getRestoreToTime()));
        }

        if (restoreDBClusterToPointInTimeRequest.getUseLatestRestorableTime() != null) {
            request.addParameter("UseLatestRestorableTime", StringUtils.fromBoolean(restoreDBClusterToPointInTimeRequest.getUseLatestRestorableTime()));
        }

        if (restoreDBClusterToPointInTimeRequest.getPort() != null) {
            request.addParameter("Port", StringUtils.fromInteger(restoreDBClusterToPointInTimeRequest.getPort()));
        }

        if (restoreDBClusterToPointInTimeRequest.getDBSubnetGroupName() != null) {
            request.addParameter("DBSubnetGroupName", StringUtils.fromString(restoreDBClusterToPointInTimeRequest.getDBSubnetGroupName()));
        }

        if (restoreDBClusterToPointInTimeRequest.getVpcSecurityGroupIds() != null) {
            java.util.List<String> vpcSecurityGroupIdsList = restoreDBClusterToPointInTimeRequest.getVpcSecurityGroupIds();
            if (vpcSecurityGroupIdsList.isEmpty()) {
                request.addParameter("VpcSecurityGroupIds", "");
            } else {
                int vpcSecurityGroupIdsListIndex = 1;

                for (String vpcSecurityGroupIdsListValue : vpcSecurityGroupIdsList) {
                    if (vpcSecurityGroupIdsListValue != null) {
                        request.addParameter("VpcSecurityGroupIds.VpcSecurityGroupId." + vpcSecurityGroupIdsListIndex,
                                StringUtils.fromString(vpcSecurityGroupIdsListValue));
                    }
                    vpcSecurityGroupIdsListIndex++;
                }
            }
        }

        if (restoreDBClusterToPointInTimeRequest.getTags() != null) {
            java.util.List<Tag> tagsList = restoreDBClusterToPointInTimeRequest.getTags();
            if (tagsList.isEmpty()) {
                request.addParameter("Tags", "");
            } else {
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
        }

        if (restoreDBClusterToPointInTimeRequest.getKmsKeyId() != null) {
            request.addParameter("KmsKeyId", StringUtils.fromString(restoreDBClusterToPointInTimeRequest.getKmsKeyId()));
        }

        if (restoreDBClusterToPointInTimeRequest.getEnableCloudwatchLogsExports() != null) {
            java.util.List<String> enableCloudwatchLogsExportsList = restoreDBClusterToPointInTimeRequest.getEnableCloudwatchLogsExports();
            if (enableCloudwatchLogsExportsList.isEmpty()) {
                request.addParameter("EnableCloudwatchLogsExports", "");
            } else {
                int enableCloudwatchLogsExportsListIndex = 1;

                for (String enableCloudwatchLogsExportsListValue : enableCloudwatchLogsExportsList) {
                    if (enableCloudwatchLogsExportsListValue != null) {
                        request.addParameter("EnableCloudwatchLogsExports.member." + enableCloudwatchLogsExportsListIndex,
                                StringUtils.fromString(enableCloudwatchLogsExportsListValue));
                    }
                    enableCloudwatchLogsExportsListIndex++;
                }
            }
        }

        return request;
    }

}
