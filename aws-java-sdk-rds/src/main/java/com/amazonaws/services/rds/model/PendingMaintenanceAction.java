/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.rds.model;

import java.io.Serializable;

/**
 * <p>
 * Provides information about a pending maintenance action for a
 * resource.
 * </p>
 */
public class PendingMaintenanceAction implements Serializable, Cloneable {

    /**
     * The type of pending maintenance action that is available for the
     * resource.
     */
    private String action;

    /**
     * The date of the maintenance window when the action will be applied.
     * The maintenance action will be applied to the resource during its
     * first maintenance window after this date. If this date is specified,
     * any <code>next-maintenance</code> opt-in requests are ignored.
     */
    private java.util.Date autoAppliedAfterDate;

    /**
     * The date when the maintenance action will be automatically applied.
     * The maintenance action will be applied to the resource on this date
     * regardless of the maintenance window for the resource. If this date is
     * specified, any <code>immediate</code> opt-in requests are ignored.
     */
    private java.util.Date forcedApplyDate;

    /**
     * Indicates the type of opt-in request that has been received for the
     * resource.
     */
    private String optInStatus;

    /**
     * The effective date when the pending maintenance action will be applied
     * to the resource. This date takes into account opt-in requests received
     * from the <a>ApplyPendingMaintenanceAction</a> API, the
     * <code>AutoAppliedAfterDate</code>, and the
     * <code>ForcedApplyDate</code>. This value is blank if an opt-in request
     * has not been received and nothing has been specified as
     * <code>AutoAppliedAfterDate</code> or <code>ForcedApplyDate</code>.
     */
    private java.util.Date currentApplyDate;

    /**
     * A description providing more detail about the maintenance action.
     */
    private String description;

    /**
     * The type of pending maintenance action that is available for the
     * resource.
     *
     * @return The type of pending maintenance action that is available for the
     *         resource.
     */
    public String getAction() {
        return action;
    }
    
    /**
     * The type of pending maintenance action that is available for the
     * resource.
     *
     * @param action The type of pending maintenance action that is available for the
     *         resource.
     */
    public void setAction(String action) {
        this.action = action;
    }
    
    /**
     * The type of pending maintenance action that is available for the
     * resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param action The type of pending maintenance action that is available for the
     *         resource.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PendingMaintenanceAction withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * The date of the maintenance window when the action will be applied.
     * The maintenance action will be applied to the resource during its
     * first maintenance window after this date. If this date is specified,
     * any <code>next-maintenance</code> opt-in requests are ignored.
     *
     * @return The date of the maintenance window when the action will be applied.
     *         The maintenance action will be applied to the resource during its
     *         first maintenance window after this date. If this date is specified,
     *         any <code>next-maintenance</code> opt-in requests are ignored.
     */
    public java.util.Date getAutoAppliedAfterDate() {
        return autoAppliedAfterDate;
    }
    
    /**
     * The date of the maintenance window when the action will be applied.
     * The maintenance action will be applied to the resource during its
     * first maintenance window after this date. If this date is specified,
     * any <code>next-maintenance</code> opt-in requests are ignored.
     *
     * @param autoAppliedAfterDate The date of the maintenance window when the action will be applied.
     *         The maintenance action will be applied to the resource during its
     *         first maintenance window after this date. If this date is specified,
     *         any <code>next-maintenance</code> opt-in requests are ignored.
     */
    public void setAutoAppliedAfterDate(java.util.Date autoAppliedAfterDate) {
        this.autoAppliedAfterDate = autoAppliedAfterDate;
    }
    
    /**
     * The date of the maintenance window when the action will be applied.
     * The maintenance action will be applied to the resource during its
     * first maintenance window after this date. If this date is specified,
     * any <code>next-maintenance</code> opt-in requests are ignored.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoAppliedAfterDate The date of the maintenance window when the action will be applied.
     *         The maintenance action will be applied to the resource during its
     *         first maintenance window after this date. If this date is specified,
     *         any <code>next-maintenance</code> opt-in requests are ignored.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PendingMaintenanceAction withAutoAppliedAfterDate(java.util.Date autoAppliedAfterDate) {
        this.autoAppliedAfterDate = autoAppliedAfterDate;
        return this;
    }

    /**
     * The date when the maintenance action will be automatically applied.
     * The maintenance action will be applied to the resource on this date
     * regardless of the maintenance window for the resource. If this date is
     * specified, any <code>immediate</code> opt-in requests are ignored.
     *
     * @return The date when the maintenance action will be automatically applied.
     *         The maintenance action will be applied to the resource on this date
     *         regardless of the maintenance window for the resource. If this date is
     *         specified, any <code>immediate</code> opt-in requests are ignored.
     */
    public java.util.Date getForcedApplyDate() {
        return forcedApplyDate;
    }
    
