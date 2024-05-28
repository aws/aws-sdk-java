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

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.guardduty.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AnomalyObject JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnomalyObjectJsonUnmarshaller implements Unmarshaller<AnomalyObject, JsonUnmarshallerContext> {

    public AnomalyObject unmarshall(JsonUnmarshallerContext context) throws Exception {
        AnomalyObject anomalyObject = new AnomalyObject();

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
                if (context.testExpression("profileType", targetDepth)) {
                    context.nextToken();
                    anomalyObject.setProfileType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("profileSubtype", targetDepth)) {
                    context.nextToken();
                    anomalyObject.setProfileSubtype(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("observations", targetDepth)) {
                    context.nextToken();
                    anomalyObject.setObservations(ObservationsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return anomalyObject;
    }

    private static AnomalyObjectJsonUnmarshaller instance;

    public static AnomalyObjectJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AnomalyObjectJsonUnmarshaller();
        return instance;
    }
}
