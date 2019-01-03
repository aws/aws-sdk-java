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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SeveritySummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SeveritySummaryJsonUnmarshaller implements Unmarshaller<SeveritySummary, JsonUnmarshallerContext> {

    public SeveritySummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        SeveritySummary severitySummary = new SeveritySummary();

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
                if (context.testExpression("CriticalCount", targetDepth)) {
                    context.nextToken();
                    severitySummary.setCriticalCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("HighCount", targetDepth)) {
                    context.nextToken();
                    severitySummary.setHighCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MediumCount", targetDepth)) {
                    context.nextToken();
                    severitySummary.setMediumCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("LowCount", targetDepth)) {
                    context.nextToken();
                    severitySummary.setLowCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("InformationalCount", targetDepth)) {
                    context.nextToken();
                    severitySummary.setInformationalCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("UnspecifiedCount", targetDepth)) {
                    context.nextToken();
                    severitySummary.setUnspecifiedCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return severitySummary;
    }

    private static SeveritySummaryJsonUnmarshaller instance;

    public static SeveritySummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SeveritySummaryJsonUnmarshaller();
        return instance;
    }
}
