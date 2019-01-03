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
package com.amazonaws.services.directory.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.directory.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SharedDirectory JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SharedDirectoryJsonUnmarshaller implements Unmarshaller<SharedDirectory, JsonUnmarshallerContext> {

    public SharedDirectory unmarshall(JsonUnmarshallerContext context) throws Exception {
        SharedDirectory sharedDirectory = new SharedDirectory();

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
                if (context.testExpression("OwnerAccountId", targetDepth)) {
                    context.nextToken();
                    sharedDirectory.setOwnerAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OwnerDirectoryId", targetDepth)) {
                    context.nextToken();
                    sharedDirectory.setOwnerDirectoryId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ShareMethod", targetDepth)) {
                    context.nextToken();
                    sharedDirectory.setShareMethod(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SharedAccountId", targetDepth)) {
                    context.nextToken();
                    sharedDirectory.setSharedAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SharedDirectoryId", targetDepth)) {
                    context.nextToken();
                    sharedDirectory.setSharedDirectoryId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ShareStatus", targetDepth)) {
                    context.nextToken();
                    sharedDirectory.setShareStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ShareNotes", targetDepth)) {
                    context.nextToken();
                    sharedDirectory.setShareNotes(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedDateTime", targetDepth)) {
                    context.nextToken();
                    sharedDirectory.setCreatedDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastUpdatedDateTime", targetDepth)) {
                    context.nextToken();
                    sharedDirectory.setLastUpdatedDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return sharedDirectory;
    }

    private static SharedDirectoryJsonUnmarshaller instance;

    public static SharedDirectoryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SharedDirectoryJsonUnmarshaller();
        return instance;
    }
}
