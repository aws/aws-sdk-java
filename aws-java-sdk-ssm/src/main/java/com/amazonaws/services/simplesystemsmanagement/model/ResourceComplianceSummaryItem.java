/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Compliance summary information for a specific resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ResourceComplianceSummaryItem" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceComplianceSummaryItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The compliance type.
     * </p>
     */
    private String complianceType;
    /**
     * <p>
     * The resource type.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The resource ID.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The compliance status for the resource.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The highest severity item found for the resource. The resource is compliant for this item.
     * </p>
     */
    private String overallSeverity;
    /**
     * <p>
     * Information about the execution.
     * </p>
     */
    private ComplianceExecutionSummary executionSummary;
    /**
     * <p>
     * A list of items that are compliant for the resource.
     * </p>
     */
    private CompliantSummary compliantSummary;
    /**
     * <p>
     * A list of items that aren't compliant for the resource.
     * </p>
     */
    private NonCompliantSummary nonCompliantSummary;

    /**
     * <p>
     * The compliance type.
     * </p>
     * 
     * @param complianceType
     *        The compliance type.
     */

    public void setComplianceType(String complianceType) {
        this.complianceType = complianceType;
    }

    /**
     * <p>
     * The compliance type.
     * </p>
     * 
     * @return The compliance type.
     */

    public String getComplianceType() {
        return this.complianceType;
    }

    /**
     * <p>
     * The compliance type.
     * </p>
     * 
     * @param complianceType
     *        The compliance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceComplianceSummaryItem withComplianceType(String complianceType) {
        setComplianceType(complianceType);
        return this;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @param resourceType
     *        The resource type.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @return The resource type.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @param resourceType
     *        The resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceComplianceSummaryItem withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The resource ID.
     * </p>
     * 
     * @param resourceId
     *        The resource ID.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The resource ID.
     * </p>
     * 
     * @return The resource ID.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The resource ID.
     * </p>
     * 
     * @param resourceId
     *        The resource ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceComplianceSummaryItem withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The compliance status for the resource.
     * </p>
     * 
     * @param status
     *        The compliance status for the resource.
     * @see ComplianceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The compliance status for the resource.
     * </p>
     * 
     * @return The compliance status for the resource.
     * @see ComplianceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The compliance status for the resource.
     * </p>
     * 
     * @param status
     *        The compliance status for the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComplianceStatus
     */

    public ResourceComplianceSummaryItem withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The compliance status for the resource.
     * </p>
     * 
     * @param status
     *        The compliance status for the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComplianceStatus
     */

    public ResourceComplianceSummaryItem withStatus(ComplianceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The highest severity item found for the resource. The resource is compliant for this item.
     * </p>
     * 
     * @param overallSeverity
     *        The highest severity item found for the resource. The resource is compliant for this item.
     * @see ComplianceSeverity
     */

    public void setOverallSeverity(String overallSeverity) {
        this.overallSeverity = overallSeverity;
    }

    /**
     * <p>
     * The highest severity item found for the resource. The resource is compliant for this item.
     * </p>
     * 
     * @return The highest severity item found for the resource. The resource is compliant for this item.
     * @see ComplianceSeverity
     */

    public String getOverallSeverity() {
        return this.overallSeverity;
    }

    /**
     * <p>
     * The highest severity item found for the resource. The resource is compliant for this item.
     * </p>
     * 
     * @param overallSeverity
     *        The highest severity item found for the resource. The resource is compliant for this item.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComplianceSeverity
     */

    public ResourceComplianceSummaryItem withOverallSeverity(String overallSeverity) {
        setOverallSeverity(overallSeverity);
        return this;
    }

    /**
     * <p>
     * The highest severity item found for the resource. The resource is compliant for this item.
     * </p>
     * 
     * @param overallSeverity
     *        The highest severity item found for the resource. The resource is compliant for this item.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComplianceSeverity
     */

    public ResourceComplianceSummaryItem withOverallSeverity(ComplianceSeverity overallSeverity) {
        this.overallSeverity = overallSeverity.toString();
        return this;
    }

    /**
     * <p>
     * Information about the execution.
     * </p>
     * 
     * @param executionSummary
     *        Information about the execution.
     */

    public void setExecutionSummary(ComplianceExecutionSummary executionSummary) {
        this.executionSummary = executionSummary;
    }

    /**
     * <p>
     * Information about the execution.
     * </p>
     * 
     * @return Information about the execution.
     */

    public ComplianceExecutionSummary getExecutionSummary() {
        return this.executionSummary;
    }

    /**
     * <p>
     * Information about the execution.
     * </p>
     * 
     * @param executionSummary
     *        Information about the execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceComplianceSummaryItem withExecutionSummary(ComplianceExecutionSummary executionSummary) {
        setExecutionSummary(executionSummary);
        return this;
    }

    /**
     * <p>
     * A list of items that are compliant for the resource.
     * </p>
     * 
     * @param compliantSummary
     *        A list of items that are compliant for the resource.
     */

    public void setCompliantSummary(CompliantSummary compliantSummary) {
        this.compliantSummary = compliantSummary;
    }

    /**
     * <p>
     * A list of items that are compliant for the resource.
     * </p>
     * 
     * @return A list of items that are compliant for the resource.
     */

    public CompliantSummary getCompliantSummary() {
        return this.compliantSummary;
    }

    /**
     * <p>
     * A list of items that are compliant for the resource.
     * </p>
     * 
     * @param compliantSummary
     *        A list of items that are compliant for the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceComplianceSummaryItem withCompliantSummary(CompliantSummary compliantSummary) {
        setCompliantSummary(compliantSummary);
        return this;
    }

    /**
     * <p>
     * A list of items that aren't compliant for the resource.
     * </p>
     * 
     * @param nonCompliantSummary
     *        A list of items that aren't compliant for the resource.
     */

    public void setNonCompliantSummary(NonCompliantSummary nonCompliantSummary) {
        this.nonCompliantSummary = nonCompliantSummary;
    }

    /**
     * <p>
     * A list of items that aren't compliant for the resource.
     * </p>
     * 
     * @return A list of items that aren't compliant for the resource.
     */

    public NonCompliantSummary getNonCompliantSummary() {
        return this.nonCompliantSummary;
    }

    /**
     * <p>
     * A list of items that aren't compliant for the resource.
     * </p>
     * 
     * @param nonCompliantSummary
     *        A list of items that aren't compliant for the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceComplianceSummaryItem withNonCompliantSummary(NonCompliantSummary nonCompliantSummary) {
        setNonCompliantSummary(nonCompliantSummary);
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
        if (getComplianceType() != null)
            sb.append("ComplianceType: ").append(getComplianceType()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getOverallSeverity() != null)
            sb.append("OverallSeverity: ").append(getOverallSeverity()).append(",");
        if (getExecutionSummary() != null)
            sb.append("ExecutionSummary: ").append(getExecutionSummary()).append(",");
        if (getCompliantSummary() != null)
            sb.append("CompliantSummary: ").append(getCompliantSummary()).append(",");
        if (getNonCompliantSummary() != null)
            sb.append("NonCompliantSummary: ").append(getNonCompliantSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceComplianceSummaryItem == false)
            return false;
        ResourceComplianceSummaryItem other = (ResourceComplianceSummaryItem) obj;
        if (other.getComplianceType() == null ^ this.getComplianceType() == null)
            return false;
        if (other.getComplianceType() != null && other.getComplianceType().equals(this.getComplianceType()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getOverallSeverity() == null ^ this.getOverallSeverity() == null)
            return false;
        if (other.getOverallSeverity() != null && other.getOverallSeverity().equals(this.getOverallSeverity()) == false)
            return false;
        if (other.getExecutionSummary() == null ^ this.getExecutionSummary() == null)
            return false;
        if (other.getExecutionSummary() != null && other.getExecutionSummary().equals(this.getExecutionSummary()) == false)
            return false;
        if (other.getCompliantSummary() == null ^ this.getCompliantSummary() == null)
            return false;
        if (other.getCompliantSummary() != null && other.getCompliantSummary().equals(this.getCompliantSummary()) == false)
            return false;
        if (other.getNonCompliantSummary() == null ^ this.getNonCompliantSummary() == null)
            return false;
        if (other.getNonCompliantSummary() != null && other.getNonCompliantSummary().equals(this.getNonCompliantSummary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComplianceType() == null) ? 0 : getComplianceType().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getOverallSeverity() == null) ? 0 : getOverallSeverity().hashCode());
        hashCode = prime * hashCode + ((getExecutionSummary() == null) ? 0 : getExecutionSummary().hashCode());
        hashCode = prime * hashCode + ((getCompliantSummary() == null) ? 0 : getCompliantSummary().hashCode());
        hashCode = prime * hashCode + ((getNonCompliantSummary() == null) ? 0 : getNonCompliantSummary().hashCode());
        return hashCode;
    }

    @Override
    public ResourceComplianceSummaryItem clone() {
        try {
            return (ResourceComplianceSummaryItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.ResourceComplianceSummaryItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
