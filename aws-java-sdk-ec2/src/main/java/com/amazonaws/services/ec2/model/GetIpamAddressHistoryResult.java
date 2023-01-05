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
public class GetIpamAddressHistoryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A historical record for a CIDR within an IPAM scope. If the CIDR is associated with an EC2 instance, you will see
     * an object in the response for the instance and one for the network interface.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<IpamAddressHistoryRecord> historyRecords;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A historical record for a CIDR within an IPAM scope. If the CIDR is associated with an EC2 instance, you will see
     * an object in the response for the instance and one for the network interface.
     * </p>
     * 
     * @return A historical record for a CIDR within an IPAM scope. If the CIDR is associated with an EC2 instance, you
     *         will see an object in the response for the instance and one for the network interface.
     */

    public java.util.List<IpamAddressHistoryRecord> getHistoryRecords() {
        if (historyRecords == null) {
            historyRecords = new com.amazonaws.internal.SdkInternalList<IpamAddressHistoryRecord>();
        }
        return historyRecords;
    }

    /**
     * <p>
     * A historical record for a CIDR within an IPAM scope. If the CIDR is associated with an EC2 instance, you will see
     * an object in the response for the instance and one for the network interface.
     * </p>
     * 
     * @param historyRecords
     *        A historical record for a CIDR within an IPAM scope. If the CIDR is associated with an EC2 instance, you
     *        will see an object in the response for the instance and one for the network interface.
     */

    public void setHistoryRecords(java.util.Collection<IpamAddressHistoryRecord> historyRecords) {
        if (historyRecords == null) {
            this.historyRecords = null;
            return;
        }

        this.historyRecords = new com.amazonaws.internal.SdkInternalList<IpamAddressHistoryRecord>(historyRecords);
    }

    /**
     * <p>
     * A historical record for a CIDR within an IPAM scope. If the CIDR is associated with an EC2 instance, you will see
     * an object in the response for the instance and one for the network interface.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHistoryRecords(java.util.Collection)} or {@link #withHistoryRecords(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param historyRecords
     *        A historical record for a CIDR within an IPAM scope. If the CIDR is associated with an EC2 instance, you
     *        will see an object in the response for the instance and one for the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIpamAddressHistoryResult withHistoryRecords(IpamAddressHistoryRecord... historyRecords) {
        if (this.historyRecords == null) {
            setHistoryRecords(new com.amazonaws.internal.SdkInternalList<IpamAddressHistoryRecord>(historyRecords.length));
        }
        for (IpamAddressHistoryRecord ele : historyRecords) {
            this.historyRecords.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A historical record for a CIDR within an IPAM scope. If the CIDR is associated with an EC2 instance, you will see
     * an object in the response for the instance and one for the network interface.
     * </p>
     * 
     * @param historyRecords
     *        A historical record for a CIDR within an IPAM scope. If the CIDR is associated with an EC2 instance, you
     *        will see an object in the response for the instance and one for the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIpamAddressHistoryResult withHistoryRecords(java.util.Collection<IpamAddressHistoryRecord> historyRecords) {
        setHistoryRecords(historyRecords);
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

    public GetIpamAddressHistoryResult withNextToken(String nextToken) {
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
        if (getHistoryRecords() != null)
            sb.append("HistoryRecords: ").append(getHistoryRecords()).append(",");
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

        if (obj instanceof GetIpamAddressHistoryResult == false)
            return false;
        GetIpamAddressHistoryResult other = (GetIpamAddressHistoryResult) obj;
        if (other.getHistoryRecords() == null ^ this.getHistoryRecords() == null)
            return false;
        if (other.getHistoryRecords() != null && other.getHistoryRecords().equals(this.getHistoryRecords()) == false)
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

        hashCode = prime * hashCode + ((getHistoryRecords() == null) ? 0 : getHistoryRecords().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetIpamAddressHistoryResult clone() {
        try {
            return (GetIpamAddressHistoryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
