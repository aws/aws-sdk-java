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
package com.amazonaws.services.lookoutequipment.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lookoutequipment.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeLabelResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLabelResultJsonUnmarshaller implements Unmarshaller<DescribeLabelResult, JsonUnmarshallerContext> {

    public DescribeLabelResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeLabelResult describeLabelResult = new DescribeLabelResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeLabelResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("LabelGroupName", targetDepth)) {
                    context.nextToken();
                    describeLabelResult.setLabelGroupName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LabelGroupArn", targetDepth)) {
                    context.nextToken();
                    describeLabelResult.setLabelGroupArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LabelId", targetDepth)) {
                    context.nextToken();
                    describeLabelResult.setLabelId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartTime", targetDepth)) {
                    context.nextToken();
                    describeLabelResult.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EndTime", targetDepth)) {
                    context.nextToken();
                    describeLabelResult.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Rating", targetDepth)) {
                    context.nextToken();
                    describeLabelResult.setRating(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FaultCode", targetDepth)) {
                    context.nextToken();
                    describeLabelResult.setFaultCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Notes", targetDepth)) {
                    context.nextToken();
                    describeLabelResult.setNotes(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Equipment", targetDepth)) {
                    context.nextToken();
                    describeLabelResult.setEquipment(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    context.nextToken();
                    describeLabelResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeLabelResult;
    }

    private static DescribeLabelResultJsonUnmarshaller instance;

    public static DescribeLabelResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeLabelResultJsonUnmarshaller();
        return instance;
    }
}
