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
package com.amazonaws.services.route53domains.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/ListPrices" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPricesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A complex type that includes all the pricing information. If you specify a TLD, this array contains only the
     * pricing for that TLD.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DomainPrice> prices;
    /**
     * <p>
     * If there are more prices than you specified for <code>MaxItems</code> in the request, submit another request and
     * include the value of <code>NextPageMarker</code> in the value of <code>Marker</code>.
     * </p>
     * <p>
     * Used only for all TLDs. If you specify a TLD, don't specify a <code>NextPageMarker</code>.
     * </p>
     */
    private String nextPageMarker;

    /**
     * <p>
     * A complex type that includes all the pricing information. If you specify a TLD, this array contains only the
     * pricing for that TLD.
     * </p>
     * 
     * @return A complex type that includes all the pricing information. If you specify a TLD, this array contains only
     *         the pricing for that TLD.
     */

    public java.util.List<DomainPrice> getPrices() {
        if (prices == null) {
            prices = new com.amazonaws.internal.SdkInternalList<DomainPrice>();
        }
        return prices;
    }

    /**
     * <p>
     * A complex type that includes all the pricing information. If you specify a TLD, this array contains only the
     * pricing for that TLD.
     * </p>
     * 
     * @param prices
     *        A complex type that includes all the pricing information. If you specify a TLD, this array contains only
     *        the pricing for that TLD.
     */

    public void setPrices(java.util.Collection<DomainPrice> prices) {
        if (prices == null) {
            this.prices = null;
            return;
        }

        this.prices = new com.amazonaws.internal.SdkInternalList<DomainPrice>(prices);
    }

    /**
     * <p>
     * A complex type that includes all the pricing information. If you specify a TLD, this array contains only the
     * pricing for that TLD.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPrices(java.util.Collection)} or {@link #withPrices(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param prices
     *        A complex type that includes all the pricing information. If you specify a TLD, this array contains only
     *        the pricing for that TLD.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPricesResult withPrices(DomainPrice... prices) {
        if (this.prices == null) {
            setPrices(new com.amazonaws.internal.SdkInternalList<DomainPrice>(prices.length));
        }
        for (DomainPrice ele : prices) {
            this.prices.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A complex type that includes all the pricing information. If you specify a TLD, this array contains only the
     * pricing for that TLD.
     * </p>
     * 
     * @param prices
     *        A complex type that includes all the pricing information. If you specify a TLD, this array contains only
     *        the pricing for that TLD.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPricesResult withPrices(java.util.Collection<DomainPrice> prices) {
        setPrices(prices);
        return this;
    }

    /**
     * <p>
     * If there are more prices than you specified for <code>MaxItems</code> in the request, submit another request and
     * include the value of <code>NextPageMarker</code> in the value of <code>Marker</code>.
     * </p>
     * <p>
     * Used only for all TLDs. If you specify a TLD, don't specify a <code>NextPageMarker</code>.
     * </p>
     * 
     * @param nextPageMarker
     *        If there are more prices than you specified for <code>MaxItems</code> in the request, submit another
     *        request and include the value of <code>NextPageMarker</code> in the value of <code>Marker</code>. </p>
     *        <p>
     *        Used only for all TLDs. If you specify a TLD, don't specify a <code>NextPageMarker</code>.
     */

    public void setNextPageMarker(String nextPageMarker) {
        this.nextPageMarker = nextPageMarker;
    }

    /**
     * <p>
     * If there are more prices than you specified for <code>MaxItems</code> in the request, submit another request and
     * include the value of <code>NextPageMarker</code> in the value of <code>Marker</code>.
     * </p>
     * <p>
     * Used only for all TLDs. If you specify a TLD, don't specify a <code>NextPageMarker</code>.
     * </p>
     * 
     * @return If there are more prices than you specified for <code>MaxItems</code> in the request, submit another
     *         request and include the value of <code>NextPageMarker</code> in the value of <code>Marker</code>. </p>
     *         <p>
     *         Used only for all TLDs. If you specify a TLD, don't specify a <code>NextPageMarker</code>.
     */

    public String getNextPageMarker() {
        return this.nextPageMarker;
    }

    /**
     * <p>
     * If there are more prices than you specified for <code>MaxItems</code> in the request, submit another request and
     * include the value of <code>NextPageMarker</code> in the value of <code>Marker</code>.
     * </p>
     * <p>
     * Used only for all TLDs. If you specify a TLD, don't specify a <code>NextPageMarker</code>.
     * </p>
     * 
     * @param nextPageMarker
     *        If there are more prices than you specified for <code>MaxItems</code> in the request, submit another
     *        request and include the value of <code>NextPageMarker</code> in the value of <code>Marker</code>. </p>
     *        <p>
     *        Used only for all TLDs. If you specify a TLD, don't specify a <code>NextPageMarker</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPricesResult withNextPageMarker(String nextPageMarker) {
        setNextPageMarker(nextPageMarker);
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
        if (getPrices() != null)
            sb.append("Prices: ").append(getPrices()).append(",");
        if (getNextPageMarker() != null)
            sb.append("NextPageMarker: ").append(getNextPageMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPricesResult == false)
            return false;
        ListPricesResult other = (ListPricesResult) obj;
        if (other.getPrices() == null ^ this.getPrices() == null)
            return false;
        if (other.getPrices() != null && other.getPrices().equals(this.getPrices()) == false)
            return false;
        if (other.getNextPageMarker() == null ^ this.getNextPageMarker() == null)
            return false;
        if (other.getNextPageMarker() != null && other.getNextPageMarker().equals(this.getNextPageMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrices() == null) ? 0 : getPrices().hashCode());
        hashCode = prime * hashCode + ((getNextPageMarker() == null) ? 0 : getNextPageMarker().hashCode());
        return hashCode;
    }

    @Override
    public ListPricesResult clone() {
        try {
            return (ListPricesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
