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
package com.amazonaws.services.mainframemodernization.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The scheduled maintenance for a runtime engine.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/PendingMaintenance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PendingMaintenance implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The specific runtime engine that the maintenance schedule applies to.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The maintenance schedule for the runtime engine version.
     * </p>
     */
    private MaintenanceSchedule schedule;

    /**
     * <p>
     * The specific runtime engine that the maintenance schedule applies to.
     * </p>
     * 
     * @param engineVersion
     *        The specific runtime engine that the maintenance schedule applies to.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The specific runtime engine that the maintenance schedule applies to.
     * </p>
     * 
     * @return The specific runtime engine that the maintenance schedule applies to.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The specific runtime engine that the maintenance schedule applies to.
     * </p>
     * 
     * @param engineVersion
     *        The specific runtime engine that the maintenance schedule applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingMaintenance withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The maintenance schedule for the runtime engine version.
     * </p>
     * 
     * @param schedule
     *        The maintenance schedule for the runtime engine version.
     */

    public void setSchedule(MaintenanceSchedule schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * The maintenance schedule for the runtime engine version.
     * </p>
     * 
     * @return The maintenance schedule for the runtime engine version.
     */

    public MaintenanceSchedule getSchedule() {
        return this.schedule;
    }

    /**
     * <p>
     * The maintenance schedule for the runtime engine version.
     * </p>
     * 
     * @param schedule
     *        The maintenance schedule for the runtime engine version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingMaintenance withSchedule(MaintenanceSchedule schedule) {
        setSchedule(schedule);
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
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getSchedule() != null)
            sb.append("Schedule: ").append(getSchedule());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PendingMaintenance == false)
            return false;
        PendingMaintenance other = (PendingMaintenance) obj;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        return hashCode;
    }

    @Override
    public PendingMaintenance clone() {
        try {
            return (PendingMaintenance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mainframemodernization.model.transform.PendingMaintenanceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
