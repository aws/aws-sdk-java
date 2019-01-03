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
package com.amazonaws.services.transfer.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.transfer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SshPublicKeyMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SshPublicKeyMarshaller {

    private static final MarshallingInfo<java.util.Date> DATEIMPORTED_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DateImported").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> SSHPUBLICKEYBODY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SshPublicKeyBody").build();
    private static final MarshallingInfo<String> SSHPUBLICKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SshPublicKeyId").build();

    private static final SshPublicKeyMarshaller instance = new SshPublicKeyMarshaller();

    public static SshPublicKeyMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SshPublicKey sshPublicKey, ProtocolMarshaller protocolMarshaller) {

        if (sshPublicKey == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sshPublicKey.getDateImported(), DATEIMPORTED_BINDING);
            protocolMarshaller.marshall(sshPublicKey.getSshPublicKeyBody(), SSHPUBLICKEYBODY_BINDING);
            protocolMarshaller.marshall(sshPublicKey.getSshPublicKeyId(), SSHPUBLICKEYID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
