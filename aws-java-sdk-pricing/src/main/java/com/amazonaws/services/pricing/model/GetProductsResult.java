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
package com.amazonaws.services.pricing.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pricing-2017-10-15/GetProducts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetProductsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The format version of the response. For example, aws_v1.
     * </p>
     */
    private String formatVersion;
    /**
     * <p>
     * The list of products that match your filters. The list contains both the product metadata and the price
     * information.
     * </p>
     */
    private java.util.List<String> priceList;
    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The format version of the response. For example, aws_v1.
     * </p>
     * 
     * @param formatVersion
     *        The format version of the response. For example, aws_v1.
     */

    public void setFormatVersion(String formatVersion) {
        this.formatVersion = formatVersion;
    }

    /**
     * <p>
     * The format version of the response. For example, aws_v1.
     * </p>
     * 
     * @return The format version of the response. For example, aws_v1.
     */

    public String getFormatVersion() {
        return this.formatVersion;
    }

    /**
     * <p>
     * The format version of the response. For example, aws_v1.
     * </p>
     * 
     * @param formatVersion
     *        The format version of the response. For example, aws_v1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProductsResult withFormatVersion(String formatVersion) {
        setFormatVersion(formatVersion);
        return this;
    }

    /**
     * <p>
     * The list of products that match your filters. The list contains both the product metadata and the price
     * information.
     * </p>
     * 
     * @return The list of products that match your filters. The list contains both the product metadata and the price
     *         information.
     */

    public java.util.List<String> getPriceList() {
        return priceList;
    }

    /**
     * <p>
     * The list of products that match your filters. The list contains both the product metadata and the price
     * information.
     * </p>
     * 
     * @param priceList
     *        The list of products that match your filters. The list contains both the product metadata and the price
     *        information.
     */

    public void setPriceList(java.util.Collection<String> priceList) {
        if (priceList == null) {
            this.priceList = null;
            return;
        }

        this.priceList = new java.util.ArrayList<String>(priceList);
    }

    /**
     * <p>
     * The list of products that match your filters. The list contains both the product metadata and the price
     * information.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPriceList(java.util.Collection)} or {@link #withPriceList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param priceList
     *        The list of products that match your filters. The list contains both the product metadata and the price
     *        information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProductsResult withPriceList(String... priceList) {
        if (this.priceList == null) {
            setPriceList(new java.util.ArrayList<String>(priceList.length));
        }
        for (String ele : priceList) {
            this.priceList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of products that match your filters. The list contains both the product metadata and the price
     * information.
     * </p>
     * 
     * @param priceList
     *        The list of products that match your filters. The list contains both the product metadata and the price
     *        information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProductsResult withPriceList(java.util.Collection<String> priceList) {
        setPriceList(priceList);
        return this;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that indicates the next set of results to retrieve.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @return The pagination token that indicates the next set of results to retrieve.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that indicates the next set of results to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProductsResult withNextToken(String nextToken) {
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
        if (getFormatVersion() != null)
            sb.append("FormatVersion: ").append(getFormatVersion()).append(",");
        if (getPriceList() != null)
            sb.append("PriceList: ").append(getPriceList()).append(",");
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

        if (obj instanceof GetProductsResult == false)
            return false;
        GetProductsResult other = (GetProductsResult) obj;
        if (other.getFormatVersion() == null ^ this.getFormatVersion() == null)
            return false;
        if (other.getFormatVersion() != null && other.getFormatVersion().equals(this.getFormatVersion()) == false)
            return false;
        if (other.getPriceList() == null ^ this.getPriceList() == null)
            return false;
        if (other.getPriceList() != null && other.getPriceList().equals(this.getPriceList()) == false)
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

        hashCode = prime * hashCode + ((getFormatVersion() == null) ? 0 : getFormatVersion().hashCode());
        hashCode = prime * hashCode + ((getPriceList() == null) ? 0 : getPriceList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetProductsResult clone() {
        try {
            return (GetProductsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
