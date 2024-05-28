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
 * CisScanResultsAggregatedByChecksFilterCriteria JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CisScanResultsAggregatedByChecksFilterCriteriaJsonUnmarshaller implements
        Unmarshaller<CisScanResultsAggregatedByChecksFilterCriteria, JsonUnmarshallerContext> {

    public CisScanResultsAggregatedByChecksFilterCriteria unmarshall(JsonUnmarshallerContext context) throws Exception {
        CisScanResultsAggregatedByChecksFilterCriteria cisScanResultsAggregatedByChecksFilterCriteria = new CisScanResultsAggregatedByChecksFilterCriteria();

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
                    cisScanResultsAggregatedByChecksFilterCriteria.setAccountIdFilters(new ListUnmarshaller<CisStringFilter>(CisStringFilterJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("checkIdFilters", targetDepth)) {
                    context.nextToken();
                    cisScanResultsAggregatedByChecksFilterCriteria.setCheckIdFilters(new ListUnmarshaller<CisStringFilter>(CisStringFilterJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("failedResourcesFilters", targetDepth)) {
                    context.nextToken();
                    cisScanResultsAggregatedByChecksFilterCriteria.setFailedResourcesFilters(new ListUnmarshaller<CisNumberFilter>(
                            CisNumberFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("platformFilters", targetDepth)) {
                    context.nextToken();
                    cisScanResultsAggregatedByChecksFilterCriteria.setPlatformFilters(new ListUnmarshaller<CisStringFilter>(CisStringFilterJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("securityLevelFilters", targetDepth)) {
                    context.nextToken();
                    cisScanResultsAggregatedByChecksFilterCriteria.setSecurityLevelFilters(new ListUnmarshaller<CisSecurityLevelFilter>(
                            CisSecurityLevelFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("titleFilters", targetDepth)) {
                    context.nextToken();
                    cisScanResultsAggregatedByChecksFilterCriteria.setTitleFilters(new ListUnmarshaller<CisStringFilter>(CisStringFilterJsonUnmarshaller
                            .getInstance())

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

        return cisScanResultsAggregatedByChecksFilterCriteria;
    }

    private static CisScanResultsAggregatedByChecksFilterCriteriaJsonUnmarshaller instance;

    public static CisScanResultsAggregatedByChecksFilterCriteriaJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CisScanResultsAggregatedByChecksFilterCriteriaJsonUnmarshaller();
        return instance;
    }
}
