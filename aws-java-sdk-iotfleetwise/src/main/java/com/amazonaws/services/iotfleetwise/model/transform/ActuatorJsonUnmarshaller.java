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
package com.amazonaws.services.iotfleetwise.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iotfleetwise.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Actuator JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActuatorJsonUnmarshaller implements Unmarshaller<Actuator, JsonUnmarshallerContext> {

    public Actuator unmarshall(JsonUnmarshallerContext context) throws Exception {
        Actuator actuator = new Actuator();

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
                if (context.testExpression("fullyQualifiedName", targetDepth)) {
                    context.nextToken();
                    actuator.setFullyQualifiedName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dataType", targetDepth)) {
                    context.nextToken();
                    actuator.setDataType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    actuator.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("unit", targetDepth)) {
                    context.nextToken();
                    actuator.setUnit(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("allowedValues", targetDepth)) {
                    context.nextToken();
                    actuator.setAllowedValues(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("min", targetDepth)) {
                    context.nextToken();
                    actuator.setMin(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("max", targetDepth)) {
                    context.nextToken();
                    actuator.setMax(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("assignedValue", targetDepth)) {
                    context.nextToken();
                    actuator.setAssignedValue(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return actuator;
    }

    private static ActuatorJsonUnmarshaller instance;

    public static ActuatorJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ActuatorJsonUnmarshaller();
        return instance;
    }
}
