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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.robomaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateSimulationApplicationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateSimulationApplicationRequestMarshaller {

    private static final MarshallingInfo<String> APPLICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("application").build();
    private static final MarshallingInfo<List> SOURCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("sources").build();
    private static final MarshallingInfo<StructuredPojo> SIMULATIONSOFTWARESUITE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("simulationSoftwareSuite").build();
    private static final MarshallingInfo<StructuredPojo> ROBOTSOFTWARESUITE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("robotSoftwareSuite").build();
    private static final MarshallingInfo<StructuredPojo> RENDERINGENGINE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("renderingEngine").build();
    private static final MarshallingInfo<String> CURRENTREVISIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("currentRevisionId").build();

    private static final UpdateSimulationApplicationRequestMarshaller instance = new UpdateSimulationApplicationRequestMarshaller();

    public static UpdateSimulationApplicationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateSimulationApplicationRequest updateSimulationApplicationRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateSimulationApplicationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateSimulationApplicationRequest.getApplication(), APPLICATION_BINDING);
            protocolMarshaller.marshall(updateSimulationApplicationRequest.getSources(), SOURCES_BINDING);
            protocolMarshaller.marshall(updateSimulationApplicationRequest.getSimulationSoftwareSuite(), SIMULATIONSOFTWARESUITE_BINDING);
            protocolMarshaller.marshall(updateSimulationApplicationRequest.getRobotSoftwareSuite(), ROBOTSOFTWARESUITE_BINDING);
            protocolMarshaller.marshall(updateSimulationApplicationRequest.getRenderingEngine(), RENDERINGENGINE_BINDING);
            protocolMarshaller.marshall(updateSimulationApplicationRequest.getCurrentRevisionId(), CURRENTREVISIONID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
