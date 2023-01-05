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
 * GetEarthObservationJobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEarthObservationJobResultJsonUnmarshaller implements Unmarshaller<GetEarthObservationJobResult, JsonUnmarshallerContext> {

    public GetEarthObservationJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetEarthObservationJobResult getEarthObservationJobResult = new GetEarthObservationJobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getEarthObservationJobResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    getEarthObservationJobResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    getEarthObservationJobResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("DurationInSeconds", targetDepth)) {
                    context.nextToken();
                    getEarthObservationJobResult.setDurationInSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ErrorDetails", targetDepth)) {
                    context.nextToken();
                    getEarthObservationJobResult.setErrorDetails(EarthObservationJobErrorDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ExecutionRoleArn", targetDepth)) {
                    context.nextToken();
                    getEarthObservationJobResult.setExecutionRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExportErrorDetails", targetDepth)) {
                    context.nextToken();
                    getEarthObservationJobResult.setExportErrorDetails(ExportErrorDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ExportStatus", targetDepth)) {
                    context.nextToken();
                    getEarthObservationJobResult.setExportStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InputConfig", targetDepth)) {
                    context.nextToken();
                    getEarthObservationJobResult.setInputConfig(InputConfigOutputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("JobConfig", targetDepth)) {
                    context.nextToken();
                    getEarthObservationJobResult.setJobConfig(JobConfigInputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("KmsKeyId", targetDepth)) {
                    context.nextToken();
                    getEarthObservationJobResult.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    getEarthObservationJobResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OutputBands", targetDepth)) {
                    context.nextToken();
                    getEarthObservationJobResult.setOutputBands(new ListUnmarshaller<OutputBand>(OutputBandJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    getEarthObservationJobResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    getEarthObservationJobResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getEarthObservationJobResult;
    }

    private static GetEarthObservationJobResultJsonUnmarshaller instance;

    public static GetEarthObservationJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetEarthObservationJobResultJsonUnmarshaller();
        return instance;
    }
}
