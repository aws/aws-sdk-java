/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/OverridePullRequestApprovalRules"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OverridePullRequestApprovalRulesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The system-generated ID of the pull request for which you want to override all approval rule requirements. To get
     * this information, use <a>GetPullRequest</a>.
     * </p>
     */
    private String pullRequestId;
    /**
     * <p>
     * The system-generated ID of the most recent revision of the pull request. You cannot override approval rules for
     * anything but the most recent revision of a pull request. To get the revision ID, use GetPullRequest.
     * </p>
     */
    private String revisionId;
    /**
     * <p>
     * Whether you want to set aside approval rule requirements for the pull request (OVERRIDE) or revoke a previous
     * override and apply approval rule requirements (REVOKE). REVOKE status is not stored.
     * </p>
     */
    private String overrideStatus;

    /**
     * <p>
     * The system-generated ID of the pull request for which you want to override all approval rule requirements. To get
     * this information, use <a>GetPullRequest</a>.
     * </p>
     * 
     * @param pullRequestId
     *        The system-generated ID of the pull request for which you want to override all approval rule requirements.
     *        To get this information, use <a>GetPullRequest</a>.
     */

    public void setPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
    }

    /**
     * <p>
     * The system-generated ID of the pull request for which you want to override all approval rule requirements. To get
     * this information, use <a>GetPullRequest</a>.
     * </p>
     * 
     * @return The system-generated ID of the pull request for which you want to override all approval rule
     *         requirements. To get this information, use <a>GetPullRequest</a>.
     */

    public String getPullRequestId() {
        return this.pullRequestId;
    }

    /**
     * <p>
     * The system-generated ID of the pull request for which you want to override all approval rule requirements. To get
     * this information, use <a>GetPullRequest</a>.
     * </p>
     * 
     * @param pullRequestId
     *        The system-generated ID of the pull request for which you want to override all approval rule requirements.
     *        To get this information, use <a>GetPullRequest</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OverridePullRequestApprovalRulesRequest withPullRequestId(String pullRequestId) {
        setPullRequestId(pullRequestId);
        return this;
    }

    /**
     * <p>
     * The system-generated ID of the most recent revision of the pull request. You cannot override approval rules for
     * anything but the most recent revision of a pull request. To get the revision ID, use GetPullRequest.
     * </p>
     * 
     * @param revisionId
     *        The system-generated ID of the most recent revision of the pull request. You cannot override approval
     *        rules for anything but the most recent revision of a pull request. To get the revision ID, use
     *        GetPullRequest.
     */

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * The system-generated ID of the most recent revision of the pull request. You cannot override approval rules for
     * anything but the most recent revision of a pull request. To get the revision ID, use GetPullRequest.
     * </p>
     * 
     * @return The system-generated ID of the most recent revision of the pull request. You cannot override approval
     *         rules for anything but the most recent revision of a pull request. To get the revision ID, use
     *         GetPullRequest.
     */

    public String getRevisionId() {
        return this.revisionId;
    }

    /**
     * <p>
     * The system-generated ID of the most recent revision of the pull request. You cannot override approval rules for
     * anything but the most recent revision of a pull request. To get the revision ID, use GetPullRequest.
     * </p>
     * 
     * @param revisionId
     *        The system-generated ID of the most recent revision of the pull request. You cannot override approval
     *        rules for anything but the most recent revision of a pull request. To get the revision ID, use
     *        GetPullRequest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OverridePullRequestApprovalRulesRequest withRevisionId(String revisionId) {
        setRevisionId(revisionId);
        return this;
    }

    /**
     * <p>
     * Whether you want to set aside approval rule requirements for the pull request (OVERRIDE) or revoke a previous
     * override and apply approval rule requirements (REVOKE). REVOKE status is not stored.
     * </p>
     * 
     * @param overrideStatus
     *        Whether you want to set aside approval rule requirements for the pull request (OVERRIDE) or revoke a
     *        previous override and apply approval rule requirements (REVOKE). REVOKE status is not stored.
     * @see OverrideStatus
     */

    public void setOverrideStatus(String overrideStatus) {
        this.overrideStatus = overrideStatus;
    }

    /**
     * <p>
     * Whether you want to set aside approval rule requirements for the pull request (OVERRIDE) or revoke a previous
     * override and apply approval rule requirements (REVOKE). REVOKE status is not stored.
     * </p>
     * 
     * @return Whether you want to set aside approval rule requirements for the pull request (OVERRIDE) or revoke a
     *         previous override and apply approval rule requirements (REVOKE). REVOKE status is not stored.
     * @see OverrideStatus
     */

    public String getOverrideStatus() {
        return this.overrideStatus;
    }

    /**
     * <p>
     * Whether you want to set aside approval rule requirements for the pull request (OVERRIDE) or revoke a previous
     * override and apply approval rule requirements (REVOKE). REVOKE status is not stored.
     * </p>
     * 
     * @param overrideStatus
     *        Whether you want to set aside approval rule requirements for the pull request (OVERRIDE) or revoke a
     *        previous override and apply approval rule requirements (REVOKE). REVOKE status is not stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OverrideStatus
     */

    public OverridePullRequestApprovalRulesRequest withOverrideStatus(String overrideStatus) {
        setOverrideStatus(overrideStatus);
        return this;
    }

    /**
     * <p>
     * Whether you want to set aside approval rule requirements for the pull request (OVERRIDE) or revoke a previous
     * override and apply approval rule requirements (REVOKE). REVOKE status is not stored.
     * </p>
     * 
     * @param overrideStatus
     *        Whether you want to set aside approval rule requirements for the pull request (OVERRIDE) or revoke a
     *        previous override and apply approval rule requirements (REVOKE). REVOKE status is not stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OverrideStatus
     */

    public OverridePullRequestApprovalRulesRequest withOverrideStatus(OverrideStatus overrideStatus) {
        this.overrideStatus = overrideStatus.toString();
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
        if (getRevisionId() != null)
            sb.append("RevisionId: ").append(getRevisionId()).append(",");
        if (getOverrideStatus() != null)
            sb.append("OverrideStatus: ").append(getOverrideStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OverridePullRequestApprovalRulesRequest == false)
            return false;
        OverridePullRequestApprovalRulesRequest other = (OverridePullRequestApprovalRulesRequest) obj;
        if (other.getPullRequestId() == null ^ this.getPullRequestId() == null)
            return false;
        if (other.getPullRequestId() != null && other.getPullRequestId().equals(this.getPullRequestId()) == false)
            return false;
        if (other.getRevisionId() == null ^ this.getRevisionId() == null)
            return false;
        if (other.getRevisionId() != null && other.getRevisionId().equals(this.getRevisionId()) == false)
            return false;
        if (other.getOverrideStatus() == null ^ this.getOverrideStatus() == null)
            return false;
        if (other.getOverrideStatus() != null && other.getOverrideStatus().equals(this.getOverrideStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPullRequestId() == null) ? 0 : getPullRequestId().hashCode());
        hashCode = prime * hashCode + ((getRevisionId() == null) ? 0 : getRevisionId().hashCode());
        hashCode = prime * hashCode + ((getOverrideStatus() == null) ? 0 : getOverrideStatus().hashCode());
        return hashCode;
    }

    @Override
    public OverridePullRequestApprovalRulesRequest clone() {
        return (OverridePullRequestApprovalRulesRequest) super.clone();
    }

}
