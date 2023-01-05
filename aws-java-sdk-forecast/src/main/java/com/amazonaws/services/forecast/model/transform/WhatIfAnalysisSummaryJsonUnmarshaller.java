/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * WhatIfAnalysisSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WhatIfAnalysisSummaryJsonUnmarshaller implements Unmarshaller<WhatIfAnalysisSummary, JsonUnmarshallerContext> {

    public WhatIfAnalysisSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        WhatIfAnalysisSummary whatIfAnalysisSummary = new WhatIfAnalysisSummary();

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
                if (context.testExpression("WhatIfAnalysisArn", targetDepth)) {
                    context.nextToken();
                    whatIfAnalysisSummary.setWhatIfAnalysisArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("WhatIfAnalysisName", targetDepth)) {
                    context.nextToken();
                    whatIfAnalysisSummary.setWhatIfAnalysisName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ForecastArn", targetDepth)) {
                    context.nextToken();
                    whatIfAnalysisSummary.setForecastArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    whatIfAnalysisSummary.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Message", targetDepth)) {
                    context.nextToken();
                    whatIfAnalysisSummary.setMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    whatIfAnalysisSummary.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModificationTime", targetDepth)) {
                    context.nextToken();
                    whatIfAnalysisSummary.setLastModificationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return whatIfAnalysisSummary;
    }

    private static WhatIfAnalysisSummaryJsonUnmarshaller instance;

    public static WhatIfAnalysisSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new WhatIfAnalysisSummaryJsonUnmarshaller();
        return instance;
    }
}
