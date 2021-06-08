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
 * PredictorBacktestExportJobSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PredictorBacktestExportJobSummaryJsonUnmarshaller implements Unmarshaller<PredictorBacktestExportJobSummary, JsonUnmarshallerContext> {

    public PredictorBacktestExportJobSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        PredictorBacktestExportJobSummary predictorBacktestExportJobSummary = new PredictorBacktestExportJobSummary();

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
                if (context.testExpression("PredictorBacktestExportJobArn", targetDepth)) {
                    context.nextToken();
                    predictorBacktestExportJobSummary.setPredictorBacktestExportJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PredictorBacktestExportJobName", targetDepth)) {
                    context.nextToken();
                    predictorBacktestExportJobSummary.setPredictorBacktestExportJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Destination", targetDepth)) {
                    context.nextToken();
                    predictorBacktestExportJobSummary.setDestination(DataDestinationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    predictorBacktestExportJobSummary.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Message", targetDepth)) {
                    context.nextToken();
                    predictorBacktestExportJobSummary.setMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    predictorBacktestExportJobSummary.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModificationTime", targetDepth)) {
                    context.nextToken();
                    predictorBacktestExportJobSummary.setLastModificationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return predictorBacktestExportJobSummary;
    }

    private static PredictorBacktestExportJobSummaryJsonUnmarshaller instance;

    public static PredictorBacktestExportJobSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PredictorBacktestExportJobSummaryJsonUnmarshaller();
        return instance;
    }
}
