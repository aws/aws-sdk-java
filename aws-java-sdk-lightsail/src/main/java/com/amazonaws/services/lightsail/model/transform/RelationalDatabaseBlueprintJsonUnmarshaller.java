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
package com.amazonaws.services.lightsail.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RelationalDatabaseBlueprint JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RelationalDatabaseBlueprintJsonUnmarshaller implements Unmarshaller<RelationalDatabaseBlueprint, JsonUnmarshallerContext> {

    public RelationalDatabaseBlueprint unmarshall(JsonUnmarshallerContext context) throws Exception {
        RelationalDatabaseBlueprint relationalDatabaseBlueprint = new RelationalDatabaseBlueprint();

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
                if (context.testExpression("blueprintId", targetDepth)) {
                    context.nextToken();
                    relationalDatabaseBlueprint.setBlueprintId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("engine", targetDepth)) {
                    context.nextToken();
                    relationalDatabaseBlueprint.setEngine(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("engineVersion", targetDepth)) {
                    context.nextToken();
                    relationalDatabaseBlueprint.setEngineVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("engineDescription", targetDepth)) {
                    context.nextToken();
                    relationalDatabaseBlueprint.setEngineDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("engineVersionDescription", targetDepth)) {
                    context.nextToken();
                    relationalDatabaseBlueprint.setEngineVersionDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("isEngineDefault", targetDepth)) {
                    context.nextToken();
                    relationalDatabaseBlueprint.setIsEngineDefault(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return relationalDatabaseBlueprint;
    }

    private static RelationalDatabaseBlueprintJsonUnmarshaller instance;

    public static RelationalDatabaseBlueprintJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RelationalDatabaseBlueprintJsonUnmarshaller();
        return instance;
    }
}
