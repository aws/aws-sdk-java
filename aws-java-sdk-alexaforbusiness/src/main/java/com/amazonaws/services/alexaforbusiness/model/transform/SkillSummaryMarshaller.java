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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.alexaforbusiness.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SkillSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SkillSummaryMarshaller {

    private static final MarshallingInfo<String> SKILLID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SkillId").build();
    private static final MarshallingInfo<String> SKILLNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SkillName").build();
    private static final MarshallingInfo<Boolean> SUPPORTSLINKING_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SupportsLinking").build();
    private static final MarshallingInfo<String> ENABLEMENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnablementType").build();
    private static final MarshallingInfo<String> SKILLTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SkillType").build();

    private static final SkillSummaryMarshaller instance = new SkillSummaryMarshaller();

    public static SkillSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SkillSummary skillSummary, ProtocolMarshaller protocolMarshaller) {

        if (skillSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(skillSummary.getSkillId(), SKILLID_BINDING);
            protocolMarshaller.marshall(skillSummary.getSkillName(), SKILLNAME_BINDING);
            protocolMarshaller.marshall(skillSummary.getSupportsLinking(), SUPPORTSLINKING_BINDING);
            protocolMarshaller.marshall(skillSummary.getEnablementType(), ENABLEMENTTYPE_BINDING);
            protocolMarshaller.marshall(skillSummary.getSkillType(), SKILLTYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
