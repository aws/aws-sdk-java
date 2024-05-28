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
 * AssetBundleCloudFormationOverridePropertyConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetBundleCloudFormationOverridePropertyConfigurationJsonUnmarshaller implements
        Unmarshaller<AssetBundleCloudFormationOverridePropertyConfiguration, JsonUnmarshallerContext> {

    public AssetBundleCloudFormationOverridePropertyConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        AssetBundleCloudFormationOverridePropertyConfiguration assetBundleCloudFormationOverridePropertyConfiguration = new AssetBundleCloudFormationOverridePropertyConfiguration();

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
                    assetBundleCloudFormationOverridePropertyConfiguration
                            .setResourceIdOverrideConfiguration(AssetBundleExportJobResourceIdOverrideConfigurationJsonUnmarshaller.getInstance().unmarshall(
                                    context));
                }
                if (context.testExpression("VPCConnections", targetDepth)) {
                    context.nextToken();
                    assetBundleCloudFormationOverridePropertyConfiguration
                            .setVPCConnections(new ListUnmarshaller<AssetBundleExportJobVPCConnectionOverrideProperties>(
                                    AssetBundleExportJobVPCConnectionOverridePropertiesJsonUnmarshaller.getInstance())

                            .unmarshall(context));
                }
                if (context.testExpression("RefreshSchedules", targetDepth)) {
                    context.nextToken();
                    assetBundleCloudFormationOverridePropertyConfiguration
                            .setRefreshSchedules(new ListUnmarshaller<AssetBundleExportJobRefreshScheduleOverrideProperties>(
                                    AssetBundleExportJobRefreshScheduleOverridePropertiesJsonUnmarshaller.getInstance())

                            .unmarshall(context));
                }
                if (context.testExpression("DataSources", targetDepth)) {
                    context.nextToken();
                    assetBundleCloudFormationOverridePropertyConfiguration
                            .setDataSources(new ListUnmarshaller<AssetBundleExportJobDataSourceOverrideProperties>(
                                    AssetBundleExportJobDataSourceOverridePropertiesJsonUnmarshaller.getInstance())

                            .unmarshall(context));
                }
                if (context.testExpression("DataSets", targetDepth)) {
                    context.nextToken();
                    assetBundleCloudFormationOverridePropertyConfiguration.setDataSets(new ListUnmarshaller<AssetBundleExportJobDataSetOverrideProperties>(
                            AssetBundleExportJobDataSetOverridePropertiesJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Themes", targetDepth)) {
                    context.nextToken();
                    assetBundleCloudFormationOverridePropertyConfiguration.setThemes(new ListUnmarshaller<AssetBundleExportJobThemeOverrideProperties>(
                            AssetBundleExportJobThemeOverridePropertiesJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Analyses", targetDepth)) {
                    context.nextToken();
                    assetBundleCloudFormationOverridePropertyConfiguration.setAnalyses(new ListUnmarshaller<AssetBundleExportJobAnalysisOverrideProperties>(
                            AssetBundleExportJobAnalysisOverridePropertiesJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Dashboards", targetDepth)) {
                    context.nextToken();
                    assetBundleCloudFormationOverridePropertyConfiguration.setDashboards(new ListUnmarshaller<AssetBundleExportJobDashboardOverrideProperties>(
                            AssetBundleExportJobDashboardOverridePropertiesJsonUnmarshaller.getInstance())

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

        return assetBundleCloudFormationOverridePropertyConfiguration;
    }

    private static AssetBundleCloudFormationOverridePropertyConfigurationJsonUnmarshaller instance;

    public static AssetBundleCloudFormationOverridePropertyConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AssetBundleCloudFormationOverridePropertyConfigurationJsonUnmarshaller();
        return instance;
    }
}
