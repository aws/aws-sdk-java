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
package com.amazonaws.services.config.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.config.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetComplianceDetailsByConfigRuleRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetComplianceDetailsByConfigRuleRequestMarshaller {

    private static final MarshallingInfo<String> CONFIGRULENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConfigRuleName").build();
    private static final MarshallingInfo<List> COMPLIANCETYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ComplianceTypes").build();
    private static final MarshallingInfo<Integer> LIMIT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Limit").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NextToken").build();

    private static final GetComplianceDetailsByConfigRuleRequestMarshaller instance = new GetComplianceDetailsByConfigRuleRequestMarshaller();

    public static GetComplianceDetailsByConfigRuleRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetComplianceDetailsByConfigRuleRequest getComplianceDetailsByConfigRuleRequest, ProtocolMarshaller protocolMarshaller) {

        if (getComplianceDetailsByConfigRuleRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getComplianceDetailsByConfigRuleRequest.getConfigRuleName(), CONFIGRULENAME_BINDING);
            protocolMarshaller.marshall(getComplianceDetailsByConfigRuleRequest.getComplianceTypes(), COMPLIANCETYPES_BINDING);
            protocolMarshaller.marshall(getComplianceDetailsByConfigRuleRequest.getLimit(), LIMIT_BINDING);
            protocolMarshaller.marshall(getComplianceDetailsByConfigRuleRequest.getNextToken(), NEXTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
