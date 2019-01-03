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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeHostReservationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Details about the reservation's configuration.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<HostReservation> hostReservationSet;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Details about the reservation's configuration.
     * </p>
     * 
     * @return Details about the reservation's configuration.
     */

    public java.util.List<HostReservation> getHostReservationSet() {
        if (hostReservationSet == null) {
            hostReservationSet = new com.amazonaws.internal.SdkInternalList<HostReservation>();
        }
        return hostReservationSet;
    }

    /**
     * <p>
     * Details about the reservation's configuration.
     * </p>
     * 
     * @param hostReservationSet
     *        Details about the reservation's configuration.
     */

    public void setHostReservationSet(java.util.Collection<HostReservation> hostReservationSet) {
        if (hostReservationSet == null) {
            this.hostReservationSet = null;
            return;
        }

        this.hostReservationSet = new com.amazonaws.internal.SdkInternalList<HostReservation>(hostReservationSet);
    }

    /**
     * <p>
     * Details about the reservation's configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHostReservationSet(java.util.Collection)} or {@link #withHostReservationSet(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param hostReservationSet
     *        Details about the reservation's configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHostReservationsResult withHostReservationSet(HostReservation... hostReservationSet) {
        if (this.hostReservationSet == null) {
            setHostReservationSet(new com.amazonaws.internal.SdkInternalList<HostReservation>(hostReservationSet.length));
        }
        for (HostReservation ele : hostReservationSet) {
            this.hostReservationSet.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details about the reservation's configuration.
     * </p>
     * 
     * @param hostReservationSet
     *        Details about the reservation's configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHostReservationsResult withHostReservationSet(java.util.Collection<HostReservation> hostReservationSet) {
        setHostReservationSet(hostReservationSet);
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

    public DescribeHostReservationsResult withNextToken(String nextToken) {
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
        if (getHostReservationSet() != null)
            sb.append("HostReservationSet: ").append(getHostReservationSet()).append(",");
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

        if (obj instanceof DescribeHostReservationsResult == false)
            return false;
        DescribeHostReservationsResult other = (DescribeHostReservationsResult) obj;
        if (other.getHostReservationSet() == null ^ this.getHostReservationSet() == null)
            return false;
        if (other.getHostReservationSet() != null && other.getHostReservationSet().equals(this.getHostReservationSet()) == false)
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

        hashCode = prime * hashCode + ((getHostReservationSet() == null) ? 0 : getHostReservationSet().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeHostReservationsResult clone() {
        try {
            return (DescribeHostReservationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
