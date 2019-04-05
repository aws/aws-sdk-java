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
package com.amazonaws.services.cognitoidp.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cognitoidp.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PasswordPolicyTypeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PasswordPolicyTypeMarshaller {

    private static final MarshallingInfo<Integer> MINIMUMLENGTH_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MinimumLength").build();
    private static final MarshallingInfo<Boolean> REQUIREUPPERCASE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RequireUppercase").build();
    private static final MarshallingInfo<Boolean> REQUIRELOWERCASE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RequireLowercase").build();
    private static final MarshallingInfo<Boolean> REQUIRENUMBERS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RequireNumbers").build();
    private static final MarshallingInfo<Boolean> REQUIRESYMBOLS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RequireSymbols").build();

    private static final PasswordPolicyTypeMarshaller instance = new PasswordPolicyTypeMarshaller();

    public static PasswordPolicyTypeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PasswordPolicyType passwordPolicyType, ProtocolMarshaller protocolMarshaller) {

        if (passwordPolicyType == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(passwordPolicyType.getMinimumLength(), MINIMUMLENGTH_BINDING);
            protocolMarshaller.marshall(passwordPolicyType.getRequireUppercase(), REQUIREUPPERCASE_BINDING);
            protocolMarshaller.marshall(passwordPolicyType.getRequireLowercase(), REQUIRELOWERCASE_BINDING);
            protocolMarshaller.marshall(passwordPolicyType.getRequireNumbers(), REQUIRENUMBERS_BINDING);
            protocolMarshaller.marshall(passwordPolicyType.getRequireSymbols(), REQUIRESYMBOLS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
