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
package com.amazonaws.services.opsworks.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.opsworks.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RegisterInstanceRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RegisterInstanceRequestMarshaller {

    private static final MarshallingInfo<String> STACKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StackId").build();
    private static final MarshallingInfo<String> HOSTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Hostname").build();
    private static final MarshallingInfo<String> PUBLICIP_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PublicIp").build();
    private static final MarshallingInfo<String> PRIVATEIP_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PrivateIp").build();
    private static final MarshallingInfo<String> RSAPUBLICKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RsaPublicKey").build();
    private static final MarshallingInfo<String> RSAPUBLICKEYFINGERPRINT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RsaPublicKeyFingerprint").build();
    private static final MarshallingInfo<StructuredPojo> INSTANCEIDENTITY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceIdentity").build();

    private static final RegisterInstanceRequestMarshaller instance = new RegisterInstanceRequestMarshaller();

    public static RegisterInstanceRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RegisterInstanceRequest registerInstanceRequest, ProtocolMarshaller protocolMarshaller) {

        if (registerInstanceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(registerInstanceRequest.getStackId(), STACKID_BINDING);
            protocolMarshaller.marshall(registerInstanceRequest.getHostname(), HOSTNAME_BINDING);
            protocolMarshaller.marshall(registerInstanceRequest.getPublicIp(), PUBLICIP_BINDING);
            protocolMarshaller.marshall(registerInstanceRequest.getPrivateIp(), PRIVATEIP_BINDING);
            protocolMarshaller.marshall(registerInstanceRequest.getRsaPublicKey(), RSAPUBLICKEY_BINDING);
            protocolMarshaller.marshall(registerInstanceRequest.getRsaPublicKeyFingerprint(), RSAPUBLICKEYFINGERPRINT_BINDING);
            protocolMarshaller.marshall(registerInstanceRequest.getInstanceIdentity(), INSTANCEIDENTITY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
