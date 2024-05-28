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
package com.amazonaws.services.cleanroomsml.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cleanroomsml.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PutConfiguredAudienceModelPolicyRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PutConfiguredAudienceModelPolicyRequestMarshaller {

    private static final MarshallingInfo<String> CONFIGUREDAUDIENCEMODELARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("configuredAudienceModelArn").build();
    private static final MarshallingInfo<String> CONFIGUREDAUDIENCEMODELPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("configuredAudienceModelPolicy").build();
    private static final MarshallingInfo<String> POLICYEXISTENCECONDITION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("policyExistenceCondition").build();
    private static final MarshallingInfo<String> PREVIOUSPOLICYHASH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("previousPolicyHash").build();

    private static final PutConfiguredAudienceModelPolicyRequestMarshaller instance = new PutConfiguredAudienceModelPolicyRequestMarshaller();

    public static PutConfiguredAudienceModelPolicyRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PutConfiguredAudienceModelPolicyRequest putConfiguredAudienceModelPolicyRequest, ProtocolMarshaller protocolMarshaller) {

        if (putConfiguredAudienceModelPolicyRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(putConfiguredAudienceModelPolicyRequest.getConfiguredAudienceModelArn(), CONFIGUREDAUDIENCEMODELARN_BINDING);
            protocolMarshaller.marshall(putConfiguredAudienceModelPolicyRequest.getConfiguredAudienceModelPolicy(), CONFIGUREDAUDIENCEMODELPOLICY_BINDING);
            protocolMarshaller.marshall(putConfiguredAudienceModelPolicyRequest.getPolicyExistenceCondition(), POLICYEXISTENCECONDITION_BINDING);
            protocolMarshaller.marshall(putConfiguredAudienceModelPolicyRequest.getPreviousPolicyHash(), PREVIOUSPOLICYHASH_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
