/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * ConnectorDetailMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConnectorDetailMarshaller {

    private static final MarshallingInfo<String> CONNECTORDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectorDescription").build();
    private static final MarshallingInfo<String> CONNECTORNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectorName").build();
    private static final MarshallingInfo<String> CONNECTOROWNER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectorOwner").build();
    private static final MarshallingInfo<String> CONNECTORVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectorVersion").build();
    private static final MarshallingInfo<String> APPLICATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("applicationType").build();
    private static final MarshallingInfo<String> CONNECTORTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectorType").build();
    private static final MarshallingInfo<String> CONNECTORLABEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectorLabel").build();
    private static final MarshallingInfo<java.util.Date> REGISTEREDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("registeredAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> REGISTEREDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("registeredBy").build();
    private static final MarshallingInfo<String> CONNECTORPROVISIONINGTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectorProvisioningType").build();
    private static final MarshallingInfo<List> CONNECTORMODES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectorModes").build();

    private static final ConnectorDetailMarshaller instance = new ConnectorDetailMarshaller();

    public static ConnectorDetailMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ConnectorDetail connectorDetail, ProtocolMarshaller protocolMarshaller) {

        if (connectorDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(connectorDetail.getConnectorDescription(), CONNECTORDESCRIPTION_BINDING);
            protocolMarshaller.marshall(connectorDetail.getConnectorName(), CONNECTORNAME_BINDING);
            protocolMarshaller.marshall(connectorDetail.getConnectorOwner(), CONNECTOROWNER_BINDING);
            protocolMarshaller.marshall(connectorDetail.getConnectorVersion(), CONNECTORVERSION_BINDING);
            protocolMarshaller.marshall(connectorDetail.getApplicationType(), APPLICATIONTYPE_BINDING);
            protocolMarshaller.marshall(connectorDetail.getConnectorType(), CONNECTORTYPE_BINDING);
            protocolMarshaller.marshall(connectorDetail.getConnectorLabel(), CONNECTORLABEL_BINDING);
            protocolMarshaller.marshall(connectorDetail.getRegisteredAt(), REGISTEREDAT_BINDING);
            protocolMarshaller.marshall(connectorDetail.getRegisteredBy(), REGISTEREDBY_BINDING);
            protocolMarshaller.marshall(connectorDetail.getConnectorProvisioningType(), CONNECTORPROVISIONINGTYPE_BINDING);
            protocolMarshaller.marshall(connectorDetail.getConnectorModes(), CONNECTORMODES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
