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
 * AwsApiGatewayMethodSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsApiGatewayMethodSettingsMarshaller {

    private static final MarshallingInfo<Boolean> METRICSENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetricsEnabled").build();
    private static final MarshallingInfo<String> LOGGINGLEVEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LoggingLevel").build();
    private static final MarshallingInfo<Boolean> DATATRACEENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataTraceEnabled").build();
    private static final MarshallingInfo<Integer> THROTTLINGBURSTLIMIT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ThrottlingBurstLimit").build();
    private static final MarshallingInfo<Double> THROTTLINGRATELIMIT_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ThrottlingRateLimit").build();
    private static final MarshallingInfo<Boolean> CACHINGENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CachingEnabled").build();
    private static final MarshallingInfo<Integer> CACHETTLINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CacheTtlInSeconds").build();
    private static final MarshallingInfo<Boolean> CACHEDATAENCRYPTED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CacheDataEncrypted").build();
    private static final MarshallingInfo<Boolean> REQUIREAUTHORIZATIONFORCACHECONTROL_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RequireAuthorizationForCacheControl").build();
    private static final MarshallingInfo<String> UNAUTHORIZEDCACHECONTROLHEADERSTRATEGY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UnauthorizedCacheControlHeaderStrategy").build();
    private static final MarshallingInfo<String> HTTPMETHOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HttpMethod").build();
    private static final MarshallingInfo<String> RESOURCEPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourcePath").build();

    private static final AwsApiGatewayMethodSettingsMarshaller instance = new AwsApiGatewayMethodSettingsMarshaller();

    public static AwsApiGatewayMethodSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsApiGatewayMethodSettings awsApiGatewayMethodSettings, ProtocolMarshaller protocolMarshaller) {

        if (awsApiGatewayMethodSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsApiGatewayMethodSettings.getMetricsEnabled(), METRICSENABLED_BINDING);
            protocolMarshaller.marshall(awsApiGatewayMethodSettings.getLoggingLevel(), LOGGINGLEVEL_BINDING);
            protocolMarshaller.marshall(awsApiGatewayMethodSettings.getDataTraceEnabled(), DATATRACEENABLED_BINDING);
            protocolMarshaller.marshall(awsApiGatewayMethodSettings.getThrottlingBurstLimit(), THROTTLINGBURSTLIMIT_BINDING);
            protocolMarshaller.marshall(awsApiGatewayMethodSettings.getThrottlingRateLimit(), THROTTLINGRATELIMIT_BINDING);
            protocolMarshaller.marshall(awsApiGatewayMethodSettings.getCachingEnabled(), CACHINGENABLED_BINDING);
            protocolMarshaller.marshall(awsApiGatewayMethodSettings.getCacheTtlInSeconds(), CACHETTLINSECONDS_BINDING);
            protocolMarshaller.marshall(awsApiGatewayMethodSettings.getCacheDataEncrypted(), CACHEDATAENCRYPTED_BINDING);
            protocolMarshaller.marshall(awsApiGatewayMethodSettings.getRequireAuthorizationForCacheControl(), REQUIREAUTHORIZATIONFORCACHECONTROL_BINDING);
            protocolMarshaller
                    .marshall(awsApiGatewayMethodSettings.getUnauthorizedCacheControlHeaderStrategy(), UNAUTHORIZEDCACHECONTROLHEADERSTRATEGY_BINDING);
            protocolMarshaller.marshall(awsApiGatewayMethodSettings.getHttpMethod(), HTTPMETHOD_BINDING);
            protocolMarshaller.marshall(awsApiGatewayMethodSettings.getResourcePath(), RESOURCEPATH_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
