/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lexmodelbuilding.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lexmodelbuilding.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreateSlotTypeVersionResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSlotTypeVersionResultJsonUnmarshaller implements Unmarshaller<CreateSlotTypeVersionResult, JsonUnmarshallerContext> {

    public CreateSlotTypeVersionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateSlotTypeVersionResult createSlotTypeVersionResult = new CreateSlotTypeVersionResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createSlotTypeVersionResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    createSlotTypeVersionResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    createSlotTypeVersionResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("enumerationValues", targetDepth)) {
                    context.nextToken();
                    createSlotTypeVersionResult.setEnumerationValues(new ListUnmarshaller<EnumerationValue>(EnumerationValueJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("lastUpdatedDate", targetDepth)) {
                    context.nextToken();
                    createSlotTypeVersionResult.setLastUpdatedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("createdDate", targetDepth)) {
                    context.nextToken();
                    createSlotTypeVersionResult.setCreatedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("version", targetDepth)) {
                    context.nextToken();
                    createSlotTypeVersionResult.setVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("checksum", targetDepth)) {
                    context.nextToken();
                    createSlotTypeVersionResult.setChecksum(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("valueSelectionStrategy", targetDepth)) {
                    context.nextToken();
                    createSlotTypeVersionResult.setValueSelectionStrategy(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createSlotTypeVersionResult;
    }

    private static CreateSlotTypeVersionResultJsonUnmarshaller instance;

    public static CreateSlotTypeVersionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateSlotTypeVersionResultJsonUnmarshaller();
        return instance;
    }
}
