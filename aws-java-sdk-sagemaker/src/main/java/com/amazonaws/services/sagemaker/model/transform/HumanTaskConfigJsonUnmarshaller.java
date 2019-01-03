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
 * HumanTaskConfig JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HumanTaskConfigJsonUnmarshaller implements Unmarshaller<HumanTaskConfig, JsonUnmarshallerContext> {

    public HumanTaskConfig unmarshall(JsonUnmarshallerContext context) throws Exception {
        HumanTaskConfig humanTaskConfig = new HumanTaskConfig();

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
                if (context.testExpression("WorkteamArn", targetDepth)) {
                    context.nextToken();
                    humanTaskConfig.setWorkteamArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UiConfig", targetDepth)) {
                    context.nextToken();
                    humanTaskConfig.setUiConfig(UiConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PreHumanTaskLambdaArn", targetDepth)) {
                    context.nextToken();
                    humanTaskConfig.setPreHumanTaskLambdaArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TaskKeywords", targetDepth)) {
                    context.nextToken();
                    humanTaskConfig.setTaskKeywords(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("TaskTitle", targetDepth)) {
                    context.nextToken();
                    humanTaskConfig.setTaskTitle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TaskDescription", targetDepth)) {
                    context.nextToken();
                    humanTaskConfig.setTaskDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NumberOfHumanWorkersPerDataObject", targetDepth)) {
                    context.nextToken();
                    humanTaskConfig.setNumberOfHumanWorkersPerDataObject(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("TaskTimeLimitInSeconds", targetDepth)) {
                    context.nextToken();
                    humanTaskConfig.setTaskTimeLimitInSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("TaskAvailabilityLifetimeInSeconds", targetDepth)) {
                    context.nextToken();
                    humanTaskConfig.setTaskAvailabilityLifetimeInSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MaxConcurrentTaskCount", targetDepth)) {
                    context.nextToken();
                    humanTaskConfig.setMaxConcurrentTaskCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("AnnotationConsolidationConfig", targetDepth)) {
                    context.nextToken();
                    humanTaskConfig.setAnnotationConsolidationConfig(AnnotationConsolidationConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PublicWorkforceTaskPrice", targetDepth)) {
                    context.nextToken();
                    humanTaskConfig.setPublicWorkforceTaskPrice(PublicWorkforceTaskPriceJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return humanTaskConfig;
    }

    private static HumanTaskConfigJsonUnmarshaller instance;

    public static HumanTaskConfigJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HumanTaskConfigJsonUnmarshaller();
        return instance;
    }
}
