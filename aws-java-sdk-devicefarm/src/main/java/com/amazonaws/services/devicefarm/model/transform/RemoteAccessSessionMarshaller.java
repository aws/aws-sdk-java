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
package com.amazonaws.services.devicefarm.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.devicefarm.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RemoteAccessSessionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RemoteAccessSessionMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<java.util.Date> CREATED_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("created").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> RESULT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("result").build();
    private static final MarshallingInfo<String> MESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("message").build();
    private static final MarshallingInfo<java.util.Date> STARTED_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("started").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> STOPPED_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("stopped").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> DEVICE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("device").build();
    private static final MarshallingInfo<String> INSTANCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("instanceArn").build();
    private static final MarshallingInfo<Boolean> REMOTEDEBUGENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("remoteDebugEnabled").build();
    private static final MarshallingInfo<Boolean> REMOTERECORDENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("remoteRecordEnabled").build();
    private static final MarshallingInfo<String> REMOTERECORDAPPARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("remoteRecordAppArn").build();
    private static final MarshallingInfo<String> HOSTADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("hostAddress").build();
    private static final MarshallingInfo<String> CLIENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("clientId").build();
    private static final MarshallingInfo<String> BILLINGMETHOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("billingMethod").build();
    private static final MarshallingInfo<StructuredPojo> DEVICEMINUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deviceMinutes").build();
    private static final MarshallingInfo<String> ENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("endpoint").build();
    private static final MarshallingInfo<String> DEVICEUDID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deviceUdid").build();
    private static final MarshallingInfo<String> INTERACTIONMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("interactionMode").build();
    private static final MarshallingInfo<Boolean> SKIPAPPRESIGN_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("skipAppResign").build();

    private static final RemoteAccessSessionMarshaller instance = new RemoteAccessSessionMarshaller();

    public static RemoteAccessSessionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RemoteAccessSession remoteAccessSession, ProtocolMarshaller protocolMarshaller) {

        if (remoteAccessSession == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(remoteAccessSession.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(remoteAccessSession.getName(), NAME_BINDING);
            protocolMarshaller.marshall(remoteAccessSession.getCreated(), CREATED_BINDING);
            protocolMarshaller.marshall(remoteAccessSession.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(remoteAccessSession.getResult(), RESULT_BINDING);
            protocolMarshaller.marshall(remoteAccessSession.getMessage(), MESSAGE_BINDING);
            protocolMarshaller.marshall(remoteAccessSession.getStarted(), STARTED_BINDING);
            protocolMarshaller.marshall(remoteAccessSession.getStopped(), STOPPED_BINDING);
            protocolMarshaller.marshall(remoteAccessSession.getDevice(), DEVICE_BINDING);
            protocolMarshaller.marshall(remoteAccessSession.getInstanceArn(), INSTANCEARN_BINDING);
            protocolMarshaller.marshall(remoteAccessSession.getRemoteDebugEnabled(), REMOTEDEBUGENABLED_BINDING);
            protocolMarshaller.marshall(remoteAccessSession.getRemoteRecordEnabled(), REMOTERECORDENABLED_BINDING);
            protocolMarshaller.marshall(remoteAccessSession.getRemoteRecordAppArn(), REMOTERECORDAPPARN_BINDING);
            protocolMarshaller.marshall(remoteAccessSession.getHostAddress(), HOSTADDRESS_BINDING);
            protocolMarshaller.marshall(remoteAccessSession.getClientId(), CLIENTID_BINDING);
            protocolMarshaller.marshall(remoteAccessSession.getBillingMethod(), BILLINGMETHOD_BINDING);
            protocolMarshaller.marshall(remoteAccessSession.getDeviceMinutes(), DEVICEMINUTES_BINDING);
            protocolMarshaller.marshall(remoteAccessSession.getEndpoint(), ENDPOINT_BINDING);
            protocolMarshaller.marshall(remoteAccessSession.getDeviceUdid(), DEVICEUDID_BINDING);
            protocolMarshaller.marshall(remoteAccessSession.getInteractionMode(), INTERACTIONMODE_BINDING);
            protocolMarshaller.marshall(remoteAccessSession.getSkipAppResign(), SKIPAPPRESIGN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
