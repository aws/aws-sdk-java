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
package com.amazonaws.services.wafv2.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.wafv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PutManagedRuleSetVersionsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PutManagedRuleSetVersionsRequestMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> SCOPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Scope").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<String> LOCKTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LockToken").build();
    private static final MarshallingInfo<String> RECOMMENDEDVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecommendedVersion").build();
    private static final MarshallingInfo<Map> VERSIONSTOPUBLISH_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VersionsToPublish").build();

    private static final PutManagedRuleSetVersionsRequestMarshaller instance = new PutManagedRuleSetVersionsRequestMarshaller();

    public static PutManagedRuleSetVersionsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PutManagedRuleSetVersionsRequest putManagedRuleSetVersionsRequest, ProtocolMarshaller protocolMarshaller) {

        if (putManagedRuleSetVersionsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(putManagedRuleSetVersionsRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(putManagedRuleSetVersionsRequest.getScope(), SCOPE_BINDING);
            protocolMarshaller.marshall(putManagedRuleSetVersionsRequest.getId(), ID_BINDING);
            protocolMarshaller.marshall(putManagedRuleSetVersionsRequest.getLockToken(), LOCKTOKEN_BINDING);
            protocolMarshaller.marshall(putManagedRuleSetVersionsRequest.getRecommendedVersion(), RECOMMENDEDVERSION_BINDING);
            protocolMarshaller.marshall(putManagedRuleSetVersionsRequest.getVersionsToPublish(), VERSIONSTOPUBLISH_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
