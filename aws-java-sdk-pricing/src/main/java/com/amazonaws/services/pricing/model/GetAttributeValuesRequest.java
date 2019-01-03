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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pricing-2017-10-15/GetAttributeValues" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAttributeValuesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The service code for the service whose attributes you want to retrieve. For example, if you want the retrieve an
     * EC2 attribute, use <code>AmazonEC2</code>.
     * </p>
     */
    private String serviceCode;
    /**
     * <p>
     * The name of the attribute that you want to retrieve the values for, such as <code>volumeType</code>.
     * </p>
     */
    private String attributeName;
    /**
     * <p>
     * The pagination token that indicates the next set of results that you want to retrieve.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return in response.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The service code for the service whose attributes you want to retrieve. For example, if you want the retrieve an
     * EC2 attribute, use <code>AmazonEC2</code>.
     * </p>
     * 
     * @param serviceCode
     *        The service code for the service whose attributes you want to retrieve. For example, if you want the
     *        retrieve an EC2 attribute, use <code>AmazonEC2</code>.
     */

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * <p>
     * The service code for the service whose attributes you want to retrieve. For example, if you want the retrieve an
     * EC2 attribute, use <code>AmazonEC2</code>.
     * </p>
     * 
     * @return The service code for the service whose attributes you want to retrieve. For example, if you want the
     *         retrieve an EC2 attribute, use <code>AmazonEC2</code>.
     */

    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * <p>
     * The service code for the service whose attributes you want to retrieve. For example, if you want the retrieve an
     * EC2 attribute, use <code>AmazonEC2</code>.
     * </p>
     * 
     * @param serviceCode
     *        The service code for the service whose attributes you want to retrieve. For example, if you want the
     *        retrieve an EC2 attribute, use <code>AmazonEC2</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAttributeValuesRequest withServiceCode(String serviceCode) {
        setServiceCode(serviceCode);
        return this;
    }

    /**
     * <p>
     * The name of the attribute that you want to retrieve the values for, such as <code>volumeType</code>.
     * </p>
     * 
     * @param attributeName
     *        The name of the attribute that you want to retrieve the values for, such as <code>volumeType</code>.
     */

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * <p>
     * The name of the attribute that you want to retrieve the values for, such as <code>volumeType</code>.
     * </p>
     * 
     * @return The name of the attribute that you want to retrieve the values for, such as <code>volumeType</code>.
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     * <p>
     * The name of the attribute that you want to retrieve the values for, such as <code>volumeType</code>.
     * </p>
     * 
     * @param attributeName
     *        The name of the attribute that you want to retrieve the values for, such as <code>volumeType</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAttributeValuesRequest withAttributeName(String attributeName) {
        setAttributeName(attributeName);
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

    public GetAttributeValuesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in response.
     * </p>
     * 
     * @return The maximum number of results to return in response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAttributeValuesRequest withMaxResults(Integer maxResults) {
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
        if (getAttributeName() != null)
            sb.append("AttributeName: ").append(getAttributeName()).append(",");
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

        if (obj instanceof GetAttributeValuesRequest == false)
            return false;
        GetAttributeValuesRequest other = (GetAttributeValuesRequest) obj;
        if (other.getServiceCode() == null ^ this.getServiceCode() == null)
            return false;
        if (other.getServiceCode() != null && other.getServiceCode().equals(this.getServiceCode()) == false)
            return false;
        if (other.getAttributeName() == null ^ this.getAttributeName() == null)
            return false;
        if (other.getAttributeName() != null && other.getAttributeName().equals(this.getAttributeName()) == false)
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
        hashCode = prime * hashCode + ((getAttributeName() == null) ? 0 : getAttributeName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public GetAttributeValuesRequest clone() {
        return (GetAttributeValuesRequest) super.clone();
    }

}
