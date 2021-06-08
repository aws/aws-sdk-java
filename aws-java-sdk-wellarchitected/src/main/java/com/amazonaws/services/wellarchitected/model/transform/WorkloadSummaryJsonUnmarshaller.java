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
package com.amazonaws.services.wellarchitected.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.wellarchitected.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * WorkloadSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkloadSummaryJsonUnmarshaller implements Unmarshaller<WorkloadSummary, JsonUnmarshallerContext> {

    public WorkloadSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        WorkloadSummary workloadSummary = new WorkloadSummary();

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
                if (context.testExpression("WorkloadId", targetDepth)) {
                    context.nextToken();
                    workloadSummary.setWorkloadId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("WorkloadArn", targetDepth)) {
                    context.nextToken();
                    workloadSummary.setWorkloadArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("WorkloadName", targetDepth)) {
                    context.nextToken();
                    workloadSummary.setWorkloadName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Owner", targetDepth)) {
                    context.nextToken();
                    workloadSummary.setOwner(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UpdatedAt", targetDepth)) {
                    context.nextToken();
                    workloadSummary.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Lenses", targetDepth)) {
                    context.nextToken();
                    workloadSummary.setLenses(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("RiskCounts", targetDepth)) {
                    context.nextToken();
                    workloadSummary.setRiskCounts(new MapUnmarshaller<String, Integer>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(Integer.class)).unmarshall(context));
                }
                if (context.testExpression("ImprovementStatus", targetDepth)) {
                    context.nextToken();
                    workloadSummary.setImprovementStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return workloadSummary;
    }

    private static WorkloadSummaryJsonUnmarshaller instance;

    public static WorkloadSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new WorkloadSummaryJsonUnmarshaller();
        return instance;
    }
}
