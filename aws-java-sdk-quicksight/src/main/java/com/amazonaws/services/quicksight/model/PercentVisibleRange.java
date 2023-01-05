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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The percent range in the visible range.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/PercentVisibleRange" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PercentVisibleRange implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The lower bound of the range.
     * </p>
     */
    private Double from;
    /**
     * <p>
     * The top bound of the range.
     * </p>
     */
    private Double to;

    /**
     * <p>
     * The lower bound of the range.
     * </p>
     * 
     * @param from
     *        The lower bound of the range.
     */

    public void setFrom(Double from) {
        this.from = from;
    }

    /**
     * <p>
     * The lower bound of the range.
     * </p>
     * 
     * @return The lower bound of the range.
     */

    public Double getFrom() {
        return this.from;
    }

    /**
     * <p>
     * The lower bound of the range.
     * </p>
     * 
     * @param from
     *        The lower bound of the range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PercentVisibleRange withFrom(Double from) {
        setFrom(from);
        return this;
    }

    /**
     * <p>
     * The top bound of the range.
     * </p>
     * 
     * @param to
     *        The top bound of the range.
     */

    public void setTo(Double to) {
        this.to = to;
    }

    /**
     * <p>
     * The top bound of the range.
     * </p>
     * 
     * @return The top bound of the range.
     */

    public Double getTo() {
        return this.to;
    }

    /**
     * <p>
     * The top bound of the range.
     * </p>
     * 
     * @param to
     *        The top bound of the range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PercentVisibleRange withTo(Double to) {
        setTo(to);
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
        if (getFrom() != null)
            sb.append("From: ").append(getFrom()).append(",");
        if (getTo() != null)
            sb.append("To: ").append(getTo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PercentVisibleRange == false)
            return false;
        PercentVisibleRange other = (PercentVisibleRange) obj;
        if (other.getFrom() == null ^ this.getFrom() == null)
            return false;
        if (other.getFrom() != null && other.getFrom().equals(this.getFrom()) == false)
            return false;
        if (other.getTo() == null ^ this.getTo() == null)
            return false;
        if (other.getTo() != null && other.getTo().equals(this.getTo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFrom() == null) ? 0 : getFrom().hashCode());
        hashCode = prime * hashCode + ((getTo() == null) ? 0 : getTo().hashCode());
        return hashCode;
    }

    @Override
    public PercentVisibleRange clone() {
        try {
            return (PercentVisibleRange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.PercentVisibleRangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
