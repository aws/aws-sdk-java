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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeReservedNodeOfferings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReservedNodeOfferingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A value that indicates the starting point for the next set of response records in a subsequent request. If a
     * value is returned in a response, you can retrieve the next set of records by providing this returned marker value
     * in the <code>Marker</code> parameter and retrying the command. If the <code>Marker</code> field is empty, all
     * response records have been retrieved for the request.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * A list of <code>ReservedNodeOffering</code> objects.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ReservedNodeOffering> reservedNodeOfferings;

    /**
     * <p>
     * A value that indicates the starting point for the next set of response records in a subsequent request. If a
     * value is returned in a response, you can retrieve the next set of records by providing this returned marker value
     * in the <code>Marker</code> parameter and retrying the command. If the <code>Marker</code> field is empty, all
     * response records have been retrieved for the request.
     * </p>
     * 
     * @param marker
     *        A value that indicates the starting point for the next set of response records in a subsequent request. If
     *        a value is returned in a response, you can retrieve the next set of records by providing this returned
     *        marker value in the <code>Marker</code> parameter and retrying the command. If the <code>Marker</code>
     *        field is empty, all response records have been retrieved for the request.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * A value that indicates the starting point for the next set of response records in a subsequent request. If a
     * value is returned in a response, you can retrieve the next set of records by providing this returned marker value
     * in the <code>Marker</code> parameter and retrying the command. If the <code>Marker</code> field is empty, all
     * response records have been retrieved for the request.
     * </p>
     * 
     * @return A value that indicates the starting point for the next set of response records in a subsequent request.
     *         If a value is returned in a response, you can retrieve the next set of records by providing this returned
     *         marker value in the <code>Marker</code> parameter and retrying the command. If the <code>Marker</code>
     *         field is empty, all response records have been retrieved for the request.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * A value that indicates the starting point for the next set of response records in a subsequent request. If a
     * value is returned in a response, you can retrieve the next set of records by providing this returned marker value
     * in the <code>Marker</code> parameter and retrying the command. If the <code>Marker</code> field is empty, all
     * response records have been retrieved for the request.
     * </p>
     * 
     * @param marker
     *        A value that indicates the starting point for the next set of response records in a subsequent request. If
     *        a value is returned in a response, you can retrieve the next set of records by providing this returned
     *        marker value in the <code>Marker</code> parameter and retrying the command. If the <code>Marker</code>
     *        field is empty, all response records have been retrieved for the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedNodeOfferingsResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * A list of <code>ReservedNodeOffering</code> objects.
     * </p>
     * 
     * @return A list of <code>ReservedNodeOffering</code> objects.
     */

    public java.util.List<ReservedNodeOffering> getReservedNodeOfferings() {
        if (reservedNodeOfferings == null) {
            reservedNodeOfferings = new com.amazonaws.internal.SdkInternalList<ReservedNodeOffering>();
        }
        return reservedNodeOfferings;
    }

    /**
     * <p>
     * A list of <code>ReservedNodeOffering</code> objects.
     * </p>
     * 
     * @param reservedNodeOfferings
     *        A list of <code>ReservedNodeOffering</code> objects.
     */

    public void setReservedNodeOfferings(java.util.Collection<ReservedNodeOffering> reservedNodeOfferings) {
        if (reservedNodeOfferings == null) {
            this.reservedNodeOfferings = null;
            return;
        }

        this.reservedNodeOfferings = new com.amazonaws.internal.SdkInternalList<ReservedNodeOffering>(reservedNodeOfferings);
    }

    /**
     * <p>
     * A list of <code>ReservedNodeOffering</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReservedNodeOfferings(java.util.Collection)} or
     * {@link #withReservedNodeOfferings(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param reservedNodeOfferings
     *        A list of <code>ReservedNodeOffering</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedNodeOfferingsResult withReservedNodeOfferings(ReservedNodeOffering... reservedNodeOfferings) {
        if (this.reservedNodeOfferings == null) {
            setReservedNodeOfferings(new com.amazonaws.internal.SdkInternalList<ReservedNodeOffering>(reservedNodeOfferings.length));
        }
        for (ReservedNodeOffering ele : reservedNodeOfferings) {
            this.reservedNodeOfferings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>ReservedNodeOffering</code> objects.
     * </p>
     * 
     * @param reservedNodeOfferings
     *        A list of <code>ReservedNodeOffering</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedNodeOfferingsResult withReservedNodeOfferings(java.util.Collection<ReservedNodeOffering> reservedNodeOfferings) {
        setReservedNodeOfferings(reservedNodeOfferings);
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
        if (getReservedNodeOfferings() != null)
            sb.append("ReservedNodeOfferings: ").append(getReservedNodeOfferings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeReservedNodeOfferingsResult == false)
            return false;
        DescribeReservedNodeOfferingsResult other = (DescribeReservedNodeOfferingsResult) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getReservedNodeOfferings() == null ^ this.getReservedNodeOfferings() == null)
            return false;
        if (other.getReservedNodeOfferings() != null && other.getReservedNodeOfferings().equals(this.getReservedNodeOfferings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getReservedNodeOfferings() == null) ? 0 : getReservedNodeOfferings().hashCode());
        return hashCode;
    }

    @Override
    public DescribeReservedNodeOfferingsResult clone() {
        try {
            return (DescribeReservedNodeOfferingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
