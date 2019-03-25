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
 *      href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeDirectConnectGatewayAssociations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDirectConnectGatewayAssociationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * Information about the associations.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DirectConnectGatewayAssociation> directConnectGatewayAssociations;
    /**
     * <p>
     * The token to retrieve the next page.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the associations.
     * </p>
     * 
     * @return Information about the associations.
     */

    public java.util.List<DirectConnectGatewayAssociation> getDirectConnectGatewayAssociations() {
        if (directConnectGatewayAssociations == null) {
            directConnectGatewayAssociations = new com.amazonaws.internal.SdkInternalList<DirectConnectGatewayAssociation>();
        }
        return directConnectGatewayAssociations;
    }

    /**
     * <p>
     * Information about the associations.
     * </p>
     * 
     * @param directConnectGatewayAssociations
     *        Information about the associations.
     */

    public void setDirectConnectGatewayAssociations(java.util.Collection<DirectConnectGatewayAssociation> directConnectGatewayAssociations) {
        if (directConnectGatewayAssociations == null) {
            this.directConnectGatewayAssociations = null;
            return;
        }

        this.directConnectGatewayAssociations = new com.amazonaws.internal.SdkInternalList<DirectConnectGatewayAssociation>(directConnectGatewayAssociations);
    }

    /**
     * <p>
     * Information about the associations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDirectConnectGatewayAssociations(java.util.Collection)} or
     * {@link #withDirectConnectGatewayAssociations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param directConnectGatewayAssociations
     *        Information about the associations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDirectConnectGatewayAssociationsResult withDirectConnectGatewayAssociations(
            DirectConnectGatewayAssociation... directConnectGatewayAssociations) {
        if (this.directConnectGatewayAssociations == null) {
            setDirectConnectGatewayAssociations(new com.amazonaws.internal.SdkInternalList<DirectConnectGatewayAssociation>(
                    directConnectGatewayAssociations.length));
        }
        for (DirectConnectGatewayAssociation ele : directConnectGatewayAssociations) {
            this.directConnectGatewayAssociations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the associations.
     * </p>
     * 
     * @param directConnectGatewayAssociations
     *        Information about the associations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDirectConnectGatewayAssociationsResult withDirectConnectGatewayAssociations(
            java.util.Collection<DirectConnectGatewayAssociation> directConnectGatewayAssociations) {
        setDirectConnectGatewayAssociations(directConnectGatewayAssociations);
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

    public DescribeDirectConnectGatewayAssociationsResult withNextToken(String nextToken) {
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
        if (getDirectConnectGatewayAssociations() != null)
            sb.append("DirectConnectGatewayAssociations: ").append(getDirectConnectGatewayAssociations()).append(",");
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

        if (obj instanceof DescribeDirectConnectGatewayAssociationsResult == false)
            return false;
        DescribeDirectConnectGatewayAssociationsResult other = (DescribeDirectConnectGatewayAssociationsResult) obj;
        if (other.getDirectConnectGatewayAssociations() == null ^ this.getDirectConnectGatewayAssociations() == null)
            return false;
        if (other.getDirectConnectGatewayAssociations() != null
                && other.getDirectConnectGatewayAssociations().equals(this.getDirectConnectGatewayAssociations()) == false)
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

        hashCode = prime * hashCode + ((getDirectConnectGatewayAssociations() == null) ? 0 : getDirectConnectGatewayAssociations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDirectConnectGatewayAssociationsResult clone() {
        try {
            return (DescribeDirectConnectGatewayAssociationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
