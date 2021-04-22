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
 * ModifyReplicationGroupRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyReplicationGroupRequestMarshaller implements Marshaller<Request<ModifyReplicationGroupRequest>, ModifyReplicationGroupRequest> {

    public Request<ModifyReplicationGroupRequest> marshall(ModifyReplicationGroupRequest modifyReplicationGroupRequest) {

        if (modifyReplicationGroupRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyReplicationGroupRequest> request = new DefaultRequest<ModifyReplicationGroupRequest>(modifyReplicationGroupRequest, "AmazonElastiCache");
        request.addParameter("Action", "ModifyReplicationGroup");
        request.addParameter("Version", "2015-02-02");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyReplicationGroupRequest.getReplicationGroupId() != null) {
            request.addParameter("ReplicationGroupId", StringUtils.fromString(modifyReplicationGroupRequest.getReplicationGroupId()));
        }

        if (modifyReplicationGroupRequest.getReplicationGroupDescription() != null) {
            request.addParameter("ReplicationGroupDescription", StringUtils.fromString(modifyReplicationGroupRequest.getReplicationGroupDescription()));
        }

        if (modifyReplicationGroupRequest.getPrimaryClusterId() != null) {
            request.addParameter("PrimaryClusterId", StringUtils.fromString(modifyReplicationGroupRequest.getPrimaryClusterId()));
        }

        if (modifyReplicationGroupRequest.getSnapshottingClusterId() != null) {
            request.addParameter("SnapshottingClusterId", StringUtils.fromString(modifyReplicationGroupRequest.getSnapshottingClusterId()));
        }

        if (modifyReplicationGroupRequest.getAutomaticFailoverEnabled() != null) {
            request.addParameter("AutomaticFailoverEnabled", StringUtils.fromBoolean(modifyReplicationGroupRequest.getAutomaticFailoverEnabled()));
        }

        if (modifyReplicationGroupRequest.getMultiAZEnabled() != null) {
            request.addParameter("MultiAZEnabled", StringUtils.fromBoolean(modifyReplicationGroupRequest.getMultiAZEnabled()));
        }

        if (modifyReplicationGroupRequest.getNodeGroupId() != null) {
            request.addParameter("NodeGroupId", StringUtils.fromString(modifyReplicationGroupRequest.getNodeGroupId()));
        }

        if (!modifyReplicationGroupRequest.getCacheSecurityGroupNames().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) modifyReplicationGroupRequest.getCacheSecurityGroupNames()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> cacheSecurityGroupNamesList = (com.amazonaws.internal.SdkInternalList<String>) modifyReplicationGroupRequest
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

        if (!modifyReplicationGroupRequest.getSecurityGroupIds().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) modifyReplicationGroupRequest.getSecurityGroupIds()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> securityGroupIdsList = (com.amazonaws.internal.SdkInternalList<String>) modifyReplicationGroupRequest
                    .getSecurityGroupIds();
            int securityGroupIdsListIndex = 1;

            for (String securityGroupIdsListValue : securityGroupIdsList) {
                if (securityGroupIdsListValue != null) {
                    request.addParameter("SecurityGroupIds.SecurityGroupId." + securityGroupIdsListIndex, StringUtils.fromString(securityGroupIdsListValue));
                }
                securityGroupIdsListIndex++;
            }
        }

        if (modifyReplicationGroupRequest.getPreferredMaintenanceWindow() != null) {
            request.addParameter("PreferredMaintenanceWindow", StringUtils.fromString(modifyReplicationGroupRequest.getPreferredMaintenanceWindow()));
        }

        if (modifyReplicationGroupRequest.getNotificationTopicArn() != null) {
            request.addParameter("NotificationTopicArn", StringUtils.fromString(modifyReplicationGroupRequest.getNotificationTopicArn()));
        }

        if (modifyReplicationGroupRequest.getCacheParameterGroupName() != null) {
            request.addParameter("CacheParameterGroupName", StringUtils.fromString(modifyReplicationGroupRequest.getCacheParameterGroupName()));
        }

        if (modifyReplicationGroupRequest.getNotificationTopicStatus() != null) {
            request.addParameter("NotificationTopicStatus", StringUtils.fromString(modifyReplicationGroupRequest.getNotificationTopicStatus()));
        }

        if (modifyReplicationGroupRequest.getApplyImmediately() != null) {
            request.addParameter("ApplyImmediately", StringUtils.fromBoolean(modifyReplicationGroupRequest.getApplyImmediately()));
        }

        if (modifyReplicationGroupRequest.getEngineVersion() != null) {
            request.addParameter("EngineVersion", StringUtils.fromString(modifyReplicationGroupRequest.getEngineVersion()));
        }

        if (modifyReplicationGroupRequest.getAutoMinorVersionUpgrade() != null) {
            request.addParameter("AutoMinorVersionUpgrade", StringUtils.fromBoolean(modifyReplicationGroupRequest.getAutoMinorVersionUpgrade()));
        }

        if (modifyReplicationGroupRequest.getSnapshotRetentionLimit() != null) {
            request.addParameter("SnapshotRetentionLimit", StringUtils.fromInteger(modifyReplicationGroupRequest.getSnapshotRetentionLimit()));
        }

        if (modifyReplicationGroupRequest.getSnapshotWindow() != null) {
            request.addParameter("SnapshotWindow", StringUtils.fromString(modifyReplicationGroupRequest.getSnapshotWindow()));
        }

        if (modifyReplicationGroupRequest.getCacheNodeType() != null) {
            request.addParameter("CacheNodeType", StringUtils.fromString(modifyReplicationGroupRequest.getCacheNodeType()));
        }

        if (modifyReplicationGroupRequest.getAuthToken() != null) {
            request.addParameter("AuthToken", StringUtils.fromString(modifyReplicationGroupRequest.getAuthToken()));
        }

        if (modifyReplicationGroupRequest.getAuthTokenUpdateStrategy() != null) {
            request.addParameter("AuthTokenUpdateStrategy", StringUtils.fromString(modifyReplicationGroupRequest.getAuthTokenUpdateStrategy()));
        }

        if (!modifyReplicationGroupRequest.getUserGroupIdsToAdd().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) modifyReplicationGroupRequest.getUserGroupIdsToAdd()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> userGroupIdsToAddList = (com.amazonaws.internal.SdkInternalList<String>) modifyReplicationGroupRequest
                    .getUserGroupIdsToAdd();
            int userGroupIdsToAddListIndex = 1;

            for (String userGroupIdsToAddListValue : userGroupIdsToAddList) {
                if (userGroupIdsToAddListValue != null) {
                    request.addParameter("UserGroupIdsToAdd.member." + userGroupIdsToAddListIndex, StringUtils.fromString(userGroupIdsToAddListValue));
                }
                userGroupIdsToAddListIndex++;
            }
        }

        if (!modifyReplicationGroupRequest.getUserGroupIdsToRemove().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) modifyReplicationGroupRequest.getUserGroupIdsToRemove()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> userGroupIdsToRemoveList = (com.amazonaws.internal.SdkInternalList<String>) modifyReplicationGroupRequest
                    .getUserGroupIdsToRemove();
            int userGroupIdsToRemoveListIndex = 1;

            for (String userGroupIdsToRemoveListValue : userGroupIdsToRemoveList) {
                if (userGroupIdsToRemoveListValue != null) {
                    request.addParameter("UserGroupIdsToRemove.member." + userGroupIdsToRemoveListIndex, StringUtils.fromString(userGroupIdsToRemoveListValue));
                }
                userGroupIdsToRemoveListIndex++;
            }
        }

        if (modifyReplicationGroupRequest.getRemoveUserGroups() != null) {
            request.addParameter("RemoveUserGroups", StringUtils.fromBoolean(modifyReplicationGroupRequest.getRemoveUserGroups()));
        }

        if (!modifyReplicationGroupRequest.getLogDeliveryConfigurations().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<LogDeliveryConfigurationRequest>) modifyReplicationGroupRequest.getLogDeliveryConfigurations())
                        .isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<LogDeliveryConfigurationRequest> logDeliveryConfigurationsList = (com.amazonaws.internal.SdkInternalList<LogDeliveryConfigurationRequest>) modifyReplicationGroupRequest
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
