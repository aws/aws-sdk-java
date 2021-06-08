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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appflow.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ConnectorConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConnectorConfigurationMarshaller {

    private static final MarshallingInfo<Boolean> CANUSEASSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("canUseAsSource").build();
    private static final MarshallingInfo<Boolean> CANUSEASDESTINATION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("canUseAsDestination").build();
    private static final MarshallingInfo<List> SUPPORTEDDESTINATIONCONNECTORS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("supportedDestinationConnectors").build();
    private static final MarshallingInfo<List> SUPPORTEDSCHEDULINGFREQUENCIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("supportedSchedulingFrequencies").build();
    private static final MarshallingInfo<Boolean> ISPRIVATELINKENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isPrivateLinkEnabled").build();
    private static final MarshallingInfo<Boolean> ISPRIVATELINKENDPOINTURLREQUIRED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isPrivateLinkEndpointUrlRequired").build();
    private static final MarshallingInfo<List> SUPPORTEDTRIGGERTYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("supportedTriggerTypes").build();
    private static final MarshallingInfo<StructuredPojo> CONNECTORMETADATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectorMetadata").build();

    private static final ConnectorConfigurationMarshaller instance = new ConnectorConfigurationMarshaller();

    public static ConnectorConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ConnectorConfiguration connectorConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (connectorConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(connectorConfiguration.getCanUseAsSource(), CANUSEASSOURCE_BINDING);
            protocolMarshaller.marshall(connectorConfiguration.getCanUseAsDestination(), CANUSEASDESTINATION_BINDING);
            protocolMarshaller.marshall(connectorConfiguration.getSupportedDestinationConnectors(), SUPPORTEDDESTINATIONCONNECTORS_BINDING);
            protocolMarshaller.marshall(connectorConfiguration.getSupportedSchedulingFrequencies(), SUPPORTEDSCHEDULINGFREQUENCIES_BINDING);
            protocolMarshaller.marshall(connectorConfiguration.getIsPrivateLinkEnabled(), ISPRIVATELINKENABLED_BINDING);
            protocolMarshaller.marshall(connectorConfiguration.getIsPrivateLinkEndpointUrlRequired(), ISPRIVATELINKENDPOINTURLREQUIRED_BINDING);
            protocolMarshaller.marshall(connectorConfiguration.getSupportedTriggerTypes(), SUPPORTEDTRIGGERTYPES_BINDING);
            protocolMarshaller.marshall(connectorConfiguration.getConnectorMetadata(), CONNECTORMETADATA_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
