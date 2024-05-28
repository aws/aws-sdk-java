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
package com.amazonaws.services.cleanroomsml.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cleanroomsml.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetAudienceGenerationJobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAudienceGenerationJobResultJsonUnmarshaller implements Unmarshaller<GetAudienceGenerationJobResult, JsonUnmarshallerContext> {

    public GetAudienceGenerationJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetAudienceGenerationJobResult getAudienceGenerationJobResult = new GetAudienceGenerationJobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getAudienceGenerationJobResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("audienceGenerationJobArn", targetDepth)) {
                    context.nextToken();
                    getAudienceGenerationJobResult.setAudienceGenerationJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("collaborationId", targetDepth)) {
                    context.nextToken();
                    getAudienceGenerationJobResult.setCollaborationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("configuredAudienceModelArn", targetDepth)) {
                    context.nextToken();
                    getAudienceGenerationJobResult.setConfiguredAudienceModelArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createTime", targetDepth)) {
                    context.nextToken();
                    getAudienceGenerationJobResult.setCreateTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    getAudienceGenerationJobResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("includeSeedInOutput", targetDepth)) {
                    context.nextToken();
                    getAudienceGenerationJobResult.setIncludeSeedInOutput(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("metrics", targetDepth)) {
                    context.nextToken();
                    getAudienceGenerationJobResult.setMetrics(AudienceQualityMetricsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    getAudienceGenerationJobResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("seedAudience", targetDepth)) {
                    context.nextToken();
                    getAudienceGenerationJobResult.setSeedAudience(AudienceGenerationJobDataSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("startedBy", targetDepth)) {
                    context.nextToken();
                    getAudienceGenerationJobResult.setStartedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    getAudienceGenerationJobResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusDetails", targetDepth)) {
                    context.nextToken();
                    getAudienceGenerationJobResult.setStatusDetails(StatusDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    getAudienceGenerationJobResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("updateTime", targetDepth)) {
                    context.nextToken();
                    getAudienceGenerationJobResult.setUpdateTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getAudienceGenerationJobResult;
    }

    private static GetAudienceGenerationJobResultJsonUnmarshaller instance;

    public static GetAudienceGenerationJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetAudienceGenerationJobResultJsonUnmarshaller();
        return instance;
    }
}
