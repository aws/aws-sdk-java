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
public class DescribeIpamByoasnResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * ASN and BYOIP CIDR associations.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Byoasn> byoasns;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * ASN and BYOIP CIDR associations.
     * </p>
     * 
     * @return ASN and BYOIP CIDR associations.
     */

    public java.util.List<Byoasn> getByoasns() {
        if (byoasns == null) {
            byoasns = new com.amazonaws.internal.SdkInternalList<Byoasn>();
        }
        return byoasns;
    }

    /**
     * <p>
     * ASN and BYOIP CIDR associations.
     * </p>
     * 
     * @param byoasns
     *        ASN and BYOIP CIDR associations.
     */

    public void setByoasns(java.util.Collection<Byoasn> byoasns) {
        if (byoasns == null) {
            this.byoasns = null;
            return;
        }

        this.byoasns = new com.amazonaws.internal.SdkInternalList<Byoasn>(byoasns);
    }

    /**
     * <p>
     * ASN and BYOIP CIDR associations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setByoasns(java.util.Collection)} or {@link #withByoasns(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param byoasns
     *        ASN and BYOIP CIDR associations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIpamByoasnResult withByoasns(Byoasn... byoasns) {
        if (this.byoasns == null) {
            setByoasns(new com.amazonaws.internal.SdkInternalList<Byoasn>(byoasns.length));
        }
        for (Byoasn ele : byoasns) {
            this.byoasns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * ASN and BYOIP CIDR associations.
     * </p>
     * 
     * @param byoasns
     *        ASN and BYOIP CIDR associations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIpamByoasnResult withByoasns(java.util.Collection<Byoasn> byoasns) {
        setByoasns(byoasns);
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

    public DescribeIpamByoasnResult withNextToken(String nextToken) {
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
        if (getByoasns() != null)
            sb.append("Byoasns: ").append(getByoasns()).append(",");
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

        if (obj instanceof DescribeIpamByoasnResult == false)
            return false;
        DescribeIpamByoasnResult other = (DescribeIpamByoasnResult) obj;
        if (other.getByoasns() == null ^ this.getByoasns() == null)
            return false;
        if (other.getByoasns() != null && other.getByoasns().equals(this.getByoasns()) == false)
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

        hashCode = prime * hashCode + ((getByoasns() == null) ? 0 : getByoasns().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeIpamByoasnResult clone() {
        try {
            return (DescribeIpamByoasnResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
