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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pricing-2017-10-15/GetPriceListFileUrl" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPriceListFileUrlRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier that maps to where your Price List files are located. <code>PriceListArn</code> can be
     * obtained from the <a
     * href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_pricing_ListPriceLists.html"
     * >ListPriceLists</a> response.
     * </p>
     */
    private String priceListArn;
    /**
     * <p>
     * The format that you want to retrieve your Price List files in. The <code>FileFormat</code> can be obtained from
     * the <a
     * href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_pricing_ListPriceLists.html">
     * ListPriceLists</a> response.
     * </p>
     */
    private String fileFormat;

    /**
     * <p>
     * The unique identifier that maps to where your Price List files are located. <code>PriceListArn</code> can be
     * obtained from the <a
     * href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_pricing_ListPriceLists.html"
     * >ListPriceLists</a> response.
     * </p>
     * 
     * @param priceListArn
     *        The unique identifier that maps to where your Price List files are located. <code>PriceListArn</code> can
     *        be obtained from the <a href=
     *        "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_pricing_ListPriceLists.html"
     *        >ListPriceLists</a> response.
     */

    public void setPriceListArn(String priceListArn) {
        this.priceListArn = priceListArn;
    }

    /**
     * <p>
     * The unique identifier that maps to where your Price List files are located. <code>PriceListArn</code> can be
     * obtained from the <a
     * href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_pricing_ListPriceLists.html"
     * >ListPriceLists</a> response.
     * </p>
     * 
     * @return The unique identifier that maps to where your Price List files are located. <code>PriceListArn</code> can
     *         be obtained from the <a href=
     *         "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_pricing_ListPriceLists.html"
     *         >ListPriceLists</a> response.
     */

    public String getPriceListArn() {
        return this.priceListArn;
    }

    /**
     * <p>
     * The unique identifier that maps to where your Price List files are located. <code>PriceListArn</code> can be
     * obtained from the <a
     * href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_pricing_ListPriceLists.html"
     * >ListPriceLists</a> response.
     * </p>
     * 
     * @param priceListArn
     *        The unique identifier that maps to where your Price List files are located. <code>PriceListArn</code> can
     *        be obtained from the <a href=
     *        "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_pricing_ListPriceLists.html"
     *        >ListPriceLists</a> response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPriceListFileUrlRequest withPriceListArn(String priceListArn) {
        setPriceListArn(priceListArn);
        return this;
    }

    /**
     * <p>
     * The format that you want to retrieve your Price List files in. The <code>FileFormat</code> can be obtained from
     * the <a
     * href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_pricing_ListPriceLists.html">
     * ListPriceLists</a> response.
     * </p>
     * 
     * @param fileFormat
     *        The format that you want to retrieve your Price List files in. The <code>FileFormat</code> can be obtained
     *        from the <a href=
     *        "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_pricing_ListPriceLists.html"
     *        >ListPriceLists</a> response.
     */

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    /**
     * <p>
     * The format that you want to retrieve your Price List files in. The <code>FileFormat</code> can be obtained from
     * the <a
     * href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_pricing_ListPriceLists.html">
     * ListPriceLists</a> response.
     * </p>
     * 
     * @return The format that you want to retrieve your Price List files in. The <code>FileFormat</code> can be
     *         obtained from the <a href=
     *         "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_pricing_ListPriceLists.html"
     *         >ListPriceLists</a> response.
     */

    public String getFileFormat() {
        return this.fileFormat;
    }

    /**
     * <p>
     * The format that you want to retrieve your Price List files in. The <code>FileFormat</code> can be obtained from
     * the <a
     * href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_pricing_ListPriceLists.html">
     * ListPriceLists</a> response.
     * </p>
     * 
     * @param fileFormat
     *        The format that you want to retrieve your Price List files in. The <code>FileFormat</code> can be obtained
     *        from the <a href=
     *        "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_pricing_ListPriceLists.html"
     *        >ListPriceLists</a> response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPriceListFileUrlRequest withFileFormat(String fileFormat) {
        setFileFormat(fileFormat);
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
        if (getFileFormat() != null)
            sb.append("FileFormat: ").append(getFileFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPriceListFileUrlRequest == false)
            return false;
        GetPriceListFileUrlRequest other = (GetPriceListFileUrlRequest) obj;
        if (other.getPriceListArn() == null ^ this.getPriceListArn() == null)
            return false;
        if (other.getPriceListArn() != null && other.getPriceListArn().equals(this.getPriceListArn()) == false)
            return false;
        if (other.getFileFormat() == null ^ this.getFileFormat() == null)
            return false;
        if (other.getFileFormat() != null && other.getFileFormat().equals(this.getFileFormat()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPriceListArn() == null) ? 0 : getPriceListArn().hashCode());
        hashCode = prime * hashCode + ((getFileFormat() == null) ? 0 : getFileFormat().hashCode());
        return hashCode;
    }

    @Override
    public GetPriceListFileUrlRequest clone() {
        return (GetPriceListFileUrlRequest) super.clone();
    }

}
