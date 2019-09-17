/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the amount of CPU that an app is using on a physical device.
 * </p>
 * <p>
 * Note that this does not represent system-wide CPU usage.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/CPU" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CPU implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The CPU's frequency.
     * </p>
     */
    private String frequency;
    /**
     * <p>
     * The CPU's architecture, for example x86 or ARM.
     * </p>
     */
    private String architecture;
    /**
     * <p>
     * The clock speed of the device's CPU, expressed in hertz (Hz). For example, a 1.2 GHz CPU is expressed as
     * 1200000000.
     * </p>
     */
    private Double clock;

    /**
     * <p>
     * The CPU's frequency.
     * </p>
     * 
     * @param frequency
     *        The CPU's frequency.
     */

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    /**
     * <p>
     * The CPU's frequency.
     * </p>
     * 
     * @return The CPU's frequency.
     */

    public String getFrequency() {
        return this.frequency;
    }

    /**
     * <p>
     * The CPU's frequency.
     * </p>
     * 
     * @param frequency
     *        The CPU's frequency.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CPU withFrequency(String frequency) {
        setFrequency(frequency);
        return this;
    }

    /**
     * <p>
     * The CPU's architecture, for example x86 or ARM.
     * </p>
     * 
     * @param architecture
     *        The CPU's architecture, for example x86 or ARM.
     */

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    /**
     * <p>
     * The CPU's architecture, for example x86 or ARM.
     * </p>
     * 
     * @return The CPU's architecture, for example x86 or ARM.
     */

    public String getArchitecture() {
        return this.architecture;
    }

    /**
     * <p>
     * The CPU's architecture, for example x86 or ARM.
     * </p>
     * 
     * @param architecture
     *        The CPU's architecture, for example x86 or ARM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CPU withArchitecture(String architecture) {
        setArchitecture(architecture);
        return this;
    }

    /**
     * <p>
     * The clock speed of the device's CPU, expressed in hertz (Hz). For example, a 1.2 GHz CPU is expressed as
     * 1200000000.
     * </p>
     * 
     * @param clock
     *        The clock speed of the device's CPU, expressed in hertz (Hz). For example, a 1.2 GHz CPU is expressed as
     *        1200000000.
     */

    public void setClock(Double clock) {
        this.clock = clock;
    }

    /**
     * <p>
     * The clock speed of the device's CPU, expressed in hertz (Hz). For example, a 1.2 GHz CPU is expressed as
     * 1200000000.
     * </p>
     * 
     * @return The clock speed of the device's CPU, expressed in hertz (Hz). For example, a 1.2 GHz CPU is expressed as
     *         1200000000.
     */

    public Double getClock() {
        return this.clock;
    }

    /**
     * <p>
     * The clock speed of the device's CPU, expressed in hertz (Hz). For example, a 1.2 GHz CPU is expressed as
     * 1200000000.
     * </p>
     * 
     * @param clock
     *        The clock speed of the device's CPU, expressed in hertz (Hz). For example, a 1.2 GHz CPU is expressed as
     *        1200000000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CPU withClock(Double clock) {
        setClock(clock);
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
        if (getFrequency() != null)
            sb.append("Frequency: ").append(getFrequency()).append(",");
        if (getArchitecture() != null)
            sb.append("Architecture: ").append(getArchitecture()).append(",");
        if (getClock() != null)
            sb.append("Clock: ").append(getClock());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CPU == false)
            return false;
        CPU other = (CPU) obj;
        if (other.getFrequency() == null ^ this.getFrequency() == null)
            return false;
        if (other.getFrequency() != null && other.getFrequency().equals(this.getFrequency()) == false)
            return false;
        if (other.getArchitecture() == null ^ this.getArchitecture() == null)
            return false;
        if (other.getArchitecture() != null && other.getArchitecture().equals(this.getArchitecture()) == false)
            return false;
        if (other.getClock() == null ^ this.getClock() == null)
            return false;
        if (other.getClock() != null && other.getClock().equals(this.getClock()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFrequency() == null) ? 0 : getFrequency().hashCode());
        hashCode = prime * hashCode + ((getArchitecture() == null) ? 0 : getArchitecture().hashCode());
        hashCode = prime * hashCode + ((getClock() == null) ? 0 : getClock().hashCode());
        return hashCode;
    }

    @Override
    public CPU clone() {
        try {
            return (CPU) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devicefarm.model.transform.CPUMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
