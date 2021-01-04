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
package com.amazonaws.services.glue.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ColumnStatisticsData JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ColumnStatisticsDataJsonUnmarshaller implements Unmarshaller<ColumnStatisticsData, JsonUnmarshallerContext> {

    public ColumnStatisticsData unmarshall(JsonUnmarshallerContext context) throws Exception {
        ColumnStatisticsData columnStatisticsData = new ColumnStatisticsData();

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
                if (context.testExpression("Type", targetDepth)) {
                    context.nextToken();
                    columnStatisticsData.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BooleanColumnStatisticsData", targetDepth)) {
                    context.nextToken();
                    columnStatisticsData.setBooleanColumnStatisticsData(BooleanColumnStatisticsDataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DateColumnStatisticsData", targetDepth)) {
                    context.nextToken();
                    columnStatisticsData.setDateColumnStatisticsData(DateColumnStatisticsDataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DecimalColumnStatisticsData", targetDepth)) {
                    context.nextToken();
                    columnStatisticsData.setDecimalColumnStatisticsData(DecimalColumnStatisticsDataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DoubleColumnStatisticsData", targetDepth)) {
                    context.nextToken();
                    columnStatisticsData.setDoubleColumnStatisticsData(DoubleColumnStatisticsDataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LongColumnStatisticsData", targetDepth)) {
                    context.nextToken();
                    columnStatisticsData.setLongColumnStatisticsData(LongColumnStatisticsDataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("StringColumnStatisticsData", targetDepth)) {
                    context.nextToken();
                    columnStatisticsData.setStringColumnStatisticsData(StringColumnStatisticsDataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("BinaryColumnStatisticsData", targetDepth)) {
                    context.nextToken();
                    columnStatisticsData.setBinaryColumnStatisticsData(BinaryColumnStatisticsDataJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return columnStatisticsData;
    }

    private static ColumnStatisticsDataJsonUnmarshaller instance;

    public static ColumnStatisticsDataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ColumnStatisticsDataJsonUnmarshaller();
        return instance;
    }
}
