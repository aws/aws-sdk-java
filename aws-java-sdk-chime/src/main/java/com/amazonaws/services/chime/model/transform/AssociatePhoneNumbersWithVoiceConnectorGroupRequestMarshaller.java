/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chime.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.chime.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AssociatePhoneNumbersWithVoiceConnectorGroupRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AssociatePhoneNumbersWithVoiceConnectorGroupRequestMarshaller {

    private static final MarshallingInfo<String> VOICECONNECTORGROUPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("voiceConnectorGroupId").build();
    private static final MarshallingInfo<List> E164PHONENUMBERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("E164PhoneNumbers").build();
    private static final MarshallingInfo<Boolean> FORCEASSOCIATE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ForceAssociate").build();

    private static final AssociatePhoneNumbersWithVoiceConnectorGroupRequestMarshaller instance = new AssociatePhoneNumbersWithVoiceConnectorGroupRequestMarshaller();

    public static AssociatePhoneNumbersWithVoiceConnectorGroupRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AssociatePhoneNumbersWithVoiceConnectorGroupRequest associatePhoneNumbersWithVoiceConnectorGroupRequest,
            ProtocolMarshaller protocolMarshaller) {

        if (associatePhoneNumbersWithVoiceConnectorGroupRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(associatePhoneNumbersWithVoiceConnectorGroupRequest.getVoiceConnectorGroupId(), VOICECONNECTORGROUPID_BINDING);
            protocolMarshaller.marshall(associatePhoneNumbersWithVoiceConnectorGroupRequest.getE164PhoneNumbers(), E164PHONENUMBERS_BINDING);
            protocolMarshaller.marshall(associatePhoneNumbersWithVoiceConnectorGroupRequest.getForceAssociate(), FORCEASSOCIATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
