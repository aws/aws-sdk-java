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
package com.amazonaws.services.connect.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetCurrentMetricDataResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCurrentMetricDataResultJsonUnmarshaller implements Unmarshaller<GetCurrentMetricDataResult, JsonUnmarshallerContext> {

    public GetCurrentMetricDataResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetCurrentMetricDataResult getCurrentMetricDataResult = new GetCurrentMetricDataResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getCurrentMetricDataResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("NextToken", targetDepth)) {
                    context.nextToken();
                    getCurrentMetricDataResult.setNextToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MetricResults", targetDepth)) {
                    context.nextToken();
                    getCurrentMetricDataResult.setMetricResults(new ListUnmarshaller<CurrentMetricResult>(CurrentMetricResultJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("DataSnapshotTime", targetDepth)) {
                    context.nextToken();
                    getCurrentMetricDataResult.setDataSnapshotTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getCurrentMetricDataResult;
    }

    private static GetCurrentMetricDataResultJsonUnmarshaller instance;

    public static GetCurrentMetricDataResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetCurrentMetricDataResultJsonUnmarshaller();
        return instance;
    }
}
