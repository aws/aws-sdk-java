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
package com.amazonaws.services.elasticmapreduce.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elasticmapreduce.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * JobFlowDetailMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class JobFlowDetailMarshaller {

    private static final MarshallingInfo<String> JOBFLOWID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("JobFlowId").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> LOGURI_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LogUri").build();
    private static final MarshallingInfo<String> AMIVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AmiVersion").build();
    private static final MarshallingInfo<StructuredPojo> EXECUTIONSTATUSDETAIL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExecutionStatusDetail").build();
    private static final MarshallingInfo<StructuredPojo> INSTANCES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Instances").build();
    private static final MarshallingInfo<List> STEPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Steps").build();
    private static final MarshallingInfo<List> BOOTSTRAPACTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BootstrapActions").build();
    private static final MarshallingInfo<List> SUPPORTEDPRODUCTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SupportedProducts").build();
    private static final MarshallingInfo<Boolean> VISIBLETOALLUSERS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VisibleToAllUsers").build();
    private static final MarshallingInfo<String> JOBFLOWROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("JobFlowRole").build();
    private static final MarshallingInfo<String> SERVICEROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceRole").build();
    private static final MarshallingInfo<String> AUTOSCALINGROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoScalingRole").build();
    private static final MarshallingInfo<String> SCALEDOWNBEHAVIOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScaleDownBehavior").build();

    private static final JobFlowDetailMarshaller instance = new JobFlowDetailMarshaller();

    public static JobFlowDetailMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(JobFlowDetail jobFlowDetail, ProtocolMarshaller protocolMarshaller) {

        if (jobFlowDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(jobFlowDetail.getJobFlowId(), JOBFLOWID_BINDING);
            protocolMarshaller.marshall(jobFlowDetail.getName(), NAME_BINDING);
            protocolMarshaller.marshall(jobFlowDetail.getLogUri(), LOGURI_BINDING);
            protocolMarshaller.marshall(jobFlowDetail.getAmiVersion(), AMIVERSION_BINDING);
            protocolMarshaller.marshall(jobFlowDetail.getExecutionStatusDetail(), EXECUTIONSTATUSDETAIL_BINDING);
            protocolMarshaller.marshall(jobFlowDetail.getInstances(), INSTANCES_BINDING);
            protocolMarshaller.marshall(jobFlowDetail.getSteps(), STEPS_BINDING);
            protocolMarshaller.marshall(jobFlowDetail.getBootstrapActions(), BOOTSTRAPACTIONS_BINDING);
            protocolMarshaller.marshall(jobFlowDetail.getSupportedProducts(), SUPPORTEDPRODUCTS_BINDING);
            protocolMarshaller.marshall(jobFlowDetail.getVisibleToAllUsers(), VISIBLETOALLUSERS_BINDING);
            protocolMarshaller.marshall(jobFlowDetail.getJobFlowRole(), JOBFLOWROLE_BINDING);
            protocolMarshaller.marshall(jobFlowDetail.getServiceRole(), SERVICEROLE_BINDING);
            protocolMarshaller.marshall(jobFlowDetail.getAutoScalingRole(), AUTOSCALINGROLE_BINDING);
            protocolMarshaller.marshall(jobFlowDetail.getScaleDownBehavior(), SCALEDOWNBEHAVIOR_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
