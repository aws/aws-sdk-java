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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListCidrBlocks" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCidrBlocksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An opaque pagination token to indicate where the service is to begin enumerating results.
     * </p>
     * <p>
     * If no value is provided, the listing of results starts from the beginning.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A complex type that contains information about the CIDR blocks.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<CidrBlockSummary> cidrBlocks;

    /**
     * <p>
     * An opaque pagination token to indicate where the service is to begin enumerating results.
     * </p>
     * <p>
     * If no value is provided, the listing of results starts from the beginning.
     * </p>
     * 
     * @param nextToken
     *        An opaque pagination token to indicate where the service is to begin enumerating results. </p>
     *        <p>
     *        If no value is provided, the listing of results starts from the beginning.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An opaque pagination token to indicate where the service is to begin enumerating results.
     * </p>
     * <p>
     * If no value is provided, the listing of results starts from the beginning.
     * </p>
     * 
     * @return An opaque pagination token to indicate where the service is to begin enumerating results. </p>
     *         <p>
     *         If no value is provided, the listing of results starts from the beginning.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An opaque pagination token to indicate where the service is to begin enumerating results.
     * </p>
     * <p>
     * If no value is provided, the listing of results starts from the beginning.
     * </p>
     * 
     * @param nextToken
     *        An opaque pagination token to indicate where the service is to begin enumerating results. </p>
     *        <p>
     *        If no value is provided, the listing of results starts from the beginning.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCidrBlocksResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A complex type that contains information about the CIDR blocks.
     * </p>
     * 
     * @return A complex type that contains information about the CIDR blocks.
     */

    public java.util.List<CidrBlockSummary> getCidrBlocks() {
        if (cidrBlocks == null) {
            cidrBlocks = new com.amazonaws.internal.SdkInternalList<CidrBlockSummary>();
        }
        return cidrBlocks;
    }

    /**
     * <p>
     * A complex type that contains information about the CIDR blocks.
     * </p>
     * 
     * @param cidrBlocks
     *        A complex type that contains information about the CIDR blocks.
     */

    public void setCidrBlocks(java.util.Collection<CidrBlockSummary> cidrBlocks) {
        if (cidrBlocks == null) {
            this.cidrBlocks = null;
            return;
        }

        this.cidrBlocks = new com.amazonaws.internal.SdkInternalList<CidrBlockSummary>(cidrBlocks);
    }

    /**
     * <p>
     * A complex type that contains information about the CIDR blocks.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCidrBlocks(java.util.Collection)} or {@link #withCidrBlocks(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param cidrBlocks
     *        A complex type that contains information about the CIDR blocks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCidrBlocksResult withCidrBlocks(CidrBlockSummary... cidrBlocks) {
        if (this.cidrBlocks == null) {
            setCidrBlocks(new com.amazonaws.internal.SdkInternalList<CidrBlockSummary>(cidrBlocks.length));
        }
        for (CidrBlockSummary ele : cidrBlocks) {
            this.cidrBlocks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A complex type that contains information about the CIDR blocks.
     * </p>
     * 
     * @param cidrBlocks
     *        A complex type that contains information about the CIDR blocks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCidrBlocksResult withCidrBlocks(java.util.Collection<CidrBlockSummary> cidrBlocks) {
        setCidrBlocks(cidrBlocks);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getCidrBlocks() != null)
            sb.append("CidrBlocks: ").append(getCidrBlocks());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCidrBlocksResult == false)
            return false;
        ListCidrBlocksResult other = (ListCidrBlocksResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getCidrBlocks() == null ^ this.getCidrBlocks() == null)
            return false;
        if (other.getCidrBlocks() != null && other.getCidrBlocks().equals(this.getCidrBlocks()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getCidrBlocks() == null) ? 0 : getCidrBlocks().hashCode());
        return hashCode;
    }

    @Override
    public ListCidrBlocksResult clone() {
        try {
            return (ListCidrBlocksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
