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
 * AssetBundleImportJobOverrideTags JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetBundleImportJobOverrideTagsJsonUnmarshaller implements Unmarshaller<AssetBundleImportJobOverrideTags, JsonUnmarshallerContext> {

    public AssetBundleImportJobOverrideTags unmarshall(JsonUnmarshallerContext context) throws Exception {
        AssetBundleImportJobOverrideTags assetBundleImportJobOverrideTags = new AssetBundleImportJobOverrideTags();

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
                if (context.testExpression("VPCConnections", targetDepth)) {
                    context.nextToken();
                    assetBundleImportJobOverrideTags.setVPCConnections(new ListUnmarshaller<AssetBundleImportJobVPCConnectionOverrideTags>(
                            AssetBundleImportJobVPCConnectionOverrideTagsJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("DataSources", targetDepth)) {
                    context.nextToken();
                    assetBundleImportJobOverrideTags.setDataSources(new ListUnmarshaller<AssetBundleImportJobDataSourceOverrideTags>(
                            AssetBundleImportJobDataSourceOverrideTagsJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("DataSets", targetDepth)) {
                    context.nextToken();
                    assetBundleImportJobOverrideTags.setDataSets(new ListUnmarshaller<AssetBundleImportJobDataSetOverrideTags>(
                            AssetBundleImportJobDataSetOverrideTagsJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Themes", targetDepth)) {
                    context.nextToken();
                    assetBundleImportJobOverrideTags.setThemes(new ListUnmarshaller<AssetBundleImportJobThemeOverrideTags>(
                            AssetBundleImportJobThemeOverrideTagsJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Analyses", targetDepth)) {
                    context.nextToken();
                    assetBundleImportJobOverrideTags.setAnalyses(new ListUnmarshaller<AssetBundleImportJobAnalysisOverrideTags>(
                            AssetBundleImportJobAnalysisOverrideTagsJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Dashboards", targetDepth)) {
                    context.nextToken();
                    assetBundleImportJobOverrideTags.setDashboards(new ListUnmarshaller<AssetBundleImportJobDashboardOverrideTags>(
                            AssetBundleImportJobDashboardOverrideTagsJsonUnmarshaller.getInstance())

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

        return assetBundleImportJobOverrideTags;
    }

    private static AssetBundleImportJobOverrideTagsJsonUnmarshaller instance;

    public static AssetBundleImportJobOverrideTagsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AssetBundleImportJobOverrideTagsJsonUnmarshaller();
        return instance;
    }
}
