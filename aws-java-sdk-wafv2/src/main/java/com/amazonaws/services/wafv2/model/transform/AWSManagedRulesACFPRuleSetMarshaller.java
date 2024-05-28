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
package com.amazonaws.services.wafv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.wafv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AWSManagedRulesACFPRuleSetMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AWSManagedRulesACFPRuleSetMarshaller {

    private static final MarshallingInfo<String> CREATIONPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationPath").build();
    private static final MarshallingInfo<String> REGISTRATIONPAGEPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RegistrationPagePath").build();
    private static final MarshallingInfo<StructuredPojo> REQUESTINSPECTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RequestInspection").build();
    private static final MarshallingInfo<StructuredPojo> RESPONSEINSPECTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResponseInspection").build();
    private static final MarshallingInfo<Boolean> ENABLEREGEXINPATH_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnableRegexInPath").build();

    private static final AWSManagedRulesACFPRuleSetMarshaller instance = new AWSManagedRulesACFPRuleSetMarshaller();

    public static AWSManagedRulesACFPRuleSetMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AWSManagedRulesACFPRuleSet aWSManagedRulesACFPRuleSet, ProtocolMarshaller protocolMarshaller) {

        if (aWSManagedRulesACFPRuleSet == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(aWSManagedRulesACFPRuleSet.getCreationPath(), CREATIONPATH_BINDING);
            protocolMarshaller.marshall(aWSManagedRulesACFPRuleSet.getRegistrationPagePath(), REGISTRATIONPAGEPATH_BINDING);
            protocolMarshaller.marshall(aWSManagedRulesACFPRuleSet.getRequestInspection(), REQUESTINSPECTION_BINDING);
            protocolMarshaller.marshall(aWSManagedRulesACFPRuleSet.getResponseInspection(), RESPONSEINSPECTION_BINDING);
            protocolMarshaller.marshall(aWSManagedRulesACFPRuleSet.getEnableRegexInPath(), ENABLEREGEXINPATH_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
