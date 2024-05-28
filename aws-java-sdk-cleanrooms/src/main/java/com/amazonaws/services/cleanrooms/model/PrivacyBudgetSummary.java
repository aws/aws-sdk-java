/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An array that summaries the specified privacy budget. This summary includes collaboration information, creation
 * information, membership information, and privacy budget information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/PrivacyBudgetSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PrivacyBudgetSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the privacy budget.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The unique identifier of the privacy budget template.
     * </p>
     */
    private String privacyBudgetTemplateId;
    /**
     * <p>
     * The ARN of the privacy budget template.
     * </p>
     */
    private String privacyBudgetTemplateArn;
    /**
     * <p>
     * The identifier for a membership resource.
     * </p>
     */
    private String membershipId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the member who created the privacy budget summary.
     * </p>
     */
    private String membershipArn;
    /**
     * <p>
     * The unique identifier of the collaboration that contains this privacy budget.
     * </p>
     */
    private String collaborationId;
    /**
     * <p>
     * The ARN of the collaboration that contains this privacy budget.
     * </p>
     */
    private String collaborationArn;
    /**
     * <p>
     * Specifies the type of the privacy budget.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The time at which the privacy budget was created.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * The most recent time at which the privacy budget was updated.
     * </p>
     */
    private java.util.Date updateTime;
    /**
     * <p>
     * The provided privacy budget.
     * </p>
     */
    private PrivacyBudget budget;

    /**
     * <p>
     * The unique identifier of the privacy budget.
     * </p>
     * 
     * @param id
     *        The unique identifier of the privacy budget.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier of the privacy budget.
     * </p>
     * 
     * @return The unique identifier of the privacy budget.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier of the privacy budget.
     * </p>
     * 
     * @param id
     *        The unique identifier of the privacy budget.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrivacyBudgetSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the privacy budget template.
     * </p>
     * 
     * @param privacyBudgetTemplateId
     *        The unique identifier of the privacy budget template.
     */

    public void setPrivacyBudgetTemplateId(String privacyBudgetTemplateId) {
        this.privacyBudgetTemplateId = privacyBudgetTemplateId;
    }

    /**
     * <p>
     * The unique identifier of the privacy budget template.
     * </p>
     * 
     * @return The unique identifier of the privacy budget template.
     */

    public String getPrivacyBudgetTemplateId() {
        return this.privacyBudgetTemplateId;
    }

    /**
     * <p>
     * The unique identifier of the privacy budget template.
     * </p>
     * 
     * @param privacyBudgetTemplateId
     *        The unique identifier of the privacy budget template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrivacyBudgetSummary withPrivacyBudgetTemplateId(String privacyBudgetTemplateId) {
        setPrivacyBudgetTemplateId(privacyBudgetTemplateId);
        return this;
    }

    /**
     * <p>
     * The ARN of the privacy budget template.
     * </p>
     * 
     * @param privacyBudgetTemplateArn
     *        The ARN of the privacy budget template.
     */

    public void setPrivacyBudgetTemplateArn(String privacyBudgetTemplateArn) {
        this.privacyBudgetTemplateArn = privacyBudgetTemplateArn;
    }

    /**
     * <p>
     * The ARN of the privacy budget template.
     * </p>
     * 
     * @return The ARN of the privacy budget template.
     */

    public String getPrivacyBudgetTemplateArn() {
        return this.privacyBudgetTemplateArn;
    }

    /**
     * <p>
     * The ARN of the privacy budget template.
     * </p>
     * 
     * @param privacyBudgetTemplateArn
     *        The ARN of the privacy budget template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrivacyBudgetSummary withPrivacyBudgetTemplateArn(String privacyBudgetTemplateArn) {
        setPrivacyBudgetTemplateArn(privacyBudgetTemplateArn);
        return this;
    }

    /**
     * <p>
     * The identifier for a membership resource.
     * </p>
     * 
     * @param membershipId
     *        The identifier for a membership resource.
     */

    public void setMembershipId(String membershipId) {
        this.membershipId = membershipId;
    }

    /**
     * <p>
     * The identifier for a membership resource.
     * </p>
     * 
     * @return The identifier for a membership resource.
     */

    public String getMembershipId() {
        return this.membershipId;
    }

    /**
     * <p>
     * The identifier for a membership resource.
     * </p>
     * 
     * @param membershipId
     *        The identifier for a membership resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrivacyBudgetSummary withMembershipId(String membershipId) {
        setMembershipId(membershipId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the member who created the privacy budget summary.
     * </p>
     * 
     * @param membershipArn
     *        The Amazon Resource Name (ARN) of the member who created the privacy budget summary.
     */

    public void setMembershipArn(String membershipArn) {
        this.membershipArn = membershipArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the member who created the privacy budget summary.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the member who created the privacy budget summary.
     */

    public String getMembershipArn() {
        return this.membershipArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the member who created the privacy budget summary.
     * </p>
     * 
     * @param membershipArn
     *        The Amazon Resource Name (ARN) of the member who created the privacy budget summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrivacyBudgetSummary withMembershipArn(String membershipArn) {
        setMembershipArn(membershipArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the collaboration that contains this privacy budget.
     * </p>
     * 
     * @param collaborationId
     *        The unique identifier of the collaboration that contains this privacy budget.
     */

    public void setCollaborationId(String collaborationId) {
        this.collaborationId = collaborationId;
    }

    /**
     * <p>
     * The unique identifier of the collaboration that contains this privacy budget.
     * </p>
     * 
     * @return The unique identifier of the collaboration that contains this privacy budget.
     */

    public String getCollaborationId() {
        return this.collaborationId;
    }

    /**
     * <p>
     * The unique identifier of the collaboration that contains this privacy budget.
     * </p>
     * 
     * @param collaborationId
     *        The unique identifier of the collaboration that contains this privacy budget.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrivacyBudgetSummary withCollaborationId(String collaborationId) {
        setCollaborationId(collaborationId);
        return this;
    }

    /**
     * <p>
     * The ARN of the collaboration that contains this privacy budget.
     * </p>
     * 
     * @param collaborationArn
     *        The ARN of the collaboration that contains this privacy budget.
     */

    public void setCollaborationArn(String collaborationArn) {
        this.collaborationArn = collaborationArn;
    }

    /**
     * <p>
     * The ARN of the collaboration that contains this privacy budget.
     * </p>
     * 
     * @return The ARN of the collaboration that contains this privacy budget.
     */

    public String getCollaborationArn() {
        return this.collaborationArn;
    }

    /**
     * <p>
     * The ARN of the collaboration that contains this privacy budget.
     * </p>
     * 
     * @param collaborationArn
     *        The ARN of the collaboration that contains this privacy budget.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrivacyBudgetSummary withCollaborationArn(String collaborationArn) {
        setCollaborationArn(collaborationArn);
        return this;
    }

    /**
     * <p>
     * Specifies the type of the privacy budget.
     * </p>
     * 
     * @param type
     *        Specifies the type of the privacy budget.
     * @see PrivacyBudgetType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Specifies the type of the privacy budget.
     * </p>
     * 
     * @return Specifies the type of the privacy budget.
     * @see PrivacyBudgetType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Specifies the type of the privacy budget.
     * </p>
     * 
     * @param type
     *        Specifies the type of the privacy budget.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrivacyBudgetType
     */

    public PrivacyBudgetSummary withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Specifies the type of the privacy budget.
     * </p>
     * 
     * @param type
     *        Specifies the type of the privacy budget.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrivacyBudgetType
     */

    public PrivacyBudgetSummary withType(PrivacyBudgetType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The time at which the privacy budget was created.
     * </p>
     * 
     * @param createTime
     *        The time at which the privacy budget was created.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The time at which the privacy budget was created.
     * </p>
     * 
     * @return The time at which the privacy budget was created.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The time at which the privacy budget was created.
     * </p>
     * 
     * @param createTime
     *        The time at which the privacy budget was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrivacyBudgetSummary withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The most recent time at which the privacy budget was updated.
     * </p>
     * 
     * @param updateTime
     *        The most recent time at which the privacy budget was updated.
     */

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * The most recent time at which the privacy budget was updated.
     * </p>
     * 
     * @return The most recent time at which the privacy budget was updated.
     */

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * <p>
     * The most recent time at which the privacy budget was updated.
     * </p>
     * 
     * @param updateTime
     *        The most recent time at which the privacy budget was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrivacyBudgetSummary withUpdateTime(java.util.Date updateTime) {
        setUpdateTime(updateTime);
        return this;
    }

    /**
     * <p>
     * The provided privacy budget.
     * </p>
     * 
     * @param budget
     *        The provided privacy budget.
     */

    public void setBudget(PrivacyBudget budget) {
        this.budget = budget;
    }

    /**
     * <p>
     * The provided privacy budget.
     * </p>
     * 
     * @return The provided privacy budget.
     */

    public PrivacyBudget getBudget() {
        return this.budget;
    }

    /**
     * <p>
     * The provided privacy budget.
     * </p>
     * 
     * @param budget
     *        The provided privacy budget.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrivacyBudgetSummary withBudget(PrivacyBudget budget) {
        setBudget(budget);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getPrivacyBudgetTemplateId() != null)
            sb.append("PrivacyBudgetTemplateId: ").append(getPrivacyBudgetTemplateId()).append(",");
        if (getPrivacyBudgetTemplateArn() != null)
            sb.append("PrivacyBudgetTemplateArn: ").append(getPrivacyBudgetTemplateArn()).append(",");
        if (getMembershipId() != null)
            sb.append("MembershipId: ").append(getMembershipId()).append(",");
        if (getMembershipArn() != null)
            sb.append("MembershipArn: ").append(getMembershipArn()).append(",");
        if (getCollaborationId() != null)
            sb.append("CollaborationId: ").append(getCollaborationId()).append(",");
        if (getCollaborationArn() != null)
            sb.append("CollaborationArn: ").append(getCollaborationArn()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getUpdateTime() != null)
            sb.append("UpdateTime: ").append(getUpdateTime()).append(",");
        if (getBudget() != null)
            sb.append("Budget: ").append(getBudget());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PrivacyBudgetSummary == false)
            return false;
        PrivacyBudgetSummary other = (PrivacyBudgetSummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getPrivacyBudgetTemplateId() == null ^ this.getPrivacyBudgetTemplateId() == null)
            return false;
        if (other.getPrivacyBudgetTemplateId() != null && other.getPrivacyBudgetTemplateId().equals(this.getPrivacyBudgetTemplateId()) == false)
            return false;
        if (other.getPrivacyBudgetTemplateArn() == null ^ this.getPrivacyBudgetTemplateArn() == null)
            return false;
        if (other.getPrivacyBudgetTemplateArn() != null && other.getPrivacyBudgetTemplateArn().equals(this.getPrivacyBudgetTemplateArn()) == false)
            return false;
        if (other.getMembershipId() == null ^ this.getMembershipId() == null)
            return false;
        if (other.getMembershipId() != null && other.getMembershipId().equals(this.getMembershipId()) == false)
            return false;
        if (other.getMembershipArn() == null ^ this.getMembershipArn() == null)
            return false;
        if (other.getMembershipArn() != null && other.getMembershipArn().equals(this.getMembershipArn()) == false)
            return false;
        if (other.getCollaborationId() == null ^ this.getCollaborationId() == null)
            return false;
        if (other.getCollaborationId() != null && other.getCollaborationId().equals(this.getCollaborationId()) == false)
            return false;
        if (other.getCollaborationArn() == null ^ this.getCollaborationArn() == null)
            return false;
        if (other.getCollaborationArn() != null && other.getCollaborationArn().equals(this.getCollaborationArn()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null && other.getUpdateTime().equals(this.getUpdateTime()) == false)
            return false;
        if (other.getBudget() == null ^ this.getBudget() == null)
            return false;
        if (other.getBudget() != null && other.getBudget().equals(this.getBudget()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getPrivacyBudgetTemplateId() == null) ? 0 : getPrivacyBudgetTemplateId().hashCode());
        hashCode = prime * hashCode + ((getPrivacyBudgetTemplateArn() == null) ? 0 : getPrivacyBudgetTemplateArn().hashCode());
        hashCode = prime * hashCode + ((getMembershipId() == null) ? 0 : getMembershipId().hashCode());
        hashCode = prime * hashCode + ((getMembershipArn() == null) ? 0 : getMembershipArn().hashCode());
        hashCode = prime * hashCode + ((getCollaborationId() == null) ? 0 : getCollaborationId().hashCode());
        hashCode = prime * hashCode + ((getCollaborationArn() == null) ? 0 : getCollaborationArn().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getBudget() == null) ? 0 : getBudget().hashCode());
        return hashCode;
    }

    @Override
    public PrivacyBudgetSummary clone() {
        try {
            return (PrivacyBudgetSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.PrivacyBudgetSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
