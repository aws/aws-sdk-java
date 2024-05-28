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
 * <p>
 * Contains the output of DescribeSpotInstanceRequests.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSpotInstanceRequestsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Spot Instance requests.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<SpotInstanceRequest> spotInstanceRequests;
    /**
     * <p>
     * The token to include in another request to get the next page of items. This value is <code>null</code> when there
     * are no more items to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The Spot Instance requests.
     * </p>
     * 
     * @return The Spot Instance requests.
     */

    public java.util.List<SpotInstanceRequest> getSpotInstanceRequests() {
        if (spotInstanceRequests == null) {
            spotInstanceRequests = new com.amazonaws.internal.SdkInternalList<SpotInstanceRequest>();
        }
        return spotInstanceRequests;
    }

    /**
     * <p>
     * The Spot Instance requests.
     * </p>
     * 
     * @param spotInstanceRequests
     *        The Spot Instance requests.
     */

    public void setSpotInstanceRequests(java.util.Collection<SpotInstanceRequest> spotInstanceRequests) {
        if (spotInstanceRequests == null) {
            this.spotInstanceRequests = null;
            return;
        }

        this.spotInstanceRequests = new com.amazonaws.internal.SdkInternalList<SpotInstanceRequest>(spotInstanceRequests);
    }

    /**
     * <p>
     * The Spot Instance requests.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSpotInstanceRequests(java.util.Collection)} or {@link #withSpotInstanceRequests(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param spotInstanceRequests
     *        The Spot Instance requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSpotInstanceRequestsResult withSpotInstanceRequests(SpotInstanceRequest... spotInstanceRequests) {
        if (this.spotInstanceRequests == null) {
            setSpotInstanceRequests(new com.amazonaws.internal.SdkInternalList<SpotInstanceRequest>(spotInstanceRequests.length));
        }
        for (SpotInstanceRequest ele : spotInstanceRequests) {
            this.spotInstanceRequests.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Spot Instance requests.
     * </p>
     * 
     * @param spotInstanceRequests
     *        The Spot Instance requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSpotInstanceRequestsResult withSpotInstanceRequests(java.util.Collection<SpotInstanceRequest> spotInstanceRequests) {
        setSpotInstanceRequests(spotInstanceRequests);
        return this;
    }

    /**
     * <p>
     * The token to include in another request to get the next page of items. This value is <code>null</code> when there
     * are no more items to return.
     * </p>
     * 
     * @param nextToken
     *        The token to include in another request to get the next page of items. This value is <code>null</code>
     *        when there are no more items to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to include in another request to get the next page of items. This value is <code>null</code> when there
     * are no more items to return.
     * </p>
     * 
     * @return The token to include in another request to get the next page of items. This value is <code>null</code>
     *         when there are no more items to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to include in another request to get the next page of items. This value is <code>null</code> when there
     * are no more items to return.
     * </p>
     * 
     * @param nextToken
     *        The token to include in another request to get the next page of items. This value is <code>null</code>
     *        when there are no more items to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSpotInstanceRequestsResult withNextToken(String nextToken) {
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
        if (getSpotInstanceRequests() != null)
            sb.append("SpotInstanceRequests: ").append(getSpotInstanceRequests()).append(",");
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

        if (obj instanceof DescribeSpotInstanceRequestsResult == false)
            return false;
        DescribeSpotInstanceRequestsResult other = (DescribeSpotInstanceRequestsResult) obj;
        if (other.getSpotInstanceRequests() == null ^ this.getSpotInstanceRequests() == null)
            return false;
        if (other.getSpotInstanceRequests() != null && other.getSpotInstanceRequests().equals(this.getSpotInstanceRequests()) == false)
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

        hashCode = prime * hashCode + ((getSpotInstanceRequests() == null) ? 0 : getSpotInstanceRequests().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSpotInstanceRequestsResult clone() {
        try {
            return (DescribeSpotInstanceRequestsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
