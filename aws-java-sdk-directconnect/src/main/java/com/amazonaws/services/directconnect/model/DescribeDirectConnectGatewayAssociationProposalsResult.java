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
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeDirectConnectGatewayAssociationProposals"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDirectConnectGatewayAssociationProposalsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * Describes the Direct Connect gateway association proposals.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DirectConnectGatewayAssociationProposal> directConnectGatewayAssociationProposals;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Describes the Direct Connect gateway association proposals.
     * </p>
     * 
     * @return Describes the Direct Connect gateway association proposals.
     */

    public java.util.List<DirectConnectGatewayAssociationProposal> getDirectConnectGatewayAssociationProposals() {
        if (directConnectGatewayAssociationProposals == null) {
            directConnectGatewayAssociationProposals = new com.amazonaws.internal.SdkInternalList<DirectConnectGatewayAssociationProposal>();
        }
        return directConnectGatewayAssociationProposals;
    }

    /**
     * <p>
     * Describes the Direct Connect gateway association proposals.
     * </p>
     * 
     * @param directConnectGatewayAssociationProposals
     *        Describes the Direct Connect gateway association proposals.
     */

    public void setDirectConnectGatewayAssociationProposals(
            java.util.Collection<DirectConnectGatewayAssociationProposal> directConnectGatewayAssociationProposals) {
        if (directConnectGatewayAssociationProposals == null) {
            this.directConnectGatewayAssociationProposals = null;
            return;
        }

        this.directConnectGatewayAssociationProposals = new com.amazonaws.internal.SdkInternalList<DirectConnectGatewayAssociationProposal>(
                directConnectGatewayAssociationProposals);
    }

    /**
     * <p>
     * Describes the Direct Connect gateway association proposals.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDirectConnectGatewayAssociationProposals(java.util.Collection)} or
     * {@link #withDirectConnectGatewayAssociationProposals(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param directConnectGatewayAssociationProposals
     *        Describes the Direct Connect gateway association proposals.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDirectConnectGatewayAssociationProposalsResult withDirectConnectGatewayAssociationProposals(
            DirectConnectGatewayAssociationProposal... directConnectGatewayAssociationProposals) {
        if (this.directConnectGatewayAssociationProposals == null) {
            setDirectConnectGatewayAssociationProposals(new com.amazonaws.internal.SdkInternalList<DirectConnectGatewayAssociationProposal>(
                    directConnectGatewayAssociationProposals.length));
        }
        for (DirectConnectGatewayAssociationProposal ele : directConnectGatewayAssociationProposals) {
            this.directConnectGatewayAssociationProposals.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Describes the Direct Connect gateway association proposals.
     * </p>
     * 
     * @param directConnectGatewayAssociationProposals
     *        Describes the Direct Connect gateway association proposals.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDirectConnectGatewayAssociationProposalsResult withDirectConnectGatewayAssociationProposals(
            java.util.Collection<DirectConnectGatewayAssociationProposal> directConnectGatewayAssociationProposals) {
        setDirectConnectGatewayAssociationProposals(directConnectGatewayAssociationProposals);
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

    public DescribeDirectConnectGatewayAssociationProposalsResult withNextToken(String nextToken) {
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
        if (getDirectConnectGatewayAssociationProposals() != null)
            sb.append("DirectConnectGatewayAssociationProposals: ").append(getDirectConnectGatewayAssociationProposals()).append(",");
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

        if (obj instanceof DescribeDirectConnectGatewayAssociationProposalsResult == false)
            return false;
        DescribeDirectConnectGatewayAssociationProposalsResult other = (DescribeDirectConnectGatewayAssociationProposalsResult) obj;
        if (other.getDirectConnectGatewayAssociationProposals() == null ^ this.getDirectConnectGatewayAssociationProposals() == null)
            return false;
        if (other.getDirectConnectGatewayAssociationProposals() != null
                && other.getDirectConnectGatewayAssociationProposals().equals(this.getDirectConnectGatewayAssociationProposals()) == false)
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

        hashCode = prime * hashCode + ((getDirectConnectGatewayAssociationProposals() == null) ? 0 : getDirectConnectGatewayAssociationProposals().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDirectConnectGatewayAssociationProposalsResult clone() {
        try {
            return (DescribeDirectConnectGatewayAssociationProposalsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
