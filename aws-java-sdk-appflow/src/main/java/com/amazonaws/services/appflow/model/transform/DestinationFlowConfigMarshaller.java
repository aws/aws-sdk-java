/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appflow.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appflow.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DestinationFlowConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DestinationFlowConfigMarshaller {

    private static final MarshallingInfo<String> CONNECTORTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectorType").build();
    private static final MarshallingInfo<String> CONNECTORPROFILENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectorProfileName").build();
    private static final MarshallingInfo<StructuredPojo> DESTINATIONCONNECTORPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("destinationConnectorProperties").build();

    private static final DestinationFlowConfigMarshaller instance = new DestinationFlowConfigMarshaller();

    public static DestinationFlowConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DestinationFlowConfig destinationFlowConfig, ProtocolMarshaller protocolMarshaller) {

        if (destinationFlowConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(destinationFlowConfig.getConnectorType(), CONNECTORTYPE_BINDING);
            protocolMarshaller.marshall(destinationFlowConfig.getConnectorProfileName(), CONNECTORPROFILENAME_BINDING);
            protocolMarshaller.marshall(destinationFlowConfig.getDestinationConnectorProperties(), DESTINATIONCONNECTORPROPERTIES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
