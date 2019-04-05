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
package com.amazonaws.services.apigateway.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.apigateway.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MethodSettingMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MethodSettingMarshaller {

    private static final MarshallingInfo<Boolean> METRICSENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("metricsEnabled").build();
    private static final MarshallingInfo<String> LOGGINGLEVEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("loggingLevel").build();
    private static final MarshallingInfo<Boolean> DATATRACEENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dataTraceEnabled").build();
    private static final MarshallingInfo<Integer> THROTTLINGBURSTLIMIT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("throttlingBurstLimit").build();
    private static final MarshallingInfo<Double> THROTTLINGRATELIMIT_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("throttlingRateLimit").build();
    private static final MarshallingInfo<Boolean> CACHINGENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cachingEnabled").build();
    private static final MarshallingInfo<Integer> CACHETTLINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cacheTtlInSeconds").build();
    private static final MarshallingInfo<Boolean> CACHEDATAENCRYPTED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cacheDataEncrypted").build();
    private static final MarshallingInfo<Boolean> REQUIREAUTHORIZATIONFORCACHECONTROL_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("requireAuthorizationForCacheControl").build();
    private static final MarshallingInfo<String> UNAUTHORIZEDCACHECONTROLHEADERSTRATEGY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("unauthorizedCacheControlHeaderStrategy").build();

    private static final MethodSettingMarshaller instance = new MethodSettingMarshaller();

    public static MethodSettingMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MethodSetting methodSetting, ProtocolMarshaller protocolMarshaller) {

        if (methodSetting == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(methodSetting.getMetricsEnabled(), METRICSENABLED_BINDING);
            protocolMarshaller.marshall(methodSetting.getLoggingLevel(), LOGGINGLEVEL_BINDING);
            protocolMarshaller.marshall(methodSetting.getDataTraceEnabled(), DATATRACEENABLED_BINDING);
            protocolMarshaller.marshall(methodSetting.getThrottlingBurstLimit(), THROTTLINGBURSTLIMIT_BINDING);
            protocolMarshaller.marshall(methodSetting.getThrottlingRateLimit(), THROTTLINGRATELIMIT_BINDING);
            protocolMarshaller.marshall(methodSetting.getCachingEnabled(), CACHINGENABLED_BINDING);
            protocolMarshaller.marshall(methodSetting.getCacheTtlInSeconds(), CACHETTLINSECONDS_BINDING);
            protocolMarshaller.marshall(methodSetting.getCacheDataEncrypted(), CACHEDATAENCRYPTED_BINDING);
            protocolMarshaller.marshall(methodSetting.getRequireAuthorizationForCacheControl(), REQUIREAUTHORIZATIONFORCACHECONTROL_BINDING);
            protocolMarshaller.marshall(methodSetting.getUnauthorizedCacheControlHeaderStrategy(), UNAUTHORIZEDCACHECONTROLHEADERSTRATEGY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
