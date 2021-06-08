/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codebuild.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.codebuild.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * BuildBatchPhase JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BuildBatchPhaseJsonUnmarshaller implements Unmarshaller<BuildBatchPhase, JsonUnmarshallerContext> {

    public BuildBatchPhase unmarshall(JsonUnmarshallerContext context) throws Exception {
        BuildBatchPhase buildBatchPhase = new BuildBatchPhase();

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
                if (context.testExpression("phaseType", targetDepth)) {
                    context.nextToken();
                    buildBatchPhase.setPhaseType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("phaseStatus", targetDepth)) {
                    context.nextToken();
                    buildBatchPhase.setPhaseStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("startTime", targetDepth)) {
                    context.nextToken();
                    buildBatchPhase.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("endTime", targetDepth)) {
                    context.nextToken();
                    buildBatchPhase.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("durationInSeconds", targetDepth)) {
                    context.nextToken();
                    buildBatchPhase.setDurationInSeconds(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("contexts", targetDepth)) {
                    context.nextToken();
                    buildBatchPhase.setContexts(new ListUnmarshaller<PhaseContext>(PhaseContextJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return buildBatchPhase;
    }

    private static BuildBatchPhaseJsonUnmarshaller instance;

    public static BuildBatchPhaseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BuildBatchPhaseJsonUnmarshaller();
        return instance;
    }
}
