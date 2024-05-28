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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The structure containing summary information about resource drifts for a stack instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/StackInstanceResourceDriftsSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StackInstanceResourceDriftsSummary implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the stack instance.
     * </p>
     */
    private String stackId;
    /**
     * <p>
     * The logical name of the resource specified in the template.
     * </p>
     */
    private String logicalResourceId;
    /**
     * <p>
     * The name or unique identifier that corresponds to a physical instance ID of a resource supported by
     * CloudFormation.
     * </p>
     */
    private String physicalResourceId;
    /**
     * <p>
     * Context information that enables CloudFormation to uniquely identify a resource. CloudFormation uses context
     * key-value pairs in cases where a resource's logical and physical IDs aren't enough to uniquely identify that
     * resource. Each context key-value pair specifies a unique resource that contains the targeted resource.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PhysicalResourceIdContextKeyValuePair> physicalResourceIdContext;
    /**
     * <p>
     * Type of resource. For more information, go to <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html">Amazon
     * Web Services Resource Types Reference</a> in the <i>CloudFormation User Guide</i>.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * Status of the actual configuration of the resource compared to its expected configuration. These will be present
     * only for resources whose <code>StackInstanceResourceDriftStatus</code> is <code>MODIFIED</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PropertyDifference> propertyDifferences;
    /**
     * <p>
     * The drift status of the resource in a stack instance.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETED</code>: The resource differs from its expected template configuration in that the resource has been
     * deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFIED</code>: One or more resource properties differ from their expected template values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The resource's actual configuration matches its expected template configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: CloudFormation doesn't currently return this value.
     * </p>
     * </li>
     * </ul>
     */
    private String stackResourceDriftStatus;
    /**
     * <p>
     * Time at which the stack instance drift detection operation was initiated.
     * </p>
     */
    private java.util.Date timestamp;

    /**
     * <p>
     * The ID of the stack instance.
     * </p>
     * 
     * @param stackId
     *        The ID of the stack instance.
     */

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * <p>
     * The ID of the stack instance.
     * </p>
     * 
     * @return The ID of the stack instance.
     */

    public String getStackId() {
        return this.stackId;
    }

    /**
     * <p>
     * The ID of the stack instance.
     * </p>
     * 
     * @param stackId
     *        The ID of the stack instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackInstanceResourceDriftsSummary withStackId(String stackId) {
        setStackId(stackId);
        return this;
    }

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

    public StackInstanceResourceDriftsSummary withLogicalResourceId(String logicalResourceId) {
        setLogicalResourceId(logicalResourceId);
        return this;
    }

    /**
     * <p>
     * The name or unique identifier that corresponds to a physical instance ID of a resource supported by
     * CloudFormation.
     * </p>
     * 
     * @param physicalResourceId
     *        The name or unique identifier that corresponds to a physical instance ID of a resource supported by
     *        CloudFormation.
     */

    public void setPhysicalResourceId(String physicalResourceId) {
        this.physicalResourceId = physicalResourceId;
    }

    /**
     * <p>
     * The name or unique identifier that corresponds to a physical instance ID of a resource supported by
     * CloudFormation.
     * </p>
     * 
     * @return The name or unique identifier that corresponds to a physical instance ID of a resource supported by
     *         CloudFormation.
     */

    public String getPhysicalResourceId() {
        return this.physicalResourceId;
    }

    /**
     * <p>
     * The name or unique identifier that corresponds to a physical instance ID of a resource supported by
     * CloudFormation.
     * </p>
     * 
     * @param physicalResourceId
     *        The name or unique identifier that corresponds to a physical instance ID of a resource supported by
     *        CloudFormation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackInstanceResourceDriftsSummary withPhysicalResourceId(String physicalResourceId) {
        setPhysicalResourceId(physicalResourceId);
        return this;
    }

    /**
     * <p>
     * Context information that enables CloudFormation to uniquely identify a resource. CloudFormation uses context
     * key-value pairs in cases where a resource's logical and physical IDs aren't enough to uniquely identify that
     * resource. Each context key-value pair specifies a unique resource that contains the targeted resource.
     * </p>
     * 
     * @return Context information that enables CloudFormation to uniquely identify a resource. CloudFormation uses
     *         context key-value pairs in cases where a resource's logical and physical IDs aren't enough to uniquely
     *         identify that resource. Each context key-value pair specifies a unique resource that contains the
     *         targeted resource.
     */

    public java.util.List<PhysicalResourceIdContextKeyValuePair> getPhysicalResourceIdContext() {
        if (physicalResourceIdContext == null) {
            physicalResourceIdContext = new com.amazonaws.internal.SdkInternalList<PhysicalResourceIdContextKeyValuePair>();
        }
        return physicalResourceIdContext;
    }

    /**
     * <p>
     * Context information that enables CloudFormation to uniquely identify a resource. CloudFormation uses context
     * key-value pairs in cases where a resource's logical and physical IDs aren't enough to uniquely identify that
     * resource. Each context key-value pair specifies a unique resource that contains the targeted resource.
     * </p>
     * 
     * @param physicalResourceIdContext
     *        Context information that enables CloudFormation to uniquely identify a resource. CloudFormation uses
     *        context key-value pairs in cases where a resource's logical and physical IDs aren't enough to uniquely
     *        identify that resource. Each context key-value pair specifies a unique resource that contains the targeted
     *        resource.
     */

    public void setPhysicalResourceIdContext(java.util.Collection<PhysicalResourceIdContextKeyValuePair> physicalResourceIdContext) {
        if (physicalResourceIdContext == null) {
            this.physicalResourceIdContext = null;
            return;
        }

        this.physicalResourceIdContext = new com.amazonaws.internal.SdkInternalList<PhysicalResourceIdContextKeyValuePair>(physicalResourceIdContext);
    }

    /**
     * <p>
     * Context information that enables CloudFormation to uniquely identify a resource. CloudFormation uses context
     * key-value pairs in cases where a resource's logical and physical IDs aren't enough to uniquely identify that
     * resource. Each context key-value pair specifies a unique resource that contains the targeted resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPhysicalResourceIdContext(java.util.Collection)} or
     * {@link #withPhysicalResourceIdContext(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param physicalResourceIdContext
     *        Context information that enables CloudFormation to uniquely identify a resource. CloudFormation uses
     *        context key-value pairs in cases where a resource's logical and physical IDs aren't enough to uniquely
     *        identify that resource. Each context key-value pair specifies a unique resource that contains the targeted
     *        resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackInstanceResourceDriftsSummary withPhysicalResourceIdContext(PhysicalResourceIdContextKeyValuePair... physicalResourceIdContext) {
        if (this.physicalResourceIdContext == null) {
            setPhysicalResourceIdContext(new com.amazonaws.internal.SdkInternalList<PhysicalResourceIdContextKeyValuePair>(physicalResourceIdContext.length));
        }
        for (PhysicalResourceIdContextKeyValuePair ele : physicalResourceIdContext) {
            this.physicalResourceIdContext.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Context information that enables CloudFormation to uniquely identify a resource. CloudFormation uses context
     * key-value pairs in cases where a resource's logical and physical IDs aren't enough to uniquely identify that
     * resource. Each context key-value pair specifies a unique resource that contains the targeted resource.
     * </p>
     * 
     * @param physicalResourceIdContext
     *        Context information that enables CloudFormation to uniquely identify a resource. CloudFormation uses
     *        context key-value pairs in cases where a resource's logical and physical IDs aren't enough to uniquely
     *        identify that resource. Each context key-value pair specifies a unique resource that contains the targeted
     *        resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackInstanceResourceDriftsSummary withPhysicalResourceIdContext(
            java.util.Collection<PhysicalResourceIdContextKeyValuePair> physicalResourceIdContext) {
        setPhysicalResourceIdContext(physicalResourceIdContext);
        return this;
    }

    /**
     * <p>
     * Type of resource. For more information, go to <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html">Amazon
     * Web Services Resource Types Reference</a> in the <i>CloudFormation User Guide</i>.
     * </p>
     * 
     * @param resourceType
     *        Type of resource. For more information, go to <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     *        >Amazon Web Services Resource Types Reference</a> in the <i>CloudFormation User Guide</i>.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * Type of resource. For more information, go to <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html">Amazon
     * Web Services Resource Types Reference</a> in the <i>CloudFormation User Guide</i>.
     * </p>
     * 
     * @return Type of resource. For more information, go to <a
     *         href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     *         >Amazon Web Services Resource Types Reference</a> in the <i>CloudFormation User Guide</i>.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * Type of resource. For more information, go to <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html">Amazon
     * Web Services Resource Types Reference</a> in the <i>CloudFormation User Guide</i>.
     * </p>
     * 
     * @param resourceType
     *        Type of resource. For more information, go to <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     *        >Amazon Web Services Resource Types Reference</a> in the <i>CloudFormation User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackInstanceResourceDriftsSummary withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * Status of the actual configuration of the resource compared to its expected configuration. These will be present
     * only for resources whose <code>StackInstanceResourceDriftStatus</code> is <code>MODIFIED</code>.
     * </p>
     * 
     * @return Status of the actual configuration of the resource compared to its expected configuration. These will be
     *         present only for resources whose <code>StackInstanceResourceDriftStatus</code> is <code>MODIFIED</code>.
     */

    public java.util.List<PropertyDifference> getPropertyDifferences() {
        if (propertyDifferences == null) {
            propertyDifferences = new com.amazonaws.internal.SdkInternalList<PropertyDifference>();
        }
        return propertyDifferences;
    }

    /**
     * <p>
     * Status of the actual configuration of the resource compared to its expected configuration. These will be present
     * only for resources whose <code>StackInstanceResourceDriftStatus</code> is <code>MODIFIED</code>.
     * </p>
     * 
     * @param propertyDifferences
     *        Status of the actual configuration of the resource compared to its expected configuration. These will be
     *        present only for resources whose <code>StackInstanceResourceDriftStatus</code> is <code>MODIFIED</code>.
     */

    public void setPropertyDifferences(java.util.Collection<PropertyDifference> propertyDifferences) {
        if (propertyDifferences == null) {
            this.propertyDifferences = null;
            return;
        }

        this.propertyDifferences = new com.amazonaws.internal.SdkInternalList<PropertyDifference>(propertyDifferences);
    }

    /**
     * <p>
     * Status of the actual configuration of the resource compared to its expected configuration. These will be present
     * only for resources whose <code>StackInstanceResourceDriftStatus</code> is <code>MODIFIED</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPropertyDifferences(java.util.Collection)} or {@link #withPropertyDifferences(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param propertyDifferences
     *        Status of the actual configuration of the resource compared to its expected configuration. These will be
     *        present only for resources whose <code>StackInstanceResourceDriftStatus</code> is <code>MODIFIED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackInstanceResourceDriftsSummary withPropertyDifferences(PropertyDifference... propertyDifferences) {
        if (this.propertyDifferences == null) {
            setPropertyDifferences(new com.amazonaws.internal.SdkInternalList<PropertyDifference>(propertyDifferences.length));
        }
        for (PropertyDifference ele : propertyDifferences) {
            this.propertyDifferences.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Status of the actual configuration of the resource compared to its expected configuration. These will be present
     * only for resources whose <code>StackInstanceResourceDriftStatus</code> is <code>MODIFIED</code>.
     * </p>
     * 
     * @param propertyDifferences
     *        Status of the actual configuration of the resource compared to its expected configuration. These will be
     *        present only for resources whose <code>StackInstanceResourceDriftStatus</code> is <code>MODIFIED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackInstanceResourceDriftsSummary withPropertyDifferences(java.util.Collection<PropertyDifference> propertyDifferences) {
        setPropertyDifferences(propertyDifferences);
        return this;
    }

    /**
     * <p>
     * The drift status of the resource in a stack instance.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETED</code>: The resource differs from its expected template configuration in that the resource has been
     * deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFIED</code>: One or more resource properties differ from their expected template values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The resource's actual configuration matches its expected template configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: CloudFormation doesn't currently return this value.
     * </p>
     * </li>
     * </ul>
     * 
     * @param stackResourceDriftStatus
     *        The drift status of the resource in a stack instance.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DELETED</code>: The resource differs from its expected template configuration in that the resource
     *        has been deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MODIFIED</code>: One or more resource properties differ from their expected template values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_SYNC</code>: The resource's actual configuration matches its expected template configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_CHECKED</code>: CloudFormation doesn't currently return this value.
     *        </p>
     *        </li>
     * @see StackResourceDriftStatus
     */

    public void setStackResourceDriftStatus(String stackResourceDriftStatus) {
        this.stackResourceDriftStatus = stackResourceDriftStatus;
    }

    /**
     * <p>
     * The drift status of the resource in a stack instance.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETED</code>: The resource differs from its expected template configuration in that the resource has been
     * deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFIED</code>: One or more resource properties differ from their expected template values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The resource's actual configuration matches its expected template configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: CloudFormation doesn't currently return this value.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The drift status of the resource in a stack instance.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DELETED</code>: The resource differs from its expected template configuration in that the resource
     *         has been deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MODIFIED</code>: One or more resource properties differ from their expected template values.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IN_SYNC</code>: The resource's actual configuration matches its expected template configuration.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NOT_CHECKED</code>: CloudFormation doesn't currently return this value.
     *         </p>
     *         </li>
     * @see StackResourceDriftStatus
     */

    public String getStackResourceDriftStatus() {
        return this.stackResourceDriftStatus;
    }

    /**
     * <p>
     * The drift status of the resource in a stack instance.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETED</code>: The resource differs from its expected template configuration in that the resource has been
     * deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFIED</code>: One or more resource properties differ from their expected template values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The resource's actual configuration matches its expected template configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: CloudFormation doesn't currently return this value.
     * </p>
     * </li>
     * </ul>
     * 
     * @param stackResourceDriftStatus
     *        The drift status of the resource in a stack instance.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DELETED</code>: The resource differs from its expected template configuration in that the resource
     *        has been deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MODIFIED</code>: One or more resource properties differ from their expected template values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_SYNC</code>: The resource's actual configuration matches its expected template configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_CHECKED</code>: CloudFormation doesn't currently return this value.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StackResourceDriftStatus
     */

    public StackInstanceResourceDriftsSummary withStackResourceDriftStatus(String stackResourceDriftStatus) {
        setStackResourceDriftStatus(stackResourceDriftStatus);
        return this;
    }

    /**
     * <p>
     * The drift status of the resource in a stack instance.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETED</code>: The resource differs from its expected template configuration in that the resource has been
     * deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFIED</code>: One or more resource properties differ from their expected template values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The resource's actual configuration matches its expected template configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: CloudFormation doesn't currently return this value.
     * </p>
     * </li>
     * </ul>
     * 
     * @param stackResourceDriftStatus
     *        The drift status of the resource in a stack instance.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DELETED</code>: The resource differs from its expected template configuration in that the resource
     *        has been deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MODIFIED</code>: One or more resource properties differ from their expected template values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_SYNC</code>: The resource's actual configuration matches its expected template configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_CHECKED</code>: CloudFormation doesn't currently return this value.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StackResourceDriftStatus
     */

    public StackInstanceResourceDriftsSummary withStackResourceDriftStatus(StackResourceDriftStatus stackResourceDriftStatus) {
        this.stackResourceDriftStatus = stackResourceDriftStatus.toString();
        return this;
    }

    /**
     * <p>
     * Time at which the stack instance drift detection operation was initiated.
     * </p>
     * 
     * @param timestamp
     *        Time at which the stack instance drift detection operation was initiated.
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * Time at which the stack instance drift detection operation was initiated.
     * </p>
     * 
     * @return Time at which the stack instance drift detection operation was initiated.
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * Time at which the stack instance drift detection operation was initiated.
     * </p>
     * 
     * @param timestamp
     *        Time at which the stack instance drift detection operation was initiated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackInstanceResourceDriftsSummary withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
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
        if (getStackId() != null)
            sb.append("StackId: ").append(getStackId()).append(",");
        if (getLogicalResourceId() != null)
            sb.append("LogicalResourceId: ").append(getLogicalResourceId()).append(",");
        if (getPhysicalResourceId() != null)
            sb.append("PhysicalResourceId: ").append(getPhysicalResourceId()).append(",");
        if (getPhysicalResourceIdContext() != null)
            sb.append("PhysicalResourceIdContext: ").append(getPhysicalResourceIdContext()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getPropertyDifferences() != null)
            sb.append("PropertyDifferences: ").append(getPropertyDifferences()).append(",");
        if (getStackResourceDriftStatus() != null)
            sb.append("StackResourceDriftStatus: ").append(getStackResourceDriftStatus()).append(",");
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StackInstanceResourceDriftsSummary == false)
            return false;
        StackInstanceResourceDriftsSummary other = (StackInstanceResourceDriftsSummary) obj;
        if (other.getStackId() == null ^ this.getStackId() == null)
            return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false)
            return false;
        if (other.getLogicalResourceId() == null ^ this.getLogicalResourceId() == null)
            return false;
        if (other.getLogicalResourceId() != null && other.getLogicalResourceId().equals(this.getLogicalResourceId()) == false)
            return false;
        if (other.getPhysicalResourceId() == null ^ this.getPhysicalResourceId() == null)
            return false;
        if (other.getPhysicalResourceId() != null && other.getPhysicalResourceId().equals(this.getPhysicalResourceId()) == false)
            return false;
        if (other.getPhysicalResourceIdContext() == null ^ this.getPhysicalResourceIdContext() == null)
            return false;
        if (other.getPhysicalResourceIdContext() != null && other.getPhysicalResourceIdContext().equals(this.getPhysicalResourceIdContext()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getPropertyDifferences() == null ^ this.getPropertyDifferences() == null)
            return false;
        if (other.getPropertyDifferences() != null && other.getPropertyDifferences().equals(this.getPropertyDifferences()) == false)
            return false;
        if (other.getStackResourceDriftStatus() == null ^ this.getStackResourceDriftStatus() == null)
            return false;
        if (other.getStackResourceDriftStatus() != null && other.getStackResourceDriftStatus().equals(this.getStackResourceDriftStatus()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode());
        hashCode = prime * hashCode + ((getLogicalResourceId() == null) ? 0 : getLogicalResourceId().hashCode());
        hashCode = prime * hashCode + ((getPhysicalResourceId() == null) ? 0 : getPhysicalResourceId().hashCode());
        hashCode = prime * hashCode + ((getPhysicalResourceIdContext() == null) ? 0 : getPhysicalResourceIdContext().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getPropertyDifferences() == null) ? 0 : getPropertyDifferences().hashCode());
        hashCode = prime * hashCode + ((getStackResourceDriftStatus() == null) ? 0 : getStackResourceDriftStatus().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public StackInstanceResourceDriftsSummary clone() {
        try {
            return (StackInstanceResourceDriftsSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
