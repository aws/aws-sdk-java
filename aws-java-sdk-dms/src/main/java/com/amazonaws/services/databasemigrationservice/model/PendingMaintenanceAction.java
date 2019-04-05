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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/PendingMaintenanceAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PendingMaintenanceAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of pending maintenance action that is available for the resource.
     * </p>
     */
    private String action;
    /**
     * <p>
     * The date of the maintenance window when the action will be applied. The maintenance action will be applied to the
     * resource during its first maintenance window after this date. If this date is specified, any
     * <code>next-maintenance</code> opt-in requests are ignored.
     * </p>
     */
    private java.util.Date autoAppliedAfterDate;
    /**
     * <p>
     * The date when the maintenance action will be automatically applied. The maintenance action will be applied to the
     * resource on this date regardless of the maintenance window for the resource. If this date is specified, any
     * <code>immediate</code> opt-in requests are ignored.
     * </p>
     */
    private java.util.Date forcedApplyDate;
    /**
     * <p>
     * Indicates the type of opt-in request that has been received for the resource.
     * </p>
     */
    private String optInStatus;
    /**
     * <p>
     * The effective date when the pending maintenance action will be applied to the resource. This date takes into
     * account opt-in requests received from the <code>ApplyPendingMaintenanceAction</code> API, the
     * <code>AutoAppliedAfterDate</code>, and the <code>ForcedApplyDate</code>. This value is blank if an opt-in request
     * has not been received and nothing has been specified as <code>AutoAppliedAfterDate</code> or
     * <code>ForcedApplyDate</code>.
     * </p>
     */
    private java.util.Date currentApplyDate;
    /**
     * <p>
     * A description providing more detail about the maintenance action.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The type of pending maintenance action that is available for the resource.
     * </p>
     * 
     * @param action
     *        The type of pending maintenance action that is available for the resource.
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The type of pending maintenance action that is available for the resource.
     * </p>
     * 
     * @return The type of pending maintenance action that is available for the resource.
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The type of pending maintenance action that is available for the resource.
     * </p>
     * 
     * @param action
     *        The type of pending maintenance action that is available for the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingMaintenanceAction withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The date of the maintenance window when the action will be applied. The maintenance action will be applied to the
     * resource during its first maintenance window after this date. If this date is specified, any
     * <code>next-maintenance</code> opt-in requests are ignored.
     * </p>
     * 
     * @param autoAppliedAfterDate
     *        The date of the maintenance window when the action will be applied. The maintenance action will be applied
     *        to the resource during its first maintenance window after this date. If this date is specified, any
     *        <code>next-maintenance</code> opt-in requests are ignored.
     */

    public void setAutoAppliedAfterDate(java.util.Date autoAppliedAfterDate) {
        this.autoAppliedAfterDate = autoAppliedAfterDate;
    }

    /**
     * <p>
     * The date of the maintenance window when the action will be applied. The maintenance action will be applied to the
     * resource during its first maintenance window after this date. If this date is specified, any
     * <code>next-maintenance</code> opt-in requests are ignored.
     * </p>
     * 
     * @return The date of the maintenance window when the action will be applied. The maintenance action will be
     *         applied to the resource during its first maintenance window after this date. If this date is specified,
     *         any <code>next-maintenance</code> opt-in requests are ignored.
     */

    public java.util.Date getAutoAppliedAfterDate() {
        return this.autoAppliedAfterDate;
    }

    /**
     * <p>
     * The date of the maintenance window when the action will be applied. The maintenance action will be applied to the
     * resource during its first maintenance window after this date. If this date is specified, any
     * <code>next-maintenance</code> opt-in requests are ignored.
     * </p>
     * 
     * @param autoAppliedAfterDate
     *        The date of the maintenance window when the action will be applied. The maintenance action will be applied
     *        to the resource during its first maintenance window after this date. If this date is specified, any
     *        <code>next-maintenance</code> opt-in requests are ignored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingMaintenanceAction withAutoAppliedAfterDate(java.util.Date autoAppliedAfterDate) {
        setAutoAppliedAfterDate(autoAppliedAfterDate);
        return this;
    }

    /**
     * <p>
     * The date when the maintenance action will be automatically applied. The maintenance action will be applied to the
     * resource on this date regardless of the maintenance window for the resource. If this date is specified, any
     * <code>immediate</code> opt-in requests are ignored.
     * </p>
     * 
     * @param forcedApplyDate
     *        The date when the maintenance action will be automatically applied. The maintenance action will be applied
     *        to the resource on this date regardless of the maintenance window for the resource. If this date is
     *        specified, any <code>immediate</code> opt-in requests are ignored.
     */

    public void setForcedApplyDate(java.util.Date forcedApplyDate) {
        this.forcedApplyDate = forcedApplyDate;
    }

    /**
     * <p>
     * The date when the maintenance action will be automatically applied. The maintenance action will be applied to the
     * resource on this date regardless of the maintenance window for the resource. If this date is specified, any
     * <code>immediate</code> opt-in requests are ignored.
     * </p>
     * 
     * @return The date when the maintenance action will be automatically applied. The maintenance action will be
     *         applied to the resource on this date regardless of the maintenance window for the resource. If this date
     *         is specified, any <code>immediate</code> opt-in requests are ignored.
     */

    public java.util.Date getForcedApplyDate() {
        return this.forcedApplyDate;
    }

    /**
     * <p>
     * The date when the maintenance action will be automatically applied. The maintenance action will be applied to the
     * resource on this date regardless of the maintenance window for the resource. If this date is specified, any
     * <code>immediate</code> opt-in requests are ignored.
     * </p>
     * 
     * @param forcedApplyDate
     *        The date when the maintenance action will be automatically applied. The maintenance action will be applied
     *        to the resource on this date regardless of the maintenance window for the resource. If this date is
     *        specified, any <code>immediate</code> opt-in requests are ignored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingMaintenanceAction withForcedApplyDate(java.util.Date forcedApplyDate) {
        setForcedApplyDate(forcedApplyDate);
        return this;
    }

    /**
     * <p>
     * Indicates the type of opt-in request that has been received for the resource.
     * </p>
     * 
     * @param optInStatus
     *        Indicates the type of opt-in request that has been received for the resource.
     */

    public void setOptInStatus(String optInStatus) {
        this.optInStatus = optInStatus;
    }

    /**
     * <p>
     * Indicates the type of opt-in request that has been received for the resource.
     * </p>
     * 
     * @return Indicates the type of opt-in request that has been received for the resource.
     */

    public String getOptInStatus() {
        return this.optInStatus;
    }

    /**
     * <p>
     * Indicates the type of opt-in request that has been received for the resource.
     * </p>
     * 
     * @param optInStatus
     *        Indicates the type of opt-in request that has been received for the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingMaintenanceAction withOptInStatus(String optInStatus) {
        setOptInStatus(optInStatus);
        return this;
    }

    /**
     * <p>
     * The effective date when the pending maintenance action will be applied to the resource. This date takes into
     * account opt-in requests received from the <code>ApplyPendingMaintenanceAction</code> API, the
     * <code>AutoAppliedAfterDate</code>, and the <code>ForcedApplyDate</code>. This value is blank if an opt-in request
     * has not been received and nothing has been specified as <code>AutoAppliedAfterDate</code> or
     * <code>ForcedApplyDate</code>.
     * </p>
     * 
     * @param currentApplyDate
     *        The effective date when the pending maintenance action will be applied to the resource. This date takes
     *        into account opt-in requests received from the <code>ApplyPendingMaintenanceAction</code> API, the
     *        <code>AutoAppliedAfterDate</code>, and the <code>ForcedApplyDate</code>. This value is blank if an opt-in
     *        request has not been received and nothing has been specified as <code>AutoAppliedAfterDate</code> or
     *        <code>ForcedApplyDate</code>.
     */

    public void setCurrentApplyDate(java.util.Date currentApplyDate) {
        this.currentApplyDate = currentApplyDate;
    }

    /**
     * <p>
     * The effective date when the pending maintenance action will be applied to the resource. This date takes into
     * account opt-in requests received from the <code>ApplyPendingMaintenanceAction</code> API, the
     * <code>AutoAppliedAfterDate</code>, and the <code>ForcedApplyDate</code>. This value is blank if an opt-in request
     * has not been received and nothing has been specified as <code>AutoAppliedAfterDate</code> or
     * <code>ForcedApplyDate</code>.
     * </p>
     * 
     * @return The effective date when the pending maintenance action will be applied to the resource. This date takes
     *         into account opt-in requests received from the <code>ApplyPendingMaintenanceAction</code> API, the
     *         <code>AutoAppliedAfterDate</code>, and the <code>ForcedApplyDate</code>. This value is blank if an opt-in
     *         request has not been received and nothing has been specified as <code>AutoAppliedAfterDate</code> or
     *         <code>ForcedApplyDate</code>.
     */

    public java.util.Date getCurrentApplyDate() {
        return this.currentApplyDate;
    }

    /**
     * <p>
     * The effective date when the pending maintenance action will be applied to the resource. This date takes into
     * account opt-in requests received from the <code>ApplyPendingMaintenanceAction</code> API, the
     * <code>AutoAppliedAfterDate</code>, and the <code>ForcedApplyDate</code>. This value is blank if an opt-in request
     * has not been received and nothing has been specified as <code>AutoAppliedAfterDate</code> or
     * <code>ForcedApplyDate</code>.
     * </p>
     * 
     * @param currentApplyDate
     *        The effective date when the pending maintenance action will be applied to the resource. This date takes
     *        into account opt-in requests received from the <code>ApplyPendingMaintenanceAction</code> API, the
     *        <code>AutoAppliedAfterDate</code>, and the <code>ForcedApplyDate</code>. This value is blank if an opt-in
     *        request has not been received and nothing has been specified as <code>AutoAppliedAfterDate</code> or
     *        <code>ForcedApplyDate</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingMaintenanceAction withCurrentApplyDate(java.util.Date currentApplyDate) {
        setCurrentApplyDate(currentApplyDate);
        return this;
    }

    /**
     * <p>
     * A description providing more detail about the maintenance action.
     * </p>
     * 
     * @param description
     *        A description providing more detail about the maintenance action.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description providing more detail about the maintenance action.
     * </p>
     * 
     * @return A description providing more detail about the maintenance action.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description providing more detail about the maintenance action.
     * </p>
     * 
     * @param description
     *        A description providing more detail about the maintenance action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingMaintenanceAction withDescription(String description) {
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
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getAutoAppliedAfterDate() != null)
            sb.append("AutoAppliedAfterDate: ").append(getAutoAppliedAfterDate()).append(",");
        if (getForcedApplyDate() != null)
            sb.append("ForcedApplyDate: ").append(getForcedApplyDate()).append(",");
        if (getOptInStatus() != null)
            sb.append("OptInStatus: ").append(getOptInStatus()).append(",");
        if (getCurrentApplyDate() != null)
            sb.append("CurrentApplyDate: ").append(getCurrentApplyDate()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PendingMaintenanceAction == false)
            return false;
        PendingMaintenanceAction other = (PendingMaintenanceAction) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getAutoAppliedAfterDate() == null ^ this.getAutoAppliedAfterDate() == null)
            return false;
        if (other.getAutoAppliedAfterDate() != null && other.getAutoAppliedAfterDate().equals(this.getAutoAppliedAfterDate()) == false)
            return false;
        if (other.getForcedApplyDate() == null ^ this.getForcedApplyDate() == null)
            return false;
        if (other.getForcedApplyDate() != null && other.getForcedApplyDate().equals(this.getForcedApplyDate()) == false)
            return false;
        if (other.getOptInStatus() == null ^ this.getOptInStatus() == null)
            return false;
        if (other.getOptInStatus() != null && other.getOptInStatus().equals(this.getOptInStatus()) == false)
            return false;
        if (other.getCurrentApplyDate() == null ^ this.getCurrentApplyDate() == null)
            return false;
        if (other.getCurrentApplyDate() != null && other.getCurrentApplyDate().equals(this.getCurrentApplyDate()) == false)
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

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getAutoAppliedAfterDate() == null) ? 0 : getAutoAppliedAfterDate().hashCode());
        hashCode = prime * hashCode + ((getForcedApplyDate() == null) ? 0 : getForcedApplyDate().hashCode());
        hashCode = prime * hashCode + ((getOptInStatus() == null) ? 0 : getOptInStatus().hashCode());
        hashCode = prime * hashCode + ((getCurrentApplyDate() == null) ? 0 : getCurrentApplyDate().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public PendingMaintenanceAction clone() {
        try {
            return (PendingMaintenanceAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.PendingMaintenanceActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
