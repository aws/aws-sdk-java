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
package com.amazonaws.services.pinpoint.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpoint.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TemplateConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TemplateConfigurationMarshaller {

    private static final MarshallingInfo<StructuredPojo> EMAILTEMPLATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EmailTemplate").build();
    private static final MarshallingInfo<StructuredPojo> PUSHTEMPLATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PushTemplate").build();
    private static final MarshallingInfo<StructuredPojo> SMSTEMPLATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SMSTemplate").build();
    private static final MarshallingInfo<StructuredPojo> VOICETEMPLATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VoiceTemplate").build();

    private static final TemplateConfigurationMarshaller instance = new TemplateConfigurationMarshaller();

    public static TemplateConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TemplateConfiguration templateConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (templateConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(templateConfiguration.getEmailTemplate(), EMAILTEMPLATE_BINDING);
            protocolMarshaller.marshall(templateConfiguration.getPushTemplate(), PUSHTEMPLATE_BINDING);
            protocolMarshaller.marshall(templateConfiguration.getSMSTemplate(), SMSTEMPLATE_BINDING);
            protocolMarshaller.marshall(templateConfiguration.getVoiceTemplate(), VOICETEMPLATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
