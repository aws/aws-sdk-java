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
package com.amazonaws.services.marketplacecatalog.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.marketplacecatalog.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeChangeSetResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeChangeSetResultJsonUnmarshaller implements Unmarshaller<DescribeChangeSetResult, JsonUnmarshallerContext> {

    public DescribeChangeSetResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeChangeSetResult describeChangeSetResult = new DescribeChangeSetResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeChangeSetResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ChangeSetId", targetDepth)) {
                    context.nextToken();
                    describeChangeSetResult.setChangeSetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ChangeSetArn", targetDepth)) {
                    context.nextToken();
                    describeChangeSetResult.setChangeSetArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ChangeSetName", targetDepth)) {
                    context.nextToken();
                    describeChangeSetResult.setChangeSetName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartTime", targetDepth)) {
                    context.nextToken();
                    describeChangeSetResult.setStartTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EndTime", targetDepth)) {
                    context.nextToken();
                    describeChangeSetResult.setEndTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    describeChangeSetResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FailureDescription", targetDepth)) {
                    context.nextToken();
                    describeChangeSetResult.setFailureDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ChangeSet", targetDepth)) {
                    context.nextToken();
                    describeChangeSetResult.setChangeSet(new ListUnmarshaller<ChangeSummary>(ChangeSummaryJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeChangeSetResult;
    }

    private static DescribeChangeSetResultJsonUnmarshaller instance;

    public static DescribeChangeSetResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeChangeSetResultJsonUnmarshaller();
        return instance;
    }
}
