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
 * Workload JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkloadJsonUnmarshaller implements Unmarshaller<Workload, JsonUnmarshallerContext> {

    public Workload unmarshall(JsonUnmarshallerContext context) throws Exception {
        Workload workload = new Workload();

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
                    workload.setWorkloadId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("WorkloadArn", targetDepth)) {
                    context.nextToken();
                    workload.setWorkloadArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("WorkloadName", targetDepth)) {
                    context.nextToken();
                    workload.setWorkloadName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    workload.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Environment", targetDepth)) {
                    context.nextToken();
                    workload.setEnvironment(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UpdatedAt", targetDepth)) {
                    context.nextToken();
                    workload.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("AccountIds", targetDepth)) {
                    context.nextToken();
                    workload.setAccountIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("AwsRegions", targetDepth)) {
                    context.nextToken();
                    workload.setAwsRegions(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("NonAwsRegions", targetDepth)) {
                    context.nextToken();
                    workload.setNonAwsRegions(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ArchitecturalDesign", targetDepth)) {
                    context.nextToken();
                    workload.setArchitecturalDesign(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReviewOwner", targetDepth)) {
                    context.nextToken();
                    workload.setReviewOwner(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReviewRestrictionDate", targetDepth)) {
                    context.nextToken();
                    workload.setReviewRestrictionDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("IsReviewOwnerUpdateAcknowledged", targetDepth)) {
                    context.nextToken();
                    workload.setIsReviewOwnerUpdateAcknowledged(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("IndustryType", targetDepth)) {
                    context.nextToken();
                    workload.setIndustryType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Industry", targetDepth)) {
                    context.nextToken();
                    workload.setIndustry(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Notes", targetDepth)) {
                    context.nextToken();
                    workload.setNotes(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ImprovementStatus", targetDepth)) {
                    context.nextToken();
                    workload.setImprovementStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RiskCounts", targetDepth)) {
                    context.nextToken();
                    workload.setRiskCounts(new MapUnmarshaller<String, Integer>(context.getUnmarshaller(String.class), context.getUnmarshaller(Integer.class))
                            .unmarshall(context));
                }
                if (context.testExpression("PillarPriorities", targetDepth)) {
                    context.nextToken();
                    workload.setPillarPriorities(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Lenses", targetDepth)) {
                    context.nextToken();
                    workload.setLenses(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Owner", targetDepth)) {
                    context.nextToken();
                    workload.setOwner(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ShareInvitationId", targetDepth)) {
                    context.nextToken();
                    workload.setShareInvitationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    workload.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
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

        return workload;
    }

    private static WorkloadJsonUnmarshaller instance;

    public static WorkloadJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new WorkloadJsonUnmarshaller();
        return instance;
    }
}
