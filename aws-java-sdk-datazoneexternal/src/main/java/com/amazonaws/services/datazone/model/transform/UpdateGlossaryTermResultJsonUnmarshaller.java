/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.datazone.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.datazone.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UpdateGlossaryTermResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateGlossaryTermResultJsonUnmarshaller implements Unmarshaller<UpdateGlossaryTermResult, JsonUnmarshallerContext> {

    public UpdateGlossaryTermResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateGlossaryTermResult updateGlossaryTermResult = new UpdateGlossaryTermResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateGlossaryTermResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("domainId", targetDepth)) {
                    context.nextToken();
                    updateGlossaryTermResult.setDomainId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("glossaryId", targetDepth)) {
                    context.nextToken();
                    updateGlossaryTermResult.setGlossaryId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    updateGlossaryTermResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("longDescription", targetDepth)) {
                    context.nextToken();
                    updateGlossaryTermResult.setLongDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    updateGlossaryTermResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("shortDescription", targetDepth)) {
                    context.nextToken();
                    updateGlossaryTermResult.setShortDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    updateGlossaryTermResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("termRelations", targetDepth)) {
                    context.nextToken();
                    updateGlossaryTermResult.setTermRelations(TermRelationsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return updateGlossaryTermResult;
    }

    private static UpdateGlossaryTermResultJsonUnmarshaller instance;

    public static UpdateGlossaryTermResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateGlossaryTermResultJsonUnmarshaller();
        return instance;
    }
}
