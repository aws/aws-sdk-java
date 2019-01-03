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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The time period that you want the usage and costs for.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/DateInterval" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DateInterval implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The beginning of the time period that you want the usage and costs for. The start date is inclusive. For example,
     * if <code>start</code> is <code>2017-01-01</code>, AWS retrieves cost and usage data starting at
     * <code>2017-01-01</code> up to the end date.
     * </p>
     */
    private String start;
    /**
     * <p>
     * The end of the time period that you want the usage and costs for. The end date is exclusive. For example, if
     * <code>end</code> is <code>2017-05-01</code>, AWS retrieves cost and usage data from the start date up to, but not
     * including, <code>2017-05-01</code>.
     * </p>
     */
    private String end;

    /**
     * <p>
     * The beginning of the time period that you want the usage and costs for. The start date is inclusive. For example,
     * if <code>start</code> is <code>2017-01-01</code>, AWS retrieves cost and usage data starting at
     * <code>2017-01-01</code> up to the end date.
     * </p>
     * 
     * @param start
     *        The beginning of the time period that you want the usage and costs for. The start date is inclusive. For
     *        example, if <code>start</code> is <code>2017-01-01</code>, AWS retrieves cost and usage data starting at
     *        <code>2017-01-01</code> up to the end date.
     */

    public void setStart(String start) {
        this.start = start;
    }

    /**
     * <p>
     * The beginning of the time period that you want the usage and costs for. The start date is inclusive. For example,
     * if <code>start</code> is <code>2017-01-01</code>, AWS retrieves cost and usage data starting at
     * <code>2017-01-01</code> up to the end date.
     * </p>
     * 
     * @return The beginning of the time period that you want the usage and costs for. The start date is inclusive. For
     *         example, if <code>start</code> is <code>2017-01-01</code>, AWS retrieves cost and usage data starting at
     *         <code>2017-01-01</code> up to the end date.
     */

    public String getStart() {
        return this.start;
    }

    /**
     * <p>
     * The beginning of the time period that you want the usage and costs for. The start date is inclusive. For example,
     * if <code>start</code> is <code>2017-01-01</code>, AWS retrieves cost and usage data starting at
     * <code>2017-01-01</code> up to the end date.
     * </p>
     * 
     * @param start
     *        The beginning of the time period that you want the usage and costs for. The start date is inclusive. For
     *        example, if <code>start</code> is <code>2017-01-01</code>, AWS retrieves cost and usage data starting at
     *        <code>2017-01-01</code> up to the end date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DateInterval withStart(String start) {
        setStart(start);
        return this;
    }

    /**
     * <p>
     * The end of the time period that you want the usage and costs for. The end date is exclusive. For example, if
     * <code>end</code> is <code>2017-05-01</code>, AWS retrieves cost and usage data from the start date up to, but not
     * including, <code>2017-05-01</code>.
     * </p>
     * 
     * @param end
     *        The end of the time period that you want the usage and costs for. The end date is exclusive. For example,
     *        if <code>end</code> is <code>2017-05-01</code>, AWS retrieves cost and usage data from the start date up
     *        to, but not including, <code>2017-05-01</code>.
     */

    public void setEnd(String end) {
        this.end = end;
    }

    /**
     * <p>
     * The end of the time period that you want the usage and costs for. The end date is exclusive. For example, if
     * <code>end</code> is <code>2017-05-01</code>, AWS retrieves cost and usage data from the start date up to, but not
     * including, <code>2017-05-01</code>.
     * </p>
     * 
     * @return The end of the time period that you want the usage and costs for. The end date is exclusive. For example,
     *         if <code>end</code> is <code>2017-05-01</code>, AWS retrieves cost and usage data from the start date up
     *         to, but not including, <code>2017-05-01</code>.
     */

    public String getEnd() {
        return this.end;
    }

    /**
     * <p>
     * The end of the time period that you want the usage and costs for. The end date is exclusive. For example, if
     * <code>end</code> is <code>2017-05-01</code>, AWS retrieves cost and usage data from the start date up to, but not
     * including, <code>2017-05-01</code>.
     * </p>
     * 
     * @param end
     *        The end of the time period that you want the usage and costs for. The end date is exclusive. For example,
     *        if <code>end</code> is <code>2017-05-01</code>, AWS retrieves cost and usage data from the start date up
     *        to, but not including, <code>2017-05-01</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DateInterval withEnd(String end) {
        setEnd(end);
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
        if (getStart() != null)
            sb.append("Start: ").append(getStart()).append(",");
        if (getEnd() != null)
            sb.append("End: ").append(getEnd());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DateInterval == false)
            return false;
        DateInterval other = (DateInterval) obj;
        if (other.getStart() == null ^ this.getStart() == null)
            return false;
        if (other.getStart() != null && other.getStart().equals(this.getStart()) == false)
            return false;
        if (other.getEnd() == null ^ this.getEnd() == null)
            return false;
        if (other.getEnd() != null && other.getEnd().equals(this.getEnd()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStart() == null) ? 0 : getStart().hashCode());
        hashCode = prime * hashCode + ((getEnd() == null) ? 0 : getEnd().hashCode());
        return hashCode;
    }

    @Override
    public DateInterval clone() {
        try {
            return (DateInterval) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.DateIntervalMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
