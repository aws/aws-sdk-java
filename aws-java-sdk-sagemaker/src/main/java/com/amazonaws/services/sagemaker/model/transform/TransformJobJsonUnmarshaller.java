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
package com.amazonaws.services.sagemaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * TransformJob JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransformJobJsonUnmarshaller implements Unmarshaller<TransformJob, JsonUnmarshallerContext> {

    public TransformJob unmarshall(JsonUnmarshallerContext context) throws Exception {
        TransformJob transformJob = new TransformJob();

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
                if (context.testExpression("TransformJobName", targetDepth)) {
                    context.nextToken();
                    transformJob.setTransformJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TransformJobArn", targetDepth)) {
                    context.nextToken();
                    transformJob.setTransformJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TransformJobStatus", targetDepth)) {
                    context.nextToken();
                    transformJob.setTransformJobStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FailureReason", targetDepth)) {
                    context.nextToken();
                    transformJob.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelName", targetDepth)) {
                    context.nextToken();
                    transformJob.setModelName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaxConcurrentTransforms", targetDepth)) {
                    context.nextToken();
                    transformJob.setMaxConcurrentTransforms(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ModelClientConfig", targetDepth)) {
                    context.nextToken();
                    transformJob.setModelClientConfig(ModelClientConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MaxPayloadInMB", targetDepth)) {
                    context.nextToken();
                    transformJob.setMaxPayloadInMB(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("BatchStrategy", targetDepth)) {
                    context.nextToken();
                    transformJob.setBatchStrategy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Environment", targetDepth)) {
                    context.nextToken();
                    transformJob.setEnvironment(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("TransformInput", targetDepth)) {
                    context.nextToken();
                    transformJob.setTransformInput(TransformInputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TransformOutput", targetDepth)) {
                    context.nextToken();
                    transformJob.setTransformOutput(TransformOutputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TransformResources", targetDepth)) {
                    context.nextToken();
                    transformJob.setTransformResources(TransformResourcesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    transformJob.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("TransformStartTime", targetDepth)) {
                    context.nextToken();
                    transformJob.setTransformStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("TransformEndTime", targetDepth)) {
                    context.nextToken();
                    transformJob.setTransformEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LabelingJobArn", targetDepth)) {
                    context.nextToken();
                    transformJob.setLabelingJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AutoMLJobArn", targetDepth)) {
                    context.nextToken();
                    transformJob.setAutoMLJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DataProcessing", targetDepth)) {
                    context.nextToken();
                    transformJob.setDataProcessing(DataProcessingJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ExperimentConfig", targetDepth)) {
                    context.nextToken();
                    transformJob.setExperimentConfig(ExperimentConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    transformJob.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

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

        return transformJob;
    }

    private static TransformJobJsonUnmarshaller instance;

    public static TransformJobJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TransformJobJsonUnmarshaller();
        return instance;
    }
}
