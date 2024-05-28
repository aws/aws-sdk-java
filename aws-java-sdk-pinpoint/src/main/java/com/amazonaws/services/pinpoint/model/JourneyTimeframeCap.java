/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The number of messages that can be sent to an endpoint during the specified timeframe for all journeys.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/JourneyTimeframeCap" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JourneyTimeframeCap implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum number of messages that all journeys can send to an endpoint during the specified timeframe. The
     * maximum value is 100. If set to 0, this limit will not apply.
     * </p>
     */
    private Integer cap;
    /**
     * <p>
     * The length of the timeframe in days. The maximum value is 30. If set to 0, this limit will not apply.
     * </p>
     */
    private Integer days;

    /**
     * <p>
     * The maximum number of messages that all journeys can send to an endpoint during the specified timeframe. The
     * maximum value is 100. If set to 0, this limit will not apply.
     * </p>
     * 
     * @param cap
     *        The maximum number of messages that all journeys can send to an endpoint during the specified timeframe.
     *        The maximum value is 100. If set to 0, this limit will not apply.
     */

    public void setCap(Integer cap) {
        this.cap = cap;
    }

    /**
     * <p>
     * The maximum number of messages that all journeys can send to an endpoint during the specified timeframe. The
     * maximum value is 100. If set to 0, this limit will not apply.
     * </p>
     * 
     * @return The maximum number of messages that all journeys can send to an endpoint during the specified timeframe.
     *         The maximum value is 100. If set to 0, this limit will not apply.
     */

    public Integer getCap() {
        return this.cap;
    }

    /**
     * <p>
     * The maximum number of messages that all journeys can send to an endpoint during the specified timeframe. The
     * maximum value is 100. If set to 0, this limit will not apply.
     * </p>
     * 
     * @param cap
     *        The maximum number of messages that all journeys can send to an endpoint during the specified timeframe.
     *        The maximum value is 100. If set to 0, this limit will not apply.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JourneyTimeframeCap withCap(Integer cap) {
        setCap(cap);
        return this;
    }

    /**
     * <p>
     * The length of the timeframe in days. The maximum value is 30. If set to 0, this limit will not apply.
     * </p>
     * 
     * @param days
     *        The length of the timeframe in days. The maximum value is 30. If set to 0, this limit will not apply.
     */

    public void setDays(Integer days) {
        this.days = days;
    }

    /**
     * <p>
     * The length of the timeframe in days. The maximum value is 30. If set to 0, this limit will not apply.
     * </p>
     * 
     * @return The length of the timeframe in days. The maximum value is 30. If set to 0, this limit will not apply.
     */

    public Integer getDays() {
        return this.days;
    }

    /**
     * <p>
     * The length of the timeframe in days. The maximum value is 30. If set to 0, this limit will not apply.
     * </p>
     * 
     * @param days
     *        The length of the timeframe in days. The maximum value is 30. If set to 0, this limit will not apply.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JourneyTimeframeCap withDays(Integer days) {
        setDays(days);
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
        if (getCap() != null)
            sb.append("Cap: ").append(getCap()).append(",");
        if (getDays() != null)
            sb.append("Days: ").append(getDays());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JourneyTimeframeCap == false)
            return false;
        JourneyTimeframeCap other = (JourneyTimeframeCap) obj;
        if (other.getCap() == null ^ this.getCap() == null)
            return false;
        if (other.getCap() != null && other.getCap().equals(this.getCap()) == false)
            return false;
        if (other.getDays() == null ^ this.getDays() == null)
            return false;
        if (other.getDays() != null && other.getDays().equals(this.getDays()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCap() == null) ? 0 : getCap().hashCode());
        hashCode = prime * hashCode + ((getDays() == null) ? 0 : getDays().hashCode());
        return hashCode;
    }

    @Override
    public JourneyTimeframeCap clone() {
        try {
            return (JourneyTimeframeCap) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.JourneyTimeframeCapMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
