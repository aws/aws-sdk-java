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
package com.amazonaws.services.ecr.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ecr.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreatePullThroughCacheRuleRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreatePullThroughCacheRuleRequestMarshaller {

    private static final MarshallingInfo<String> ECRREPOSITORYPREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ecrRepositoryPrefix").build();
    private static final MarshallingInfo<String> UPSTREAMREGISTRYURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("upstreamRegistryUrl").build();
    private static final MarshallingInfo<String> REGISTRYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("registryId").build();

    private static final CreatePullThroughCacheRuleRequestMarshaller instance = new CreatePullThroughCacheRuleRequestMarshaller();

    public static CreatePullThroughCacheRuleRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreatePullThroughCacheRuleRequest createPullThroughCacheRuleRequest, ProtocolMarshaller protocolMarshaller) {

        if (createPullThroughCacheRuleRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createPullThroughCacheRuleRequest.getEcrRepositoryPrefix(), ECRREPOSITORYPREFIX_BINDING);
            protocolMarshaller.marshall(createPullThroughCacheRuleRequest.getUpstreamRegistryUrl(), UPSTREAMREGISTRYURL_BINDING);
            protocolMarshaller.marshall(createPullThroughCacheRuleRequest.getRegistryId(), REGISTRYID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
