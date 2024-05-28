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
 * GlossaryTermItem JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GlossaryTermItemJsonUnmarshaller implements Unmarshaller<GlossaryTermItem, JsonUnmarshallerContext> {

    public GlossaryTermItem unmarshall(JsonUnmarshallerContext context) throws Exception {
        GlossaryTermItem glossaryTermItem = new GlossaryTermItem();

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
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    glossaryTermItem.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("createdBy", targetDepth)) {
                    context.nextToken();
                    glossaryTermItem.setCreatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("domainId", targetDepth)) {
                    context.nextToken();
                    glossaryTermItem.setDomainId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("glossaryId", targetDepth)) {
                    context.nextToken();
                    glossaryTermItem.setGlossaryId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    glossaryTermItem.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("longDescription", targetDepth)) {
                    context.nextToken();
                    glossaryTermItem.setLongDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    glossaryTermItem.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("shortDescription", targetDepth)) {
                    context.nextToken();
                    glossaryTermItem.setShortDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    glossaryTermItem.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("termRelations", targetDepth)) {
                    context.nextToken();
                    glossaryTermItem.setTermRelations(TermRelationsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    glossaryTermItem.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("updatedBy", targetDepth)) {
                    context.nextToken();
                    glossaryTermItem.setUpdatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return glossaryTermItem;
    }

    private static GlossaryTermItemJsonUnmarshaller instance;

    public static GlossaryTermItemJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GlossaryTermItemJsonUnmarshaller();
        return instance;
    }
}
