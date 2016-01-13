/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.apigateway.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * MethodSetting JSON Unmarshaller
 */
public class MethodSettingJsonUnmarshaller implements
        Unmarshaller<MethodSetting, JsonUnmarshallerContext> {

    public MethodSetting unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        MethodSetting methodSetting = new MethodSetting();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL)
            return null;

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("metricsEnabled", targetDepth)) {
                    context.nextToken();
                    methodSetting.setMetricsEnabled(BooleanJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("loggingLevel", targetDepth)) {
                    context.nextToken();
                    methodSetting.setLoggingLevel(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("dataTraceEnabled", targetDepth)) {
                    context.nextToken();
                    methodSetting.setDataTraceEnabled(BooleanJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("throttlingBurstLimit", targetDepth)) {
                    context.nextToken();
                    methodSetting
                            .setThrottlingBurstLimit(IntegerJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
                if (context.testExpression("throttlingRateLimit", targetDepth)) {
                    context.nextToken();
                    methodSetting.setThrottlingRateLimit(DoubleJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("cachingEnabled", targetDepth)) {
                    context.nextToken();
                    methodSetting.setCachingEnabled(BooleanJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("cacheTtlInSeconds", targetDepth)) {
                    context.nextToken();
                    methodSetting.setCacheTtlInSeconds(IntegerJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("cacheDataEncrypted", targetDepth)) {
                    context.nextToken();
                    methodSetting.setCacheDataEncrypted(BooleanJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null
                        || context.getLastParsedParentElement().equals(
                                currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return methodSetting;
    }

    private static MethodSettingJsonUnmarshaller instance;

    public static MethodSettingJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MethodSettingJsonUnmarshaller();
        return instance;
    }
}
