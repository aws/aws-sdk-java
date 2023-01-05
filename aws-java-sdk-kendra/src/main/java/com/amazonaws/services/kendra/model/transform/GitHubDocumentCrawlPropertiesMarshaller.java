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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kendra.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GitHubDocumentCrawlPropertiesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GitHubDocumentCrawlPropertiesMarshaller {

    private static final MarshallingInfo<Boolean> CRAWLREPOSITORYDOCUMENTS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CrawlRepositoryDocuments").build();
    private static final MarshallingInfo<Boolean> CRAWLISSUE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CrawlIssue").build();
    private static final MarshallingInfo<Boolean> CRAWLISSUECOMMENT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CrawlIssueComment").build();
    private static final MarshallingInfo<Boolean> CRAWLISSUECOMMENTATTACHMENT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CrawlIssueCommentAttachment").build();
    private static final MarshallingInfo<Boolean> CRAWLPULLREQUEST_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CrawlPullRequest").build();
    private static final MarshallingInfo<Boolean> CRAWLPULLREQUESTCOMMENT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CrawlPullRequestComment").build();
    private static final MarshallingInfo<Boolean> CRAWLPULLREQUESTCOMMENTATTACHMENT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CrawlPullRequestCommentAttachment").build();

    private static final GitHubDocumentCrawlPropertiesMarshaller instance = new GitHubDocumentCrawlPropertiesMarshaller();

    public static GitHubDocumentCrawlPropertiesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GitHubDocumentCrawlProperties gitHubDocumentCrawlProperties, ProtocolMarshaller protocolMarshaller) {

        if (gitHubDocumentCrawlProperties == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(gitHubDocumentCrawlProperties.getCrawlRepositoryDocuments(), CRAWLREPOSITORYDOCUMENTS_BINDING);
            protocolMarshaller.marshall(gitHubDocumentCrawlProperties.getCrawlIssue(), CRAWLISSUE_BINDING);
            protocolMarshaller.marshall(gitHubDocumentCrawlProperties.getCrawlIssueComment(), CRAWLISSUECOMMENT_BINDING);
            protocolMarshaller.marshall(gitHubDocumentCrawlProperties.getCrawlIssueCommentAttachment(), CRAWLISSUECOMMENTATTACHMENT_BINDING);
            protocolMarshaller.marshall(gitHubDocumentCrawlProperties.getCrawlPullRequest(), CRAWLPULLREQUEST_BINDING);
            protocolMarshaller.marshall(gitHubDocumentCrawlProperties.getCrawlPullRequestComment(), CRAWLPULLREQUESTCOMMENT_BINDING);
            protocolMarshaller.marshall(gitHubDocumentCrawlProperties.getCrawlPullRequestCommentAttachment(), CRAWLPULLREQUESTCOMMENTATTACHMENT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
