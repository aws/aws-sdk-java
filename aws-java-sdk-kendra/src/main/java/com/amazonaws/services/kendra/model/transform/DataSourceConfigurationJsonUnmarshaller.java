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
package com.amazonaws.services.kendra.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.kendra.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DataSourceConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSourceConfigurationJsonUnmarshaller implements Unmarshaller<DataSourceConfiguration, JsonUnmarshallerContext> {

    public DataSourceConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        DataSourceConfiguration dataSourceConfiguration = new DataSourceConfiguration();

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
                if (context.testExpression("S3Configuration", targetDepth)) {
                    context.nextToken();
                    dataSourceConfiguration.setS3Configuration(S3DataSourceConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SharePointConfiguration", targetDepth)) {
                    context.nextToken();
                    dataSourceConfiguration.setSharePointConfiguration(SharePointConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DatabaseConfiguration", targetDepth)) {
                    context.nextToken();
                    dataSourceConfiguration.setDatabaseConfiguration(DatabaseConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SalesforceConfiguration", targetDepth)) {
                    context.nextToken();
                    dataSourceConfiguration.setSalesforceConfiguration(SalesforceConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("OneDriveConfiguration", targetDepth)) {
                    context.nextToken();
                    dataSourceConfiguration.setOneDriveConfiguration(OneDriveConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ServiceNowConfiguration", targetDepth)) {
                    context.nextToken();
                    dataSourceConfiguration.setServiceNowConfiguration(ServiceNowConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ConfluenceConfiguration", targetDepth)) {
                    context.nextToken();
                    dataSourceConfiguration.setConfluenceConfiguration(ConfluenceConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("GoogleDriveConfiguration", targetDepth)) {
                    context.nextToken();
                    dataSourceConfiguration.setGoogleDriveConfiguration(GoogleDriveConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("WebCrawlerConfiguration", targetDepth)) {
                    context.nextToken();
                    dataSourceConfiguration.setWebCrawlerConfiguration(WebCrawlerConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("WorkDocsConfiguration", targetDepth)) {
                    context.nextToken();
                    dataSourceConfiguration.setWorkDocsConfiguration(WorkDocsConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("FsxConfiguration", targetDepth)) {
                    context.nextToken();
                    dataSourceConfiguration.setFsxConfiguration(FsxConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SlackConfiguration", targetDepth)) {
                    context.nextToken();
                    dataSourceConfiguration.setSlackConfiguration(SlackConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("BoxConfiguration", targetDepth)) {
                    context.nextToken();
                    dataSourceConfiguration.setBoxConfiguration(BoxConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("QuipConfiguration", targetDepth)) {
                    context.nextToken();
                    dataSourceConfiguration.setQuipConfiguration(QuipConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("JiraConfiguration", targetDepth)) {
                    context.nextToken();
                    dataSourceConfiguration.setJiraConfiguration(JiraConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("GitHubConfiguration", targetDepth)) {
                    context.nextToken();
                    dataSourceConfiguration.setGitHubConfiguration(GitHubConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AlfrescoConfiguration", targetDepth)) {
                    context.nextToken();
                    dataSourceConfiguration.setAlfrescoConfiguration(AlfrescoConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TemplateConfiguration", targetDepth)) {
                    context.nextToken();
                    dataSourceConfiguration.setTemplateConfiguration(TemplateConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return dataSourceConfiguration;
    }

    private static DataSourceConfigurationJsonUnmarshaller instance;

    public static DataSourceConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DataSourceConfigurationJsonUnmarshaller();
        return instance;
    }
}
