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
package com.amazonaws.services.cloudwatchevents.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cloudwatchevents.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PutTargetsResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutTargetsResultJsonUnmarshaller implements Unmarshaller<PutTargetsResult, JsonUnmarshallerContext> {

    public PutTargetsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PutTargetsResult putTargetsResult = new PutTargetsResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return putTargetsResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("FailedEntryCount", targetDepth)) {
                    context.nextToken();
                    putTargetsResult.setFailedEntryCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("FailedEntries", targetDepth)) {
                    context.nextToken();
                    putTargetsResult.setFailedEntries(new ListUnmarshaller<PutTargetsResultEntry>(PutTargetsResultEntryJsonUnmarshaller.getInstance())
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

        return putTargetsResult;
    }

    private static PutTargetsResultJsonUnmarshaller instance;

    public static PutTargetsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PutTargetsResultJsonUnmarshaller();
        return instance;
    }
}
