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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListEnabledProductsForImport"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEnabledProductsForImportResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of ARNs for the resources that represent your subscriptions to products.
     * </p>
     */
    private java.util.List<String> productSubscriptions;
    /**
     * <p>
     * The token that is required for pagination.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of ARNs for the resources that represent your subscriptions to products.
     * </p>
     * 
     * @return A list of ARNs for the resources that represent your subscriptions to products.
     */

    public java.util.List<String> getProductSubscriptions() {
        return productSubscriptions;
    }

    /**
     * <p>
     * A list of ARNs for the resources that represent your subscriptions to products.
     * </p>
     * 
     * @param productSubscriptions
     *        A list of ARNs for the resources that represent your subscriptions to products.
     */

    public void setProductSubscriptions(java.util.Collection<String> productSubscriptions) {
        if (productSubscriptions == null) {
            this.productSubscriptions = null;
            return;
        }

        this.productSubscriptions = new java.util.ArrayList<String>(productSubscriptions);
    }

    /**
     * <p>
     * A list of ARNs for the resources that represent your subscriptions to products.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProductSubscriptions(java.util.Collection)} or {@link #withProductSubscriptions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param productSubscriptions
     *        A list of ARNs for the resources that represent your subscriptions to products.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnabledProductsForImportResult withProductSubscriptions(String... productSubscriptions) {
        if (this.productSubscriptions == null) {
            setProductSubscriptions(new java.util.ArrayList<String>(productSubscriptions.length));
        }
        for (String ele : productSubscriptions) {
            this.productSubscriptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of ARNs for the resources that represent your subscriptions to products.
     * </p>
     * 
     * @param productSubscriptions
     *        A list of ARNs for the resources that represent your subscriptions to products.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnabledProductsForImportResult withProductSubscriptions(java.util.Collection<String> productSubscriptions) {
        setProductSubscriptions(productSubscriptions);
        return this;
    }

    /**
     * <p>
     * The token that is required for pagination.
     * </p>
     * 
     * @param nextToken
     *        The token that is required for pagination.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token that is required for pagination.
     * </p>
     * 
     * @return The token that is required for pagination.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token that is required for pagination.
     * </p>
     * 
     * @param nextToken
     *        The token that is required for pagination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnabledProductsForImportResult withNextToken(String nextToken) {
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
        if (getProductSubscriptions() != null)
            sb.append("ProductSubscriptions: ").append(getProductSubscriptions()).append(",");
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

        if (obj instanceof ListEnabledProductsForImportResult == false)
            return false;
        ListEnabledProductsForImportResult other = (ListEnabledProductsForImportResult) obj;
        if (other.getProductSubscriptions() == null ^ this.getProductSubscriptions() == null)
            return false;
        if (other.getProductSubscriptions() != null && other.getProductSubscriptions().equals(this.getProductSubscriptions()) == false)
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

        hashCode = prime * hashCode + ((getProductSubscriptions() == null) ? 0 : getProductSubscriptions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListEnabledProductsForImportResult clone() {
        try {
            return (ListEnabledProductsForImportResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
