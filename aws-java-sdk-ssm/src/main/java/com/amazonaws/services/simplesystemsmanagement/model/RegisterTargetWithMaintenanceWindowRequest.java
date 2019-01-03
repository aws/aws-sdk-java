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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/RegisterTargetWithMaintenanceWindow"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterTargetWithMaintenanceWindowRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Maintenance Window the target should be registered with.
     * </p>
     */
    private String windowId;
    /**
     * <p>
     * The type of target being registered with the Maintenance Window.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The targets (either instances or tags).
     * </p>
     * <p>
     * Specify instances using the following format:
     * </p>
     * <p>
     * <code>Key=InstanceIds,Values=&lt;instance-id-1&gt;,&lt;instance-id-2&gt;</code>
     * </p>
     * <p>
     * Specify tags using either of the following formats:
     * </p>
     * <p>
     * <code>Key=tag:&lt;tag-key&gt;,Values=&lt;tag-value-1&gt;,&lt;tag-value-2&gt;</code>
     * </p>
     * <p>
     * <code>Key=tag-key,Values=&lt;tag-key-1&gt;,&lt;tag-key-2&gt;</code>
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Target> targets;
    /**
     * <p>
     * User-provided value that will be included in any CloudWatch events raised while running tasks for these targets
     * in this Maintenance Window.
     * </p>
     */
    private String ownerInformation;
    /**
     * <p>
     * An optional name for the target.
     * </p>
     */
    private String name;
    /**
     * <p>
     * An optional description for the target.
     * </p>
     */
    private String description;
    /**
     * <p>
     * User-provided idempotency token.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The ID of the Maintenance Window the target should be registered with.
     * </p>
     * 
     * @param windowId
     *        The ID of the Maintenance Window the target should be registered with.
     */

    public void setWindowId(String windowId) {
        this.windowId = windowId;
    }

    /**
     * <p>
     * The ID of the Maintenance Window the target should be registered with.
     * </p>
     * 
     * @return The ID of the Maintenance Window the target should be registered with.
     */

    public String getWindowId() {
        return this.windowId;
    }

    /**
     * <p>
     * The ID of the Maintenance Window the target should be registered with.
     * </p>
     * 
     * @param windowId
     *        The ID of the Maintenance Window the target should be registered with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTargetWithMaintenanceWindowRequest withWindowId(String windowId) {
        setWindowId(windowId);
        return this;
    }

    /**
     * <p>
     * The type of target being registered with the Maintenance Window.
     * </p>
     * 
     * @param resourceType
     *        The type of target being registered with the Maintenance Window.
     * @see MaintenanceWindowResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of target being registered with the Maintenance Window.
     * </p>
     * 
     * @return The type of target being registered with the Maintenance Window.
     * @see MaintenanceWindowResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of target being registered with the Maintenance Window.
     * </p>
     * 
     * @param resourceType
     *        The type of target being registered with the Maintenance Window.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaintenanceWindowResourceType
     */

    public RegisterTargetWithMaintenanceWindowRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of target being registered with the Maintenance Window.
     * </p>
     * 
     * @param resourceType
     *        The type of target being registered with the Maintenance Window.
     * @see MaintenanceWindowResourceType
     */

    public void setResourceType(MaintenanceWindowResourceType resourceType) {
        withResourceType(resourceType);
    }

    /**
     * <p>
     * The type of target being registered with the Maintenance Window.
     * </p>
     * 
     * @param resourceType
     *        The type of target being registered with the Maintenance Window.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaintenanceWindowResourceType
     */

    public RegisterTargetWithMaintenanceWindowRequest withResourceType(MaintenanceWindowResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The targets (either instances or tags).
     * </p>
     * <p>
     * Specify instances using the following format:
     * </p>
     * <p>
     * <code>Key=InstanceIds,Values=&lt;instance-id-1&gt;,&lt;instance-id-2&gt;</code>
     * </p>
     * <p>
     * Specify tags using either of the following formats:
     * </p>
     * <p>
     * <code>Key=tag:&lt;tag-key&gt;,Values=&lt;tag-value-1&gt;,&lt;tag-value-2&gt;</code>
     * </p>
     * <p>
     * <code>Key=tag-key,Values=&lt;tag-key-1&gt;,&lt;tag-key-2&gt;</code>
     * </p>
     * 
     * @return The targets (either instances or tags). </p>
     *         <p>
     *         Specify instances using the following format:
     *         </p>
     *         <p>
     *         <code>Key=InstanceIds,Values=&lt;instance-id-1&gt;,&lt;instance-id-2&gt;</code>
     *         </p>
     *         <p>
     *         Specify tags using either of the following formats:
     *         </p>
     *         <p>
     *         <code>Key=tag:&lt;tag-key&gt;,Values=&lt;tag-value-1&gt;,&lt;tag-value-2&gt;</code>
     *         </p>
     *         <p>
     *         <code>Key=tag-key,Values=&lt;tag-key-1&gt;,&lt;tag-key-2&gt;</code>
     */

    public java.util.List<Target> getTargets() {
        if (targets == null) {
            targets = new com.amazonaws.internal.SdkInternalList<Target>();
        }
        return targets;
    }

    /**
     * <p>
     * The targets (either instances or tags).
     * </p>
     * <p>
     * Specify instances using the following format:
     * </p>
     * <p>
     * <code>Key=InstanceIds,Values=&lt;instance-id-1&gt;,&lt;instance-id-2&gt;</code>
     * </p>
     * <p>
     * Specify tags using either of the following formats:
     * </p>
     * <p>
     * <code>Key=tag:&lt;tag-key&gt;,Values=&lt;tag-value-1&gt;,&lt;tag-value-2&gt;</code>
     * </p>
     * <p>
     * <code>Key=tag-key,Values=&lt;tag-key-1&gt;,&lt;tag-key-2&gt;</code>
     * </p>
     * 
     * @param targets
     *        The targets (either instances or tags). </p>
     *        <p>
     *        Specify instances using the following format:
     *        </p>
     *        <p>
     *        <code>Key=InstanceIds,Values=&lt;instance-id-1&gt;,&lt;instance-id-2&gt;</code>
     *        </p>
     *        <p>
     *        Specify tags using either of the following formats:
     *        </p>
     *        <p>
     *        <code>Key=tag:&lt;tag-key&gt;,Values=&lt;tag-value-1&gt;,&lt;tag-value-2&gt;</code>
     *        </p>
     *        <p>
     *        <code>Key=tag-key,Values=&lt;tag-key-1&gt;,&lt;tag-key-2&gt;</code>
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
     * The targets (either instances or tags).
     * </p>
     * <p>
     * Specify instances using the following format:
     * </p>
     * <p>
     * <code>Key=InstanceIds,Values=&lt;instance-id-1&gt;,&lt;instance-id-2&gt;</code>
     * </p>
     * <p>
     * Specify tags using either of the following formats:
     * </p>
     * <p>
     * <code>Key=tag:&lt;tag-key&gt;,Values=&lt;tag-value-1&gt;,&lt;tag-value-2&gt;</code>
     * </p>
     * <p>
     * <code>Key=tag-key,Values=&lt;tag-key-1&gt;,&lt;tag-key-2&gt;</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargets(java.util.Collection)} or {@link #withTargets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param targets
     *        The targets (either instances or tags). </p>
     *        <p>
     *        Specify instances using the following format:
     *        </p>
     *        <p>
     *        <code>Key=InstanceIds,Values=&lt;instance-id-1&gt;,&lt;instance-id-2&gt;</code>
     *        </p>
     *        <p>
     *        Specify tags using either of the following formats:
     *        </p>
     *        <p>
     *        <code>Key=tag:&lt;tag-key&gt;,Values=&lt;tag-value-1&gt;,&lt;tag-value-2&gt;</code>
     *        </p>
     *        <p>
     *        <code>Key=tag-key,Values=&lt;tag-key-1&gt;,&lt;tag-key-2&gt;</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTargetWithMaintenanceWindowRequest withTargets(Target... targets) {
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
     * The targets (either instances or tags).
     * </p>
     * <p>
     * Specify instances using the following format:
     * </p>
     * <p>
     * <code>Key=InstanceIds,Values=&lt;instance-id-1&gt;,&lt;instance-id-2&gt;</code>
     * </p>
     * <p>
     * Specify tags using either of the following formats:
     * </p>
     * <p>
     * <code>Key=tag:&lt;tag-key&gt;,Values=&lt;tag-value-1&gt;,&lt;tag-value-2&gt;</code>
     * </p>
     * <p>
     * <code>Key=tag-key,Values=&lt;tag-key-1&gt;,&lt;tag-key-2&gt;</code>
     * </p>
     * 
     * @param targets
     *        The targets (either instances or tags). </p>
     *        <p>
     *        Specify instances using the following format:
     *        </p>
     *        <p>
     *        <code>Key=InstanceIds,Values=&lt;instance-id-1&gt;,&lt;instance-id-2&gt;</code>
     *        </p>
     *        <p>
     *        Specify tags using either of the following formats:
     *        </p>
     *        <p>
     *        <code>Key=tag:&lt;tag-key&gt;,Values=&lt;tag-value-1&gt;,&lt;tag-value-2&gt;</code>
     *        </p>
     *        <p>
     *        <code>Key=tag-key,Values=&lt;tag-key-1&gt;,&lt;tag-key-2&gt;</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTargetWithMaintenanceWindowRequest withTargets(java.util.Collection<Target> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * <p>
     * User-provided value that will be included in any CloudWatch events raised while running tasks for these targets
     * in this Maintenance Window.
     * </p>
     * 
     * @param ownerInformation
     *        User-provided value that will be included in any CloudWatch events raised while running tasks for these
     *        targets in this Maintenance Window.
     */

    public void setOwnerInformation(String ownerInformation) {
        this.ownerInformation = ownerInformation;
    }

    /**
     * <p>
     * User-provided value that will be included in any CloudWatch events raised while running tasks for these targets
     * in this Maintenance Window.
     * </p>
     * 
     * @return User-provided value that will be included in any CloudWatch events raised while running tasks for these
     *         targets in this Maintenance Window.
     */

    public String getOwnerInformation() {
        return this.ownerInformation;
    }

    /**
     * <p>
     * User-provided value that will be included in any CloudWatch events raised while running tasks for these targets
     * in this Maintenance Window.
     * </p>
     * 
     * @param ownerInformation
     *        User-provided value that will be included in any CloudWatch events raised while running tasks for these
     *        targets in this Maintenance Window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTargetWithMaintenanceWindowRequest withOwnerInformation(String ownerInformation) {
        setOwnerInformation(ownerInformation);
        return this;
    }

    /**
     * <p>
     * An optional name for the target.
     * </p>
     * 
     * @param name
     *        An optional name for the target.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * An optional name for the target.
     * </p>
     * 
     * @return An optional name for the target.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * An optional name for the target.
     * </p>
     * 
     * @param name
     *        An optional name for the target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTargetWithMaintenanceWindowRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * An optional description for the target.
     * </p>
     * 
     * @param description
     *        An optional description for the target.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * An optional description for the target.
     * </p>
     * 
     * @return An optional description for the target.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * An optional description for the target.
     * </p>
     * 
     * @param description
     *        An optional description for the target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTargetWithMaintenanceWindowRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * User-provided idempotency token.
     * </p>
     * 
     * @param clientToken
     *        User-provided idempotency token.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * User-provided idempotency token.
     * </p>
     * 
     * @return User-provided idempotency token.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * User-provided idempotency token.
     * </p>
     * 
     * @param clientToken
     *        User-provided idempotency token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTargetWithMaintenanceWindowRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getTargets() != null)
            sb.append("Targets: ").append(getTargets()).append(",");
        if (getOwnerInformation() != null)
            sb.append("OwnerInformation: ").append("***Sensitive Data Redacted***").append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterTargetWithMaintenanceWindowRequest == false)
            return false;
        RegisterTargetWithMaintenanceWindowRequest other = (RegisterTargetWithMaintenanceWindowRequest) obj;
        if (other.getWindowId() == null ^ this.getWindowId() == null)
            return false;
        if (other.getWindowId() != null && other.getWindowId().equals(this.getWindowId()) == false)
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
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWindowId() == null) ? 0 : getWindowId().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode + ((getOwnerInformation() == null) ? 0 : getOwnerInformation().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public RegisterTargetWithMaintenanceWindowRequest clone() {
        return (RegisterTargetWithMaintenanceWindowRequest) super.clone();
    }

}
