/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.datapipeline.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.datapipeline.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;


/**
 * Describe Objects Result JSON Unmarshaller
 */
public class DescribeObjectsResultJsonUnmarshaller implements Unmarshaller<DescribeObjectsResult, JsonUnmarshallerContext> {

    

    public DescribeObjectsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeObjectsResult describeObjectsResult = new DescribeObjectsResult();

        
        
        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.currentToken;
        if (token == null) token = context.nextToken();
        if (token == VALUE_NULL) return null;

        while (true) {
            if (token == null) break;

            
            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("pipelineObjects", targetDepth)) {
                    describeObjectsResult.setPipelineObjects(new ListUnmarshaller<PipelineObject>(PipelineObjectJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("marker", targetDepth)) {
                    context.nextToken();
                    describeObjectsResult.setMarker(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("hasMoreResults", targetDepth)) {
                    context.nextToken();
                    describeObjectsResult.setHasMoreResults(BooleanJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth) break;
                }
            }
            

            token = context.nextToken();
        }
        
        return describeObjectsResult;
    }

    private static DescribeObjectsResultJsonUnmarshaller instance;
    public static DescribeObjectsResultJsonUnmarshaller getInstance() {
        if (instance == null) instance = new DescribeObjectsResultJsonUnmarshaller();
        return instance;
    }
}
    