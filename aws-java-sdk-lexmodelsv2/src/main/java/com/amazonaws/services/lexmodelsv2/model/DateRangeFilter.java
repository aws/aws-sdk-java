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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The object used for specifying the data range that the customer wants Amazon Lex to read through in the input
 * transcripts.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DateRangeFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DateRangeFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A timestamp indicating the start date for the date range filter.
     * </p>
     */
    private java.util.Date startDateTime;
    /**
     * <p>
     * A timestamp indicating the end date for the date range filter.
     * </p>
     */
    private java.util.Date endDateTime;

    /**
     * <p>
     * A timestamp indicating the start date for the date range filter.
     * </p>
     * 
     * @param startDateTime
     *        A timestamp indicating the start date for the date range filter.
     */

    public void setStartDateTime(java.util.Date startDateTime) {
        this.startDateTime = startDateTime;
    }

    /**
     * <p>
     * A timestamp indicating the start date for the date range filter.
     * </p>
     * 
     * @return A timestamp indicating the start date for the date range filter.
     */

    public java.util.Date getStartDateTime() {
        return this.startDateTime;
    }

    /**
     * <p>
     * A timestamp indicating the start date for the date range filter.
     * </p>
     * 
     * @param startDateTime
     *        A timestamp indicating the start date for the date range filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DateRangeFilter withStartDateTime(java.util.Date startDateTime) {
        setStartDateTime(startDateTime);
        return this;
    }

    /**
     * <p>
     * A timestamp indicating the end date for the date range filter.
     * </p>
     * 
     * @param endDateTime
     *        A timestamp indicating the end date for the date range filter.
     */

    public void setEndDateTime(java.util.Date endDateTime) {
        this.endDateTime = endDateTime;
    }

    /**
     * <p>
     * A timestamp indicating the end date for the date range filter.
     * </p>
     * 
     * @return A timestamp indicating the end date for the date range filter.
     */

    public java.util.Date getEndDateTime() {
        return this.endDateTime;
    }

    /**
     * <p>
     * A timestamp indicating the end date for the date range filter.
     * </p>
     * 
     * @param endDateTime
     *        A timestamp indicating the end date for the date range filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DateRangeFilter withEndDateTime(java.util.Date endDateTime) {
        setEndDateTime(endDateTime);
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
        if (getStartDateTime() != null)
            sb.append("StartDateTime: ").append(getStartDateTime()).append(",");
        if (getEndDateTime() != null)
            sb.append("EndDateTime: ").append(getEndDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DateRangeFilter == false)
            return false;
        DateRangeFilter other = (DateRangeFilter) obj;
        if (other.getStartDateTime() == null ^ this.getStartDateTime() == null)
            return false;
        if (other.getStartDateTime() != null && other.getStartDateTime().equals(this.getStartDateTime()) == false)
            return false;
        if (other.getEndDateTime() == null ^ this.getEndDateTime() == null)
            return false;
        if (other.getEndDateTime() != null && other.getEndDateTime().equals(this.getEndDateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartDateTime() == null) ? 0 : getStartDateTime().hashCode());
        hashCode = prime * hashCode + ((getEndDateTime() == null) ? 0 : getEndDateTime().hashCode());
        return hashCode;
    }

    @Override
    public DateRangeFilter clone() {
        try {
            return (DateRangeFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.DateRangeFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
