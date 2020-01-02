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
package com.amazonaws.services.ioteventsdata.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.ioteventsdata.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DetectorStateDefinition JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectorStateDefinitionJsonUnmarshaller implements Unmarshaller<DetectorStateDefinition, JsonUnmarshallerContext> {

    public DetectorStateDefinition unmarshall(JsonUnmarshallerContext context) throws Exception {
        DetectorStateDefinition detectorStateDefinition = new DetectorStateDefinition();

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
                if (context.testExpression("stateName", targetDepth)) {
                    context.nextToken();
                    detectorStateDefinition.setStateName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("variables", targetDepth)) {
                    context.nextToken();
                    detectorStateDefinition.setVariables(new ListUnmarshaller<VariableDefinition>(VariableDefinitionJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("timers", targetDepth)) {
                    context.nextToken();
                    detectorStateDefinition.setTimers(new ListUnmarshaller<TimerDefinition>(TimerDefinitionJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return detectorStateDefinition;
    }

    private static DetectorStateDefinitionJsonUnmarshaller instance;

    public static DetectorStateDefinitionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DetectorStateDefinitionJsonUnmarshaller();
        return instance;
    }
}
