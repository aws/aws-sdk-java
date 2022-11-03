/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * List of FPort assigned for different LoRaWAN application packages to use
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/FPorts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FPorts implements Serializable, Cloneable, StructuredPojo {

    private Integer fuota;

    private Integer multicast;

    private Integer clockSync;
    /**
     * <p>
     * FPort values for the GNSS, stream, and ClockSync functions of the positioning information.
     * </p>
     */
    private Positioning positioning;

    /**
     * @param fuota
     */

    public void setFuota(Integer fuota) {
        this.fuota = fuota;
    }

    /**
     * @return
     */

    public Integer getFuota() {
        return this.fuota;
    }

    /**
     * @param fuota
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FPorts withFuota(Integer fuota) {
        setFuota(fuota);
        return this;
    }

    /**
     * @param multicast
     */

    public void setMulticast(Integer multicast) {
        this.multicast = multicast;
    }

    /**
     * @return
     */

    public Integer getMulticast() {
        return this.multicast;
    }

    /**
     * @param multicast
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FPorts withMulticast(Integer multicast) {
        setMulticast(multicast);
        return this;
    }

    /**
     * @param clockSync
     */

    public void setClockSync(Integer clockSync) {
        this.clockSync = clockSync;
    }

    /**
     * @return
     */

    public Integer getClockSync() {
        return this.clockSync;
    }

    /**
     * @param clockSync
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FPorts withClockSync(Integer clockSync) {
        setClockSync(clockSync);
        return this;
    }

    /**
     * <p>
     * FPort values for the GNSS, stream, and ClockSync functions of the positioning information.
     * </p>
     * 
     * @param positioning
     *        FPort values for the GNSS, stream, and ClockSync functions of the positioning information.
     */

    public void setPositioning(Positioning positioning) {
        this.positioning = positioning;
    }

    /**
     * <p>
     * FPort values for the GNSS, stream, and ClockSync functions of the positioning information.
     * </p>
     * 
     * @return FPort values for the GNSS, stream, and ClockSync functions of the positioning information.
     */

    public Positioning getPositioning() {
        return this.positioning;
    }

    /**
     * <p>
     * FPort values for the GNSS, stream, and ClockSync functions of the positioning information.
     * </p>
     * 
     * @param positioning
     *        FPort values for the GNSS, stream, and ClockSync functions of the positioning information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FPorts withPositioning(Positioning positioning) {
        setPositioning(positioning);
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
        if (getFuota() != null)
            sb.append("Fuota: ").append(getFuota()).append(",");
        if (getMulticast() != null)
            sb.append("Multicast: ").append(getMulticast()).append(",");
        if (getClockSync() != null)
            sb.append("ClockSync: ").append(getClockSync()).append(",");
        if (getPositioning() != null)
            sb.append("Positioning: ").append(getPositioning());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FPorts == false)
            return false;
        FPorts other = (FPorts) obj;
        if (other.getFuota() == null ^ this.getFuota() == null)
            return false;
        if (other.getFuota() != null && other.getFuota().equals(this.getFuota()) == false)
            return false;
        if (other.getMulticast() == null ^ this.getMulticast() == null)
            return false;
        if (other.getMulticast() != null && other.getMulticast().equals(this.getMulticast()) == false)
            return false;
        if (other.getClockSync() == null ^ this.getClockSync() == null)
            return false;
        if (other.getClockSync() != null && other.getClockSync().equals(this.getClockSync()) == false)
            return false;
        if (other.getPositioning() == null ^ this.getPositioning() == null)
            return false;
        if (other.getPositioning() != null && other.getPositioning().equals(this.getPositioning()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFuota() == null) ? 0 : getFuota().hashCode());
        hashCode = prime * hashCode + ((getMulticast() == null) ? 0 : getMulticast().hashCode());
        hashCode = prime * hashCode + ((getClockSync() == null) ? 0 : getClockSync().hashCode());
        hashCode = prime * hashCode + ((getPositioning() == null) ? 0 : getPositioning().hashCode());
        return hashCode;
    }

    @Override
    public FPorts clone() {
        try {
            return (FPorts) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.FPortsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
