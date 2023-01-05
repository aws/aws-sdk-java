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
package com.amazonaws.services.ecr.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.ecr.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * EnhancedImageScanFinding JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnhancedImageScanFindingJsonUnmarshaller implements Unmarshaller<EnhancedImageScanFinding, JsonUnmarshallerContext> {

    public EnhancedImageScanFinding unmarshall(JsonUnmarshallerContext context) throws Exception {
        EnhancedImageScanFinding enhancedImageScanFinding = new EnhancedImageScanFinding();

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
                if (context.testExpression("awsAccountId", targetDepth)) {
                    context.nextToken();
                    enhancedImageScanFinding.setAwsAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    enhancedImageScanFinding.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("findingArn", targetDepth)) {
                    context.nextToken();
                    enhancedImageScanFinding.setFindingArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("firstObservedAt", targetDepth)) {
                    context.nextToken();
                    enhancedImageScanFinding.setFirstObservedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastObservedAt", targetDepth)) {
                    context.nextToken();
                    enhancedImageScanFinding.setLastObservedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("packageVulnerabilityDetails", targetDepth)) {
                    context.nextToken();
                    enhancedImageScanFinding.setPackageVulnerabilityDetails(PackageVulnerabilityDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("remediation", targetDepth)) {
                    context.nextToken();
                    enhancedImageScanFinding.setRemediation(RemediationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("resources", targetDepth)) {
                    context.nextToken();
                    enhancedImageScanFinding.setResources(new ListUnmarshaller<Resource>(ResourceJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("score", targetDepth)) {
                    context.nextToken();
                    enhancedImageScanFinding.setScore(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("scoreDetails", targetDepth)) {
                    context.nextToken();
                    enhancedImageScanFinding.setScoreDetails(ScoreDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("severity", targetDepth)) {
                    context.nextToken();
                    enhancedImageScanFinding.setSeverity(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    enhancedImageScanFinding.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("title", targetDepth)) {
                    context.nextToken();
                    enhancedImageScanFinding.setTitle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    enhancedImageScanFinding.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    enhancedImageScanFinding.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return enhancedImageScanFinding;
    }

    private static EnhancedImageScanFindingJsonUnmarshaller instance;

    public static EnhancedImageScanFindingJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EnhancedImageScanFindingJsonUnmarshaller();
        return instance;
    }
}
