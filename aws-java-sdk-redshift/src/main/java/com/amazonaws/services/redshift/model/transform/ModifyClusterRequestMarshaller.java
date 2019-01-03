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
 * ModifyClusterRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyClusterRequestMarshaller implements Marshaller<Request<ModifyClusterRequest>, ModifyClusterRequest> {

    public Request<ModifyClusterRequest> marshall(ModifyClusterRequest modifyClusterRequest) {

        if (modifyClusterRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyClusterRequest> request = new DefaultRequest<ModifyClusterRequest>(modifyClusterRequest, "AmazonRedshift");
        request.addParameter("Action", "ModifyCluster");
        request.addParameter("Version", "2012-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyClusterRequest.getClusterIdentifier() != null) {
            request.addParameter("ClusterIdentifier", StringUtils.fromString(modifyClusterRequest.getClusterIdentifier()));
        }

        if (modifyClusterRequest.getClusterType() != null) {
            request.addParameter("ClusterType", StringUtils.fromString(modifyClusterRequest.getClusterType()));
        }

        if (modifyClusterRequest.getNodeType() != null) {
            request.addParameter("NodeType", StringUtils.fromString(modifyClusterRequest.getNodeType()));
        }

        if (modifyClusterRequest.getNumberOfNodes() != null) {
            request.addParameter("NumberOfNodes", StringUtils.fromInteger(modifyClusterRequest.getNumberOfNodes()));
        }

        if (!modifyClusterRequest.getClusterSecurityGroups().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) modifyClusterRequest.getClusterSecurityGroups()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> clusterSecurityGroupsList = (com.amazonaws.internal.SdkInternalList<String>) modifyClusterRequest
                    .getClusterSecurityGroups();
            int clusterSecurityGroupsListIndex = 1;

            for (String clusterSecurityGroupsListValue : clusterSecurityGroupsList) {
                if (clusterSecurityGroupsListValue != null) {
                    request.addParameter("ClusterSecurityGroups.ClusterSecurityGroupName." + clusterSecurityGroupsListIndex,
                            StringUtils.fromString(clusterSecurityGroupsListValue));
                }
                clusterSecurityGroupsListIndex++;
            }
        }

        if (!modifyClusterRequest.getVpcSecurityGroupIds().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) modifyClusterRequest.getVpcSecurityGroupIds()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> vpcSecurityGroupIdsList = (com.amazonaws.internal.SdkInternalList<String>) modifyClusterRequest
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

        if (modifyClusterRequest.getMasterUserPassword() != null) {
            request.addParameter("MasterUserPassword", StringUtils.fromString(modifyClusterRequest.getMasterUserPassword()));
        }

        if (modifyClusterRequest.getClusterParameterGroupName() != null) {
            request.addParameter("ClusterParameterGroupName", StringUtils.fromString(modifyClusterRequest.getClusterParameterGroupName()));
        }

        if (modifyClusterRequest.getAutomatedSnapshotRetentionPeriod() != null) {
            request.addParameter("AutomatedSnapshotRetentionPeriod", StringUtils.fromInteger(modifyClusterRequest.getAutomatedSnapshotRetentionPeriod()));
        }

        if (modifyClusterRequest.getManualSnapshotRetentionPeriod() != null) {
            request.addParameter("ManualSnapshotRetentionPeriod", StringUtils.fromInteger(modifyClusterRequest.getManualSnapshotRetentionPeriod()));
        }

        if (modifyClusterRequest.getPreferredMaintenanceWindow() != null) {
            request.addParameter("PreferredMaintenanceWindow", StringUtils.fromString(modifyClusterRequest.getPreferredMaintenanceWindow()));
        }

        if (modifyClusterRequest.getClusterVersion() != null) {
            request.addParameter("ClusterVersion", StringUtils.fromString(modifyClusterRequest.getClusterVersion()));
        }

        if (modifyClusterRequest.getAllowVersionUpgrade() != null) {
            request.addParameter("AllowVersionUpgrade", StringUtils.fromBoolean(modifyClusterRequest.getAllowVersionUpgrade()));
        }

        if (modifyClusterRequest.getHsmClientCertificateIdentifier() != null) {
            request.addParameter("HsmClientCertificateIdentifier", StringUtils.fromString(modifyClusterRequest.getHsmClientCertificateIdentifier()));
        }

        if (modifyClusterRequest.getHsmConfigurationIdentifier() != null) {
            request.addParameter("HsmConfigurationIdentifier", StringUtils.fromString(modifyClusterRequest.getHsmConfigurationIdentifier()));
        }

        if (modifyClusterRequest.getNewClusterIdentifier() != null) {
            request.addParameter("NewClusterIdentifier", StringUtils.fromString(modifyClusterRequest.getNewClusterIdentifier()));
        }

        if (modifyClusterRequest.getPubliclyAccessible() != null) {
            request.addParameter("PubliclyAccessible", StringUtils.fromBoolean(modifyClusterRequest.getPubliclyAccessible()));
        }

        if (modifyClusterRequest.getElasticIp() != null) {
            request.addParameter("ElasticIp", StringUtils.fromString(modifyClusterRequest.getElasticIp()));
        }

        if (modifyClusterRequest.getEnhancedVpcRouting() != null) {
            request.addParameter("EnhancedVpcRouting", StringUtils.fromBoolean(modifyClusterRequest.getEnhancedVpcRouting()));
        }

        if (modifyClusterRequest.getMaintenanceTrackName() != null) {
            request.addParameter("MaintenanceTrackName", StringUtils.fromString(modifyClusterRequest.getMaintenanceTrackName()));
        }

        if (modifyClusterRequest.getEncrypted() != null) {
            request.addParameter("Encrypted", StringUtils.fromBoolean(modifyClusterRequest.getEncrypted()));
        }

        if (modifyClusterRequest.getKmsKeyId() != null) {
            request.addParameter("KmsKeyId", StringUtils.fromString(modifyClusterRequest.getKmsKeyId()));
        }

        return request;
    }

}
