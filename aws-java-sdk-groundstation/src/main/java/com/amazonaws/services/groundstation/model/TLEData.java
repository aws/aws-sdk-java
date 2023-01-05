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
 * Two-line element set (TLE) data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/TLEData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TLEData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * First line of two-line element set (TLE) data.
     * </p>
     */
    private String tleLine1;
    /**
     * <p>
     * Second line of two-line element set (TLE) data.
     * </p>
     */
    private String tleLine2;
    /**
     * <p>
     * The valid time range for the TLE. Gaps or overlap are not permitted.
     * </p>
     */
    private TimeRange validTimeRange;

    /**
     * <p>
     * First line of two-line element set (TLE) data.
     * </p>
     * 
     * @param tleLine1
     *        First line of two-line element set (TLE) data.
     */

    public void setTleLine1(String tleLine1) {
        this.tleLine1 = tleLine1;
    }

    /**
     * <p>
     * First line of two-line element set (TLE) data.
     * </p>
     * 
     * @return First line of two-line element set (TLE) data.
     */

    public String getTleLine1() {
        return this.tleLine1;
    }

    /**
     * <p>
     * First line of two-line element set (TLE) data.
     * </p>
     * 
     * @param tleLine1
     *        First line of two-line element set (TLE) data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TLEData withTleLine1(String tleLine1) {
        setTleLine1(tleLine1);
        return this;
    }

    /**
     * <p>
     * Second line of two-line element set (TLE) data.
     * </p>
     * 
     * @param tleLine2
     *        Second line of two-line element set (TLE) data.
     */

    public void setTleLine2(String tleLine2) {
        this.tleLine2 = tleLine2;
    }

    /**
     * <p>
     * Second line of two-line element set (TLE) data.
     * </p>
     * 
     * @return Second line of two-line element set (TLE) data.
     */

    public String getTleLine2() {
        return this.tleLine2;
    }

    /**
     * <p>
     * Second line of two-line element set (TLE) data.
     * </p>
     * 
     * @param tleLine2
     *        Second line of two-line element set (TLE) data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TLEData withTleLine2(String tleLine2) {
        setTleLine2(tleLine2);
        return this;
    }

    /**
     * <p>
     * The valid time range for the TLE. Gaps or overlap are not permitted.
     * </p>
     * 
     * @param validTimeRange
     *        The valid time range for the TLE. Gaps or overlap are not permitted.
     */

    public void setValidTimeRange(TimeRange validTimeRange) {
        this.validTimeRange = validTimeRange;
    }

    /**
     * <p>
     * The valid time range for the TLE. Gaps or overlap are not permitted.
     * </p>
     * 
     * @return The valid time range for the TLE. Gaps or overlap are not permitted.
     */

    public TimeRange getValidTimeRange() {
        return this.validTimeRange;
    }

    /**
     * <p>
     * The valid time range for the TLE. Gaps or overlap are not permitted.
     * </p>
     * 
     * @param validTimeRange
     *        The valid time range for the TLE. Gaps or overlap are not permitted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TLEData withValidTimeRange(TimeRange validTimeRange) {
        setValidTimeRange(validTimeRange);
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
        if (getTleLine1() != null)
            sb.append("TleLine1: ").append(getTleLine1()).append(",");
        if (getTleLine2() != null)
            sb.append("TleLine2: ").append(getTleLine2()).append(",");
        if (getValidTimeRange() != null)
            sb.append("ValidTimeRange: ").append(getValidTimeRange());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TLEData == false)
            return false;
        TLEData other = (TLEData) obj;
        if (other.getTleLine1() == null ^ this.getTleLine1() == null)
            return false;
        if (other.getTleLine1() != null && other.getTleLine1().equals(this.getTleLine1()) == false)
            return false;
        if (other.getTleLine2() == null ^ this.getTleLine2() == null)
            return false;
        if (other.getTleLine2() != null && other.getTleLine2().equals(this.getTleLine2()) == false)
            return false;
        if (other.getValidTimeRange() == null ^ this.getValidTimeRange() == null)
            return false;
        if (other.getValidTimeRange() != null && other.getValidTimeRange().equals(this.getValidTimeRange()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTleLine1() == null) ? 0 : getTleLine1().hashCode());
        hashCode = prime * hashCode + ((getTleLine2() == null) ? 0 : getTleLine2().hashCode());
        hashCode = prime * hashCode + ((getValidTimeRange() == null) ? 0 : getValidTimeRange().hashCode());
        return hashCode;
    }

    @Override
    public TLEData clone() {
        try {
            return (TLEData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.groundstation.model.transform.TLEDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
