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
package com.amazonaws.services.textract.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.textract.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetLendingAnalysisSummaryResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLendingAnalysisSummaryResultJsonUnmarshaller implements Unmarshaller<GetLendingAnalysisSummaryResult, JsonUnmarshallerContext> {

    public GetLendingAnalysisSummaryResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetLendingAnalysisSummaryResult getLendingAnalysisSummaryResult = new GetLendingAnalysisSummaryResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getLendingAnalysisSummaryResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("DocumentMetadata", targetDepth)) {
                    context.nextToken();
                    getLendingAnalysisSummaryResult.setDocumentMetadata(DocumentMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("JobStatus", targetDepth)) {
                    context.nextToken();
                    getLendingAnalysisSummaryResult.setJobStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Summary", targetDepth)) {
                    context.nextToken();
                    getLendingAnalysisSummaryResult.setSummary(LendingSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Warnings", targetDepth)) {
                    context.nextToken();
                    getLendingAnalysisSummaryResult.setWarnings(new ListUnmarshaller<Warning>(WarningJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("StatusMessage", targetDepth)) {
                    context.nextToken();
                    getLendingAnalysisSummaryResult.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AnalyzeLendingModelVersion", targetDepth)) {
                    context.nextToken();
                    getLendingAnalysisSummaryResult.setAnalyzeLendingModelVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getLendingAnalysisSummaryResult;
    }

    private static GetLendingAnalysisSummaryResultJsonUnmarshaller instance;

    public static GetLendingAnalysisSummaryResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetLendingAnalysisSummaryResultJsonUnmarshaller();
        return instance;
    }
}
