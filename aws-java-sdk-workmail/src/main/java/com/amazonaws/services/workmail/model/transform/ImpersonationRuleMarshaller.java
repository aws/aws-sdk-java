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
package com.amazonaws.services.workmail.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.workmail.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ImpersonationRuleMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ImpersonationRuleMarshaller {

    private static final MarshallingInfo<String> IMPERSONATIONRULEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ImpersonationRuleId").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> EFFECT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Effect").build();
    private static final MarshallingInfo<List> TARGETUSERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TargetUsers").build();
    private static final MarshallingInfo<List> NOTTARGETUSERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NotTargetUsers").build();

    private static final ImpersonationRuleMarshaller instance = new ImpersonationRuleMarshaller();

    public static ImpersonationRuleMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ImpersonationRule impersonationRule, ProtocolMarshaller protocolMarshaller) {

        if (impersonationRule == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(impersonationRule.getImpersonationRuleId(), IMPERSONATIONRULEID_BINDING);
            protocolMarshaller.marshall(impersonationRule.getName(), NAME_BINDING);
            protocolMarshaller.marshall(impersonationRule.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(impersonationRule.getEffect(), EFFECT_BINDING);
            protocolMarshaller.marshall(impersonationRule.getTargetUsers(), TARGETUSERS_BINDING);
            protocolMarshaller.marshall(impersonationRule.getNotTargetUsers(), NOTTARGETUSERS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
