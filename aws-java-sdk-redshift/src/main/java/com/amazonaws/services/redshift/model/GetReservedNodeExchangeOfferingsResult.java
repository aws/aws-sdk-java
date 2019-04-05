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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/GetReservedNodeExchangeOfferings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetReservedNodeExchangeOfferingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * An optional parameter that specifies the starting point for returning a set of response records. When the results
     * of a <code>GetReservedNodeExchangeOfferings</code> request exceed the value specified in MaxRecords, Amazon
     * Redshift returns a value in the marker field of the response. You can retrieve the next set of response records
     * by providing the returned marker value in the marker parameter and retrying the request.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * Returns an array of <a>ReservedNodeOffering</a> objects.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ReservedNodeOffering> reservedNodeOfferings;

    /**
     * <p>
     * An optional parameter that specifies the starting point for returning a set of response records. When the results
     * of a <code>GetReservedNodeExchangeOfferings</code> request exceed the value specified in MaxRecords, Amazon
     * Redshift returns a value in the marker field of the response. You can retrieve the next set of response records
     * by providing the returned marker value in the marker parameter and retrying the request.
     * </p>
     * 
     * @param marker
     *        An optional parameter that specifies the starting point for returning a set of response records. When the
     *        results of a <code>GetReservedNodeExchangeOfferings</code> request exceed the value specified in
     *        MaxRecords, Amazon Redshift returns a value in the marker field of the response. You can retrieve the next
     *        set of response records by providing the returned marker value in the marker parameter and retrying the
     *        request.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional parameter that specifies the starting point for returning a set of response records. When the results
     * of a <code>GetReservedNodeExchangeOfferings</code> request exceed the value specified in MaxRecords, Amazon
     * Redshift returns a value in the marker field of the response. You can retrieve the next set of response records
     * by providing the returned marker value in the marker parameter and retrying the request.
     * </p>
     * 
     * @return An optional parameter that specifies the starting point for returning a set of response records. When the
     *         results of a <code>GetReservedNodeExchangeOfferings</code> request exceed the value specified in
     *         MaxRecords, Amazon Redshift returns a value in the marker field of the response. You can retrieve the
     *         next set of response records by providing the returned marker value in the marker parameter and retrying
     *         the request.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional parameter that specifies the starting point for returning a set of response records. When the results
     * of a <code>GetReservedNodeExchangeOfferings</code> request exceed the value specified in MaxRecords, Amazon
     * Redshift returns a value in the marker field of the response. You can retrieve the next set of response records
     * by providing the returned marker value in the marker parameter and retrying the request.
     * </p>
     * 
     * @param marker
     *        An optional parameter that specifies the starting point for returning a set of response records. When the
     *        results of a <code>GetReservedNodeExchangeOfferings</code> request exceed the value specified in
     *        MaxRecords, Amazon Redshift returns a value in the marker field of the response. You can retrieve the next
     *        set of response records by providing the returned marker value in the marker parameter and retrying the
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReservedNodeExchangeOfferingsResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * Returns an array of <a>ReservedNodeOffering</a> objects.
     * </p>
     * 
     * @return Returns an array of <a>ReservedNodeOffering</a> objects.
     */

    public java.util.List<ReservedNodeOffering> getReservedNodeOfferings() {
        if (reservedNodeOfferings == null) {
            reservedNodeOfferings = new com.amazonaws.internal.SdkInternalList<ReservedNodeOffering>();
        }
        return reservedNodeOfferings;
    }

    /**
     * <p>
     * Returns an array of <a>ReservedNodeOffering</a> objects.
     * </p>
     * 
     * @param reservedNodeOfferings
     *        Returns an array of <a>ReservedNodeOffering</a> objects.
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
     * Returns an array of <a>ReservedNodeOffering</a> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReservedNodeOfferings(java.util.Collection)} or
     * {@link #withReservedNodeOfferings(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param reservedNodeOfferings
     *        Returns an array of <a>ReservedNodeOffering</a> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReservedNodeExchangeOfferingsResult withReservedNodeOfferings(ReservedNodeOffering... reservedNodeOfferings) {
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
     * Returns an array of <a>ReservedNodeOffering</a> objects.
     * </p>
     * 
     * @param reservedNodeOfferings
     *        Returns an array of <a>ReservedNodeOffering</a> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReservedNodeExchangeOfferingsResult withReservedNodeOfferings(java.util.Collection<ReservedNodeOffering> reservedNodeOfferings) {
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

        if (obj instanceof GetReservedNodeExchangeOfferingsResult == false)
            return false;
        GetReservedNodeExchangeOfferingsResult other = (GetReservedNodeExchangeOfferingsResult) obj;
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
    public GetReservedNodeExchangeOfferingsResult clone() {
        try {
            return (GetReservedNodeExchangeOfferingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
