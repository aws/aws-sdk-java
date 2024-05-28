/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * <i> <b>This feature is in preview release and is subject to change. Your use of Amazon Web Services Price List API is
 * subject to the Beta Service Participation terms of the <a href="https://aws.amazon.com/service-terms/">Amazon Web
 * Services Service Terms</a> (Section 1.10).</b> </i>
 * </p>
 * <p>
 * This is the type of price list references that match your request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pricing-2017-10-15/PriceList" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PriceList implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier that maps to where your Price List files are located. <code>PriceListArn</code> can be
     * obtained from the <a
     * href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_pricing_ListPriceLists.html">
     * <code>ListPriceList</code> </a> response.
     * </p>
     */
    private String priceListArn;
    /**
     * <p>
     * This is used to filter the Price List by Amazon Web Services Region. For example, to get the price list only for
     * the <code>US East (N. Virginia)</code> Region, use <code>us-east-1</code>. If nothing is specified, you retrieve
     * price lists for all applicable Regions. The available <code>RegionCode</code> list can be retrieved from <a
     * href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_pricing_GetAttributeValues.html">
     * <code>GetAttributeValues</code> </a> API.
     * </p>
     */
    private String regionCode;
    /**
     * <p>
     * The three alphabetical character ISO-4217 currency code the Price List files are denominated in.
     * </p>
     */
    private String currencyCode;
    /**
     * <p>
     * The format you want to retrieve your Price List files. The <code>FileFormat</code> can be obtained from the <a
     * href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_pricing_ListPriceLists.html">
     * <code>ListPriceList</code> </a> response.
     * </p>
     */
    private java.util.List<String> fileFormats;

    /**
     * <p>
     * The unique identifier that maps to where your Price List files are located. <code>PriceListArn</code> can be
     * obtained from the <a
     * href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_pricing_ListPriceLists.html">
     * <code>ListPriceList</code> </a> response.
     * </p>
     * 
     * @param priceListArn
     *        The unique identifier that maps to where your Price List files are located. <code>PriceListArn</code> can
     *        be obtained from the <a href=
     *        "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_pricing_ListPriceLists.html">
     *        <code>ListPriceList</code> </a> response.
     */

    public void setPriceListArn(String priceListArn) {
        this.priceListArn = priceListArn;
    }

    /**
     * <p>
     * The unique identifier that maps to where your Price List files are located. <code>PriceListArn</code> can be
     * obtained from the <a
     * href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_pricing_ListPriceLists.html">
     * <code>ListPriceList</code> </a> response.
     * </p>
     * 
     * @return The unique identifier that maps to where your Price List files are located. <code>PriceListArn</code> can
     *         be obtained from the <a href=
     *         "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_pricing_ListPriceLists.html">
     *         <code>ListPriceList</code> </a> response.
     */

    public String getPriceListArn() {
        return this.priceListArn;
    }

    /**
     * <p>
     * The unique identifier that maps to where your Price List files are located. <code>PriceListArn</code> can be
     * obtained from the <a
     * href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_pricing_ListPriceLists.html">
     * <code>ListPriceList</code> </a> response.
     * </p>
     * 
     * @param priceListArn
     *        The unique identifier that maps to where your Price List files are located. <code>PriceListArn</code> can
     *        be obtained from the <a href=
     *        "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_pricing_ListPriceLists.html">
     *        <code>ListPriceList</code> </a> response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PriceList withPriceListArn(String priceListArn) {
        setPriceListArn(priceListArn);
        return this;
    }

    /**
     * <p>
     * This is used to filter the Price List by Amazon Web Services Region. For example, to get the price list only for
     * the <code>US East (N. Virginia)</code> Region, use <code>us-east-1</code>. If nothing is specified, you retrieve
     * price lists for all applicable Regions. The available <code>RegionCode</code> list can be retrieved from <a
     * href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_pricing_GetAttributeValues.html">
     * <code>GetAttributeValues</code> </a> API.
     * </p>
     * 
     * @param regionCode
     *        This is used to filter the Price List by Amazon Web Services Region. For example, to get the price list
     *        only for the <code>US East (N. Virginia)</code> Region, use <code>us-east-1</code>. If nothing is
     *        specified, you retrieve price lists for all applicable Regions. The available <code>RegionCode</code> list
     *        can be retrieved from <a href=
     *        "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_pricing_GetAttributeValues.html">
     *        <code>GetAttributeValues</code> </a> API.
     */

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    /**
     * <p>
     * This is used to filter the Price List by Amazon Web Services Region. For example, to get the price list only for
     * the <code>US East (N. Virginia)</code> Region, use <code>us-east-1</code>. If nothing is specified, you retrieve
     * price lists for all applicable Regions. The available <code>RegionCode</code> list can be retrieved from <a
     * href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_pricing_GetAttributeValues.html">
     * <code>GetAttributeValues</code> </a> API.
     * </p>
     * 
     * @return This is used to filter the Price List by Amazon Web Services Region. For example, to get the price list
     *         only for the <code>US East (N. Virginia)</code> Region, use <code>us-east-1</code>. If nothing is
     *         specified, you retrieve price lists for all applicable Regions. The available <code>RegionCode</code>
     *         list can be retrieved from <a href=
     *         "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_pricing_GetAttributeValues.html"
     *         > <code>GetAttributeValues</code> </a> API.
     */

    public String getRegionCode() {
        return this.regionCode;
    }

    /**
     * <p>
     * This is used to filter the Price List by Amazon Web Services Region. For example, to get the price list only for
     * the <code>US East (N. Virginia)</code> Region, use <code>us-east-1</code>. If nothing is specified, you retrieve
     * price lists for all applicable Regions. The available <code>RegionCode</code> list can be retrieved from <a
     * href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_pricing_GetAttributeValues.html">
     * <code>GetAttributeValues</code> </a> API.
     * </p>
     * 
     * @param regionCode
     *        This is used to filter the Price List by Amazon Web Services Region. For example, to get the price list
     *        only for the <code>US East (N. Virginia)</code> Region, use <code>us-east-1</code>. If nothing is
     *        specified, you retrieve price lists for all applicable Regions. The available <code>RegionCode</code> list
     *        can be retrieved from <a href=
     *        "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_pricing_GetAttributeValues.html">
     *        <code>GetAttributeValues</code> </a> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PriceList withRegionCode(String regionCode) {
        setRegionCode(regionCode);
        return this;
    }

    /**
     * <p>
     * The three alphabetical character ISO-4217 currency code the Price List files are denominated in.
     * </p>
     * 
     * @param currencyCode
     *        The three alphabetical character ISO-4217 currency code the Price List files are denominated in.
     */

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * <p>
     * The three alphabetical character ISO-4217 currency code the Price List files are denominated in.
     * </p>
     * 
     * @return The three alphabetical character ISO-4217 currency code the Price List files are denominated in.
     */

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * <p>
     * The three alphabetical character ISO-4217 currency code the Price List files are denominated in.
     * </p>
     * 
     * @param currencyCode
     *        The three alphabetical character ISO-4217 currency code the Price List files are denominated in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PriceList withCurrencyCode(String currencyCode) {
        setCurrencyCode(currencyCode);
        return this;
    }

    /**
     * <p>
     * The format you want to retrieve your Price List files. The <code>FileFormat</code> can be obtained from the <a
     * href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_pricing_ListPriceLists.html">
     * <code>ListPriceList</code> </a> response.
     * </p>
     * 
     * @return The format you want to retrieve your Price List files. The <code>FileFormat</code> can be obtained from
     *         the <a href=
     *         "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_pricing_ListPriceLists.html">
     *         <code>ListPriceList</code> </a> response.
     */

    public java.util.List<String> getFileFormats() {
        return fileFormats;
    }

    /**
     * <p>
     * The format you want to retrieve your Price List files. The <code>FileFormat</code> can be obtained from the <a
     * href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_pricing_ListPriceLists.html">
     * <code>ListPriceList</code> </a> response.
     * </p>
     * 
     * @param fileFormats
     *        The format you want to retrieve your Price List files. The <code>FileFormat</code> can be obtained from
     *        the <a href=
     *        "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_pricing_ListPriceLists.html">
     *        <code>ListPriceList</code> </a> response.
     */

    public void setFileFormats(java.util.Collection<String> fileFormats) {
        if (fileFormats == null) {
            this.fileFormats = null;
            return;
        }

        this.fileFormats = new java.util.ArrayList<String>(fileFormats);
    }

    /**
     * <p>
     * The format you want to retrieve your Price List files. The <code>FileFormat</code> can be obtained from the <a
     * href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_pricing_ListPriceLists.html">
     * <code>ListPriceList</code> </a> response.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFileFormats(java.util.Collection)} or {@link #withFileFormats(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param fileFormats
     *        The format you want to retrieve your Price List files. The <code>FileFormat</code> can be obtained from
     *        the <a href=
     *        "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_pricing_ListPriceLists.html">
     *        <code>ListPriceList</code> </a> response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PriceList withFileFormats(String... fileFormats) {
        if (this.fileFormats == null) {
            setFileFormats(new java.util.ArrayList<String>(fileFormats.length));
        }
        for (String ele : fileFormats) {
            this.fileFormats.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The format you want to retrieve your Price List files. The <code>FileFormat</code> can be obtained from the <a
     * href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_pricing_ListPriceLists.html">
     * <code>ListPriceList</code> </a> response.
     * </p>
     * 
     * @param fileFormats
     *        The format you want to retrieve your Price List files. The <code>FileFormat</code> can be obtained from
     *        the <a href=
     *        "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_pricing_ListPriceLists.html">
     *        <code>ListPriceList</code> </a> response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PriceList withFileFormats(java.util.Collection<String> fileFormats) {
        setFileFormats(fileFormats);
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
        if (getPriceListArn() != null)
            sb.append("PriceListArn: ").append(getPriceListArn()).append(",");
        if (getRegionCode() != null)
            sb.append("RegionCode: ").append(getRegionCode()).append(",");
        if (getCurrencyCode() != null)
            sb.append("CurrencyCode: ").append(getCurrencyCode()).append(",");
        if (getFileFormats() != null)
            sb.append("FileFormats: ").append(getFileFormats());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PriceList == false)
            return false;
        PriceList other = (PriceList) obj;
        if (other.getPriceListArn() == null ^ this.getPriceListArn() == null)
            return false;
        if (other.getPriceListArn() != null && other.getPriceListArn().equals(this.getPriceListArn()) == false)
            return false;
        if (other.getRegionCode() == null ^ this.getRegionCode() == null)
            return false;
        if (other.getRegionCode() != null && other.getRegionCode().equals(this.getRegionCode()) == false)
            return false;
        if (other.getCurrencyCode() == null ^ this.getCurrencyCode() == null)
            return false;
        if (other.getCurrencyCode() != null && other.getCurrencyCode().equals(this.getCurrencyCode()) == false)
            return false;
        if (other.getFileFormats() == null ^ this.getFileFormats() == null)
            return false;
        if (other.getFileFormats() != null && other.getFileFormats().equals(this.getFileFormats()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPriceListArn() == null) ? 0 : getPriceListArn().hashCode());
        hashCode = prime * hashCode + ((getRegionCode() == null) ? 0 : getRegionCode().hashCode());
        hashCode = prime * hashCode + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        hashCode = prime * hashCode + ((getFileFormats() == null) ? 0 : getFileFormats().hashCode());
        return hashCode;
    }

    @Override
    public PriceList clone() {
        try {
            return (PriceList) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pricing.model.transform.PriceListMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
