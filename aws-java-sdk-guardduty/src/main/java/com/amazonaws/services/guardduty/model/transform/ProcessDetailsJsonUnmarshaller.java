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
 * ProcessDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProcessDetailsJsonUnmarshaller implements Unmarshaller<ProcessDetails, JsonUnmarshallerContext> {

    public ProcessDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        ProcessDetails processDetails = new ProcessDetails();

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
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    processDetails.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("executablePath", targetDepth)) {
                    context.nextToken();
                    processDetails.setExecutablePath(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("executableSha256", targetDepth)) {
                    context.nextToken();
                    processDetails.setExecutableSha256(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("namespacePid", targetDepth)) {
                    context.nextToken();
                    processDetails.setNamespacePid(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("pwd", targetDepth)) {
                    context.nextToken();
                    processDetails.setPwd(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("pid", targetDepth)) {
                    context.nextToken();
                    processDetails.setPid(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("startTime", targetDepth)) {
                    context.nextToken();
                    processDetails.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("uuid", targetDepth)) {
                    context.nextToken();
                    processDetails.setUuid(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("parentUuid", targetDepth)) {
                    context.nextToken();
                    processDetails.setParentUuid(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("user", targetDepth)) {
                    context.nextToken();
                    processDetails.setUser(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("userId", targetDepth)) {
                    context.nextToken();
                    processDetails.setUserId(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("euid", targetDepth)) {
                    context.nextToken();
                    processDetails.setEuid(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("lineage", targetDepth)) {
                    context.nextToken();
                    processDetails.setLineage(new ListUnmarshaller<LineageObject>(LineageObjectJsonUnmarshaller.getInstance())

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

        return processDetails;
    }

    private static ProcessDetailsJsonUnmarshaller instance;

    public static ProcessDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProcessDetailsJsonUnmarshaller();
        return instance;
    }
}
