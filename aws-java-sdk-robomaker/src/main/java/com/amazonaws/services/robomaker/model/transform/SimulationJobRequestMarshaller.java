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
package com.amazonaws.services.robomaker.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.robomaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SimulationJobRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SimulationJobRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> OUTPUTLOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("outputLocation").build();
    private static final MarshallingInfo<StructuredPojo> LOGGINGCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("loggingConfig").build();
    private static final MarshallingInfo<Long> MAXJOBDURATIONINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxJobDurationInSeconds").build();
    private static final MarshallingInfo<String> IAMROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("iamRole").build();
    private static final MarshallingInfo<String> FAILUREBEHAVIOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("failureBehavior").build();
    private static final MarshallingInfo<Boolean> USEDEFAULTAPPLICATIONS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("useDefaultApplications").build();
    private static final MarshallingInfo<List> ROBOTAPPLICATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("robotApplications").build();
    private static final MarshallingInfo<List> SIMULATIONAPPLICATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("simulationApplications").build();
    private static final MarshallingInfo<List> DATASOURCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("dataSources").build();
    private static final MarshallingInfo<StructuredPojo> VPCCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("vpcConfig").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final SimulationJobRequestMarshaller instance = new SimulationJobRequestMarshaller();

    public static SimulationJobRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SimulationJobRequest simulationJobRequest, ProtocolMarshaller protocolMarshaller) {

        if (simulationJobRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(simulationJobRequest.getOutputLocation(), OUTPUTLOCATION_BINDING);
            protocolMarshaller.marshall(simulationJobRequest.getLoggingConfig(), LOGGINGCONFIG_BINDING);
            protocolMarshaller.marshall(simulationJobRequest.getMaxJobDurationInSeconds(), MAXJOBDURATIONINSECONDS_BINDING);
            protocolMarshaller.marshall(simulationJobRequest.getIamRole(), IAMROLE_BINDING);
            protocolMarshaller.marshall(simulationJobRequest.getFailureBehavior(), FAILUREBEHAVIOR_BINDING);
            protocolMarshaller.marshall(simulationJobRequest.getUseDefaultApplications(), USEDEFAULTAPPLICATIONS_BINDING);
            protocolMarshaller.marshall(simulationJobRequest.getRobotApplications(), ROBOTAPPLICATIONS_BINDING);
            protocolMarshaller.marshall(simulationJobRequest.getSimulationApplications(), SIMULATIONAPPLICATIONS_BINDING);
            protocolMarshaller.marshall(simulationJobRequest.getDataSources(), DATASOURCES_BINDING);
            protocolMarshaller.marshall(simulationJobRequest.getVpcConfig(), VPCCONFIG_BINDING);
            protocolMarshaller.marshall(simulationJobRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
