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
package com.amazonaws.services.kinesisanalyticsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of the maintenance configuration for the application.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/ApplicationMaintenanceConfigurationDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationMaintenanceConfigurationDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The start time for the maintenance window.
     * </p>
     */
    private String applicationMaintenanceWindowStartTime;
    /**
     * <p>
     * The end time for the maintenance window.
     * </p>
     */
    private String applicationMaintenanceWindowEndTime;

    /**
     * <p>
     * The start time for the maintenance window.
     * </p>
     * 
     * @param applicationMaintenanceWindowStartTime
     *        The start time for the maintenance window.
     */

    public void setApplicationMaintenanceWindowStartTime(String applicationMaintenanceWindowStartTime) {
        this.applicationMaintenanceWindowStartTime = applicationMaintenanceWindowStartTime;
    }

    /**
     * <p>
     * The start time for the maintenance window.
     * </p>
     * 
     * @return The start time for the maintenance window.
     */

    public String getApplicationMaintenanceWindowStartTime() {
        return this.applicationMaintenanceWindowStartTime;
    }

    /**
     * <p>
     * The start time for the maintenance window.
     * </p>
     * 
     * @param applicationMaintenanceWindowStartTime
     *        The start time for the maintenance window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationMaintenanceConfigurationDescription withApplicationMaintenanceWindowStartTime(String applicationMaintenanceWindowStartTime) {
        setApplicationMaintenanceWindowStartTime(applicationMaintenanceWindowStartTime);
        return this;
    }

    /**
     * <p>
     * The end time for the maintenance window.
     * </p>
     * 
     * @param applicationMaintenanceWindowEndTime
     *        The end time for the maintenance window.
     */

    public void setApplicationMaintenanceWindowEndTime(String applicationMaintenanceWindowEndTime) {
        this.applicationMaintenanceWindowEndTime = applicationMaintenanceWindowEndTime;
    }

    /**
     * <p>
     * The end time for the maintenance window.
     * </p>
     * 
     * @return The end time for the maintenance window.
     */

    public String getApplicationMaintenanceWindowEndTime() {
        return this.applicationMaintenanceWindowEndTime;
    }

    /**
     * <p>
     * The end time for the maintenance window.
     * </p>
     * 
     * @param applicationMaintenanceWindowEndTime
     *        The end time for the maintenance window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationMaintenanceConfigurationDescription withApplicationMaintenanceWindowEndTime(String applicationMaintenanceWindowEndTime) {
        setApplicationMaintenanceWindowEndTime(applicationMaintenanceWindowEndTime);
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
        if (getApplicationMaintenanceWindowStartTime() != null)
            sb.append("ApplicationMaintenanceWindowStartTime: ").append(getApplicationMaintenanceWindowStartTime()).append(",");
        if (getApplicationMaintenanceWindowEndTime() != null)
            sb.append("ApplicationMaintenanceWindowEndTime: ").append(getApplicationMaintenanceWindowEndTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationMaintenanceConfigurationDescription == false)
            return false;
        ApplicationMaintenanceConfigurationDescription other = (ApplicationMaintenanceConfigurationDescription) obj;
        if (other.getApplicationMaintenanceWindowStartTime() == null ^ this.getApplicationMaintenanceWindowStartTime() == null)
            return false;
        if (other.getApplicationMaintenanceWindowStartTime() != null
                && other.getApplicationMaintenanceWindowStartTime().equals(this.getApplicationMaintenanceWindowStartTime()) == false)
            return false;
        if (other.getApplicationMaintenanceWindowEndTime() == null ^ this.getApplicationMaintenanceWindowEndTime() == null)
            return false;
        if (other.getApplicationMaintenanceWindowEndTime() != null
                && other.getApplicationMaintenanceWindowEndTime().equals(this.getApplicationMaintenanceWindowEndTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationMaintenanceWindowStartTime() == null) ? 0 : getApplicationMaintenanceWindowStartTime().hashCode());
        hashCode = prime * hashCode + ((getApplicationMaintenanceWindowEndTime() == null) ? 0 : getApplicationMaintenanceWindowEndTime().hashCode());
        return hashCode;
    }

    @Override
    public ApplicationMaintenanceConfigurationDescription clone() {
        try {
            return (ApplicationMaintenanceConfigurationDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.ApplicationMaintenanceConfigurationDescriptionMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
