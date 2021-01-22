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
package com.amazonaws.services.lexmodelsv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lexmodelsv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * IntentSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IntentSummaryJsonUnmarshaller implements Unmarshaller<IntentSummary, JsonUnmarshallerContext> {

    public IntentSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        IntentSummary intentSummary = new IntentSummary();

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
                if (context.testExpression("intentId", targetDepth)) {
                    context.nextToken();
                    intentSummary.setIntentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("intentName", targetDepth)) {
                    context.nextToken();
                    intentSummary.setIntentName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    intentSummary.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("parentIntentSignature", targetDepth)) {
                    context.nextToken();
                    intentSummary.setParentIntentSignature(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("inputContexts", targetDepth)) {
                    context.nextToken();
                    intentSummary.setInputContexts(new ListUnmarshaller<InputContext>(InputContextJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("outputContexts", targetDepth)) {
                    context.nextToken();
                    intentSummary.setOutputContexts(new ListUnmarshaller<OutputContext>(OutputContextJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("lastUpdatedDateTime", targetDepth)) {
                    context.nextToken();
                    intentSummary.setLastUpdatedDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return intentSummary;
    }

    private static IntentSummaryJsonUnmarshaller instance;

    public static IntentSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new IntentSummaryJsonUnmarshaller();
        return instance;
    }
}
