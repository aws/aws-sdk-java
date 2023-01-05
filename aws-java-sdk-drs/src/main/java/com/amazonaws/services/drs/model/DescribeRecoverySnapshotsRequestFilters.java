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
package com.amazonaws.services.drs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A set of filters by which to return Recovery Snapshots.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/DescribeRecoverySnapshotsRequestFilters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRecoverySnapshotsRequestFilters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The start date in a date range query.
     * </p>
     */
    private String fromDateTime;
    /**
     * <p>
     * The end date in a date range query.
     * </p>
     */
    private String toDateTime;

    /**
     * <p>
     * The start date in a date range query.
     * </p>
     * 
     * @param fromDateTime
     *        The start date in a date range query.
     */

    public void setFromDateTime(String fromDateTime) {
        this.fromDateTime = fromDateTime;
    }

    /**
     * <p>
     * The start date in a date range query.
     * </p>
     * 
     * @return The start date in a date range query.
     */

    public String getFromDateTime() {
        return this.fromDateTime;
    }

    /**
     * <p>
     * The start date in a date range query.
     * </p>
     * 
     * @param fromDateTime
     *        The start date in a date range query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecoverySnapshotsRequestFilters withFromDateTime(String fromDateTime) {
        setFromDateTime(fromDateTime);
        return this;
    }

    /**
     * <p>
     * The end date in a date range query.
     * </p>
     * 
     * @param toDateTime
     *        The end date in a date range query.
     */

    public void setToDateTime(String toDateTime) {
        this.toDateTime = toDateTime;
    }

    /**
     * <p>
     * The end date in a date range query.
     * </p>
     * 
     * @return The end date in a date range query.
     */

    public String getToDateTime() {
        return this.toDateTime;
    }

    /**
     * <p>
     * The end date in a date range query.
     * </p>
     * 
     * @param toDateTime
     *        The end date in a date range query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecoverySnapshotsRequestFilters withToDateTime(String toDateTime) {
        setToDateTime(toDateTime);
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
        if (getFromDateTime() != null)
            sb.append("FromDateTime: ").append(getFromDateTime()).append(",");
        if (getToDateTime() != null)
            sb.append("ToDateTime: ").append(getToDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeRecoverySnapshotsRequestFilters == false)
            return false;
        DescribeRecoverySnapshotsRequestFilters other = (DescribeRecoverySnapshotsRequestFilters) obj;
        if (other.getFromDateTime() == null ^ this.getFromDateTime() == null)
            return false;
        if (other.getFromDateTime() != null && other.getFromDateTime().equals(this.getFromDateTime()) == false)
            return false;
        if (other.getToDateTime() == null ^ this.getToDateTime() == null)
            return false;
        if (other.getToDateTime() != null && other.getToDateTime().equals(this.getToDateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFromDateTime() == null) ? 0 : getFromDateTime().hashCode());
        hashCode = prime * hashCode + ((getToDateTime() == null) ? 0 : getToDateTime().hashCode());
        return hashCode;
    }

    @Override
    public DescribeRecoverySnapshotsRequestFilters clone() {
        try {
            return (DescribeRecoverySnapshotsRequestFilters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.drs.model.transform.DescribeRecoverySnapshotsRequestFiltersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
