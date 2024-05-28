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
package com.amazonaws.services.imagebuilder.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.imagebuilder.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ImageScanFinding JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImageScanFindingJsonUnmarshaller implements Unmarshaller<ImageScanFinding, JsonUnmarshallerContext> {

    public ImageScanFinding unmarshall(JsonUnmarshallerContext context) throws Exception {
        ImageScanFinding imageScanFinding = new ImageScanFinding();

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
                    imageScanFinding.setAwsAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("imageBuildVersionArn", targetDepth)) {
                    context.nextToken();
                    imageScanFinding.setImageBuildVersionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("imagePipelineArn", targetDepth)) {
                    context.nextToken();
                    imageScanFinding.setImagePipelineArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    imageScanFinding.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    imageScanFinding.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("title", targetDepth)) {
                    context.nextToken();
                    imageScanFinding.setTitle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("remediation", targetDepth)) {
                    context.nextToken();
                    imageScanFinding.setRemediation(RemediationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("severity", targetDepth)) {
                    context.nextToken();
                    imageScanFinding.setSeverity(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("firstObservedAt", targetDepth)) {
                    context.nextToken();
                    imageScanFinding.setFirstObservedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    imageScanFinding.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("inspectorScore", targetDepth)) {
                    context.nextToken();
                    imageScanFinding.setInspectorScore(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("inspectorScoreDetails", targetDepth)) {
                    context.nextToken();
                    imageScanFinding.setInspectorScoreDetails(InspectorScoreDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("packageVulnerabilityDetails", targetDepth)) {
                    context.nextToken();
                    imageScanFinding.setPackageVulnerabilityDetails(PackageVulnerabilityDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("fixAvailable", targetDepth)) {
                    context.nextToken();
                    imageScanFinding.setFixAvailable(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return imageScanFinding;
    }

    private static ImageScanFindingJsonUnmarshaller instance;

    public static ImageScanFindingJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ImageScanFindingJsonUnmarshaller();
        return instance;
    }
}
