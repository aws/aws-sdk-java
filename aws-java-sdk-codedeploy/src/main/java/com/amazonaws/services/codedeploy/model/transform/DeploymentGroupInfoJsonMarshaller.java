/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

package com.amazonaws.services.codedeploy.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * DeploymentGroupInfoMarshaller
 */
public class DeploymentGroupInfoJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(DeploymentGroupInfo deploymentGroupInfo,
            JSONWriter jsonWriter) {
        if (deploymentGroupInfo == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (deploymentGroupInfo.getApplicationName() != null) {
                jsonWriter.key("applicationName").value(
                        deploymentGroupInfo.getApplicationName());
            }

            if (deploymentGroupInfo.getDeploymentGroupId() != null) {
                jsonWriter.key("deploymentGroupId").value(
                        deploymentGroupInfo.getDeploymentGroupId());
            }

            if (deploymentGroupInfo.getDeploymentGroupName() != null) {
                jsonWriter.key("deploymentGroupName").value(
                        deploymentGroupInfo.getDeploymentGroupName());
            }

            if (deploymentGroupInfo.getDeploymentConfigName() != null) {
                jsonWriter.key("deploymentConfigName").value(
                        deploymentGroupInfo.getDeploymentConfigName());
            }

            com.amazonaws.internal.SdkInternalList<EC2TagFilter> ec2TagFiltersList = (com.amazonaws.internal.SdkInternalList<EC2TagFilter>) deploymentGroupInfo
                    .getEc2TagFilters();
            if (!ec2TagFiltersList.isEmpty()
                    || !ec2TagFiltersList.isAutoConstruct()) {
                jsonWriter.key("ec2TagFilters");
                jsonWriter.array();
                for (EC2TagFilter ec2TagFiltersListValue : ec2TagFiltersList) {
                    if (ec2TagFiltersListValue != null) {

                        EC2TagFilterJsonMarshaller.getInstance().marshall(
                                ec2TagFiltersListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            com.amazonaws.internal.SdkInternalList<TagFilter> onPremisesInstanceTagFiltersList = (com.amazonaws.internal.SdkInternalList<TagFilter>) deploymentGroupInfo
                    .getOnPremisesInstanceTagFilters();
            if (!onPremisesInstanceTagFiltersList.isEmpty()
                    || !onPremisesInstanceTagFiltersList.isAutoConstruct()) {
                jsonWriter.key("onPremisesInstanceTagFilters");
                jsonWriter.array();
                for (TagFilter onPremisesInstanceTagFiltersListValue : onPremisesInstanceTagFiltersList) {
                    if (onPremisesInstanceTagFiltersListValue != null) {

                        TagFilterJsonMarshaller.getInstance().marshall(
                                onPremisesInstanceTagFiltersListValue,
                                jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            com.amazonaws.internal.SdkInternalList<AutoScalingGroup> autoScalingGroupsList = (com.amazonaws.internal.SdkInternalList<AutoScalingGroup>) deploymentGroupInfo
                    .getAutoScalingGroups();
            if (!autoScalingGroupsList.isEmpty()
                    || !autoScalingGroupsList.isAutoConstruct()) {
                jsonWriter.key("autoScalingGroups");
                jsonWriter.array();
                for (AutoScalingGroup autoScalingGroupsListValue : autoScalingGroupsList) {
                    if (autoScalingGroupsListValue != null) {

                        AutoScalingGroupJsonMarshaller.getInstance().marshall(
                                autoScalingGroupsListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            if (deploymentGroupInfo.getServiceRoleArn() != null) {
                jsonWriter.key("serviceRoleArn").value(
                        deploymentGroupInfo.getServiceRoleArn());
            }

            if (deploymentGroupInfo.getTargetRevision() != null) {
                jsonWriter.key("targetRevision");
                RevisionLocationJsonMarshaller.getInstance().marshall(
                        deploymentGroupInfo.getTargetRevision(), jsonWriter);
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static DeploymentGroupInfoJsonMarshaller instance;

    public static DeploymentGroupInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DeploymentGroupInfoJsonMarshaller();
        return instance;
    }

}
