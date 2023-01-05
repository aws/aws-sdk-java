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
 * DataLabelType JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataLabelTypeJsonUnmarshaller implements Unmarshaller<DataLabelType, JsonUnmarshallerContext> {

    public DataLabelType unmarshall(JsonUnmarshallerContext context) throws Exception {
        DataLabelType dataLabelType = new DataLabelType();

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
                if (context.testExpression("FieldLabelType", targetDepth)) {
                    context.nextToken();
                    dataLabelType.setFieldLabelType(FieldLabelTypeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DataPathLabelType", targetDepth)) {
                    context.nextToken();
                    dataLabelType.setDataPathLabelType(DataPathLabelTypeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RangeEndsLabelType", targetDepth)) {
                    context.nextToken();
                    dataLabelType.setRangeEndsLabelType(RangeEndsLabelTypeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MinimumLabelType", targetDepth)) {
                    context.nextToken();
                    dataLabelType.setMinimumLabelType(MinimumLabelTypeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MaximumLabelType", targetDepth)) {
                    context.nextToken();
                    dataLabelType.setMaximumLabelType(MaximumLabelTypeJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return dataLabelType;
    }

    private static DataLabelTypeJsonUnmarshaller instance;

    public static DataLabelTypeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DataLabelTypeJsonUnmarshaller();
        return instance;
    }
}
