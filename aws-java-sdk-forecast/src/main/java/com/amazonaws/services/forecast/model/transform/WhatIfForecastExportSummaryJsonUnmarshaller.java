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
 * WhatIfForecastExportSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WhatIfForecastExportSummaryJsonUnmarshaller implements Unmarshaller<WhatIfForecastExportSummary, JsonUnmarshallerContext> {

    public WhatIfForecastExportSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        WhatIfForecastExportSummary whatIfForecastExportSummary = new WhatIfForecastExportSummary();

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
                if (context.testExpression("WhatIfForecastExportArn", targetDepth)) {
                    context.nextToken();
                    whatIfForecastExportSummary.setWhatIfForecastExportArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("WhatIfForecastArns", targetDepth)) {
                    context.nextToken();
                    whatIfForecastExportSummary.setWhatIfForecastArns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("WhatIfForecastExportName", targetDepth)) {
                    context.nextToken();
                    whatIfForecastExportSummary.setWhatIfForecastExportName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Destination", targetDepth)) {
                    context.nextToken();
                    whatIfForecastExportSummary.setDestination(DataDestinationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    whatIfForecastExportSummary.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Message", targetDepth)) {
                    context.nextToken();
                    whatIfForecastExportSummary.setMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    whatIfForecastExportSummary.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModificationTime", targetDepth)) {
                    context.nextToken();
                    whatIfForecastExportSummary.setLastModificationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return whatIfForecastExportSummary;
    }

    private static WhatIfForecastExportSummaryJsonUnmarshaller instance;

    public static WhatIfForecastExportSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new WhatIfForecastExportSummaryJsonUnmarshaller();
        return instance;
    }
}
