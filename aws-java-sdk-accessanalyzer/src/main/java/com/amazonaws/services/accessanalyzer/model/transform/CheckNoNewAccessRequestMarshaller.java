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
package com.amazonaws.services.accessanalyzer.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.accessanalyzer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CheckNoNewAccessRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CheckNoNewAccessRequestMarshaller {

    private static final MarshallingInfo<String> NEWPOLICYDOCUMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("newPolicyDocument").build();
    private static final MarshallingInfo<String> EXISTINGPOLICYDOCUMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("existingPolicyDocument").build();
    private static final MarshallingInfo<String> POLICYTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("policyType").build();

    private static final CheckNoNewAccessRequestMarshaller instance = new CheckNoNewAccessRequestMarshaller();

    public static CheckNoNewAccessRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CheckNoNewAccessRequest checkNoNewAccessRequest, ProtocolMarshaller protocolMarshaller) {

        if (checkNoNewAccessRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(checkNoNewAccessRequest.getNewPolicyDocument(), NEWPOLICYDOCUMENT_BINDING);
            protocolMarshaller.marshall(checkNoNewAccessRequest.getExistingPolicyDocument(), EXISTINGPOLICYDOCUMENT_BINDING);
            protocolMarshaller.marshall(checkNoNewAccessRequest.getPolicyType(), POLICYTYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
