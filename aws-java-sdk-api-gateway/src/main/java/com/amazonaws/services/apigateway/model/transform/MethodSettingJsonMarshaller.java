/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * MethodSettingMarshaller
 */
public class MethodSettingJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(MethodSetting methodSetting, StructuredJsonGenerator jsonGenerator) {

        if (methodSetting == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (methodSetting.getMetricsEnabled() != null) {
                jsonGenerator.writeFieldName("metricsEnabled").writeValue(methodSetting.getMetricsEnabled());
            }
            if (methodSetting.getLoggingLevel() != null) {
                jsonGenerator.writeFieldName("loggingLevel").writeValue(methodSetting.getLoggingLevel());
            }
            if (methodSetting.getDataTraceEnabled() != null) {
                jsonGenerator.writeFieldName("dataTraceEnabled").writeValue(methodSetting.getDataTraceEnabled());
            }
            if (methodSetting.getThrottlingBurstLimit() != null) {
                jsonGenerator.writeFieldName("throttlingBurstLimit").writeValue(methodSetting.getThrottlingBurstLimit());
            }
            if (methodSetting.getThrottlingRateLimit() != null) {
                jsonGenerator.writeFieldName("throttlingRateLimit").writeValue(methodSetting.getThrottlingRateLimit());
            }
            if (methodSetting.getCachingEnabled() != null) {
                jsonGenerator.writeFieldName("cachingEnabled").writeValue(methodSetting.getCachingEnabled());
            }
            if (methodSetting.getCacheTtlInSeconds() != null) {
                jsonGenerator.writeFieldName("cacheTtlInSeconds").writeValue(methodSetting.getCacheTtlInSeconds());
            }
            if (methodSetting.getCacheDataEncrypted() != null) {
                jsonGenerator.writeFieldName("cacheDataEncrypted").writeValue(methodSetting.getCacheDataEncrypted());
            }
            if (methodSetting.getRequireAuthorizationForCacheControl() != null) {
                jsonGenerator.writeFieldName("requireAuthorizationForCacheControl").writeValue(methodSetting.getRequireAuthorizationForCacheControl());
            }
            if (methodSetting.getUnauthorizedCacheControlHeaderStrategy() != null) {
                jsonGenerator.writeFieldName("unauthorizedCacheControlHeaderStrategy").writeValue(methodSetting.getUnauthorizedCacheControlHeaderStrategy());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static MethodSettingJsonMarshaller instance;

    public static MethodSettingJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MethodSettingJsonMarshaller();
        return instance;
    }

}
