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
package com.amazonaws.services.sagemaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * TrainingSpecification JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrainingSpecificationJsonUnmarshaller implements Unmarshaller<TrainingSpecification, JsonUnmarshallerContext> {

    public TrainingSpecification unmarshall(JsonUnmarshallerContext context) throws Exception {
        TrainingSpecification trainingSpecification = new TrainingSpecification();

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
                if (context.testExpression("TrainingImage", targetDepth)) {
                    context.nextToken();
                    trainingSpecification.setTrainingImage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TrainingImageDigest", targetDepth)) {
                    context.nextToken();
                    trainingSpecification.setTrainingImageDigest(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SupportedHyperParameters", targetDepth)) {
                    context.nextToken();
                    trainingSpecification.setSupportedHyperParameters(new ListUnmarshaller<HyperParameterSpecification>(
                            HyperParameterSpecificationJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("SupportedTrainingInstanceTypes", targetDepth)) {
                    context.nextToken();
                    trainingSpecification.setSupportedTrainingInstanceTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("SupportsDistributedTraining", targetDepth)) {
                    context.nextToken();
                    trainingSpecification.setSupportsDistributedTraining(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("MetricDefinitions", targetDepth)) {
                    context.nextToken();
                    trainingSpecification.setMetricDefinitions(new ListUnmarshaller<MetricDefinition>(MetricDefinitionJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("TrainingChannels", targetDepth)) {
                    context.nextToken();
                    trainingSpecification.setTrainingChannels(new ListUnmarshaller<ChannelSpecification>(ChannelSpecificationJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("SupportedTuningJobObjectiveMetrics", targetDepth)) {
                    context.nextToken();
                    trainingSpecification.setSupportedTuningJobObjectiveMetrics(new ListUnmarshaller<HyperParameterTuningJobObjective>(
                            HyperParameterTuningJobObjectiveJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return trainingSpecification;
    }

    private static TrainingSpecificationJsonUnmarshaller instance;

    public static TrainingSpecificationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TrainingSpecificationJsonUnmarshaller();
        return instance;
    }
}
