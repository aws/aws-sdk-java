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
 * LabelSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LabelSummaryJsonUnmarshaller implements Unmarshaller<LabelSummary, JsonUnmarshallerContext> {

    public LabelSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        LabelSummary labelSummary = new LabelSummary();

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
                if (context.testExpression("LabelGroupName", targetDepth)) {
                    context.nextToken();
                    labelSummary.setLabelGroupName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LabelId", targetDepth)) {
                    context.nextToken();
                    labelSummary.setLabelId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LabelGroupArn", targetDepth)) {
                    context.nextToken();
                    labelSummary.setLabelGroupArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartTime", targetDepth)) {
                    context.nextToken();
                    labelSummary.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EndTime", targetDepth)) {
                    context.nextToken();
                    labelSummary.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Rating", targetDepth)) {
                    context.nextToken();
                    labelSummary.setRating(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FaultCode", targetDepth)) {
                    context.nextToken();
                    labelSummary.setFaultCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Equipment", targetDepth)) {
                    context.nextToken();
                    labelSummary.setEquipment(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    context.nextToken();
                    labelSummary.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return labelSummary;
    }

    private static LabelSummaryJsonUnmarshaller instance;

    public static LabelSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LabelSummaryJsonUnmarshaller();
        return instance;
    }
}
