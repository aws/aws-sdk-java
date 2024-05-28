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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Details for Site-to-Site VPN tunnel endpoint maintenance events.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/MaintenanceDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MaintenanceDetails implements Serializable, Cloneable {

    /**
     * <p>
     * Verify existence of a pending maintenance.
     * </p>
     */
    private String pendingMaintenance;
    /**
     * <p>
     * The timestamp after which Amazon Web Services will automatically apply maintenance.
     * </p>
     */
    private java.util.Date maintenanceAutoAppliedAfter;
    /**
     * <p>
     * Timestamp of last applied maintenance.
     * </p>
     */
    private java.util.Date lastMaintenanceApplied;

    /**
     * <p>
     * Verify existence of a pending maintenance.
     * </p>
     * 
     * @param pendingMaintenance
     *        Verify existence of a pending maintenance.
     */

    public void setPendingMaintenance(String pendingMaintenance) {
        this.pendingMaintenance = pendingMaintenance;
    }

    /**
     * <p>
     * Verify existence of a pending maintenance.
     * </p>
     * 
     * @return Verify existence of a pending maintenance.
     */

    public String getPendingMaintenance() {
        return this.pendingMaintenance;
    }

    /**
     * <p>
     * Verify existence of a pending maintenance.
     * </p>
     * 
     * @param pendingMaintenance
     *        Verify existence of a pending maintenance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceDetails withPendingMaintenance(String pendingMaintenance) {
        setPendingMaintenance(pendingMaintenance);
        return this;
    }

    /**
     * <p>
     * The timestamp after which Amazon Web Services will automatically apply maintenance.
     * </p>
     * 
     * @param maintenanceAutoAppliedAfter
     *        The timestamp after which Amazon Web Services will automatically apply maintenance.
     */

    public void setMaintenanceAutoAppliedAfter(java.util.Date maintenanceAutoAppliedAfter) {
        this.maintenanceAutoAppliedAfter = maintenanceAutoAppliedAfter;
    }

    /**
     * <p>
     * The timestamp after which Amazon Web Services will automatically apply maintenance.
     * </p>
     * 
     * @return The timestamp after which Amazon Web Services will automatically apply maintenance.
     */

    public java.util.Date getMaintenanceAutoAppliedAfter() {
        return this.maintenanceAutoAppliedAfter;
    }

    /**
     * <p>
     * The timestamp after which Amazon Web Services will automatically apply maintenance.
     * </p>
     * 
     * @param maintenanceAutoAppliedAfter
     *        The timestamp after which Amazon Web Services will automatically apply maintenance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceDetails withMaintenanceAutoAppliedAfter(java.util.Date maintenanceAutoAppliedAfter) {
        setMaintenanceAutoAppliedAfter(maintenanceAutoAppliedAfter);
        return this;
    }

    /**
     * <p>
     * Timestamp of last applied maintenance.
     * </p>
     * 
     * @param lastMaintenanceApplied
     *        Timestamp of last applied maintenance.
     */

    public void setLastMaintenanceApplied(java.util.Date lastMaintenanceApplied) {
        this.lastMaintenanceApplied = lastMaintenanceApplied;
    }

    /**
     * <p>
     * Timestamp of last applied maintenance.
     * </p>
     * 
     * @return Timestamp of last applied maintenance.
     */

    public java.util.Date getLastMaintenanceApplied() {
        return this.lastMaintenanceApplied;
    }

    /**
     * <p>
     * Timestamp of last applied maintenance.
     * </p>
     * 
     * @param lastMaintenanceApplied
     *        Timestamp of last applied maintenance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceDetails withLastMaintenanceApplied(java.util.Date lastMaintenanceApplied) {
        setLastMaintenanceApplied(lastMaintenanceApplied);
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
        if (getPendingMaintenance() != null)
            sb.append("PendingMaintenance: ").append(getPendingMaintenance()).append(",");
        if (getMaintenanceAutoAppliedAfter() != null)
            sb.append("MaintenanceAutoAppliedAfter: ").append(getMaintenanceAutoAppliedAfter()).append(",");
        if (getLastMaintenanceApplied() != null)
            sb.append("LastMaintenanceApplied: ").append(getLastMaintenanceApplied());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MaintenanceDetails == false)
            return false;
        MaintenanceDetails other = (MaintenanceDetails) obj;
        if (other.getPendingMaintenance() == null ^ this.getPendingMaintenance() == null)
            return false;
        if (other.getPendingMaintenance() != null && other.getPendingMaintenance().equals(this.getPendingMaintenance()) == false)
            return false;
        if (other.getMaintenanceAutoAppliedAfter() == null ^ this.getMaintenanceAutoAppliedAfter() == null)
            return false;
        if (other.getMaintenanceAutoAppliedAfter() != null && other.getMaintenanceAutoAppliedAfter().equals(this.getMaintenanceAutoAppliedAfter()) == false)
            return false;
        if (other.getLastMaintenanceApplied() == null ^ this.getLastMaintenanceApplied() == null)
            return false;
        if (other.getLastMaintenanceApplied() != null && other.getLastMaintenanceApplied().equals(this.getLastMaintenanceApplied()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPendingMaintenance() == null) ? 0 : getPendingMaintenance().hashCode());
        hashCode = prime * hashCode + ((getMaintenanceAutoAppliedAfter() == null) ? 0 : getMaintenanceAutoAppliedAfter().hashCode());
        hashCode = prime * hashCode + ((getLastMaintenanceApplied() == null) ? 0 : getLastMaintenanceApplied().hashCode());
        return hashCode;
    }

    @Override
    public MaintenanceDetails clone() {
        try {
            return (MaintenanceDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
