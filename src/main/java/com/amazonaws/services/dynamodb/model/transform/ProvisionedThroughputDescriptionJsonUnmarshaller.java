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
 * Provisioned Throughput Description JSON Unmarshaller
 */
public class ProvisionedThroughputDescriptionJsonUnmarshaller implements Unmarshaller<ProvisionedThroughputDescription, JsonUnmarshallerContext> {

    

    public ProvisionedThroughputDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        ProvisionedThroughputDescription provisionedThroughputDescription = new ProvisionedThroughputDescription();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.currentToken;
        if (token == null) token = context.nextToken();

        while (true) {
            if (token == null) return provisionedThroughputDescription;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("LastIncreaseDateTime", targetDepth)) {
                    context.nextToken();
                    provisionedThroughputDescription.setLastIncreaseDateTime(DateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LastDecreaseDateTime", targetDepth)) {
                    context.nextToken();
                    provisionedThroughputDescription.setLastDecreaseDateTime(DateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ReadCapacityUnits", targetDepth)) {
                    context.nextToken();
                    provisionedThroughputDescription.setReadCapacityUnits(LongJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("WriteCapacityUnits", targetDepth)) {
                    context.nextToken();
                    provisionedThroughputDescription.setWriteCapacityUnits(LongJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getCurrentDepth() <= originalDepth) {
                    return provisionedThroughputDescription;
                }
            }
            token = context.nextToken();
        }
    }

    private static ProvisionedThroughputDescriptionJsonUnmarshaller instance;
    public static ProvisionedThroughputDescriptionJsonUnmarshaller getInstance() {
        if (instance == null) instance = new ProvisionedThroughputDescriptionJsonUnmarshaller();
        return instance;
    }
}
    