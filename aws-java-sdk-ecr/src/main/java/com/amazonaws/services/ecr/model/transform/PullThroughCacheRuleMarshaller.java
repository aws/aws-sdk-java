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
 * PullThroughCacheRuleMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PullThroughCacheRuleMarshaller {

    private static final MarshallingInfo<String> ECRREPOSITORYPREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ecrRepositoryPrefix").build();
    private static final MarshallingInfo<String> UPSTREAMREGISTRYURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("upstreamRegistryUrl").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> REGISTRYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("registryId").build();

    private static final PullThroughCacheRuleMarshaller instance = new PullThroughCacheRuleMarshaller();

    public static PullThroughCacheRuleMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PullThroughCacheRule pullThroughCacheRule, ProtocolMarshaller protocolMarshaller) {

        if (pullThroughCacheRule == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(pullThroughCacheRule.getEcrRepositoryPrefix(), ECRREPOSITORYPREFIX_BINDING);
            protocolMarshaller.marshall(pullThroughCacheRule.getUpstreamRegistryUrl(), UPSTREAMREGISTRYURL_BINDING);
            protocolMarshaller.marshall(pullThroughCacheRule.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(pullThroughCacheRule.getRegistryId(), REGISTRYID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
