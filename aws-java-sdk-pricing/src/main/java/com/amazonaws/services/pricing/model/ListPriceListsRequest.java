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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pricing-2017-10-15/ListPriceLists" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPriceListsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The service code or the Savings Plan service code for the attributes that you want to retrieve. For example, to
     * get the list of applicable Amazon EC2 price lists, use <code>AmazonEC2</code>. For a full list of service codes
     * containing On-Demand and Reserved Instance (RI) pricing, use the <a href=
     * "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_pricing_DescribeServices.html#awscostmanagement-pricing_DescribeServices-request-FormatVersion"
     * >DescribeServices</a> API.
     * </p>
     * <p>
     * To retrieve the Reserved Instance and Compute Savings Plan price lists, use <code>ComputeSavingsPlans</code>.
     * </p>
     * <p>
     * To retrieve Machine Learning Savings Plans price lists, use <code>MachineLearningSavingsPlans</code>.
     * </p>
     */
    private String serviceCode;
    /**
     * <p>
     * The date that the Price List file prices are effective from.
     * </p>
     */
    private java.util.Date effectiveDate;
    /**
     * <p>
     * This is used to filter the Price List by Amazon Web Services Region. For example, to get the price list only for
     * the <code>US East (N. Virginia)</code> Region, use <code>us-east-1</code>. If nothing is specified, you retrieve
     * price lists for all applicable Regions. The available <code>RegionCode</code> list can be retrieved from <a
     * href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_pricing_GetAttributeValues.html"
     * >GetAttributeValues</a> API.
     * </p>
     */
    private String regionCode;
    /**
     * <p>
     * The three alphabetical character ISO-4217 currency code that the Price List files are denominated in.
     * </p>
     */
    private String currencyCode;
    /**
     * <p>
     * The pagination token that indicates the next set of results that you want to retrieve.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The service code or the Savings Plan service code for the attributes that you want to retrieve. For example, to
     * get the list of applicable Amazon EC2 price lists, use <code>AmazonEC2</code>. For a full list of service codes
     * containing On-Demand and Reserved Instance (RI) pricing, use the <a href=
     * "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_pricing_DescribeServices.html#awscostmanagement-pricing_DescribeServices-request-FormatVersion"
     * >DescribeServices</a> API.
     * </p>
     * <p>
     * To retrieve the Reserved Instance and Compute Savings Plan price lists, use <code>ComputeSavingsPlans</code>.
     * </p>
     * <p>
     * To retrieve Machine Learning Savings Plans price lists, use <code>MachineLearningSavingsPlans</code>.
     * </p>
     * 
     * @param serviceCode
     *        The service code or the Savings Plan service code for the attributes that you want to retrieve. For
     *        example, to get the list of applicable Amazon EC2 price lists, use <code>AmazonEC2</code>. For a full list
     *        of service codes containing On-Demand and Reserved Instance (RI) pricing, use the <a href=
     *        "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_pricing_DescribeServices.html#awscostmanagement-pricing_DescribeServices-request-FormatVersion"
     *        >DescribeServices</a> API.</p>
     *        <p>
     *        To retrieve the Reserved Instance and Compute Savings Plan price lists, use
     *        <code>ComputeSavingsPlans</code>.
     *        </p>
     *        <p>
     *        To retrieve Machine Learning Savings Plans price lists, use <code>MachineLearningSavingsPlans</code>.
     */

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * <p>
     * The service code or the Savings Plan service code for the attributes that you want to retrieve. For example, to
     * get the list of applicable Amazon EC2 price lists, use <code>AmazonEC2</code>. For a full list of service codes
     * containing On-Demand and Reserved Instance (RI) pricing, use the <a href=
     * "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_pricing_DescribeServices.html#awscostmanagement-pricing_DescribeServices-request-FormatVersion"
     * >DescribeServices</a> API.
     * </p>
     * <p>
     * To retrieve the Reserved Instance and Compute Savings Plan price lists, use <code>ComputeSavingsPlans</code>.
     * </p>
     * <p>
     * To retrieve Machine Learning Savings Plans price lists, use <code>MachineLearningSavingsPlans</code>.
     * </p>
     * 
     * @return The service code or the Savings Plan service code for the attributes that you want to retrieve. For
     *         example, to get the list of applicable Amazon EC2 price lists, use <code>AmazonEC2</code>. For a full
     *         list of service codes containing On-Demand and Reserved Instance (RI) pricing, use the <a href=
     *         "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_pricing_DescribeServices.html#awscostmanagement-pricing_DescribeServices-request-FormatVersion"
     *         >DescribeServices</a> API.</p>
     *         <p>
     *         To retrieve the Reserved Instance and Compute Savings Plan price lists, use
     *         <code>ComputeSavingsPlans</code>.
     *         </p>
     *         <p>
     *         To retrieve Machine Learning Savings Plans price lists, use <code>MachineLearningSavingsPlans</code>.
     */

    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * <p>
     * The service code or the Savings Plan service code for the attributes that you want to retrieve. For example, to
     * get the list of applicable Amazon EC2 price lists, use <code>AmazonEC2</code>. For a full list of service codes
     * containing On-Demand and Reserved Instance (RI) pricing, use the <a href=
     * "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_pricing_DescribeServices.html#awscostmanagement-pricing_DescribeServices-request-FormatVersion"
     * >DescribeServices</a> API.
     * </p>
     * <p>
     * To retrieve the Reserved Instance and Compute Savings Plan price lists, use <code>ComputeSavingsPlans</code>.
     * </p>
     * <p>
     * To retrieve Machine Learning Savings Plans price lists, use <code>MachineLearningSavingsPlans</code>.
     * </p>
     * 
     * @param serviceCode
     *        The service code or the Savings Plan service code for the attributes that you want to retrieve. For
     *        example, to get the list of applicable Amazon EC2 price lists, use <code>AmazonEC2</code>. For a full list
     *        of service codes containing On-Demand and Reserved Instance (RI) pricing, use the <a href=
     *        "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_pricing_DescribeServices.html#awscostmanagement-pricing_DescribeServices-request-FormatVersion"
     *        >DescribeServices</a> API.</p>
     *        <p>
     *        To retrieve the Reserved Instance and Compute Savings Plan price lists, use
     *        <code>ComputeSavingsPlans</code>.
     *        </p>
     *        <p>
     *        To retrieve Machine Learning Savings Plans price lists, use <code>MachineLearningSavingsPlans</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPriceListsRequest withServiceCode(String serviceCode) {
        setServiceCode(serviceCode);
        return this;
    }

    /**
     * <p>
     * The date that the Price List file prices are effective from.
     * </p>
     * 
     * @param effectiveDate
     *        The date that the Price List file prices are effective from.
     */

    public void setEffectiveDate(java.util.Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    /**
     * <p>
     * The date that the Price List file prices are effective from.
     * </p>
     * 
     * @return The date that the Price List file prices are effective from.
     */

    public java.util.Date getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * <p>
     * The date that the Price List file prices are effective from.
     * </p>
     * 
     * @param effectiveDate
     *        The date that the Price List file prices are effective from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPriceListsRequest withEffectiveDate(java.util.Date effectiveDate) {
        setEffectiveDate(effectiveDate);
        return this;
    }

    /**
     * <p>
     * This is used to filter the Price List by Amazon Web Services Region. For example, to get the price list only for
     * the <code>US East (N. Virginia)</code> Region, use <code>us-east-1</code>. If nothing is specified, you retrieve
     * price lists for all applicable Regions. The available <code>RegionCode</code> list can be retrieved from <a
     * href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_pricing_GetAttributeValues.html"
     * >GetAttributeValues</a> API.
     * </p>
     * 
     * @param regionCode
     *        This is used to filter the Price List by Amazon Web Services Region. For example, to get the price list
     *        only for the <code>US East (N. Virginia)</code> Region, use <code>us-east-1</code>. If nothing is
     *        specified, you retrieve price lists for all applicable Regions. The available <code>RegionCode</code> list
     *        can be retrieved from <a href=
     *        "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_pricing_GetAttributeValues.html"
     *        >GetAttributeValues</a> API.
     */

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    /**
     * <p>
     * This is used to filter the Price List by Amazon Web Services Region. For example, to get the price list only for
     * the <code>US East (N. Virginia)</code> Region, use <code>us-east-1</code>. If nothing is specified, you retrieve
     * price lists for all applicable Regions. The available <code>RegionCode</code> list can be retrieved from <a
     * href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_pricing_GetAttributeValues.html"
     * >GetAttributeValues</a> API.
     * </p>
     * 
     * @return This is used to filter the Price List by Amazon Web Services Region. For example, to get the price list
     *         only for the <code>US East (N. Virginia)</code> Region, use <code>us-east-1</code>. If nothing is
     *         specified, you retrieve price lists for all applicable Regions. The available <code>RegionCode</code>
     *         list can be retrieved from <a href=
     *         "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_pricing_GetAttributeValues.html"
     *         >GetAttributeValues</a> API.
     */

    public String getRegionCode() {
        return this.regionCode;
    }

    /**
     * <p>
     * This is used to filter the Price List by Amazon Web Services Region. For example, to get the price list only for
     * the <code>US East (N. Virginia)</code> Region, use <code>us-east-1</code>. If nothing is specified, you retrieve
     * price lists for all applicable Regions. The available <code>RegionCode</code> list can be retrieved from <a
     * href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_pricing_GetAttributeValues.html"
     * >GetAttributeValues</a> API.
     * </p>
     * 
     * @param regionCode
     *        This is used to filter the Price List by Amazon Web Services Region. For example, to get the price list
     *        only for the <code>US East (N. Virginia)</code> Region, use <code>us-east-1</code>. If nothing is
     *        specified, you retrieve price lists for all applicable Regions. The available <code>RegionCode</code> list
     *        can be retrieved from <a href=
     *        "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_pricing_GetAttributeValues.html"
     *        >GetAttributeValues</a> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPriceListsRequest withRegionCode(String regionCode) {
        setRegionCode(regionCode);
        return this;
    }

    /**
     * <p>
     * The three alphabetical character ISO-4217 currency code that the Price List files are denominated in.
     * </p>
     * 
     * @param currencyCode
     *        The three alphabetical character ISO-4217 currency code that the Price List files are denominated in.
     */

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * <p>
     * The three alphabetical character ISO-4217 currency code that the Price List files are denominated in.
     * </p>
     * 
     * @return The three alphabetical character ISO-4217 currency code that the Price List files are denominated in.
     */

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * <p>
     * The three alphabetical character ISO-4217 currency code that the Price List files are denominated in.
     * </p>
     * 
     * @param currencyCode
     *        The three alphabetical character ISO-4217 currency code that the Price List files are denominated in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPriceListsRequest withCurrencyCode(String currencyCode) {
        setCurrencyCode(currencyCode);
        return this;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results that you want to retrieve.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that indicates the next set of results that you want to retrieve.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results that you want to retrieve.
     * </p>
     * 
     * @return The pagination token that indicates the next set of results that you want to retrieve.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results that you want to retrieve.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that indicates the next set of results that you want to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPriceListsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in the response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     * 
     * @return The maximum number of results to return in the response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPriceListsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getServiceCode() != null)
            sb.append("ServiceCode: ").append(getServiceCode()).append(",");
        if (getEffectiveDate() != null)
            sb.append("EffectiveDate: ").append(getEffectiveDate()).append(",");
        if (getRegionCode() != null)
            sb.append("RegionCode: ").append(getRegionCode()).append(",");
        if (getCurrencyCode() != null)
            sb.append("CurrencyCode: ").append(getCurrencyCode()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPriceListsRequest == false)
            return false;
        ListPriceListsRequest other = (ListPriceListsRequest) obj;
        if (other.getServiceCode() == null ^ this.getServiceCode() == null)
            return false;
        if (other.getServiceCode() != null && other.getServiceCode().equals(this.getServiceCode()) == false)
            return false;
        if (other.getEffectiveDate() == null ^ this.getEffectiveDate() == null)
            return false;
        if (other.getEffectiveDate() != null && other.getEffectiveDate().equals(this.getEffectiveDate()) == false)
            return false;
        if (other.getRegionCode() == null ^ this.getRegionCode() == null)
            return false;
        if (other.getRegionCode() != null && other.getRegionCode().equals(this.getRegionCode()) == false)
            return false;
        if (other.getCurrencyCode() == null ^ this.getCurrencyCode() == null)
            return false;
        if (other.getCurrencyCode() != null && other.getCurrencyCode().equals(this.getCurrencyCode()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceCode() == null) ? 0 : getServiceCode().hashCode());
        hashCode = prime * hashCode + ((getEffectiveDate() == null) ? 0 : getEffectiveDate().hashCode());
        hashCode = prime * hashCode + ((getRegionCode() == null) ? 0 : getRegionCode().hashCode());
        hashCode = prime * hashCode + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListPriceListsRequest clone() {
        return (ListPriceListsRequest) super.clone();
    }

}
