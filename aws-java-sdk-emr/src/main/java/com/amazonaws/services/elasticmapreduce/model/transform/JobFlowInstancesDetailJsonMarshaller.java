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
 * JobFlowInstancesDetailMarshaller
 */
public class JobFlowInstancesDetailJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(JobFlowInstancesDetail jobFlowInstancesDetail, StructuredJsonGenerator jsonGenerator) {

        if (jobFlowInstancesDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (jobFlowInstancesDetail.getMasterInstanceType() != null) {
                jsonGenerator.writeFieldName("MasterInstanceType").writeValue(jobFlowInstancesDetail.getMasterInstanceType());
            }
            if (jobFlowInstancesDetail.getMasterPublicDnsName() != null) {
                jsonGenerator.writeFieldName("MasterPublicDnsName").writeValue(jobFlowInstancesDetail.getMasterPublicDnsName());
            }
            if (jobFlowInstancesDetail.getMasterInstanceId() != null) {
                jsonGenerator.writeFieldName("MasterInstanceId").writeValue(jobFlowInstancesDetail.getMasterInstanceId());
            }
            if (jobFlowInstancesDetail.getSlaveInstanceType() != null) {
                jsonGenerator.writeFieldName("SlaveInstanceType").writeValue(jobFlowInstancesDetail.getSlaveInstanceType());
            }
            if (jobFlowInstancesDetail.getInstanceCount() != null) {
                jsonGenerator.writeFieldName("InstanceCount").writeValue(jobFlowInstancesDetail.getInstanceCount());
            }

            com.amazonaws.internal.SdkInternalList<InstanceGroupDetail> instanceGroupsList = (com.amazonaws.internal.SdkInternalList<InstanceGroupDetail>) jobFlowInstancesDetail
                    .getInstanceGroups();
            if (!instanceGroupsList.isEmpty() || !instanceGroupsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("InstanceGroups");
                jsonGenerator.writeStartArray();
                for (InstanceGroupDetail instanceGroupsListValue : instanceGroupsList) {
                    if (instanceGroupsListValue != null) {

                        InstanceGroupDetailJsonMarshaller.getInstance().marshall(instanceGroupsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (jobFlowInstancesDetail.getNormalizedInstanceHours() != null) {
                jsonGenerator.writeFieldName("NormalizedInstanceHours").writeValue(jobFlowInstancesDetail.getNormalizedInstanceHours());
            }
            if (jobFlowInstancesDetail.getEc2KeyName() != null) {
                jsonGenerator.writeFieldName("Ec2KeyName").writeValue(jobFlowInstancesDetail.getEc2KeyName());
            }
            if (jobFlowInstancesDetail.getEc2SubnetId() != null) {
                jsonGenerator.writeFieldName("Ec2SubnetId").writeValue(jobFlowInstancesDetail.getEc2SubnetId());
            }
            if (jobFlowInstancesDetail.getPlacement() != null) {
                jsonGenerator.writeFieldName("Placement");
                PlacementTypeJsonMarshaller.getInstance().marshall(jobFlowInstancesDetail.getPlacement(), jsonGenerator);
            }
            if (jobFlowInstancesDetail.getKeepJobFlowAliveWhenNoSteps() != null) {
                jsonGenerator.writeFieldName("KeepJobFlowAliveWhenNoSteps").writeValue(jobFlowInstancesDetail.getKeepJobFlowAliveWhenNoSteps());
            }
            if (jobFlowInstancesDetail.getTerminationProtected() != null) {
                jsonGenerator.writeFieldName("TerminationProtected").writeValue(jobFlowInstancesDetail.getTerminationProtected());
            }
            if (jobFlowInstancesDetail.getHadoopVersion() != null) {
                jsonGenerator.writeFieldName("HadoopVersion").writeValue(jobFlowInstancesDetail.getHadoopVersion());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static JobFlowInstancesDetailJsonMarshaller instance;

    public static JobFlowInstancesDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JobFlowInstancesDetailJsonMarshaller();
        return instance;
    }

}
