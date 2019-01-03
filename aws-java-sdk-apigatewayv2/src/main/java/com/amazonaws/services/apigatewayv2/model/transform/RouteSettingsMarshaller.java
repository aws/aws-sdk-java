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
package com.amazonaws.services.apigatewayv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.apigatewayv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RouteSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RouteSettingsMarshaller {

    private static final MarshallingInfo<Boolean> DATATRACEENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dataTraceEnabled").build();
    private static final MarshallingInfo<Boolean> DETAILEDMETRICSENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("detailedMetricsEnabled").build();
    private static final MarshallingInfo<String> LOGGINGLEVEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("loggingLevel").build();
    private static final MarshallingInfo<Integer> THROTTLINGBURSTLIMIT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("throttlingBurstLimit").build();
    private static final MarshallingInfo<Double> THROTTLINGRATELIMIT_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("throttlingRateLimit").build();

    private static final RouteSettingsMarshaller instance = new RouteSettingsMarshaller();

    public static RouteSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RouteSettings routeSettings, ProtocolMarshaller protocolMarshaller) {

        if (routeSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(routeSettings.getDataTraceEnabled(), DATATRACEENABLED_BINDING);
            protocolMarshaller.marshall(routeSettings.getDetailedMetricsEnabled(), DETAILEDMETRICSENABLED_BINDING);
            protocolMarshaller.marshall(routeSettings.getLoggingLevel(), LOGGINGLEVEL_BINDING);
            protocolMarshaller.marshall(routeSettings.getThrottlingBurstLimit(), THROTTLINGBURSTLIMIT_BINDING);
            protocolMarshaller.marshall(routeSettings.getThrottlingRateLimit(), THROTTLINGRATELIMIT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
