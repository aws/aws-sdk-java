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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the result of a successful invocation of the <a>DescribeReservedDBInstancesOfferings</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeReservedDBInstancesOfferings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReservedDBInstancesOfferingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * A list of reserved DB instance offerings.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ReservedDBInstancesOffering> reservedDBInstancesOfferings;

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous request. If this parameter is specified, the response
     *        includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @return An optional pagination token provided by a previous request. If this parameter is specified, the response
     *         includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous request. If this parameter is specified, the response
     *        includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedDBInstancesOfferingsResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * A list of reserved DB instance offerings.
     * </p>
     * 
     * @return A list of reserved DB instance offerings.
     */

    public java.util.List<ReservedDBInstancesOffering> getReservedDBInstancesOfferings() {
        if (reservedDBInstancesOfferings == null) {
            reservedDBInstancesOfferings = new com.amazonaws.internal.SdkInternalList<ReservedDBInstancesOffering>();
        }
        return reservedDBInstancesOfferings;
    }

    /**
     * <p>
     * A list of reserved DB instance offerings.
     * </p>
     * 
     * @param reservedDBInstancesOfferings
     *        A list of reserved DB instance offerings.
     */

    public void setReservedDBInstancesOfferings(java.util.Collection<ReservedDBInstancesOffering> reservedDBInstancesOfferings) {
        if (reservedDBInstancesOfferings == null) {
            this.reservedDBInstancesOfferings = null;
            return;
        }

        this.reservedDBInstancesOfferings = new com.amazonaws.internal.SdkInternalList<ReservedDBInstancesOffering>(reservedDBInstancesOfferings);
    }

    /**
     * <p>
     * A list of reserved DB instance offerings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReservedDBInstancesOfferings(java.util.Collection)} or
     * {@link #withReservedDBInstancesOfferings(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param reservedDBInstancesOfferings
     *        A list of reserved DB instance offerings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedDBInstancesOfferingsResult withReservedDBInstancesOfferings(ReservedDBInstancesOffering... reservedDBInstancesOfferings) {
        if (this.reservedDBInstancesOfferings == null) {
            setReservedDBInstancesOfferings(new com.amazonaws.internal.SdkInternalList<ReservedDBInstancesOffering>(reservedDBInstancesOfferings.length));
        }
        for (ReservedDBInstancesOffering ele : reservedDBInstancesOfferings) {
            this.reservedDBInstancesOfferings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of reserved DB instance offerings.
     * </p>
     * 
     * @param reservedDBInstancesOfferings
     *        A list of reserved DB instance offerings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedDBInstancesOfferingsResult withReservedDBInstancesOfferings(
            java.util.Collection<ReservedDBInstancesOffering> reservedDBInstancesOfferings) {
        setReservedDBInstancesOfferings(reservedDBInstancesOfferings);
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
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getReservedDBInstancesOfferings() != null)
            sb.append("ReservedDBInstancesOfferings: ").append(getReservedDBInstancesOfferings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeReservedDBInstancesOfferingsResult == false)
            return false;
        DescribeReservedDBInstancesOfferingsResult other = (DescribeReservedDBInstancesOfferingsResult) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getReservedDBInstancesOfferings() == null ^ this.getReservedDBInstancesOfferings() == null)
            return false;
        if (other.getReservedDBInstancesOfferings() != null && other.getReservedDBInstancesOfferings().equals(this.getReservedDBInstancesOfferings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getReservedDBInstancesOfferings() == null) ? 0 : getReservedDBInstancesOfferings().hashCode());
        return hashCode;
    }

    @Override
    public DescribeReservedDBInstancesOfferingsResult clone() {
        try {
            return (DescribeReservedDBInstancesOfferingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
