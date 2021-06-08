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
package com.amazonaws.services.ec2instanceconnect.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ec2instanceconnect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SendSerialConsoleSSHPublicKeyRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SendSerialConsoleSSHPublicKeyRequestMarshaller {

    private static final MarshallingInfo<String> INSTANCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceId").build();
    private static final MarshallingInfo<Integer> SERIALPORT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SerialPort").build();
    private static final MarshallingInfo<String> SSHPUBLICKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SSHPublicKey").build();

    private static final SendSerialConsoleSSHPublicKeyRequestMarshaller instance = new SendSerialConsoleSSHPublicKeyRequestMarshaller();

    public static SendSerialConsoleSSHPublicKeyRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SendSerialConsoleSSHPublicKeyRequest sendSerialConsoleSSHPublicKeyRequest, ProtocolMarshaller protocolMarshaller) {

        if (sendSerialConsoleSSHPublicKeyRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sendSerialConsoleSSHPublicKeyRequest.getInstanceId(), INSTANCEID_BINDING);
            protocolMarshaller.marshall(sendSerialConsoleSSHPublicKeyRequest.getSerialPort(), SERIALPORT_BINDING);
            protocolMarshaller.marshall(sendSerialConsoleSSHPublicKeyRequest.getSSHPublicKey(), SSHPUBLICKEY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
