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
 * DescribeLabelingJobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLabelingJobResultJsonUnmarshaller implements Unmarshaller<DescribeLabelingJobResult, JsonUnmarshallerContext> {

    public DescribeLabelingJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeLabelingJobResult describeLabelingJobResult = new DescribeLabelingJobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeLabelingJobResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("LabelingJobStatus", targetDepth)) {
                    context.nextToken();
                    describeLabelingJobResult.setLabelingJobStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LabelCounters", targetDepth)) {
                    context.nextToken();
                    describeLabelingJobResult.setLabelCounters(LabelCountersJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("FailureReason", targetDepth)) {
                    context.nextToken();
                    describeLabelingJobResult.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    describeLabelingJobResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    context.nextToken();
                    describeLabelingJobResult.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("JobReferenceCode", targetDepth)) {
                    context.nextToken();
                    describeLabelingJobResult.setJobReferenceCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LabelingJobName", targetDepth)) {
                    context.nextToken();
                    describeLabelingJobResult.setLabelingJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LabelingJobArn", targetDepth)) {
                    context.nextToken();
                    describeLabelingJobResult.setLabelingJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LabelAttributeName", targetDepth)) {
                    context.nextToken();
                    describeLabelingJobResult.setLabelAttributeName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InputConfig", targetDepth)) {
                    context.nextToken();
                    describeLabelingJobResult.setInputConfig(LabelingJobInputConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("OutputConfig", targetDepth)) {
                    context.nextToken();
                    describeLabelingJobResult.setOutputConfig(LabelingJobOutputConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    context.nextToken();
                    describeLabelingJobResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LabelCategoryConfigS3Uri", targetDepth)) {
                    context.nextToken();
                    describeLabelingJobResult.setLabelCategoryConfigS3Uri(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StoppingConditions", targetDepth)) {
                    context.nextToken();
                    describeLabelingJobResult.setStoppingConditions(LabelingJobStoppingConditionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LabelingJobAlgorithmsConfig", targetDepth)) {
                    context.nextToken();
                    describeLabelingJobResult.setLabelingJobAlgorithmsConfig(LabelingJobAlgorithmsConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("HumanTaskConfig", targetDepth)) {
                    context.nextToken();
                    describeLabelingJobResult.setHumanTaskConfig(HumanTaskConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    describeLabelingJobResult.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("LabelingJobOutput", targetDepth)) {
                    context.nextToken();
                    describeLabelingJobResult.setLabelingJobOutput(LabelingJobOutputJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeLabelingJobResult;
    }

    private static DescribeLabelingJobResultJsonUnmarshaller instance;

    public static DescribeLabelingJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeLabelingJobResultJsonUnmarshaller();
        return instance;
    }
}
