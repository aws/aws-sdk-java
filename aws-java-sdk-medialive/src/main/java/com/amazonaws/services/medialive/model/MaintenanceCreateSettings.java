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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Placeholder documentation for MaintenanceCreateSettings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/MaintenanceCreateSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MaintenanceCreateSettings implements Serializable, Cloneable, StructuredPojo {

    /** Choose one day of the week for maintenance. The chosen day is used for all future maintenance windows. */
    private String maintenanceDay;
    /** Choose the hour that maintenance will start. The chosen time is used for all future maintenance windows. */
    private String maintenanceStartTime;

    /**
     * Choose one day of the week for maintenance. The chosen day is used for all future maintenance windows.
     * 
     * @param maintenanceDay
     *        Choose one day of the week for maintenance. The chosen day is used for all future maintenance windows.
     * @see MaintenanceDay
     */

    public void setMaintenanceDay(String maintenanceDay) {
        this.maintenanceDay = maintenanceDay;
    }

    /**
     * Choose one day of the week for maintenance. The chosen day is used for all future maintenance windows.
     * 
     * @return Choose one day of the week for maintenance. The chosen day is used for all future maintenance windows.
     * @see MaintenanceDay
     */

    public String getMaintenanceDay() {
        return this.maintenanceDay;
    }

    /**
     * Choose one day of the week for maintenance. The chosen day is used for all future maintenance windows.
     * 
     * @param maintenanceDay
     *        Choose one day of the week for maintenance. The chosen day is used for all future maintenance windows.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaintenanceDay
     */

    public MaintenanceCreateSettings withMaintenanceDay(String maintenanceDay) {
        setMaintenanceDay(maintenanceDay);
        return this;
    }

    /**
     * Choose one day of the week for maintenance. The chosen day is used for all future maintenance windows.
     * 
     * @param maintenanceDay
     *        Choose one day of the week for maintenance. The chosen day is used for all future maintenance windows.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaintenanceDay
     */

    public MaintenanceCreateSettings withMaintenanceDay(MaintenanceDay maintenanceDay) {
        this.maintenanceDay = maintenanceDay.toString();
        return this;
    }

    /**
     * Choose the hour that maintenance will start. The chosen time is used for all future maintenance windows.
     * 
     * @param maintenanceStartTime
     *        Choose the hour that maintenance will start. The chosen time is used for all future maintenance windows.
     */

    public void setMaintenanceStartTime(String maintenanceStartTime) {
        this.maintenanceStartTime = maintenanceStartTime;
    }

    /**
     * Choose the hour that maintenance will start. The chosen time is used for all future maintenance windows.
     * 
     * @return Choose the hour that maintenance will start. The chosen time is used for all future maintenance windows.
     */

    public String getMaintenanceStartTime() {
        return this.maintenanceStartTime;
    }

    /**
     * Choose the hour that maintenance will start. The chosen time is used for all future maintenance windows.
     * 
     * @param maintenanceStartTime
     *        Choose the hour that maintenance will start. The chosen time is used for all future maintenance windows.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceCreateSettings withMaintenanceStartTime(String maintenanceStartTime) {
        setMaintenanceStartTime(maintenanceStartTime);
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
        if (getMaintenanceDay() != null)
            sb.append("MaintenanceDay: ").append(getMaintenanceDay()).append(",");
        if (getMaintenanceStartTime() != null)
            sb.append("MaintenanceStartTime: ").append(getMaintenanceStartTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MaintenanceCreateSettings == false)
            return false;
        MaintenanceCreateSettings other = (MaintenanceCreateSettings) obj;
        if (other.getMaintenanceDay() == null ^ this.getMaintenanceDay() == null)
            return false;
        if (other.getMaintenanceDay() != null && other.getMaintenanceDay().equals(this.getMaintenanceDay()) == false)
            return false;
        if (other.getMaintenanceStartTime() == null ^ this.getMaintenanceStartTime() == null)
            return false;
        if (other.getMaintenanceStartTime() != null && other.getMaintenanceStartTime().equals(this.getMaintenanceStartTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaintenanceDay() == null) ? 0 : getMaintenanceDay().hashCode());
        hashCode = prime * hashCode + ((getMaintenanceStartTime() == null) ? 0 : getMaintenanceStartTime().hashCode());
        return hashCode;
    }

    @Override
    public MaintenanceCreateSettings clone() {
        try {
            return (MaintenanceCreateSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.MaintenanceCreateSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
