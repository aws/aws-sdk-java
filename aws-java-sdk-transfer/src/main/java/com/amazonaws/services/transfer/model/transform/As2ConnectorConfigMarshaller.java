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
package com.amazonaws.services.transfer.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.transfer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * As2ConnectorConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class As2ConnectorConfigMarshaller {

    private static final MarshallingInfo<String> LOCALPROFILEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LocalProfileId").build();
    private static final MarshallingInfo<String> PARTNERPROFILEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PartnerProfileId").build();
    private static final MarshallingInfo<String> MESSAGESUBJECT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MessageSubject").build();
    private static final MarshallingInfo<String> COMPRESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Compression").build();
    private static final MarshallingInfo<String> ENCRYPTIONALGORITHM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EncryptionAlgorithm").build();
    private static final MarshallingInfo<String> SIGNINGALGORITHM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SigningAlgorithm").build();
    private static final MarshallingInfo<String> MDNSIGNINGALGORITHM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MdnSigningAlgorithm").build();
    private static final MarshallingInfo<String> MDNRESPONSE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MdnResponse").build();

    private static final As2ConnectorConfigMarshaller instance = new As2ConnectorConfigMarshaller();

    public static As2ConnectorConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(As2ConnectorConfig as2ConnectorConfig, ProtocolMarshaller protocolMarshaller) {

        if (as2ConnectorConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(as2ConnectorConfig.getLocalProfileId(), LOCALPROFILEID_BINDING);
            protocolMarshaller.marshall(as2ConnectorConfig.getPartnerProfileId(), PARTNERPROFILEID_BINDING);
            protocolMarshaller.marshall(as2ConnectorConfig.getMessageSubject(), MESSAGESUBJECT_BINDING);
            protocolMarshaller.marshall(as2ConnectorConfig.getCompression(), COMPRESSION_BINDING);
            protocolMarshaller.marshall(as2ConnectorConfig.getEncryptionAlgorithm(), ENCRYPTIONALGORITHM_BINDING);
            protocolMarshaller.marshall(as2ConnectorConfig.getSigningAlgorithm(), SIGNINGALGORITHM_BINDING);
            protocolMarshaller.marshall(as2ConnectorConfig.getMdnSigningAlgorithm(), MDNSIGNINGALGORITHM_BINDING);
            protocolMarshaller.marshall(as2ConnectorConfig.getMdnResponse(), MDNRESPONSE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
