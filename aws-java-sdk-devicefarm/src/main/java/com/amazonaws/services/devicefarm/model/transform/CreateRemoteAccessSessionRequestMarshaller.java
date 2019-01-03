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
 * CreateRemoteAccessSessionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateRemoteAccessSessionRequestMarshaller {

    private static final MarshallingInfo<String> PROJECTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("projectArn").build();
    private static final MarshallingInfo<String> DEVICEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("deviceArn").build();
    private static final MarshallingInfo<String> INSTANCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("instanceArn").build();
    private static final MarshallingInfo<String> SSHPUBLICKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sshPublicKey").build();
    private static final MarshallingInfo<Boolean> REMOTEDEBUGENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("remoteDebugEnabled").build();
    private static final MarshallingInfo<Boolean> REMOTERECORDENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("remoteRecordEnabled").build();
    private static final MarshallingInfo<String> REMOTERECORDAPPARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("remoteRecordAppArn").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> CLIENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("clientId").build();
    private static final MarshallingInfo<StructuredPojo> CONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("configuration").build();
    private static final MarshallingInfo<String> INTERACTIONMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("interactionMode").build();
    private static final MarshallingInfo<Boolean> SKIPAPPRESIGN_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("skipAppResign").build();

    private static final CreateRemoteAccessSessionRequestMarshaller instance = new CreateRemoteAccessSessionRequestMarshaller();

    public static CreateRemoteAccessSessionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateRemoteAccessSessionRequest createRemoteAccessSessionRequest, ProtocolMarshaller protocolMarshaller) {

        if (createRemoteAccessSessionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createRemoteAccessSessionRequest.getProjectArn(), PROJECTARN_BINDING);
            protocolMarshaller.marshall(createRemoteAccessSessionRequest.getDeviceArn(), DEVICEARN_BINDING);
            protocolMarshaller.marshall(createRemoteAccessSessionRequest.getInstanceArn(), INSTANCEARN_BINDING);
            protocolMarshaller.marshall(createRemoteAccessSessionRequest.getSshPublicKey(), SSHPUBLICKEY_BINDING);
            protocolMarshaller.marshall(createRemoteAccessSessionRequest.getRemoteDebugEnabled(), REMOTEDEBUGENABLED_BINDING);
            protocolMarshaller.marshall(createRemoteAccessSessionRequest.getRemoteRecordEnabled(), REMOTERECORDENABLED_BINDING);
            protocolMarshaller.marshall(createRemoteAccessSessionRequest.getRemoteRecordAppArn(), REMOTERECORDAPPARN_BINDING);
            protocolMarshaller.marshall(createRemoteAccessSessionRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(createRemoteAccessSessionRequest.getClientId(), CLIENTID_BINDING);
            protocolMarshaller.marshall(createRemoteAccessSessionRequest.getConfiguration(), CONFIGURATION_BINDING);
            protocolMarshaller.marshall(createRemoteAccessSessionRequest.getInteractionMode(), INTERACTIONMODE_BINDING);
            protocolMarshaller.marshall(createRemoteAccessSessionRequest.getSkipAppResign(), SKIPAPPRESIGN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
