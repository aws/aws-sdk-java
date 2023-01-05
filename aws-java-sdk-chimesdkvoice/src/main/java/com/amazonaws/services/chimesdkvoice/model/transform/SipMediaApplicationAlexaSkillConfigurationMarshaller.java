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
package com.amazonaws.services.chimesdkvoice.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.chimesdkvoice.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SipMediaApplicationAlexaSkillConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SipMediaApplicationAlexaSkillConfigurationMarshaller {

    private static final MarshallingInfo<String> ALEXASKILLSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AlexaSkillStatus").build();
    private static final MarshallingInfo<List> ALEXASKILLIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AlexaSkillIds").build();

    private static final SipMediaApplicationAlexaSkillConfigurationMarshaller instance = new SipMediaApplicationAlexaSkillConfigurationMarshaller();

    public static SipMediaApplicationAlexaSkillConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SipMediaApplicationAlexaSkillConfiguration sipMediaApplicationAlexaSkillConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (sipMediaApplicationAlexaSkillConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sipMediaApplicationAlexaSkillConfiguration.getAlexaSkillStatus(), ALEXASKILLSTATUS_BINDING);
            protocolMarshaller.marshall(sipMediaApplicationAlexaSkillConfiguration.getAlexaSkillIds(), ALEXASKILLIDS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
