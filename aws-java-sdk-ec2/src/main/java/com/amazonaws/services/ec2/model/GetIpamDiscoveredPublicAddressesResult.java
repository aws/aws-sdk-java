/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
public class GetIpamDiscoveredPublicAddressesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * IPAM discovered public addresses.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<IpamDiscoveredPublicAddress> ipamDiscoveredPublicAddresses;
    /**
     * <p>
     * The oldest successful resource discovery time.
     * </p>
     */
    private java.util.Date oldestSampleTime;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * IPAM discovered public addresses.
     * </p>
     * 
     * @return IPAM discovered public addresses.
     */

    public java.util.List<IpamDiscoveredPublicAddress> getIpamDiscoveredPublicAddresses() {
        if (ipamDiscoveredPublicAddresses == null) {
            ipamDiscoveredPublicAddresses = new com.amazonaws.internal.SdkInternalList<IpamDiscoveredPublicAddress>();
        }
        return ipamDiscoveredPublicAddresses;
    }

    /**
     * <p>
     * IPAM discovered public addresses.
     * </p>
     * 
     * @param ipamDiscoveredPublicAddresses
     *        IPAM discovered public addresses.
     */

    public void setIpamDiscoveredPublicAddresses(java.util.Collection<IpamDiscoveredPublicAddress> ipamDiscoveredPublicAddresses) {
        if (ipamDiscoveredPublicAddresses == null) {
            this.ipamDiscoveredPublicAddresses = null;
            return;
        }

        this.ipamDiscoveredPublicAddresses = new com.amazonaws.internal.SdkInternalList<IpamDiscoveredPublicAddress>(ipamDiscoveredPublicAddresses);
    }

    /**
     * <p>
     * IPAM discovered public addresses.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpamDiscoveredPublicAddresses(java.util.Collection)} or
     * {@link #withIpamDiscoveredPublicAddresses(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param ipamDiscoveredPublicAddresses
     *        IPAM discovered public addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIpamDiscoveredPublicAddressesResult withIpamDiscoveredPublicAddresses(IpamDiscoveredPublicAddress... ipamDiscoveredPublicAddresses) {
        if (this.ipamDiscoveredPublicAddresses == null) {
            setIpamDiscoveredPublicAddresses(new com.amazonaws.internal.SdkInternalList<IpamDiscoveredPublicAddress>(ipamDiscoveredPublicAddresses.length));
        }
        for (IpamDiscoveredPublicAddress ele : ipamDiscoveredPublicAddresses) {
            this.ipamDiscoveredPublicAddresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * IPAM discovered public addresses.
     * </p>
     * 
     * @param ipamDiscoveredPublicAddresses
     *        IPAM discovered public addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIpamDiscoveredPublicAddressesResult withIpamDiscoveredPublicAddresses(
            java.util.Collection<IpamDiscoveredPublicAddress> ipamDiscoveredPublicAddresses) {
        setIpamDiscoveredPublicAddresses(ipamDiscoveredPublicAddresses);
        return this;
    }

    /**
     * <p>
     * The oldest successful resource discovery time.
     * </p>
     * 
     * @param oldestSampleTime
     *        The oldest successful resource discovery time.
     */

    public void setOldestSampleTime(java.util.Date oldestSampleTime) {
        this.oldestSampleTime = oldestSampleTime;
    }

    /**
     * <p>
     * The oldest successful resource discovery time.
     * </p>
     * 
     * @return The oldest successful resource discovery time.
     */

    public java.util.Date getOldestSampleTime() {
        return this.oldestSampleTime;
    }

    /**
     * <p>
     * The oldest successful resource discovery time.
     * </p>
     * 
     * @param oldestSampleTime
     *        The oldest successful resource discovery time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIpamDiscoveredPublicAddressesResult withOldestSampleTime(java.util.Date oldestSampleTime) {
        setOldestSampleTime(oldestSampleTime);
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

    public GetIpamDiscoveredPublicAddressesResult withNextToken(String nextToken) {
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
        if (getIpamDiscoveredPublicAddresses() != null)
            sb.append("IpamDiscoveredPublicAddresses: ").append(getIpamDiscoveredPublicAddresses()).append(",");
        if (getOldestSampleTime() != null)
            sb.append("OldestSampleTime: ").append(getOldestSampleTime()).append(",");
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

        if (obj instanceof GetIpamDiscoveredPublicAddressesResult == false)
            return false;
        GetIpamDiscoveredPublicAddressesResult other = (GetIpamDiscoveredPublicAddressesResult) obj;
        if (other.getIpamDiscoveredPublicAddresses() == null ^ this.getIpamDiscoveredPublicAddresses() == null)
            return false;
        if (other.getIpamDiscoveredPublicAddresses() != null
                && other.getIpamDiscoveredPublicAddresses().equals(this.getIpamDiscoveredPublicAddresses()) == false)
            return false;
        if (other.getOldestSampleTime() == null ^ this.getOldestSampleTime() == null)
            return false;
        if (other.getOldestSampleTime() != null && other.getOldestSampleTime().equals(this.getOldestSampleTime()) == false)
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

        hashCode = prime * hashCode + ((getIpamDiscoveredPublicAddresses() == null) ? 0 : getIpamDiscoveredPublicAddresses().hashCode());
        hashCode = prime * hashCode + ((getOldestSampleTime() == null) ? 0 : getOldestSampleTime().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetIpamDiscoveredPublicAddressesResult clone() {
        try {
            return (GetIpamDiscoveredPublicAddressesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
