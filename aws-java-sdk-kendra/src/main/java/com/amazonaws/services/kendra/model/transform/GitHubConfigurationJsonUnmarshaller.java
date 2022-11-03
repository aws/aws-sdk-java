/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * GitHubConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GitHubConfigurationJsonUnmarshaller implements Unmarshaller<GitHubConfiguration, JsonUnmarshallerContext> {

    public GitHubConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        GitHubConfiguration gitHubConfiguration = new GitHubConfiguration();

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
                if (context.testExpression("SaaSConfiguration", targetDepth)) {
                    context.nextToken();
                    gitHubConfiguration.setSaaSConfiguration(SaaSConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("OnPremiseConfiguration", targetDepth)) {
                    context.nextToken();
                    gitHubConfiguration.setOnPremiseConfiguration(OnPremiseConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    context.nextToken();
                    gitHubConfiguration.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecretArn", targetDepth)) {
                    context.nextToken();
                    gitHubConfiguration.setSecretArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UseChangeLog", targetDepth)) {
                    context.nextToken();
                    gitHubConfiguration.setUseChangeLog(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("GitHubDocumentCrawlProperties", targetDepth)) {
                    context.nextToken();
                    gitHubConfiguration.setGitHubDocumentCrawlProperties(GitHubDocumentCrawlPropertiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RepositoryFilter", targetDepth)) {
                    context.nextToken();
                    gitHubConfiguration.setRepositoryFilter(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("InclusionFolderNamePatterns", targetDepth)) {
                    context.nextToken();
                    gitHubConfiguration.setInclusionFolderNamePatterns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("InclusionFileTypePatterns", targetDepth)) {
                    context.nextToken();
                    gitHubConfiguration.setInclusionFileTypePatterns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("InclusionFileNamePatterns", targetDepth)) {
                    context.nextToken();
                    gitHubConfiguration.setInclusionFileNamePatterns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ExclusionFolderNamePatterns", targetDepth)) {
                    context.nextToken();
                    gitHubConfiguration.setExclusionFolderNamePatterns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ExclusionFileTypePatterns", targetDepth)) {
                    context.nextToken();
                    gitHubConfiguration.setExclusionFileTypePatterns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ExclusionFileNamePatterns", targetDepth)) {
                    context.nextToken();
                    gitHubConfiguration.setExclusionFileNamePatterns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("VpcConfiguration", targetDepth)) {
                    context.nextToken();
                    gitHubConfiguration.setVpcConfiguration(DataSourceVpcConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("GitHubRepositoryConfigurationFieldMappings", targetDepth)) {
                    context.nextToken();
                    gitHubConfiguration.setGitHubRepositoryConfigurationFieldMappings(new ListUnmarshaller<DataSourceToIndexFieldMapping>(
                            DataSourceToIndexFieldMappingJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("GitHubCommitConfigurationFieldMappings", targetDepth)) {
                    context.nextToken();
                    gitHubConfiguration.setGitHubCommitConfigurationFieldMappings(new ListUnmarshaller<DataSourceToIndexFieldMapping>(
                            DataSourceToIndexFieldMappingJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("GitHubIssueDocumentConfigurationFieldMappings", targetDepth)) {
                    context.nextToken();
                    gitHubConfiguration.setGitHubIssueDocumentConfigurationFieldMappings(new ListUnmarshaller<DataSourceToIndexFieldMapping>(
                            DataSourceToIndexFieldMappingJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("GitHubIssueCommentConfigurationFieldMappings", targetDepth)) {
                    context.nextToken();
                    gitHubConfiguration.setGitHubIssueCommentConfigurationFieldMappings(new ListUnmarshaller<DataSourceToIndexFieldMapping>(
                            DataSourceToIndexFieldMappingJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("GitHubIssueAttachmentConfigurationFieldMappings", targetDepth)) {
                    context.nextToken();
                    gitHubConfiguration.setGitHubIssueAttachmentConfigurationFieldMappings(new ListUnmarshaller<DataSourceToIndexFieldMapping>(
                            DataSourceToIndexFieldMappingJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("GitHubPullRequestCommentConfigurationFieldMappings", targetDepth)) {
                    context.nextToken();
                    gitHubConfiguration.setGitHubPullRequestCommentConfigurationFieldMappings(new ListUnmarshaller<DataSourceToIndexFieldMapping>(
                            DataSourceToIndexFieldMappingJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("GitHubPullRequestDocumentConfigurationFieldMappings", targetDepth)) {
                    context.nextToken();
                    gitHubConfiguration.setGitHubPullRequestDocumentConfigurationFieldMappings(new ListUnmarshaller<DataSourceToIndexFieldMapping>(
                            DataSourceToIndexFieldMappingJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("GitHubPullRequestDocumentAttachmentConfigurationFieldMappings", targetDepth)) {
                    context.nextToken();
                    gitHubConfiguration.setGitHubPullRequestDocumentAttachmentConfigurationFieldMappings(new ListUnmarshaller<DataSourceToIndexFieldMapping>(
                            DataSourceToIndexFieldMappingJsonUnmarshaller.getInstance())

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

        return gitHubConfiguration;
    }

    private static GitHubConfigurationJsonUnmarshaller instance;

    public static GitHubConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GitHubConfigurationJsonUnmarshaller();
        return instance;
    }
}
