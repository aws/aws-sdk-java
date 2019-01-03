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
package com.amazonaws.services.inspector.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/ListAssessmentTargets" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAssessmentTargetsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * You can use this parameter to specify a subset of data to be included in the action's response.
     * </p>
     * <p>
     * For a record to match a filter, all specified filter attributes must match. When multiple values are specified
     * for a filter attribute, any of the values can match.
     * </p>
     */
    private AssessmentTargetFilter filter;
    /**
     * <p>
     * You can use this parameter when paginating results. Set the value of this parameter to null on your first call to
     * the <b>ListAssessmentTargets</b> action. Subsequent calls to the action fill <b>nextToken</b> in the request with
     * the value of <b>NextToken</b> from the previous response to continue listing data.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * You can use this parameter to indicate the maximum number of items you want in the response. The default value is
     * 10. The maximum value is 500.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * You can use this parameter to specify a subset of data to be included in the action's response.
     * </p>
     * <p>
     * For a record to match a filter, all specified filter attributes must match. When multiple values are specified
     * for a filter attribute, any of the values can match.
     * </p>
     * 
     * @param filter
     *        You can use this parameter to specify a subset of data to be included in the action's response.</p>
     *        <p>
     *        For a record to match a filter, all specified filter attributes must match. When multiple values are
     *        specified for a filter attribute, any of the values can match.
     */

    public void setFilter(AssessmentTargetFilter filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * You can use this parameter to specify a subset of data to be included in the action's response.
     * </p>
     * <p>
     * For a record to match a filter, all specified filter attributes must match. When multiple values are specified
     * for a filter attribute, any of the values can match.
     * </p>
     * 
     * @return You can use this parameter to specify a subset of data to be included in the action's response.</p>
     *         <p>
     *         For a record to match a filter, all specified filter attributes must match. When multiple values are
     *         specified for a filter attribute, any of the values can match.
     */

    public AssessmentTargetFilter getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * You can use this parameter to specify a subset of data to be included in the action's response.
     * </p>
     * <p>
     * For a record to match a filter, all specified filter attributes must match. When multiple values are specified
     * for a filter attribute, any of the values can match.
     * </p>
     * 
     * @param filter
     *        You can use this parameter to specify a subset of data to be included in the action's response.</p>
     *        <p>
     *        For a record to match a filter, all specified filter attributes must match. When multiple values are
     *        specified for a filter attribute, any of the values can match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssessmentTargetsRequest withFilter(AssessmentTargetFilter filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * You can use this parameter when paginating results. Set the value of this parameter to null on your first call to
     * the <b>ListAssessmentTargets</b> action. Subsequent calls to the action fill <b>nextToken</b> in the request with
     * the value of <b>NextToken</b> from the previous response to continue listing data.
     * </p>
     * 
     * @param nextToken
     *        You can use this parameter when paginating results. Set the value of this parameter to null on your first
     *        call to the <b>ListAssessmentTargets</b> action. Subsequent calls to the action fill <b>nextToken</b> in
     *        the request with the value of <b>NextToken</b> from the previous response to continue listing data.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * You can use this parameter when paginating results. Set the value of this parameter to null on your first call to
     * the <b>ListAssessmentTargets</b> action. Subsequent calls to the action fill <b>nextToken</b> in the request with
     * the value of <b>NextToken</b> from the previous response to continue listing data.
     * </p>
     * 
     * @return You can use this parameter when paginating results. Set the value of this parameter to null on your first
     *         call to the <b>ListAssessmentTargets</b> action. Subsequent calls to the action fill <b>nextToken</b> in
     *         the request with the value of <b>NextToken</b> from the previous response to continue listing data.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * You can use this parameter when paginating results. Set the value of this parameter to null on your first call to
     * the <b>ListAssessmentTargets</b> action. Subsequent calls to the action fill <b>nextToken</b> in the request with
     * the value of <b>NextToken</b> from the previous response to continue listing data.
     * </p>
     * 
     * @param nextToken
     *        You can use this parameter when paginating results. Set the value of this parameter to null on your first
     *        call to the <b>ListAssessmentTargets</b> action. Subsequent calls to the action fill <b>nextToken</b> in
     *        the request with the value of <b>NextToken</b> from the previous response to continue listing data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssessmentTargetsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * You can use this parameter to indicate the maximum number of items you want in the response. The default value is
     * 10. The maximum value is 500.
     * </p>
     * 
     * @param maxResults
     *        You can use this parameter to indicate the maximum number of items you want in the response. The default
     *        value is 10. The maximum value is 500.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * You can use this parameter to indicate the maximum number of items you want in the response. The default value is
     * 10. The maximum value is 500.
     * </p>
     * 
     * @return You can use this parameter to indicate the maximum number of items you want in the response. The default
     *         value is 10. The maximum value is 500.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * You can use this parameter to indicate the maximum number of items you want in the response. The default value is
     * 10. The maximum value is 500.
     * </p>
     * 
     * @param maxResults
     *        You can use this parameter to indicate the maximum number of items you want in the response. The default
     *        value is 10. The maximum value is 500.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssessmentTargetsRequest withMaxResults(Integer maxResults) {
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
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter()).append(",");
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

        if (obj instanceof ListAssessmentTargetsRequest == false)
            return false;
        ListAssessmentTargetsRequest other = (ListAssessmentTargetsRequest) obj;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
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

        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListAssessmentTargetsRequest clone() {
        return (ListAssessmentTargetsRequest) super.clone();
    }

}
