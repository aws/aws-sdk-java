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
package com.amazonaws.services.comprehendmedical.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.comprehendmedical.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * StopEntitiesDetectionV2JobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopEntitiesDetectionV2JobResultJsonUnmarshaller implements Unmarshaller<StopEntitiesDetectionV2JobResult, JsonUnmarshallerContext> {

    public StopEntitiesDetectionV2JobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        StopEntitiesDetectionV2JobResult stopEntitiesDetectionV2JobResult = new StopEntitiesDetectionV2JobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return stopEntitiesDetectionV2JobResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("JobId", targetDepth)) {
                    context.nextToken();
                    stopEntitiesDetectionV2JobResult.setJobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return stopEntitiesDetectionV2JobResult;
    }

    private static StopEntitiesDetectionV2JobResultJsonUnmarshaller instance;

    public static StopEntitiesDetectionV2JobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StopEntitiesDetectionV2JobResultJsonUnmarshaller();
        return instance;
    }
}
