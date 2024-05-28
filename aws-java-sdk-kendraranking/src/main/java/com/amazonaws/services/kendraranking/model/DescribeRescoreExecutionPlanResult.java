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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-ranking-2022-10-19/DescribeRescoreExecutionPlan"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRescoreExecutionPlanResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the rescore execution plan.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rescore execution plan.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name for the rescore execution plan.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description for the rescore execution plan.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The capacity units set for the rescore execution plan. A capacity of zero indicates that the rescore execution
     * plan is using the default capacity. For more information on the default capacity and additional capacity units,
     * see <a href="https://docs.aws.amazon.com/kendra/latest/dg/adjusting-capacity.html">Adjusting capacity</a>.
     * </p>
     */
    private CapacityUnitsConfiguration capacityUnits;
    /**
     * <p>
     * The Unix timestamp of when the rescore execution plan was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The Unix timestamp of when the rescore execution plan was last updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The current status of the rescore execution plan. When the value is <code>ACTIVE</code>, the rescore execution
     * plan is ready for use. If the <code>Status</code> field value is <code>FAILED</code>, the
     * <code>ErrorMessage</code> field contains a message that explains why.
     * </p>
     */
    private String status;
    /**
     * <p>
     * When the <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field contains a
     * message that explains why.
     * </p>
     */
    private String errorMessage;

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

    public DescribeRescoreExecutionPlanResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rescore execution plan.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the rescore execution plan.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rescore execution plan.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the rescore execution plan.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rescore execution plan.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the rescore execution plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRescoreExecutionPlanResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name for the rescore execution plan.
     * </p>
     * 
     * @param name
     *        The name for the rescore execution plan.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the rescore execution plan.
     * </p>
     * 
     * @return The name for the rescore execution plan.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for the rescore execution plan.
     * </p>
     * 
     * @param name
     *        The name for the rescore execution plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRescoreExecutionPlanResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description for the rescore execution plan.
     * </p>
     * 
     * @param description
     *        The description for the rescore execution plan.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the rescore execution plan.
     * </p>
     * 
     * @return The description for the rescore execution plan.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description for the rescore execution plan.
     * </p>
     * 
     * @param description
     *        The description for the rescore execution plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRescoreExecutionPlanResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The capacity units set for the rescore execution plan. A capacity of zero indicates that the rescore execution
     * plan is using the default capacity. For more information on the default capacity and additional capacity units,
     * see <a href="https://docs.aws.amazon.com/kendra/latest/dg/adjusting-capacity.html">Adjusting capacity</a>.
     * </p>
     * 
     * @param capacityUnits
     *        The capacity units set for the rescore execution plan. A capacity of zero indicates that the rescore
     *        execution plan is using the default capacity. For more information on the default capacity and additional
     *        capacity units, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/adjusting-capacity.html">Adjusting capacity</a>.
     */

    public void setCapacityUnits(CapacityUnitsConfiguration capacityUnits) {
        this.capacityUnits = capacityUnits;
    }

    /**
     * <p>
     * The capacity units set for the rescore execution plan. A capacity of zero indicates that the rescore execution
     * plan is using the default capacity. For more information on the default capacity and additional capacity units,
     * see <a href="https://docs.aws.amazon.com/kendra/latest/dg/adjusting-capacity.html">Adjusting capacity</a>.
     * </p>
     * 
     * @return The capacity units set for the rescore execution plan. A capacity of zero indicates that the rescore
     *         execution plan is using the default capacity. For more information on the default capacity and additional
     *         capacity units, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/adjusting-capacity.html">Adjusting capacity</a>.
     */

    public CapacityUnitsConfiguration getCapacityUnits() {
        return this.capacityUnits;
    }

    /**
     * <p>
     * The capacity units set for the rescore execution plan. A capacity of zero indicates that the rescore execution
     * plan is using the default capacity. For more information on the default capacity and additional capacity units,
     * see <a href="https://docs.aws.amazon.com/kendra/latest/dg/adjusting-capacity.html">Adjusting capacity</a>.
     * </p>
     * 
     * @param capacityUnits
     *        The capacity units set for the rescore execution plan. A capacity of zero indicates that the rescore
     *        execution plan is using the default capacity. For more information on the default capacity and additional
     *        capacity units, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/adjusting-capacity.html">Adjusting capacity</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRescoreExecutionPlanResult withCapacityUnits(CapacityUnitsConfiguration capacityUnits) {
        setCapacityUnits(capacityUnits);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp of when the rescore execution plan was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix timestamp of when the rescore execution plan was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The Unix timestamp of when the rescore execution plan was created.
     * </p>
     * 
     * @return The Unix timestamp of when the rescore execution plan was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The Unix timestamp of when the rescore execution plan was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix timestamp of when the rescore execution plan was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRescoreExecutionPlanResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp of when the rescore execution plan was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The Unix timestamp of when the rescore execution plan was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The Unix timestamp of when the rescore execution plan was last updated.
     * </p>
     * 
     * @return The Unix timestamp of when the rescore execution plan was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The Unix timestamp of when the rescore execution plan was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The Unix timestamp of when the rescore execution plan was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRescoreExecutionPlanResult withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The current status of the rescore execution plan. When the value is <code>ACTIVE</code>, the rescore execution
     * plan is ready for use. If the <code>Status</code> field value is <code>FAILED</code>, the
     * <code>ErrorMessage</code> field contains a message that explains why.
     * </p>
     * 
     * @param status
     *        The current status of the rescore execution plan. When the value is <code>ACTIVE</code>, the rescore
     *        execution plan is ready for use. If the <code>Status</code> field value is <code>FAILED</code>, the
     *        <code>ErrorMessage</code> field contains a message that explains why.
     * @see RescoreExecutionPlanStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the rescore execution plan. When the value is <code>ACTIVE</code>, the rescore execution
     * plan is ready for use. If the <code>Status</code> field value is <code>FAILED</code>, the
     * <code>ErrorMessage</code> field contains a message that explains why.
     * </p>
     * 
     * @return The current status of the rescore execution plan. When the value is <code>ACTIVE</code>, the rescore
     *         execution plan is ready for use. If the <code>Status</code> field value is <code>FAILED</code>, the
     *         <code>ErrorMessage</code> field contains a message that explains why.
     * @see RescoreExecutionPlanStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the rescore execution plan. When the value is <code>ACTIVE</code>, the rescore execution
     * plan is ready for use. If the <code>Status</code> field value is <code>FAILED</code>, the
     * <code>ErrorMessage</code> field contains a message that explains why.
     * </p>
     * 
     * @param status
     *        The current status of the rescore execution plan. When the value is <code>ACTIVE</code>, the rescore
     *        execution plan is ready for use. If the <code>Status</code> field value is <code>FAILED</code>, the
     *        <code>ErrorMessage</code> field contains a message that explains why.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RescoreExecutionPlanStatus
     */

    public DescribeRescoreExecutionPlanResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the rescore execution plan. When the value is <code>ACTIVE</code>, the rescore execution
     * plan is ready for use. If the <code>Status</code> field value is <code>FAILED</code>, the
     * <code>ErrorMessage</code> field contains a message that explains why.
     * </p>
     * 
     * @param status
     *        The current status of the rescore execution plan. When the value is <code>ACTIVE</code>, the rescore
     *        execution plan is ready for use. If the <code>Status</code> field value is <code>FAILED</code>, the
     *        <code>ErrorMessage</code> field contains a message that explains why.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RescoreExecutionPlanStatus
     */

    public DescribeRescoreExecutionPlanResult withStatus(RescoreExecutionPlanStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * When the <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field contains a
     * message that explains why.
     * </p>
     * 
     * @param errorMessage
     *        When the <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field
     *        contains a message that explains why.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * When the <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field contains a
     * message that explains why.
     * </p>
     * 
     * @return When the <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field
     *         contains a message that explains why.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * When the <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field contains a
     * message that explains why.
     * </p>
     * 
     * @param errorMessage
     *        When the <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field
     *        contains a message that explains why.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRescoreExecutionPlanResult withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCapacityUnits() != null)
            sb.append("CapacityUnits: ").append(getCapacityUnits()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeRescoreExecutionPlanResult == false)
            return false;
        DescribeRescoreExecutionPlanResult other = (DescribeRescoreExecutionPlanResult) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCapacityUnits() == null ^ this.getCapacityUnits() == null)
            return false;
        if (other.getCapacityUnits() != null && other.getCapacityUnits().equals(this.getCapacityUnits()) == false)
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
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCapacityUnits() == null) ? 0 : getCapacityUnits().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public DescribeRescoreExecutionPlanResult clone() {
        try {
            return (DescribeRescoreExecutionPlanResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
