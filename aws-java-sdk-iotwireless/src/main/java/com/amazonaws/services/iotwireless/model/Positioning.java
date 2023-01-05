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
 * The FPorts for the position information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/Positioning" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Positioning implements Serializable, Cloneable, StructuredPojo {

    private Integer clockSync;

    private Integer stream;

    private Integer gnss;

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

    public Positioning withClockSync(Integer clockSync) {
        setClockSync(clockSync);
        return this;
    }

    /**
     * @param stream
     */

    public void setStream(Integer stream) {
        this.stream = stream;
    }

    /**
     * @return
     */

    public Integer getStream() {
        return this.stream;
    }

    /**
     * @param stream
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Positioning withStream(Integer stream) {
        setStream(stream);
        return this;
    }

    /**
     * @param gnss
     */

    public void setGnss(Integer gnss) {
        this.gnss = gnss;
    }

    /**
     * @return
     */

    public Integer getGnss() {
        return this.gnss;
    }

    /**
     * @param gnss
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Positioning withGnss(Integer gnss) {
        setGnss(gnss);
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
        if (getClockSync() != null)
            sb.append("ClockSync: ").append(getClockSync()).append(",");
        if (getStream() != null)
            sb.append("Stream: ").append(getStream()).append(",");
        if (getGnss() != null)
            sb.append("Gnss: ").append(getGnss());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Positioning == false)
            return false;
        Positioning other = (Positioning) obj;
        if (other.getClockSync() == null ^ this.getClockSync() == null)
            return false;
        if (other.getClockSync() != null && other.getClockSync().equals(this.getClockSync()) == false)
            return false;
        if (other.getStream() == null ^ this.getStream() == null)
            return false;
        if (other.getStream() != null && other.getStream().equals(this.getStream()) == false)
            return false;
        if (other.getGnss() == null ^ this.getGnss() == null)
            return false;
        if (other.getGnss() != null && other.getGnss().equals(this.getGnss()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClockSync() == null) ? 0 : getClockSync().hashCode());
        hashCode = prime * hashCode + ((getStream() == null) ? 0 : getStream().hashCode());
        hashCode = prime * hashCode + ((getGnss() == null) ? 0 : getGnss().hashCode());
        return hashCode;
    }

    @Override
    public Positioning clone() {
        try {
            return (Positioning) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.PositioningMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
