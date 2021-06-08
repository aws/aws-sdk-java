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
package com.amazonaws.services.connect.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InstanceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InstanceMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Arn").build();
    private static final MarshallingInfo<String> IDENTITYMANAGEMENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IdentityManagementType").build();
    private static final MarshallingInfo<String> INSTANCEALIAS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceAlias").build();
    private static final MarshallingInfo<java.util.Date> CREATEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> SERVICEROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceRole").build();
    private static final MarshallingInfo<String> INSTANCESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceStatus").build();
    private static final MarshallingInfo<StructuredPojo> STATUSREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatusReason").build();
    private static final MarshallingInfo<Boolean> INBOUNDCALLSENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InboundCallsEnabled").build();
    private static final MarshallingInfo<Boolean> OUTBOUNDCALLSENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutboundCallsEnabled").build();

    private static final InstanceMarshaller instance = new InstanceMarshaller();

    public static InstanceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Instance instance, ProtocolMarshaller protocolMarshaller) {

        if (instance == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(instance.getId(), ID_BINDING);
            protocolMarshaller.marshall(instance.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(instance.getIdentityManagementType(), IDENTITYMANAGEMENTTYPE_BINDING);
            protocolMarshaller.marshall(instance.getInstanceAlias(), INSTANCEALIAS_BINDING);
            protocolMarshaller.marshall(instance.getCreatedTime(), CREATEDTIME_BINDING);
            protocolMarshaller.marshall(instance.getServiceRole(), SERVICEROLE_BINDING);
            protocolMarshaller.marshall(instance.getInstanceStatus(), INSTANCESTATUS_BINDING);
            protocolMarshaller.marshall(instance.getStatusReason(), STATUSREASON_BINDING);
            protocolMarshaller.marshall(instance.getInboundCallsEnabled(), INBOUNDCALLSENABLED_BINDING);
            protocolMarshaller.marshall(instance.getOutboundCallsEnabled(), OUTBOUNDCALLSENABLED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
