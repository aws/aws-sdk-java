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
package com.amazonaws.services.marketplaceentitlement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The GetEntitlementsRequest contains results from the GetEntitlements operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entitlement.marketplace-2017-01-11/GetEntitlements"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEntitlementsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The set of entitlements found through the GetEntitlements operation. If the result contains an empty set of
     * entitlements, NextToken might still be present and should be used.
     * </p>
     */
    private java.util.List<Entitlement> entitlements;
    /**
     * <p>
     * For paginated results, use NextToken in subsequent calls to GetEntitlements. If the result contains an empty set
     * of entitlements, NextToken might still be present and should be used.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The set of entitlements found through the GetEntitlements operation. If the result contains an empty set of
     * entitlements, NextToken might still be present and should be used.
     * </p>
     * 
     * @return The set of entitlements found through the GetEntitlements operation. If the result contains an empty set
     *         of entitlements, NextToken might still be present and should be used.
     */

    public java.util.List<Entitlement> getEntitlements() {
        return entitlements;
    }

    /**
     * <p>
     * The set of entitlements found through the GetEntitlements operation. If the result contains an empty set of
     * entitlements, NextToken might still be present and should be used.
     * </p>
     * 
     * @param entitlements
     *        The set of entitlements found through the GetEntitlements operation. If the result contains an empty set
     *        of entitlements, NextToken might still be present and should be used.
     */

    public void setEntitlements(java.util.Collection<Entitlement> entitlements) {
        if (entitlements == null) {
            this.entitlements = null;
            return;
        }

        this.entitlements = new java.util.ArrayList<Entitlement>(entitlements);
    }

    /**
     * <p>
     * The set of entitlements found through the GetEntitlements operation. If the result contains an empty set of
     * entitlements, NextToken might still be present and should be used.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntitlements(java.util.Collection)} or {@link #withEntitlements(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param entitlements
     *        The set of entitlements found through the GetEntitlements operation. If the result contains an empty set
     *        of entitlements, NextToken might still be present and should be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEntitlementsResult withEntitlements(Entitlement... entitlements) {
        if (this.entitlements == null) {
            setEntitlements(new java.util.ArrayList<Entitlement>(entitlements.length));
        }
        for (Entitlement ele : entitlements) {
            this.entitlements.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The set of entitlements found through the GetEntitlements operation. If the result contains an empty set of
     * entitlements, NextToken might still be present and should be used.
     * </p>
     * 
     * @param entitlements
     *        The set of entitlements found through the GetEntitlements operation. If the result contains an empty set
     *        of entitlements, NextToken might still be present and should be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEntitlementsResult withEntitlements(java.util.Collection<Entitlement> entitlements) {
        setEntitlements(entitlements);
        return this;
    }

    /**
     * <p>
     * For paginated results, use NextToken in subsequent calls to GetEntitlements. If the result contains an empty set
     * of entitlements, NextToken might still be present and should be used.
     * </p>
     * 
     * @param nextToken
     *        For paginated results, use NextToken in subsequent calls to GetEntitlements. If the result contains an
     *        empty set of entitlements, NextToken might still be present and should be used.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * For paginated results, use NextToken in subsequent calls to GetEntitlements. If the result contains an empty set
     * of entitlements, NextToken might still be present and should be used.
     * </p>
     * 
     * @return For paginated results, use NextToken in subsequent calls to GetEntitlements. If the result contains an
     *         empty set of entitlements, NextToken might still be present and should be used.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * For paginated results, use NextToken in subsequent calls to GetEntitlements. If the result contains an empty set
     * of entitlements, NextToken might still be present and should be used.
     * </p>
     * 
     * @param nextToken
     *        For paginated results, use NextToken in subsequent calls to GetEntitlements. If the result contains an
     *        empty set of entitlements, NextToken might still be present and should be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEntitlementsResult withNextToken(String nextToken) {
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
        if (getEntitlements() != null)
            sb.append("Entitlements: ").append(getEntitlements()).append(",");
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

        if (obj instanceof GetEntitlementsResult == false)
            return false;
        GetEntitlementsResult other = (GetEntitlementsResult) obj;
        if (other.getEntitlements() == null ^ this.getEntitlements() == null)
            return false;
        if (other.getEntitlements() != null && other.getEntitlements().equals(this.getEntitlements()) == false)
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

        hashCode = prime * hashCode + ((getEntitlements() == null) ? 0 : getEntitlements().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetEntitlementsResult clone() {
        try {
            return (GetEntitlementsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
