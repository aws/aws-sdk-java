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
package com.amazonaws.services.lightsail.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lightsail.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CacheSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CacheSettingsMarshaller {

    private static final MarshallingInfo<Long> DEFAULTTTL_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("defaultTTL").build();
    private static final MarshallingInfo<Long> MINIMUMTTL_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("minimumTTL").build();
    private static final MarshallingInfo<Long> MAXIMUMTTL_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("maximumTTL").build();
    private static final MarshallingInfo<String> ALLOWEDHTTPMETHODS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("allowedHTTPMethods").build();
    private static final MarshallingInfo<String> CACHEDHTTPMETHODS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cachedHTTPMethods").build();
    private static final MarshallingInfo<StructuredPojo> FORWARDEDCOOKIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("forwardedCookies").build();
    private static final MarshallingInfo<StructuredPojo> FORWARDEDHEADERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("forwardedHeaders").build();
    private static final MarshallingInfo<StructuredPojo> FORWARDEDQUERYSTRINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("forwardedQueryStrings").build();

    private static final CacheSettingsMarshaller instance = new CacheSettingsMarshaller();

    public static CacheSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CacheSettings cacheSettings, ProtocolMarshaller protocolMarshaller) {

        if (cacheSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(cacheSettings.getDefaultTTL(), DEFAULTTTL_BINDING);
            protocolMarshaller.marshall(cacheSettings.getMinimumTTL(), MINIMUMTTL_BINDING);
            protocolMarshaller.marshall(cacheSettings.getMaximumTTL(), MAXIMUMTTL_BINDING);
            protocolMarshaller.marshall(cacheSettings.getAllowedHTTPMethods(), ALLOWEDHTTPMETHODS_BINDING);
            protocolMarshaller.marshall(cacheSettings.getCachedHTTPMethods(), CACHEDHTTPMETHODS_BINDING);
            protocolMarshaller.marshall(cacheSettings.getForwardedCookies(), FORWARDEDCOOKIES_BINDING);
            protocolMarshaller.marshall(cacheSettings.getForwardedHeaders(), FORWARDEDHEADERS_BINDING);
            protocolMarshaller.marshall(cacheSettings.getForwardedQueryStrings(), FORWARDEDQUERYSTRINGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
