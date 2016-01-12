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
 * JobFlowInstancesDetailMarshaller
 */
public class JobFlowInstancesDetailJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(JobFlowInstancesDetail jobFlowInstancesDetail,
            JSONWriter jsonWriter) {
        if (jobFlowInstancesDetail == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (jobFlowInstancesDetail.getMasterInstanceType() != null) {
                jsonWriter.key("MasterInstanceType").value(
                        jobFlowInstancesDetail.getMasterInstanceType());
            }

            if (jobFlowInstancesDetail.getMasterPublicDnsName() != null) {
                jsonWriter.key("MasterPublicDnsName").value(
                        jobFlowInstancesDetail.getMasterPublicDnsName());
            }

            if (jobFlowInstancesDetail.getMasterInstanceId() != null) {
                jsonWriter.key("MasterInstanceId").value(
                        jobFlowInstancesDetail.getMasterInstanceId());
            }

            if (jobFlowInstancesDetail.getSlaveInstanceType() != null) {
                jsonWriter.key("SlaveInstanceType").value(
                        jobFlowInstancesDetail.getSlaveInstanceType());
            }

            if (jobFlowInstancesDetail.getInstanceCount() != null) {
                jsonWriter.key("InstanceCount").value(
                        jobFlowInstancesDetail.getInstanceCount());
            }

            com.amazonaws.internal.SdkInternalList<InstanceGroupDetail> instanceGroupsList = (com.amazonaws.internal.SdkInternalList<InstanceGroupDetail>) jobFlowInstancesDetail
                    .getInstanceGroups();
            if (!instanceGroupsList.isEmpty()
                    || !instanceGroupsList.isAutoConstruct()) {
                jsonWriter.key("InstanceGroups");
                jsonWriter.array();
                for (InstanceGroupDetail instanceGroupsListValue : instanceGroupsList) {
                    if (instanceGroupsListValue != null) {

                        InstanceGroupDetailJsonMarshaller.getInstance()
                                .marshall(instanceGroupsListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            if (jobFlowInstancesDetail.getNormalizedInstanceHours() != null) {
                jsonWriter.key("NormalizedInstanceHours").value(
                        jobFlowInstancesDetail.getNormalizedInstanceHours());
            }

            if (jobFlowInstancesDetail.getEc2KeyName() != null) {
                jsonWriter.key("Ec2KeyName").value(
                        jobFlowInstancesDetail.getEc2KeyName());
            }

            if (jobFlowInstancesDetail.getEc2SubnetId() != null) {
                jsonWriter.key("Ec2SubnetId").value(
                        jobFlowInstancesDetail.getEc2SubnetId());
            }

            if (jobFlowInstancesDetail.getPlacement() != null) {
                jsonWriter.key("Placement");
                PlacementTypeJsonMarshaller.getInstance().marshall(
                        jobFlowInstancesDetail.getPlacement(), jsonWriter);
            }

            if (jobFlowInstancesDetail.getKeepJobFlowAliveWhenNoSteps() != null) {
                jsonWriter.key("KeepJobFlowAliveWhenNoSteps")
                        .value(jobFlowInstancesDetail
                                .getKeepJobFlowAliveWhenNoSteps());
            }

            if (jobFlowInstancesDetail.getTerminationProtected() != null) {
                jsonWriter.key("TerminationProtected").value(
                        jobFlowInstancesDetail.getTerminationProtected());
            }

            if (jobFlowInstancesDetail.getHadoopVersion() != null) {
                jsonWriter.key("HadoopVersion").value(
                        jobFlowInstancesDetail.getHadoopVersion());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static JobFlowInstancesDetailJsonMarshaller instance;

    public static JobFlowInstancesDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JobFlowInstancesDetailJsonMarshaller();
        return instance;
    }

}
