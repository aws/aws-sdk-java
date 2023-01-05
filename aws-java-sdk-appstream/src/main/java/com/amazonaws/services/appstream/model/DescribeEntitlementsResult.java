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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeEntitlements" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEntitlementsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The entitlements.
     * </p>
     */
    private java.util.List<Entitlement> entitlements;
    /**
     * <p>
     * The pagination token used to retrieve the next page of results for this operation.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The entitlements.
     * </p>
     * 
     * @return The entitlements.
     */

    public java.util.List<Entitlement> getEntitlements() {
        return entitlements;
    }

    /**
     * <p>
     * The entitlements.
     * </p>
     * 
     * @param entitlements
     *        The entitlements.
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
     * The entitlements.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntitlements(java.util.Collection)} or {@link #withEntitlements(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param entitlements
     *        The entitlements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEntitlementsResult withEntitlements(Entitlement... entitlements) {
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
     * The entitlements.
     * </p>
     * 
     * @param entitlements
     *        The entitlements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEntitlementsResult withEntitlements(java.util.Collection<Entitlement> entitlements) {
        setEntitlements(entitlements);
        return this;
    }

    /**
     * <p>
     * The pagination token used to retrieve the next page of results for this operation.
     * </p>
     * 
     * @param nextToken
     *        The pagination token used to retrieve the next page of results for this operation.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token used to retrieve the next page of results for this operation.
     * </p>
     * 
     * @return The pagination token used to retrieve the next page of results for this operation.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token used to retrieve the next page of results for this operation.
     * </p>
     * 
     * @param nextToken
     *        The pagination token used to retrieve the next page of results for this operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEntitlementsResult withNextToken(String nextToken) {
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

        if (obj instanceof DescribeEntitlementsResult == false)
            return false;
        DescribeEntitlementsResult other = (DescribeEntitlementsResult) obj;
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
    public DescribeEntitlementsResult clone() {
        try {
            return (DescribeEntitlementsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
