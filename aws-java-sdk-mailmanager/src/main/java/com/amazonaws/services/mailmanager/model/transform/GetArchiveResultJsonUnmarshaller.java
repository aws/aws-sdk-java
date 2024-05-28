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
package com.amazonaws.services.mailmanager.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mailmanager.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetArchiveResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetArchiveResultJsonUnmarshaller implements Unmarshaller<GetArchiveResult, JsonUnmarshallerContext> {

    public GetArchiveResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetArchiveResult getArchiveResult = new GetArchiveResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getArchiveResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ArchiveArn", targetDepth)) {
                    context.nextToken();
                    getArchiveResult.setArchiveArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ArchiveId", targetDepth)) {
                    context.nextToken();
                    getArchiveResult.setArchiveId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ArchiveName", targetDepth)) {
                    context.nextToken();
                    getArchiveResult.setArchiveName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ArchiveState", targetDepth)) {
                    context.nextToken();
                    getArchiveResult.setArchiveState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTimestamp", targetDepth)) {
                    context.nextToken();
                    getArchiveResult.setCreatedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("KmsKeyArn", targetDepth)) {
                    context.nextToken();
                    getArchiveResult.setKmsKeyArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastUpdatedTimestamp", targetDepth)) {
                    context.nextToken();
                    getArchiveResult.setLastUpdatedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Retention", targetDepth)) {
                    context.nextToken();
                    getArchiveResult.setRetention(ArchiveRetentionJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getArchiveResult;
    }

    private static GetArchiveResultJsonUnmarshaller instance;

    public static GetArchiveResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetArchiveResultJsonUnmarshaller();
        return instance;
    }
}
