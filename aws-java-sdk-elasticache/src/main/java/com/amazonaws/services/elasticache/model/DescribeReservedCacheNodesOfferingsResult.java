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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the output of a <code>DescribeReservedCacheNodesOfferings</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeReservedCacheNodesOfferings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReservedCacheNodesOfferingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * A list of reserved cache node offerings. Each element in the list contains detailed information about one
     * offering.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ReservedCacheNodesOffering> reservedCacheNodesOfferings;

    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     * 
     * @param marker
     *        Provides an identifier to allow retrieval of paginated results.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     * 
     * @return Provides an identifier to allow retrieval of paginated results.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     * 
     * @param marker
     *        Provides an identifier to allow retrieval of paginated results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedCacheNodesOfferingsResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * A list of reserved cache node offerings. Each element in the list contains detailed information about one
     * offering.
     * </p>
     * 
     * @return A list of reserved cache node offerings. Each element in the list contains detailed information about one
     *         offering.
     */

    public java.util.List<ReservedCacheNodesOffering> getReservedCacheNodesOfferings() {
        if (reservedCacheNodesOfferings == null) {
            reservedCacheNodesOfferings = new com.amazonaws.internal.SdkInternalList<ReservedCacheNodesOffering>();
        }
        return reservedCacheNodesOfferings;
    }

    /**
     * <p>
     * A list of reserved cache node offerings. Each element in the list contains detailed information about one
     * offering.
     * </p>
     * 
     * @param reservedCacheNodesOfferings
     *        A list of reserved cache node offerings. Each element in the list contains detailed information about one
     *        offering.
     */

    public void setReservedCacheNodesOfferings(java.util.Collection<ReservedCacheNodesOffering> reservedCacheNodesOfferings) {
        if (reservedCacheNodesOfferings == null) {
            this.reservedCacheNodesOfferings = null;
            return;
        }

        this.reservedCacheNodesOfferings = new com.amazonaws.internal.SdkInternalList<ReservedCacheNodesOffering>(reservedCacheNodesOfferings);
    }

    /**
     * <p>
     * A list of reserved cache node offerings. Each element in the list contains detailed information about one
     * offering.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReservedCacheNodesOfferings(java.util.Collection)} or
     * {@link #withReservedCacheNodesOfferings(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param reservedCacheNodesOfferings
     *        A list of reserved cache node offerings. Each element in the list contains detailed information about one
     *        offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedCacheNodesOfferingsResult withReservedCacheNodesOfferings(ReservedCacheNodesOffering... reservedCacheNodesOfferings) {
        if (this.reservedCacheNodesOfferings == null) {
            setReservedCacheNodesOfferings(new com.amazonaws.internal.SdkInternalList<ReservedCacheNodesOffering>(reservedCacheNodesOfferings.length));
        }
        for (ReservedCacheNodesOffering ele : reservedCacheNodesOfferings) {
            this.reservedCacheNodesOfferings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of reserved cache node offerings. Each element in the list contains detailed information about one
     * offering.
     * </p>
     * 
     * @param reservedCacheNodesOfferings
     *        A list of reserved cache node offerings. Each element in the list contains detailed information about one
     *        offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedCacheNodesOfferingsResult withReservedCacheNodesOfferings(
            java.util.Collection<ReservedCacheNodesOffering> reservedCacheNodesOfferings) {
        setReservedCacheNodesOfferings(reservedCacheNodesOfferings);
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
        if (getReservedCacheNodesOfferings() != null)
            sb.append("ReservedCacheNodesOfferings: ").append(getReservedCacheNodesOfferings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeReservedCacheNodesOfferingsResult == false)
            return false;
        DescribeReservedCacheNodesOfferingsResult other = (DescribeReservedCacheNodesOfferingsResult) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getReservedCacheNodesOfferings() == null ^ this.getReservedCacheNodesOfferings() == null)
            return false;
        if (other.getReservedCacheNodesOfferings() != null && other.getReservedCacheNodesOfferings().equals(this.getReservedCacheNodesOfferings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getReservedCacheNodesOfferings() == null) ? 0 : getReservedCacheNodesOfferings().hashCode());
        return hashCode;
    }

    @Override
    public DescribeReservedCacheNodesOfferingsResult clone() {
        try {
            return (DescribeReservedCacheNodesOfferingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
