/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appsync.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appsync.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ApiCacheMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ApiCacheMarshaller {

    private static final MarshallingInfo<Long> TTL_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ttl").build();
    private static final MarshallingInfo<String> APICACHINGBEHAVIOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("apiCachingBehavior").build();
    private static final MarshallingInfo<Boolean> TRANSITENCRYPTIONENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("transitEncryptionEnabled").build();
    private static final MarshallingInfo<Boolean> ATRESTENCRYPTIONENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("atRestEncryptionEnabled").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("type").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();

    private static final ApiCacheMarshaller instance = new ApiCacheMarshaller();

    public static ApiCacheMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ApiCache apiCache, ProtocolMarshaller protocolMarshaller) {

        if (apiCache == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(apiCache.getTtl(), TTL_BINDING);
            protocolMarshaller.marshall(apiCache.getApiCachingBehavior(), APICACHINGBEHAVIOR_BINDING);
            protocolMarshaller.marshall(apiCache.getTransitEncryptionEnabled(), TRANSITENCRYPTIONENABLED_BINDING);
            protocolMarshaller.marshall(apiCache.getAtRestEncryptionEnabled(), ATRESTENCRYPTIONENABLED_BINDING);
            protocolMarshaller.marshall(apiCache.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(apiCache.getStatus(), STATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
