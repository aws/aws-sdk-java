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
 * The LoRaWAN information that is to be used with the multicast group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/LoRaWANMulticast" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoRaWANMulticast implements Serializable, Cloneable, StructuredPojo {

    private String rfRegion;

    private String dlClass;

    /**
     * @param rfRegion
     * @see SupportedRfRegion
     */

    public void setRfRegion(String rfRegion) {
        this.rfRegion = rfRegion;
    }

    /**
     * @return
     * @see SupportedRfRegion
     */

    public String getRfRegion() {
        return this.rfRegion;
    }

    /**
     * @param rfRegion
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SupportedRfRegion
     */

    public LoRaWANMulticast withRfRegion(String rfRegion) {
        setRfRegion(rfRegion);
        return this;
    }

    /**
     * @param rfRegion
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SupportedRfRegion
     */

    public LoRaWANMulticast withRfRegion(SupportedRfRegion rfRegion) {
        this.rfRegion = rfRegion.toString();
        return this;
    }

    /**
     * @param dlClass
     * @see DlClass
     */

    public void setDlClass(String dlClass) {
        this.dlClass = dlClass;
    }

    /**
     * @return
     * @see DlClass
     */

    public String getDlClass() {
        return this.dlClass;
    }

    /**
     * @param dlClass
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DlClass
     */

    public LoRaWANMulticast withDlClass(String dlClass) {
        setDlClass(dlClass);
        return this;
    }

    /**
     * @param dlClass
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DlClass
     */

    public LoRaWANMulticast withDlClass(DlClass dlClass) {
        this.dlClass = dlClass.toString();
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
        if (getRfRegion() != null)
            sb.append("RfRegion: ").append(getRfRegion()).append(",");
        if (getDlClass() != null)
            sb.append("DlClass: ").append(getDlClass());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoRaWANMulticast == false)
            return false;
        LoRaWANMulticast other = (LoRaWANMulticast) obj;
        if (other.getRfRegion() == null ^ this.getRfRegion() == null)
            return false;
        if (other.getRfRegion() != null && other.getRfRegion().equals(this.getRfRegion()) == false)
            return false;
        if (other.getDlClass() == null ^ this.getDlClass() == null)
            return false;
        if (other.getDlClass() != null && other.getDlClass().equals(this.getDlClass()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRfRegion() == null) ? 0 : getRfRegion().hashCode());
        hashCode = prime * hashCode + ((getDlClass() == null) ? 0 : getDlClass().hashCode());
        return hashCode;
    }

    @Override
    public LoRaWANMulticast clone() {
        try {
            return (LoRaWANMulticast) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.LoRaWANMulticastMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
