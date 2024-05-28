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
public class DescribeVerifiedAccessEndpointsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Details about the Verified Access endpoints.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<VerifiedAccessEndpoint> verifiedAccessEndpoints;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Details about the Verified Access endpoints.
     * </p>
     * 
     * @return Details about the Verified Access endpoints.
     */

    public java.util.List<VerifiedAccessEndpoint> getVerifiedAccessEndpoints() {
        if (verifiedAccessEndpoints == null) {
            verifiedAccessEndpoints = new com.amazonaws.internal.SdkInternalList<VerifiedAccessEndpoint>();
        }
        return verifiedAccessEndpoints;
    }

    /**
     * <p>
     * Details about the Verified Access endpoints.
     * </p>
     * 
     * @param verifiedAccessEndpoints
     *        Details about the Verified Access endpoints.
     */

    public void setVerifiedAccessEndpoints(java.util.Collection<VerifiedAccessEndpoint> verifiedAccessEndpoints) {
        if (verifiedAccessEndpoints == null) {
            this.verifiedAccessEndpoints = null;
            return;
        }

        this.verifiedAccessEndpoints = new com.amazonaws.internal.SdkInternalList<VerifiedAccessEndpoint>(verifiedAccessEndpoints);
    }

    /**
     * <p>
     * Details about the Verified Access endpoints.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVerifiedAccessEndpoints(java.util.Collection)} or
     * {@link #withVerifiedAccessEndpoints(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param verifiedAccessEndpoints
     *        Details about the Verified Access endpoints.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVerifiedAccessEndpointsResult withVerifiedAccessEndpoints(VerifiedAccessEndpoint... verifiedAccessEndpoints) {
        if (this.verifiedAccessEndpoints == null) {
            setVerifiedAccessEndpoints(new com.amazonaws.internal.SdkInternalList<VerifiedAccessEndpoint>(verifiedAccessEndpoints.length));
        }
        for (VerifiedAccessEndpoint ele : verifiedAccessEndpoints) {
            this.verifiedAccessEndpoints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details about the Verified Access endpoints.
     * </p>
     * 
     * @param verifiedAccessEndpoints
     *        Details about the Verified Access endpoints.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVerifiedAccessEndpointsResult withVerifiedAccessEndpoints(java.util.Collection<VerifiedAccessEndpoint> verifiedAccessEndpoints) {
        setVerifiedAccessEndpoints(verifiedAccessEndpoints);
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

    public DescribeVerifiedAccessEndpointsResult withNextToken(String nextToken) {
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
        if (getVerifiedAccessEndpoints() != null)
            sb.append("VerifiedAccessEndpoints: ").append(getVerifiedAccessEndpoints()).append(",");
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

        if (obj instanceof DescribeVerifiedAccessEndpointsResult == false)
            return false;
        DescribeVerifiedAccessEndpointsResult other = (DescribeVerifiedAccessEndpointsResult) obj;
        if (other.getVerifiedAccessEndpoints() == null ^ this.getVerifiedAccessEndpoints() == null)
            return false;
        if (other.getVerifiedAccessEndpoints() != null && other.getVerifiedAccessEndpoints().equals(this.getVerifiedAccessEndpoints()) == false)
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

        hashCode = prime * hashCode + ((getVerifiedAccessEndpoints() == null) ? 0 : getVerifiedAccessEndpoints().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeVerifiedAccessEndpointsResult clone() {
        try {
            return (DescribeVerifiedAccessEndpointsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
