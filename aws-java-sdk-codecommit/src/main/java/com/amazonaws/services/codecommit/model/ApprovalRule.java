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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns information about an approval rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/ApprovalRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApprovalRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The system-generated ID of the approval rule.
     * </p>
     */
    private String approvalRuleId;
    /**
     * <p>
     * The name of the approval rule.
     * </p>
     */
    private String approvalRuleName;
    /**
     * <p>
     * The content of the approval rule.
     * </p>
     */
    private String approvalRuleContent;
    /**
     * <p>
     * The SHA-256 hash signature for the content of the approval rule.
     * </p>
     */
    private String ruleContentSha256;
    /**
     * <p>
     * The date the approval rule was most recently changed, in timestamp format.
     * </p>
     */
    private java.util.Date lastModifiedDate;
    /**
     * <p>
     * The date the approval rule was created, in timestamp format.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who made the most recent changes to the approval rule.
     * </p>
     */
    private String lastModifiedUser;
    /**
     * <p>
     * The approval rule template used to create the rule.
     * </p>
     */
    private OriginApprovalRuleTemplate originApprovalRuleTemplate;

    /**
     * <p>
     * The system-generated ID of the approval rule.
     * </p>
     * 
     * @param approvalRuleId
     *        The system-generated ID of the approval rule.
     */

    public void setApprovalRuleId(String approvalRuleId) {
        this.approvalRuleId = approvalRuleId;
    }

    /**
     * <p>
     * The system-generated ID of the approval rule.
     * </p>
     * 
     * @return The system-generated ID of the approval rule.
     */

    public String getApprovalRuleId() {
        return this.approvalRuleId;
    }

    /**
     * <p>
     * The system-generated ID of the approval rule.
     * </p>
     * 
     * @param approvalRuleId
     *        The system-generated ID of the approval rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApprovalRule withApprovalRuleId(String approvalRuleId) {
        setApprovalRuleId(approvalRuleId);
        return this;
    }

    /**
     * <p>
     * The name of the approval rule.
     * </p>
     * 
     * @param approvalRuleName
     *        The name of the approval rule.
     */

    public void setApprovalRuleName(String approvalRuleName) {
        this.approvalRuleName = approvalRuleName;
    }

    /**
     * <p>
     * The name of the approval rule.
     * </p>
     * 
     * @return The name of the approval rule.
     */

    public String getApprovalRuleName() {
        return this.approvalRuleName;
    }

    /**
     * <p>
     * The name of the approval rule.
     * </p>
     * 
     * @param approvalRuleName
     *        The name of the approval rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApprovalRule withApprovalRuleName(String approvalRuleName) {
        setApprovalRuleName(approvalRuleName);
        return this;
    }

    /**
     * <p>
     * The content of the approval rule.
     * </p>
     * 
     * @param approvalRuleContent
     *        The content of the approval rule.
     */

    public void setApprovalRuleContent(String approvalRuleContent) {
        this.approvalRuleContent = approvalRuleContent;
    }

    /**
     * <p>
     * The content of the approval rule.
     * </p>
     * 
     * @return The content of the approval rule.
     */

    public String getApprovalRuleContent() {
        return this.approvalRuleContent;
    }

    /**
     * <p>
     * The content of the approval rule.
     * </p>
     * 
     * @param approvalRuleContent
     *        The content of the approval rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApprovalRule withApprovalRuleContent(String approvalRuleContent) {
        setApprovalRuleContent(approvalRuleContent);
        return this;
    }

    /**
     * <p>
     * The SHA-256 hash signature for the content of the approval rule.
     * </p>
     * 
     * @param ruleContentSha256
     *        The SHA-256 hash signature for the content of the approval rule.
     */

    public void setRuleContentSha256(String ruleContentSha256) {
        this.ruleContentSha256 = ruleContentSha256;
    }

    /**
     * <p>
     * The SHA-256 hash signature for the content of the approval rule.
     * </p>
     * 
     * @return The SHA-256 hash signature for the content of the approval rule.
     */

    public String getRuleContentSha256() {
        return this.ruleContentSha256;
    }

    /**
     * <p>
     * The SHA-256 hash signature for the content of the approval rule.
     * </p>
     * 
     * @param ruleContentSha256
     *        The SHA-256 hash signature for the content of the approval rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApprovalRule withRuleContentSha256(String ruleContentSha256) {
        setRuleContentSha256(ruleContentSha256);
        return this;
    }

    /**
     * <p>
     * The date the approval rule was most recently changed, in timestamp format.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date the approval rule was most recently changed, in timestamp format.
     */

    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date the approval rule was most recently changed, in timestamp format.
     * </p>
     * 
     * @return The date the approval rule was most recently changed, in timestamp format.
     */

    public java.util.Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The date the approval rule was most recently changed, in timestamp format.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date the approval rule was most recently changed, in timestamp format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApprovalRule withLastModifiedDate(java.util.Date lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * <p>
     * The date the approval rule was created, in timestamp format.
     * </p>
     * 
     * @param creationDate
     *        The date the approval rule was created, in timestamp format.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date the approval rule was created, in timestamp format.
     * </p>
     * 
     * @return The date the approval rule was created, in timestamp format.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date the approval rule was created, in timestamp format.
     * </p>
     * 
     * @param creationDate
     *        The date the approval rule was created, in timestamp format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApprovalRule withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who made the most recent changes to the approval rule.
     * </p>
     * 
     * @param lastModifiedUser
     *        The Amazon Resource Name (ARN) of the user who made the most recent changes to the approval rule.
     */

    public void setLastModifiedUser(String lastModifiedUser) {
        this.lastModifiedUser = lastModifiedUser;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who made the most recent changes to the approval rule.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the user who made the most recent changes to the approval rule.
     */

    public String getLastModifiedUser() {
        return this.lastModifiedUser;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who made the most recent changes to the approval rule.
     * </p>
     * 
     * @param lastModifiedUser
     *        The Amazon Resource Name (ARN) of the user who made the most recent changes to the approval rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApprovalRule withLastModifiedUser(String lastModifiedUser) {
        setLastModifiedUser(lastModifiedUser);
        return this;
    }

    /**
     * <p>
     * The approval rule template used to create the rule.
     * </p>
     * 
     * @param originApprovalRuleTemplate
     *        The approval rule template used to create the rule.
     */

    public void setOriginApprovalRuleTemplate(OriginApprovalRuleTemplate originApprovalRuleTemplate) {
        this.originApprovalRuleTemplate = originApprovalRuleTemplate;
    }

    /**
     * <p>
     * The approval rule template used to create the rule.
     * </p>
     * 
     * @return The approval rule template used to create the rule.
     */

    public OriginApprovalRuleTemplate getOriginApprovalRuleTemplate() {
        return this.originApprovalRuleTemplate;
    }

    /**
     * <p>
     * The approval rule template used to create the rule.
     * </p>
     * 
     * @param originApprovalRuleTemplate
     *        The approval rule template used to create the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApprovalRule withOriginApprovalRuleTemplate(OriginApprovalRuleTemplate originApprovalRuleTemplate) {
        setOriginApprovalRuleTemplate(originApprovalRuleTemplate);
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
        if (getApprovalRuleId() != null)
            sb.append("ApprovalRuleId: ").append(getApprovalRuleId()).append(",");
        if (getApprovalRuleName() != null)
            sb.append("ApprovalRuleName: ").append(getApprovalRuleName()).append(",");
        if (getApprovalRuleContent() != null)
            sb.append("ApprovalRuleContent: ").append(getApprovalRuleContent()).append(",");
        if (getRuleContentSha256() != null)
            sb.append("RuleContentSha256: ").append(getRuleContentSha256()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getLastModifiedUser() != null)
            sb.append("LastModifiedUser: ").append(getLastModifiedUser()).append(",");
        if (getOriginApprovalRuleTemplate() != null)
            sb.append("OriginApprovalRuleTemplate: ").append(getOriginApprovalRuleTemplate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApprovalRule == false)
            return false;
        ApprovalRule other = (ApprovalRule) obj;
        if (other.getApprovalRuleId() == null ^ this.getApprovalRuleId() == null)
            return false;
        if (other.getApprovalRuleId() != null && other.getApprovalRuleId().equals(this.getApprovalRuleId()) == false)
            return false;
        if (other.getApprovalRuleName() == null ^ this.getApprovalRuleName() == null)
            return false;
        if (other.getApprovalRuleName() != null && other.getApprovalRuleName().equals(this.getApprovalRuleName()) == false)
            return false;
        if (other.getApprovalRuleContent() == null ^ this.getApprovalRuleContent() == null)
            return false;
        if (other.getApprovalRuleContent() != null && other.getApprovalRuleContent().equals(this.getApprovalRuleContent()) == false)
            return false;
        if (other.getRuleContentSha256() == null ^ this.getRuleContentSha256() == null)
            return false;
        if (other.getRuleContentSha256() != null && other.getRuleContentSha256().equals(this.getRuleContentSha256()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getLastModifiedUser() == null ^ this.getLastModifiedUser() == null)
            return false;
        if (other.getLastModifiedUser() != null && other.getLastModifiedUser().equals(this.getLastModifiedUser()) == false)
            return false;
        if (other.getOriginApprovalRuleTemplate() == null ^ this.getOriginApprovalRuleTemplate() == null)
            return false;
        if (other.getOriginApprovalRuleTemplate() != null && other.getOriginApprovalRuleTemplate().equals(this.getOriginApprovalRuleTemplate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApprovalRuleId() == null) ? 0 : getApprovalRuleId().hashCode());
        hashCode = prime * hashCode + ((getApprovalRuleName() == null) ? 0 : getApprovalRuleName().hashCode());
        hashCode = prime * hashCode + ((getApprovalRuleContent() == null) ? 0 : getApprovalRuleContent().hashCode());
        hashCode = prime * hashCode + ((getRuleContentSha256() == null) ? 0 : getRuleContentSha256().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedUser() == null) ? 0 : getLastModifiedUser().hashCode());
        hashCode = prime * hashCode + ((getOriginApprovalRuleTemplate() == null) ? 0 : getOriginApprovalRuleTemplate().hashCode());
        return hashCode;
    }

    @Override
    public ApprovalRule clone() {
        try {
            return (ApprovalRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codecommit.model.transform.ApprovalRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
