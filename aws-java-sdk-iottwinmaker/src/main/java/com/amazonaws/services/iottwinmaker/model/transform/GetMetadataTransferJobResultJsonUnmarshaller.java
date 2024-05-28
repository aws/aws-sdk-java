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
package com.amazonaws.services.iottwinmaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iottwinmaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetMetadataTransferJobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMetadataTransferJobResultJsonUnmarshaller implements Unmarshaller<GetMetadataTransferJobResult, JsonUnmarshallerContext> {

    public GetMetadataTransferJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetMetadataTransferJobResult getMetadataTransferJobResult = new GetMetadataTransferJobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getMetadataTransferJobResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("metadataTransferJobId", targetDepth)) {
                    context.nextToken();
                    getMetadataTransferJobResult.setMetadataTransferJobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    getMetadataTransferJobResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    getMetadataTransferJobResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sources", targetDepth)) {
                    context.nextToken();
                    getMetadataTransferJobResult.setSources(new ListUnmarshaller<SourceConfiguration>(SourceConfigurationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("destination", targetDepth)) {
                    context.nextToken();
                    getMetadataTransferJobResult.setDestination(DestinationConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("metadataTransferJobRole", targetDepth)) {
                    context.nextToken();
                    getMetadataTransferJobResult.setMetadataTransferJobRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("reportUrl", targetDepth)) {
                    context.nextToken();
                    getMetadataTransferJobResult.setReportUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationDateTime", targetDepth)) {
                    context.nextToken();
                    getMetadataTransferJobResult.setCreationDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("updateDateTime", targetDepth)) {
                    context.nextToken();
                    getMetadataTransferJobResult.setUpdateDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    getMetadataTransferJobResult.setStatus(MetadataTransferJobStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("progress", targetDepth)) {
                    context.nextToken();
                    getMetadataTransferJobResult.setProgress(MetadataTransferJobProgressJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getMetadataTransferJobResult;
    }

    private static GetMetadataTransferJobResultJsonUnmarshaller instance;

    public static GetMetadataTransferJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetMetadataTransferJobResultJsonUnmarshaller();
        return instance;
    }
}
