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
package com.amazonaws.services.resiliencehub.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.resiliencehub.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateResiliencyPolicyRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateResiliencyPolicyRequestMarshaller {

    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<String> DATALOCATIONCONSTRAINT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dataLocationConstraint").build();
    private static final MarshallingInfo<Map> POLICY_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("policy").build();
    private static final MarshallingInfo<String> POLICYDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("policyDescription").build();
    private static final MarshallingInfo<String> POLICYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("policyName").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<String> TIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tier").build();

    private static final CreateResiliencyPolicyRequestMarshaller instance = new CreateResiliencyPolicyRequestMarshaller();

    public static CreateResiliencyPolicyRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateResiliencyPolicyRequest createResiliencyPolicyRequest, ProtocolMarshaller protocolMarshaller) {

        if (createResiliencyPolicyRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createResiliencyPolicyRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(createResiliencyPolicyRequest.getDataLocationConstraint(), DATALOCATIONCONSTRAINT_BINDING);
            protocolMarshaller.marshall(createResiliencyPolicyRequest.getPolicy(), POLICY_BINDING);
            protocolMarshaller.marshall(createResiliencyPolicyRequest.getPolicyDescription(), POLICYDESCRIPTION_BINDING);
            protocolMarshaller.marshall(createResiliencyPolicyRequest.getPolicyName(), POLICYNAME_BINDING);
            protocolMarshaller.marshall(createResiliencyPolicyRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createResiliencyPolicyRequest.getTier(), TIER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
