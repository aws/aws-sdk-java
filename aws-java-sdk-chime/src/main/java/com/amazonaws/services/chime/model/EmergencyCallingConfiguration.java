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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The emergency calling configuration details associated with an Amazon Chime Voice Connector.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/EmergencyCallingConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EmergencyCallingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Dialed Number Identification Service (DNIS) emergency calling configuration details.
     * </p>
     */
    private java.util.List<DNISEmergencyCallingConfiguration> dNIS;

    /**
     * <p>
     * The Dialed Number Identification Service (DNIS) emergency calling configuration details.
     * </p>
     * 
     * @return The Dialed Number Identification Service (DNIS) emergency calling configuration details.
     */

    public java.util.List<DNISEmergencyCallingConfiguration> getDNIS() {
        return dNIS;
    }

    /**
     * <p>
     * The Dialed Number Identification Service (DNIS) emergency calling configuration details.
     * </p>
     * 
     * @param dNIS
     *        The Dialed Number Identification Service (DNIS) emergency calling configuration details.
     */

    public void setDNIS(java.util.Collection<DNISEmergencyCallingConfiguration> dNIS) {
        if (dNIS == null) {
            this.dNIS = null;
            return;
        }

        this.dNIS = new java.util.ArrayList<DNISEmergencyCallingConfiguration>(dNIS);
    }

    /**
     * <p>
     * The Dialed Number Identification Service (DNIS) emergency calling configuration details.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDNIS(java.util.Collection)} or {@link #withDNIS(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param dNIS
     *        The Dialed Number Identification Service (DNIS) emergency calling configuration details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmergencyCallingConfiguration withDNIS(DNISEmergencyCallingConfiguration... dNIS) {
        if (this.dNIS == null) {
            setDNIS(new java.util.ArrayList<DNISEmergencyCallingConfiguration>(dNIS.length));
        }
        for (DNISEmergencyCallingConfiguration ele : dNIS) {
            this.dNIS.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Dialed Number Identification Service (DNIS) emergency calling configuration details.
     * </p>
     * 
     * @param dNIS
     *        The Dialed Number Identification Service (DNIS) emergency calling configuration details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmergencyCallingConfiguration withDNIS(java.util.Collection<DNISEmergencyCallingConfiguration> dNIS) {
        setDNIS(dNIS);
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
        if (getDNIS() != null)
            sb.append("DNIS: ").append(getDNIS());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EmergencyCallingConfiguration == false)
            return false;
        EmergencyCallingConfiguration other = (EmergencyCallingConfiguration) obj;
        if (other.getDNIS() == null ^ this.getDNIS() == null)
            return false;
        if (other.getDNIS() != null && other.getDNIS().equals(this.getDNIS()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDNIS() == null) ? 0 : getDNIS().hashCode());
        return hashCode;
    }

    @Override
    public EmergencyCallingConfiguration clone() {
        try {
            return (EmergencyCallingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.EmergencyCallingConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
