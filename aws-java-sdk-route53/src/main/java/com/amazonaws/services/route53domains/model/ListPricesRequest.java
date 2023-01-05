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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/ListPrices" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPricesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The TLD for which you want to receive the pricing information. For example. <code>.net</code>.
     * </p>
     * <p>
     * If a <code>Tld</code> value is not provided, a list of prices for all TLDs supported by Route 53 is returned.
     * </p>
     */
    private String tld;
    /**
     * <p>
     * For an initial request for a list of prices, omit this element. If the number of prices that are not yet complete
     * is greater than the value that you specified for <code>MaxItems</code>, you can use <code>Marker</code> to return
     * additional prices. Get the value of <code>NextPageMarker</code> from the previous response, and submit another
     * request that includes the value of <code>NextPageMarker</code> in the <code>Marker</code> element.
     * </p>
     * <p>
     * Used only for all TLDs. If you specify a TLD, don't specify a <code>Marker</code>.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * Number of <code>Prices</code> to be returned.
     * </p>
     * <p>
     * Used only for all TLDs. If you specify a TLD, don't specify a <code>MaxItems</code>.
     * </p>
     */
    private Integer maxItems;

    /**
     * <p>
     * The TLD for which you want to receive the pricing information. For example. <code>.net</code>.
     * </p>
     * <p>
     * If a <code>Tld</code> value is not provided, a list of prices for all TLDs supported by Route 53 is returned.
     * </p>
     * 
     * @param tld
     *        The TLD for which you want to receive the pricing information. For example. <code>.net</code>.</p>
     *        <p>
     *        If a <code>Tld</code> value is not provided, a list of prices for all TLDs supported by Route 53 is
     *        returned.
     */

    public void setTld(String tld) {
        this.tld = tld;
    }

    /**
     * <p>
     * The TLD for which you want to receive the pricing information. For example. <code>.net</code>.
     * </p>
     * <p>
     * If a <code>Tld</code> value is not provided, a list of prices for all TLDs supported by Route 53 is returned.
     * </p>
     * 
     * @return The TLD for which you want to receive the pricing information. For example. <code>.net</code>.</p>
     *         <p>
     *         If a <code>Tld</code> value is not provided, a list of prices for all TLDs supported by Route 53 is
     *         returned.
     */

    public String getTld() {
        return this.tld;
    }

    /**
     * <p>
     * The TLD for which you want to receive the pricing information. For example. <code>.net</code>.
     * </p>
     * <p>
     * If a <code>Tld</code> value is not provided, a list of prices for all TLDs supported by Route 53 is returned.
     * </p>
     * 
     * @param tld
     *        The TLD for which you want to receive the pricing information. For example. <code>.net</code>.</p>
     *        <p>
     *        If a <code>Tld</code> value is not provided, a list of prices for all TLDs supported by Route 53 is
     *        returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPricesRequest withTld(String tld) {
        setTld(tld);
        return this;
    }

    /**
     * <p>
     * For an initial request for a list of prices, omit this element. If the number of prices that are not yet complete
     * is greater than the value that you specified for <code>MaxItems</code>, you can use <code>Marker</code> to return
     * additional prices. Get the value of <code>NextPageMarker</code> from the previous response, and submit another
     * request that includes the value of <code>NextPageMarker</code> in the <code>Marker</code> element.
     * </p>
     * <p>
     * Used only for all TLDs. If you specify a TLD, don't specify a <code>Marker</code>.
     * </p>
     * 
     * @param marker
     *        For an initial request for a list of prices, omit this element. If the number of prices that are not yet
     *        complete is greater than the value that you specified for <code>MaxItems</code>, you can use
     *        <code>Marker</code> to return additional prices. Get the value of <code>NextPageMarker</code> from the
     *        previous response, and submit another request that includes the value of <code>NextPageMarker</code> in
     *        the <code>Marker</code> element. </p>
     *        <p>
     *        Used only for all TLDs. If you specify a TLD, don't specify a <code>Marker</code>.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * For an initial request for a list of prices, omit this element. If the number of prices that are not yet complete
     * is greater than the value that you specified for <code>MaxItems</code>, you can use <code>Marker</code> to return
     * additional prices. Get the value of <code>NextPageMarker</code> from the previous response, and submit another
     * request that includes the value of <code>NextPageMarker</code> in the <code>Marker</code> element.
     * </p>
     * <p>
     * Used only for all TLDs. If you specify a TLD, don't specify a <code>Marker</code>.
     * </p>
     * 
     * @return For an initial request for a list of prices, omit this element. If the number of prices that are not yet
     *         complete is greater than the value that you specified for <code>MaxItems</code>, you can use
     *         <code>Marker</code> to return additional prices. Get the value of <code>NextPageMarker</code> from the
     *         previous response, and submit another request that includes the value of <code>NextPageMarker</code> in
     *         the <code>Marker</code> element. </p>
     *         <p>
     *         Used only for all TLDs. If you specify a TLD, don't specify a <code>Marker</code>.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * For an initial request for a list of prices, omit this element. If the number of prices that are not yet complete
     * is greater than the value that you specified for <code>MaxItems</code>, you can use <code>Marker</code> to return
     * additional prices. Get the value of <code>NextPageMarker</code> from the previous response, and submit another
     * request that includes the value of <code>NextPageMarker</code> in the <code>Marker</code> element.
     * </p>
     * <p>
     * Used only for all TLDs. If you specify a TLD, don't specify a <code>Marker</code>.
     * </p>
     * 
     * @param marker
     *        For an initial request for a list of prices, omit this element. If the number of prices that are not yet
     *        complete is greater than the value that you specified for <code>MaxItems</code>, you can use
     *        <code>Marker</code> to return additional prices. Get the value of <code>NextPageMarker</code> from the
     *        previous response, and submit another request that includes the value of <code>NextPageMarker</code> in
     *        the <code>Marker</code> element. </p>
     *        <p>
     *        Used only for all TLDs. If you specify a TLD, don't specify a <code>Marker</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPricesRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * Number of <code>Prices</code> to be returned.
     * </p>
     * <p>
     * Used only for all TLDs. If you specify a TLD, don't specify a <code>MaxItems</code>.
     * </p>
     * 
     * @param maxItems
     *        Number of <code>Prices</code> to be returned.</p>
     *        <p>
     *        Used only for all TLDs. If you specify a TLD, don't specify a <code>MaxItems</code>.
     */

    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * Number of <code>Prices</code> to be returned.
     * </p>
     * <p>
     * Used only for all TLDs. If you specify a TLD, don't specify a <code>MaxItems</code>.
     * </p>
     * 
     * @return Number of <code>Prices</code> to be returned.</p>
     *         <p>
     *         Used only for all TLDs. If you specify a TLD, don't specify a <code>MaxItems</code>.
     */

    public Integer getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * Number of <code>Prices</code> to be returned.
     * </p>
     * <p>
     * Used only for all TLDs. If you specify a TLD, don't specify a <code>MaxItems</code>.
     * </p>
     * 
     * @param maxItems
     *        Number of <code>Prices</code> to be returned.</p>
     *        <p>
     *        Used only for all TLDs. If you specify a TLD, don't specify a <code>MaxItems</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPricesRequest withMaxItems(Integer maxItems) {
        setMaxItems(maxItems);
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
        if (getTld() != null)
            sb.append("Tld: ").append(getTld()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getMaxItems() != null)
            sb.append("MaxItems: ").append(getMaxItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPricesRequest == false)
            return false;
        ListPricesRequest other = (ListPricesRequest) obj;
        if (other.getTld() == null ^ this.getTld() == null)
            return false;
        if (other.getTld() != null && other.getTld().equals(this.getTld()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTld() == null) ? 0 : getTld().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public ListPricesRequest clone() {
        return (ListPricesRequest) super.clone();
    }

}
