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
 * AssetBundleImportJobOverrideParameters JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetBundleImportJobOverrideParametersJsonUnmarshaller implements Unmarshaller<AssetBundleImportJobOverrideParameters, JsonUnmarshallerContext> {

    public AssetBundleImportJobOverrideParameters unmarshall(JsonUnmarshallerContext context) throws Exception {
        AssetBundleImportJobOverrideParameters assetBundleImportJobOverrideParameters = new AssetBundleImportJobOverrideParameters();

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
                if (context.testExpression("ResourceIdOverrideConfiguration", targetDepth)) {
                    context.nextToken();
                    assetBundleImportJobOverrideParameters
                            .setResourceIdOverrideConfiguration(AssetBundleImportJobResourceIdOverrideConfigurationJsonUnmarshaller.getInstance().unmarshall(
                                    context));
                }
                if (context.testExpression("VPCConnections", targetDepth)) {
                    context.nextToken();
                    assetBundleImportJobOverrideParameters.setVPCConnections(new ListUnmarshaller<AssetBundleImportJobVPCConnectionOverrideParameters>(
                            AssetBundleImportJobVPCConnectionOverrideParametersJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("RefreshSchedules", targetDepth)) {
                    context.nextToken();
                    assetBundleImportJobOverrideParameters.setRefreshSchedules(new ListUnmarshaller<AssetBundleImportJobRefreshScheduleOverrideParameters>(
                            AssetBundleImportJobRefreshScheduleOverrideParametersJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("DataSources", targetDepth)) {
                    context.nextToken();
                    assetBundleImportJobOverrideParameters.setDataSources(new ListUnmarshaller<AssetBundleImportJobDataSourceOverrideParameters>(
                            AssetBundleImportJobDataSourceOverrideParametersJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("DataSets", targetDepth)) {
                    context.nextToken();
                    assetBundleImportJobOverrideParameters.setDataSets(new ListUnmarshaller<AssetBundleImportJobDataSetOverrideParameters>(
                            AssetBundleImportJobDataSetOverrideParametersJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Themes", targetDepth)) {
                    context.nextToken();
                    assetBundleImportJobOverrideParameters.setThemes(new ListUnmarshaller<AssetBundleImportJobThemeOverrideParameters>(
                            AssetBundleImportJobThemeOverrideParametersJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Analyses", targetDepth)) {
                    context.nextToken();
                    assetBundleImportJobOverrideParameters.setAnalyses(new ListUnmarshaller<AssetBundleImportJobAnalysisOverrideParameters>(
                            AssetBundleImportJobAnalysisOverrideParametersJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Dashboards", targetDepth)) {
                    context.nextToken();
                    assetBundleImportJobOverrideParameters.setDashboards(new ListUnmarshaller<AssetBundleImportJobDashboardOverrideParameters>(
                            AssetBundleImportJobDashboardOverrideParametersJsonUnmarshaller.getInstance())

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

        return assetBundleImportJobOverrideParameters;
    }

    private static AssetBundleImportJobOverrideParametersJsonUnmarshaller instance;

    public static AssetBundleImportJobOverrideParametersJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AssetBundleImportJobOverrideParametersJsonUnmarshaller();
        return instance;
    }
}
