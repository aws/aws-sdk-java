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
package com.amazonaws.services.cloudwatchrum.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that defines the time range that you want to retrieve results from.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/TimeRange" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimeRange implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The beginning of the time range to retrieve performance events from.
     * </p>
     */
    private Long after;
    /**
     * <p>
     * The end of the time range to retrieve performance events from. If you omit this, the time range extends to the
     * time that this operation is performed.
     * </p>
     */
    private Long before;

    /**
     * <p>
     * The beginning of the time range to retrieve performance events from.
     * </p>
     * 
     * @param after
     *        The beginning of the time range to retrieve performance events from.
     */

    public void setAfter(Long after) {
        this.after = after;
    }

    /**
     * <p>
     * The beginning of the time range to retrieve performance events from.
     * </p>
     * 
     * @return The beginning of the time range to retrieve performance events from.
     */

    public Long getAfter() {
        return this.after;
    }

    /**
     * <p>
     * The beginning of the time range to retrieve performance events from.
     * </p>
     * 
     * @param after
     *        The beginning of the time range to retrieve performance events from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeRange withAfter(Long after) {
        setAfter(after);
        return this;
    }

    /**
     * <p>
     * The end of the time range to retrieve performance events from. If you omit this, the time range extends to the
     * time that this operation is performed.
     * </p>
     * 
     * @param before
     *        The end of the time range to retrieve performance events from. If you omit this, the time range extends to
     *        the time that this operation is performed.
     */

    public void setBefore(Long before) {
        this.before = before;
    }

    /**
     * <p>
     * The end of the time range to retrieve performance events from. If you omit this, the time range extends to the
     * time that this operation is performed.
     * </p>
     * 
     * @return The end of the time range to retrieve performance events from. If you omit this, the time range extends
     *         to the time that this operation is performed.
     */

    public Long getBefore() {
        return this.before;
    }

    /**
     * <p>
     * The end of the time range to retrieve performance events from. If you omit this, the time range extends to the
     * time that this operation is performed.
     * </p>
     * 
     * @param before
     *        The end of the time range to retrieve performance events from. If you omit this, the time range extends to
     *        the time that this operation is performed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeRange withBefore(Long before) {
        setBefore(before);
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
        if (getAfter() != null)
            sb.append("After: ").append(getAfter()).append(",");
        if (getBefore() != null)
            sb.append("Before: ").append(getBefore());
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
        if (other.getAfter() == null ^ this.getAfter() == null)
            return false;
        if (other.getAfter() != null && other.getAfter().equals(this.getAfter()) == false)
            return false;
        if (other.getBefore() == null ^ this.getBefore() == null)
            return false;
        if (other.getBefore() != null && other.getBefore().equals(this.getBefore()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAfter() == null) ? 0 : getAfter().hashCode());
        hashCode = prime * hashCode + ((getBefore() == null) ? 0 : getBefore().hashCode());
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
        com.amazonaws.services.cloudwatchrum.model.transform.TimeRangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
