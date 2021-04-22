/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticache.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * CreateReplicationGroupRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateReplicationGroupRequestMarshaller implements Marshaller<Request<CreateReplicationGroupRequest>, CreateReplicationGroupRequest> {

    public Request<CreateReplicationGroupRequest> marshall(CreateReplicationGroupRequest createReplicationGroupRequest) {

        if (createReplicationGroupRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateReplicationGroupRequest> request = new DefaultRequest<CreateReplicationGroupRequest>(createReplicationGroupRequest, "AmazonElastiCache");
        request.addParameter("Action", "CreateReplicationGroup");
        request.addParameter("Version", "2015-02-02");
        request.setHttpMethod(HttpMethodName.POST);

        if (createReplicationGroupRequest.getReplicationGroupId() != null) {
            request.addParameter("ReplicationGroupId", StringUtils.fromString(createReplicationGroupRequest.getReplicationGroupId()));
        }

        if (createReplicationGroupRequest.getReplicationGroupDescription() != null) {
            request.addParameter("ReplicationGroupDescription", StringUtils.fromString(createReplicationGroupRequest.getReplicationGroupDescription()));
        }

        if (createReplicationGroupRequest.getGlobalReplicationGroupId() != null) {
            request.addParameter("GlobalReplicationGroupId", StringUtils.fromString(createReplicationGroupRequest.getGlobalReplicationGroupId()));
        }

        if (createReplicationGroupRequest.getPrimaryClusterId() != null) {
            request.addParameter("PrimaryClusterId", StringUtils.fromString(createReplicationGroupRequest.getPrimaryClusterId()));
        }

        if (createReplicationGroupRequest.getAutomaticFailoverEnabled() != null) {
            request.addParameter("AutomaticFailoverEnabled", StringUtils.fromBoolean(createReplicationGroupRequest.getAutomaticFailoverEnabled()));
        }

        if (createReplicationGroupRequest.getMultiAZEnabled() != null) {
            request.addParameter("MultiAZEnabled", StringUtils.fromBoolean(createReplicationGroupRequest.getMultiAZEnabled()));
        }

        if (createReplicationGroupRequest.getNumCacheClusters() != null) {
            request.addParameter("NumCacheClusters", StringUtils.fromInteger(createReplicationGroupRequest.getNumCacheClusters()));
        }

        if (!createReplicationGroupRequest.getPreferredCacheClusterAZs().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) createReplicationGroupRequest.getPreferredCacheClusterAZs()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> preferredCacheClusterAZsList = (com.amazonaws.internal.SdkInternalList<String>) createReplicationGroupRequest
                    .getPreferredCacheClusterAZs();
            int preferredCacheClusterAZsListIndex = 1;

            for (String preferredCacheClusterAZsListValue : preferredCacheClusterAZsList) {
                if (preferredCacheClusterAZsListValue != null) {
                    request.addParameter("PreferredCacheClusterAZs.AvailabilityZone." + preferredCacheClusterAZsListIndex,
                            StringUtils.fromString(preferredCacheClusterAZsListValue));
                }
                preferredCacheClusterAZsListIndex++;
            }
        }

        if (createReplicationGroupRequest.getNumNodeGroups() != null) {
            request.addParameter("NumNodeGroups", StringUtils.fromInteger(createReplicationGroupRequest.getNumNodeGroups()));
        }

        if (createReplicationGroupRequest.getReplicasPerNodeGroup() != null) {
            request.addParameter("ReplicasPerNodeGroup", StringUtils.fromInteger(createReplicationGroupRequest.getReplicasPerNodeGroup()));
        }

        if (!createReplicationGroupRequest.getNodeGroupConfiguration().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<NodeGroupConfiguration>) createReplicationGroupRequest.getNodeGroupConfiguration())
                        .isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<NodeGroupConfiguration> nodeGroupConfigurationList = (com.amazonaws.internal.SdkInternalList<NodeGroupConfiguration>) createReplicationGroupRequest
                    .getNodeGroupConfiguration();
            int nodeGroupConfigurationListIndex = 1;

            for (NodeGroupConfiguration nodeGroupConfigurationListValue : nodeGroupConfigurationList) {
                if (nodeGroupConfigurationListValue != null) {

                    if (nodeGroupConfigurationListValue.getNodeGroupId() != null) {
                        request.addParameter("NodeGroupConfiguration.NodeGroupConfiguration." + nodeGroupConfigurationListIndex + ".NodeGroupId",
                                StringUtils.fromString(nodeGroupConfigurationListValue.getNodeGroupId()));
                    }

                    if (nodeGroupConfigurationListValue.getSlots() != null) {
                        request.addParameter("NodeGroupConfiguration.NodeGroupConfiguration." + nodeGroupConfigurationListIndex + ".Slots",
                                StringUtils.fromString(nodeGroupConfigurationListValue.getSlots()));
                    }

                    if (nodeGroupConfigurationListValue.getReplicaCount() != null) {
                        request.addParameter("NodeGroupConfiguration.NodeGroupConfiguration." + nodeGroupConfigurationListIndex + ".ReplicaCount",
                                StringUtils.fromInteger(nodeGroupConfigurationListValue.getReplicaCount()));
                    }

                    if (nodeGroupConfigurationListValue.getPrimaryAvailabilityZone() != null) {
                        request.addParameter("NodeGroupConfiguration.NodeGroupConfiguration." + nodeGroupConfigurationListIndex + ".PrimaryAvailabilityZone",
                                StringUtils.fromString(nodeGroupConfigurationListValue.getPrimaryAvailabilityZone()));
                    }

                    if (!nodeGroupConfigurationListValue.getReplicaAvailabilityZones().isEmpty()
                            || !((com.amazonaws.internal.SdkInternalList<String>) nodeGroupConfigurationListValue.getReplicaAvailabilityZones())
                                    .isAutoConstruct()) {
                        com.amazonaws.internal.SdkInternalList<String> replicaAvailabilityZonesList = (com.amazonaws.internal.SdkInternalList<String>) nodeGroupConfigurationListValue
                                .getReplicaAvailabilityZones();
                        int replicaAvailabilityZonesListIndex = 1;

                        for (String replicaAvailabilityZonesListValue : replicaAvailabilityZonesList) {
                            if (replicaAvailabilityZonesListValue != null) {
                                request.addParameter("NodeGroupConfiguration.NodeGroupConfiguration." + nodeGroupConfigurationListIndex
                                        + ".ReplicaAvailabilityZones.AvailabilityZone." + replicaAvailabilityZonesListIndex,
                                        StringUtils.fromString(replicaAvailabilityZonesListValue));
                            }
                            replicaAvailabilityZonesListIndex++;
                        }
                    }

                    if (nodeGroupConfigurationListValue.getPrimaryOutpostArn() != null) {
                        request.addParameter("NodeGroupConfiguration.NodeGroupConfiguration." + nodeGroupConfigurationListIndex + ".PrimaryOutpostArn",
                                StringUtils.fromString(nodeGroupConfigurationListValue.getPrimaryOutpostArn()));
                    }

                    if (!nodeGroupConfigurationListValue.getReplicaOutpostArns().isEmpty()
                            || !((com.amazonaws.internal.SdkInternalList<String>) nodeGroupConfigurationListValue.getReplicaOutpostArns()).isAutoConstruct()) {
                        com.amazonaws.internal.SdkInternalList<String> replicaOutpostArnsList = (com.amazonaws.internal.SdkInternalList<String>) nodeGroupConfigurationListValue
                                .getReplicaOutpostArns();
                        int replicaOutpostArnsListIndex = 1;

                        for (String replicaOutpostArnsListValue : replicaOutpostArnsList) {
                            if (replicaOutpostArnsListValue != null) {
                                request.addParameter("NodeGroupConfiguration.NodeGroupConfiguration." + nodeGroupConfigurationListIndex
                                        + ".ReplicaOutpostArns.OutpostArn." + replicaOutpostArnsListIndex, StringUtils.fromString(replicaOutpostArnsListValue));
                            }
                            replicaOutpostArnsListIndex++;
                        }
                    }
                }
                nodeGroupConfigurationListIndex++;
            }
        }

        if (createReplicationGroupRequest.getCacheNodeType() != null) {
            request.addParameter("CacheNodeType", StringUtils.fromString(createReplicationGroupRequest.getCacheNodeType()));
        }

        if (createReplicationGroupRequest.getEngine() != null) {
            request.addParameter("Engine", StringUtils.fromString(createReplicationGroupRequest.getEngine()));
        }

        if (createReplicationGroupRequest.getEngineVersion() != null) {
            request.addParameter("EngineVersion", StringUtils.fromString(createReplicationGroupRequest.getEngineVersion()));
        }

        if (createReplicationGroupRequest.getCacheParameterGroupName() != null) {
            request.addParameter("CacheParameterGroupName", StringUtils.fromString(createReplicationGroupRequest.getCacheParameterGroupName()));
        }

        if (createReplicationGroupRequest.getCacheSubnetGroupName() != null) {
            request.addParameter("CacheSubnetGroupName", StringUtils.fromString(createReplicationGroupRequest.getCacheSubnetGroupName()));
        }

        if (!createReplicationGroupRequest.getCacheSecurityGroupNames().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) createReplicationGroupRequest.getCacheSecurityGroupNames()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> cacheSecurityGroupNamesList = (com.amazonaws.internal.SdkInternalList<String>) createReplicationGroupRequest
                    .getCacheSecurityGroupNames();
            int cacheSecurityGroupNamesListIndex = 1;

            for (String cacheSecurityGroupNamesListValue : cacheSecurityGroupNamesList) {
                if (cacheSecurityGroupNamesListValue != null) {
                    request.addParameter("CacheSecurityGroupNames.CacheSecurityGroupName." + cacheSecurityGroupNamesListIndex,
                            StringUtils.fromString(cacheSecurityGroupNamesListValue));
                }
                cacheSecurityGroupNamesListIndex++;
            }
        }

        if (!createReplicationGroupRequest.getSecurityGroupIds().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) createReplicationGroupRequest.getSecurityGroupIds()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> securityGroupIdsList = (com.amazonaws.internal.SdkInternalList<String>) createReplicationGroupRequest
                    .getSecurityGroupIds();
            int securityGroupIdsListIndex = 1;

            for (String securityGroupIdsListValue : securityGroupIdsList) {
                if (securityGroupIdsListValue != null) {
                    request.addParameter("SecurityGroupIds.SecurityGroupId." + securityGroupIdsListIndex, StringUtils.fromString(securityGroupIdsListValue));
                }
                securityGroupIdsListIndex++;
            }
        }

        if (!createReplicationGroupRequest.getTags().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<Tag>) createReplicationGroupRequest.getTags()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createReplicationGroupRequest.getTags();
            int tagsListIndex = 1;

            for (Tag tagsListValue : tagsList) {
                if (tagsListValue != null) {

                    if (tagsListValue.getKey() != null) {
                        request.addParameter("Tags.Tag." + tagsListIndex + ".Key", StringUtils.fromString(tagsListValue.getKey()));
                    }

                    if (tagsListValue.getValue() != null) {
                        request.addParameter("Tags.Tag." + tagsListIndex + ".Value", StringUtils.fromString(tagsListValue.getValue()));
                    }
                }
                tagsListIndex++;
            }
        }

        if (!createReplicationGroupRequest.getSnapshotArns().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) createReplicationGroupRequest.getSnapshotArns()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> snapshotArnsList = (com.amazonaws.internal.SdkInternalList<String>) createReplicationGroupRequest
                    .getSnapshotArns();
            int snapshotArnsListIndex = 1;

            for (String snapshotArnsListValue : snapshotArnsList) {
                if (snapshotArnsListValue != null) {
                    request.addParameter("SnapshotArns.SnapshotArn." + snapshotArnsListIndex, StringUtils.fromString(snapshotArnsListValue));
                }
                snapshotArnsListIndex++;
            }
        }

        if (createReplicationGroupRequest.getSnapshotName() != null) {
            request.addParameter("SnapshotName", StringUtils.fromString(createReplicationGroupRequest.getSnapshotName()));
        }

        if (createReplicationGroupRequest.getPreferredMaintenanceWindow() != null) {
            request.addParameter("PreferredMaintenanceWindow", StringUtils.fromString(createReplicationGroupRequest.getPreferredMaintenanceWindow()));
        }

        if (createReplicationGroupRequest.getPort() != null) {
            request.addParameter("Port", StringUtils.fromInteger(createReplicationGroupRequest.getPort()));
        }

        if (createReplicationGroupRequest.getNotificationTopicArn() != null) {
            request.addParameter("NotificationTopicArn", StringUtils.fromString(createReplicationGroupRequest.getNotificationTopicArn()));
        }

        if (createReplicationGroupRequest.getAutoMinorVersionUpgrade() != null) {
            request.addParameter("AutoMinorVersionUpgrade", StringUtils.fromBoolean(createReplicationGroupRequest.getAutoMinorVersionUpgrade()));
        }

        if (createReplicationGroupRequest.getSnapshotRetentionLimit() != null) {
            request.addParameter("SnapshotRetentionLimit", StringUtils.fromInteger(createReplicationGroupRequest.getSnapshotRetentionLimit()));
        }

        if (createReplicationGroupRequest.getSnapshotWindow() != null) {
            request.addParameter("SnapshotWindow", StringUtils.fromString(createReplicationGroupRequest.getSnapshotWindow()));
        }

        if (createReplicationGroupRequest.getAuthToken() != null) {
            request.addParameter("AuthToken", StringUtils.fromString(createReplicationGroupRequest.getAuthToken()));
        }

        if (createReplicationGroupRequest.getTransitEncryptionEnabled() != null) {
            request.addParameter("TransitEncryptionEnabled", StringUtils.fromBoolean(createReplicationGroupRequest.getTransitEncryptionEnabled()));
        }

        if (createReplicationGroupRequest.getAtRestEncryptionEnabled() != null) {
            request.addParameter("AtRestEncryptionEnabled", StringUtils.fromBoolean(createReplicationGroupRequest.getAtRestEncryptionEnabled()));
        }

        if (createReplicationGroupRequest.getKmsKeyId() != null) {
            request.addParameter("KmsKeyId", StringUtils.fromString(createReplicationGroupRequest.getKmsKeyId()));
        }

        if (!createReplicationGroupRequest.getUserGroupIds().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) createReplicationGroupRequest.getUserGroupIds()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> userGroupIdsList = (com.amazonaws.internal.SdkInternalList<String>) createReplicationGroupRequest
                    .getUserGroupIds();
            int userGroupIdsListIndex = 1;

            for (String userGroupIdsListValue : userGroupIdsList) {
                if (userGroupIdsListValue != null) {
                    request.addParameter("UserGroupIds.member." + userGroupIdsListIndex, StringUtils.fromString(userGroupIdsListValue));
                }
                userGroupIdsListIndex++;
            }
        }

        if (!createReplicationGroupRequest.getLogDeliveryConfigurations().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<LogDeliveryConfigurationRequest>) createReplicationGroupRequest.getLogDeliveryConfigurations())
                        .isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<LogDeliveryConfigurationRequest> logDeliveryConfigurationsList = (com.amazonaws.internal.SdkInternalList<LogDeliveryConfigurationRequest>) createReplicationGroupRequest
                    .getLogDeliveryConfigurations();
            int logDeliveryConfigurationsListIndex = 1;

            for (LogDeliveryConfigurationRequest logDeliveryConfigurationsListValue : logDeliveryConfigurationsList) {
                if (logDeliveryConfigurationsListValue != null) {

                    if (logDeliveryConfigurationsListValue.getLogType() != null) {
                        request.addParameter("LogDeliveryConfigurations.LogDeliveryConfigurationRequest." + logDeliveryConfigurationsListIndex + ".LogType",
                                StringUtils.fromString(logDeliveryConfigurationsListValue.getLogType()));
                    }

                    if (logDeliveryConfigurationsListValue.getDestinationType() != null) {
                        request.addParameter("LogDeliveryConfigurations.LogDeliveryConfigurationRequest." + logDeliveryConfigurationsListIndex
                                + ".DestinationType", StringUtils.fromString(logDeliveryConfigurationsListValue.getDestinationType()));
                    }

                    {
                        DestinationDetails destinationDetails = logDeliveryConfigurationsListValue.getDestinationDetails();
                        if (destinationDetails != null) {

                            {
                                CloudWatchLogsDestinationDetails cloudWatchLogsDetails = destinationDetails.getCloudWatchLogsDetails();
                                if (cloudWatchLogsDetails != null) {

                                    if (cloudWatchLogsDetails.getLogGroup() != null) {
                                        request.addParameter("LogDeliveryConfigurations.LogDeliveryConfigurationRequest." + logDeliveryConfigurationsListIndex
                                                + ".DestinationDetails.CloudWatchLogsDetails.LogGroup",
                                                StringUtils.fromString(cloudWatchLogsDetails.getLogGroup()));
                                    }
                                }
                            }

                            {
                                KinesisFirehoseDestinationDetails kinesisFirehoseDetails = destinationDetails.getKinesisFirehoseDetails();
                                if (kinesisFirehoseDetails != null) {

                                    if (kinesisFirehoseDetails.getDeliveryStream() != null) {
                                        request.addParameter("LogDeliveryConfigurations.LogDeliveryConfigurationRequest." + logDeliveryConfigurationsListIndex
                                                + ".DestinationDetails.KinesisFirehoseDetails.DeliveryStream",
                                                StringUtils.fromString(kinesisFirehoseDetails.getDeliveryStream()));
                                    }
                                }
                            }
                        }
                    }

                    if (logDeliveryConfigurationsListValue.getLogFormat() != null) {
                        request.addParameter("LogDeliveryConfigurations.LogDeliveryConfigurationRequest." + logDeliveryConfigurationsListIndex + ".LogFormat",
                                StringUtils.fromString(logDeliveryConfigurationsListValue.getLogFormat()));
                    }

                    if (logDeliveryConfigurationsListValue.getEnabled() != null) {
                        request.addParameter("LogDeliveryConfigurations.LogDeliveryConfigurationRequest." + logDeliveryConfigurationsListIndex + ".Enabled",
                                StringUtils.fromBoolean(logDeliveryConfigurationsListValue.getEnabled()));
                    }
                }
                logDeliveryConfigurationsListIndex++;
            }
        }

        return request;
    }

}
