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
package com.amazonaws.services.connect.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * HierarchyPath JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HierarchyPathJsonUnmarshaller implements Unmarshaller<HierarchyPath, JsonUnmarshallerContext> {

    public HierarchyPath unmarshall(JsonUnmarshallerContext context) throws Exception {
        HierarchyPath hierarchyPath = new HierarchyPath();

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
                if (context.testExpression("LevelOne", targetDepth)) {
                    context.nextToken();
                    hierarchyPath.setLevelOne(HierarchyGroupSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LevelTwo", targetDepth)) {
                    context.nextToken();
                    hierarchyPath.setLevelTwo(HierarchyGroupSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LevelThree", targetDepth)) {
                    context.nextToken();
                    hierarchyPath.setLevelThree(HierarchyGroupSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LevelFour", targetDepth)) {
                    context.nextToken();
                    hierarchyPath.setLevelFour(HierarchyGroupSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LevelFive", targetDepth)) {
                    context.nextToken();
                    hierarchyPath.setLevelFive(HierarchyGroupSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return hierarchyPath;
    }

    private static HierarchyPathJsonUnmarshaller instance;

    public static HierarchyPathJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HierarchyPathJsonUnmarshaller();
        return instance;
    }
}
