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
public class DescribeAddressTransfersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Elastic IP address transfer.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AddressTransfer> addressTransfers;
    /**
     * <p>
     * Specify the pagination token from a previous request to retrieve the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The Elastic IP address transfer.
     * </p>
     * 
     * @return The Elastic IP address transfer.
     */

    public java.util.List<AddressTransfer> getAddressTransfers() {
        if (addressTransfers == null) {
            addressTransfers = new com.amazonaws.internal.SdkInternalList<AddressTransfer>();
        }
        return addressTransfers;
    }

    /**
     * <p>
     * The Elastic IP address transfer.
     * </p>
     * 
     * @param addressTransfers
     *        The Elastic IP address transfer.
     */

    public void setAddressTransfers(java.util.Collection<AddressTransfer> addressTransfers) {
        if (addressTransfers == null) {
            this.addressTransfers = null;
            return;
        }

        this.addressTransfers = new com.amazonaws.internal.SdkInternalList<AddressTransfer>(addressTransfers);
    }

    /**
     * <p>
     * The Elastic IP address transfer.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAddressTransfers(java.util.Collection)} or {@link #withAddressTransfers(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param addressTransfers
     *        The Elastic IP address transfer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAddressTransfersResult withAddressTransfers(AddressTransfer... addressTransfers) {
        if (this.addressTransfers == null) {
            setAddressTransfers(new com.amazonaws.internal.SdkInternalList<AddressTransfer>(addressTransfers.length));
        }
        for (AddressTransfer ele : addressTransfers) {
            this.addressTransfers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Elastic IP address transfer.
     * </p>
     * 
     * @param addressTransfers
     *        The Elastic IP address transfer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAddressTransfersResult withAddressTransfers(java.util.Collection<AddressTransfer> addressTransfers) {
        setAddressTransfers(addressTransfers);
        return this;
    }

    /**
     * <p>
     * Specify the pagination token from a previous request to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Specify the pagination token from a previous request to retrieve the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Specify the pagination token from a previous request to retrieve the next page of results.
     * </p>
     * 
     * @return Specify the pagination token from a previous request to retrieve the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Specify the pagination token from a previous request to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Specify the pagination token from a previous request to retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAddressTransfersResult withNextToken(String nextToken) {
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
        if (getAddressTransfers() != null)
            sb.append("AddressTransfers: ").append(getAddressTransfers()).append(",");
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

        if (obj instanceof DescribeAddressTransfersResult == false)
            return false;
        DescribeAddressTransfersResult other = (DescribeAddressTransfersResult) obj;
        if (other.getAddressTransfers() == null ^ this.getAddressTransfers() == null)
            return false;
        if (other.getAddressTransfers() != null && other.getAddressTransfers().equals(this.getAddressTransfers()) == false)
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

        hashCode = prime * hashCode + ((getAddressTransfers() == null) ? 0 : getAddressTransfers().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAddressTransfersResult clone() {
        try {
            return (DescribeAddressTransfersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
