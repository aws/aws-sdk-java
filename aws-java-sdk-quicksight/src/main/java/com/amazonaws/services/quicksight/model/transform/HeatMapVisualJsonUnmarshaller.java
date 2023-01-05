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
 * HeatMapVisual JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HeatMapVisualJsonUnmarshaller implements Unmarshaller<HeatMapVisual, JsonUnmarshallerContext> {

    public HeatMapVisual unmarshall(JsonUnmarshallerContext context) throws Exception {
        HeatMapVisual heatMapVisual = new HeatMapVisual();

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
                if (context.testExpression("VisualId", targetDepth)) {
                    context.nextToken();
                    heatMapVisual.setVisualId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Title", targetDepth)) {
                    context.nextToken();
                    heatMapVisual.setTitle(VisualTitleLabelOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Subtitle", targetDepth)) {
                    context.nextToken();
                    heatMapVisual.setSubtitle(VisualSubtitleLabelOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ChartConfiguration", targetDepth)) {
                    context.nextToken();
                    heatMapVisual.setChartConfiguration(HeatMapConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ColumnHierarchies", targetDepth)) {
                    context.nextToken();
                    heatMapVisual.setColumnHierarchies(new ListUnmarshaller<ColumnHierarchy>(ColumnHierarchyJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Actions", targetDepth)) {
                    context.nextToken();
                    heatMapVisual.setActions(new ListUnmarshaller<VisualCustomAction>(VisualCustomActionJsonUnmarshaller.getInstance())

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

        return heatMapVisual;
    }

    private static HeatMapVisualJsonUnmarshaller instance;

    public static HeatMapVisualJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HeatMapVisualJsonUnmarshaller();
        return instance;
    }
}
