/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Auto-Tune settings when updating a domain. For more information, see <a
 * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/auto-tune.html">Auto-Tune for Amazon
 * OpenSearch Service</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoTuneOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Whether Auto-Tune is enabled or disabled.
     * </p>
     */
    private String desiredState;
    /**
     * <p>
     * When disabling Auto-Tune, specify <code>NO_ROLLBACK</code> to retain all prior Auto-Tune settings or
     * <code>DEFAULT_ROLLBACK</code> to revert to the OpenSearch Service defaults. If you specify
     * <code>DEFAULT_ROLLBACK</code>, you must include a <code>MaintenanceSchedule</code> in the request. Otherwise,
     * OpenSearch Service is unable to perform the rollback.
     * </p>
     */
    private String rollbackOnDisable;
    /**
     * <p>
     * A list of maintenance schedules during which Auto-Tune can deploy changes.
     * </p>
     */
    private java.util.List<AutoTuneMaintenanceSchedule> maintenanceSchedules;

    /**
     * <p>
     * Whether Auto-Tune is enabled or disabled.
     * </p>
     * 
     * @param desiredState
     *        Whether Auto-Tune is enabled or disabled.
     * @see AutoTuneDesiredState
     */

    public void setDesiredState(String desiredState) {
        this.desiredState = desiredState;
    }

    /**
     * <p>
     * Whether Auto-Tune is enabled or disabled.
     * </p>
     * 
     * @return Whether Auto-Tune is enabled or disabled.
     * @see AutoTuneDesiredState
     */

    public String getDesiredState() {
        return this.desiredState;
    }

    /**
     * <p>
     * Whether Auto-Tune is enabled or disabled.
     * </p>
     * 
     * @param desiredState
     *        Whether Auto-Tune is enabled or disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoTuneDesiredState
     */

    public AutoTuneOptions withDesiredState(String desiredState) {
        setDesiredState(desiredState);
        return this;
    }

    /**
     * <p>
     * Whether Auto-Tune is enabled or disabled.
     * </p>
     * 
     * @param desiredState
     *        Whether Auto-Tune is enabled or disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoTuneDesiredState
     */

    public AutoTuneOptions withDesiredState(AutoTuneDesiredState desiredState) {
        this.desiredState = desiredState.toString();
        return this;
    }

    /**
     * <p>
     * When disabling Auto-Tune, specify <code>NO_ROLLBACK</code> to retain all prior Auto-Tune settings or
     * <code>DEFAULT_ROLLBACK</code> to revert to the OpenSearch Service defaults. If you specify
     * <code>DEFAULT_ROLLBACK</code>, you must include a <code>MaintenanceSchedule</code> in the request. Otherwise,
     * OpenSearch Service is unable to perform the rollback.
     * </p>
     * 
     * @param rollbackOnDisable
     *        When disabling Auto-Tune, specify <code>NO_ROLLBACK</code> to retain all prior Auto-Tune settings or
     *        <code>DEFAULT_ROLLBACK</code> to revert to the OpenSearch Service defaults. If you specify
     *        <code>DEFAULT_ROLLBACK</code>, you must include a <code>MaintenanceSchedule</code> in the request.
     *        Otherwise, OpenSearch Service is unable to perform the rollback.
     * @see RollbackOnDisable
     */

    public void setRollbackOnDisable(String rollbackOnDisable) {
        this.rollbackOnDisable = rollbackOnDisable;
    }

    /**
     * <p>
     * When disabling Auto-Tune, specify <code>NO_ROLLBACK</code> to retain all prior Auto-Tune settings or
     * <code>DEFAULT_ROLLBACK</code> to revert to the OpenSearch Service defaults. If you specify
     * <code>DEFAULT_ROLLBACK</code>, you must include a <code>MaintenanceSchedule</code> in the request. Otherwise,
     * OpenSearch Service is unable to perform the rollback.
     * </p>
     * 
     * @return When disabling Auto-Tune, specify <code>NO_ROLLBACK</code> to retain all prior Auto-Tune settings or
     *         <code>DEFAULT_ROLLBACK</code> to revert to the OpenSearch Service defaults. If you specify
     *         <code>DEFAULT_ROLLBACK</code>, you must include a <code>MaintenanceSchedule</code> in the request.
     *         Otherwise, OpenSearch Service is unable to perform the rollback.
     * @see RollbackOnDisable
     */

    public String getRollbackOnDisable() {
        return this.rollbackOnDisable;
    }

    /**
     * <p>
     * When disabling Auto-Tune, specify <code>NO_ROLLBACK</code> to retain all prior Auto-Tune settings or
     * <code>DEFAULT_ROLLBACK</code> to revert to the OpenSearch Service defaults. If you specify
     * <code>DEFAULT_ROLLBACK</code>, you must include a <code>MaintenanceSchedule</code> in the request. Otherwise,
     * OpenSearch Service is unable to perform the rollback.
     * </p>
     * 
     * @param rollbackOnDisable
     *        When disabling Auto-Tune, specify <code>NO_ROLLBACK</code> to retain all prior Auto-Tune settings or
     *        <code>DEFAULT_ROLLBACK</code> to revert to the OpenSearch Service defaults. If you specify
     *        <code>DEFAULT_ROLLBACK</code>, you must include a <code>MaintenanceSchedule</code> in the request.
     *        Otherwise, OpenSearch Service is unable to perform the rollback.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RollbackOnDisable
     */

    public AutoTuneOptions withRollbackOnDisable(String rollbackOnDisable) {
        setRollbackOnDisable(rollbackOnDisable);
        return this;
    }

    /**
     * <p>
     * When disabling Auto-Tune, specify <code>NO_ROLLBACK</code> to retain all prior Auto-Tune settings or
     * <code>DEFAULT_ROLLBACK</code> to revert to the OpenSearch Service defaults. If you specify
     * <code>DEFAULT_ROLLBACK</code>, you must include a <code>MaintenanceSchedule</code> in the request. Otherwise,
     * OpenSearch Service is unable to perform the rollback.
     * </p>
     * 
     * @param rollbackOnDisable
     *        When disabling Auto-Tune, specify <code>NO_ROLLBACK</code> to retain all prior Auto-Tune settings or
     *        <code>DEFAULT_ROLLBACK</code> to revert to the OpenSearch Service defaults. If you specify
     *        <code>DEFAULT_ROLLBACK</code>, you must include a <code>MaintenanceSchedule</code> in the request.
     *        Otherwise, OpenSearch Service is unable to perform the rollback.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RollbackOnDisable
     */

    public AutoTuneOptions withRollbackOnDisable(RollbackOnDisable rollbackOnDisable) {
        this.rollbackOnDisable = rollbackOnDisable.toString();
        return this;
    }

    /**
     * <p>
     * A list of maintenance schedules during which Auto-Tune can deploy changes.
     * </p>
     * 
     * @return A list of maintenance schedules during which Auto-Tune can deploy changes.
     */

    public java.util.List<AutoTuneMaintenanceSchedule> getMaintenanceSchedules() {
        return maintenanceSchedules;
    }

    /**
     * <p>
     * A list of maintenance schedules during which Auto-Tune can deploy changes.
     * </p>
     * 
     * @param maintenanceSchedules
     *        A list of maintenance schedules during which Auto-Tune can deploy changes.
     */

    public void setMaintenanceSchedules(java.util.Collection<AutoTuneMaintenanceSchedule> maintenanceSchedules) {
        if (maintenanceSchedules == null) {
            this.maintenanceSchedules = null;
            return;
        }

        this.maintenanceSchedules = new java.util.ArrayList<AutoTuneMaintenanceSchedule>(maintenanceSchedules);
    }

    /**
     * <p>
     * A list of maintenance schedules during which Auto-Tune can deploy changes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMaintenanceSchedules(java.util.Collection)} or {@link #withMaintenanceSchedules(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param maintenanceSchedules
     *        A list of maintenance schedules during which Auto-Tune can deploy changes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoTuneOptions withMaintenanceSchedules(AutoTuneMaintenanceSchedule... maintenanceSchedules) {
        if (this.maintenanceSchedules == null) {
            setMaintenanceSchedules(new java.util.ArrayList<AutoTuneMaintenanceSchedule>(maintenanceSchedules.length));
        }
        for (AutoTuneMaintenanceSchedule ele : maintenanceSchedules) {
            this.maintenanceSchedules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of maintenance schedules during which Auto-Tune can deploy changes.
     * </p>
     * 
     * @param maintenanceSchedules
     *        A list of maintenance schedules during which Auto-Tune can deploy changes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoTuneOptions withMaintenanceSchedules(java.util.Collection<AutoTuneMaintenanceSchedule> maintenanceSchedules) {
        setMaintenanceSchedules(maintenanceSchedules);
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
        if (getDesiredState() != null)
            sb.append("DesiredState: ").append(getDesiredState()).append(",");
        if (getRollbackOnDisable() != null)
            sb.append("RollbackOnDisable: ").append(getRollbackOnDisable()).append(",");
        if (getMaintenanceSchedules() != null)
            sb.append("MaintenanceSchedules: ").append(getMaintenanceSchedules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoTuneOptions == false)
            return false;
        AutoTuneOptions other = (AutoTuneOptions) obj;
        if (other.getDesiredState() == null ^ this.getDesiredState() == null)
            return false;
        if (other.getDesiredState() != null && other.getDesiredState().equals(this.getDesiredState()) == false)
            return false;
        if (other.getRollbackOnDisable() == null ^ this.getRollbackOnDisable() == null)
            return false;
        if (other.getRollbackOnDisable() != null && other.getRollbackOnDisable().equals(this.getRollbackOnDisable()) == false)
            return false;
        if (other.getMaintenanceSchedules() == null ^ this.getMaintenanceSchedules() == null)
            return false;
        if (other.getMaintenanceSchedules() != null && other.getMaintenanceSchedules().equals(this.getMaintenanceSchedules()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDesiredState() == null) ? 0 : getDesiredState().hashCode());
        hashCode = prime * hashCode + ((getRollbackOnDisable() == null) ? 0 : getRollbackOnDisable().hashCode());
        hashCode = prime * hashCode + ((getMaintenanceSchedules() == null) ? 0 : getMaintenanceSchedules().hashCode());
        return hashCode;
    }

    @Override
    public AutoTuneOptions clone() {
        try {
            return (AutoTuneOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearch.model.transform.AutoTuneOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
