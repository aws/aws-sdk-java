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
 * Returns information about an approval rule template.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/ApprovalRuleTemplate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApprovalRuleTemplate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The system-generated ID of the approval rule template.
     * </p>
     */
    private String approvalRuleTemplateId;
    /**
     * <p>
     * The name of the approval rule template.
     * </p>
     */
    private String approvalRuleTemplateName;
    /**
     * <p>
     * The description of the approval rule template.
     * </p>
     */
    private String approvalRuleTemplateDescription;
    /**
     * <p>
     * The content of the approval rule template.
     * </p>
     */
    private String approvalRuleTemplateContent;
    /**
     * <p>
     * The SHA-256 hash signature for the content of the approval rule template.
     * </p>
     */
    private String ruleContentSha256;
    /**
     * <p>
     * The date the approval rule template was most recently changed, in timestamp format.
     * </p>
     */
    private java.util.Date lastModifiedDate;
    /**
     * <p>
     * The date the approval rule template was created, in timestamp format.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who made the most recent changes to the approval rule template.
     * </p>
     */
    private String lastModifiedUser;

    /**
     * <p>
     * The system-generated ID of the approval rule template.
     * </p>
     * 
     * @param approvalRuleTemplateId
     *        The system-generated ID of the approval rule template.
     */

    public void setApprovalRuleTemplateId(String approvalRuleTemplateId) {
        this.approvalRuleTemplateId = approvalRuleTemplateId;
    }

    /**
     * <p>
     * The system-generated ID of the approval rule template.
     * </p>
     * 
     * @return The system-generated ID of the approval rule template.
     */

    public String getApprovalRuleTemplateId() {
        return this.approvalRuleTemplateId;
    }

    /**
     * <p>
     * The system-generated ID of the approval rule template.
     * </p>
     * 
     * @param approvalRuleTemplateId
     *        The system-generated ID of the approval rule template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApprovalRuleTemplate withApprovalRuleTemplateId(String approvalRuleTemplateId) {
        setApprovalRuleTemplateId(approvalRuleTemplateId);
        return this;
    }

    /**
     * <p>
     * The name of the approval rule template.
     * </p>
     * 
     * @param approvalRuleTemplateName
     *        The name of the approval rule template.
     */

    public void setApprovalRuleTemplateName(String approvalRuleTemplateName) {
        this.approvalRuleTemplateName = approvalRuleTemplateName;
    }

    /**
     * <p>
     * The name of the approval rule template.
     * </p>
     * 
     * @return The name of the approval rule template.
     */

    public String getApprovalRuleTemplateName() {
        return this.approvalRuleTemplateName;
    }

    /**
     * <p>
     * The name of the approval rule template.
     * </p>
     * 
     * @param approvalRuleTemplateName
     *        The name of the approval rule template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApprovalRuleTemplate withApprovalRuleTemplateName(String approvalRuleTemplateName) {
        setApprovalRuleTemplateName(approvalRuleTemplateName);
        return this;
    }

    /**
     * <p>
     * The description of the approval rule template.
     * </p>
     * 
     * @param approvalRuleTemplateDescription
     *        The description of the approval rule template.
     */

    public void setApprovalRuleTemplateDescription(String approvalRuleTemplateDescription) {
        this.approvalRuleTemplateDescription = approvalRuleTemplateDescription;
    }

    /**
     * <p>
     * The description of the approval rule template.
     * </p>
     * 
     * @return The description of the approval rule template.
     */

    public String getApprovalRuleTemplateDescription() {
        return this.approvalRuleTemplateDescription;
    }

    /**
     * <p>
     * The description of the approval rule template.
     * </p>
     * 
     * @param approvalRuleTemplateDescription
     *        The description of the approval rule template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApprovalRuleTemplate withApprovalRuleTemplateDescription(String approvalRuleTemplateDescription) {
        setApprovalRuleTemplateDescription(approvalRuleTemplateDescription);
        return this;
    }

    /**
     * <p>
     * The content of the approval rule template.
     * </p>
     * 
     * @param approvalRuleTemplateContent
     *        The content of the approval rule template.
     */

    public void setApprovalRuleTemplateContent(String approvalRuleTemplateContent) {
        this.approvalRuleTemplateContent = approvalRuleTemplateContent;
    }

    /**
     * <p>
     * The content of the approval rule template.
     * </p>
     * 
     * @return The content of the approval rule template.
     */

    public String getApprovalRuleTemplateContent() {
        return this.approvalRuleTemplateContent;
    }

    /**
     * <p>
     * The content of the approval rule template.
     * </p>
     * 
     * @param approvalRuleTemplateContent
     *        The content of the approval rule template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApprovalRuleTemplate withApprovalRuleTemplateContent(String approvalRuleTemplateContent) {
        setApprovalRuleTemplateContent(approvalRuleTemplateContent);
        return this;
    }

    /**
     * <p>
     * The SHA-256 hash signature for the content of the approval rule template.
     * </p>
     * 
     * @param ruleContentSha256
     *        The SHA-256 hash signature for the content of the approval rule template.
     */

    public void setRuleContentSha256(String ruleContentSha256) {
        this.ruleContentSha256 = ruleContentSha256;
    }

    /**
     * <p>
     * The SHA-256 hash signature for the content of the approval rule template.
     * </p>
     * 
     * @return The SHA-256 hash signature for the content of the approval rule template.
     */

    public String getRuleContentSha256() {
        return this.ruleContentSha256;
    }

    /**
     * <p>
     * The SHA-256 hash signature for the content of the approval rule template.
     * </p>
     * 
     * @param ruleContentSha256
     *        The SHA-256 hash signature for the content of the approval rule template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApprovalRuleTemplate withRuleContentSha256(String ruleContentSha256) {
        setRuleContentSha256(ruleContentSha256);
        return this;
    }

    /**
     * <p>
     * The date the approval rule template was most recently changed, in timestamp format.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date the approval rule template was most recently changed, in timestamp format.
     */

    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date the approval rule template was most recently changed, in timestamp format.
     * </p>
     * 
     * @return The date the approval rule template was most recently changed, in timestamp format.
     */

    public java.util.Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The date the approval rule template was most recently changed, in timestamp format.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date the approval rule template was most recently changed, in timestamp format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApprovalRuleTemplate withLastModifiedDate(java.util.Date lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * <p>
     * The date the approval rule template was created, in timestamp format.
     * </p>
     * 
     * @param creationDate
     *        The date the approval rule template was created, in timestamp format.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date the approval rule template was created, in timestamp format.
     * </p>
     * 
     * @return The date the approval rule template was created, in timestamp format.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date the approval rule template was created, in timestamp format.
     * </p>
     * 
     * @param creationDate
     *        The date the approval rule template was created, in timestamp format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApprovalRuleTemplate withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who made the most recent changes to the approval rule template.
     * </p>
     * 
     * @param lastModifiedUser
     *        The Amazon Resource Name (ARN) of the user who made the most recent changes to the approval rule template.
     */

    public void setLastModifiedUser(String lastModifiedUser) {
        this.lastModifiedUser = lastModifiedUser;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who made the most recent changes to the approval rule template.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the user who made the most recent changes to the approval rule
     *         template.
     */

    public String getLastModifiedUser() {
        return this.lastModifiedUser;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who made the most recent changes to the approval rule template.
     * </p>
     * 
     * @param lastModifiedUser
     *        The Amazon Resource Name (ARN) of the user who made the most recent changes to the approval rule template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApprovalRuleTemplate withLastModifiedUser(String lastModifiedUser) {
        setLastModifiedUser(lastModifiedUser);
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
        if (getApprovalRuleTemplateId() != null)
            sb.append("ApprovalRuleTemplateId: ").append(getApprovalRuleTemplateId()).append(",");
        if (getApprovalRuleTemplateName() != null)
            sb.append("ApprovalRuleTemplateName: ").append(getApprovalRuleTemplateName()).append(",");
        if (getApprovalRuleTemplateDescription() != null)
            sb.append("ApprovalRuleTemplateDescription: ").append(getApprovalRuleTemplateDescription()).append(",");
        if (getApprovalRuleTemplateContent() != null)
            sb.append("ApprovalRuleTemplateContent: ").append(getApprovalRuleTemplateContent()).append(",");
        if (getRuleContentSha256() != null)
            sb.append("RuleContentSha256: ").append(getRuleContentSha256()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getLastModifiedUser() != null)
            sb.append("LastModifiedUser: ").append(getLastModifiedUser());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApprovalRuleTemplate == false)
            return false;
        ApprovalRuleTemplate other = (ApprovalRuleTemplate) obj;
        if (other.getApprovalRuleTemplateId() == null ^ this.getApprovalRuleTemplateId() == null)
            return false;
        if (other.getApprovalRuleTemplateId() != null && other.getApprovalRuleTemplateId().equals(this.getApprovalRuleTemplateId()) == false)
            return false;
        if (other.getApprovalRuleTemplateName() == null ^ this.getApprovalRuleTemplateName() == null)
            return false;
        if (other.getApprovalRuleTemplateName() != null && other.getApprovalRuleTemplateName().equals(this.getApprovalRuleTemplateName()) == false)
            return false;
        if (other.getApprovalRuleTemplateDescription() == null ^ this.getApprovalRuleTemplateDescription() == null)
            return false;
        if (other.getApprovalRuleTemplateDescription() != null
                && other.getApprovalRuleTemplateDescription().equals(this.getApprovalRuleTemplateDescription()) == false)
            return false;
        if (other.getApprovalRuleTemplateContent() == null ^ this.getApprovalRuleTemplateContent() == null)
            return false;
        if (other.getApprovalRuleTemplateContent() != null && other.getApprovalRuleTemplateContent().equals(this.getApprovalRuleTemplateContent()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApprovalRuleTemplateId() == null) ? 0 : getApprovalRuleTemplateId().hashCode());
        hashCode = prime * hashCode + ((getApprovalRuleTemplateName() == null) ? 0 : getApprovalRuleTemplateName().hashCode());
        hashCode = prime * hashCode + ((getApprovalRuleTemplateDescription() == null) ? 0 : getApprovalRuleTemplateDescription().hashCode());
        hashCode = prime * hashCode + ((getApprovalRuleTemplateContent() == null) ? 0 : getApprovalRuleTemplateContent().hashCode());
        hashCode = prime * hashCode + ((getRuleContentSha256() == null) ? 0 : getRuleContentSha256().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedUser() == null) ? 0 : getLastModifiedUser().hashCode());
        return hashCode;
    }

    @Override
    public ApprovalRuleTemplate clone() {
        try {
            return (ApprovalRuleTemplate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codecommit.model.transform.ApprovalRuleTemplateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
