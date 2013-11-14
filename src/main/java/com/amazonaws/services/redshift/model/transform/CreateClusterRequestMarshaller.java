/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.redshift.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Create Cluster Request Marshaller
 */
public class CreateClusterRequestMarshaller implements Marshaller<Request<CreateClusterRequest>, CreateClusterRequest> {

    public Request<CreateClusterRequest> marshall(CreateClusterRequest createClusterRequest) {

        if (createClusterRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<CreateClusterRequest> request = new DefaultRequest<CreateClusterRequest>(createClusterRequest, "AmazonRedshift");
        request.addParameter("Action", "CreateCluster");
        request.addParameter("Version", "2012-12-01");

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

        java.util.List<String> clusterSecurityGroupsList = createClusterRequest.getClusterSecurityGroups();
        int clusterSecurityGroupsListIndex = 1;

        for (String clusterSecurityGroupsListValue : clusterSecurityGroupsList) {
            if (clusterSecurityGroupsListValue != null) {
                request.addParameter("ClusterSecurityGroups.ClusterSecurityGroupName." + clusterSecurityGroupsListIndex, StringUtils.fromString(clusterSecurityGroupsListValue));
            }

            clusterSecurityGroupsListIndex++;
        }

        java.util.List<String> vpcSecurityGroupIdsList = createClusterRequest.getVpcSecurityGroupIds();
        int vpcSecurityGroupIdsListIndex = 1;

        for (String vpcSecurityGroupIdsListValue : vpcSecurityGroupIdsList) {
            if (vpcSecurityGroupIdsListValue != null) {
                request.addParameter("VpcSecurityGroupIds.VpcSecurityGroupId." + vpcSecurityGroupIdsListIndex, StringUtils.fromString(vpcSecurityGroupIdsListValue));
            }

            vpcSecurityGroupIdsListIndex++;
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
        if (createClusterRequest.getPort() != null) {
            request.addParameter("Port", StringUtils.fromInteger(createClusterRequest.getPort()));
        }
        if (createClusterRequest.getClusterVersion() != null) {
            request.addParameter("ClusterVersion", StringUtils.fromString(createClusterRequest.getClusterVersion()));
        }
        if (createClusterRequest.isAllowVersionUpgrade() != null) {
            request.addParameter("AllowVersionUpgrade", StringUtils.fromBoolean(createClusterRequest.isAllowVersionUpgrade()));
        }
        if (createClusterRequest.getNumberOfNodes() != null) {
            request.addParameter("NumberOfNodes", StringUtils.fromInteger(createClusterRequest.getNumberOfNodes()));
        }
        if (createClusterRequest.isPubliclyAccessible() != null) {
            request.addParameter("PubliclyAccessible", StringUtils.fromBoolean(createClusterRequest.isPubliclyAccessible()));
        }
        if (createClusterRequest.isEncrypted() != null) {
            request.addParameter("Encrypted", StringUtils.fromBoolean(createClusterRequest.isEncrypted()));
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


        return request;
    }
}
