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
package com.amazonaws.services.arczonalshift.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.arczonalshift.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetManagedResourceResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetManagedResourceResultJsonUnmarshaller implements Unmarshaller<GetManagedResourceResult, JsonUnmarshallerContext> {

    public GetManagedResourceResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetManagedResourceResult getManagedResourceResult = new GetManagedResourceResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getManagedResourceResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("appliedWeights", targetDepth)) {
                    context.nextToken();
                    getManagedResourceResult.setAppliedWeights(new MapUnmarshaller<String, Float>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(Float.class)).unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    getManagedResourceResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    getManagedResourceResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("zonalShifts", targetDepth)) {
                    context.nextToken();
                    getManagedResourceResult.setZonalShifts(new ListUnmarshaller<ZonalShiftInResource>(ZonalShiftInResourceJsonUnmarshaller.getInstance())

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

        return getManagedResourceResult;
    }

    private static GetManagedResourceResultJsonUnmarshaller instance;

    public static GetManagedResourceResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetManagedResourceResultJsonUnmarshaller();
        return instance;
    }
}
