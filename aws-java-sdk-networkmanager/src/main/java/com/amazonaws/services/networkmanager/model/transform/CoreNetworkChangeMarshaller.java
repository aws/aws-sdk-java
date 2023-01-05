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
package com.amazonaws.services.networkmanager.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.networkmanager.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CoreNetworkChangeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CoreNetworkChangeMarshaller {

    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Type").build();
    private static final MarshallingInfo<String> ACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Action").build();
    private static final MarshallingInfo<String> IDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Identifier").build();
    private static final MarshallingInfo<StructuredPojo> PREVIOUSVALUES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PreviousValues").build();
    private static final MarshallingInfo<StructuredPojo> NEWVALUES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NewValues").build();
    private static final MarshallingInfo<String> IDENTIFIERPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IdentifierPath").build();

    private static final CoreNetworkChangeMarshaller instance = new CoreNetworkChangeMarshaller();

    public static CoreNetworkChangeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CoreNetworkChange coreNetworkChange, ProtocolMarshaller protocolMarshaller) {

        if (coreNetworkChange == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(coreNetworkChange.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(coreNetworkChange.getAction(), ACTION_BINDING);
            protocolMarshaller.marshall(coreNetworkChange.getIdentifier(), IDENTIFIER_BINDING);
            protocolMarshaller.marshall(coreNetworkChange.getPreviousValues(), PREVIOUSVALUES_BINDING);
            protocolMarshaller.marshall(coreNetworkChange.getNewValues(), NEWVALUES_BINDING);
            protocolMarshaller.marshall(coreNetworkChange.getIdentifierPath(), IDENTIFIERPATH_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
