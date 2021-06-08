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
package com.amazonaws.services.globalaccelerator.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.globalaccelerator.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AllowCustomRoutingTrafficRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AllowCustomRoutingTrafficRequestMarshaller {

    private static final MarshallingInfo<String> ENDPOINTGROUPARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndpointGroupArn").build();
    private static final MarshallingInfo<String> ENDPOINTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndpointId").build();
    private static final MarshallingInfo<List> DESTINATIONADDRESSES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationAddresses").build();
    private static final MarshallingInfo<List> DESTINATIONPORTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationPorts").build();
    private static final MarshallingInfo<Boolean> ALLOWALLTRAFFICTOENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AllowAllTrafficToEndpoint").build();

    private static final AllowCustomRoutingTrafficRequestMarshaller instance = new AllowCustomRoutingTrafficRequestMarshaller();

    public static AllowCustomRoutingTrafficRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AllowCustomRoutingTrafficRequest allowCustomRoutingTrafficRequest, ProtocolMarshaller protocolMarshaller) {

        if (allowCustomRoutingTrafficRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(allowCustomRoutingTrafficRequest.getEndpointGroupArn(), ENDPOINTGROUPARN_BINDING);
            protocolMarshaller.marshall(allowCustomRoutingTrafficRequest.getEndpointId(), ENDPOINTID_BINDING);
            protocolMarshaller.marshall(allowCustomRoutingTrafficRequest.getDestinationAddresses(), DESTINATIONADDRESSES_BINDING);
            protocolMarshaller.marshall(allowCustomRoutingTrafficRequest.getDestinationPorts(), DESTINATIONPORTS_BINDING);
            protocolMarshaller.marshall(allowCustomRoutingTrafficRequest.getAllowAllTrafficToEndpoint(), ALLOWALLTRAFFICTOENDPOINT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
