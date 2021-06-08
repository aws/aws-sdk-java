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
package com.amazonaws.services.quicksight.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Analysis JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnalysisJsonUnmarshaller implements Unmarshaller<Analysis, JsonUnmarshallerContext> {

    public Analysis unmarshall(JsonUnmarshallerContext context) throws Exception {
        Analysis analysis = new Analysis();

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
                if (context.testExpression("AnalysisId", targetDepth)) {
                    context.nextToken();
                    analysis.setAnalysisId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    analysis.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    analysis.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    analysis.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Errors", targetDepth)) {
                    context.nextToken();
                    analysis.setErrors(new ListUnmarshaller<AnalysisError>(AnalysisErrorJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("DataSetArns", targetDepth)) {
                    context.nextToken();
                    analysis.setDataSetArns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ThemeArn", targetDepth)) {
                    context.nextToken();
                    analysis.setThemeArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTime", targetDepth)) {
                    context.nextToken();
                    analysis.setCreatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastUpdatedTime", targetDepth)) {
                    context.nextToken();
                    analysis.setLastUpdatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Sheets", targetDepth)) {
                    context.nextToken();
                    analysis.setSheets(new ListUnmarshaller<Sheet>(SheetJsonUnmarshaller.getInstance())

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

        return analysis;
    }

    private static AnalysisJsonUnmarshaller instance;

    public static AnalysisJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AnalysisJsonUnmarshaller();
        return instance;
    }
}
