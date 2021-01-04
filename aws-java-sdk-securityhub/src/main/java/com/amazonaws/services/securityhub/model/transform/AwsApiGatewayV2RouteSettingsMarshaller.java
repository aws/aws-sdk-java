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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsApiGatewayV2RouteSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsApiGatewayV2RouteSettingsMarshaller {

    private static final MarshallingInfo<Boolean> DETAILEDMETRICSENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DetailedMetricsEnabled").build();
    private static final MarshallingInfo<String> LOGGINGLEVEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LoggingLevel").build();
    private static final MarshallingInfo<Boolean> DATATRACEENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataTraceEnabled").build();
    private static final MarshallingInfo<Integer> THROTTLINGBURSTLIMIT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ThrottlingBurstLimit").build();
    private static final MarshallingInfo<Double> THROTTLINGRATELIMIT_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ThrottlingRateLimit").build();

    private static final AwsApiGatewayV2RouteSettingsMarshaller instance = new AwsApiGatewayV2RouteSettingsMarshaller();

    public static AwsApiGatewayV2RouteSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsApiGatewayV2RouteSettings awsApiGatewayV2RouteSettings, ProtocolMarshaller protocolMarshaller) {

        if (awsApiGatewayV2RouteSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsApiGatewayV2RouteSettings.getDetailedMetricsEnabled(), DETAILEDMETRICSENABLED_BINDING);
            protocolMarshaller.marshall(awsApiGatewayV2RouteSettings.getLoggingLevel(), LOGGINGLEVEL_BINDING);
            protocolMarshaller.marshall(awsApiGatewayV2RouteSettings.getDataTraceEnabled(), DATATRACEENABLED_BINDING);
            protocolMarshaller.marshall(awsApiGatewayV2RouteSettings.getThrottlingBurstLimit(), THROTTLINGBURSTLIMIT_BINDING);
            protocolMarshaller.marshall(awsApiGatewayV2RouteSettings.getThrottlingRateLimit(), THROTTLINGRATELIMIT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
