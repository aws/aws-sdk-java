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
package com.amazonaws.services.quicksight.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeAssetBundleImportJobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAssetBundleImportJobResultJsonUnmarshaller implements Unmarshaller<DescribeAssetBundleImportJobResult, JsonUnmarshallerContext> {

    public DescribeAssetBundleImportJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeAssetBundleImportJobResult describeAssetBundleImportJobResult = new DescribeAssetBundleImportJobResult();

        describeAssetBundleImportJobResult.setStatus(context.getHttpResponse().getStatusCode());

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeAssetBundleImportJobResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("JobStatus", targetDepth)) {
                    context.nextToken();
                    describeAssetBundleImportJobResult.setJobStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Errors", targetDepth)) {
                    context.nextToken();
                    describeAssetBundleImportJobResult.setErrors(new ListUnmarshaller<AssetBundleImportJobError>(AssetBundleImportJobErrorJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("RollbackErrors", targetDepth)) {
                    context.nextToken();
                    describeAssetBundleImportJobResult.setRollbackErrors(new ListUnmarshaller<AssetBundleImportJobError>(
                            AssetBundleImportJobErrorJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    describeAssetBundleImportJobResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTime", targetDepth)) {
                    context.nextToken();
                    describeAssetBundleImportJobResult.setCreatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("AssetBundleImportJobId", targetDepth)) {
                    context.nextToken();
                    describeAssetBundleImportJobResult.setAssetBundleImportJobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AwsAccountId", targetDepth)) {
                    context.nextToken();
                    describeAssetBundleImportJobResult.setAwsAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AssetBundleImportSource", targetDepth)) {
                    context.nextToken();
                    describeAssetBundleImportJobResult.setAssetBundleImportSource(AssetBundleImportSourceDescriptionJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("OverrideParameters", targetDepth)) {
                    context.nextToken();
                    describeAssetBundleImportJobResult.setOverrideParameters(AssetBundleImportJobOverrideParametersJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("FailureAction", targetDepth)) {
                    context.nextToken();
                    describeAssetBundleImportJobResult.setFailureAction(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RequestId", targetDepth)) {
                    context.nextToken();
                    describeAssetBundleImportJobResult.setRequestId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OverridePermissions", targetDepth)) {
                    context.nextToken();
                    describeAssetBundleImportJobResult.setOverridePermissions(AssetBundleImportJobOverridePermissionsJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("OverrideTags", targetDepth)) {
                    context.nextToken();
                    describeAssetBundleImportJobResult.setOverrideTags(AssetBundleImportJobOverrideTagsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("OverrideValidationStrategy", targetDepth)) {
                    context.nextToken();
                    describeAssetBundleImportJobResult.setOverrideValidationStrategy(AssetBundleImportJobOverrideValidationStrategyJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("Warnings", targetDepth)) {
                    context.nextToken();
                    describeAssetBundleImportJobResult.setWarnings(new ListUnmarshaller<AssetBundleImportJobWarning>(
                            AssetBundleImportJobWarningJsonUnmarshaller.getInstance())

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

        return describeAssetBundleImportJobResult;
    }

    private static DescribeAssetBundleImportJobResultJsonUnmarshaller instance;

    public static DescribeAssetBundleImportJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeAssetBundleImportJobResultJsonUnmarshaller();
        return instance;
    }
}