    /**
     * The date when the maintenance action will be automatically applied.
     * The maintenance action will be applied to the resource on this date
     * regardless of the maintenance window for the resource. If this date is
     * specified, any <code>immediate</code> opt-in requests are ignored.
     *
     * @param forcedApplyDate The date when the maintenance action will be automatically applied.
     *         The maintenance action will be applied to the resource on this date
     *         regardless of the maintenance window for the resource. If this date is
     *         specified, any <code>immediate</code> opt-in requests are ignored.
     */
    public void setForcedApplyDate(java.util.Date forcedApplyDate) {
        this.forcedApplyDate = forcedApplyDate;
    }
    
    /**
     * The date when the maintenance action will be automatically applied.
     * The maintenance action will be applied to the resource on this date
     * regardless of the maintenance window for the resource. If this date is
     * specified, any <code>immediate</code> opt-in requests are ignored.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param forcedApplyDate The date when the maintenance action will be automatically applied.
     *         The maintenance action will be applied to the resource on this date
     *         regardless of the maintenance window for the resource. If this date is
     *         specified, any <code>immediate</code> opt-in requests are ignored.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PendingMaintenanceAction withForcedApplyDate(java.util.Date forcedApplyDate) {
        this.forcedApplyDate = forcedApplyDate;
        return this;
    }

    /**
     * Indicates the type of opt-in request that has been received for the
     * resource.
     *
     * @return Indicates the type of opt-in request that has been received for the
     *         resource.
     */
    public String getOptInStatus() {
        return optInStatus;
    }
    
    /**
     * Indicates the type of opt-in request that has been received for the
     * resource.
     *
     * @param optInStatus Indicates the type of opt-in request that has been received for the
     *         resource.
     */
    public void setOptInStatus(String optInStatus) {
        this.optInStatus = optInStatus;
    }
    
    /**
     * Indicates the type of opt-in request that has been received for the
     * resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optInStatus Indicates the type of opt-in request that has been received for the
     *         resource.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PendingMaintenanceAction withOptInStatus(String optInStatus) {
        this.optInStatus = optInStatus;
        return this;
    }

    /**
     * The effective date when the pending maintenance action will be applied
     * to the resource. This date takes into account opt-in requests received
     * from the <a>ApplyPendingMaintenanceAction</a> API, the
     * <code>AutoAppliedAfterDate</code>, and the
     * <code>ForcedApplyDate</code>. This value is blank if an opt-in request
     * has not been received and nothing has been specified as
     * <code>AutoAppliedAfterDate</code> or <code>ForcedApplyDate</code>.
     *
     * @return The effective date when the pending maintenance action will be applied
     *         to the resource. This date takes into account opt-in requests received
     *         from the <a>ApplyPendingMaintenanceAction</a> API, the
     *         <code>AutoAppliedAfterDate</code>, and the
     *         <code>ForcedApplyDate</code>. This value is blank if an opt-in request
     *         has not been received and nothing has been specified as
     *         <code>AutoAppliedAfterDate</code> or <code>ForcedApplyDate</code>.
     */
    public java.util.Date getCurrentApplyDate() {
        return currentApplyDate;
    }
    
    /**
     * The effective date when the pending maintenance action will be applied
     * to the resource. This date takes into account opt-in requests received
     * from the <a>ApplyPendingMaintenanceAction</a> API, the
     * <code>AutoAppliedAfterDate</code>, and the
     * <code>ForcedApplyDate</code>. This value is blank if an opt-in request
     * has not been received and nothing has been specified as
     * <code>AutoAppliedAfterDate</code> or <code>ForcedApplyDate</code>.
     *
     * @param currentApplyDate The effective date when the pending maintenance action will be applied
     *         to the resource. This date takes into account opt-in requests received
     *         from the <a>ApplyPendingMaintenanceAction</a> API, the
     *         <code>AutoAppliedAfterDate</code>, and the
     *         <code>ForcedApplyDate</code>. This value is blank if an opt-in request
     *         has not been received and nothing has been specified as
     *         <code>AutoAppliedAfterDate</code> or <code>ForcedApplyDate</code>.
     */
    public void setCurrentApplyDate(java.util.Date currentApplyDate) {
        this.currentApplyDate = currentApplyDate;
    }
    
