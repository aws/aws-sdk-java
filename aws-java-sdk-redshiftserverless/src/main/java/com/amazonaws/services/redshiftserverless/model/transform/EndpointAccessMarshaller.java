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
package com.amazonaws.services.redshiftserverless.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.redshiftserverless.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EndpointAccessMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EndpointAccessMarshaller {

    private static final MarshallingInfo<String> ADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("address").build();
    private static final MarshallingInfo<String> ENDPOINTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("endpointArn").build();
    private static final MarshallingInfo<java.util.Date> ENDPOINTCREATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("endpointCreateTime").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> ENDPOINTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("endpointName").build();
    private static final MarshallingInfo<String> ENDPOINTSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("endpointStatus").build();
    private static final MarshallingInfo<Integer> PORT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("port").build();
    private static final MarshallingInfo<List> SUBNETIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("subnetIds").build();
    private static final MarshallingInfo<StructuredPojo> VPCENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("vpcEndpoint").build();
    private static final MarshallingInfo<List> VPCSECURITYGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("vpcSecurityGroups").build();
    private static final MarshallingInfo<String> WORKGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("workgroupName").build();

    private static final EndpointAccessMarshaller instance = new EndpointAccessMarshaller();

    public static EndpointAccessMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EndpointAccess endpointAccess, ProtocolMarshaller protocolMarshaller) {

        if (endpointAccess == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(endpointAccess.getAddress(), ADDRESS_BINDING);
            protocolMarshaller.marshall(endpointAccess.getEndpointArn(), ENDPOINTARN_BINDING);
            protocolMarshaller.marshall(endpointAccess.getEndpointCreateTime(), ENDPOINTCREATETIME_BINDING);
            protocolMarshaller.marshall(endpointAccess.getEndpointName(), ENDPOINTNAME_BINDING);
            protocolMarshaller.marshall(endpointAccess.getEndpointStatus(), ENDPOINTSTATUS_BINDING);
            protocolMarshaller.marshall(endpointAccess.getPort(), PORT_BINDING);
            protocolMarshaller.marshall(endpointAccess.getSubnetIds(), SUBNETIDS_BINDING);
            protocolMarshaller.marshall(endpointAccess.getVpcEndpoint(), VPCENDPOINT_BINDING);
            protocolMarshaller.marshall(endpointAccess.getVpcSecurityGroups(), VPCSECURITYGROUPS_BINDING);
            protocolMarshaller.marshall(endpointAccess.getWorkgroupName(), WORKGROUPNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
