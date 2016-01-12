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

package com.amazonaws.services.elasticmapreduce.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * JobFlowInstancesConfigMarshaller
 */
public class JobFlowInstancesConfigJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(JobFlowInstancesConfig jobFlowInstancesConfig,
            JSONWriter jsonWriter) {
        if (jobFlowInstancesConfig == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (jobFlowInstancesConfig.getMasterInstanceType() != null) {
                jsonWriter.key("MasterInstanceType").value(
                        jobFlowInstancesConfig.getMasterInstanceType());
            }

            if (jobFlowInstancesConfig.getSlaveInstanceType() != null) {
                jsonWriter.key("SlaveInstanceType").value(
                        jobFlowInstancesConfig.getSlaveInstanceType());
            }

            if (jobFlowInstancesConfig.getInstanceCount() != null) {
                jsonWriter.key("InstanceCount").value(
                        jobFlowInstancesConfig.getInstanceCount());
            }

            com.amazonaws.internal.SdkInternalList<InstanceGroupConfig> instanceGroupsList = (com.amazonaws.internal.SdkInternalList<InstanceGroupConfig>) jobFlowInstancesConfig
                    .getInstanceGroups();
            if (!instanceGroupsList.isEmpty()
                    || !instanceGroupsList.isAutoConstruct()) {
                jsonWriter.key("InstanceGroups");
                jsonWriter.array();
                for (InstanceGroupConfig instanceGroupsListValue : instanceGroupsList) {
                    if (instanceGroupsListValue != null) {

                        InstanceGroupConfigJsonMarshaller.getInstance()
                                .marshall(instanceGroupsListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            if (jobFlowInstancesConfig.getEc2KeyName() != null) {
                jsonWriter.key("Ec2KeyName").value(
                        jobFlowInstancesConfig.getEc2KeyName());
            }

            if (jobFlowInstancesConfig.getPlacement() != null) {
                jsonWriter.key("Placement");
                PlacementTypeJsonMarshaller.getInstance().marshall(
                        jobFlowInstancesConfig.getPlacement(), jsonWriter);
            }

            if (jobFlowInstancesConfig.getKeepJobFlowAliveWhenNoSteps() != null) {
                jsonWriter.key("KeepJobFlowAliveWhenNoSteps")
                        .value(jobFlowInstancesConfig
                                .getKeepJobFlowAliveWhenNoSteps());
            }

            if (jobFlowInstancesConfig.getTerminationProtected() != null) {
                jsonWriter.key("TerminationProtected").value(
                        jobFlowInstancesConfig.getTerminationProtected());
            }

            if (jobFlowInstancesConfig.getHadoopVersion() != null) {
                jsonWriter.key("HadoopVersion").value(
                        jobFlowInstancesConfig.getHadoopVersion());
            }

            if (jobFlowInstancesConfig.getEc2SubnetId() != null) {
                jsonWriter.key("Ec2SubnetId").value(
                        jobFlowInstancesConfig.getEc2SubnetId());
            }

            if (jobFlowInstancesConfig.getEmrManagedMasterSecurityGroup() != null) {
                jsonWriter.key("EmrManagedMasterSecurityGroup").value(
                        jobFlowInstancesConfig
                                .getEmrManagedMasterSecurityGroup());
            }

            if (jobFlowInstancesConfig.getEmrManagedSlaveSecurityGroup() != null) {
                jsonWriter.key("EmrManagedSlaveSecurityGroup").value(
                        jobFlowInstancesConfig
                                .getEmrManagedSlaveSecurityGroup());
            }

            if (jobFlowInstancesConfig.getServiceAccessSecurityGroup() != null) {
                jsonWriter.key("ServiceAccessSecurityGroup").value(
                        jobFlowInstancesConfig.getServiceAccessSecurityGroup());
            }

            com.amazonaws.internal.SdkInternalList<String> additionalMasterSecurityGroupsList = (com.amazonaws.internal.SdkInternalList<String>) jobFlowInstancesConfig
                    .getAdditionalMasterSecurityGroups();
            if (!additionalMasterSecurityGroupsList.isEmpty()
                    || !additionalMasterSecurityGroupsList.isAutoConstruct()) {
                jsonWriter.key("AdditionalMasterSecurityGroups");
                jsonWriter.array();
                for (String additionalMasterSecurityGroupsListValue : additionalMasterSecurityGroupsList) {
                    if (additionalMasterSecurityGroupsListValue != null) {
                        jsonWriter
                                .value(additionalMasterSecurityGroupsListValue);
                    }
                }
                jsonWriter.endArray();
            }

            com.amazonaws.internal.SdkInternalList<String> additionalSlaveSecurityGroupsList = (com.amazonaws.internal.SdkInternalList<String>) jobFlowInstancesConfig
                    .getAdditionalSlaveSecurityGroups();
            if (!additionalSlaveSecurityGroupsList.isEmpty()
                    || !additionalSlaveSecurityGroupsList.isAutoConstruct()) {
                jsonWriter.key("AdditionalSlaveSecurityGroups");
                jsonWriter.array();
                for (String additionalSlaveSecurityGroupsListValue : additionalSlaveSecurityGroupsList) {
                    if (additionalSlaveSecurityGroupsListValue != null) {
                        jsonWriter
                                .value(additionalSlaveSecurityGroupsListValue);
                    }
                }
                jsonWriter.endArray();
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static JobFlowInstancesConfigJsonMarshaller instance;

    public static JobFlowInstancesConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JobFlowInstancesConfigJsonMarshaller();
        return instance;
    }

}
