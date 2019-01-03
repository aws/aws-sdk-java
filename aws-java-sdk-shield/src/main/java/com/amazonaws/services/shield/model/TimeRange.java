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
package com.amazonaws.services.shield.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The time range.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/TimeRange" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimeRange implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The start time, in Unix time in seconds. For more information see <a
     * href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types">timestamp</a>.
     * </p>
     */
    private java.util.Date fromInclusive;
    /**
     * <p>
     * The end time, in Unix time in seconds. For more information see <a
     * href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types">timestamp</a>.
     * </p>
     */
    private java.util.Date toExclusive;

    /**
     * <p>
     * The start time, in Unix time in seconds. For more information see <a
     * href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types">timestamp</a>.
     * </p>
     * 
     * @param fromInclusive
     *        The start time, in Unix time in seconds. For more information see <a
     *        href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types">timestamp</a>.
     */

    public void setFromInclusive(java.util.Date fromInclusive) {
        this.fromInclusive = fromInclusive;
    }

    /**
     * <p>
     * The start time, in Unix time in seconds. For more information see <a
     * href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types">timestamp</a>.
     * </p>
     * 
     * @return The start time, in Unix time in seconds. For more information see <a
     *         href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     *         >timestamp</a>.
     */

    public java.util.Date getFromInclusive() {
        return this.fromInclusive;
    }

    /**
     * <p>
     * The start time, in Unix time in seconds. For more information see <a
     * href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types">timestamp</a>.
     * </p>
     * 
     * @param fromInclusive
     *        The start time, in Unix time in seconds. For more information see <a
     *        href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types">timestamp</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeRange withFromInclusive(java.util.Date fromInclusive) {
        setFromInclusive(fromInclusive);
        return this;
    }

    /**
     * <p>
     * The end time, in Unix time in seconds. For more information see <a
     * href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types">timestamp</a>.
     * </p>
     * 
     * @param toExclusive
     *        The end time, in Unix time in seconds. For more information see <a
     *        href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types">timestamp</a>.
     */

    public void setToExclusive(java.util.Date toExclusive) {
        this.toExclusive = toExclusive;
    }

    /**
     * <p>
     * The end time, in Unix time in seconds. For more information see <a
     * href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types">timestamp</a>.
     * </p>
     * 
     * @return The end time, in Unix time in seconds. For more information see <a
     *         href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     *         >timestamp</a>.
     */

    public java.util.Date getToExclusive() {
        return this.toExclusive;
    }

    /**
     * <p>
     * The end time, in Unix time in seconds. For more information see <a
     * href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types">timestamp</a>.
     * </p>
     * 
     * @param toExclusive
     *        The end time, in Unix time in seconds. For more information see <a
     *        href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types">timestamp</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeRange withToExclusive(java.util.Date toExclusive) {
        setToExclusive(toExclusive);
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
        if (getFromInclusive() != null)
            sb.append("FromInclusive: ").append(getFromInclusive()).append(",");
        if (getToExclusive() != null)
            sb.append("ToExclusive: ").append(getToExclusive());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimeRange == false)
            return false;
        TimeRange other = (TimeRange) obj;
        if (other.getFromInclusive() == null ^ this.getFromInclusive() == null)
            return false;
        if (other.getFromInclusive() != null && other.getFromInclusive().equals(this.getFromInclusive()) == false)
            return false;
        if (other.getToExclusive() == null ^ this.getToExclusive() == null)
            return false;
        if (other.getToExclusive() != null && other.getToExclusive().equals(this.getToExclusive()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFromInclusive() == null) ? 0 : getFromInclusive().hashCode());
        hashCode = prime * hashCode + ((getToExclusive() == null) ? 0 : getToExclusive().hashCode());
        return hashCode;
    }

    @Override
    public TimeRange clone() {
        try {
            return (TimeRange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.shield.model.transform.TimeRangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
