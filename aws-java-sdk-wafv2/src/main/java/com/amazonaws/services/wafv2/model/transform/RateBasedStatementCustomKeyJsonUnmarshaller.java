/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.wafv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.wafv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RateBasedStatementCustomKey JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RateBasedStatementCustomKeyJsonUnmarshaller implements Unmarshaller<RateBasedStatementCustomKey, JsonUnmarshallerContext> {

    public RateBasedStatementCustomKey unmarshall(JsonUnmarshallerContext context) throws Exception {
        RateBasedStatementCustomKey rateBasedStatementCustomKey = new RateBasedStatementCustomKey();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Header", targetDepth)) {
                    context.nextToken();
                    rateBasedStatementCustomKey.setHeader(RateLimitHeaderJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Cookie", targetDepth)) {
                    context.nextToken();
                    rateBasedStatementCustomKey.setCookie(RateLimitCookieJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("QueryArgument", targetDepth)) {
                    context.nextToken();
                    rateBasedStatementCustomKey.setQueryArgument(RateLimitQueryArgumentJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("QueryString", targetDepth)) {
                    context.nextToken();
                    rateBasedStatementCustomKey.setQueryString(RateLimitQueryStringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("HTTPMethod", targetDepth)) {
                    context.nextToken();
                    rateBasedStatementCustomKey.setHTTPMethod(RateLimitHTTPMethodJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ForwardedIP", targetDepth)) {
                    context.nextToken();
                    rateBasedStatementCustomKey.setForwardedIP(RateLimitForwardedIPJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("IP", targetDepth)) {
                    context.nextToken();
                    rateBasedStatementCustomKey.setIP(RateLimitIPJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LabelNamespace", targetDepth)) {
                    context.nextToken();
                    rateBasedStatementCustomKey.setLabelNamespace(RateLimitLabelNamespaceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("UriPath", targetDepth)) {
                    context.nextToken();
                    rateBasedStatementCustomKey.setUriPath(RateLimitUriPathJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return rateBasedStatementCustomKey;
    }

    private static RateBasedStatementCustomKeyJsonUnmarshaller instance;

    public static RateBasedStatementCustomKeyJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RateBasedStatementCustomKeyJsonUnmarshaller();
        return instance;
    }
}
