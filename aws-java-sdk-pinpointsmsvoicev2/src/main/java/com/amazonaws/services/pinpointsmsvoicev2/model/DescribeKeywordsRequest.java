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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeKeywords"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeKeywordsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The origination identity to use such as a PhoneNumberId, PhoneNumberArn, SenderId or SenderIdArn. You can use
     * <a>DescribePhoneNumbers</a> to find the values for PhoneNumberId and PhoneNumberArn while
     * <a>DescribeSenderIds</a> can be used to get the values for SenderId and SenderIdArn.
     * </p>
     */
    private String originationIdentity;
    /**
     * <p>
     * An array of keywords to search for.
     * </p>
     */
    private java.util.List<String> keywords;
    /**
     * <p>
     * An array of keyword filters to filter the results.
     * </p>
     */
    private java.util.List<KeywordFilter> filters;
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
     * The origination identity to use such as a PhoneNumberId, PhoneNumberArn, SenderId or SenderIdArn. You can use
     * <a>DescribePhoneNumbers</a> to find the values for PhoneNumberId and PhoneNumberArn while
     * <a>DescribeSenderIds</a> can be used to get the values for SenderId and SenderIdArn.
     * </p>
     * 
     * @param originationIdentity
     *        The origination identity to use such as a PhoneNumberId, PhoneNumberArn, SenderId or SenderIdArn. You can
     *        use <a>DescribePhoneNumbers</a> to find the values for PhoneNumberId and PhoneNumberArn while
     *        <a>DescribeSenderIds</a> can be used to get the values for SenderId and SenderIdArn.
     */

    public void setOriginationIdentity(String originationIdentity) {
        this.originationIdentity = originationIdentity;
    }

    /**
     * <p>
     * The origination identity to use such as a PhoneNumberId, PhoneNumberArn, SenderId or SenderIdArn. You can use
     * <a>DescribePhoneNumbers</a> to find the values for PhoneNumberId and PhoneNumberArn while
     * <a>DescribeSenderIds</a> can be used to get the values for SenderId and SenderIdArn.
     * </p>
     * 
     * @return The origination identity to use such as a PhoneNumberId, PhoneNumberArn, SenderId or SenderIdArn. You can
     *         use <a>DescribePhoneNumbers</a> to find the values for PhoneNumberId and PhoneNumberArn while
     *         <a>DescribeSenderIds</a> can be used to get the values for SenderId and SenderIdArn.
     */

    public String getOriginationIdentity() {
        return this.originationIdentity;
    }

    /**
     * <p>
     * The origination identity to use such as a PhoneNumberId, PhoneNumberArn, SenderId or SenderIdArn. You can use
     * <a>DescribePhoneNumbers</a> to find the values for PhoneNumberId and PhoneNumberArn while
     * <a>DescribeSenderIds</a> can be used to get the values for SenderId and SenderIdArn.
     * </p>
     * 
     * @param originationIdentity
     *        The origination identity to use such as a PhoneNumberId, PhoneNumberArn, SenderId or SenderIdArn. You can
     *        use <a>DescribePhoneNumbers</a> to find the values for PhoneNumberId and PhoneNumberArn while
     *        <a>DescribeSenderIds</a> can be used to get the values for SenderId and SenderIdArn.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeKeywordsRequest withOriginationIdentity(String originationIdentity) {
        setOriginationIdentity(originationIdentity);
        return this;
    }

    /**
     * <p>
     * An array of keywords to search for.
     * </p>
     * 
     * @return An array of keywords to search for.
     */

    public java.util.List<String> getKeywords() {
        return keywords;
    }

    /**
     * <p>
     * An array of keywords to search for.
     * </p>
     * 
     * @param keywords
     *        An array of keywords to search for.
     */

    public void setKeywords(java.util.Collection<String> keywords) {
        if (keywords == null) {
            this.keywords = null;
            return;
        }

        this.keywords = new java.util.ArrayList<String>(keywords);
    }

    /**
     * <p>
     * An array of keywords to search for.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKeywords(java.util.Collection)} or {@link #withKeywords(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param keywords
     *        An array of keywords to search for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeKeywordsRequest withKeywords(String... keywords) {
        if (this.keywords == null) {
            setKeywords(new java.util.ArrayList<String>(keywords.length));
        }
        for (String ele : keywords) {
            this.keywords.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of keywords to search for.
     * </p>
     * 
     * @param keywords
     *        An array of keywords to search for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeKeywordsRequest withKeywords(java.util.Collection<String> keywords) {
        setKeywords(keywords);
        return this;
    }

    /**
     * <p>
     * An array of keyword filters to filter the results.
     * </p>
     * 
     * @return An array of keyword filters to filter the results.
     */

    public java.util.List<KeywordFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * An array of keyword filters to filter the results.
     * </p>
     * 
     * @param filters
     *        An array of keyword filters to filter the results.
     */

    public void setFilters(java.util.Collection<KeywordFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<KeywordFilter>(filters);
    }

    /**
     * <p>
     * An array of keyword filters to filter the results.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        An array of keyword filters to filter the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeKeywordsRequest withFilters(KeywordFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<KeywordFilter>(filters.length));
        }
        for (KeywordFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of keyword filters to filter the results.
     * </p>
     * 
     * @param filters
     *        An array of keyword filters to filter the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeKeywordsRequest withFilters(java.util.Collection<KeywordFilter> filters) {
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

    public DescribeKeywordsRequest withNextToken(String nextToken) {
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

    public DescribeKeywordsRequest withMaxResults(Integer maxResults) {
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
        if (getOriginationIdentity() != null)
            sb.append("OriginationIdentity: ").append(getOriginationIdentity()).append(",");
        if (getKeywords() != null)
            sb.append("Keywords: ").append(getKeywords()).append(",");
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

        if (obj instanceof DescribeKeywordsRequest == false)
            return false;
        DescribeKeywordsRequest other = (DescribeKeywordsRequest) obj;
        if (other.getOriginationIdentity() == null ^ this.getOriginationIdentity() == null)
            return false;
        if (other.getOriginationIdentity() != null && other.getOriginationIdentity().equals(this.getOriginationIdentity()) == false)
            return false;
        if (other.getKeywords() == null ^ this.getKeywords() == null)
            return false;
        if (other.getKeywords() != null && other.getKeywords().equals(this.getKeywords()) == false)
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

        hashCode = prime * hashCode + ((getOriginationIdentity() == null) ? 0 : getOriginationIdentity().hashCode());
        hashCode = prime * hashCode + ((getKeywords() == null) ? 0 : getKeywords().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public DescribeKeywordsRequest clone() {
        return (DescribeKeywordsRequest) super.clone();
    }

}
