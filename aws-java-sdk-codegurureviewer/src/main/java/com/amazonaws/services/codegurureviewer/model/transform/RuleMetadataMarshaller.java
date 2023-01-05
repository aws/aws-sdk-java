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
package com.amazonaws.services.codegurureviewer.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codegurureviewer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RuleMetadataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RuleMetadataMarshaller {

    private static final MarshallingInfo<String> RULEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RuleId").build();
    private static final MarshallingInfo<String> RULENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RuleName").build();
    private static final MarshallingInfo<String> SHORTDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ShortDescription").build();
    private static final MarshallingInfo<String> LONGDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LongDescription").build();
    private static final MarshallingInfo<List> RULETAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RuleTags").build();

    private static final RuleMetadataMarshaller instance = new RuleMetadataMarshaller();

    public static RuleMetadataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RuleMetadata ruleMetadata, ProtocolMarshaller protocolMarshaller) {

        if (ruleMetadata == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(ruleMetadata.getRuleId(), RULEID_BINDING);
            protocolMarshaller.marshall(ruleMetadata.getRuleName(), RULENAME_BINDING);
            protocolMarshaller.marshall(ruleMetadata.getShortDescription(), SHORTDESCRIPTION_BINDING);
            protocolMarshaller.marshall(ruleMetadata.getLongDescription(), LONGDESCRIPTION_BINDING);
            protocolMarshaller.marshall(ruleMetadata.getRuleTags(), RULETAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
