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
package com.amazonaws.services.groundstation.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Ephemeris data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/EphemerisData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EphemerisData implements Serializable, Cloneable, StructuredPojo {

    private OEMEphemeris oem;

    private TLEEphemeris tle;

    /**
     * @param oem
     */

    public void setOem(OEMEphemeris oem) {
        this.oem = oem;
    }

    /**
     * @return
     */

    public OEMEphemeris getOem() {
        return this.oem;
    }

    /**
     * @param oem
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EphemerisData withOem(OEMEphemeris oem) {
        setOem(oem);
        return this;
    }

    /**
     * @param tle
     */

    public void setTle(TLEEphemeris tle) {
        this.tle = tle;
    }

    /**
     * @return
     */

    public TLEEphemeris getTle() {
        return this.tle;
    }

    /**
     * @param tle
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EphemerisData withTle(TLEEphemeris tle) {
        setTle(tle);
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
        if (getOem() != null)
            sb.append("Oem: ").append(getOem()).append(",");
        if (getTle() != null)
            sb.append("Tle: ").append(getTle());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EphemerisData == false)
            return false;
        EphemerisData other = (EphemerisData) obj;
        if (other.getOem() == null ^ this.getOem() == null)
            return false;
        if (other.getOem() != null && other.getOem().equals(this.getOem()) == false)
            return false;
        if (other.getTle() == null ^ this.getTle() == null)
            return false;
        if (other.getTle() != null && other.getTle().equals(this.getTle()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOem() == null) ? 0 : getOem().hashCode());
        hashCode = prime * hashCode + ((getTle() == null) ? 0 : getTle().hashCode());
        return hashCode;
    }

    @Override
    public EphemerisData clone() {
        try {
            return (EphemerisData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.groundstation.model.transform.EphemerisDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
