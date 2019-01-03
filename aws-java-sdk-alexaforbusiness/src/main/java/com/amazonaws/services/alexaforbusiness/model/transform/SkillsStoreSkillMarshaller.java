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
package com.amazonaws.services.alexaforbusiness.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.alexaforbusiness.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SkillsStoreSkillMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SkillsStoreSkillMarshaller {

    private static final MarshallingInfo<String> SKILLID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SkillId").build();
    private static final MarshallingInfo<String> SKILLNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SkillName").build();
    private static final MarshallingInfo<String> SHORTDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ShortDescription").build();
    private static final MarshallingInfo<String> ICONURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IconUrl").build();
    private static final MarshallingInfo<List> SAMPLEUTTERANCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SampleUtterances").build();
    private static final MarshallingInfo<StructuredPojo> SKILLDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SkillDetails").build();
    private static final MarshallingInfo<Boolean> SUPPORTSLINKING_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SupportsLinking").build();

    private static final SkillsStoreSkillMarshaller instance = new SkillsStoreSkillMarshaller();

    public static SkillsStoreSkillMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SkillsStoreSkill skillsStoreSkill, ProtocolMarshaller protocolMarshaller) {

        if (skillsStoreSkill == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(skillsStoreSkill.getSkillId(), SKILLID_BINDING);
            protocolMarshaller.marshall(skillsStoreSkill.getSkillName(), SKILLNAME_BINDING);
            protocolMarshaller.marshall(skillsStoreSkill.getShortDescription(), SHORTDESCRIPTION_BINDING);
            protocolMarshaller.marshall(skillsStoreSkill.getIconUrl(), ICONURL_BINDING);
            protocolMarshaller.marshall(skillsStoreSkill.getSampleUtterances(), SAMPLEUTTERANCES_BINDING);
            protocolMarshaller.marshall(skillsStoreSkill.getSkillDetails(), SKILLDETAILS_BINDING);
            protocolMarshaller.marshall(skillsStoreSkill.getSupportsLinking(), SUPPORTSLINKING_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
