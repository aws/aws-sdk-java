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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListAssessmentFrameworkShareRequests"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAssessmentFrameworkShareRequestsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies whether the share request is a sent request or a received request.
     * </p>
     */
    private String requestType;
    /**
     * <p>
     * The pagination token that's used to fetch the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Represents the maximum number of results on a page or for an API request call.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * Specifies whether the share request is a sent request or a received request.
     * </p>
     * 
     * @param requestType
     *        Specifies whether the share request is a sent request or a received request.
     * @see ShareRequestType
     */

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    /**
     * <p>
     * Specifies whether the share request is a sent request or a received request.
     * </p>
     * 
     * @return Specifies whether the share request is a sent request or a received request.
     * @see ShareRequestType
     */

    public String getRequestType() {
        return this.requestType;
    }

    /**
     * <p>
     * Specifies whether the share request is a sent request or a received request.
     * </p>
     * 
     * @param requestType
     *        Specifies whether the share request is a sent request or a received request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShareRequestType
     */

    public ListAssessmentFrameworkShareRequestsRequest withRequestType(String requestType) {
        setRequestType(requestType);
        return this;
    }

    /**
     * <p>
     * Specifies whether the share request is a sent request or a received request.
     * </p>
     * 
     * @param requestType
     *        Specifies whether the share request is a sent request or a received request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShareRequestType
     */

    public ListAssessmentFrameworkShareRequestsRequest withRequestType(ShareRequestType requestType) {
        this.requestType = requestType.toString();
        return this;
    }

    /**
     * <p>
     * The pagination token that's used to fetch the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that's used to fetch the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token that's used to fetch the next set of results.
     * </p>
     * 
     * @return The pagination token that's used to fetch the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token that's used to fetch the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that's used to fetch the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssessmentFrameworkShareRequestsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Represents the maximum number of results on a page or for an API request call.
     * </p>
     * 
     * @param maxResults
     *        Represents the maximum number of results on a page or for an API request call.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Represents the maximum number of results on a page or for an API request call.
     * </p>
     * 
     * @return Represents the maximum number of results on a page or for an API request call.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Represents the maximum number of results on a page or for an API request call.
     * </p>
     * 
     * @param maxResults
     *        Represents the maximum number of results on a page or for an API request call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssessmentFrameworkShareRequestsRequest withMaxResults(Integer maxResults) {
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
        if (getRequestType() != null)
            sb.append("RequestType: ").append(getRequestType()).append(",");
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

        if (obj instanceof ListAssessmentFrameworkShareRequestsRequest == false)
            return false;
        ListAssessmentFrameworkShareRequestsRequest other = (ListAssessmentFrameworkShareRequestsRequest) obj;
        if (other.getRequestType() == null ^ this.getRequestType() == null)
            return false;
        if (other.getRequestType() != null && other.getRequestType().equals(this.getRequestType()) == false)
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

        hashCode = prime * hashCode + ((getRequestType() == null) ? 0 : getRequestType().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListAssessmentFrameworkShareRequestsRequest clone() {
        return (ListAssessmentFrameworkShareRequestsRequest) super.clone();
    }

}
