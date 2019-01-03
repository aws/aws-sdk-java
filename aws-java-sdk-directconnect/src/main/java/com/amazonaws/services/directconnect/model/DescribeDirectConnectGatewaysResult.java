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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeDirectConnectGateways"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDirectConnectGatewaysResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The Direct Connect gateways.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DirectConnectGateway> directConnectGateways;
    /**
     * <p>
     * The token to retrieve the next page.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The Direct Connect gateways.
     * </p>
     * 
     * @return The Direct Connect gateways.
     */

    public java.util.List<DirectConnectGateway> getDirectConnectGateways() {
        if (directConnectGateways == null) {
            directConnectGateways = new com.amazonaws.internal.SdkInternalList<DirectConnectGateway>();
        }
        return directConnectGateways;
    }

    /**
     * <p>
     * The Direct Connect gateways.
     * </p>
     * 
     * @param directConnectGateways
     *        The Direct Connect gateways.
     */

    public void setDirectConnectGateways(java.util.Collection<DirectConnectGateway> directConnectGateways) {
        if (directConnectGateways == null) {
            this.directConnectGateways = null;
            return;
        }

        this.directConnectGateways = new com.amazonaws.internal.SdkInternalList<DirectConnectGateway>(directConnectGateways);
    }

    /**
     * <p>
     * The Direct Connect gateways.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDirectConnectGateways(java.util.Collection)} or
     * {@link #withDirectConnectGateways(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param directConnectGateways
     *        The Direct Connect gateways.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDirectConnectGatewaysResult withDirectConnectGateways(DirectConnectGateway... directConnectGateways) {
        if (this.directConnectGateways == null) {
            setDirectConnectGateways(new com.amazonaws.internal.SdkInternalList<DirectConnectGateway>(directConnectGateways.length));
        }
        for (DirectConnectGateway ele : directConnectGateways) {
            this.directConnectGateways.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Direct Connect gateways.
     * </p>
     * 
     * @param directConnectGateways
     *        The Direct Connect gateways.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDirectConnectGatewaysResult withDirectConnectGateways(java.util.Collection<DirectConnectGateway> directConnectGateways) {
        setDirectConnectGateways(directConnectGateways);
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next page.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next page.
     * </p>
     * 
     * @return The token to retrieve the next page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next page.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDirectConnectGatewaysResult withNextToken(String nextToken) {
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
        if (getDirectConnectGateways() != null)
            sb.append("DirectConnectGateways: ").append(getDirectConnectGateways()).append(",");
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

        if (obj instanceof DescribeDirectConnectGatewaysResult == false)
            return false;
        DescribeDirectConnectGatewaysResult other = (DescribeDirectConnectGatewaysResult) obj;
        if (other.getDirectConnectGateways() == null ^ this.getDirectConnectGateways() == null)
            return false;
        if (other.getDirectConnectGateways() != null && other.getDirectConnectGateways().equals(this.getDirectConnectGateways()) == false)
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

        hashCode = prime * hashCode + ((getDirectConnectGateways() == null) ? 0 : getDirectConnectGateways().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDirectConnectGatewaysResult clone() {
        try {
            return (DescribeDirectConnectGatewaysResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
