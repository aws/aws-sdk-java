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
 * AudienceExportJobSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AudienceExportJobSummaryJsonUnmarshaller implements Unmarshaller<AudienceExportJobSummary, JsonUnmarshallerContext> {

    public AudienceExportJobSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AudienceExportJobSummary audienceExportJobSummary = new AudienceExportJobSummary();

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
                if (context.testExpression("audienceGenerationJobArn", targetDepth)) {
                    context.nextToken();
                    audienceExportJobSummary.setAudienceGenerationJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("audienceSize", targetDepth)) {
                    context.nextToken();
                    audienceExportJobSummary.setAudienceSize(AudienceSizeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("createTime", targetDepth)) {
                    context.nextToken();
                    audienceExportJobSummary.setCreateTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    audienceExportJobSummary.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    audienceExportJobSummary.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("outputLocation", targetDepth)) {
                    context.nextToken();
                    audienceExportJobSummary.setOutputLocation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    audienceExportJobSummary.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusDetails", targetDepth)) {
                    context.nextToken();
                    audienceExportJobSummary.setStatusDetails(StatusDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("updateTime", targetDepth)) {
                    context.nextToken();
                    audienceExportJobSummary.setUpdateTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return audienceExportJobSummary;
    }

    private static AudienceExportJobSummaryJsonUnmarshaller instance;

    public static AudienceExportJobSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AudienceExportJobSummaryJsonUnmarshaller();
        return instance;
    }
}
