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
package com.amazonaws.services.servermigration.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.servermigration.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ConnectorMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConnectorMarshaller {

    private static final MarshallingInfo<String> CONNECTORID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectorId").build();
    private static final MarshallingInfo<String> VERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("version").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<List> CAPABILITYLIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("capabilityList").build();
    private static final MarshallingInfo<String> VMMANAGERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("vmManagerName").build();
    private static final MarshallingInfo<String> VMMANAGERTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("vmManagerType").build();
    private static final MarshallingInfo<String> VMMANAGERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("vmManagerId").build();
    private static final MarshallingInfo<String> IPADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ipAddress").build();
    private static final MarshallingInfo<String> MACADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("macAddress").build();
    private static final MarshallingInfo<java.util.Date> ASSOCIATEDON_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("associatedOn").timestampFormat("unixTimestamp").build();

    private static final ConnectorMarshaller instance = new ConnectorMarshaller();

    public static ConnectorMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Connector connector, ProtocolMarshaller protocolMarshaller) {

        if (connector == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(connector.getConnectorId(), CONNECTORID_BINDING);
            protocolMarshaller.marshall(connector.getVersion(), VERSION_BINDING);
            protocolMarshaller.marshall(connector.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(connector.getCapabilityList(), CAPABILITYLIST_BINDING);
            protocolMarshaller.marshall(connector.getVmManagerName(), VMMANAGERNAME_BINDING);
            protocolMarshaller.marshall(connector.getVmManagerType(), VMMANAGERTYPE_BINDING);
            protocolMarshaller.marshall(connector.getVmManagerId(), VMMANAGERID_BINDING);
            protocolMarshaller.marshall(connector.getIpAddress(), IPADDRESS_BINDING);
            protocolMarshaller.marshall(connector.getMacAddress(), MACADDRESS_BINDING);
            protocolMarshaller.marshall(connector.getAssociatedOn(), ASSOCIATEDON_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
