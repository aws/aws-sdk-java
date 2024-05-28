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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the estimated cost or usage that a budget tracks.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/ResourceBudgetEstimate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceBudgetEstimate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The resource name.
     * </p>
     */
    private String resourceName;
    /**
     * <p>
     * The type of resource the budget will track.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The cost estimate for the specified budget.
     * </p>
     */
    private java.util.List<CostEstimate> costEstimates;
    /**
     * <p>
     * The estimate start time.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The estimate end time.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The resource name.
     * </p>
     * 
     * @param resourceName
     *        The resource name.
     */

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * The resource name.
     * </p>
     * 
     * @return The resource name.
     */

    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * <p>
     * The resource name.
     * </p>
     * 
     * @param resourceName
     *        The resource name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceBudgetEstimate withResourceName(String resourceName) {
        setResourceName(resourceName);
        return this;
    }

    /**
     * <p>
     * The type of resource the budget will track.
     * </p>
     * 
     * @param resourceType
     *        The type of resource the budget will track.
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource the budget will track.
     * </p>
     * 
     * @return The type of resource the budget will track.
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of resource the budget will track.
     * </p>
     * 
     * @param resourceType
     *        The type of resource the budget will track.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ResourceBudgetEstimate withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of resource the budget will track.
     * </p>
     * 
     * @param resourceType
     *        The type of resource the budget will track.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ResourceBudgetEstimate withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The cost estimate for the specified budget.
     * </p>
     * 
     * @return The cost estimate for the specified budget.
     */

    public java.util.List<CostEstimate> getCostEstimates() {
        return costEstimates;
    }

    /**
     * <p>
     * The cost estimate for the specified budget.
     * </p>
     * 
     * @param costEstimates
     *        The cost estimate for the specified budget.
     */

    public void setCostEstimates(java.util.Collection<CostEstimate> costEstimates) {
        if (costEstimates == null) {
            this.costEstimates = null;
            return;
        }

        this.costEstimates = new java.util.ArrayList<CostEstimate>(costEstimates);
    }

    /**
     * <p>
     * The cost estimate for the specified budget.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCostEstimates(java.util.Collection)} or {@link #withCostEstimates(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param costEstimates
     *        The cost estimate for the specified budget.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceBudgetEstimate withCostEstimates(CostEstimate... costEstimates) {
        if (this.costEstimates == null) {
            setCostEstimates(new java.util.ArrayList<CostEstimate>(costEstimates.length));
        }
        for (CostEstimate ele : costEstimates) {
            this.costEstimates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The cost estimate for the specified budget.
     * </p>
     * 
     * @param costEstimates
     *        The cost estimate for the specified budget.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceBudgetEstimate withCostEstimates(java.util.Collection<CostEstimate> costEstimates) {
        setCostEstimates(costEstimates);
        return this;
    }

    /**
     * <p>
     * The estimate start time.
     * </p>
     * 
     * @param startTime
     *        The estimate start time.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The estimate start time.
     * </p>
     * 
     * @return The estimate start time.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The estimate start time.
     * </p>
     * 
     * @param startTime
     *        The estimate start time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceBudgetEstimate withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The estimate end time.
     * </p>
     * 
     * @param endTime
     *        The estimate end time.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The estimate end time.
     * </p>
     * 
     * @return The estimate end time.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The estimate end time.
     * </p>
     * 
     * @param endTime
     *        The estimate end time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceBudgetEstimate withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
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
        if (getResourceName() != null)
            sb.append("ResourceName: ").append(getResourceName()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getCostEstimates() != null)
            sb.append("CostEstimates: ").append(getCostEstimates()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceBudgetEstimate == false)
            return false;
        ResourceBudgetEstimate other = (ResourceBudgetEstimate) obj;
        if (other.getResourceName() == null ^ this.getResourceName() == null)
            return false;
        if (other.getResourceName() != null && other.getResourceName().equals(this.getResourceName()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getCostEstimates() == null ^ this.getCostEstimates() == null)
            return false;
        if (other.getCostEstimates() != null && other.getCostEstimates().equals(this.getCostEstimates()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceName() == null) ? 0 : getResourceName().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getCostEstimates() == null) ? 0 : getCostEstimates().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        return hashCode;
    }

    @Override
    public ResourceBudgetEstimate clone() {
        try {
            return (ResourceBudgetEstimate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.ResourceBudgetEstimateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
