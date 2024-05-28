/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.customerprofiles.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.customerprofiles.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RuleBasedMatchingResponseMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RuleBasedMatchingResponseMarshaller {

    private static final MarshallingInfo<Boolean> ENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Enabled").build();
    private static final MarshallingInfo<List> MATCHINGRULES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MatchingRules").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<Integer> MAXALLOWEDRULELEVELFORMERGING_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxAllowedRuleLevelForMerging").build();
    private static final MarshallingInfo<Integer> MAXALLOWEDRULELEVELFORMATCHING_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxAllowedRuleLevelForMatching").build();
    private static final MarshallingInfo<StructuredPojo> ATTRIBUTETYPESSELECTOR_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AttributeTypesSelector").build();
    private static final MarshallingInfo<StructuredPojo> CONFLICTRESOLUTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConflictResolution").build();
    private static final MarshallingInfo<StructuredPojo> EXPORTINGCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExportingConfig").build();

    private static final RuleBasedMatchingResponseMarshaller instance = new RuleBasedMatchingResponseMarshaller();

    public static RuleBasedMatchingResponseMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RuleBasedMatchingResponse ruleBasedMatchingResponse, ProtocolMarshaller protocolMarshaller) {

        if (ruleBasedMatchingResponse == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(ruleBasedMatchingResponse.getEnabled(), ENABLED_BINDING);
            protocolMarshaller.marshall(ruleBasedMatchingResponse.getMatchingRules(), MATCHINGRULES_BINDING);
            protocolMarshaller.marshall(ruleBasedMatchingResponse.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(ruleBasedMatchingResponse.getMaxAllowedRuleLevelForMerging(), MAXALLOWEDRULELEVELFORMERGING_BINDING);
            protocolMarshaller.marshall(ruleBasedMatchingResponse.getMaxAllowedRuleLevelForMatching(), MAXALLOWEDRULELEVELFORMATCHING_BINDING);
            protocolMarshaller.marshall(ruleBasedMatchingResponse.getAttributeTypesSelector(), ATTRIBUTETYPESSELECTOR_BINDING);
            protocolMarshaller.marshall(ruleBasedMatchingResponse.getConflictResolution(), CONFLICTRESOLUTION_BINDING);
            protocolMarshaller.marshall(ruleBasedMatchingResponse.getExportingConfig(), EXPORTINGCONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
