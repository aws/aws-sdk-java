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
package com.amazonaws.services.customerprofiles.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.customerprofiles.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DetectedProfileObjectType JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectedProfileObjectTypeJsonUnmarshaller implements Unmarshaller<DetectedProfileObjectType, JsonUnmarshallerContext> {

    public DetectedProfileObjectType unmarshall(JsonUnmarshallerContext context) throws Exception {
        DetectedProfileObjectType detectedProfileObjectType = new DetectedProfileObjectType();

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
                if (context.testExpression("SourceLastUpdatedTimestampFormat", targetDepth)) {
                    context.nextToken();
                    detectedProfileObjectType.setSourceLastUpdatedTimestampFormat(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Fields", targetDepth)) {
                    context.nextToken();
                    detectedProfileObjectType.setFields(new MapUnmarshaller<String, ObjectTypeField>(context.getUnmarshaller(String.class),
                            ObjectTypeFieldJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("Keys", targetDepth)) {
                    context.nextToken();
                    detectedProfileObjectType.setKeys(new MapUnmarshaller<String, java.util.List<ObjectTypeKey>>(context.getUnmarshaller(String.class),
                            new ListUnmarshaller<ObjectTypeKey>(ObjectTypeKeyJsonUnmarshaller.getInstance())

                    ).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return detectedProfileObjectType;
    }

    private static DetectedProfileObjectTypeJsonUnmarshaller instance;

    public static DetectedProfileObjectTypeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DetectedProfileObjectTypeJsonUnmarshaller();
        return instance;
    }
}
