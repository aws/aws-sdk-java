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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdateApprovalRuleTemplateContent"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateApprovalRuleTemplateContentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the approval rule template where you want to update the content of the rule.
     * </p>
     */
    private String approvalRuleTemplateName;
    /**
     * <p>
     * The content that replaces the existing content of the rule. Content statements must be complete. You cannot
     * provide only the changes.
     * </p>
     */
    private String newRuleContent;
    /**
     * <p>
     * The SHA-256 hash signature for the content of the approval rule. You can retrieve this information by using
     * <a>GetPullRequest</a>.
     * </p>
     */
    private String existingRuleContentSha256;

    /**
     * <p>
     * The name of the approval rule template where you want to update the content of the rule.
     * </p>
     * 
     * @param approvalRuleTemplateName
     *        The name of the approval rule template where you want to update the content of the rule.
     */

    public void setApprovalRuleTemplateName(String approvalRuleTemplateName) {
        this.approvalRuleTemplateName = approvalRuleTemplateName;
    }

    /**
     * <p>
     * The name of the approval rule template where you want to update the content of the rule.
     * </p>
     * 
     * @return The name of the approval rule template where you want to update the content of the rule.
     */

    public String getApprovalRuleTemplateName() {
        return this.approvalRuleTemplateName;
    }

    /**
     * <p>
     * The name of the approval rule template where you want to update the content of the rule.
     * </p>
     * 
     * @param approvalRuleTemplateName
     *        The name of the approval rule template where you want to update the content of the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApprovalRuleTemplateContentRequest withApprovalRuleTemplateName(String approvalRuleTemplateName) {
        setApprovalRuleTemplateName(approvalRuleTemplateName);
        return this;
    }

    /**
     * <p>
     * The content that replaces the existing content of the rule. Content statements must be complete. You cannot
     * provide only the changes.
     * </p>
     * 
     * @param newRuleContent
     *        The content that replaces the existing content of the rule. Content statements must be complete. You
     *        cannot provide only the changes.
     */

    public void setNewRuleContent(String newRuleContent) {
        this.newRuleContent = newRuleContent;
    }

    /**
     * <p>
     * The content that replaces the existing content of the rule. Content statements must be complete. You cannot
     * provide only the changes.
     * </p>
     * 
     * @return The content that replaces the existing content of the rule. Content statements must be complete. You
     *         cannot provide only the changes.
     */

    public String getNewRuleContent() {
        return this.newRuleContent;
    }

    /**
     * <p>
     * The content that replaces the existing content of the rule. Content statements must be complete. You cannot
     * provide only the changes.
     * </p>
     * 
     * @param newRuleContent
     *        The content that replaces the existing content of the rule. Content statements must be complete. You
     *        cannot provide only the changes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApprovalRuleTemplateContentRequest withNewRuleContent(String newRuleContent) {
        setNewRuleContent(newRuleContent);
        return this;
    }

    /**
     * <p>
     * The SHA-256 hash signature for the content of the approval rule. You can retrieve this information by using
     * <a>GetPullRequest</a>.
     * </p>
     * 
     * @param existingRuleContentSha256
     *        The SHA-256 hash signature for the content of the approval rule. You can retrieve this information by
     *        using <a>GetPullRequest</a>.
     */

    public void setExistingRuleContentSha256(String existingRuleContentSha256) {
        this.existingRuleContentSha256 = existingRuleContentSha256;
    }

    /**
     * <p>
     * The SHA-256 hash signature for the content of the approval rule. You can retrieve this information by using
     * <a>GetPullRequest</a>.
     * </p>
     * 
     * @return The SHA-256 hash signature for the content of the approval rule. You can retrieve this information by
     *         using <a>GetPullRequest</a>.
     */

    public String getExistingRuleContentSha256() {
        return this.existingRuleContentSha256;
    }

    /**
     * <p>
     * The SHA-256 hash signature for the content of the approval rule. You can retrieve this information by using
     * <a>GetPullRequest</a>.
     * </p>
     * 
     * @param existingRuleContentSha256
     *        The SHA-256 hash signature for the content of the approval rule. You can retrieve this information by
     *        using <a>GetPullRequest</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApprovalRuleTemplateContentRequest withExistingRuleContentSha256(String existingRuleContentSha256) {
        setExistingRuleContentSha256(existingRuleContentSha256);
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
        if (getApprovalRuleTemplateName() != null)
            sb.append("ApprovalRuleTemplateName: ").append(getApprovalRuleTemplateName()).append(",");
        if (getNewRuleContent() != null)
            sb.append("NewRuleContent: ").append(getNewRuleContent()).append(",");
        if (getExistingRuleContentSha256() != null)
            sb.append("ExistingRuleContentSha256: ").append(getExistingRuleContentSha256());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateApprovalRuleTemplateContentRequest == false)
            return false;
        UpdateApprovalRuleTemplateContentRequest other = (UpdateApprovalRuleTemplateContentRequest) obj;
        if (other.getApprovalRuleTemplateName() == null ^ this.getApprovalRuleTemplateName() == null)
            return false;
        if (other.getApprovalRuleTemplateName() != null && other.getApprovalRuleTemplateName().equals(this.getApprovalRuleTemplateName()) == false)
            return false;
        if (other.getNewRuleContent() == null ^ this.getNewRuleContent() == null)
            return false;
        if (other.getNewRuleContent() != null && other.getNewRuleContent().equals(this.getNewRuleContent()) == false)
            return false;
        if (other.getExistingRuleContentSha256() == null ^ this.getExistingRuleContentSha256() == null)
            return false;
        if (other.getExistingRuleContentSha256() != null && other.getExistingRuleContentSha256().equals(this.getExistingRuleContentSha256()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApprovalRuleTemplateName() == null) ? 0 : getApprovalRuleTemplateName().hashCode());
        hashCode = prime * hashCode + ((getNewRuleContent() == null) ? 0 : getNewRuleContent().hashCode());
        hashCode = prime * hashCode + ((getExistingRuleContentSha256() == null) ? 0 : getExistingRuleContentSha256().hashCode());
        return hashCode;
    }

    @Override
    public UpdateApprovalRuleTemplateContentRequest clone() {
        return (UpdateApprovalRuleTemplateContentRequest) super.clone();
    }

}
