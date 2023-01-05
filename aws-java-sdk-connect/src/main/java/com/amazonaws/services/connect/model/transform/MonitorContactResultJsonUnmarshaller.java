/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * MonitorContactResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MonitorContactResultJsonUnmarshaller implements Unmarshaller<MonitorContactResult, JsonUnmarshallerContext> {

    public MonitorContactResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        MonitorContactResult monitorContactResult = new MonitorContactResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return monitorContactResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ContactId", targetDepth)) {
                    context.nextToken();
                    monitorContactResult.setContactId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ContactArn", targetDepth)) {
                    context.nextToken();
                    monitorContactResult.setContactArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return monitorContactResult;
    }

    private static MonitorContactResultJsonUnmarshaller instance;

    public static MonitorContactResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MonitorContactResultJsonUnmarshaller();
        return instance;
    }
}
