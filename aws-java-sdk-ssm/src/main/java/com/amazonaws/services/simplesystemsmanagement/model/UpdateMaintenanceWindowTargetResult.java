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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateMaintenanceWindowTarget" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateMaintenanceWindowTargetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The Maintenance Window ID specified in the update request.
     * </p>
     */
    private String windowId;
    /**
     * <p>
     * The target ID specified in the update request.
     * </p>
     */
    private String windowTargetId;
    /**
     * <p>
     * The updated targets.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Target> targets;
    /**
     * <p>
     * The updated owner.
     * </p>
     */
    private String ownerInformation;
    /**
     * <p>
     * The updated name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The updated description.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The Maintenance Window ID specified in the update request.
     * </p>
     * 
     * @param windowId
     *        The Maintenance Window ID specified in the update request.
     */

    public void setWindowId(String windowId) {
        this.windowId = windowId;
    }

    /**
     * <p>
     * The Maintenance Window ID specified in the update request.
     * </p>
     * 
     * @return The Maintenance Window ID specified in the update request.
     */

    public String getWindowId() {
        return this.windowId;
    }

    /**
     * <p>
     * The Maintenance Window ID specified in the update request.
     * </p>
     * 
     * @param windowId
     *        The Maintenance Window ID specified in the update request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowTargetResult withWindowId(String windowId) {
        setWindowId(windowId);
        return this;
    }

    /**
     * <p>
     * The target ID specified in the update request.
     * </p>
     * 
     * @param windowTargetId
     *        The target ID specified in the update request.
     */

    public void setWindowTargetId(String windowTargetId) {
        this.windowTargetId = windowTargetId;
    }

    /**
     * <p>
     * The target ID specified in the update request.
     * </p>
     * 
     * @return The target ID specified in the update request.
     */

    public String getWindowTargetId() {
        return this.windowTargetId;
    }

    /**
     * <p>
     * The target ID specified in the update request.
     * </p>
     * 
     * @param windowTargetId
     *        The target ID specified in the update request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowTargetResult withWindowTargetId(String windowTargetId) {
        setWindowTargetId(windowTargetId);
        return this;
    }

    /**
     * <p>
     * The updated targets.
     * </p>
     * 
     * @return The updated targets.
     */

    public java.util.List<Target> getTargets() {
        if (targets == null) {
            targets = new com.amazonaws.internal.SdkInternalList<Target>();
        }
        return targets;
    }

    /**
     * <p>
     * The updated targets.
     * </p>
     * 
     * @param targets
     *        The updated targets.
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
     * The updated targets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargets(java.util.Collection)} or {@link #withTargets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param targets
     *        The updated targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowTargetResult withTargets(Target... targets) {
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
     * The updated targets.
     * </p>
     * 
     * @param targets
     *        The updated targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowTargetResult withTargets(java.util.Collection<Target> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * <p>
     * The updated owner.
     * </p>
     * 
     * @param ownerInformation
     *        The updated owner.
     */

    public void setOwnerInformation(String ownerInformation) {
        this.ownerInformation = ownerInformation;
    }

    /**
     * <p>
     * The updated owner.
     * </p>
     * 
     * @return The updated owner.
     */

    public String getOwnerInformation() {
        return this.ownerInformation;
    }

    /**
     * <p>
     * The updated owner.
     * </p>
     * 
     * @param ownerInformation
     *        The updated owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowTargetResult withOwnerInformation(String ownerInformation) {
        setOwnerInformation(ownerInformation);
        return this;
    }

    /**
     * <p>
     * The updated name.
     * </p>
     * 
     * @param name
     *        The updated name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The updated name.
     * </p>
     * 
     * @return The updated name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The updated name.
     * </p>
     * 
     * @param name
     *        The updated name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowTargetResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The updated description.
     * </p>
     * 
     * @param description
     *        The updated description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The updated description.
     * </p>
     * 
     * @return The updated description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The updated description.
     * </p>
     * 
     * @param description
     *        The updated description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowTargetResult withDescription(String description) {
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

        if (obj instanceof UpdateMaintenanceWindowTargetResult == false)
            return false;
        UpdateMaintenanceWindowTargetResult other = (UpdateMaintenanceWindowTargetResult) obj;
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
        return hashCode;
    }

    @Override
    public UpdateMaintenanceWindowTargetResult clone() {
        try {
            return (UpdateMaintenanceWindowTargetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
