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
package com.amazonaws.services.kendraranking.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary information for a rescore execution plan. A rescore execution plan is an Amazon Kendra Intelligent Ranking
 * resource used for provisioning the <code>Rescore</code> API.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-ranking-2022-10-19/RescoreExecutionPlanSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RescoreExecutionPlanSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the rescore execution plan.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The identifier of the rescore execution plan.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Unix timestamp when the rescore execution plan was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The Unix timestamp when the rescore execution plan was last updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The current status of the rescore execution plan. When the value is <code>ACTIVE</code>, the rescore execution
     * plan is ready for use.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The name of the rescore execution plan.
     * </p>
     * 
     * @param name
     *        The name of the rescore execution plan.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the rescore execution plan.
     * </p>
     * 
     * @return The name of the rescore execution plan.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the rescore execution plan.
     * </p>
     * 
     * @param name
     *        The name of the rescore execution plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RescoreExecutionPlanSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The identifier of the rescore execution plan.
     * </p>
     * 
     * @param id
     *        The identifier of the rescore execution plan.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the rescore execution plan.
     * </p>
     * 
     * @return The identifier of the rescore execution plan.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the rescore execution plan.
     * </p>
     * 
     * @param id
     *        The identifier of the rescore execution plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RescoreExecutionPlanSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp when the rescore execution plan was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix timestamp when the rescore execution plan was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The Unix timestamp when the rescore execution plan was created.
     * </p>
     * 
     * @return The Unix timestamp when the rescore execution plan was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The Unix timestamp when the rescore execution plan was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix timestamp when the rescore execution plan was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RescoreExecutionPlanSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp when the rescore execution plan was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The Unix timestamp when the rescore execution plan was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The Unix timestamp when the rescore execution plan was last updated.
     * </p>
     * 
     * @return The Unix timestamp when the rescore execution plan was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The Unix timestamp when the rescore execution plan was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The Unix timestamp when the rescore execution plan was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RescoreExecutionPlanSummary withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The current status of the rescore execution plan. When the value is <code>ACTIVE</code>, the rescore execution
     * plan is ready for use.
     * </p>
     * 
     * @param status
     *        The current status of the rescore execution plan. When the value is <code>ACTIVE</code>, the rescore
     *        execution plan is ready for use.
     * @see RescoreExecutionPlanStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the rescore execution plan. When the value is <code>ACTIVE</code>, the rescore execution
     * plan is ready for use.
     * </p>
     * 
     * @return The current status of the rescore execution plan. When the value is <code>ACTIVE</code>, the rescore
     *         execution plan is ready for use.
     * @see RescoreExecutionPlanStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the rescore execution plan. When the value is <code>ACTIVE</code>, the rescore execution
     * plan is ready for use.
     * </p>
     * 
     * @param status
     *        The current status of the rescore execution plan. When the value is <code>ACTIVE</code>, the rescore
     *        execution plan is ready for use.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RescoreExecutionPlanStatus
     */

    public RescoreExecutionPlanSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the rescore execution plan. When the value is <code>ACTIVE</code>, the rescore execution
     * plan is ready for use.
     * </p>
     * 
     * @param status
     *        The current status of the rescore execution plan. When the value is <code>ACTIVE</code>, the rescore
     *        execution plan is ready for use.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RescoreExecutionPlanStatus
     */

    public RescoreExecutionPlanSummary withStatus(RescoreExecutionPlanStatus status) {
        this.status = status.toString();
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RescoreExecutionPlanSummary == false)
            return false;
        RescoreExecutionPlanSummary other = (RescoreExecutionPlanSummary) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public RescoreExecutionPlanSummary clone() {
        try {
            return (RescoreExecutionPlanSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendraranking.model.transform.RescoreExecutionPlanSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
