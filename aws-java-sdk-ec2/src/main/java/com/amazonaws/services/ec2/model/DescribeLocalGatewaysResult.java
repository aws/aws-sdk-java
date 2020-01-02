/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
public class DescribeLocalGatewaysResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the local gateways.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<LocalGateway> localGateways;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the local gateways.
     * </p>
     * 
     * @return Information about the local gateways.
     */

    public java.util.List<LocalGateway> getLocalGateways() {
        if (localGateways == null) {
            localGateways = new com.amazonaws.internal.SdkInternalList<LocalGateway>();
        }
        return localGateways;
    }

    /**
     * <p>
     * Information about the local gateways.
     * </p>
     * 
     * @param localGateways
     *        Information about the local gateways.
     */

    public void setLocalGateways(java.util.Collection<LocalGateway> localGateways) {
        if (localGateways == null) {
            this.localGateways = null;
            return;
        }

        this.localGateways = new com.amazonaws.internal.SdkInternalList<LocalGateway>(localGateways);
    }

    /**
     * <p>
     * Information about the local gateways.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLocalGateways(java.util.Collection)} or {@link #withLocalGateways(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param localGateways
     *        Information about the local gateways.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocalGatewaysResult withLocalGateways(LocalGateway... localGateways) {
        if (this.localGateways == null) {
            setLocalGateways(new com.amazonaws.internal.SdkInternalList<LocalGateway>(localGateways.length));
        }
        for (LocalGateway ele : localGateways) {
            this.localGateways.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the local gateways.
     * </p>
     * 
     * @param localGateways
     *        Information about the local gateways.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocalGatewaysResult withLocalGateways(java.util.Collection<LocalGateway> localGateways) {
        setLocalGateways(localGateways);
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

    public DescribeLocalGatewaysResult withNextToken(String nextToken) {
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
        if (getLocalGateways() != null)
            sb.append("LocalGateways: ").append(getLocalGateways()).append(",");
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

        if (obj instanceof DescribeLocalGatewaysResult == false)
            return false;
        DescribeLocalGatewaysResult other = (DescribeLocalGatewaysResult) obj;
        if (other.getLocalGateways() == null ^ this.getLocalGateways() == null)
            return false;
        if (other.getLocalGateways() != null && other.getLocalGateways().equals(this.getLocalGateways()) == false)
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

        hashCode = prime * hashCode + ((getLocalGateways() == null) ? 0 : getLocalGateways().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeLocalGatewaysResult clone() {
        try {
            return (DescribeLocalGatewaysResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
