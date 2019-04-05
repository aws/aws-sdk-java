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
package com.amazonaws.services.gamelift.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.gamelift.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * EC2InstanceCounts JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EC2InstanceCountsJsonUnmarshaller implements Unmarshaller<EC2InstanceCounts, JsonUnmarshallerContext> {

    public EC2InstanceCounts unmarshall(JsonUnmarshallerContext context) throws Exception {
        EC2InstanceCounts eC2InstanceCounts = new EC2InstanceCounts();

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
                if (context.testExpression("DESIRED", targetDepth)) {
                    context.nextToken();
                    eC2InstanceCounts.setDESIRED(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MINIMUM", targetDepth)) {
                    context.nextToken();
                    eC2InstanceCounts.setMINIMUM(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MAXIMUM", targetDepth)) {
                    context.nextToken();
                    eC2InstanceCounts.setMAXIMUM(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("PENDING", targetDepth)) {
                    context.nextToken();
                    eC2InstanceCounts.setPENDING(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ACTIVE", targetDepth)) {
                    context.nextToken();
                    eC2InstanceCounts.setACTIVE(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("IDLE", targetDepth)) {
                    context.nextToken();
                    eC2InstanceCounts.setIDLE(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("TERMINATING", targetDepth)) {
                    context.nextToken();
                    eC2InstanceCounts.setTERMINATING(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return eC2InstanceCounts;
    }

    private static EC2InstanceCountsJsonUnmarshaller instance;

    public static EC2InstanceCountsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EC2InstanceCountsJsonUnmarshaller();
        return instance;
    }
}
