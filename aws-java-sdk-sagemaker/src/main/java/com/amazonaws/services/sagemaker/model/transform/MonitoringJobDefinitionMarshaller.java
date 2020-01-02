/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MonitoringJobDefinitionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MonitoringJobDefinitionMarshaller {

    private static final MarshallingInfo<StructuredPojo> BASELINECONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BaselineConfig").build();
    private static final MarshallingInfo<List> MONITORINGINPUTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MonitoringInputs").build();
    private static final MarshallingInfo<StructuredPojo> MONITORINGOUTPUTCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MonitoringOutputConfig").build();
    private static final MarshallingInfo<StructuredPojo> MONITORINGRESOURCES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MonitoringResources").build();
    private static final MarshallingInfo<StructuredPojo> MONITORINGAPPSPECIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MonitoringAppSpecification").build();
    private static final MarshallingInfo<StructuredPojo> STOPPINGCONDITION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StoppingCondition").build();
    private static final MarshallingInfo<Map> ENVIRONMENT_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Environment").build();
    private static final MarshallingInfo<StructuredPojo> NETWORKCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NetworkConfig").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RoleArn").build();

    private static final MonitoringJobDefinitionMarshaller instance = new MonitoringJobDefinitionMarshaller();

    public static MonitoringJobDefinitionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MonitoringJobDefinition monitoringJobDefinition, ProtocolMarshaller protocolMarshaller) {

        if (monitoringJobDefinition == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(monitoringJobDefinition.getBaselineConfig(), BASELINECONFIG_BINDING);
            protocolMarshaller.marshall(monitoringJobDefinition.getMonitoringInputs(), MONITORINGINPUTS_BINDING);
            protocolMarshaller.marshall(monitoringJobDefinition.getMonitoringOutputConfig(), MONITORINGOUTPUTCONFIG_BINDING);
            protocolMarshaller.marshall(monitoringJobDefinition.getMonitoringResources(), MONITORINGRESOURCES_BINDING);
            protocolMarshaller.marshall(monitoringJobDefinition.getMonitoringAppSpecification(), MONITORINGAPPSPECIFICATION_BINDING);
            protocolMarshaller.marshall(monitoringJobDefinition.getStoppingCondition(), STOPPINGCONDITION_BINDING);
            protocolMarshaller.marshall(monitoringJobDefinition.getEnvironment(), ENVIRONMENT_BINDING);
            protocolMarshaller.marshall(monitoringJobDefinition.getNetworkConfig(), NETWORKCONFIG_BINDING);
            protocolMarshaller.marshall(monitoringJobDefinition.getRoleArn(), ROLEARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
