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
package com.amazonaws.services.forecast.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.forecast.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribePredictorBacktestExportJobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePredictorBacktestExportJobResultJsonUnmarshaller implements
        Unmarshaller<DescribePredictorBacktestExportJobResult, JsonUnmarshallerContext> {

    public DescribePredictorBacktestExportJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribePredictorBacktestExportJobResult describePredictorBacktestExportJobResult = new DescribePredictorBacktestExportJobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describePredictorBacktestExportJobResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("PredictorBacktestExportJobArn", targetDepth)) {
                    context.nextToken();
                    describePredictorBacktestExportJobResult.setPredictorBacktestExportJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PredictorBacktestExportJobName", targetDepth)) {
                    context.nextToken();
                    describePredictorBacktestExportJobResult.setPredictorBacktestExportJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PredictorArn", targetDepth)) {
                    context.nextToken();
                    describePredictorBacktestExportJobResult.setPredictorArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Destination", targetDepth)) {
                    context.nextToken();
                    describePredictorBacktestExportJobResult.setDestination(DataDestinationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Message", targetDepth)) {
                    context.nextToken();
                    describePredictorBacktestExportJobResult.setMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    describePredictorBacktestExportJobResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    describePredictorBacktestExportJobResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModificationTime", targetDepth)) {
                    context.nextToken();
                    describePredictorBacktestExportJobResult.setLastModificationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(
                            context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describePredictorBacktestExportJobResult;
    }

    private static DescribePredictorBacktestExportJobResultJsonUnmarshaller instance;

    public static DescribePredictorBacktestExportJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribePredictorBacktestExportJobResultJsonUnmarshaller();
        return instance;
    }
}
