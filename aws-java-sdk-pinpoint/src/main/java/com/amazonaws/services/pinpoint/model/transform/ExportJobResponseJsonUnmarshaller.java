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
package com.amazonaws.services.pinpoint.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ExportJobResponse JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportJobResponseJsonUnmarshaller implements Unmarshaller<ExportJobResponse, JsonUnmarshallerContext> {

    public ExportJobResponse unmarshall(JsonUnmarshallerContext context) throws Exception {
        ExportJobResponse exportJobResponse = new ExportJobResponse();

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
                if (context.testExpression("ApplicationId", targetDepth)) {
                    context.nextToken();
                    exportJobResponse.setApplicationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CompletedPieces", targetDepth)) {
                    context.nextToken();
                    exportJobResponse.setCompletedPieces(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("CompletionDate", targetDepth)) {
                    context.nextToken();
                    exportJobResponse.setCompletionDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationDate", targetDepth)) {
                    context.nextToken();
                    exportJobResponse.setCreationDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Definition", targetDepth)) {
                    context.nextToken();
                    exportJobResponse.setDefinition(ExportJobResourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("FailedPieces", targetDepth)) {
                    context.nextToken();
                    exportJobResponse.setFailedPieces(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Failures", targetDepth)) {
                    context.nextToken();
                    exportJobResponse.setFailures(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    exportJobResponse.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("JobStatus", targetDepth)) {
                    context.nextToken();
                    exportJobResponse.setJobStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TotalFailures", targetDepth)) {
                    context.nextToken();
                    exportJobResponse.setTotalFailures(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("TotalPieces", targetDepth)) {
                    context.nextToken();
                    exportJobResponse.setTotalPieces(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("TotalProcessed", targetDepth)) {
                    context.nextToken();
                    exportJobResponse.setTotalProcessed(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    context.nextToken();
                    exportJobResponse.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return exportJobResponse;
    }

    private static ExportJobResponseJsonUnmarshaller instance;

    public static ExportJobResponseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ExportJobResponseJsonUnmarshaller();
        return instance;
    }
}
