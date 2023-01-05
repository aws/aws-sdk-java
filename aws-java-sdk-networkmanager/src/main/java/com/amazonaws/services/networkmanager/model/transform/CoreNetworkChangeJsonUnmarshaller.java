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
package com.amazonaws.services.networkmanager.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.networkmanager.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CoreNetworkChange JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CoreNetworkChangeJsonUnmarshaller implements Unmarshaller<CoreNetworkChange, JsonUnmarshallerContext> {

    public CoreNetworkChange unmarshall(JsonUnmarshallerContext context) throws Exception {
        CoreNetworkChange coreNetworkChange = new CoreNetworkChange();

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
                if (context.testExpression("Type", targetDepth)) {
                    context.nextToken();
                    coreNetworkChange.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Action", targetDepth)) {
                    context.nextToken();
                    coreNetworkChange.setAction(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Identifier", targetDepth)) {
                    context.nextToken();
                    coreNetworkChange.setIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PreviousValues", targetDepth)) {
                    context.nextToken();
                    coreNetworkChange.setPreviousValues(CoreNetworkChangeValuesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("NewValues", targetDepth)) {
                    context.nextToken();
                    coreNetworkChange.setNewValues(CoreNetworkChangeValuesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("IdentifierPath", targetDepth)) {
                    context.nextToken();
                    coreNetworkChange.setIdentifierPath(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return coreNetworkChange;
    }

    private static CoreNetworkChangeJsonUnmarshaller instance;

    public static CoreNetworkChangeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CoreNetworkChangeJsonUnmarshaller();
        return instance;
    }
}
