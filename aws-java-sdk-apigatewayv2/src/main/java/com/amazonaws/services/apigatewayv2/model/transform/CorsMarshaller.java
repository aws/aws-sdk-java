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
package com.amazonaws.services.apigatewayv2.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.apigatewayv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CorsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CorsMarshaller {

    private static final MarshallingInfo<Boolean> ALLOWCREDENTIALS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("allowCredentials").build();
    private static final MarshallingInfo<List> ALLOWHEADERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("allowHeaders").build();
    private static final MarshallingInfo<List> ALLOWMETHODS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("allowMethods").build();
    private static final MarshallingInfo<List> ALLOWORIGINS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("allowOrigins").build();
    private static final MarshallingInfo<List> EXPOSEHEADERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("exposeHeaders").build();
    private static final MarshallingInfo<Integer> MAXAGE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("maxAge").build();

    private static final CorsMarshaller instance = new CorsMarshaller();

    public static CorsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Cors cors, ProtocolMarshaller protocolMarshaller) {

        if (cors == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(cors.getAllowCredentials(), ALLOWCREDENTIALS_BINDING);
            protocolMarshaller.marshall(cors.getAllowHeaders(), ALLOWHEADERS_BINDING);
            protocolMarshaller.marshall(cors.getAllowMethods(), ALLOWMETHODS_BINDING);
            protocolMarshaller.marshall(cors.getAllowOrigins(), ALLOWORIGINS_BINDING);
            protocolMarshaller.marshall(cors.getExposeHeaders(), EXPOSEHEADERS_BINDING);
            protocolMarshaller.marshall(cors.getMaxAge(), MAXAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
