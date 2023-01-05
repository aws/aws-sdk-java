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
package com.amazonaws.services.sagemakergeospatial.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemakergeospatial.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ExportEarthObservationJobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportEarthObservationJobResultJsonUnmarshaller implements Unmarshaller<ExportEarthObservationJobResult, JsonUnmarshallerContext> {

    public ExportEarthObservationJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ExportEarthObservationJobResult exportEarthObservationJobResult = new ExportEarthObservationJobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return exportEarthObservationJobResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    exportEarthObservationJobResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    exportEarthObservationJobResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ExecutionRoleArn", targetDepth)) {
                    context.nextToken();
                    exportEarthObservationJobResult.setExecutionRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExportSourceImages", targetDepth)) {
                    context.nextToken();
                    exportEarthObservationJobResult.setExportSourceImages(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ExportStatus", targetDepth)) {
                    context.nextToken();
                    exportEarthObservationJobResult.setExportStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OutputConfig", targetDepth)) {
                    context.nextToken();
                    exportEarthObservationJobResult.setOutputConfig(OutputConfigInputJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return exportEarthObservationJobResult;
    }

    private static ExportEarthObservationJobResultJsonUnmarshaller instance;

    public static ExportEarthObservationJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ExportEarthObservationJobResultJsonUnmarshaller();
        return instance;
    }
}
