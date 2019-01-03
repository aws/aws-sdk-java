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
package com.amazonaws.services.pinpoint.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpoint.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DirectMessageConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DirectMessageConfigurationMarshaller {

    private static final MarshallingInfo<StructuredPojo> ADMMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ADMMessage").build();
    private static final MarshallingInfo<StructuredPojo> APNSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("APNSMessage").build();
    private static final MarshallingInfo<StructuredPojo> BAIDUMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BaiduMessage").build();
    private static final MarshallingInfo<StructuredPojo> DEFAULTMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultMessage").build();
    private static final MarshallingInfo<StructuredPojo> DEFAULTPUSHNOTIFICATIONMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultPushNotificationMessage").build();
    private static final MarshallingInfo<StructuredPojo> EMAILMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EmailMessage").build();
    private static final MarshallingInfo<StructuredPojo> GCMMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GCMMessage").build();
    private static final MarshallingInfo<StructuredPojo> SMSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SMSMessage").build();
    private static final MarshallingInfo<StructuredPojo> VOICEMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VoiceMessage").build();

    private static final DirectMessageConfigurationMarshaller instance = new DirectMessageConfigurationMarshaller();

    public static DirectMessageConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DirectMessageConfiguration directMessageConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (directMessageConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(directMessageConfiguration.getADMMessage(), ADMMESSAGE_BINDING);
            protocolMarshaller.marshall(directMessageConfiguration.getAPNSMessage(), APNSMESSAGE_BINDING);
            protocolMarshaller.marshall(directMessageConfiguration.getBaiduMessage(), BAIDUMESSAGE_BINDING);
            protocolMarshaller.marshall(directMessageConfiguration.getDefaultMessage(), DEFAULTMESSAGE_BINDING);
            protocolMarshaller.marshall(directMessageConfiguration.getDefaultPushNotificationMessage(), DEFAULTPUSHNOTIFICATIONMESSAGE_BINDING);
            protocolMarshaller.marshall(directMessageConfiguration.getEmailMessage(), EMAILMESSAGE_BINDING);
            protocolMarshaller.marshall(directMessageConfiguration.getGCMMessage(), GCMMESSAGE_BINDING);
            protocolMarshaller.marshall(directMessageConfiguration.getSMSMessage(), SMSMESSAGE_BINDING);
            protocolMarshaller.marshall(directMessageConfiguration.getVoiceMessage(), VOICEMESSAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
