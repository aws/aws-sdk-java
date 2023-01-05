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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Object for updating the FPorts information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdateFPorts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFPorts implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Positioning FPorts for the ClockSync, Stream, and GNSS functions.
     * </p>
     */
    private Positioning positioning;
    /**
     * <p>
     * LoRaWAN application, which can be used for geolocation by activating positioning.
     * </p>
     */
    private java.util.List<ApplicationConfig> applications;

    /**
     * <p>
     * Positioning FPorts for the ClockSync, Stream, and GNSS functions.
     * </p>
     * 
     * @param positioning
     *        Positioning FPorts for the ClockSync, Stream, and GNSS functions.
     */

    public void setPositioning(Positioning positioning) {
        this.positioning = positioning;
    }

    /**
     * <p>
     * Positioning FPorts for the ClockSync, Stream, and GNSS functions.
     * </p>
     * 
     * @return Positioning FPorts for the ClockSync, Stream, and GNSS functions.
     */

    public Positioning getPositioning() {
        return this.positioning;
    }

    /**
     * <p>
     * Positioning FPorts for the ClockSync, Stream, and GNSS functions.
     * </p>
     * 
     * @param positioning
     *        Positioning FPorts for the ClockSync, Stream, and GNSS functions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFPorts withPositioning(Positioning positioning) {
        setPositioning(positioning);
        return this;
    }

    /**
     * <p>
     * LoRaWAN application, which can be used for geolocation by activating positioning.
     * </p>
     * 
     * @return LoRaWAN application, which can be used for geolocation by activating positioning.
     */

    public java.util.List<ApplicationConfig> getApplications() {
        return applications;
    }

    /**
     * <p>
     * LoRaWAN application, which can be used for geolocation by activating positioning.
     * </p>
     * 
     * @param applications
     *        LoRaWAN application, which can be used for geolocation by activating positioning.
     */

    public void setApplications(java.util.Collection<ApplicationConfig> applications) {
        if (applications == null) {
            this.applications = null;
            return;
        }

        this.applications = new java.util.ArrayList<ApplicationConfig>(applications);
    }

    /**
     * <p>
     * LoRaWAN application, which can be used for geolocation by activating positioning.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setApplications(java.util.Collection)} or {@link #withApplications(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param applications
     *        LoRaWAN application, which can be used for geolocation by activating positioning.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFPorts withApplications(ApplicationConfig... applications) {
        if (this.applications == null) {
            setApplications(new java.util.ArrayList<ApplicationConfig>(applications.length));
        }
        for (ApplicationConfig ele : applications) {
            this.applications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * LoRaWAN application, which can be used for geolocation by activating positioning.
     * </p>
     * 
     * @param applications
     *        LoRaWAN application, which can be used for geolocation by activating positioning.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFPorts withApplications(java.util.Collection<ApplicationConfig> applications) {
        setApplications(applications);
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
        if (getPositioning() != null)
            sb.append("Positioning: ").append(getPositioning()).append(",");
        if (getApplications() != null)
            sb.append("Applications: ").append(getApplications());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFPorts == false)
            return false;
        UpdateFPorts other = (UpdateFPorts) obj;
        if (other.getPositioning() == null ^ this.getPositioning() == null)
            return false;
        if (other.getPositioning() != null && other.getPositioning().equals(this.getPositioning()) == false)
            return false;
        if (other.getApplications() == null ^ this.getApplications() == null)
            return false;
        if (other.getApplications() != null && other.getApplications().equals(this.getApplications()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPositioning() == null) ? 0 : getPositioning().hashCode());
        hashCode = prime * hashCode + ((getApplications() == null) ? 0 : getApplications().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFPorts clone() {
        try {
            return (UpdateFPorts) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.UpdateFPortsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
