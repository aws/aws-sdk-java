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
package com.amazonaws.services.drs.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.drs.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RecoveryInstanceFailback JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecoveryInstanceFailbackJsonUnmarshaller implements Unmarshaller<RecoveryInstanceFailback, JsonUnmarshallerContext> {

    public RecoveryInstanceFailback unmarshall(JsonUnmarshallerContext context) throws Exception {
        RecoveryInstanceFailback recoveryInstanceFailback = new RecoveryInstanceFailback();

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
                if (context.testExpression("agentLastSeenByServiceDateTime", targetDepth)) {
                    context.nextToken();
                    recoveryInstanceFailback.setAgentLastSeenByServiceDateTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("elapsedReplicationDuration", targetDepth)) {
                    context.nextToken();
                    recoveryInstanceFailback.setElapsedReplicationDuration(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("failbackClientID", targetDepth)) {
                    context.nextToken();
                    recoveryInstanceFailback.setFailbackClientID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("failbackClientLastSeenByServiceDateTime", targetDepth)) {
                    context.nextToken();
                    recoveryInstanceFailback.setFailbackClientLastSeenByServiceDateTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("failbackInitiationTime", targetDepth)) {
                    context.nextToken();
                    recoveryInstanceFailback.setFailbackInitiationTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("failbackJobID", targetDepth)) {
                    context.nextToken();
                    recoveryInstanceFailback.setFailbackJobID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("failbackLaunchType", targetDepth)) {
                    context.nextToken();
                    recoveryInstanceFailback.setFailbackLaunchType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("failbackToOriginalServer", targetDepth)) {
                    context.nextToken();
                    recoveryInstanceFailback.setFailbackToOriginalServer(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("firstByteDateTime", targetDepth)) {
                    context.nextToken();
                    recoveryInstanceFailback.setFirstByteDateTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("state", targetDepth)) {
                    context.nextToken();
                    recoveryInstanceFailback.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return recoveryInstanceFailback;
    }

    private static RecoveryInstanceFailbackJsonUnmarshaller instance;

    public static RecoveryInstanceFailbackJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RecoveryInstanceFailbackJsonUnmarshaller();
        return instance;
    }
}
