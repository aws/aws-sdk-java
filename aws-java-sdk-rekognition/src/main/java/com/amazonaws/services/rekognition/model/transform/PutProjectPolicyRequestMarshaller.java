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
package com.amazonaws.services.rekognition.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.rekognition.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PutProjectPolicyRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PutProjectPolicyRequestMarshaller {

    private static final MarshallingInfo<String> PROJECTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProjectArn").build();
    private static final MarshallingInfo<String> POLICYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PolicyName").build();
    private static final MarshallingInfo<String> POLICYREVISIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PolicyRevisionId").build();
    private static final MarshallingInfo<String> POLICYDOCUMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PolicyDocument").build();

    private static final PutProjectPolicyRequestMarshaller instance = new PutProjectPolicyRequestMarshaller();

    public static PutProjectPolicyRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PutProjectPolicyRequest putProjectPolicyRequest, ProtocolMarshaller protocolMarshaller) {

        if (putProjectPolicyRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(putProjectPolicyRequest.getProjectArn(), PROJECTARN_BINDING);
            protocolMarshaller.marshall(putProjectPolicyRequest.getPolicyName(), POLICYNAME_BINDING);
            protocolMarshaller.marshall(putProjectPolicyRequest.getPolicyRevisionId(), POLICYREVISIONID_BINDING);
            protocolMarshaller.marshall(putProjectPolicyRequest.getPolicyDocument(), POLICYDOCUMENT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
