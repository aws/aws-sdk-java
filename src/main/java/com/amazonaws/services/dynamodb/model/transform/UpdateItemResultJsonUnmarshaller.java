/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.dynamodb.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.dynamodb.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import org.codehaus.jackson.JsonToken;
import static org.codehaus.jackson.JsonToken.*;

/**
 * Update Item Result JSON Unmarshaller
 */
public class UpdateItemResultJsonUnmarshaller implements Unmarshaller<UpdateItemResult, JsonUnmarshallerContext> {

    

    public UpdateItemResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateItemResult updateItemResult = new UpdateItemResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.currentToken;
        if (token == null) token = context.nextToken();

        while (true) {
            if (token == null) return updateItemResult;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Attributes", targetDepth)) {
                    updateItemResult.setAttributes(new MapUnmarshaller<String,AttributeValue>(StringJsonUnmarshaller.getInstance(), AttributeValueJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("ConsumedCapacityUnits", targetDepth)) {
                    context.nextToken();
                    updateItemResult.setConsumedCapacityUnits(DoubleJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getCurrentDepth() <= originalDepth) {
                    return updateItemResult;
                }
            }
            token = context.nextToken();
        }
    }

    private static UpdateItemResultJsonUnmarshaller instance;
    public static UpdateItemResultJsonUnmarshaller getInstance() {
        if (instance == null) instance = new UpdateItemResultJsonUnmarshaller();
        return instance;
    }
}
    