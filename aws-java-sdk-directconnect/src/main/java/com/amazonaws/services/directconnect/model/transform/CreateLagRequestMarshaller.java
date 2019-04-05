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
package com.amazonaws.services.directconnect.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.directconnect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateLagRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateLagRequestMarshaller {

    private static final MarshallingInfo<Integer> NUMBEROFCONNECTIONS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("numberOfConnections").build();
    private static final MarshallingInfo<String> LOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("location").build();
    private static final MarshallingInfo<String> CONNECTIONSBANDWIDTH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectionsBandwidth").build();
    private static final MarshallingInfo<String> LAGNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("lagName").build();
    private static final MarshallingInfo<String> CONNECTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectionId").build();

    private static final CreateLagRequestMarshaller instance = new CreateLagRequestMarshaller();

    public static CreateLagRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateLagRequest createLagRequest, ProtocolMarshaller protocolMarshaller) {

        if (createLagRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createLagRequest.getNumberOfConnections(), NUMBEROFCONNECTIONS_BINDING);
            protocolMarshaller.marshall(createLagRequest.getLocation(), LOCATION_BINDING);
            protocolMarshaller.marshall(createLagRequest.getConnectionsBandwidth(), CONNECTIONSBANDWIDTH_BINDING);
            protocolMarshaller.marshall(createLagRequest.getLagName(), LAGNAME_BINDING);
            protocolMarshaller.marshall(createLagRequest.getConnectionId(), CONNECTIONID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
