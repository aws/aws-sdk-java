/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.inspector2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.inspector2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CisScanResultsAggregatedByTargetResourceFilterCriteria JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CisScanResultsAggregatedByTargetResourceFilterCriteriaJsonUnmarshaller implements
        Unmarshaller<CisScanResultsAggregatedByTargetResourceFilterCriteria, JsonUnmarshallerContext> {

    public CisScanResultsAggregatedByTargetResourceFilterCriteria unmarshall(JsonUnmarshallerContext context) throws Exception {
        CisScanResultsAggregatedByTargetResourceFilterCriteria cisScanResultsAggregatedByTargetResourceFilterCriteria = new CisScanResultsAggregatedByTargetResourceFilterCriteria();

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
                if (context.testExpression("accountIdFilters", targetDepth)) {
                    context.nextToken();
                    cisScanResultsAggregatedByTargetResourceFilterCriteria.setAccountIdFilters(new ListUnmarshaller<CisStringFilter>(
                            CisStringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("checkIdFilters", targetDepth)) {
                    context.nextToken();
                    cisScanResultsAggregatedByTargetResourceFilterCriteria.setCheckIdFilters(new ListUnmarshaller<CisStringFilter>(
                            CisStringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("failedChecksFilters", targetDepth)) {
                    context.nextToken();
                    cisScanResultsAggregatedByTargetResourceFilterCriteria.setFailedChecksFilters(new ListUnmarshaller<CisNumberFilter>(
                            CisNumberFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("platformFilters", targetDepth)) {
                    context.nextToken();
                    cisScanResultsAggregatedByTargetResourceFilterCriteria.setPlatformFilters(new ListUnmarshaller<CisStringFilter>(
                            CisStringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("statusFilters", targetDepth)) {
                    context.nextToken();
                    cisScanResultsAggregatedByTargetResourceFilterCriteria.setStatusFilters(new ListUnmarshaller<CisResultStatusFilter>(
                            CisResultStatusFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("targetResourceIdFilters", targetDepth)) {
                    context.nextToken();
                    cisScanResultsAggregatedByTargetResourceFilterCriteria.setTargetResourceIdFilters(new ListUnmarshaller<CisStringFilter>(
                            CisStringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("targetResourceTagFilters", targetDepth)) {
                    context.nextToken();
                    cisScanResultsAggregatedByTargetResourceFilterCriteria.setTargetResourceTagFilters(new ListUnmarshaller<TagFilter>(
                            TagFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("targetStatusFilters", targetDepth)) {
                    context.nextToken();
                    cisScanResultsAggregatedByTargetResourceFilterCriteria.setTargetStatusFilters(new ListUnmarshaller<CisTargetStatusFilter>(
                            CisTargetStatusFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("targetStatusReasonFilters", targetDepth)) {
                    context.nextToken();
                    cisScanResultsAggregatedByTargetResourceFilterCriteria.setTargetStatusReasonFilters(new ListUnmarshaller<CisTargetStatusReasonFilter>(
                            CisTargetStatusReasonFilterJsonUnmarshaller.getInstance())

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

        return cisScanResultsAggregatedByTargetResourceFilterCriteria;
    }

    private static CisScanResultsAggregatedByTargetResourceFilterCriteriaJsonUnmarshaller instance;

    public static CisScanResultsAggregatedByTargetResourceFilterCriteriaJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CisScanResultsAggregatedByTargetResourceFilterCriteriaJsonUnmarshaller();
        return instance;
    }
}
