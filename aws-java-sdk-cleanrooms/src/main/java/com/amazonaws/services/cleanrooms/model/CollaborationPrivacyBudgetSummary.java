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
 * A summary of the collaboration privacy budgets. This summary includes the collaboration information, creation
 * information, epsilon provided, and utility in terms of aggregations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/CollaborationPrivacyBudgetSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CollaborationPrivacyBudgetSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the collaboration privacy budget.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The unique identifier of the collaboration privacy budget template.
     * </p>
     */
    private String privacyBudgetTemplateId;
    /**
     * <p>
     * The ARN of the collaboration privacy budget template.
     * </p>
     */
    private String privacyBudgetTemplateArn;
    /**
     * <p>
     * The unique identifier of the collaboration that includes this privacy budget.
     * </p>
     */
    private String collaborationId;
    /**
     * <p>
     * The ARN of the collaboration that includes this privacy budget.
     * </p>
     */
    private String collaborationArn;
    /**
     * <p>
     * The unique identifier of the account that created this privacy budget.
     * </p>
     */
    private String creatorAccountId;
    /**
     * <p>
     * The type of privacy budget template.
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
     * The includes epsilon provided and utility in terms of aggregations.
     * </p>
     */
    private PrivacyBudget budget;

    /**
     * <p>
     * The unique identifier of the collaboration privacy budget.
     * </p>
     * 
     * @param id
     *        The unique identifier of the collaboration privacy budget.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier of the collaboration privacy budget.
     * </p>
     * 
     * @return The unique identifier of the collaboration privacy budget.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier of the collaboration privacy budget.
     * </p>
     * 
     * @param id
     *        The unique identifier of the collaboration privacy budget.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollaborationPrivacyBudgetSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the collaboration privacy budget template.
     * </p>
     * 
     * @param privacyBudgetTemplateId
     *        The unique identifier of the collaboration privacy budget template.
     */

    public void setPrivacyBudgetTemplateId(String privacyBudgetTemplateId) {
        this.privacyBudgetTemplateId = privacyBudgetTemplateId;
    }

    /**
     * <p>
     * The unique identifier of the collaboration privacy budget template.
     * </p>
     * 
     * @return The unique identifier of the collaboration privacy budget template.
     */

    public String getPrivacyBudgetTemplateId() {
        return this.privacyBudgetTemplateId;
    }

    /**
     * <p>
     * The unique identifier of the collaboration privacy budget template.
     * </p>
     * 
     * @param privacyBudgetTemplateId
     *        The unique identifier of the collaboration privacy budget template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollaborationPrivacyBudgetSummary withPrivacyBudgetTemplateId(String privacyBudgetTemplateId) {
        setPrivacyBudgetTemplateId(privacyBudgetTemplateId);
        return this;
    }

    /**
     * <p>
     * The ARN of the collaboration privacy budget template.
     * </p>
     * 
     * @param privacyBudgetTemplateArn
     *        The ARN of the collaboration privacy budget template.
     */

    public void setPrivacyBudgetTemplateArn(String privacyBudgetTemplateArn) {
        this.privacyBudgetTemplateArn = privacyBudgetTemplateArn;
    }

    /**
     * <p>
     * The ARN of the collaboration privacy budget template.
     * </p>
     * 
     * @return The ARN of the collaboration privacy budget template.
     */

    public String getPrivacyBudgetTemplateArn() {
        return this.privacyBudgetTemplateArn;
    }

    /**
     * <p>
     * The ARN of the collaboration privacy budget template.
     * </p>
     * 
     * @param privacyBudgetTemplateArn
     *        The ARN of the collaboration privacy budget template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollaborationPrivacyBudgetSummary withPrivacyBudgetTemplateArn(String privacyBudgetTemplateArn) {
        setPrivacyBudgetTemplateArn(privacyBudgetTemplateArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the collaboration that includes this privacy budget.
     * </p>
     * 
     * @param collaborationId
     *        The unique identifier of the collaboration that includes this privacy budget.
     */

    public void setCollaborationId(String collaborationId) {
        this.collaborationId = collaborationId;
    }

    /**
     * <p>
     * The unique identifier of the collaboration that includes this privacy budget.
     * </p>
     * 
     * @return The unique identifier of the collaboration that includes this privacy budget.
     */

    public String getCollaborationId() {
        return this.collaborationId;
    }

    /**
     * <p>
     * The unique identifier of the collaboration that includes this privacy budget.
     * </p>
     * 
     * @param collaborationId
     *        The unique identifier of the collaboration that includes this privacy budget.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollaborationPrivacyBudgetSummary withCollaborationId(String collaborationId) {
        setCollaborationId(collaborationId);
        return this;
    }

    /**
     * <p>
     * The ARN of the collaboration that includes this privacy budget.
     * </p>
     * 
     * @param collaborationArn
     *        The ARN of the collaboration that includes this privacy budget.
     */

    public void setCollaborationArn(String collaborationArn) {
        this.collaborationArn = collaborationArn;
    }

    /**
     * <p>
     * The ARN of the collaboration that includes this privacy budget.
     * </p>
     * 
     * @return The ARN of the collaboration that includes this privacy budget.
     */

    public String getCollaborationArn() {
        return this.collaborationArn;
    }

    /**
     * <p>
     * The ARN of the collaboration that includes this privacy budget.
     * </p>
     * 
     * @param collaborationArn
     *        The ARN of the collaboration that includes this privacy budget.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollaborationPrivacyBudgetSummary withCollaborationArn(String collaborationArn) {
        setCollaborationArn(collaborationArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the account that created this privacy budget.
     * </p>
     * 
     * @param creatorAccountId
     *        The unique identifier of the account that created this privacy budget.
     */

    public void setCreatorAccountId(String creatorAccountId) {
        this.creatorAccountId = creatorAccountId;
    }

    /**
     * <p>
     * The unique identifier of the account that created this privacy budget.
     * </p>
     * 
     * @return The unique identifier of the account that created this privacy budget.
     */

    public String getCreatorAccountId() {
        return this.creatorAccountId;
    }

    /**
     * <p>
     * The unique identifier of the account that created this privacy budget.
     * </p>
     * 
     * @param creatorAccountId
     *        The unique identifier of the account that created this privacy budget.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollaborationPrivacyBudgetSummary withCreatorAccountId(String creatorAccountId) {
        setCreatorAccountId(creatorAccountId);
        return this;
    }

    /**
     * <p>
     * The type of privacy budget template.
     * </p>
     * 
     * @param type
     *        The type of privacy budget template.
     * @see PrivacyBudgetType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of privacy budget template.
     * </p>
     * 
     * @return The type of privacy budget template.
     * @see PrivacyBudgetType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of privacy budget template.
     * </p>
     * 
     * @param type
     *        The type of privacy budget template.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrivacyBudgetType
     */

    public CollaborationPrivacyBudgetSummary withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of privacy budget template.
     * </p>
     * 
     * @param type
     *        The type of privacy budget template.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrivacyBudgetType
     */

    public CollaborationPrivacyBudgetSummary withType(PrivacyBudgetType type) {
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

    public CollaborationPrivacyBudgetSummary withCreateTime(java.util.Date createTime) {
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

    public CollaborationPrivacyBudgetSummary withUpdateTime(java.util.Date updateTime) {
        setUpdateTime(updateTime);
        return this;
    }

    /**
     * <p>
     * The includes epsilon provided and utility in terms of aggregations.
     * </p>
     * 
     * @param budget
     *        The includes epsilon provided and utility in terms of aggregations.
     */

    public void setBudget(PrivacyBudget budget) {
        this.budget = budget;
    }

    /**
     * <p>
     * The includes epsilon provided and utility in terms of aggregations.
     * </p>
     * 
     * @return The includes epsilon provided and utility in terms of aggregations.
     */

    public PrivacyBudget getBudget() {
        return this.budget;
    }

    /**
     * <p>
     * The includes epsilon provided and utility in terms of aggregations.
     * </p>
     * 
     * @param budget
     *        The includes epsilon provided and utility in terms of aggregations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollaborationPrivacyBudgetSummary withBudget(PrivacyBudget budget) {
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
        if (getCollaborationId() != null)
            sb.append("CollaborationId: ").append(getCollaborationId()).append(",");
        if (getCollaborationArn() != null)
            sb.append("CollaborationArn: ").append(getCollaborationArn()).append(",");
        if (getCreatorAccountId() != null)
            sb.append("CreatorAccountId: ").append(getCreatorAccountId()).append(",");
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

        if (obj instanceof CollaborationPrivacyBudgetSummary == false)
            return false;
        CollaborationPrivacyBudgetSummary other = (CollaborationPrivacyBudgetSummary) obj;
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
        if (other.getCollaborationId() == null ^ this.getCollaborationId() == null)
            return false;
        if (other.getCollaborationId() != null && other.getCollaborationId().equals(this.getCollaborationId()) == false)
            return false;
        if (other.getCollaborationArn() == null ^ this.getCollaborationArn() == null)
            return false;
        if (other.getCollaborationArn() != null && other.getCollaborationArn().equals(this.getCollaborationArn()) == false)
            return false;
        if (other.getCreatorAccountId() == null ^ this.getCreatorAccountId() == null)
            return false;
        if (other.getCreatorAccountId() != null && other.getCreatorAccountId().equals(this.getCreatorAccountId()) == false)
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
        hashCode = prime * hashCode + ((getCollaborationId() == null) ? 0 : getCollaborationId().hashCode());
        hashCode = prime * hashCode + ((getCollaborationArn() == null) ? 0 : getCollaborationArn().hashCode());
        hashCode = prime * hashCode + ((getCreatorAccountId() == null) ? 0 : getCreatorAccountId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getBudget() == null) ? 0 : getBudget().hashCode());
        return hashCode;
    }

    @Override
    public CollaborationPrivacyBudgetSummary clone() {
        try {
            return (CollaborationPrivacyBudgetSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.CollaborationPrivacyBudgetSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
