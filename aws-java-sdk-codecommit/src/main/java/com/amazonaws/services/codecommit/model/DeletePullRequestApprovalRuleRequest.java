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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/DeletePullRequestApprovalRule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeletePullRequestApprovalRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The system-generated ID of the pull request that contains the approval rule you want to delete.
     * </p>
     */
    private String pullRequestId;
    /**
     * <p>
     * The name of the approval rule you want to delete.
     * </p>
     */
    private String approvalRuleName;

    /**
     * <p>
     * The system-generated ID of the pull request that contains the approval rule you want to delete.
     * </p>
     * 
     * @param pullRequestId
     *        The system-generated ID of the pull request that contains the approval rule you want to delete.
     */

    public void setPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
    }

    /**
     * <p>
     * The system-generated ID of the pull request that contains the approval rule you want to delete.
     * </p>
     * 
     * @return The system-generated ID of the pull request that contains the approval rule you want to delete.
     */

    public String getPullRequestId() {
        return this.pullRequestId;
    }

    /**
     * <p>
     * The system-generated ID of the pull request that contains the approval rule you want to delete.
     * </p>
     * 
     * @param pullRequestId
     *        The system-generated ID of the pull request that contains the approval rule you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePullRequestApprovalRuleRequest withPullRequestId(String pullRequestId) {
        setPullRequestId(pullRequestId);
        return this;
    }

    /**
     * <p>
     * The name of the approval rule you want to delete.
     * </p>
     * 
     * @param approvalRuleName
     *        The name of the approval rule you want to delete.
     */

    public void setApprovalRuleName(String approvalRuleName) {
        this.approvalRuleName = approvalRuleName;
    }

    /**
     * <p>
     * The name of the approval rule you want to delete.
     * </p>
     * 
     * @return The name of the approval rule you want to delete.
     */

    public String getApprovalRuleName() {
        return this.approvalRuleName;
    }

    /**
     * <p>
     * The name of the approval rule you want to delete.
     * </p>
     * 
     * @param approvalRuleName
     *        The name of the approval rule you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePullRequestApprovalRuleRequest withApprovalRuleName(String approvalRuleName) {
        setApprovalRuleName(approvalRuleName);
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
        if (getApprovalRuleName() != null)
            sb.append("ApprovalRuleName: ").append(getApprovalRuleName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeletePullRequestApprovalRuleRequest == false)
            return false;
        DeletePullRequestApprovalRuleRequest other = (DeletePullRequestApprovalRuleRequest) obj;
        if (other.getPullRequestId() == null ^ this.getPullRequestId() == null)
            return false;
        if (other.getPullRequestId() != null && other.getPullRequestId().equals(this.getPullRequestId()) == false)
            return false;
        if (other.getApprovalRuleName() == null ^ this.getApprovalRuleName() == null)
            return false;
        if (other.getApprovalRuleName() != null && other.getApprovalRuleName().equals(this.getApprovalRuleName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPullRequestId() == null) ? 0 : getPullRequestId().hashCode());
        hashCode = prime * hashCode + ((getApprovalRuleName() == null) ? 0 : getApprovalRuleName().hashCode());
        return hashCode;
    }

    @Override
    public DeletePullRequestApprovalRuleRequest clone() {
        return (DeletePullRequestApprovalRuleRequest) super.clone();
    }

}
