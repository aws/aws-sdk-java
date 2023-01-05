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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSubnetCidrReservationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the IPv4 subnet CIDR reservations.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<SubnetCidrReservation> subnetIpv4CidrReservations;
    /**
     * <p>
     * Information about the IPv6 subnet CIDR reservations.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<SubnetCidrReservation> subnetIpv6CidrReservations;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the IPv4 subnet CIDR reservations.
     * </p>
     * 
     * @return Information about the IPv4 subnet CIDR reservations.
     */

    public java.util.List<SubnetCidrReservation> getSubnetIpv4CidrReservations() {
        if (subnetIpv4CidrReservations == null) {
            subnetIpv4CidrReservations = new com.amazonaws.internal.SdkInternalList<SubnetCidrReservation>();
        }
        return subnetIpv4CidrReservations;
    }

    /**
     * <p>
     * Information about the IPv4 subnet CIDR reservations.
     * </p>
     * 
     * @param subnetIpv4CidrReservations
     *        Information about the IPv4 subnet CIDR reservations.
     */

    public void setSubnetIpv4CidrReservations(java.util.Collection<SubnetCidrReservation> subnetIpv4CidrReservations) {
        if (subnetIpv4CidrReservations == null) {
            this.subnetIpv4CidrReservations = null;
            return;
        }

        this.subnetIpv4CidrReservations = new com.amazonaws.internal.SdkInternalList<SubnetCidrReservation>(subnetIpv4CidrReservations);
    }

    /**
     * <p>
     * Information about the IPv4 subnet CIDR reservations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIpv4CidrReservations(java.util.Collection)} or
     * {@link #withSubnetIpv4CidrReservations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param subnetIpv4CidrReservations
     *        Information about the IPv4 subnet CIDR reservations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSubnetCidrReservationsResult withSubnetIpv4CidrReservations(SubnetCidrReservation... subnetIpv4CidrReservations) {
        if (this.subnetIpv4CidrReservations == null) {
            setSubnetIpv4CidrReservations(new com.amazonaws.internal.SdkInternalList<SubnetCidrReservation>(subnetIpv4CidrReservations.length));
        }
        for (SubnetCidrReservation ele : subnetIpv4CidrReservations) {
            this.subnetIpv4CidrReservations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the IPv4 subnet CIDR reservations.
     * </p>
     * 
     * @param subnetIpv4CidrReservations
     *        Information about the IPv4 subnet CIDR reservations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSubnetCidrReservationsResult withSubnetIpv4CidrReservations(java.util.Collection<SubnetCidrReservation> subnetIpv4CidrReservations) {
        setSubnetIpv4CidrReservations(subnetIpv4CidrReservations);
        return this;
    }

    /**
     * <p>
     * Information about the IPv6 subnet CIDR reservations.
     * </p>
     * 
     * @return Information about the IPv6 subnet CIDR reservations.
     */

    public java.util.List<SubnetCidrReservation> getSubnetIpv6CidrReservations() {
        if (subnetIpv6CidrReservations == null) {
            subnetIpv6CidrReservations = new com.amazonaws.internal.SdkInternalList<SubnetCidrReservation>();
        }
        return subnetIpv6CidrReservations;
    }

    /**
     * <p>
     * Information about the IPv6 subnet CIDR reservations.
     * </p>
     * 
     * @param subnetIpv6CidrReservations
     *        Information about the IPv6 subnet CIDR reservations.
     */

    public void setSubnetIpv6CidrReservations(java.util.Collection<SubnetCidrReservation> subnetIpv6CidrReservations) {
        if (subnetIpv6CidrReservations == null) {
            this.subnetIpv6CidrReservations = null;
            return;
        }

        this.subnetIpv6CidrReservations = new com.amazonaws.internal.SdkInternalList<SubnetCidrReservation>(subnetIpv6CidrReservations);
    }

    /**
     * <p>
     * Information about the IPv6 subnet CIDR reservations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIpv6CidrReservations(java.util.Collection)} or
     * {@link #withSubnetIpv6CidrReservations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param subnetIpv6CidrReservations
     *        Information about the IPv6 subnet CIDR reservations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSubnetCidrReservationsResult withSubnetIpv6CidrReservations(SubnetCidrReservation... subnetIpv6CidrReservations) {
        if (this.subnetIpv6CidrReservations == null) {
            setSubnetIpv6CidrReservations(new com.amazonaws.internal.SdkInternalList<SubnetCidrReservation>(subnetIpv6CidrReservations.length));
        }
        for (SubnetCidrReservation ele : subnetIpv6CidrReservations) {
            this.subnetIpv6CidrReservations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the IPv6 subnet CIDR reservations.
     * </p>
     * 
     * @param subnetIpv6CidrReservations
     *        Information about the IPv6 subnet CIDR reservations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSubnetCidrReservationsResult withSubnetIpv6CidrReservations(java.util.Collection<SubnetCidrReservation> subnetIpv6CidrReservations) {
        setSubnetIpv6CidrReservations(subnetIpv6CidrReservations);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *         more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSubnetCidrReservationsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getSubnetIpv4CidrReservations() != null)
            sb.append("SubnetIpv4CidrReservations: ").append(getSubnetIpv4CidrReservations()).append(",");
        if (getSubnetIpv6CidrReservations() != null)
            sb.append("SubnetIpv6CidrReservations: ").append(getSubnetIpv6CidrReservations()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSubnetCidrReservationsResult == false)
            return false;
        GetSubnetCidrReservationsResult other = (GetSubnetCidrReservationsResult) obj;
        if (other.getSubnetIpv4CidrReservations() == null ^ this.getSubnetIpv4CidrReservations() == null)
            return false;
        if (other.getSubnetIpv4CidrReservations() != null && other.getSubnetIpv4CidrReservations().equals(this.getSubnetIpv4CidrReservations()) == false)
            return false;
        if (other.getSubnetIpv6CidrReservations() == null ^ this.getSubnetIpv6CidrReservations() == null)
            return false;
        if (other.getSubnetIpv6CidrReservations() != null && other.getSubnetIpv6CidrReservations().equals(this.getSubnetIpv6CidrReservations()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubnetIpv4CidrReservations() == null) ? 0 : getSubnetIpv4CidrReservations().hashCode());
        hashCode = prime * hashCode + ((getSubnetIpv6CidrReservations() == null) ? 0 : getSubnetIpv6CidrReservations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetSubnetCidrReservationsResult clone() {
        try {
            return (GetSubnetCidrReservationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
