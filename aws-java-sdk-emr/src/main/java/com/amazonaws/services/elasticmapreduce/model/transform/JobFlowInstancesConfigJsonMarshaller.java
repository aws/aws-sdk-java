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
package com.amazonaws.services.elasticmapreduce.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * JobFlowInstancesConfigMarshaller
 */
public class JobFlowInstancesConfigJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(JobFlowInstancesConfig jobFlowInstancesConfig, StructuredJsonGenerator jsonGenerator) {

        if (jobFlowInstancesConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (jobFlowInstancesConfig.getMasterInstanceType() != null) {
                jsonGenerator.writeFieldName("MasterInstanceType").writeValue(jobFlowInstancesConfig.getMasterInstanceType());
            }
            if (jobFlowInstancesConfig.getSlaveInstanceType() != null) {
                jsonGenerator.writeFieldName("SlaveInstanceType").writeValue(jobFlowInstancesConfig.getSlaveInstanceType());
            }
            if (jobFlowInstancesConfig.getInstanceCount() != null) {
                jsonGenerator.writeFieldName("InstanceCount").writeValue(jobFlowInstancesConfig.getInstanceCount());
            }

            com.amazonaws.internal.SdkInternalList<InstanceGroupConfig> instanceGroupsList = (com.amazonaws.internal.SdkInternalList<InstanceGroupConfig>) jobFlowInstancesConfig
                    .getInstanceGroups();
            if (!instanceGroupsList.isEmpty() || !instanceGroupsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("InstanceGroups");
                jsonGenerator.writeStartArray();
                for (InstanceGroupConfig instanceGroupsListValue : instanceGroupsList) {
                    if (instanceGroupsListValue != null) {

                        InstanceGroupConfigJsonMarshaller.getInstance().marshall(instanceGroupsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (jobFlowInstancesConfig.getEc2KeyName() != null) {
                jsonGenerator.writeFieldName("Ec2KeyName").writeValue(jobFlowInstancesConfig.getEc2KeyName());
            }
            if (jobFlowInstancesConfig.getPlacement() != null) {
                jsonGenerator.writeFieldName("Placement");
                PlacementTypeJsonMarshaller.getInstance().marshall(jobFlowInstancesConfig.getPlacement(), jsonGenerator);
            }
            if (jobFlowInstancesConfig.getKeepJobFlowAliveWhenNoSteps() != null) {
                jsonGenerator.writeFieldName("KeepJobFlowAliveWhenNoSteps").writeValue(jobFlowInstancesConfig.getKeepJobFlowAliveWhenNoSteps());
            }
            if (jobFlowInstancesConfig.getTerminationProtected() != null) {
                jsonGenerator.writeFieldName("TerminationProtected").writeValue(jobFlowInstancesConfig.getTerminationProtected());
            }
            if (jobFlowInstancesConfig.getHadoopVersion() != null) {
                jsonGenerator.writeFieldName("HadoopVersion").writeValue(jobFlowInstancesConfig.getHadoopVersion());
            }
            if (jobFlowInstancesConfig.getEc2SubnetId() != null) {
                jsonGenerator.writeFieldName("Ec2SubnetId").writeValue(jobFlowInstancesConfig.getEc2SubnetId());
            }
            if (jobFlowInstancesConfig.getEmrManagedMasterSecurityGroup() != null) {
                jsonGenerator.writeFieldName("EmrManagedMasterSecurityGroup").writeValue(jobFlowInstancesConfig.getEmrManagedMasterSecurityGroup());
            }
            if (jobFlowInstancesConfig.getEmrManagedSlaveSecurityGroup() != null) {
                jsonGenerator.writeFieldName("EmrManagedSlaveSecurityGroup").writeValue(jobFlowInstancesConfig.getEmrManagedSlaveSecurityGroup());
            }
            if (jobFlowInstancesConfig.getServiceAccessSecurityGroup() != null) {
                jsonGenerator.writeFieldName("ServiceAccessSecurityGroup").writeValue(jobFlowInstancesConfig.getServiceAccessSecurityGroup());
            }

            com.amazonaws.internal.SdkInternalList<String> additionalMasterSecurityGroupsList = (com.amazonaws.internal.SdkInternalList<String>) jobFlowInstancesConfig
                    .getAdditionalMasterSecurityGroups();
            if (!additionalMasterSecurityGroupsList.isEmpty() || !additionalMasterSecurityGroupsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("AdditionalMasterSecurityGroups");
                jsonGenerator.writeStartArray();
                for (String additionalMasterSecurityGroupsListValue : additionalMasterSecurityGroupsList) {
                    if (additionalMasterSecurityGroupsListValue != null) {
                        jsonGenerator.writeValue(additionalMasterSecurityGroupsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            com.amazonaws.internal.SdkInternalList<String> additionalSlaveSecurityGroupsList = (com.amazonaws.internal.SdkInternalList<String>) jobFlowInstancesConfig
                    .getAdditionalSlaveSecurityGroups();
            if (!additionalSlaveSecurityGroupsList.isEmpty() || !additionalSlaveSecurityGroupsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("AdditionalSlaveSecurityGroups");
                jsonGenerator.writeStartArray();
                for (String additionalSlaveSecurityGroupsListValue : additionalSlaveSecurityGroupsList) {
                    if (additionalSlaveSecurityGroupsListValue != null) {
                        jsonGenerator.writeValue(additionalSlaveSecurityGroupsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static JobFlowInstancesConfigJsonMarshaller instance;

    public static JobFlowInstancesConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JobFlowInstancesConfigJsonMarshaller();
        return instance;
    }

}
