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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides the configuration information to include certain types of GitHub content. You can configure to index
 * repository files only, or also include issues and pull requests, comments, and comment attachments.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/GitHubDocumentCrawlProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GitHubDocumentCrawlProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * <code>TRUE</code> to index all files with a repository.
     * </p>
     */
    private Boolean crawlRepositoryDocuments;
    /**
     * <p>
     * <code>TRUE</code> to index all issues within a repository.
     * </p>
     */
    private Boolean crawlIssue;
    /**
     * <p>
     * <code>TRUE</code> to index all comments on issues.
     * </p>
     */
    private Boolean crawlIssueComment;
    /**
     * <p>
     * <code>TRUE</code> to include all comment attachments for issues.
     * </p>
     */
    private Boolean crawlIssueCommentAttachment;
    /**
     * <p>
     * <code>TRUE</code> to index all pull requests within a repository.
     * </p>
     */
    private Boolean crawlPullRequest;
    /**
     * <p>
     * <code>TRUE</code> to index all comments on pull requests.
     * </p>
     */
    private Boolean crawlPullRequestComment;
    /**
     * <p>
     * <code>TRUE</code> to include all comment attachments for pull requests.
     * </p>
     */
    private Boolean crawlPullRequestCommentAttachment;

    /**
     * <p>
     * <code>TRUE</code> to index all files with a repository.
     * </p>
     * 
     * @param crawlRepositoryDocuments
     *        <code>TRUE</code> to index all files with a repository.
     */

    public void setCrawlRepositoryDocuments(Boolean crawlRepositoryDocuments) {
        this.crawlRepositoryDocuments = crawlRepositoryDocuments;
    }

    /**
     * <p>
     * <code>TRUE</code> to index all files with a repository.
     * </p>
     * 
     * @return <code>TRUE</code> to index all files with a repository.
     */

    public Boolean getCrawlRepositoryDocuments() {
        return this.crawlRepositoryDocuments;
    }

    /**
     * <p>
     * <code>TRUE</code> to index all files with a repository.
     * </p>
     * 
     * @param crawlRepositoryDocuments
     *        <code>TRUE</code> to index all files with a repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitHubDocumentCrawlProperties withCrawlRepositoryDocuments(Boolean crawlRepositoryDocuments) {
        setCrawlRepositoryDocuments(crawlRepositoryDocuments);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> to index all files with a repository.
     * </p>
     * 
     * @return <code>TRUE</code> to index all files with a repository.
     */

    public Boolean isCrawlRepositoryDocuments() {
        return this.crawlRepositoryDocuments;
    }

    /**
     * <p>
     * <code>TRUE</code> to index all issues within a repository.
     * </p>
     * 
     * @param crawlIssue
     *        <code>TRUE</code> to index all issues within a repository.
     */

    public void setCrawlIssue(Boolean crawlIssue) {
        this.crawlIssue = crawlIssue;
    }

    /**
     * <p>
     * <code>TRUE</code> to index all issues within a repository.
     * </p>
     * 
     * @return <code>TRUE</code> to index all issues within a repository.
     */

    public Boolean getCrawlIssue() {
        return this.crawlIssue;
    }

    /**
     * <p>
     * <code>TRUE</code> to index all issues within a repository.
     * </p>
     * 
     * @param crawlIssue
     *        <code>TRUE</code> to index all issues within a repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitHubDocumentCrawlProperties withCrawlIssue(Boolean crawlIssue) {
        setCrawlIssue(crawlIssue);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> to index all issues within a repository.
     * </p>
     * 
     * @return <code>TRUE</code> to index all issues within a repository.
     */

    public Boolean isCrawlIssue() {
        return this.crawlIssue;
    }

    /**
     * <p>
     * <code>TRUE</code> to index all comments on issues.
     * </p>
     * 
     * @param crawlIssueComment
     *        <code>TRUE</code> to index all comments on issues.
     */

    public void setCrawlIssueComment(Boolean crawlIssueComment) {
        this.crawlIssueComment = crawlIssueComment;
    }

    /**
     * <p>
     * <code>TRUE</code> to index all comments on issues.
     * </p>
     * 
     * @return <code>TRUE</code> to index all comments on issues.
     */

    public Boolean getCrawlIssueComment() {
        return this.crawlIssueComment;
    }

    /**
     * <p>
     * <code>TRUE</code> to index all comments on issues.
     * </p>
     * 
     * @param crawlIssueComment
     *        <code>TRUE</code> to index all comments on issues.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitHubDocumentCrawlProperties withCrawlIssueComment(Boolean crawlIssueComment) {
        setCrawlIssueComment(crawlIssueComment);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> to index all comments on issues.
     * </p>
     * 
     * @return <code>TRUE</code> to index all comments on issues.
     */

    public Boolean isCrawlIssueComment() {
        return this.crawlIssueComment;
    }

    /**
     * <p>
     * <code>TRUE</code> to include all comment attachments for issues.
     * </p>
     * 
     * @param crawlIssueCommentAttachment
     *        <code>TRUE</code> to include all comment attachments for issues.
     */

    public void setCrawlIssueCommentAttachment(Boolean crawlIssueCommentAttachment) {
        this.crawlIssueCommentAttachment = crawlIssueCommentAttachment;
    }

    /**
     * <p>
     * <code>TRUE</code> to include all comment attachments for issues.
     * </p>
     * 
     * @return <code>TRUE</code> to include all comment attachments for issues.
     */

    public Boolean getCrawlIssueCommentAttachment() {
        return this.crawlIssueCommentAttachment;
    }

    /**
     * <p>
     * <code>TRUE</code> to include all comment attachments for issues.
     * </p>
     * 
     * @param crawlIssueCommentAttachment
     *        <code>TRUE</code> to include all comment attachments for issues.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitHubDocumentCrawlProperties withCrawlIssueCommentAttachment(Boolean crawlIssueCommentAttachment) {
        setCrawlIssueCommentAttachment(crawlIssueCommentAttachment);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> to include all comment attachments for issues.
     * </p>
     * 
     * @return <code>TRUE</code> to include all comment attachments for issues.
     */

    public Boolean isCrawlIssueCommentAttachment() {
        return this.crawlIssueCommentAttachment;
    }

    /**
     * <p>
     * <code>TRUE</code> to index all pull requests within a repository.
     * </p>
     * 
     * @param crawlPullRequest
     *        <code>TRUE</code> to index all pull requests within a repository.
     */

    public void setCrawlPullRequest(Boolean crawlPullRequest) {
        this.crawlPullRequest = crawlPullRequest;
    }

    /**
     * <p>
     * <code>TRUE</code> to index all pull requests within a repository.
     * </p>
     * 
     * @return <code>TRUE</code> to index all pull requests within a repository.
     */

    public Boolean getCrawlPullRequest() {
        return this.crawlPullRequest;
    }

    /**
     * <p>
     * <code>TRUE</code> to index all pull requests within a repository.
     * </p>
     * 
     * @param crawlPullRequest
     *        <code>TRUE</code> to index all pull requests within a repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitHubDocumentCrawlProperties withCrawlPullRequest(Boolean crawlPullRequest) {
        setCrawlPullRequest(crawlPullRequest);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> to index all pull requests within a repository.
     * </p>
     * 
     * @return <code>TRUE</code> to index all pull requests within a repository.
     */

    public Boolean isCrawlPullRequest() {
        return this.crawlPullRequest;
    }

    /**
     * <p>
     * <code>TRUE</code> to index all comments on pull requests.
     * </p>
     * 
     * @param crawlPullRequestComment
     *        <code>TRUE</code> to index all comments on pull requests.
     */

    public void setCrawlPullRequestComment(Boolean crawlPullRequestComment) {
        this.crawlPullRequestComment = crawlPullRequestComment;
    }

    /**
     * <p>
     * <code>TRUE</code> to index all comments on pull requests.
     * </p>
     * 
     * @return <code>TRUE</code> to index all comments on pull requests.
     */

    public Boolean getCrawlPullRequestComment() {
        return this.crawlPullRequestComment;
    }

    /**
     * <p>
     * <code>TRUE</code> to index all comments on pull requests.
     * </p>
     * 
     * @param crawlPullRequestComment
     *        <code>TRUE</code> to index all comments on pull requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitHubDocumentCrawlProperties withCrawlPullRequestComment(Boolean crawlPullRequestComment) {
        setCrawlPullRequestComment(crawlPullRequestComment);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> to index all comments on pull requests.
     * </p>
     * 
     * @return <code>TRUE</code> to index all comments on pull requests.
     */

    public Boolean isCrawlPullRequestComment() {
        return this.crawlPullRequestComment;
    }

    /**
     * <p>
     * <code>TRUE</code> to include all comment attachments for pull requests.
     * </p>
     * 
     * @param crawlPullRequestCommentAttachment
     *        <code>TRUE</code> to include all comment attachments for pull requests.
     */

    public void setCrawlPullRequestCommentAttachment(Boolean crawlPullRequestCommentAttachment) {
        this.crawlPullRequestCommentAttachment = crawlPullRequestCommentAttachment;
    }

    /**
     * <p>
     * <code>TRUE</code> to include all comment attachments for pull requests.
     * </p>
     * 
     * @return <code>TRUE</code> to include all comment attachments for pull requests.
     */

    public Boolean getCrawlPullRequestCommentAttachment() {
        return this.crawlPullRequestCommentAttachment;
    }

    /**
     * <p>
     * <code>TRUE</code> to include all comment attachments for pull requests.
     * </p>
     * 
     * @param crawlPullRequestCommentAttachment
     *        <code>TRUE</code> to include all comment attachments for pull requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitHubDocumentCrawlProperties withCrawlPullRequestCommentAttachment(Boolean crawlPullRequestCommentAttachment) {
        setCrawlPullRequestCommentAttachment(crawlPullRequestCommentAttachment);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> to include all comment attachments for pull requests.
     * </p>
     * 
     * @return <code>TRUE</code> to include all comment attachments for pull requests.
     */

    public Boolean isCrawlPullRequestCommentAttachment() {
        return this.crawlPullRequestCommentAttachment;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCrawlRepositoryDocuments() != null)
            sb.append("CrawlRepositoryDocuments: ").append(getCrawlRepositoryDocuments()).append(",");
        if (getCrawlIssue() != null)
            sb.append("CrawlIssue: ").append(getCrawlIssue()).append(",");
        if (getCrawlIssueComment() != null)
            sb.append("CrawlIssueComment: ").append(getCrawlIssueComment()).append(",");
        if (getCrawlIssueCommentAttachment() != null)
            sb.append("CrawlIssueCommentAttachment: ").append(getCrawlIssueCommentAttachment()).append(",");
        if (getCrawlPullRequest() != null)
            sb.append("CrawlPullRequest: ").append(getCrawlPullRequest()).append(",");
        if (getCrawlPullRequestComment() != null)
            sb.append("CrawlPullRequestComment: ").append(getCrawlPullRequestComment()).append(",");
        if (getCrawlPullRequestCommentAttachment() != null)
            sb.append("CrawlPullRequestCommentAttachment: ").append(getCrawlPullRequestCommentAttachment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GitHubDocumentCrawlProperties == false)
            return false;
        GitHubDocumentCrawlProperties other = (GitHubDocumentCrawlProperties) obj;
        if (other.getCrawlRepositoryDocuments() == null ^ this.getCrawlRepositoryDocuments() == null)
            return false;
        if (other.getCrawlRepositoryDocuments() != null && other.getCrawlRepositoryDocuments().equals(this.getCrawlRepositoryDocuments()) == false)
            return false;
        if (other.getCrawlIssue() == null ^ this.getCrawlIssue() == null)
            return false;
        if (other.getCrawlIssue() != null && other.getCrawlIssue().equals(this.getCrawlIssue()) == false)
            return false;
        if (other.getCrawlIssueComment() == null ^ this.getCrawlIssueComment() == null)
            return false;
        if (other.getCrawlIssueComment() != null && other.getCrawlIssueComment().equals(this.getCrawlIssueComment()) == false)
            return false;
        if (other.getCrawlIssueCommentAttachment() == null ^ this.getCrawlIssueCommentAttachment() == null)
            return false;
        if (other.getCrawlIssueCommentAttachment() != null && other.getCrawlIssueCommentAttachment().equals(this.getCrawlIssueCommentAttachment()) == false)
            return false;
        if (other.getCrawlPullRequest() == null ^ this.getCrawlPullRequest() == null)
            return false;
        if (other.getCrawlPullRequest() != null && other.getCrawlPullRequest().equals(this.getCrawlPullRequest()) == false)
            return false;
        if (other.getCrawlPullRequestComment() == null ^ this.getCrawlPullRequestComment() == null)
            return false;
        if (other.getCrawlPullRequestComment() != null && other.getCrawlPullRequestComment().equals(this.getCrawlPullRequestComment()) == false)
            return false;
        if (other.getCrawlPullRequestCommentAttachment() == null ^ this.getCrawlPullRequestCommentAttachment() == null)
            return false;
        if (other.getCrawlPullRequestCommentAttachment() != null
                && other.getCrawlPullRequestCommentAttachment().equals(this.getCrawlPullRequestCommentAttachment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCrawlRepositoryDocuments() == null) ? 0 : getCrawlRepositoryDocuments().hashCode());
        hashCode = prime * hashCode + ((getCrawlIssue() == null) ? 0 : getCrawlIssue().hashCode());
        hashCode = prime * hashCode + ((getCrawlIssueComment() == null) ? 0 : getCrawlIssueComment().hashCode());
        hashCode = prime * hashCode + ((getCrawlIssueCommentAttachment() == null) ? 0 : getCrawlIssueCommentAttachment().hashCode());
        hashCode = prime * hashCode + ((getCrawlPullRequest() == null) ? 0 : getCrawlPullRequest().hashCode());
        hashCode = prime * hashCode + ((getCrawlPullRequestComment() == null) ? 0 : getCrawlPullRequestComment().hashCode());
        hashCode = prime * hashCode + ((getCrawlPullRequestCommentAttachment() == null) ? 0 : getCrawlPullRequestCommentAttachment().hashCode());
        return hashCode;
    }

    @Override
    public GitHubDocumentCrawlProperties clone() {
        try {
            return (GitHubDocumentCrawlProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.GitHubDocumentCrawlPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
