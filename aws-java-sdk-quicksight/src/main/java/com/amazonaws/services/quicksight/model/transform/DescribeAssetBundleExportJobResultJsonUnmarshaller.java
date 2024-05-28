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
 * DescribeAssetBundleExportJobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAssetBundleExportJobResultJsonUnmarshaller implements Unmarshaller<DescribeAssetBundleExportJobResult, JsonUnmarshallerContext> {

    public DescribeAssetBundleExportJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeAssetBundleExportJobResult describeAssetBundleExportJobResult = new DescribeAssetBundleExportJobResult();

        describeAssetBundleExportJobResult.setStatus(context.getHttpResponse().getStatusCode());

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeAssetBundleExportJobResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("JobStatus", targetDepth)) {
                    context.nextToken();
                    describeAssetBundleExportJobResult.setJobStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DownloadUrl", targetDepth)) {
                    context.nextToken();
                    describeAssetBundleExportJobResult.setDownloadUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Errors", targetDepth)) {
                    context.nextToken();
                    describeAssetBundleExportJobResult.setErrors(new ListUnmarshaller<AssetBundleExportJobError>(AssetBundleExportJobErrorJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    describeAssetBundleExportJobResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTime", targetDepth)) {
                    context.nextToken();
                    describeAssetBundleExportJobResult.setCreatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("AssetBundleExportJobId", targetDepth)) {
                    context.nextToken();
                    describeAssetBundleExportJobResult.setAssetBundleExportJobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AwsAccountId", targetDepth)) {
                    context.nextToken();
                    describeAssetBundleExportJobResult.setAwsAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceArns", targetDepth)) {
                    context.nextToken();
                    describeAssetBundleExportJobResult.setResourceArns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("IncludeAllDependencies", targetDepth)) {
                    context.nextToken();
                    describeAssetBundleExportJobResult.setIncludeAllDependencies(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ExportFormat", targetDepth)) {
                    context.nextToken();
                    describeAssetBundleExportJobResult.setExportFormat(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CloudFormationOverridePropertyConfiguration", targetDepth)) {
                    context.nextToken();
                    describeAssetBundleExportJobResult
                            .setCloudFormationOverridePropertyConfiguration(AssetBundleCloudFormationOverridePropertyConfigurationJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
                if (context.testExpression("RequestId", targetDepth)) {
                    context.nextToken();
                    describeAssetBundleExportJobResult.setRequestId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IncludePermissions", targetDepth)) {
                    context.nextToken();
                    describeAssetBundleExportJobResult.setIncludePermissions(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("IncludeTags", targetDepth)) {
                    context.nextToken();
                    describeAssetBundleExportJobResult.setIncludeTags(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ValidationStrategy", targetDepth)) {
                    context.nextToken();
                    describeAssetBundleExportJobResult.setValidationStrategy(AssetBundleExportJobValidationStrategyJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("Warnings", targetDepth)) {
                    context.nextToken();
                    describeAssetBundleExportJobResult.setWarnings(new ListUnmarshaller<AssetBundleExportJobWarning>(
                            AssetBundleExportJobWarningJsonUnmarshaller.getInstance())

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

        return describeAssetBundleExportJobResult;
    }

    private static DescribeAssetBundleExportJobResultJsonUnmarshaller instance;

    public static DescribeAssetBundleExportJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeAssetBundleExportJobResultJsonUnmarshaller();
        return instance;
    }
}
