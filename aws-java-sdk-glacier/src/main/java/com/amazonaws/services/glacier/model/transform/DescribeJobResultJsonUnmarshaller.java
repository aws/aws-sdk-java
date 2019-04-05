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
package com.amazonaws.services.glacier.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.glacier.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeJobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeJobResultJsonUnmarshaller implements Unmarshaller<DescribeJobResult, JsonUnmarshallerContext> {

    public DescribeJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeJobResult describeJobResult = new DescribeJobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeJobResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("JobId", targetDepth)) {
                    context.nextToken();
                    describeJobResult.setJobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("JobDescription", targetDepth)) {
                    context.nextToken();
                    describeJobResult.setJobDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Action", targetDepth)) {
                    context.nextToken();
                    describeJobResult.setAction(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ArchiveId", targetDepth)) {
                    context.nextToken();
                    describeJobResult.setArchiveId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VaultARN", targetDepth)) {
                    context.nextToken();
                    describeJobResult.setVaultARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationDate", targetDepth)) {
                    context.nextToken();
                    describeJobResult.setCreationDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Completed", targetDepth)) {
                    context.nextToken();
                    describeJobResult.setCompleted(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("StatusCode", targetDepth)) {
                    context.nextToken();
                    describeJobResult.setStatusCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusMessage", targetDepth)) {
                    context.nextToken();
                    describeJobResult.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ArchiveSizeInBytes", targetDepth)) {
                    context.nextToken();
                    describeJobResult.setArchiveSizeInBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("InventorySizeInBytes", targetDepth)) {
                    context.nextToken();
                    describeJobResult.setInventorySizeInBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("SNSTopic", targetDepth)) {
                    context.nextToken();
                    describeJobResult.setSNSTopic(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CompletionDate", targetDepth)) {
                    context.nextToken();
                    describeJobResult.setCompletionDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SHA256TreeHash", targetDepth)) {
                    context.nextToken();
                    describeJobResult.setSHA256TreeHash(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ArchiveSHA256TreeHash", targetDepth)) {
                    context.nextToken();
                    describeJobResult.setArchiveSHA256TreeHash(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RetrievalByteRange", targetDepth)) {
                    context.nextToken();
                    describeJobResult.setRetrievalByteRange(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tier", targetDepth)) {
                    context.nextToken();
                    describeJobResult.setTier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InventoryRetrievalParameters", targetDepth)) {
                    context.nextToken();
                    describeJobResult.setInventoryRetrievalParameters(InventoryRetrievalJobDescriptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("JobOutputPath", targetDepth)) {
                    context.nextToken();
                    describeJobResult.setJobOutputPath(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SelectParameters", targetDepth)) {
                    context.nextToken();
                    describeJobResult.setSelectParameters(SelectParametersJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("OutputLocation", targetDepth)) {
                    context.nextToken();
                    describeJobResult.setOutputLocation(OutputLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeJobResult;
    }

    private static DescribeJobResultJsonUnmarshaller instance;

    public static DescribeJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeJobResultJsonUnmarshaller();
        return instance;
    }
}
