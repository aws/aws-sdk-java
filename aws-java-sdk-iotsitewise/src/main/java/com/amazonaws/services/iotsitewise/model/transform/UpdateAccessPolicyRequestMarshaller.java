/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotsitewise.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotsitewise.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateAccessPolicyRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateAccessPolicyRequestMarshaller {

    private static final MarshallingInfo<String> ACCESSPOLICYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("accessPolicyId").build();
    private static final MarshallingInfo<StructuredPojo> ACCESSPOLICYIDENTITY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("accessPolicyIdentity").build();
    private static final MarshallingInfo<StructuredPojo> ACCESSPOLICYRESOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("accessPolicyResource").build();
    private static final MarshallingInfo<String> ACCESSPOLICYPERMISSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("accessPolicyPermission").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();

    private static final UpdateAccessPolicyRequestMarshaller instance = new UpdateAccessPolicyRequestMarshaller();

    public static UpdateAccessPolicyRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateAccessPolicyRequest updateAccessPolicyRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateAccessPolicyRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateAccessPolicyRequest.getAccessPolicyId(), ACCESSPOLICYID_BINDING);
            protocolMarshaller.marshall(updateAccessPolicyRequest.getAccessPolicyIdentity(), ACCESSPOLICYIDENTITY_BINDING);
            protocolMarshaller.marshall(updateAccessPolicyRequest.getAccessPolicyResource(), ACCESSPOLICYRESOURCE_BINDING);
            protocolMarshaller.marshall(updateAccessPolicyRequest.getAccessPolicyPermission(), ACCESSPOLICYPERMISSION_BINDING);
            protocolMarshaller.marshall(updateAccessPolicyRequest.getClientToken(), CLIENTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
