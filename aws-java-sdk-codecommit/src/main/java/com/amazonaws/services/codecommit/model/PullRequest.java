/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codecommit.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns information about a pull request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/PullRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PullRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The system-generated ID of the pull request.
     * </p>
     */
    private String pullRequestId;
    /**
     * <p>
     * The user-defined title of the pull request. This title is displayed in the list of pull requests to other users
     * of the repository.
     * </p>
     */
    private String title;
    /**
     * <p>
     * The user-defined description of the pull request. This description can be used to clarify what should be reviewed
     * and other details of the request.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The day and time of the last user or system activity on the pull request, in timestamp format.
     * </p>
     */
    private java.util.Date lastActivityDate;
    /**
     * <p>
     * The date and time the pull request was originally created, in timestamp format.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The status of the pull request. Pull request status can only change from <code>OPEN</code> to <code>CLOSED</code>
     * .
     * </p>
     */
    private String pullRequestStatus;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who created the pull request.
     * </p>
     */
    private String authorArn;
    /**
     * <p>
     * The targets of the pull request, including the source branch and destination branch for the pull request.
     * </p>
     */
    private java.util.List<PullRequestTarget> pullRequestTargets;
    /**
     * <p>
     * A unique, client-generated idempotency token that when provided in a request, ensures the request cannot be
     * repeated with a changed parameter. If a request is received with the same parameters and a token is included, the
     * request will return information about the initial request that used that token.
     * </p>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The system-generated ID of the pull request.
     * </p>
     * 
     * @param pullRequestId
     *        The system-generated ID of the pull request.
     */

    public void setPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
    }

    /**
     * <p>
     * The system-generated ID of the pull request.
     * </p>
     * 
     * @return The system-generated ID of the pull request.
     */

    public String getPullRequestId() {
        return this.pullRequestId;
    }

    /**
     * <p>
     * The system-generated ID of the pull request.
     * </p>
     * 
     * @param pullRequestId
     *        The system-generated ID of the pull request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PullRequest withPullRequestId(String pullRequestId) {
        setPullRequestId(pullRequestId);
        return this;
    }

    /**
     * <p>
     * The user-defined title of the pull request. This title is displayed in the list of pull requests to other users
     * of the repository.
     * </p>
     * 
     * @param title
     *        The user-defined title of the pull request. This title is displayed in the list of pull requests to other
     *        users of the repository.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The user-defined title of the pull request. This title is displayed in the list of pull requests to other users
     * of the repository.
     * </p>
     * 
     * @return The user-defined title of the pull request. This title is displayed in the list of pull requests to other
     *         users of the repository.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The user-defined title of the pull request. This title is displayed in the list of pull requests to other users
     * of the repository.
     * </p>
     * 
     * @param title
     *        The user-defined title of the pull request. This title is displayed in the list of pull requests to other
     *        users of the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PullRequest withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * The user-defined description of the pull request. This description can be used to clarify what should be reviewed
     * and other details of the request.
     * </p>
     * 
     * @param description
     *        The user-defined description of the pull request. This description can be used to clarify what should be
     *        reviewed and other details of the request.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The user-defined description of the pull request. This description can be used to clarify what should be reviewed
     * and other details of the request.
     * </p>
     * 
     * @return The user-defined description of the pull request. This description can be used to clarify what should be
     *         reviewed and other details of the request.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The user-defined description of the pull request. This description can be used to clarify what should be reviewed
     * and other details of the request.
     * </p>
     * 
     * @param description
     *        The user-defined description of the pull request. This description can be used to clarify what should be
     *        reviewed and other details of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PullRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The day and time of the last user or system activity on the pull request, in timestamp format.
     * </p>
     * 
     * @param lastActivityDate
     *        The day and time of the last user or system activity on the pull request, in timestamp format.
     */

    public void setLastActivityDate(java.util.Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }

    /**
     * <p>
     * The day and time of the last user or system activity on the pull request, in timestamp format.
     * </p>
     * 
     * @return The day and time of the last user or system activity on the pull request, in timestamp format.
     */

    public java.util.Date getLastActivityDate() {
        return this.lastActivityDate;
    }

    /**
     * <p>
     * The day and time of the last user or system activity on the pull request, in timestamp format.
     * </p>
     * 
     * @param lastActivityDate
     *        The day and time of the last user or system activity on the pull request, in timestamp format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PullRequest withLastActivityDate(java.util.Date lastActivityDate) {
        setLastActivityDate(lastActivityDate);
        return this;
    }

    /**
     * <p>
     * The date and time the pull request was originally created, in timestamp format.
     * </p>
     * 
     * @param creationDate
     *        The date and time the pull request was originally created, in timestamp format.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time the pull request was originally created, in timestamp format.
     * </p>
     * 
     * @return The date and time the pull request was originally created, in timestamp format.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date and time the pull request was originally created, in timestamp format.
     * </p>
     * 
     * @param creationDate
     *        The date and time the pull request was originally created, in timestamp format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PullRequest withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The status of the pull request. Pull request status can only change from <code>OPEN</code> to <code>CLOSED</code>
     * .
     * </p>
     * 
     * @param pullRequestStatus
     *        The status of the pull request. Pull request status can only change from <code>OPEN</code> to
     *        <code>CLOSED</code>.
     * @see PullRequestStatusEnum
     */

    public void setPullRequestStatus(String pullRequestStatus) {
        this.pullRequestStatus = pullRequestStatus;
    }

    /**
     * <p>
     * The status of the pull request. Pull request status can only change from <code>OPEN</code> to <code>CLOSED</code>
     * .
     * </p>
     * 
     * @return The status of the pull request. Pull request status can only change from <code>OPEN</code> to
     *         <code>CLOSED</code>.
     * @see PullRequestStatusEnum
     */

    public String getPullRequestStatus() {
        return this.pullRequestStatus;
    }

    /**
     * <p>
     * The status of the pull request. Pull request status can only change from <code>OPEN</code> to <code>CLOSED</code>
     * .
     * </p>
     * 
     * @param pullRequestStatus
     *        The status of the pull request. Pull request status can only change from <code>OPEN</code> to
     *        <code>CLOSED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PullRequestStatusEnum
     */

    public PullRequest withPullRequestStatus(String pullRequestStatus) {
        setPullRequestStatus(pullRequestStatus);
        return this;
    }

    /**
     * <p>
     * The status of the pull request. Pull request status can only change from <code>OPEN</code> to <code>CLOSED</code>
     * .
     * </p>
     * 
     * @param pullRequestStatus
     *        The status of the pull request. Pull request status can only change from <code>OPEN</code> to
     *        <code>CLOSED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PullRequestStatusEnum
     */

    public PullRequest withPullRequestStatus(PullRequestStatusEnum pullRequestStatus) {
        this.pullRequestStatus = pullRequestStatus.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who created the pull request.
     * </p>
     * 
     * @param authorArn
     *        The Amazon Resource Name (ARN) of the user who created the pull request.
     */

    public void setAuthorArn(String authorArn) {
        this.authorArn = authorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who created the pull request.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the user who created the pull request.
     */

    public String getAuthorArn() {
        return this.authorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who created the pull request.
     * </p>
     * 
     * @param authorArn
     *        The Amazon Resource Name (ARN) of the user who created the pull request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PullRequest withAuthorArn(String authorArn) {
        setAuthorArn(authorArn);
        return this;
    }

    /**
     * <p>
     * The targets of the pull request, including the source branch and destination branch for the pull request.
     * </p>
     * 
     * @return The targets of the pull request, including the source branch and destination branch for the pull request.
     */

    public java.util.List<PullRequestTarget> getPullRequestTargets() {
        return pullRequestTargets;
    }

    /**
     * <p>
     * The targets of the pull request, including the source branch and destination branch for the pull request.
     * </p>
     * 
     * @param pullRequestTargets
     *        The targets of the pull request, including the source branch and destination branch for the pull request.
     */

    public void setPullRequestTargets(java.util.Collection<PullRequestTarget> pullRequestTargets) {
        if (pullRequestTargets == null) {
            this.pullRequestTargets = null;
            return;
        }

        this.pullRequestTargets = new java.util.ArrayList<PullRequestTarget>(pullRequestTargets);
    }

    /**
     * <p>
     * The targets of the pull request, including the source branch and destination branch for the pull request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPullRequestTargets(java.util.Collection)} or {@link #withPullRequestTargets(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param pullRequestTargets
     *        The targets of the pull request, including the source branch and destination branch for the pull request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PullRequest withPullRequestTargets(PullRequestTarget... pullRequestTargets) {
        if (this.pullRequestTargets == null) {
            setPullRequestTargets(new java.util.ArrayList<PullRequestTarget>(pullRequestTargets.length));
        }
        for (PullRequestTarget ele : pullRequestTargets) {
            this.pullRequestTargets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The targets of the pull request, including the source branch and destination branch for the pull request.
     * </p>
     * 
     * @param pullRequestTargets
     *        The targets of the pull request, including the source branch and destination branch for the pull request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PullRequest withPullRequestTargets(java.util.Collection<PullRequestTarget> pullRequestTargets) {
        setPullRequestTargets(pullRequestTargets);
        return this;
    }

    /**
     * <p>
     * A unique, client-generated idempotency token that when provided in a request, ensures the request cannot be
     * repeated with a changed parameter. If a request is received with the same parameters and a token is included, the
     * request will return information about the initial request that used that token.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique, client-generated idempotency token that when provided in a request, ensures the request cannot
     *        be repeated with a changed parameter. If a request is received with the same parameters and a token is
     *        included, the request will return information about the initial request that used that token.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A unique, client-generated idempotency token that when provided in a request, ensures the request cannot be
     * repeated with a changed parameter. If a request is received with the same parameters and a token is included, the
     * request will return information about the initial request that used that token.
     * </p>
     * 
     * @return A unique, client-generated idempotency token that when provided in a request, ensures the request cannot
     *         be repeated with a changed parameter. If a request is received with the same parameters and a token is
     *         included, the request will return information about the initial request that used that token.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * A unique, client-generated idempotency token that when provided in a request, ensures the request cannot be
     * repeated with a changed parameter. If a request is received with the same parameters and a token is included, the
     * request will return information about the initial request that used that token.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique, client-generated idempotency token that when provided in a request, ensures the request cannot
     *        be repeated with a changed parameter. If a request is received with the same parameters and a token is
     *        included, the request will return information about the initial request that used that token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PullRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
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
        if (getPullRequestId() != null)
            sb.append("PullRequestId: ").append(getPullRequestId()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getLastActivityDate() != null)
            sb.append("LastActivityDate: ").append(getLastActivityDate()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getPullRequestStatus() != null)
            sb.append("PullRequestStatus: ").append(getPullRequestStatus()).append(",");
        if (getAuthorArn() != null)
            sb.append("AuthorArn: ").append(getAuthorArn()).append(",");
        if (getPullRequestTargets() != null)
            sb.append("PullRequestTargets: ").append(getPullRequestTargets()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PullRequest == false)
            return false;
        PullRequest other = (PullRequest) obj;
        if (other.getPullRequestId() == null ^ this.getPullRequestId() == null)
            return false;
        if (other.getPullRequestId() != null && other.getPullRequestId().equals(this.getPullRequestId()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLastActivityDate() == null ^ this.getLastActivityDate() == null)
            return false;
        if (other.getLastActivityDate() != null && other.getLastActivityDate().equals(this.getLastActivityDate()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getPullRequestStatus() == null ^ this.getPullRequestStatus() == null)
            return false;
        if (other.getPullRequestStatus() != null && other.getPullRequestStatus().equals(this.getPullRequestStatus()) == false)
            return false;
        if (other.getAuthorArn() == null ^ this.getAuthorArn() == null)
            return false;
        if (other.getAuthorArn() != null && other.getAuthorArn().equals(this.getAuthorArn()) == false)
            return false;
        if (other.getPullRequestTargets() == null ^ this.getPullRequestTargets() == null)
            return false;
        if (other.getPullRequestTargets() != null && other.getPullRequestTargets().equals(this.getPullRequestTargets()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPullRequestId() == null) ? 0 : getPullRequestId().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getLastActivityDate() == null) ? 0 : getLastActivityDate().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getPullRequestStatus() == null) ? 0 : getPullRequestStatus().hashCode());
        hashCode = prime * hashCode + ((getAuthorArn() == null) ? 0 : getAuthorArn().hashCode());
        hashCode = prime * hashCode + ((getPullRequestTargets() == null) ? 0 : getPullRequestTargets().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public PullRequest clone() {
        try {
            return (PullRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codecommit.model.transform.PullRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
