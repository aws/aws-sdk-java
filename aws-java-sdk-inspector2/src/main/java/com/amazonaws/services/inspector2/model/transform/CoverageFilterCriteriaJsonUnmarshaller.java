/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * CoverageFilterCriteria JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CoverageFilterCriteriaJsonUnmarshaller implements Unmarshaller<CoverageFilterCriteria, JsonUnmarshallerContext> {

    public CoverageFilterCriteria unmarshall(JsonUnmarshallerContext context) throws Exception {
        CoverageFilterCriteria coverageFilterCriteria = new CoverageFilterCriteria();

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
                if (context.testExpression("accountId", targetDepth)) {
                    context.nextToken();
                    coverageFilterCriteria.setAccountId(new ListUnmarshaller<CoverageStringFilter>(CoverageStringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ec2InstanceTags", targetDepth)) {
                    context.nextToken();
                    coverageFilterCriteria.setEc2InstanceTags(new ListUnmarshaller<CoverageMapFilter>(CoverageMapFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ecrImageTags", targetDepth)) {
                    context.nextToken();
                    coverageFilterCriteria.setEcrImageTags(new ListUnmarshaller<CoverageStringFilter>(CoverageStringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ecrRepositoryName", targetDepth)) {
                    context.nextToken();
                    coverageFilterCriteria.setEcrRepositoryName(new ListUnmarshaller<CoverageStringFilter>(CoverageStringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("lambdaFunctionName", targetDepth)) {
                    context.nextToken();
                    coverageFilterCriteria.setLambdaFunctionName(new ListUnmarshaller<CoverageStringFilter>(CoverageStringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("lambdaFunctionRuntime", targetDepth)) {
                    context.nextToken();
                    coverageFilterCriteria.setLambdaFunctionRuntime(new ListUnmarshaller<CoverageStringFilter>(CoverageStringFilterJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("lambdaFunctionTags", targetDepth)) {
                    context.nextToken();
                    coverageFilterCriteria.setLambdaFunctionTags(new ListUnmarshaller<CoverageMapFilter>(CoverageMapFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("resourceId", targetDepth)) {
                    context.nextToken();
                    coverageFilterCriteria.setResourceId(new ListUnmarshaller<CoverageStringFilter>(CoverageStringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("resourceType", targetDepth)) {
                    context.nextToken();
                    coverageFilterCriteria.setResourceType(new ListUnmarshaller<CoverageStringFilter>(CoverageStringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("scanStatusCode", targetDepth)) {
                    context.nextToken();
                    coverageFilterCriteria.setScanStatusCode(new ListUnmarshaller<CoverageStringFilter>(CoverageStringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("scanStatusReason", targetDepth)) {
                    context.nextToken();
                    coverageFilterCriteria.setScanStatusReason(new ListUnmarshaller<CoverageStringFilter>(CoverageStringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("scanType", targetDepth)) {
                    context.nextToken();
                    coverageFilterCriteria.setScanType(new ListUnmarshaller<CoverageStringFilter>(CoverageStringFilterJsonUnmarshaller.getInstance())

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

        return coverageFilterCriteria;
    }

    private static CoverageFilterCriteriaJsonUnmarshaller instance;

    public static CoverageFilterCriteriaJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CoverageFilterCriteriaJsonUnmarshaller();
        return instance;
    }
}
