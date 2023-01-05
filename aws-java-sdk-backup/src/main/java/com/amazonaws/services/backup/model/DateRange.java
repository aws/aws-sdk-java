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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This is a resource filter containing FromDate: DateTime and ToDate: DateTime. Both values are required. Future
 * DateTime values are not permitted.
 * </p>
 * <p>
 * The date and time are in Unix format and Coordinated Universal Time (UTC), and it is accurate to milliseconds
 * ((milliseconds are optional). For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087
 * AM.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DateRange" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DateRange implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * This value is the beginning date, inclusive.
     * </p>
     * <p>
     * The date and time are in Unix format and Coordinated Universal Time (UTC), and it is accurate to milliseconds
     * (milliseconds are optional).
     * </p>
     */
    private java.util.Date fromDate;
    /**
     * <p>
     * This value is the end date, inclusive.
     * </p>
     * <p>
     * The date and time are in Unix format and Coordinated Universal Time (UTC), and it is accurate to milliseconds
     * (milliseconds are optional).
     * </p>
     */
    private java.util.Date toDate;

    /**
     * <p>
     * This value is the beginning date, inclusive.
     * </p>
     * <p>
     * The date and time are in Unix format and Coordinated Universal Time (UTC), and it is accurate to milliseconds
     * (milliseconds are optional).
     * </p>
     * 
     * @param fromDate
     *        This value is the beginning date, inclusive.</p>
     *        <p>
     *        The date and time are in Unix format and Coordinated Universal Time (UTC), and it is accurate to
     *        milliseconds (milliseconds are optional).
     */

    public void setFromDate(java.util.Date fromDate) {
        this.fromDate = fromDate;
    }

    /**
     * <p>
     * This value is the beginning date, inclusive.
     * </p>
     * <p>
     * The date and time are in Unix format and Coordinated Universal Time (UTC), and it is accurate to milliseconds
     * (milliseconds are optional).
     * </p>
     * 
     * @return This value is the beginning date, inclusive.</p>
     *         <p>
     *         The date and time are in Unix format and Coordinated Universal Time (UTC), and it is accurate to
     *         milliseconds (milliseconds are optional).
     */

    public java.util.Date getFromDate() {
        return this.fromDate;
    }

    /**
     * <p>
     * This value is the beginning date, inclusive.
     * </p>
     * <p>
     * The date and time are in Unix format and Coordinated Universal Time (UTC), and it is accurate to milliseconds
     * (milliseconds are optional).
     * </p>
     * 
     * @param fromDate
     *        This value is the beginning date, inclusive.</p>
     *        <p>
     *        The date and time are in Unix format and Coordinated Universal Time (UTC), and it is accurate to
     *        milliseconds (milliseconds are optional).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DateRange withFromDate(java.util.Date fromDate) {
        setFromDate(fromDate);
        return this;
    }

    /**
     * <p>
     * This value is the end date, inclusive.
     * </p>
     * <p>
     * The date and time are in Unix format and Coordinated Universal Time (UTC), and it is accurate to milliseconds
     * (milliseconds are optional).
     * </p>
     * 
     * @param toDate
     *        This value is the end date, inclusive.</p>
     *        <p>
     *        The date and time are in Unix format and Coordinated Universal Time (UTC), and it is accurate to
     *        milliseconds (milliseconds are optional).
     */

    public void setToDate(java.util.Date toDate) {
        this.toDate = toDate;
    }

    /**
     * <p>
     * This value is the end date, inclusive.
     * </p>
     * <p>
     * The date and time are in Unix format and Coordinated Universal Time (UTC), and it is accurate to milliseconds
     * (milliseconds are optional).
     * </p>
     * 
     * @return This value is the end date, inclusive.</p>
     *         <p>
     *         The date and time are in Unix format and Coordinated Universal Time (UTC), and it is accurate to
     *         milliseconds (milliseconds are optional).
     */

    public java.util.Date getToDate() {
        return this.toDate;
    }

    /**
     * <p>
     * This value is the end date, inclusive.
     * </p>
     * <p>
     * The date and time are in Unix format and Coordinated Universal Time (UTC), and it is accurate to milliseconds
     * (milliseconds are optional).
     * </p>
     * 
     * @param toDate
     *        This value is the end date, inclusive.</p>
     *        <p>
     *        The date and time are in Unix format and Coordinated Universal Time (UTC), and it is accurate to
     *        milliseconds (milliseconds are optional).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DateRange withToDate(java.util.Date toDate) {
        setToDate(toDate);
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
        if (getFromDate() != null)
            sb.append("FromDate: ").append(getFromDate()).append(",");
        if (getToDate() != null)
            sb.append("ToDate: ").append(getToDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DateRange == false)
            return false;
        DateRange other = (DateRange) obj;
        if (other.getFromDate() == null ^ this.getFromDate() == null)
            return false;
        if (other.getFromDate() != null && other.getFromDate().equals(this.getFromDate()) == false)
            return false;
        if (other.getToDate() == null ^ this.getToDate() == null)
            return false;
        if (other.getToDate() != null && other.getToDate().equals(this.getToDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFromDate() == null) ? 0 : getFromDate().hashCode());
        hashCode = prime * hashCode + ((getToDate() == null) ? 0 : getToDate().hashCode());
        return hashCode;
    }

    @Override
    public DateRange clone() {
        try {
            return (DateRange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.backup.model.transform.DateRangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
