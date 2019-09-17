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
package com.amazonaws.services.textract.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.textract.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetDocumentTextDetectionResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDocumentTextDetectionResultJsonUnmarshaller implements Unmarshaller<GetDocumentTextDetectionResult, JsonUnmarshallerContext> {

    public GetDocumentTextDetectionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetDocumentTextDetectionResult getDocumentTextDetectionResult = new GetDocumentTextDetectionResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getDocumentTextDetectionResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("DocumentMetadata", targetDepth)) {
                    context.nextToken();
                    getDocumentTextDetectionResult.setDocumentMetadata(DocumentMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("JobStatus", targetDepth)) {
                    context.nextToken();
                    getDocumentTextDetectionResult.setJobStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NextToken", targetDepth)) {
                    context.nextToken();
                    getDocumentTextDetectionResult.setNextToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Blocks", targetDepth)) {
                    context.nextToken();
                    getDocumentTextDetectionResult.setBlocks(new ListUnmarshaller<Block>(BlockJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("Warnings", targetDepth)) {
                    context.nextToken();
                    getDocumentTextDetectionResult.setWarnings(new ListUnmarshaller<Warning>(WarningJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("StatusMessage", targetDepth)) {
                    context.nextToken();
                    getDocumentTextDetectionResult.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getDocumentTextDetectionResult;
    }

    private static GetDocumentTextDetectionResultJsonUnmarshaller instance;

    public static GetDocumentTextDetectionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetDocumentTextDetectionResultJsonUnmarshaller();
        return instance;
    }
}
