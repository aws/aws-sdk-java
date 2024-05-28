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
package com.amazonaws.services.mailmanager.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mailmanager.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PolicyConditionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PolicyConditionMarshaller {

    private static final MarshallingInfo<StructuredPojo> BOOLEANEXPRESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BooleanExpression").build();
    private static final MarshallingInfo<StructuredPojo> IPEXPRESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IpExpression").build();
    private static final MarshallingInfo<StructuredPojo> STRINGEXPRESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StringExpression").build();
    private static final MarshallingInfo<StructuredPojo> TLSEXPRESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TlsExpression").build();

    private static final PolicyConditionMarshaller instance = new PolicyConditionMarshaller();

    public static PolicyConditionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PolicyCondition policyCondition, ProtocolMarshaller protocolMarshaller) {

        if (policyCondition == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(policyCondition.getBooleanExpression(), BOOLEANEXPRESSION_BINDING);
            protocolMarshaller.marshall(policyCondition.getIpExpression(), IPEXPRESSION_BINDING);
            protocolMarshaller.marshall(policyCondition.getStringExpression(), STRINGEXPRESSION_BINDING);
            protocolMarshaller.marshall(policyCondition.getTlsExpression(), TLSEXPRESSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
