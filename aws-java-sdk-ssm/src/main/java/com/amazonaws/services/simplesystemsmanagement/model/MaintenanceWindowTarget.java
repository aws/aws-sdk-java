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
 * The target registered with the Maintenance Window.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/MaintenanceWindowTarget" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MaintenanceWindowTarget implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the Maintenance Window to register the target with.
     * </p>
     */
    private String windowId;
    /**
     * <p>
     * The ID of the target.
     * </p>
     */
    private String windowTargetId;
    /**
     * <p>
     * The type of target that is being registered with the Maintenance Window.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The targets, either instances or tags.
     * </p>
     * <p>
     * Specify instances using the following format:
     * </p>
     * <p>
     * <code>Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;</code>
     * </p>
     * <p>
     * Tags are specified using the following format:
     * </p>
     * <p>
     * <code>Key=&lt;tag name&gt;,Values=&lt;tag value&gt;</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Target> targets;
    /**
     * <p>
     * A user-provided value that will be included in any CloudWatch events that are raised while running tasks for
     * these targets in this Maintenance Window.
     * </p>
     */
    private String ownerInformation;
    /**
     * <p>
     * The target name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description for the target.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The ID of the Maintenance Window to register the target with.
     * </p>
     * 
     * @param windowId
     *        The ID of the Maintenance Window to register the target with.
     */

    public void setWindowId(String windowId) {
        this.windowId = windowId;
    }

    /**
     * <p>
     * The ID of the Maintenance Window to register the target with.
     * </p>
     * 
     * @return The ID of the Maintenance Window to register the target with.
     */

    public String getWindowId() {
        return this.windowId;
    }

    /**
     * <p>
     * The ID of the Maintenance Window to register the target with.
     * </p>
     * 
     * @param windowId
     *        The ID of the Maintenance Window to register the target with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowTarget withWindowId(String windowId) {
        setWindowId(windowId);
        return this;
    }

    /**
     * <p>
     * The ID of the target.
     * </p>
     * 
     * @param windowTargetId
     *        The ID of the target.
     */

    public void setWindowTargetId(String windowTargetId) {
        this.windowTargetId = windowTargetId;
    }

    /**
     * <p>
     * The ID of the target.
     * </p>
     * 
     * @return The ID of the target.
     */

    public String getWindowTargetId() {
        return this.windowTargetId;
    }

    /**
     * <p>
     * The ID of the target.
     * </p>
     * 
     * @param windowTargetId
     *        The ID of the target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowTarget withWindowTargetId(String windowTargetId) {
        setWindowTargetId(windowTargetId);
        return this;
    }

    /**
     * <p>
     * The type of target that is being registered with the Maintenance Window.
     * </p>
     * 
     * @param resourceType
     *        The type of target that is being registered with the Maintenance Window.
     * @see MaintenanceWindowResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of target that is being registered with the Maintenance Window.
     * </p>
     * 
     * @return The type of target that is being registered with the Maintenance Window.
     * @see MaintenanceWindowResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of target that is being registered with the Maintenance Window.
     * </p>
     * 
     * @param resourceType
     *        The type of target that is being registered with the Maintenance Window.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaintenanceWindowResourceType
     */

    public MaintenanceWindowTarget withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of target that is being registered with the Maintenance Window.
     * </p>
     * 
     * @param resourceType
     *        The type of target that is being registered with the Maintenance Window.
     * @see MaintenanceWindowResourceType
     */

    public void setResourceType(MaintenanceWindowResourceType resourceType) {
        withResourceType(resourceType);
    }

    /**
     * <p>
     * The type of target that is being registered with the Maintenance Window.
     * </p>
     * 
     * @param resourceType
     *        The type of target that is being registered with the Maintenance Window.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaintenanceWindowResourceType
     */

    public MaintenanceWindowTarget withResourceType(MaintenanceWindowResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The targets, either instances or tags.
     * </p>
     * <p>
     * Specify instances using the following format:
     * </p>
     * <p>
     * <code>Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;</code>
     * </p>
     * <p>
     * Tags are specified using the following format:
     * </p>
     * <p>
     * <code>Key=&lt;tag name&gt;,Values=&lt;tag value&gt;</code>.
     * </p>
     * 
     * @return The targets, either instances or tags.</p>
     *         <p>
     *         Specify instances using the following format:
     *         </p>
     *         <p>
     *         <code>Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;</code>
     *         </p>
     *         <p>
     *         Tags are specified using the following format:
     *         </p>
     *         <p>
     *         <code>Key=&lt;tag name&gt;,Values=&lt;tag value&gt;</code>.
     */

    public java.util.List<Target> getTargets() {
        if (targets == null) {
            targets = new com.amazonaws.internal.SdkInternalList<Target>();
        }
        return targets;
    }

    /**
     * <p>
     * The targets, either instances or tags.
     * </p>
     * <p>
     * Specify instances using the following format:
     * </p>
     * <p>
     * <code>Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;</code>
     * </p>
     * <p>
     * Tags are specified using the following format:
     * </p>
     * <p>
     * <code>Key=&lt;tag name&gt;,Values=&lt;tag value&gt;</code>.
     * </p>
     * 
     * @param targets
     *        The targets, either instances or tags.</p>
     *        <p>
     *        Specify instances using the following format:
     *        </p>
     *        <p>
     *        <code>Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;</code>
     *        </p>
     *        <p>
     *        Tags are specified using the following format:
     *        </p>
     *        <p>
     *        <code>Key=&lt;tag name&gt;,Values=&lt;tag value&gt;</code>.
     */

    public void setTargets(java.util.Collection<Target> targets) {
        if (targets == null) {
            this.targets = null;
            return;
        }

        this.targets = new com.amazonaws.internal.SdkInternalList<Target>(targets);
    }

    /**
     * <p>
     * The targets, either instances or tags.
     * </p>
     * <p>
     * Specify instances using the following format:
     * </p>
     * <p>
     * <code>Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;</code>
     * </p>
     * <p>
     * Tags are specified using the following format:
     * </p>
     * <p>
     * <code>Key=&lt;tag name&gt;,Values=&lt;tag value&gt;</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargets(java.util.Collection)} or {@link #withTargets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param targets
     *        The targets, either instances or tags.</p>
     *        <p>
     *        Specify instances using the following format:
     *        </p>
     *        <p>
     *        <code>Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;</code>
     *        </p>
     *        <p>
     *        Tags are specified using the following format:
     *        </p>
     *        <p>
     *        <code>Key=&lt;tag name&gt;,Values=&lt;tag value&gt;</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowTarget withTargets(Target... targets) {
        if (this.targets == null) {
            setTargets(new com.amazonaws.internal.SdkInternalList<Target>(targets.length));
        }
        for (Target ele : targets) {
            this.targets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The targets, either instances or tags.
     * </p>
     * <p>
     * Specify instances using the following format:
     * </p>
     * <p>
     * <code>Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;</code>
     * </p>
     * <p>
     * Tags are specified using the following format:
     * </p>
     * <p>
     * <code>Key=&lt;tag name&gt;,Values=&lt;tag value&gt;</code>.
     * </p>
     * 
     * @param targets
     *        The targets, either instances or tags.</p>
     *        <p>
     *        Specify instances using the following format:
     *        </p>
     *        <p>
     *        <code>Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;</code>
     *        </p>
     *        <p>
     *        Tags are specified using the following format:
     *        </p>
     *        <p>
     *        <code>Key=&lt;tag name&gt;,Values=&lt;tag value&gt;</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowTarget withTargets(java.util.Collection<Target> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * <p>
     * A user-provided value that will be included in any CloudWatch events that are raised while running tasks for
     * these targets in this Maintenance Window.
     * </p>
     * 
     * @param ownerInformation
     *        A user-provided value that will be included in any CloudWatch events that are raised while running tasks
     *        for these targets in this Maintenance Window.
     */

    public void setOwnerInformation(String ownerInformation) {
        this.ownerInformation = ownerInformation;
    }

    /**
     * <p>
     * A user-provided value that will be included in any CloudWatch events that are raised while running tasks for
     * these targets in this Maintenance Window.
     * </p>
     * 
     * @return A user-provided value that will be included in any CloudWatch events that are raised while running tasks
     *         for these targets in this Maintenance Window.
     */

    public String getOwnerInformation() {
        return this.ownerInformation;
    }

    /**
     * <p>
     * A user-provided value that will be included in any CloudWatch events that are raised while running tasks for
     * these targets in this Maintenance Window.
     * </p>
     * 
     * @param ownerInformation
     *        A user-provided value that will be included in any CloudWatch events that are raised while running tasks
     *        for these targets in this Maintenance Window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowTarget withOwnerInformation(String ownerInformation) {
        setOwnerInformation(ownerInformation);
        return this;
    }

    /**
     * <p>
     * The target name.
     * </p>
     * 
     * @param name
     *        The target name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The target name.
     * </p>
     * 
     * @return The target name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The target name.
     * </p>
     * 
     * @param name
     *        The target name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowTarget withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description for the target.
     * </p>
     * 
     * @param description
     *        A description for the target.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the target.
     * </p>
     * 
     * @return A description for the target.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the target.
     * </p>
     * 
     * @param description
     *        A description for the target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowTarget withDescription(String description) {
        setDescription(description);
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
        if (getWindowId() != null)
            sb.append("WindowId: ").append(getWindowId()).append(",");
        if (getWindowTargetId() != null)
            sb.append("WindowTargetId: ").append(getWindowTargetId()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getTargets() != null)
            sb.append("Targets: ").append(getTargets()).append(",");
        if (getOwnerInformation() != null)
            sb.append("OwnerInformation: ").append("***Sensitive Data Redacted***").append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MaintenanceWindowTarget == false)
            return false;
        MaintenanceWindowTarget other = (MaintenanceWindowTarget) obj;
        if (other.getWindowId() == null ^ this.getWindowId() == null)
            return false;
        if (other.getWindowId() != null && other.getWindowId().equals(this.getWindowId()) == false)
            return false;
        if (other.getWindowTargetId() == null ^ this.getWindowTargetId() == null)
            return false;
        if (other.getWindowTargetId() != null && other.getWindowTargetId().equals(this.getWindowTargetId()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        if (other.getOwnerInformation() == null ^ this.getOwnerInformation() == null)
            return false;
        if (other.getOwnerInformation() != null && other.getOwnerInformation().equals(this.getOwnerInformation()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWindowId() == null) ? 0 : getWindowId().hashCode());
        hashCode = prime * hashCode + ((getWindowTargetId() == null) ? 0 : getWindowTargetId().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode + ((getOwnerInformation() == null) ? 0 : getOwnerInformation().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public MaintenanceWindowTarget clone() {
        try {
            return (MaintenanceWindowTarget) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.MaintenanceWindowTargetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
