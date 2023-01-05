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
package com.amazonaws.services.pinpointsmsvoicev2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribePhoneNumbers"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePhoneNumbersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of phone numbers to find information about. This is an array of strings that can be either
     * the PhoneNumberId or PhoneNumberArn.
     * </p>
     */
    private java.util.List<String> phoneNumberIds;
    /**
     * <p>
     * An array of PhoneNumberFilter objects to filter the results.
     * </p>
     */
    private java.util.List<PhoneNumberFilter> filters;
    /**
     * <p>
     * The token to be used for the next set of paginated results. You don't need to supply a value for this field in
     * the initial request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return per each request.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The unique identifier of phone numbers to find information about. This is an array of strings that can be either
     * the PhoneNumberId or PhoneNumberArn.
     * </p>
     * 
     * @return The unique identifier of phone numbers to find information about. This is an array of strings that can be
     *         either the PhoneNumberId or PhoneNumberArn.
     */

    public java.util.List<String> getPhoneNumberIds() {
        return phoneNumberIds;
    }

    /**
     * <p>
     * The unique identifier of phone numbers to find information about. This is an array of strings that can be either
     * the PhoneNumberId or PhoneNumberArn.
     * </p>
     * 
     * @param phoneNumberIds
     *        The unique identifier of phone numbers to find information about. This is an array of strings that can be
     *        either the PhoneNumberId or PhoneNumberArn.
     */

    public void setPhoneNumberIds(java.util.Collection<String> phoneNumberIds) {
        if (phoneNumberIds == null) {
            this.phoneNumberIds = null;
            return;
        }

        this.phoneNumberIds = new java.util.ArrayList<String>(phoneNumberIds);
    }

    /**
     * <p>
     * The unique identifier of phone numbers to find information about. This is an array of strings that can be either
     * the PhoneNumberId or PhoneNumberArn.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPhoneNumberIds(java.util.Collection)} or {@link #withPhoneNumberIds(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param phoneNumberIds
     *        The unique identifier of phone numbers to find information about. This is an array of strings that can be
     *        either the PhoneNumberId or PhoneNumberArn.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePhoneNumbersRequest withPhoneNumberIds(String... phoneNumberIds) {
        if (this.phoneNumberIds == null) {
            setPhoneNumberIds(new java.util.ArrayList<String>(phoneNumberIds.length));
        }
        for (String ele : phoneNumberIds) {
            this.phoneNumberIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The unique identifier of phone numbers to find information about. This is an array of strings that can be either
     * the PhoneNumberId or PhoneNumberArn.
     * </p>
     * 
     * @param phoneNumberIds
     *        The unique identifier of phone numbers to find information about. This is an array of strings that can be
     *        either the PhoneNumberId or PhoneNumberArn.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePhoneNumbersRequest withPhoneNumberIds(java.util.Collection<String> phoneNumberIds) {
        setPhoneNumberIds(phoneNumberIds);
        return this;
    }

    /**
     * <p>
     * An array of PhoneNumberFilter objects to filter the results.
     * </p>
     * 
     * @return An array of PhoneNumberFilter objects to filter the results.
     */

    public java.util.List<PhoneNumberFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * An array of PhoneNumberFilter objects to filter the results.
     * </p>
     * 
     * @param filters
     *        An array of PhoneNumberFilter objects to filter the results.
     */

    public void setFilters(java.util.Collection<PhoneNumberFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<PhoneNumberFilter>(filters);
    }

    /**
     * <p>
     * An array of PhoneNumberFilter objects to filter the results.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        An array of PhoneNumberFilter objects to filter the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePhoneNumbersRequest withFilters(PhoneNumberFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<PhoneNumberFilter>(filters.length));
        }
        for (PhoneNumberFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of PhoneNumberFilter objects to filter the results.
     * </p>
     * 
     * @param filters
     *        An array of PhoneNumberFilter objects to filter the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePhoneNumbersRequest withFilters(java.util.Collection<PhoneNumberFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results. You don't need to supply a value for this field in
     * the initial request.
     * </p>
     * 
     * @param nextToken
     *        The token to be used for the next set of paginated results. You don't need to supply a value for this
     *        field in the initial request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results. You don't need to supply a value for this field in
     * the initial request.
     * </p>
     * 
     * @return The token to be used for the next set of paginated results. You don't need to supply a value for this
     *         field in the initial request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results. You don't need to supply a value for this field in
     * the initial request.
     * </p>
     * 
     * @param nextToken
     *        The token to be used for the next set of paginated results. You don't need to supply a value for this
     *        field in the initial request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePhoneNumbersRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return per each request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return per each request.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per each request.
     * </p>
     * 
     * @return The maximum number of results to return per each request.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per each request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return per each request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePhoneNumbersRequest withMaxResults(Integer maxResults) {
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
        if (getPhoneNumberIds() != null)
            sb.append("PhoneNumberIds: ").append(getPhoneNumberIds()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
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

        if (obj instanceof DescribePhoneNumbersRequest == false)
            return false;
        DescribePhoneNumbersRequest other = (DescribePhoneNumbersRequest) obj;
        if (other.getPhoneNumberIds() == null ^ this.getPhoneNumberIds() == null)
            return false;
        if (other.getPhoneNumberIds() != null && other.getPhoneNumberIds().equals(this.getPhoneNumberIds()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
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

        hashCode = prime * hashCode + ((getPhoneNumberIds() == null) ? 0 : getPhoneNumberIds().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public DescribePhoneNumbersRequest clone() {
        return (DescribePhoneNumbersRequest) super.clone();
    }

}
