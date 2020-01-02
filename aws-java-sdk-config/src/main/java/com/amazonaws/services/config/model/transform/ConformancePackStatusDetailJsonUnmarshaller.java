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
package com.amazonaws.services.config.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.config.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ConformancePackStatusDetail JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConformancePackStatusDetailJsonUnmarshaller implements Unmarshaller<ConformancePackStatusDetail, JsonUnmarshallerContext> {

    public ConformancePackStatusDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        ConformancePackStatusDetail conformancePackStatusDetail = new ConformancePackStatusDetail();

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
                if (context.testExpression("ConformancePackName", targetDepth)) {
                    context.nextToken();
                    conformancePackStatusDetail.setConformancePackName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ConformancePackId", targetDepth)) {
                    context.nextToken();
                    conformancePackStatusDetail.setConformancePackId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ConformancePackArn", targetDepth)) {
                    context.nextToken();
                    conformancePackStatusDetail.setConformancePackArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ConformancePackState", targetDepth)) {
                    context.nextToken();
                    conformancePackStatusDetail.setConformancePackState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StackArn", targetDepth)) {
                    context.nextToken();
                    conformancePackStatusDetail.setStackArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ConformancePackStatusReason", targetDepth)) {
                    context.nextToken();
                    conformancePackStatusDetail.setConformancePackStatusReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastUpdateRequestedTime", targetDepth)) {
                    context.nextToken();
                    conformancePackStatusDetail.setLastUpdateRequestedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastUpdateCompletedTime", targetDepth)) {
                    context.nextToken();
                    conformancePackStatusDetail.setLastUpdateCompletedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return conformancePackStatusDetail;
    }

    private static ConformancePackStatusDetailJsonUnmarshaller instance;

    public static ConformancePackStatusDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ConformancePackStatusDetailJsonUnmarshaller();
        return instance;
    }
}
