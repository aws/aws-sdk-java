/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.accessanalyzer.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.accessanalyzer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ValidatePolicyFindingMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ValidatePolicyFindingMarshaller {

    private static final MarshallingInfo<String> FINDINGDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("findingDetails").build();
    private static final MarshallingInfo<String> FINDINGTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("findingType").build();
    private static final MarshallingInfo<String> ISSUECODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("issueCode").build();
    private static final MarshallingInfo<String> LEARNMORELINK_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("learnMoreLink").build();
    private static final MarshallingInfo<List> LOCATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("locations").build();

    private static final ValidatePolicyFindingMarshaller instance = new ValidatePolicyFindingMarshaller();

    public static ValidatePolicyFindingMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ValidatePolicyFinding validatePolicyFinding, ProtocolMarshaller protocolMarshaller) {

        if (validatePolicyFinding == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(validatePolicyFinding.getFindingDetails(), FINDINGDETAILS_BINDING);
            protocolMarshaller.marshall(validatePolicyFinding.getFindingType(), FINDINGTYPE_BINDING);
            protocolMarshaller.marshall(validatePolicyFinding.getIssueCode(), ISSUECODE_BINDING);
            protocolMarshaller.marshall(validatePolicyFinding.getLearnMoreLink(), LEARNMORELINK_BINDING);
            protocolMarshaller.marshall(validatePolicyFinding.getLocations(), LOCATIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
