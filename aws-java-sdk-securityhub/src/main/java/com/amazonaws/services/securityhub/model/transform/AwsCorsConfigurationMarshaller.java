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
package com.amazonaws.services.securityhub.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsCorsConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsCorsConfigurationMarshaller {

    private static final MarshallingInfo<List> ALLOWORIGINS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AllowOrigins").build();
    private static final MarshallingInfo<Boolean> ALLOWCREDENTIALS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AllowCredentials").build();
    private static final MarshallingInfo<List> EXPOSEHEADERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ExposeHeaders").build();
    private static final MarshallingInfo<Integer> MAXAGE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MaxAge").build();
    private static final MarshallingInfo<List> ALLOWMETHODS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AllowMethods").build();
    private static final MarshallingInfo<List> ALLOWHEADERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AllowHeaders").build();

    private static final AwsCorsConfigurationMarshaller instance = new AwsCorsConfigurationMarshaller();

    public static AwsCorsConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsCorsConfiguration awsCorsConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (awsCorsConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsCorsConfiguration.getAllowOrigins(), ALLOWORIGINS_BINDING);
            protocolMarshaller.marshall(awsCorsConfiguration.getAllowCredentials(), ALLOWCREDENTIALS_BINDING);
            protocolMarshaller.marshall(awsCorsConfiguration.getExposeHeaders(), EXPOSEHEADERS_BINDING);
            protocolMarshaller.marshall(awsCorsConfiguration.getMaxAge(), MAXAGE_BINDING);
            protocolMarshaller.marshall(awsCorsConfiguration.getAllowMethods(), ALLOWMETHODS_BINDING);
            protocolMarshaller.marshall(awsCorsConfiguration.getAllowHeaders(), ALLOWHEADERS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
