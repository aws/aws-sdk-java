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
 * Describe Job Result JSON Unmarshaller
 */
public class DescribeJobResultJsonUnmarshaller implements Unmarshaller<DescribeJobResult, JsonUnmarshallerContext> {

    

    public DescribeJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeJobResult describeJobResult = new DescribeJobResult();

        
        
        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.currentToken;
        if (token == null) token = context.nextToken();
        if (token == VALUE_NULL) return null;

        while (true) {
            if (token == null) break;

            
            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("JobId", targetDepth)) {
                    context.nextToken();
                    describeJobResult.setJobId(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("JobDescription", targetDepth)) {
                    context.nextToken();
                    describeJobResult.setJobDescription(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Action", targetDepth)) {
                    context.nextToken();
                    describeJobResult.setAction(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ArchiveId", targetDepth)) {
                    context.nextToken();
                    describeJobResult.setArchiveId(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("VaultARN", targetDepth)) {
                    context.nextToken();
                    describeJobResult.setVaultARN(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreationDate", targetDepth)) {
                    context.nextToken();
                    describeJobResult.setCreationDate(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Completed", targetDepth)) {
                    context.nextToken();
                    describeJobResult.setCompleted(BooleanJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("StatusCode", targetDepth)) {
                    context.nextToken();
                    describeJobResult.setStatusCode(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("StatusMessage", targetDepth)) {
                    context.nextToken();
                    describeJobResult.setStatusMessage(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ArchiveSizeInBytes", targetDepth)) {
                    context.nextToken();
                    describeJobResult.setArchiveSizeInBytes(LongJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("InventorySizeInBytes", targetDepth)) {
                    context.nextToken();
                    describeJobResult.setInventorySizeInBytes(LongJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SNSTopic", targetDepth)) {
                    context.nextToken();
                    describeJobResult.setSNSTopic(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CompletionDate", targetDepth)) {
                    context.nextToken();
                    describeJobResult.setCompletionDate(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SHA256TreeHash", targetDepth)) {
                    context.nextToken();
                    describeJobResult.setSHA256TreeHash(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ArchiveSHA256TreeHash", targetDepth)) {
                    context.nextToken();
                    describeJobResult.setArchiveSHA256TreeHash(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RetrievalByteRange", targetDepth)) {
                    context.nextToken();
                    describeJobResult.setRetrievalByteRange(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth) break;
                }
            }
            

            token = context.nextToken();
        }
        
        return describeJobResult;
    }

    private static DescribeJobResultJsonUnmarshaller instance;
    public static DescribeJobResultJsonUnmarshaller getInstance() {
        if (instance == null) instance = new DescribeJobResultJsonUnmarshaller();
        return instance;
    }
}
    