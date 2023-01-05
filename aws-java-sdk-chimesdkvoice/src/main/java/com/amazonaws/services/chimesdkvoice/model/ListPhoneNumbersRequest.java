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
package com.amazonaws.services.chimesdkvoice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListPhoneNumbers" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPhoneNumbersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String status;

    private String productType;

    private String filterName;

    private String filterValue;

    private Integer maxResults;

    private String nextToken;

    /**
     * @param status
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * @param status
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPhoneNumbersRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * @param productType
     * @see PhoneNumberProductType
     */

    public void setProductType(String productType) {
        this.productType = productType;
    }

    /**
     * @return
     * @see PhoneNumberProductType
     */

    public String getProductType() {
        return this.productType;
    }

    /**
     * @param productType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneNumberProductType
     */

    public ListPhoneNumbersRequest withProductType(String productType) {
        setProductType(productType);
        return this;
    }

    /**
     * @param productType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneNumberProductType
     */

    public ListPhoneNumbersRequest withProductType(PhoneNumberProductType productType) {
        this.productType = productType.toString();
        return this;
    }

    /**
     * @param filterName
     * @see PhoneNumberAssociationName
     */

    public void setFilterName(String filterName) {
        this.filterName = filterName;
    }

    /**
     * @return
     * @see PhoneNumberAssociationName
     */

    public String getFilterName() {
        return this.filterName;
    }

    /**
     * @param filterName
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneNumberAssociationName
     */

    public ListPhoneNumbersRequest withFilterName(String filterName) {
        setFilterName(filterName);
        return this;
    }

    /**
     * @param filterName
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneNumberAssociationName
     */

    public ListPhoneNumbersRequest withFilterName(PhoneNumberAssociationName filterName) {
        this.filterName = filterName.toString();
        return this;
    }

    /**
     * @param filterValue
     */

    public void setFilterValue(String filterValue) {
        this.filterValue = filterValue;
    }

    /**
     * @return
     */

    public String getFilterValue() {
        return this.filterValue;
    }

    /**
     * @param filterValue
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPhoneNumbersRequest withFilterValue(String filterValue) {
        setFilterValue(filterValue);
        return this;
    }

    /**
     * @param maxResults
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * @return
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @param maxResults
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPhoneNumbersRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPhoneNumbersRequest withNextToken(String nextToken) {
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getProductType() != null)
            sb.append("ProductType: ").append(getProductType()).append(",");
        if (getFilterName() != null)
            sb.append("FilterName: ").append(getFilterName()).append(",");
        if (getFilterValue() != null)
            sb.append("FilterValue: ").append(getFilterValue()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof ListPhoneNumbersRequest == false)
            return false;
        ListPhoneNumbersRequest other = (ListPhoneNumbersRequest) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getProductType() == null ^ this.getProductType() == null)
            return false;
        if (other.getProductType() != null && other.getProductType().equals(this.getProductType()) == false)
            return false;
        if (other.getFilterName() == null ^ this.getFilterName() == null)
            return false;
        if (other.getFilterName() != null && other.getFilterName().equals(this.getFilterName()) == false)
            return false;
        if (other.getFilterValue() == null ^ this.getFilterValue() == null)
            return false;
        if (other.getFilterValue() != null && other.getFilterValue().equals(this.getFilterValue()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getProductType() == null) ? 0 : getProductType().hashCode());
        hashCode = prime * hashCode + ((getFilterName() == null) ? 0 : getFilterName().hashCode());
        hashCode = prime * hashCode + ((getFilterValue() == null) ? 0 : getFilterValue().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPhoneNumbersRequest clone() {
        return (ListPhoneNumbersRequest) super.clone();
    }

}
