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
 * DataLabelOptions JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataLabelOptionsJsonUnmarshaller implements Unmarshaller<DataLabelOptions, JsonUnmarshallerContext> {

    public DataLabelOptions unmarshall(JsonUnmarshallerContext context) throws Exception {
        DataLabelOptions dataLabelOptions = new DataLabelOptions();

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
                if (context.testExpression("Visibility", targetDepth)) {
                    context.nextToken();
                    dataLabelOptions.setVisibility(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CategoryLabelVisibility", targetDepth)) {
                    context.nextToken();
                    dataLabelOptions.setCategoryLabelVisibility(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MeasureLabelVisibility", targetDepth)) {
                    context.nextToken();
                    dataLabelOptions.setMeasureLabelVisibility(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DataLabelTypes", targetDepth)) {
                    context.nextToken();
                    dataLabelOptions.setDataLabelTypes(new ListUnmarshaller<DataLabelType>(DataLabelTypeJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Position", targetDepth)) {
                    context.nextToken();
                    dataLabelOptions.setPosition(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LabelContent", targetDepth)) {
                    context.nextToken();
                    dataLabelOptions.setLabelContent(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LabelFontConfiguration", targetDepth)) {
                    context.nextToken();
                    dataLabelOptions.setLabelFontConfiguration(FontConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LabelColor", targetDepth)) {
                    context.nextToken();
                    dataLabelOptions.setLabelColor(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Overlap", targetDepth)) {
                    context.nextToken();
                    dataLabelOptions.setOverlap(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return dataLabelOptions;
    }

    private static DataLabelOptionsJsonUnmarshaller instance;

    public static DataLabelOptionsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DataLabelOptionsJsonUnmarshaller();
        return instance;
    }
}
