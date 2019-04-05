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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.config.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AggregateComplianceByConfigRuleMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AggregateComplianceByConfigRuleMarshaller {

    private static final MarshallingInfo<String> CONFIGRULENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConfigRuleName").build();
    private static final MarshallingInfo<StructuredPojo> COMPLIANCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Compliance").build();
    private static final MarshallingInfo<String> ACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AccountId").build();
    private static final MarshallingInfo<String> AWSREGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AwsRegion").build();

    private static final AggregateComplianceByConfigRuleMarshaller instance = new AggregateComplianceByConfigRuleMarshaller();

    public static AggregateComplianceByConfigRuleMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AggregateComplianceByConfigRule aggregateComplianceByConfigRule, ProtocolMarshaller protocolMarshaller) {

        if (aggregateComplianceByConfigRule == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(aggregateComplianceByConfigRule.getConfigRuleName(), CONFIGRULENAME_BINDING);
            protocolMarshaller.marshall(aggregateComplianceByConfigRule.getCompliance(), COMPLIANCE_BINDING);
            protocolMarshaller.marshall(aggregateComplianceByConfigRule.getAccountId(), ACCOUNTID_BINDING);
            protocolMarshaller.marshall(aggregateComplianceByConfigRule.getAwsRegion(), AWSREGION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
