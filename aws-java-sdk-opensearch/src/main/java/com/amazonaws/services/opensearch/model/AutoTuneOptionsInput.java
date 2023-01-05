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
 * Options for configuring Auto-Tune. For more information, see <a
 * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/auto-tune.html">Auto-Tune for Amazon
 * OpenSearch Service</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoTuneOptionsInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Whether Auto-Tune is enabled or disabled.
     * </p>
     */
    private String desiredState;
    /**
     * <p>
     * A list of maintenance schedules during which Auto-Tune can deploy changes. Maintenance schedules are overwrite,
     * not append. If your request includes no schedules, the request deletes all existing schedules. To preserve
     * existing schedules, make a call to <code>DescribeDomainConfig</code> first and use the
     * <code>MaintenanceSchedules</code> portion of the response as the basis for this section.
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

    public AutoTuneOptionsInput withDesiredState(String desiredState) {
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

    public AutoTuneOptionsInput withDesiredState(AutoTuneDesiredState desiredState) {
        this.desiredState = desiredState.toString();
        return this;
    }

    /**
     * <p>
     * A list of maintenance schedules during which Auto-Tune can deploy changes. Maintenance schedules are overwrite,
     * not append. If your request includes no schedules, the request deletes all existing schedules. To preserve
     * existing schedules, make a call to <code>DescribeDomainConfig</code> first and use the
     * <code>MaintenanceSchedules</code> portion of the response as the basis for this section.
     * </p>
     * 
     * @return A list of maintenance schedules during which Auto-Tune can deploy changes. Maintenance schedules are
     *         overwrite, not append. If your request includes no schedules, the request deletes all existing schedules.
     *         To preserve existing schedules, make a call to <code>DescribeDomainConfig</code> first and use the
     *         <code>MaintenanceSchedules</code> portion of the response as the basis for this section.
     */

    public java.util.List<AutoTuneMaintenanceSchedule> getMaintenanceSchedules() {
        return maintenanceSchedules;
    }

    /**
     * <p>
     * A list of maintenance schedules during which Auto-Tune can deploy changes. Maintenance schedules are overwrite,
     * not append. If your request includes no schedules, the request deletes all existing schedules. To preserve
     * existing schedules, make a call to <code>DescribeDomainConfig</code> first and use the
     * <code>MaintenanceSchedules</code> portion of the response as the basis for this section.
     * </p>
     * 
     * @param maintenanceSchedules
     *        A list of maintenance schedules during which Auto-Tune can deploy changes. Maintenance schedules are
     *        overwrite, not append. If your request includes no schedules, the request deletes all existing schedules.
     *        To preserve existing schedules, make a call to <code>DescribeDomainConfig</code> first and use the
     *        <code>MaintenanceSchedules</code> portion of the response as the basis for this section.
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
     * A list of maintenance schedules during which Auto-Tune can deploy changes. Maintenance schedules are overwrite,
     * not append. If your request includes no schedules, the request deletes all existing schedules. To preserve
     * existing schedules, make a call to <code>DescribeDomainConfig</code> first and use the
     * <code>MaintenanceSchedules</code> portion of the response as the basis for this section.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMaintenanceSchedules(java.util.Collection)} or {@link #withMaintenanceSchedules(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param maintenanceSchedules
     *        A list of maintenance schedules during which Auto-Tune can deploy changes. Maintenance schedules are
     *        overwrite, not append. If your request includes no schedules, the request deletes all existing schedules.
     *        To preserve existing schedules, make a call to <code>DescribeDomainConfig</code> first and use the
     *        <code>MaintenanceSchedules</code> portion of the response as the basis for this section.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoTuneOptionsInput withMaintenanceSchedules(AutoTuneMaintenanceSchedule... maintenanceSchedules) {
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
     * A list of maintenance schedules during which Auto-Tune can deploy changes. Maintenance schedules are overwrite,
     * not append. If your request includes no schedules, the request deletes all existing schedules. To preserve
     * existing schedules, make a call to <code>DescribeDomainConfig</code> first and use the
     * <code>MaintenanceSchedules</code> portion of the response as the basis for this section.
     * </p>
     * 
     * @param maintenanceSchedules
     *        A list of maintenance schedules during which Auto-Tune can deploy changes. Maintenance schedules are
     *        overwrite, not append. If your request includes no schedules, the request deletes all existing schedules.
     *        To preserve existing schedules, make a call to <code>DescribeDomainConfig</code> first and use the
     *        <code>MaintenanceSchedules</code> portion of the response as the basis for this section.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoTuneOptionsInput withMaintenanceSchedules(java.util.Collection<AutoTuneMaintenanceSchedule> maintenanceSchedules) {
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

        if (obj instanceof AutoTuneOptionsInput == false)
            return false;
        AutoTuneOptionsInput other = (AutoTuneOptionsInput) obj;
        if (other.getDesiredState() == null ^ this.getDesiredState() == null)
            return false;
        if (other.getDesiredState() != null && other.getDesiredState().equals(this.getDesiredState()) == false)
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
        hashCode = prime * hashCode + ((getMaintenanceSchedules() == null) ? 0 : getMaintenanceSchedules().hashCode());
        return hashCode;
    }

    @Override
    public AutoTuneOptionsInput clone() {
        try {
            return (AutoTuneOptionsInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearch.model.transform.AutoTuneOptionsInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
