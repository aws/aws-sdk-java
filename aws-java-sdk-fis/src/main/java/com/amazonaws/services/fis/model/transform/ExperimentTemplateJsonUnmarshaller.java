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
package com.amazonaws.services.fis.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.fis.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ExperimentTemplate JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExperimentTemplateJsonUnmarshaller implements Unmarshaller<ExperimentTemplate, JsonUnmarshallerContext> {

    public ExperimentTemplate unmarshall(JsonUnmarshallerContext context) throws Exception {
        ExperimentTemplate experimentTemplate = new ExperimentTemplate();

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
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    experimentTemplate.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    experimentTemplate.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("targets", targetDepth)) {
                    context.nextToken();
                    experimentTemplate.setTargets(new MapUnmarshaller<String, ExperimentTemplateTarget>(context.getUnmarshaller(String.class),
                            ExperimentTemplateTargetJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("actions", targetDepth)) {
                    context.nextToken();
                    experimentTemplate.setActions(new MapUnmarshaller<String, ExperimentTemplateAction>(context.getUnmarshaller(String.class),
                            ExperimentTemplateActionJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("stopConditions", targetDepth)) {
                    context.nextToken();
                    experimentTemplate.setStopConditions(new ListUnmarshaller<ExperimentTemplateStopCondition>(ExperimentTemplateStopConditionJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("creationTime", targetDepth)) {
                    context.nextToken();
                    experimentTemplate.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastUpdateTime", targetDepth)) {
                    context.nextToken();
                    experimentTemplate.setLastUpdateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("roleArn", targetDepth)) {
                    context.nextToken();
                    experimentTemplate.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    experimentTemplate
                            .setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
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

        return experimentTemplate;
    }

    private static ExperimentTemplateJsonUnmarshaller instance;

    public static ExperimentTemplateJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ExperimentTemplateJsonUnmarshaller();
        return instance;
    }
}
