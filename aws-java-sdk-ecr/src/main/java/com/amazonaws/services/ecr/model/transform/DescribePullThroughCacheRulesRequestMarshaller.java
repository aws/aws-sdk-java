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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ecr.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DescribePullThroughCacheRulesRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DescribePullThroughCacheRulesRequestMarshaller {

    private static final MarshallingInfo<String> REGISTRYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("registryId").build();
    private static final MarshallingInfo<List> ECRREPOSITORYPREFIXES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ecrRepositoryPrefixes").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("nextToken").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxResults").build();

    private static final DescribePullThroughCacheRulesRequestMarshaller instance = new DescribePullThroughCacheRulesRequestMarshaller();

    public static DescribePullThroughCacheRulesRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DescribePullThroughCacheRulesRequest describePullThroughCacheRulesRequest, ProtocolMarshaller protocolMarshaller) {

        if (describePullThroughCacheRulesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(describePullThroughCacheRulesRequest.getRegistryId(), REGISTRYID_BINDING);
            protocolMarshaller.marshall(describePullThroughCacheRulesRequest.getEcrRepositoryPrefixes(), ECRREPOSITORYPREFIXES_BINDING);
            protocolMarshaller.marshall(describePullThroughCacheRulesRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(describePullThroughCacheRulesRequest.getMaxResults(), MAXRESULTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
