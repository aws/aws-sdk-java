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
package com.amazonaws.services.robomaker.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.robomaker.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateSimulationJobRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateSimulationJobRequestMarshaller {

    private static final MarshallingInfo<String> CLIENTREQUESTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientRequestToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<StructuredPojo> OUTPUTLOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("outputLocation").build();
    private static final MarshallingInfo<Long> MAXJOBDURATIONINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxJobDurationInSeconds").build();
    private static final MarshallingInfo<String> IAMROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("iamRole").build();
    private static final MarshallingInfo<String> FAILUREBEHAVIOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("failureBehavior").build();
    private static final MarshallingInfo<List> ROBOTAPPLICATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("robotApplications").build();
    private static final MarshallingInfo<List> SIMULATIONAPPLICATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("simulationApplications").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<StructuredPojo> VPCCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("vpcConfig").build();

    private static final CreateSimulationJobRequestMarshaller instance = new CreateSimulationJobRequestMarshaller();

    public static CreateSimulationJobRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateSimulationJobRequest createSimulationJobRequest, ProtocolMarshaller protocolMarshaller) {

        if (createSimulationJobRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createSimulationJobRequest.getClientRequestToken(), CLIENTREQUESTTOKEN_BINDING);
            protocolMarshaller.marshall(createSimulationJobRequest.getOutputLocation(), OUTPUTLOCATION_BINDING);
            protocolMarshaller.marshall(createSimulationJobRequest.getMaxJobDurationInSeconds(), MAXJOBDURATIONINSECONDS_BINDING);
            protocolMarshaller.marshall(createSimulationJobRequest.getIamRole(), IAMROLE_BINDING);
            protocolMarshaller.marshall(createSimulationJobRequest.getFailureBehavior(), FAILUREBEHAVIOR_BINDING);
            protocolMarshaller.marshall(createSimulationJobRequest.getRobotApplications(), ROBOTAPPLICATIONS_BINDING);
            protocolMarshaller.marshall(createSimulationJobRequest.getSimulationApplications(), SIMULATIONAPPLICATIONS_BINDING);
            protocolMarshaller.marshall(createSimulationJobRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createSimulationJobRequest.getVpcConfig(), VPCCONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
