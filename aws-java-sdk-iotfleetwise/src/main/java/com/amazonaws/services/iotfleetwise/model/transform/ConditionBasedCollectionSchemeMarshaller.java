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
package com.amazonaws.services.iotfleetwise.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotfleetwise.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ConditionBasedCollectionSchemeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConditionBasedCollectionSchemeMarshaller {

    private static final MarshallingInfo<String> EXPRESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("expression").build();
    private static final MarshallingInfo<Long> MINIMUMTRIGGERINTERVALMS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("minimumTriggerIntervalMs").build();
    private static final MarshallingInfo<String> TRIGGERMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("triggerMode").build();
    private static final MarshallingInfo<Integer> CONDITIONLANGUAGEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("conditionLanguageVersion").build();

    private static final ConditionBasedCollectionSchemeMarshaller instance = new ConditionBasedCollectionSchemeMarshaller();

    public static ConditionBasedCollectionSchemeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ConditionBasedCollectionScheme conditionBasedCollectionScheme, ProtocolMarshaller protocolMarshaller) {

        if (conditionBasedCollectionScheme == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(conditionBasedCollectionScheme.getExpression(), EXPRESSION_BINDING);
            protocolMarshaller.marshall(conditionBasedCollectionScheme.getMinimumTriggerIntervalMs(), MINIMUMTRIGGERINTERVALMS_BINDING);
            protocolMarshaller.marshall(conditionBasedCollectionScheme.getTriggerMode(), TRIGGERMODE_BINDING);
            protocolMarshaller.marshall(conditionBasedCollectionScheme.getConditionLanguageVersion(), CONDITIONLANGUAGEVERSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
