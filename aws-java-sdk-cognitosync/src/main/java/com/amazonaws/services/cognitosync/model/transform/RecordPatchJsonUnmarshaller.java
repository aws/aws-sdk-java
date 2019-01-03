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
package com.amazonaws.services.cognitosync.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cognitosync.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RecordPatch JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecordPatchJsonUnmarshaller implements Unmarshaller<RecordPatch, JsonUnmarshallerContext> {

    public RecordPatch unmarshall(JsonUnmarshallerContext context) throws Exception {
        RecordPatch recordPatch = new RecordPatch();

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
                if (context.testExpression("Op", targetDepth)) {
                    context.nextToken();
                    recordPatch.setOp(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Key", targetDepth)) {
                    context.nextToken();
                    recordPatch.setKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Value", targetDepth)) {
                    context.nextToken();
                    recordPatch.setValue(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SyncCount", targetDepth)) {
                    context.nextToken();
                    recordPatch.setSyncCount(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("DeviceLastModifiedDate", targetDepth)) {
                    context.nextToken();
                    recordPatch.setDeviceLastModifiedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return recordPatch;
    }

    private static RecordPatchJsonUnmarshaller instance;

    public static RecordPatchJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RecordPatchJsonUnmarshaller();
        return instance;
    }
}
