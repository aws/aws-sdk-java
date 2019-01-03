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
 * CreateClusterRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateClusterRequestMarshaller implements Marshaller<Request<CreateClusterRequest>, CreateClusterRequest> {

    public Request<CreateClusterRequest> marshall(CreateClusterRequest createClusterRequest) {

        if (createClusterRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateClusterRequest> request = new DefaultRequest<CreateClusterRequest>(createClusterRequest, "AmazonRedshift");
        request.addParameter("Action", "CreateCluster");
        request.addParameter("Version", "2012-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (createClusterRequest.getDBName() != null) {
            request.addParameter("DBName", StringUtils.fromString(createClusterRequest.getDBName()));
        }

        if (createClusterRequest.getClusterIdentifier() != null) {
            request.addParameter("ClusterIdentifier", StringUtils.fromString(createClusterRequest.getClusterIdentifier()));
        }

        if (createClusterRequest.getClusterType() != null) {
            request.addParameter("ClusterType", StringUtils.fromString(createClusterRequest.getClusterType()));
        }

        if (createClusterRequest.getNodeType() != null) {
            request.addParameter("NodeType", StringUtils.fromString(createClusterRequest.getNodeType()));
        }

        if (createClusterRequest.getMasterUsername() != null) {
            request.addParameter("MasterUsername", StringUtils.fromString(createClusterRequest.getMasterUsername()));
        }

        if (createClusterRequest.getMasterUserPassword() != null) {
            request.addParameter("MasterUserPassword", StringUtils.fromString(createClusterRequest.getMasterUserPassword()));
        }

        if (!createClusterRequest.getClusterSecurityGroups().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) createClusterRequest.getClusterSecurityGroups()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> clusterSecurityGroupsList = (com.amazonaws.internal.SdkInternalList<String>) createClusterRequest
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

        if (!createClusterRequest.getVpcSecurityGroupIds().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) createClusterRequest.getVpcSecurityGroupIds()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> vpcSecurityGroupIdsList = (com.amazonaws.internal.SdkInternalList<String>) createClusterRequest
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

        if (createClusterRequest.getClusterSubnetGroupName() != null) {
            request.addParameter("ClusterSubnetGroupName", StringUtils.fromString(createClusterRequest.getClusterSubnetGroupName()));
        }

        if (createClusterRequest.getAvailabilityZone() != null) {
            request.addParameter("AvailabilityZone", StringUtils.fromString(createClusterRequest.getAvailabilityZone()));
        }

        if (createClusterRequest.getPreferredMaintenanceWindow() != null) {
            request.addParameter("PreferredMaintenanceWindow", StringUtils.fromString(createClusterRequest.getPreferredMaintenanceWindow()));
        }

        if (createClusterRequest.getClusterParameterGroupName() != null) {
            request.addParameter("ClusterParameterGroupName", StringUtils.fromString(createClusterRequest.getClusterParameterGroupName()));
        }

        if (createClusterRequest.getAutomatedSnapshotRetentionPeriod() != null) {
            request.addParameter("AutomatedSnapshotRetentionPeriod", StringUtils.fromInteger(createClusterRequest.getAutomatedSnapshotRetentionPeriod()));
        }

        if (createClusterRequest.getManualSnapshotRetentionPeriod() != null) {
            request.addParameter("ManualSnapshotRetentionPeriod", StringUtils.fromInteger(createClusterRequest.getManualSnapshotRetentionPeriod()));
        }

        if (createClusterRequest.getPort() != null) {
            request.addParameter("Port", StringUtils.fromInteger(createClusterRequest.getPort()));
        }

        if (createClusterRequest.getClusterVersion() != null) {
            request.addParameter("ClusterVersion", StringUtils.fromString(createClusterRequest.getClusterVersion()));
        }

        if (createClusterRequest.getAllowVersionUpgrade() != null) {
            request.addParameter("AllowVersionUpgrade", StringUtils.fromBoolean(createClusterRequest.getAllowVersionUpgrade()));
        }

        if (createClusterRequest.getNumberOfNodes() != null) {
            request.addParameter("NumberOfNodes", StringUtils.fromInteger(createClusterRequest.getNumberOfNodes()));
        }

        if (createClusterRequest.getPubliclyAccessible() != null) {
            request.addParameter("PubliclyAccessible", StringUtils.fromBoolean(createClusterRequest.getPubliclyAccessible()));
        }

        if (createClusterRequest.getEncrypted() != null) {
            request.addParameter("Encrypted", StringUtils.fromBoolean(createClusterRequest.getEncrypted()));
        }

        if (createClusterRequest.getHsmClientCertificateIdentifier() != null) {
            request.addParameter("HsmClientCertificateIdentifier", StringUtils.fromString(createClusterRequest.getHsmClientCertificateIdentifier()));
        }

        if (createClusterRequest.getHsmConfigurationIdentifier() != null) {
            request.addParameter("HsmConfigurationIdentifier", StringUtils.fromString(createClusterRequest.getHsmConfigurationIdentifier()));
        }

        if (createClusterRequest.getElasticIp() != null) {
            request.addParameter("ElasticIp", StringUtils.fromString(createClusterRequest.getElasticIp()));
        }

        if (!createClusterRequest.getTags().isEmpty() || !((com.amazonaws.internal.SdkInternalList<Tag>) createClusterRequest.getTags()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createClusterRequest.getTags();
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

        if (createClusterRequest.getKmsKeyId() != null) {
            request.addParameter("KmsKeyId", StringUtils.fromString(createClusterRequest.getKmsKeyId()));
        }

        if (createClusterRequest.getEnhancedVpcRouting() != null) {
            request.addParameter("EnhancedVpcRouting", StringUtils.fromBoolean(createClusterRequest.getEnhancedVpcRouting()));
        }

        if (createClusterRequest.getAdditionalInfo() != null) {
            request.addParameter("AdditionalInfo", StringUtils.fromString(createClusterRequest.getAdditionalInfo()));
        }

        if (!createClusterRequest.getIamRoles().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) createClusterRequest.getIamRoles()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> iamRolesList = (com.amazonaws.internal.SdkInternalList<String>) createClusterRequest.getIamRoles();
            int iamRolesListIndex = 1;

            for (String iamRolesListValue : iamRolesList) {
                if (iamRolesListValue != null) {
                    request.addParameter("IamRoles.IamRoleArn." + iamRolesListIndex, StringUtils.fromString(iamRolesListValue));
                }
                iamRolesListIndex++;
            }
        }

        if (createClusterRequest.getMaintenanceTrackName() != null) {
            request.addParameter("MaintenanceTrackName", StringUtils.fromString(createClusterRequest.getMaintenanceTrackName()));
        }

        if (createClusterRequest.getSnapshotScheduleIdentifier() != null) {
            request.addParameter("SnapshotScheduleIdentifier", StringUtils.fromString(createClusterRequest.getSnapshotScheduleIdentifier()));
        }

        return request;
    }

}
