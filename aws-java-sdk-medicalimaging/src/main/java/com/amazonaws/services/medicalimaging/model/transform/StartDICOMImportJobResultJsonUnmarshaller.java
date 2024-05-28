/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.medicalimaging.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.medicalimaging.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * StartDICOMImportJobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartDICOMImportJobResultJsonUnmarshaller implements Unmarshaller<StartDICOMImportJobResult, JsonUnmarshallerContext> {

    public StartDICOMImportJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        StartDICOMImportJobResult startDICOMImportJobResult = new StartDICOMImportJobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return startDICOMImportJobResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("datastoreId", targetDepth)) {
                    context.nextToken();
                    startDICOMImportJobResult.setDatastoreId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("jobId", targetDepth)) {
                    context.nextToken();
                    startDICOMImportJobResult.setJobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("jobStatus", targetDepth)) {
                    context.nextToken();
                    startDICOMImportJobResult.setJobStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("submittedAt", targetDepth)) {
                    context.nextToken();
                    startDICOMImportJobResult.setSubmittedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return startDICOMImportJobResult;
    }

    private static StartDICOMImportJobResultJsonUnmarshaller instance;

    public static StartDICOMImportJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StartDICOMImportJobResultJsonUnmarshaller();
        return instance;
    }
}
