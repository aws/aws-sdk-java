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
package com.amazonaws.services.guardduty.model.transform;

import java.util.Map;
import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.guardduty.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AnomalyUnusual JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnomalyUnusualJsonUnmarshaller implements Unmarshaller<AnomalyUnusual, JsonUnmarshallerContext> {

    public AnomalyUnusual unmarshall(JsonUnmarshallerContext context) throws Exception {
        AnomalyUnusual anomalyUnusual = new AnomalyUnusual();

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
                if (context.testExpression("behavior", targetDepth)) {
                    context.nextToken();
                    anomalyUnusual.setBehavior(new MapUnmarshaller<String, java.util.Map<String, AnomalyObject>>(context.getUnmarshaller(String.class),
                            new MapUnmarshaller<String, AnomalyObject>(context.getUnmarshaller(String.class), AnomalyObjectJsonUnmarshaller.getInstance()))
                            .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return anomalyUnusual;
    }

    private static AnomalyUnusualJsonUnmarshaller instance;

    public static AnomalyUnusualJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AnomalyUnusualJsonUnmarshaller();
        return instance;
    }
}
