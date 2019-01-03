/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servicecatalog.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.servicecatalog.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeProvisioningParametersResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeProvisioningParametersResultJsonUnmarshaller implements Unmarshaller<DescribeProvisioningParametersResult, JsonUnmarshallerContext> {

    public DescribeProvisioningParametersResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeProvisioningParametersResult describeProvisioningParametersResult = new DescribeProvisioningParametersResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeProvisioningParametersResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ProvisioningArtifactParameters", targetDepth)) {
                    context.nextToken();
                    describeProvisioningParametersResult.setProvisioningArtifactParameters(new ListUnmarshaller<ProvisioningArtifactParameter>(
                            ProvisioningArtifactParameterJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("ConstraintSummaries", targetDepth)) {
                    context.nextToken();
                    describeProvisioningParametersResult.setConstraintSummaries(new ListUnmarshaller<ConstraintSummary>(ConstraintSummaryJsonUnmarshaller
                            .getInstance()).unmarshall(context));
                }
                if (context.testExpression("UsageInstructions", targetDepth)) {
                    context.nextToken();
                    describeProvisioningParametersResult.setUsageInstructions(new ListUnmarshaller<UsageInstruction>(UsageInstructionJsonUnmarshaller
                            .getInstance()).unmarshall(context));
                }
                if (context.testExpression("TagOptions", targetDepth)) {
                    context.nextToken();
                    describeProvisioningParametersResult.setTagOptions(new ListUnmarshaller<TagOptionSummary>(TagOptionSummaryJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("ProvisioningArtifactPreferences", targetDepth)) {
                    context.nextToken();
                    describeProvisioningParametersResult.setProvisioningArtifactPreferences(ProvisioningArtifactPreferencesJsonUnmarshaller.getInstance()
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

        return describeProvisioningParametersResult;
    }

    private static DescribeProvisioningParametersResultJsonUnmarshaller instance;

    public static DescribeProvisioningParametersResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeProvisioningParametersResultJsonUnmarshaller();
        return instance;
    }
}
