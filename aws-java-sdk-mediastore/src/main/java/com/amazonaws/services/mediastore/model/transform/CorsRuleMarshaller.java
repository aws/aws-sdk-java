/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediastore.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediastore.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CorsRuleMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CorsRuleMarshaller {

    private static final MarshallingInfo<List> ALLOWEDORIGINS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AllowedOrigins").build();
    private static final MarshallingInfo<List> ALLOWEDMETHODS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AllowedMethods").build();
    private static final MarshallingInfo<List> ALLOWEDHEADERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AllowedHeaders").build();
    private static final MarshallingInfo<Integer> MAXAGESECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxAgeSeconds").build();
    private static final MarshallingInfo<List> EXPOSEHEADERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ExposeHeaders").build();

    private static final CorsRuleMarshaller instance = new CorsRuleMarshaller();

    public static CorsRuleMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CorsRule corsRule, ProtocolMarshaller protocolMarshaller) {

        if (corsRule == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(corsRule.getAllowedOrigins(), ALLOWEDORIGINS_BINDING);
            protocolMarshaller.marshall(corsRule.getAllowedMethods(), ALLOWEDMETHODS_BINDING);
            protocolMarshaller.marshall(corsRule.getAllowedHeaders(), ALLOWEDHEADERS_BINDING);
            protocolMarshaller.marshall(corsRule.getMaxAgeSeconds(), MAXAGESECONDS_BINDING);
            protocolMarshaller.marshall(corsRule.getExposeHeaders(), EXPOSEHEADERS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
