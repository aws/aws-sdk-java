/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AutoMLCandidate JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoMLCandidateJsonUnmarshaller implements Unmarshaller<AutoMLCandidate, JsonUnmarshallerContext> {

    public AutoMLCandidate unmarshall(JsonUnmarshallerContext context) throws Exception {
        AutoMLCandidate autoMLCandidate = new AutoMLCandidate();

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
                if (context.testExpression("CandidateName", targetDepth)) {
                    context.nextToken();
                    autoMLCandidate.setCandidateName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FinalAutoMLJobObjectiveMetric", targetDepth)) {
                    context.nextToken();
                    autoMLCandidate.setFinalAutoMLJobObjectiveMetric(FinalAutoMLJobObjectiveMetricJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ObjectiveStatus", targetDepth)) {
                    context.nextToken();
                    autoMLCandidate.setObjectiveStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CandidateSteps", targetDepth)) {
                    context.nextToken();
                    autoMLCandidate.setCandidateSteps(new ListUnmarshaller<AutoMLCandidateStep>(AutoMLCandidateStepJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("CandidateStatus", targetDepth)) {
                    context.nextToken();
                    autoMLCandidate.setCandidateStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InferenceContainers", targetDepth)) {
                    context.nextToken();
                    autoMLCandidate.setInferenceContainers(new ListUnmarshaller<AutoMLContainerDefinition>(AutoMLContainerDefinitionJsonUnmarshaller
                            .getInstance()).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    autoMLCandidate.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EndTime", targetDepth)) {
                    context.nextToken();
                    autoMLCandidate.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    context.nextToken();
                    autoMLCandidate.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("FailureReason", targetDepth)) {
                    context.nextToken();
                    autoMLCandidate.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return autoMLCandidate;
    }

    private static AutoMLCandidateJsonUnmarshaller instance;

    public static AutoMLCandidateJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AutoMLCandidateJsonUnmarshaller();
        return instance;
    }
}
