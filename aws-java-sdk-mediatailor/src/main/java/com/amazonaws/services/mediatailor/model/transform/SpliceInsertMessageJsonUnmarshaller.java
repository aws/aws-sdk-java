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
package com.amazonaws.services.mediatailor.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mediatailor.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SpliceInsertMessage JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SpliceInsertMessageJsonUnmarshaller implements Unmarshaller<SpliceInsertMessage, JsonUnmarshallerContext> {

    public SpliceInsertMessage unmarshall(JsonUnmarshallerContext context) throws Exception {
        SpliceInsertMessage spliceInsertMessage = new SpliceInsertMessage();

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
                if (context.testExpression("AvailNum", targetDepth)) {
                    context.nextToken();
                    spliceInsertMessage.setAvailNum(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("AvailsExpected", targetDepth)) {
                    context.nextToken();
                    spliceInsertMessage.setAvailsExpected(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("SpliceEventId", targetDepth)) {
                    context.nextToken();
                    spliceInsertMessage.setSpliceEventId(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("UniqueProgramId", targetDepth)) {
                    context.nextToken();
                    spliceInsertMessage.setUniqueProgramId(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return spliceInsertMessage;
    }

    private static SpliceInsertMessageJsonUnmarshaller instance;

    public static SpliceInsertMessageJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SpliceInsertMessageJsonUnmarshaller();
        return instance;
    }
}