    /**
     * The effective date when the pending maintenance action will be applied
     * to the resource. This date takes into account opt-in requests received
     * from the <a>ApplyPendingMaintenanceAction</a> API, the
     * <code>AutoAppliedAfterDate</code>, and the
     * <code>ForcedApplyDate</code>. This value is blank if an opt-in request
     * has not been received and nothing has been specified as
     * <code>AutoAppliedAfterDate</code> or <code>ForcedApplyDate</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param currentApplyDate The effective date when the pending maintenance action will be applied
     *         to the resource. This date takes into account opt-in requests received
     *         from the <a>ApplyPendingMaintenanceAction</a> API, the
     *         <code>AutoAppliedAfterDate</code>, and the
     *         <code>ForcedApplyDate</code>. This value is blank if an opt-in request
     *         has not been received and nothing has been specified as
     *         <code>AutoAppliedAfterDate</code> or <code>ForcedApplyDate</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PendingMaintenanceAction withCurrentApplyDate(java.util.Date currentApplyDate) {
        this.currentApplyDate = currentApplyDate;
        return this;
    }

    /**
     * A description providing more detail about the maintenance action.
     *
     * @return A description providing more detail about the maintenance action.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * A description providing more detail about the maintenance action.
     *
     * @param description A description providing more detail about the maintenance action.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * A description providing more detail about the maintenance action.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description A description providing more detail about the maintenance action.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PendingMaintenanceAction withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAction() != null) sb.append("Action: " + getAction() + ",");
        if (getAutoAppliedAfterDate() != null) sb.append("AutoAppliedAfterDate: " + getAutoAppliedAfterDate() + ",");
        if (getForcedApplyDate() != null) sb.append("ForcedApplyDate: " + getForcedApplyDate() + ",");
        if (getOptInStatus() != null) sb.append("OptInStatus: " + getOptInStatus() + ",");
        if (getCurrentApplyDate() != null) sb.append("CurrentApplyDate: " + getCurrentApplyDate() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode()); 
        hashCode = prime * hashCode + ((getAutoAppliedAfterDate() == null) ? 0 : getAutoAppliedAfterDate().hashCode()); 
        hashCode = prime * hashCode + ((getForcedApplyDate() == null) ? 0 : getForcedApplyDate().hashCode()); 
        hashCode = prime * hashCode + ((getOptInStatus() == null) ? 0 : getOptInStatus().hashCode()); 
        hashCode = prime * hashCode + ((getCurrentApplyDate() == null) ? 0 : getCurrentApplyDate().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PendingMaintenanceAction == false) return false;
        PendingMaintenanceAction other = (PendingMaintenanceAction)obj;
        
        if (other.getAction() == null ^ this.getAction() == null) return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false) return false; 
        if (other.getAutoAppliedAfterDate() == null ^ this.getAutoAppliedAfterDate() == null) return false;
        if (other.getAutoAppliedAfterDate() != null && other.getAutoAppliedAfterDate().equals(this.getAutoAppliedAfterDate()) == false) return false; 
        if (other.getForcedApplyDate() == null ^ this.getForcedApplyDate() == null) return false;
        if (other.getForcedApplyDate() != null && other.getForcedApplyDate().equals(this.getForcedApplyDate()) == false) return false; 
        if (other.getOptInStatus() == null ^ this.getOptInStatus() == null) return false;
        if (other.getOptInStatus() != null && other.getOptInStatus().equals(this.getOptInStatus()) == false) return false; 
        if (other.getCurrentApplyDate() == null ^ this.getCurrentApplyDate() == null) return false;
        if (other.getCurrentApplyDate() != null && other.getCurrentApplyDate().equals(this.getCurrentApplyDate()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        return true;
    }
    
    @Override
    public PendingMaintenanceAction clone() {
        try {
            return (PendingMaintenanceAction) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    