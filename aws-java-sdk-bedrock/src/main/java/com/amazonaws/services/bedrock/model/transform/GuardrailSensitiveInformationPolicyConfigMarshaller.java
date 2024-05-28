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
package com.amazonaws.services.bedrock.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.bedrock.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GuardrailSensitiveInformationPolicyConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GuardrailSensitiveInformationPolicyConfigMarshaller {

    private static final MarshallingInfo<List> PIIENTITIESCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("piiEntitiesConfig").build();
    private static final MarshallingInfo<List> REGEXESCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("regexesConfig").build();

    private static final GuardrailSensitiveInformationPolicyConfigMarshaller instance = new GuardrailSensitiveInformationPolicyConfigMarshaller();

    public static GuardrailSensitiveInformationPolicyConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GuardrailSensitiveInformationPolicyConfig guardrailSensitiveInformationPolicyConfig, ProtocolMarshaller protocolMarshaller) {

        if (guardrailSensitiveInformationPolicyConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(guardrailSensitiveInformationPolicyConfig.getPiiEntitiesConfig(), PIIENTITIESCONFIG_BINDING);
            protocolMarshaller.marshall(guardrailSensitiveInformationPolicyConfig.getRegexesConfig(), REGEXESCONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
