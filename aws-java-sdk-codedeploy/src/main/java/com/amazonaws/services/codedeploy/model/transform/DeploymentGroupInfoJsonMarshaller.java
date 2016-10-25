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
package com.amazonaws.services.codedeploy.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * DeploymentGroupInfoMarshaller
 */
public class DeploymentGroupInfoJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(DeploymentGroupInfo deploymentGroupInfo, StructuredJsonGenerator jsonGenerator) {

        if (deploymentGroupInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (deploymentGroupInfo.getApplicationName() != null) {
                jsonGenerator.writeFieldName("applicationName").writeValue(deploymentGroupInfo.getApplicationName());
            }
            if (deploymentGroupInfo.getDeploymentGroupId() != null) {
                jsonGenerator.writeFieldName("deploymentGroupId").writeValue(deploymentGroupInfo.getDeploymentGroupId());
            }
            if (deploymentGroupInfo.getDeploymentGroupName() != null) {
                jsonGenerator.writeFieldName("deploymentGroupName").writeValue(deploymentGroupInfo.getDeploymentGroupName());
            }
            if (deploymentGroupInfo.getDeploymentConfigName() != null) {
                jsonGenerator.writeFieldName("deploymentConfigName").writeValue(deploymentGroupInfo.getDeploymentConfigName());
            }

            com.amazonaws.internal.SdkInternalList<EC2TagFilter> ec2TagFiltersList = (com.amazonaws.internal.SdkInternalList<EC2TagFilter>) deploymentGroupInfo
                    .getEc2TagFilters();
            if (!ec2TagFiltersList.isEmpty() || !ec2TagFiltersList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("ec2TagFilters");
                jsonGenerator.writeStartArray();
                for (EC2TagFilter ec2TagFiltersListValue : ec2TagFiltersList) {
                    if (ec2TagFiltersListValue != null) {

                        EC2TagFilterJsonMarshaller.getInstance().marshall(ec2TagFiltersListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            com.amazonaws.internal.SdkInternalList<TagFilter> onPremisesInstanceTagFiltersList = (com.amazonaws.internal.SdkInternalList<TagFilter>) deploymentGroupInfo
                    .getOnPremisesInstanceTagFilters();
            if (!onPremisesInstanceTagFiltersList.isEmpty() || !onPremisesInstanceTagFiltersList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("onPremisesInstanceTagFilters");
                jsonGenerator.writeStartArray();
                for (TagFilter onPremisesInstanceTagFiltersListValue : onPremisesInstanceTagFiltersList) {
                    if (onPremisesInstanceTagFiltersListValue != null) {

                        TagFilterJsonMarshaller.getInstance().marshall(onPremisesInstanceTagFiltersListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            com.amazonaws.internal.SdkInternalList<AutoScalingGroup> autoScalingGroupsList = (com.amazonaws.internal.SdkInternalList<AutoScalingGroup>) deploymentGroupInfo
                    .getAutoScalingGroups();
            if (!autoScalingGroupsList.isEmpty() || !autoScalingGroupsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("autoScalingGroups");
                jsonGenerator.writeStartArray();
                for (AutoScalingGroup autoScalingGroupsListValue : autoScalingGroupsList) {
                    if (autoScalingGroupsListValue != null) {

                        AutoScalingGroupJsonMarshaller.getInstance().marshall(autoScalingGroupsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (deploymentGroupInfo.getServiceRoleArn() != null) {
                jsonGenerator.writeFieldName("serviceRoleArn").writeValue(deploymentGroupInfo.getServiceRoleArn());
            }
            if (deploymentGroupInfo.getTargetRevision() != null) {
                jsonGenerator.writeFieldName("targetRevision");
                RevisionLocationJsonMarshaller.getInstance().marshall(deploymentGroupInfo.getTargetRevision(), jsonGenerator);
            }

            com.amazonaws.internal.SdkInternalList<TriggerConfig> triggerConfigurationsList = (com.amazonaws.internal.SdkInternalList<TriggerConfig>) deploymentGroupInfo
                    .getTriggerConfigurations();
            if (!triggerConfigurationsList.isEmpty() || !triggerConfigurationsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("triggerConfigurations");
                jsonGenerator.writeStartArray();
                for (TriggerConfig triggerConfigurationsListValue : triggerConfigurationsList) {
                    if (triggerConfigurationsListValue != null) {

                        TriggerConfigJsonMarshaller.getInstance().marshall(triggerConfigurationsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (deploymentGroupInfo.getAlarmConfiguration() != null) {
                jsonGenerator.writeFieldName("alarmConfiguration");
                AlarmConfigurationJsonMarshaller.getInstance().marshall(deploymentGroupInfo.getAlarmConfiguration(), jsonGenerator);
            }
            if (deploymentGroupInfo.getAutoRollbackConfiguration() != null) {
                jsonGenerator.writeFieldName("autoRollbackConfiguration");
                AutoRollbackConfigurationJsonMarshaller.getInstance().marshall(deploymentGroupInfo.getAutoRollbackConfiguration(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static DeploymentGroupInfoJsonMarshaller instance;

    public static DeploymentGroupInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DeploymentGroupInfoJsonMarshaller();
        return instance;
    }

}
