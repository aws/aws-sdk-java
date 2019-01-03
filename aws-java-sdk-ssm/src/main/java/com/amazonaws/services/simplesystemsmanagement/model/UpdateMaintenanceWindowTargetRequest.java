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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateMaintenanceWindowTarget" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateMaintenanceWindowTargetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Maintenance Window ID with which to modify the target.
     * </p>
     */
    private String windowId;
    /**
     * <p>
     * The target ID to modify.
     * </p>
     */
    private String windowTargetId;
    /**
     * <p>
     * The targets to add or replace.
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
     * A name for the update.
     * </p>
     */
    private String name;
    /**
     * <p>
     * An optional description for the update.
     * </p>
     */
    private String description;
    /**
     * <p>
     * If True, then all fields that are required by the RegisterTargetWithMaintenanceWindow action are also required
     * for this API request. Optional fields that are not specified are set to null.
     * </p>
     */
    private Boolean replace;

    /**
     * <p>
     * The Maintenance Window ID with which to modify the target.
     * </p>
     * 
     * @param windowId
     *        The Maintenance Window ID with which to modify the target.
     */

    public void setWindowId(String windowId) {
        this.windowId = windowId;
    }

    /**
     * <p>
     * The Maintenance Window ID with which to modify the target.
     * </p>
     * 
     * @return The Maintenance Window ID with which to modify the target.
     */

    public String getWindowId() {
        return this.windowId;
    }

    /**
     * <p>
     * The Maintenance Window ID with which to modify the target.
     * </p>
     * 
     * @param windowId
     *        The Maintenance Window ID with which to modify the target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowTargetRequest withWindowId(String windowId) {
        setWindowId(windowId);
        return this;
    }

    /**
     * <p>
     * The target ID to modify.
     * </p>
     * 
     * @param windowTargetId
     *        The target ID to modify.
     */

    public void setWindowTargetId(String windowTargetId) {
        this.windowTargetId = windowTargetId;
    }

    /**
     * <p>
     * The target ID to modify.
     * </p>
     * 
     * @return The target ID to modify.
     */

    public String getWindowTargetId() {
        return this.windowTargetId;
    }

    /**
     * <p>
     * The target ID to modify.
     * </p>
     * 
     * @param windowTargetId
     *        The target ID to modify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowTargetRequest withWindowTargetId(String windowTargetId) {
        setWindowTargetId(windowTargetId);
        return this;
    }

    /**
     * <p>
     * The targets to add or replace.
     * </p>
     * 
     * @return The targets to add or replace.
     */

    public java.util.List<Target> getTargets() {
        if (targets == null) {
            targets = new com.amazonaws.internal.SdkInternalList<Target>();
        }
        return targets;
    }

    /**
     * <p>
     * The targets to add or replace.
     * </p>
     * 
     * @param targets
     *        The targets to add or replace.
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
     * The targets to add or replace.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargets(java.util.Collection)} or {@link #withTargets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param targets
     *        The targets to add or replace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowTargetRequest withTargets(Target... targets) {
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
     * The targets to add or replace.
     * </p>
     * 
     * @param targets
     *        The targets to add or replace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowTargetRequest withTargets(java.util.Collection<Target> targets) {
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

    public UpdateMaintenanceWindowTargetRequest withOwnerInformation(String ownerInformation) {
        setOwnerInformation(ownerInformation);
        return this;
    }

    /**
     * <p>
     * A name for the update.
     * </p>
     * 
     * @param name
     *        A name for the update.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the update.
     * </p>
     * 
     * @return A name for the update.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name for the update.
     * </p>
     * 
     * @param name
     *        A name for the update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowTargetRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * An optional description for the update.
     * </p>
     * 
     * @param description
     *        An optional description for the update.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * An optional description for the update.
     * </p>
     * 
     * @return An optional description for the update.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * An optional description for the update.
     * </p>
     * 
     * @param description
     *        An optional description for the update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowTargetRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * If True, then all fields that are required by the RegisterTargetWithMaintenanceWindow action are also required
     * for this API request. Optional fields that are not specified are set to null.
     * </p>
     * 
     * @param replace
     *        If True, then all fields that are required by the RegisterTargetWithMaintenanceWindow action are also
     *        required for this API request. Optional fields that are not specified are set to null.
     */

    public void setReplace(Boolean replace) {
        this.replace = replace;
    }

    /**
     * <p>
     * If True, then all fields that are required by the RegisterTargetWithMaintenanceWindow action are also required
     * for this API request. Optional fields that are not specified are set to null.
     * </p>
     * 
     * @return If True, then all fields that are required by the RegisterTargetWithMaintenanceWindow action are also
     *         required for this API request. Optional fields that are not specified are set to null.
     */

    public Boolean getReplace() {
        return this.replace;
    }

    /**
     * <p>
     * If True, then all fields that are required by the RegisterTargetWithMaintenanceWindow action are also required
     * for this API request. Optional fields that are not specified are set to null.
     * </p>
     * 
     * @param replace
     *        If True, then all fields that are required by the RegisterTargetWithMaintenanceWindow action are also
     *        required for this API request. Optional fields that are not specified are set to null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowTargetRequest withReplace(Boolean replace) {
        setReplace(replace);
        return this;
    }

    /**
     * <p>
     * If True, then all fields that are required by the RegisterTargetWithMaintenanceWindow action are also required
     * for this API request. Optional fields that are not specified are set to null.
     * </p>
     * 
     * @return If True, then all fields that are required by the RegisterTargetWithMaintenanceWindow action are also
     *         required for this API request. Optional fields that are not specified are set to null.
     */

    public Boolean isReplace() {
        return this.replace;
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
        if (getTargets() != null)
            sb.append("Targets: ").append(getTargets()).append(",");
        if (getOwnerInformation() != null)
            sb.append("OwnerInformation: ").append("***Sensitive Data Redacted***").append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getReplace() != null)
            sb.append("Replace: ").append(getReplace());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateMaintenanceWindowTargetRequest == false)
            return false;
        UpdateMaintenanceWindowTargetRequest other = (UpdateMaintenanceWindowTargetRequest) obj;
        if (other.getWindowId() == null ^ this.getWindowId() == null)
            return false;
        if (other.getWindowId() != null && other.getWindowId().equals(this.getWindowId()) == false)
            return false;
        if (other.getWindowTargetId() == null ^ this.getWindowTargetId() == null)
            return false;
        if (other.getWindowTargetId() != null && other.getWindowTargetId().equals(this.getWindowTargetId()) == false)
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
        if (other.getReplace() == null ^ this.getReplace() == null)
            return false;
        if (other.getReplace() != null && other.getReplace().equals(this.getReplace()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWindowId() == null) ? 0 : getWindowId().hashCode());
        hashCode = prime * hashCode + ((getWindowTargetId() == null) ? 0 : getWindowTargetId().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode + ((getOwnerInformation() == null) ? 0 : getOwnerInformation().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getReplace() == null) ? 0 : getReplace().hashCode());
        return hashCode;
    }

    @Override
    public UpdateMaintenanceWindowTargetRequest clone() {
        return (UpdateMaintenanceWindowTargetRequest) super.clone();
    }

}
