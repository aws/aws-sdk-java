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
package com.amazonaws.services.pinpointsmsvoicev2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeVerifiedDestinationNumbers"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVerifiedDestinationNumbersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An array of VerifiedDestinationNumberid to retreive.
     * </p>
     */
    private java.util.List<String> verifiedDestinationNumberIds;
    /**
     * <p>
     * An array of verified destination phone number, in E.164 format.
     * </p>
     */
    private java.util.List<String> destinationPhoneNumbers;
    /**
     * <p>
     * An array of VerifiedDestinationNumberFilter objects to filter the results.
     * </p>
     */
    private java.util.List<VerifiedDestinationNumberFilter> filters;
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
     * An array of VerifiedDestinationNumberid to retreive.
     * </p>
     * 
     * @return An array of VerifiedDestinationNumberid to retreive.
     */

    public java.util.List<String> getVerifiedDestinationNumberIds() {
        return verifiedDestinationNumberIds;
    }

    /**
     * <p>
     * An array of VerifiedDestinationNumberid to retreive.
     * </p>
     * 
     * @param verifiedDestinationNumberIds
     *        An array of VerifiedDestinationNumberid to retreive.
     */

    public void setVerifiedDestinationNumberIds(java.util.Collection<String> verifiedDestinationNumberIds) {
        if (verifiedDestinationNumberIds == null) {
            this.verifiedDestinationNumberIds = null;
            return;
        }

        this.verifiedDestinationNumberIds = new java.util.ArrayList<String>(verifiedDestinationNumberIds);
    }

    /**
     * <p>
     * An array of VerifiedDestinationNumberid to retreive.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVerifiedDestinationNumberIds(java.util.Collection)} or
     * {@link #withVerifiedDestinationNumberIds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param verifiedDestinationNumberIds
     *        An array of VerifiedDestinationNumberid to retreive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVerifiedDestinationNumbersRequest withVerifiedDestinationNumberIds(String... verifiedDestinationNumberIds) {
        if (this.verifiedDestinationNumberIds == null) {
            setVerifiedDestinationNumberIds(new java.util.ArrayList<String>(verifiedDestinationNumberIds.length));
        }
        for (String ele : verifiedDestinationNumberIds) {
            this.verifiedDestinationNumberIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of VerifiedDestinationNumberid to retreive.
     * </p>
     * 
     * @param verifiedDestinationNumberIds
     *        An array of VerifiedDestinationNumberid to retreive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVerifiedDestinationNumbersRequest withVerifiedDestinationNumberIds(java.util.Collection<String> verifiedDestinationNumberIds) {
        setVerifiedDestinationNumberIds(verifiedDestinationNumberIds);
        return this;
    }

    /**
     * <p>
     * An array of verified destination phone number, in E.164 format.
     * </p>
     * 
     * @return An array of verified destination phone number, in E.164 format.
     */

    public java.util.List<String> getDestinationPhoneNumbers() {
        return destinationPhoneNumbers;
    }

    /**
     * <p>
     * An array of verified destination phone number, in E.164 format.
     * </p>
     * 
     * @param destinationPhoneNumbers
     *        An array of verified destination phone number, in E.164 format.
     */

    public void setDestinationPhoneNumbers(java.util.Collection<String> destinationPhoneNumbers) {
        if (destinationPhoneNumbers == null) {
            this.destinationPhoneNumbers = null;
            return;
        }

        this.destinationPhoneNumbers = new java.util.ArrayList<String>(destinationPhoneNumbers);
    }

    /**
     * <p>
     * An array of verified destination phone number, in E.164 format.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinationPhoneNumbers(java.util.Collection)} or
     * {@link #withDestinationPhoneNumbers(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param destinationPhoneNumbers
     *        An array of verified destination phone number, in E.164 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVerifiedDestinationNumbersRequest withDestinationPhoneNumbers(String... destinationPhoneNumbers) {
        if (this.destinationPhoneNumbers == null) {
            setDestinationPhoneNumbers(new java.util.ArrayList<String>(destinationPhoneNumbers.length));
        }
        for (String ele : destinationPhoneNumbers) {
            this.destinationPhoneNumbers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of verified destination phone number, in E.164 format.
     * </p>
     * 
     * @param destinationPhoneNumbers
     *        An array of verified destination phone number, in E.164 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVerifiedDestinationNumbersRequest withDestinationPhoneNumbers(java.util.Collection<String> destinationPhoneNumbers) {
        setDestinationPhoneNumbers(destinationPhoneNumbers);
        return this;
    }

    /**
     * <p>
     * An array of VerifiedDestinationNumberFilter objects to filter the results.
     * </p>
     * 
     * @return An array of VerifiedDestinationNumberFilter objects to filter the results.
     */

    public java.util.List<VerifiedDestinationNumberFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * An array of VerifiedDestinationNumberFilter objects to filter the results.
     * </p>
     * 
     * @param filters
     *        An array of VerifiedDestinationNumberFilter objects to filter the results.
     */

    public void setFilters(java.util.Collection<VerifiedDestinationNumberFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<VerifiedDestinationNumberFilter>(filters);
    }

    /**
     * <p>
     * An array of VerifiedDestinationNumberFilter objects to filter the results.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        An array of VerifiedDestinationNumberFilter objects to filter the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVerifiedDestinationNumbersRequest withFilters(VerifiedDestinationNumberFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<VerifiedDestinationNumberFilter>(filters.length));
        }
        for (VerifiedDestinationNumberFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of VerifiedDestinationNumberFilter objects to filter the results.
     * </p>
     * 
     * @param filters
     *        An array of VerifiedDestinationNumberFilter objects to filter the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVerifiedDestinationNumbersRequest withFilters(java.util.Collection<VerifiedDestinationNumberFilter> filters) {
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

    public DescribeVerifiedDestinationNumbersRequest withNextToken(String nextToken) {
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

    public DescribeVerifiedDestinationNumbersRequest withMaxResults(Integer maxResults) {
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
        if (getVerifiedDestinationNumberIds() != null)
            sb.append("VerifiedDestinationNumberIds: ").append(getVerifiedDestinationNumberIds()).append(",");
        if (getDestinationPhoneNumbers() != null)
            sb.append("DestinationPhoneNumbers: ").append(getDestinationPhoneNumbers()).append(",");
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

        if (obj instanceof DescribeVerifiedDestinationNumbersRequest == false)
            return false;
        DescribeVerifiedDestinationNumbersRequest other = (DescribeVerifiedDestinationNumbersRequest) obj;
        if (other.getVerifiedDestinationNumberIds() == null ^ this.getVerifiedDestinationNumberIds() == null)
            return false;
        if (other.getVerifiedDestinationNumberIds() != null && other.getVerifiedDestinationNumberIds().equals(this.getVerifiedDestinationNumberIds()) == false)
            return false;
        if (other.getDestinationPhoneNumbers() == null ^ this.getDestinationPhoneNumbers() == null)
            return false;
        if (other.getDestinationPhoneNumbers() != null && other.getDestinationPhoneNumbers().equals(this.getDestinationPhoneNumbers()) == false)
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

        hashCode = prime * hashCode + ((getVerifiedDestinationNumberIds() == null) ? 0 : getVerifiedDestinationNumberIds().hashCode());
        hashCode = prime * hashCode + ((getDestinationPhoneNumbers() == null) ? 0 : getDestinationPhoneNumbers().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public DescribeVerifiedDestinationNumbersRequest clone() {
        return (DescribeVerifiedDestinationNumbersRequest) super.clone();
    }

}
