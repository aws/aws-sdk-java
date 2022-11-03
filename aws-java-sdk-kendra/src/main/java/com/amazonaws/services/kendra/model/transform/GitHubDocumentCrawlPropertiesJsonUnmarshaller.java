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
 * GitHubDocumentCrawlProperties JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GitHubDocumentCrawlPropertiesJsonUnmarshaller implements Unmarshaller<GitHubDocumentCrawlProperties, JsonUnmarshallerContext> {

    public GitHubDocumentCrawlProperties unmarshall(JsonUnmarshallerContext context) throws Exception {
        GitHubDocumentCrawlProperties gitHubDocumentCrawlProperties = new GitHubDocumentCrawlProperties();

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
                if (context.testExpression("CrawlRepositoryDocuments", targetDepth)) {
                    context.nextToken();
                    gitHubDocumentCrawlProperties.setCrawlRepositoryDocuments(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("CrawlIssue", targetDepth)) {
                    context.nextToken();
                    gitHubDocumentCrawlProperties.setCrawlIssue(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("CrawlIssueComment", targetDepth)) {
                    context.nextToken();
                    gitHubDocumentCrawlProperties.setCrawlIssueComment(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("CrawlIssueCommentAttachment", targetDepth)) {
                    context.nextToken();
                    gitHubDocumentCrawlProperties.setCrawlIssueCommentAttachment(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("CrawlPullRequest", targetDepth)) {
                    context.nextToken();
                    gitHubDocumentCrawlProperties.setCrawlPullRequest(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("CrawlPullRequestComment", targetDepth)) {
                    context.nextToken();
                    gitHubDocumentCrawlProperties.setCrawlPullRequestComment(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("CrawlPullRequestCommentAttachment", targetDepth)) {
                    context.nextToken();
                    gitHubDocumentCrawlProperties.setCrawlPullRequestCommentAttachment(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return gitHubDocumentCrawlProperties;
    }

    private static GitHubDocumentCrawlPropertiesJsonUnmarshaller instance;

    public static GitHubDocumentCrawlPropertiesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GitHubDocumentCrawlPropertiesJsonUnmarshaller();
        return instance;
    }
}
