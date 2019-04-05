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
 * GetSlotTypeResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSlotTypeResultJsonUnmarshaller implements Unmarshaller<GetSlotTypeResult, JsonUnmarshallerContext> {

    public GetSlotTypeResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetSlotTypeResult getSlotTypeResult = new GetSlotTypeResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getSlotTypeResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    getSlotTypeResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    getSlotTypeResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("enumerationValues", targetDepth)) {
                    context.nextToken();
                    getSlotTypeResult.setEnumerationValues(new ListUnmarshaller<EnumerationValue>(EnumerationValueJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("lastUpdatedDate", targetDepth)) {
                    context.nextToken();
                    getSlotTypeResult.setLastUpdatedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("createdDate", targetDepth)) {
                    context.nextToken();
                    getSlotTypeResult.setCreatedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("version", targetDepth)) {
                    context.nextToken();
                    getSlotTypeResult.setVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("checksum", targetDepth)) {
                    context.nextToken();
                    getSlotTypeResult.setChecksum(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("valueSelectionStrategy", targetDepth)) {
                    context.nextToken();
                    getSlotTypeResult.setValueSelectionStrategy(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getSlotTypeResult;
    }

    private static GetSlotTypeResultJsonUnmarshaller instance;

    public static GetSlotTypeResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetSlotTypeResultJsonUnmarshaller();
        return instance;
    }
}
