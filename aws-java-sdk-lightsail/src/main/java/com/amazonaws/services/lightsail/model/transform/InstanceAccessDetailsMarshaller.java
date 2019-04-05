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
package com.amazonaws.services.lightsail.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lightsail.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InstanceAccessDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InstanceAccessDetailsMarshaller {

    private static final MarshallingInfo<String> CERTKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("certKey").build();
    private static final MarshallingInfo<java.util.Date> EXPIRESAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("expiresAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> IPADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ipAddress").build();
    private static final MarshallingInfo<String> PASSWORD_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("password").build();
    private static final MarshallingInfo<StructuredPojo> PASSWORDDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("passwordData").build();
    private static final MarshallingInfo<String> PRIVATEKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("privateKey").build();
    private static final MarshallingInfo<String> PROTOCOL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("protocol").build();
    private static final MarshallingInfo<String> INSTANCENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("instanceName").build();
    private static final MarshallingInfo<String> USERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("username").build();
    private static final MarshallingInfo<List> HOSTKEYS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("hostKeys").build();

    private static final InstanceAccessDetailsMarshaller instance = new InstanceAccessDetailsMarshaller();

    public static InstanceAccessDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InstanceAccessDetails instanceAccessDetails, ProtocolMarshaller protocolMarshaller) {

        if (instanceAccessDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(instanceAccessDetails.getCertKey(), CERTKEY_BINDING);
            protocolMarshaller.marshall(instanceAccessDetails.getExpiresAt(), EXPIRESAT_BINDING);
            protocolMarshaller.marshall(instanceAccessDetails.getIpAddress(), IPADDRESS_BINDING);
            protocolMarshaller.marshall(instanceAccessDetails.getPassword(), PASSWORD_BINDING);
            protocolMarshaller.marshall(instanceAccessDetails.getPasswordData(), PASSWORDDATA_BINDING);
            protocolMarshaller.marshall(instanceAccessDetails.getPrivateKey(), PRIVATEKEY_BINDING);
            protocolMarshaller.marshall(instanceAccessDetails.getProtocol(), PROTOCOL_BINDING);
            protocolMarshaller.marshall(instanceAccessDetails.getInstanceName(), INSTANCENAME_BINDING);
            protocolMarshaller.marshall(instanceAccessDetails.getUsername(), USERNAME_BINDING);
            protocolMarshaller.marshall(instanceAccessDetails.getHostKeys(), HOSTKEYS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
