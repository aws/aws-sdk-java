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
package com.amazonaws.services.resourceexplorer2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.resourceexplorer2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * View JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ViewJsonUnmarshaller implements Unmarshaller<View, JsonUnmarshallerContext> {

    public View unmarshall(JsonUnmarshallerContext context) throws Exception {
        View view = new View();

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
                if (context.testExpression("Filters", targetDepth)) {
                    context.nextToken();
                    view.setFilters(SearchFilterJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("IncludedProperties", targetDepth)) {
                    context.nextToken();
                    view.setIncludedProperties(new ListUnmarshaller<IncludedProperty>(IncludedPropertyJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("LastUpdatedAt", targetDepth)) {
                    context.nextToken();
                    view.setLastUpdatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("Owner", targetDepth)) {
                    context.nextToken();
                    view.setOwner(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Scope", targetDepth)) {
                    context.nextToken();
                    view.setScope(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ViewArn", targetDepth)) {
                    context.nextToken();
                    view.setViewArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return view;
    }

    private static ViewJsonUnmarshaller instance;

    public static ViewJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ViewJsonUnmarshaller();
        return instance;
    }
}
