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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A date filter for querying findings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DateFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DateFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A start date for the date filter.
     * </p>
     */
    private String start;
    /**
     * <p>
     * An end date for the date filter.
     * </p>
     */
    private String end;
    /**
     * <p>
     * A date range for the date filter.
     * </p>
     */
    private DateRange dateRange;

    /**
     * <p>
     * A start date for the date filter.
     * </p>
     * 
     * @param start
     *        A start date for the date filter.
     */

    public void setStart(String start) {
        this.start = start;
    }

    /**
     * <p>
     * A start date for the date filter.
     * </p>
     * 
     * @return A start date for the date filter.
     */

    public String getStart() {
        return this.start;
    }

    /**
     * <p>
     * A start date for the date filter.
     * </p>
     * 
     * @param start
     *        A start date for the date filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DateFilter withStart(String start) {
        setStart(start);
        return this;
    }

    /**
     * <p>
     * An end date for the date filter.
     * </p>
     * 
     * @param end
     *        An end date for the date filter.
     */

    public void setEnd(String end) {
        this.end = end;
    }

    /**
     * <p>
     * An end date for the date filter.
     * </p>
     * 
     * @return An end date for the date filter.
     */

    public String getEnd() {
        return this.end;
    }

    /**
     * <p>
     * An end date for the date filter.
     * </p>
     * 
     * @param end
     *        An end date for the date filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DateFilter withEnd(String end) {
        setEnd(end);
        return this;
    }

    /**
     * <p>
     * A date range for the date filter.
     * </p>
     * 
     * @param dateRange
     *        A date range for the date filter.
     */

    public void setDateRange(DateRange dateRange) {
        this.dateRange = dateRange;
    }

    /**
     * <p>
     * A date range for the date filter.
     * </p>
     * 
     * @return A date range for the date filter.
     */

    public DateRange getDateRange() {
        return this.dateRange;
    }

    /**
     * <p>
     * A date range for the date filter.
     * </p>
     * 
     * @param dateRange
     *        A date range for the date filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DateFilter withDateRange(DateRange dateRange) {
        setDateRange(dateRange);
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
            sb.append("End: ").append(getEnd()).append(",");
        if (getDateRange() != null)
            sb.append("DateRange: ").append(getDateRange());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DateFilter == false)
            return false;
        DateFilter other = (DateFilter) obj;
        if (other.getStart() == null ^ this.getStart() == null)
            return false;
        if (other.getStart() != null && other.getStart().equals(this.getStart()) == false)
            return false;
        if (other.getEnd() == null ^ this.getEnd() == null)
            return false;
        if (other.getEnd() != null && other.getEnd().equals(this.getEnd()) == false)
            return false;
        if (other.getDateRange() == null ^ this.getDateRange() == null)
            return false;
        if (other.getDateRange() != null && other.getDateRange().equals(this.getDateRange()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStart() == null) ? 0 : getStart().hashCode());
        hashCode = prime * hashCode + ((getEnd() == null) ? 0 : getEnd().hashCode());
        hashCode = prime * hashCode + ((getDateRange() == null) ? 0 : getDateRange().hashCode());
        return hashCode;
    }

    @Override
    public DateFilter clone() {
        try {
            return (DateFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.DateFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
