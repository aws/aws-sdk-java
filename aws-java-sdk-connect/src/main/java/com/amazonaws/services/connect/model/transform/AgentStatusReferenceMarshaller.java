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
package com.amazonaws.services.connect.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AgentStatusReferenceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AgentStatusReferenceMarshaller {

    private static final MarshallingInfo<java.util.Date> STATUSSTARTTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatusStartTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> STATUSARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StatusArn").build();
    private static final MarshallingInfo<String> STATUSNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatusName").build();

    private static final AgentStatusReferenceMarshaller instance = new AgentStatusReferenceMarshaller();

    public static AgentStatusReferenceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AgentStatusReference agentStatusReference, ProtocolMarshaller protocolMarshaller) {

        if (agentStatusReference == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(agentStatusReference.getStatusStartTimestamp(), STATUSSTARTTIMESTAMP_BINDING);
            protocolMarshaller.marshall(agentStatusReference.getStatusArn(), STATUSARN_BINDING);
            protocolMarshaller.marshall(agentStatusReference.getStatusName(), STATUSNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
