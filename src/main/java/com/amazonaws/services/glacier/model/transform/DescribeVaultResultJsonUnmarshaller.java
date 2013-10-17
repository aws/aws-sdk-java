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

package com.amazonaws.services.glacier.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.glacier.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;


/**
 * Describe Vault Result JSON Unmarshaller
 */
public class DescribeVaultResultJsonUnmarshaller implements Unmarshaller<DescribeVaultResult, JsonUnmarshallerContext> {

    

    public DescribeVaultResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeVaultResult describeVaultResult = new DescribeVaultResult();

        
        
        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.currentToken;
        if (token == null) token = context.nextToken();
        if (token == VALUE_NULL) return null;

        while (true) {
            if (token == null) break;

            
            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("VaultARN", targetDepth)) {
                    context.nextToken();
                    describeVaultResult.setVaultARN(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("VaultName", targetDepth)) {
                    context.nextToken();
                    describeVaultResult.setVaultName(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreationDate", targetDepth)) {
                    context.nextToken();
                    describeVaultResult.setCreationDate(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LastInventoryDate", targetDepth)) {
                    context.nextToken();
                    describeVaultResult.setLastInventoryDate(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("NumberOfArchives", targetDepth)) {
                    context.nextToken();
                    describeVaultResult.setNumberOfArchives(LongJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SizeInBytes", targetDepth)) {
                    context.nextToken();
                    describeVaultResult.setSizeInBytes(LongJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth) break;
                }
            }
            

            token = context.nextToken();
        }
        
        return describeVaultResult;
    }

    private static DescribeVaultResultJsonUnmarshaller instance;
    public static DescribeVaultResultJsonUnmarshaller getInstance() {
        if (instance == null) instance = new DescribeVaultResultJsonUnmarshaller();
        return instance;
    }
}
    