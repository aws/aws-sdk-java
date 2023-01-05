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
package com.amazonaws.services.comprehendmedical.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.comprehendmedical.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * InferSNOMEDCTResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InferSNOMEDCTResultJsonUnmarshaller implements Unmarshaller<InferSNOMEDCTResult, JsonUnmarshallerContext> {

    public InferSNOMEDCTResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        InferSNOMEDCTResult inferSNOMEDCTResult = new InferSNOMEDCTResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return inferSNOMEDCTResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Entities", targetDepth)) {
                    context.nextToken();
                    inferSNOMEDCTResult.setEntities(new ListUnmarshaller<SNOMEDCTEntity>(SNOMEDCTEntityJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("PaginationToken", targetDepth)) {
                    context.nextToken();
                    inferSNOMEDCTResult.setPaginationToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelVersion", targetDepth)) {
                    context.nextToken();
                    inferSNOMEDCTResult.setModelVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SNOMEDCTDetails", targetDepth)) {
                    context.nextToken();
                    inferSNOMEDCTResult.setSNOMEDCTDetails(SNOMEDCTDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Characters", targetDepth)) {
                    context.nextToken();
                    inferSNOMEDCTResult.setCharacters(CharactersJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return inferSNOMEDCTResult;
    }

    private static InferSNOMEDCTResultJsonUnmarshaller instance;

    public static InferSNOMEDCTResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InferSNOMEDCTResultJsonUnmarshaller();
        return instance;
    }
}
