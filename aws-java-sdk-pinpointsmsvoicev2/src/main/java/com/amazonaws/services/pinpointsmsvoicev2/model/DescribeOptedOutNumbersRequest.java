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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeOptedOutNumbers"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeOptedOutNumbersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The OptOutListName or OptOutListArn of the OptOutList. You can use <a>DescribeOptOutLists</a> to find the values
     * for OptOutListName and OptOutListArn.
     * </p>
     */
    private String optOutListName;
    /**
     * <p>
     * An array of phone numbers to search for in the OptOutList.
     * </p>
     */
    private java.util.List<String> optedOutNumbers;
    /**
     * <p>
     * An array of OptedOutFilter objects to filter the results on.
     * </p>
     */
    private java.util.List<OptedOutFilter> filters;
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
     * The OptOutListName or OptOutListArn of the OptOutList. You can use <a>DescribeOptOutLists</a> to find the values
     * for OptOutListName and OptOutListArn.
     * </p>
     * 
     * @param optOutListName
     *        The OptOutListName or OptOutListArn of the OptOutList. You can use <a>DescribeOptOutLists</a> to find the
     *        values for OptOutListName and OptOutListArn.
     */

    public void setOptOutListName(String optOutListName) {
        this.optOutListName = optOutListName;
    }

    /**
     * <p>
     * The OptOutListName or OptOutListArn of the OptOutList. You can use <a>DescribeOptOutLists</a> to find the values
     * for OptOutListName and OptOutListArn.
     * </p>
     * 
     * @return The OptOutListName or OptOutListArn of the OptOutList. You can use <a>DescribeOptOutLists</a> to find the
     *         values for OptOutListName and OptOutListArn.
     */

    public String getOptOutListName() {
        return this.optOutListName;
    }

    /**
     * <p>
     * The OptOutListName or OptOutListArn of the OptOutList. You can use <a>DescribeOptOutLists</a> to find the values
     * for OptOutListName and OptOutListArn.
     * </p>
     * 
     * @param optOutListName
     *        The OptOutListName or OptOutListArn of the OptOutList. You can use <a>DescribeOptOutLists</a> to find the
     *        values for OptOutListName and OptOutListArn.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOptedOutNumbersRequest withOptOutListName(String optOutListName) {
        setOptOutListName(optOutListName);
        return this;
    }

    /**
     * <p>
     * An array of phone numbers to search for in the OptOutList.
     * </p>
     * 
     * @return An array of phone numbers to search for in the OptOutList.
     */

    public java.util.List<String> getOptedOutNumbers() {
        return optedOutNumbers;
    }

    /**
     * <p>
     * An array of phone numbers to search for in the OptOutList.
     * </p>
     * 
     * @param optedOutNumbers
     *        An array of phone numbers to search for in the OptOutList.
     */

    public void setOptedOutNumbers(java.util.Collection<String> optedOutNumbers) {
        if (optedOutNumbers == null) {
            this.optedOutNumbers = null;
            return;
        }

        this.optedOutNumbers = new java.util.ArrayList<String>(optedOutNumbers);
    }

    /**
     * <p>
     * An array of phone numbers to search for in the OptOutList.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOptedOutNumbers(java.util.Collection)} or {@link #withOptedOutNumbers(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param optedOutNumbers
     *        An array of phone numbers to search for in the OptOutList.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOptedOutNumbersRequest withOptedOutNumbers(String... optedOutNumbers) {
        if (this.optedOutNumbers == null) {
            setOptedOutNumbers(new java.util.ArrayList<String>(optedOutNumbers.length));
        }
        for (String ele : optedOutNumbers) {
            this.optedOutNumbers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of phone numbers to search for in the OptOutList.
     * </p>
     * 
     * @param optedOutNumbers
     *        An array of phone numbers to search for in the OptOutList.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOptedOutNumbersRequest withOptedOutNumbers(java.util.Collection<String> optedOutNumbers) {
        setOptedOutNumbers(optedOutNumbers);
        return this;
    }

    /**
     * <p>
     * An array of OptedOutFilter objects to filter the results on.
     * </p>
     * 
     * @return An array of OptedOutFilter objects to filter the results on.
     */

    public java.util.List<OptedOutFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * An array of OptedOutFilter objects to filter the results on.
     * </p>
     * 
     * @param filters
     *        An array of OptedOutFilter objects to filter the results on.
     */

    public void setFilters(java.util.Collection<OptedOutFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<OptedOutFilter>(filters);
    }

    /**
     * <p>
     * An array of OptedOutFilter objects to filter the results on.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        An array of OptedOutFilter objects to filter the results on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOptedOutNumbersRequest withFilters(OptedOutFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<OptedOutFilter>(filters.length));
        }
        for (OptedOutFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of OptedOutFilter objects to filter the results on.
     * </p>
     * 
     * @param filters
     *        An array of OptedOutFilter objects to filter the results on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOptedOutNumbersRequest withFilters(java.util.Collection<OptedOutFilter> filters) {
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

    public DescribeOptedOutNumbersRequest withNextToken(String nextToken) {
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

    public DescribeOptedOutNumbersRequest withMaxResults(Integer maxResults) {
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
        if (getOptOutListName() != null)
            sb.append("OptOutListName: ").append(getOptOutListName()).append(",");
        if (getOptedOutNumbers() != null)
            sb.append("OptedOutNumbers: ").append(getOptedOutNumbers()).append(",");
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

        if (obj instanceof DescribeOptedOutNumbersRequest == false)
            return false;
        DescribeOptedOutNumbersRequest other = (DescribeOptedOutNumbersRequest) obj;
        if (other.getOptOutListName() == null ^ this.getOptOutListName() == null)
            return false;
        if (other.getOptOutListName() != null && other.getOptOutListName().equals(this.getOptOutListName()) == false)
            return false;
        if (other.getOptedOutNumbers() == null ^ this.getOptedOutNumbers() == null)
            return false;
        if (other.getOptedOutNumbers() != null && other.getOptedOutNumbers().equals(this.getOptedOutNumbers()) == false)
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

        hashCode = prime * hashCode + ((getOptOutListName() == null) ? 0 : getOptOutListName().hashCode());
        hashCode = prime * hashCode + ((getOptedOutNumbers() == null) ? 0 : getOptedOutNumbers().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public DescribeOptedOutNumbersRequest clone() {
        return (DescribeOptedOutNumbersRequest) super.clone();
    }

}
