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
package com.amazonaws.services.quicksight.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RelativeDatesFilter JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RelativeDatesFilterJsonUnmarshaller implements Unmarshaller<RelativeDatesFilter, JsonUnmarshallerContext> {

    public RelativeDatesFilter unmarshall(JsonUnmarshallerContext context) throws Exception {
        RelativeDatesFilter relativeDatesFilter = new RelativeDatesFilter();

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
                if (context.testExpression("FilterId", targetDepth)) {
                    context.nextToken();
                    relativeDatesFilter.setFilterId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Column", targetDepth)) {
                    context.nextToken();
                    relativeDatesFilter.setColumn(ColumnIdentifierJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AnchorDateConfiguration", targetDepth)) {
                    context.nextToken();
                    relativeDatesFilter.setAnchorDateConfiguration(AnchorDateConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MinimumGranularity", targetDepth)) {
                    context.nextToken();
                    relativeDatesFilter.setMinimumGranularity(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TimeGranularity", targetDepth)) {
                    context.nextToken();
                    relativeDatesFilter.setTimeGranularity(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RelativeDateType", targetDepth)) {
                    context.nextToken();
                    relativeDatesFilter.setRelativeDateType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RelativeDateValue", targetDepth)) {
                    context.nextToken();
                    relativeDatesFilter.setRelativeDateValue(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ParameterName", targetDepth)) {
                    context.nextToken();
                    relativeDatesFilter.setParameterName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NullOption", targetDepth)) {
                    context.nextToken();
                    relativeDatesFilter.setNullOption(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExcludePeriodConfiguration", targetDepth)) {
                    context.nextToken();
                    relativeDatesFilter.setExcludePeriodConfiguration(ExcludePeriodConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return relativeDatesFilter;
    }

    private static RelativeDatesFilterJsonUnmarshaller instance;

    public static RelativeDatesFilterJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RelativeDatesFilterJsonUnmarshaller();
        return instance;
    }
}
