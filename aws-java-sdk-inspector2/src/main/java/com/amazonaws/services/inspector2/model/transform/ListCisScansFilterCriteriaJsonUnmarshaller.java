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
 * ListCisScansFilterCriteria JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCisScansFilterCriteriaJsonUnmarshaller implements Unmarshaller<ListCisScansFilterCriteria, JsonUnmarshallerContext> {

    public ListCisScansFilterCriteria unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListCisScansFilterCriteria listCisScansFilterCriteria = new ListCisScansFilterCriteria();

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
                if (context.testExpression("failedChecksFilters", targetDepth)) {
                    context.nextToken();
                    listCisScansFilterCriteria.setFailedChecksFilters(new ListUnmarshaller<CisNumberFilter>(CisNumberFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("scanArnFilters", targetDepth)) {
                    context.nextToken();
                    listCisScansFilterCriteria.setScanArnFilters(new ListUnmarshaller<CisStringFilter>(CisStringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("scanAtFilters", targetDepth)) {
                    context.nextToken();
                    listCisScansFilterCriteria.setScanAtFilters(new ListUnmarshaller<CisDateFilter>(CisDateFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("scanConfigurationArnFilters", targetDepth)) {
                    context.nextToken();
                    listCisScansFilterCriteria.setScanConfigurationArnFilters(new ListUnmarshaller<CisStringFilter>(CisStringFilterJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("scanNameFilters", targetDepth)) {
                    context.nextToken();
                    listCisScansFilterCriteria.setScanNameFilters(new ListUnmarshaller<CisStringFilter>(CisStringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("scanStatusFilters", targetDepth)) {
                    context.nextToken();
                    listCisScansFilterCriteria
                            .setScanStatusFilters(new ListUnmarshaller<CisScanStatusFilter>(CisScanStatusFilterJsonUnmarshaller.getInstance())

                            .unmarshall(context));
                }
                if (context.testExpression("scheduledByFilters", targetDepth)) {
                    context.nextToken();
                    listCisScansFilterCriteria.setScheduledByFilters(new ListUnmarshaller<CisStringFilter>(CisStringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("targetAccountIdFilters", targetDepth)) {
                    context.nextToken();
                    listCisScansFilterCriteria.setTargetAccountIdFilters(new ListUnmarshaller<CisStringFilter>(CisStringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("targetResourceIdFilters", targetDepth)) {
                    context.nextToken();
                    listCisScansFilterCriteria.setTargetResourceIdFilters(new ListUnmarshaller<CisStringFilter>(CisStringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("targetResourceTagFilters", targetDepth)) {
                    context.nextToken();
                    listCisScansFilterCriteria.setTargetResourceTagFilters(new ListUnmarshaller<TagFilter>(TagFilterJsonUnmarshaller.getInstance())

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

        return listCisScansFilterCriteria;
    }

    private static ListCisScansFilterCriteriaJsonUnmarshaller instance;

    public static ListCisScansFilterCriteriaJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListCisScansFilterCriteriaJsonUnmarshaller();
        return instance;
    }
}
