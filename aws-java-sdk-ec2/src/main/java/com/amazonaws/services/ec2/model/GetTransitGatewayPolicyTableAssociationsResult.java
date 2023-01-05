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
public class GetTransitGatewayPolicyTableAssociationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * Returns details about the transit gateway policy table association.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TransitGatewayPolicyTableAssociation> associations;
    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Returns details about the transit gateway policy table association.
     * </p>
     * 
     * @return Returns details about the transit gateway policy table association.
     */

    public java.util.List<TransitGatewayPolicyTableAssociation> getAssociations() {
        if (associations == null) {
            associations = new com.amazonaws.internal.SdkInternalList<TransitGatewayPolicyTableAssociation>();
        }
        return associations;
    }

    /**
     * <p>
     * Returns details about the transit gateway policy table association.
     * </p>
     * 
     * @param associations
     *        Returns details about the transit gateway policy table association.
     */

    public void setAssociations(java.util.Collection<TransitGatewayPolicyTableAssociation> associations) {
        if (associations == null) {
            this.associations = null;
            return;
        }

        this.associations = new com.amazonaws.internal.SdkInternalList<TransitGatewayPolicyTableAssociation>(associations);
    }

    /**
     * <p>
     * Returns details about the transit gateway policy table association.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssociations(java.util.Collection)} or {@link #withAssociations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param associations
     *        Returns details about the transit gateway policy table association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTransitGatewayPolicyTableAssociationsResult withAssociations(TransitGatewayPolicyTableAssociation... associations) {
        if (this.associations == null) {
            setAssociations(new com.amazonaws.internal.SdkInternalList<TransitGatewayPolicyTableAssociation>(associations.length));
        }
        for (TransitGatewayPolicyTableAssociation ele : associations) {
            this.associations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns details about the transit gateway policy table association.
     * </p>
     * 
     * @param associations
     *        Returns details about the transit gateway policy table association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTransitGatewayPolicyTableAssociationsResult withAssociations(java.util.Collection<TransitGatewayPolicyTableAssociation> associations) {
        setAssociations(associations);
        return this;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @return The token for the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTransitGatewayPolicyTableAssociationsResult withNextToken(String nextToken) {
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
        if (getAssociations() != null)
            sb.append("Associations: ").append(getAssociations()).append(",");
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

        if (obj instanceof GetTransitGatewayPolicyTableAssociationsResult == false)
            return false;
        GetTransitGatewayPolicyTableAssociationsResult other = (GetTransitGatewayPolicyTableAssociationsResult) obj;
        if (other.getAssociations() == null ^ this.getAssociations() == null)
            return false;
        if (other.getAssociations() != null && other.getAssociations().equals(this.getAssociations()) == false)
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

        hashCode = prime * hashCode + ((getAssociations() == null) ? 0 : getAssociations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetTransitGatewayPolicyTableAssociationsResult clone() {
        try {
            return (GetTransitGatewayPolicyTableAssociationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
