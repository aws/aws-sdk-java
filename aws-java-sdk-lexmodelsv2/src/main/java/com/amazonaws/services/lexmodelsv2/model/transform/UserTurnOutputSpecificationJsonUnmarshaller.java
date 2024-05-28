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
package com.amazonaws.services.lexmodelsv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lexmodelsv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UserTurnOutputSpecification JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserTurnOutputSpecificationJsonUnmarshaller implements Unmarshaller<UserTurnOutputSpecification, JsonUnmarshallerContext> {

    public UserTurnOutputSpecification unmarshall(JsonUnmarshallerContext context) throws Exception {
        UserTurnOutputSpecification userTurnOutputSpecification = new UserTurnOutputSpecification();

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
                if (context.testExpression("intent", targetDepth)) {
                    context.nextToken();
                    userTurnOutputSpecification.setIntent(UserTurnIntentOutputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("activeContexts", targetDepth)) {
                    context.nextToken();
                    userTurnOutputSpecification.setActiveContexts(new ListUnmarshaller<ActiveContext>(ActiveContextJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("transcript", targetDepth)) {
                    context.nextToken();
                    userTurnOutputSpecification.setTranscript(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return userTurnOutputSpecification;
    }

    private static UserTurnOutputSpecificationJsonUnmarshaller instance;

    public static UserTurnOutputSpecificationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UserTurnOutputSpecificationJsonUnmarshaller();
        return instance;
    }
}
