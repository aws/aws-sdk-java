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
 * TrialComponent JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrialComponentJsonUnmarshaller implements Unmarshaller<TrialComponent, JsonUnmarshallerContext> {

    public TrialComponent unmarshall(JsonUnmarshallerContext context) throws Exception {
        TrialComponent trialComponent = new TrialComponent();

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
                if (context.testExpression("TrialComponentName", targetDepth)) {
                    context.nextToken();
                    trialComponent.setTrialComponentName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DisplayName", targetDepth)) {
                    context.nextToken();
                    trialComponent.setDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TrialComponentArn", targetDepth)) {
                    context.nextToken();
                    trialComponent.setTrialComponentArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Source", targetDepth)) {
                    context.nextToken();
                    trialComponent.setSource(TrialComponentSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    trialComponent.setStatus(TrialComponentStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("StartTime", targetDepth)) {
                    context.nextToken();
                    trialComponent.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EndTime", targetDepth)) {
                    context.nextToken();
                    trialComponent.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    trialComponent.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CreatedBy", targetDepth)) {
                    context.nextToken();
                    trialComponent.setCreatedBy(UserContextJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    context.nextToken();
                    trialComponent.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedBy", targetDepth)) {
                    context.nextToken();
                    trialComponent.setLastModifiedBy(UserContextJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Parameters", targetDepth)) {
                    context.nextToken();
                    trialComponent.setParameters(new MapUnmarshaller<String, TrialComponentParameterValue>(context.getUnmarshaller(String.class),
                            TrialComponentParameterValueJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("InputArtifacts", targetDepth)) {
                    context.nextToken();
                    trialComponent.setInputArtifacts(new MapUnmarshaller<String, TrialComponentArtifact>(context.getUnmarshaller(String.class),
                            TrialComponentArtifactJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("OutputArtifacts", targetDepth)) {
                    context.nextToken();
                    trialComponent.setOutputArtifacts(new MapUnmarshaller<String, TrialComponentArtifact>(context.getUnmarshaller(String.class),
                            TrialComponentArtifactJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("Metrics", targetDepth)) {
                    context.nextToken();
                    trialComponent.setMetrics(new ListUnmarshaller<TrialComponentMetricSummary>(TrialComponentMetricSummaryJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("SourceDetail", targetDepth)) {
                    context.nextToken();
                    trialComponent.setSourceDetail(TrialComponentSourceDetailJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    trialComponent.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("Parents", targetDepth)) {
                    context.nextToken();
                    trialComponent.setParents(new ListUnmarshaller<Parent>(ParentJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return trialComponent;
    }

    private static TrialComponentJsonUnmarshaller instance;

    public static TrialComponentJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TrialComponentJsonUnmarshaller();
        return instance;
    }
}
