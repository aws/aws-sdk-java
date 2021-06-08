/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the Auto-Tune options: the Auto-Tune desired state for the domain, rollback state when disabling Auto-Tune
 * options and list of maintenance schedules.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoTuneOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the Auto-Tune desired state. Valid values are ENABLED, DISABLED.
     * </p>
     */
    private String desiredState;
    /**
     * <p>
     * Specifies the rollback state while disabling Auto-Tune for the domain. Valid values are NO_ROLLBACK,
     * DEFAULT_ROLLBACK.
     * </p>
     */
    private String rollbackOnDisable;
    /**
     * <p>
     * Specifies list of maitenance schedules. See the <a
     * href="https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/auto-tune.html"
     * target="_blank">Developer Guide</a> for more information.
     * </p>
     */
    private java.util.List<AutoTuneMaintenanceSchedule> maintenanceSchedules;

    /**
     * <p>
     * Specifies the Auto-Tune desired state. Valid values are ENABLED, DISABLED.
     * </p>
     * 
     * @param desiredState
     *        Specifies the Auto-Tune desired state. Valid values are ENABLED, DISABLED.
     * @see AutoTuneDesiredState
     */

    public void setDesiredState(String desiredState) {
        this.desiredState = desiredState;
    }

    /**
     * <p>
     * Specifies the Auto-Tune desired state. Valid values are ENABLED, DISABLED.
     * </p>
     * 
     * @return Specifies the Auto-Tune desired state. Valid values are ENABLED, DISABLED.
     * @see AutoTuneDesiredState
     */

    public String getDesiredState() {
        return this.desiredState;
    }

    /**
     * <p>
     * Specifies the Auto-Tune desired state. Valid values are ENABLED, DISABLED.
     * </p>
     * 
     * @param desiredState
     *        Specifies the Auto-Tune desired state. Valid values are ENABLED, DISABLED.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoTuneDesiredState
     */

    public AutoTuneOptions withDesiredState(String desiredState) {
        setDesiredState(desiredState);
        return this;
    }

    /**
     * <p>
     * Specifies the Auto-Tune desired state. Valid values are ENABLED, DISABLED.
     * </p>
     * 
     * @param desiredState
     *        Specifies the Auto-Tune desired state. Valid values are ENABLED, DISABLED.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoTuneDesiredState
     */

    public AutoTuneOptions withDesiredState(AutoTuneDesiredState desiredState) {
        this.desiredState = desiredState.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the rollback state while disabling Auto-Tune for the domain. Valid values are NO_ROLLBACK,
     * DEFAULT_ROLLBACK.
     * </p>
     * 
     * @param rollbackOnDisable
     *        Specifies the rollback state while disabling Auto-Tune for the domain. Valid values are NO_ROLLBACK,
     *        DEFAULT_ROLLBACK.
     * @see RollbackOnDisable
     */

    public void setRollbackOnDisable(String rollbackOnDisable) {
        this.rollbackOnDisable = rollbackOnDisable;
    }

    /**
     * <p>
     * Specifies the rollback state while disabling Auto-Tune for the domain. Valid values are NO_ROLLBACK,
     * DEFAULT_ROLLBACK.
     * </p>
     * 
     * @return Specifies the rollback state while disabling Auto-Tune for the domain. Valid values are NO_ROLLBACK,
     *         DEFAULT_ROLLBACK.
     * @see RollbackOnDisable
     */

    public String getRollbackOnDisable() {
        return this.rollbackOnDisable;
    }

    /**
     * <p>
     * Specifies the rollback state while disabling Auto-Tune for the domain. Valid values are NO_ROLLBACK,
     * DEFAULT_ROLLBACK.
     * </p>
     * 
     * @param rollbackOnDisable
     *        Specifies the rollback state while disabling Auto-Tune for the domain. Valid values are NO_ROLLBACK,
     *        DEFAULT_ROLLBACK.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RollbackOnDisable
     */

    public AutoTuneOptions withRollbackOnDisable(String rollbackOnDisable) {
        setRollbackOnDisable(rollbackOnDisable);
        return this;
    }

    /**
     * <p>
     * Specifies the rollback state while disabling Auto-Tune for the domain. Valid values are NO_ROLLBACK,
     * DEFAULT_ROLLBACK.
     * </p>
     * 
     * @param rollbackOnDisable
     *        Specifies the rollback state while disabling Auto-Tune for the domain. Valid values are NO_ROLLBACK,
     *        DEFAULT_ROLLBACK.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RollbackOnDisable
     */

    public AutoTuneOptions withRollbackOnDisable(RollbackOnDisable rollbackOnDisable) {
        this.rollbackOnDisable = rollbackOnDisable.toString();
        return this;
    }

    /**
     * <p>
     * Specifies list of maitenance schedules. See the <a
     * href="https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/auto-tune.html"
     * target="_blank">Developer Guide</a> for more information.
     * </p>
     * 
     * @return Specifies list of maitenance schedules. See the <a
     *         href="https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/auto-tune.html"
     *         target="_blank">Developer Guide</a> for more information.
     */

    public java.util.List<AutoTuneMaintenanceSchedule> getMaintenanceSchedules() {
        return maintenanceSchedules;
    }

    /**
     * <p>
     * Specifies list of maitenance schedules. See the <a
     * href="https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/auto-tune.html"
     * target="_blank">Developer Guide</a> for more information.
     * </p>
     * 
     * @param maintenanceSchedules
     *        Specifies list of maitenance schedules. See the <a
     *        href="https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/auto-tune.html"
     *        target="_blank">Developer Guide</a> for more information.
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
     * Specifies list of maitenance schedules. See the <a
     * href="https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/auto-tune.html"
     * target="_blank">Developer Guide</a> for more information.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMaintenanceSchedules(java.util.Collection)} or {@link #withMaintenanceSchedules(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param maintenanceSchedules
     *        Specifies list of maitenance schedules. See the <a
     *        href="https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/auto-tune.html"
     *        target="_blank">Developer Guide</a> for more information.
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
     * Specifies list of maitenance schedules. See the <a
     * href="https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/auto-tune.html"
     * target="_blank">Developer Guide</a> for more information.
     * </p>
     * 
     * @param maintenanceSchedules
     *        Specifies list of maitenance schedules. See the <a
     *        href="https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/auto-tune.html"
     *        target="_blank">Developer Guide</a> for more information.
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
        com.amazonaws.services.elasticsearch.model.transform.AutoTuneOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
