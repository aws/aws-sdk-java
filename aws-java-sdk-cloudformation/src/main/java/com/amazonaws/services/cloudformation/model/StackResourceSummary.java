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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains high-level information about the specified stack resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/StackResourceSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StackResourceSummary implements Serializable, Cloneable {

    /**
     * <p>
     * The logical name of the resource specified in the template.
     * </p>
     */
    private String logicalResourceId;
    /**
     * <p>
     * The name or unique identifier that corresponds to a physical instance ID of the resource.
     * </p>
     */
    private String physicalResourceId;
    /**
     * <p>
     * Type of resource. (For more information, go to <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"> AWS
     * Resource Types Reference</a> in the AWS CloudFormation User Guide.)
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * Time the status was updated.
     * </p>
     */
    private java.util.Date lastUpdatedTimestamp;
    /**
     * <p>
     * Current status of the resource.
     * </p>
     */
    private String resourceStatus;
    /**
     * <p>
     * Success/failure message associated with the resource.
     * </p>
     */
    private String resourceStatusReason;
    /**
     * <p>
     * Information about whether the resource's actual configuration differs, or has <i>drifted</i>, from its expected
     * configuration, as defined in the stack template and any values specified as template parameters. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html">Detecting
     * Unregulated Configuration Changes to Stacks and Resources</a>.
     * </p>
     */
    private StackResourceDriftInformationSummary driftInformation;

    /**
     * <p>
     * The logical name of the resource specified in the template.
     * </p>
     * 
     * @param logicalResourceId
     *        The logical name of the resource specified in the template.
     */

    public void setLogicalResourceId(String logicalResourceId) {
        this.logicalResourceId = logicalResourceId;
    }

    /**
     * <p>
     * The logical name of the resource specified in the template.
     * </p>
     * 
     * @return The logical name of the resource specified in the template.
     */

    public String getLogicalResourceId() {
        return this.logicalResourceId;
    }

    /**
     * <p>
     * The logical name of the resource specified in the template.
     * </p>
     * 
     * @param logicalResourceId
     *        The logical name of the resource specified in the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackResourceSummary withLogicalResourceId(String logicalResourceId) {
        setLogicalResourceId(logicalResourceId);
        return this;
    }

    /**
     * <p>
     * The name or unique identifier that corresponds to a physical instance ID of the resource.
     * </p>
     * 
     * @param physicalResourceId
     *        The name or unique identifier that corresponds to a physical instance ID of the resource.
     */

    public void setPhysicalResourceId(String physicalResourceId) {
        this.physicalResourceId = physicalResourceId;
    }

    /**
     * <p>
     * The name or unique identifier that corresponds to a physical instance ID of the resource.
     * </p>
     * 
     * @return The name or unique identifier that corresponds to a physical instance ID of the resource.
     */

    public String getPhysicalResourceId() {
        return this.physicalResourceId;
    }

    /**
     * <p>
     * The name or unique identifier that corresponds to a physical instance ID of the resource.
     * </p>
     * 
     * @param physicalResourceId
     *        The name or unique identifier that corresponds to a physical instance ID of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackResourceSummary withPhysicalResourceId(String physicalResourceId) {
        setPhysicalResourceId(physicalResourceId);
        return this;
    }

    /**
     * <p>
     * Type of resource. (For more information, go to <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"> AWS
     * Resource Types Reference</a> in the AWS CloudFormation User Guide.)
     * </p>
     * 
     * @param resourceType
     *        Type of resource. (For more information, go to <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"> AWS
     *        Resource Types Reference</a> in the AWS CloudFormation User Guide.)
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * Type of resource. (For more information, go to <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"> AWS
     * Resource Types Reference</a> in the AWS CloudFormation User Guide.)
     * </p>
     * 
     * @return Type of resource. (For more information, go to <a
     *         href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     *         > AWS Resource Types Reference</a> in the AWS CloudFormation User Guide.)
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * Type of resource. (For more information, go to <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"> AWS
     * Resource Types Reference</a> in the AWS CloudFormation User Guide.)
     * </p>
     * 
     * @param resourceType
     *        Type of resource. (For more information, go to <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"> AWS
     *        Resource Types Reference</a> in the AWS CloudFormation User Guide.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackResourceSummary withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * Time the status was updated.
     * </p>
     * 
     * @param lastUpdatedTimestamp
     *        Time the status was updated.
     */

    public void setLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    }

    /**
     * <p>
     * Time the status was updated.
     * </p>
     * 
     * @return Time the status was updated.
     */

    public java.util.Date getLastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    /**
     * <p>
     * Time the status was updated.
     * </p>
     * 
     * @param lastUpdatedTimestamp
     *        Time the status was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackResourceSummary withLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
        setLastUpdatedTimestamp(lastUpdatedTimestamp);
        return this;
    }

    /**
     * <p>
     * Current status of the resource.
     * </p>
     * 
     * @param resourceStatus
     *        Current status of the resource.
     * @see ResourceStatus
     */

    public void setResourceStatus(String resourceStatus) {
        this.resourceStatus = resourceStatus;
    }

    /**
     * <p>
     * Current status of the resource.
     * </p>
     * 
     * @return Current status of the resource.
     * @see ResourceStatus
     */

    public String getResourceStatus() {
        return this.resourceStatus;
    }

    /**
     * <p>
     * Current status of the resource.
     * </p>
     * 
     * @param resourceStatus
     *        Current status of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceStatus
     */

    public StackResourceSummary withResourceStatus(String resourceStatus) {
        setResourceStatus(resourceStatus);
        return this;
    }

    /**
     * <p>
     * Current status of the resource.
     * </p>
     * 
     * @param resourceStatus
     *        Current status of the resource.
     * @see ResourceStatus
     */

    public void setResourceStatus(ResourceStatus resourceStatus) {
        withResourceStatus(resourceStatus);
    }

    /**
     * <p>
     * Current status of the resource.
     * </p>
     * 
     * @param resourceStatus
     *        Current status of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceStatus
     */

    public StackResourceSummary withResourceStatus(ResourceStatus resourceStatus) {
        this.resourceStatus = resourceStatus.toString();
        return this;
    }

    /**
     * <p>
     * Success/failure message associated with the resource.
     * </p>
     * 
     * @param resourceStatusReason
     *        Success/failure message associated with the resource.
     */

    public void setResourceStatusReason(String resourceStatusReason) {
        this.resourceStatusReason = resourceStatusReason;
    }

    /**
     * <p>
     * Success/failure message associated with the resource.
     * </p>
     * 
     * @return Success/failure message associated with the resource.
     */

    public String getResourceStatusReason() {
        return this.resourceStatusReason;
    }

    /**
     * <p>
     * Success/failure message associated with the resource.
     * </p>
     * 
     * @param resourceStatusReason
     *        Success/failure message associated with the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackResourceSummary withResourceStatusReason(String resourceStatusReason) {
        setResourceStatusReason(resourceStatusReason);
        return this;
    }

    /**
     * <p>
     * Information about whether the resource's actual configuration differs, or has <i>drifted</i>, from its expected
     * configuration, as defined in the stack template and any values specified as template parameters. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html">Detecting
     * Unregulated Configuration Changes to Stacks and Resources</a>.
     * </p>
     * 
     * @param driftInformation
     *        Information about whether the resource's actual configuration differs, or has <i>drifted</i>, from its
     *        expected configuration, as defined in the stack template and any values specified as template parameters.
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html">Detecting
     *        Unregulated Configuration Changes to Stacks and Resources</a>.
     */

    public void setDriftInformation(StackResourceDriftInformationSummary driftInformation) {
        this.driftInformation = driftInformation;
    }

    /**
     * <p>
     * Information about whether the resource's actual configuration differs, or has <i>drifted</i>, from its expected
     * configuration, as defined in the stack template and any values specified as template parameters. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html">Detecting
     * Unregulated Configuration Changes to Stacks and Resources</a>.
     * </p>
     * 
     * @return Information about whether the resource's actual configuration differs, or has <i>drifted</i>, from its
     *         expected configuration, as defined in the stack template and any values specified as template parameters.
     *         For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html">Detecting
     *         Unregulated Configuration Changes to Stacks and Resources</a>.
     */

    public StackResourceDriftInformationSummary getDriftInformation() {
        return this.driftInformation;
    }

    /**
     * <p>
     * Information about whether the resource's actual configuration differs, or has <i>drifted</i>, from its expected
     * configuration, as defined in the stack template and any values specified as template parameters. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html">Detecting
     * Unregulated Configuration Changes to Stacks and Resources</a>.
     * </p>
     * 
     * @param driftInformation
     *        Information about whether the resource's actual configuration differs, or has <i>drifted</i>, from its
     *        expected configuration, as defined in the stack template and any values specified as template parameters.
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html">Detecting
     *        Unregulated Configuration Changes to Stacks and Resources</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackResourceSummary withDriftInformation(StackResourceDriftInformationSummary driftInformation) {
        setDriftInformation(driftInformation);
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
        if (getLogicalResourceId() != null)
            sb.append("LogicalResourceId: ").append(getLogicalResourceId()).append(",");
        if (getPhysicalResourceId() != null)
            sb.append("PhysicalResourceId: ").append(getPhysicalResourceId()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getLastUpdatedTimestamp() != null)
            sb.append("LastUpdatedTimestamp: ").append(getLastUpdatedTimestamp()).append(",");
        if (getResourceStatus() != null)
            sb.append("ResourceStatus: ").append(getResourceStatus()).append(",");
        if (getResourceStatusReason() != null)
            sb.append("ResourceStatusReason: ").append(getResourceStatusReason()).append(",");
        if (getDriftInformation() != null)
            sb.append("DriftInformation: ").append(getDriftInformation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StackResourceSummary == false)
            return false;
        StackResourceSummary other = (StackResourceSummary) obj;
        if (other.getLogicalResourceId() == null ^ this.getLogicalResourceId() == null)
            return false;
        if (other.getLogicalResourceId() != null && other.getLogicalResourceId().equals(this.getLogicalResourceId()) == false)
            return false;
        if (other.getPhysicalResourceId() == null ^ this.getPhysicalResourceId() == null)
            return false;
        if (other.getPhysicalResourceId() != null && other.getPhysicalResourceId().equals(this.getPhysicalResourceId()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getLastUpdatedTimestamp() == null ^ this.getLastUpdatedTimestamp() == null)
            return false;
        if (other.getLastUpdatedTimestamp() != null && other.getLastUpdatedTimestamp().equals(this.getLastUpdatedTimestamp()) == false)
            return false;
        if (other.getResourceStatus() == null ^ this.getResourceStatus() == null)
            return false;
        if (other.getResourceStatus() != null && other.getResourceStatus().equals(this.getResourceStatus()) == false)
            return false;
        if (other.getResourceStatusReason() == null ^ this.getResourceStatusReason() == null)
            return false;
        if (other.getResourceStatusReason() != null && other.getResourceStatusReason().equals(this.getResourceStatusReason()) == false)
            return false;
        if (other.getDriftInformation() == null ^ this.getDriftInformation() == null)
            return false;
        if (other.getDriftInformation() != null && other.getDriftInformation().equals(this.getDriftInformation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogicalResourceId() == null) ? 0 : getLogicalResourceId().hashCode());
        hashCode = prime * hashCode + ((getPhysicalResourceId() == null) ? 0 : getPhysicalResourceId().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTimestamp() == null) ? 0 : getLastUpdatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getResourceStatus() == null) ? 0 : getResourceStatus().hashCode());
        hashCode = prime * hashCode + ((getResourceStatusReason() == null) ? 0 : getResourceStatusReason().hashCode());
        hashCode = prime * hashCode + ((getDriftInformation() == null) ? 0 : getDriftInformation().hashCode());
        return hashCode;
    }

    @Override
    public StackResourceSummary clone() {
        try {
            return (StackResourceSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
