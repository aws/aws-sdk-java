/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/ListWorldTemplates" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListWorldTemplatesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * If the previous paginated request did not return all of the remaining results, the response object's
     * <code>nextToken</code> parameter value is set to a token. To retrieve the next set of results, call
     * <code>ListWorldTemplates</code> again and assign that token to the request object's <code>nextToken</code>
     * parameter. If there are no remaining results, the previous response object's NextToken parameter is set to null.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * When this parameter is used, <code>ListWorldTemplates</code> only returns <code>maxResults</code> results in a
     * single page along with a <code>nextToken</code> response element. The remaining results of the initial request
     * can be seen by sending another <code>ListWorldTemplates</code> request with the returned <code>nextToken</code>
     * value. This value can be between 1 and 100. If this parameter is not used, then <code>ListWorldTemplates</code>
     * returns up to 100 results and a <code>nextToken</code> value if applicable.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * If the previous paginated request did not return all of the remaining results, the response object's
     * <code>nextToken</code> parameter value is set to a token. To retrieve the next set of results, call
     * <code>ListWorldTemplates</code> again and assign that token to the request object's <code>nextToken</code>
     * parameter. If there are no remaining results, the previous response object's NextToken parameter is set to null.
     * </p>
     * 
     * @param nextToken
     *        If the previous paginated request did not return all of the remaining results, the response object's
     *        <code>nextToken</code> parameter value is set to a token. To retrieve the next set of results, call
     *        <code>ListWorldTemplates</code> again and assign that token to the request object's <code>nextToken</code>
     *        parameter. If there are no remaining results, the previous response object's NextToken parameter is set to
     *        null.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous paginated request did not return all of the remaining results, the response object's
     * <code>nextToken</code> parameter value is set to a token. To retrieve the next set of results, call
     * <code>ListWorldTemplates</code> again and assign that token to the request object's <code>nextToken</code>
     * parameter. If there are no remaining results, the previous response object's NextToken parameter is set to null.
     * </p>
     * 
     * @return If the previous paginated request did not return all of the remaining results, the response object's
     *         <code>nextToken</code> parameter value is set to a token. To retrieve the next set of results, call
     *         <code>ListWorldTemplates</code> again and assign that token to the request object's
     *         <code>nextToken</code> parameter. If there are no remaining results, the previous response object's
     *         NextToken parameter is set to null.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the previous paginated request did not return all of the remaining results, the response object's
     * <code>nextToken</code> parameter value is set to a token. To retrieve the next set of results, call
     * <code>ListWorldTemplates</code> again and assign that token to the request object's <code>nextToken</code>
     * parameter. If there are no remaining results, the previous response object's NextToken parameter is set to null.
     * </p>
     * 
     * @param nextToken
     *        If the previous paginated request did not return all of the remaining results, the response object's
     *        <code>nextToken</code> parameter value is set to a token. To retrieve the next set of results, call
     *        <code>ListWorldTemplates</code> again and assign that token to the request object's <code>nextToken</code>
     *        parameter. If there are no remaining results, the previous response object's NextToken parameter is set to
     *        null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorldTemplatesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * When this parameter is used, <code>ListWorldTemplates</code> only returns <code>maxResults</code> results in a
     * single page along with a <code>nextToken</code> response element. The remaining results of the initial request
     * can be seen by sending another <code>ListWorldTemplates</code> request with the returned <code>nextToken</code>
     * value. This value can be between 1 and 100. If this parameter is not used, then <code>ListWorldTemplates</code>
     * returns up to 100 results and a <code>nextToken</code> value if applicable.
     * </p>
     * 
     * @param maxResults
     *        When this parameter is used, <code>ListWorldTemplates</code> only returns <code>maxResults</code> results
     *        in a single page along with a <code>nextToken</code> response element. The remaining results of the
     *        initial request can be seen by sending another <code>ListWorldTemplates</code> request with the returned
     *        <code>nextToken</code> value. This value can be between 1 and 100. If this parameter is not used, then
     *        <code>ListWorldTemplates</code> returns up to 100 results and a <code>nextToken</code> value if
     *        applicable.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * When this parameter is used, <code>ListWorldTemplates</code> only returns <code>maxResults</code> results in a
     * single page along with a <code>nextToken</code> response element. The remaining results of the initial request
     * can be seen by sending another <code>ListWorldTemplates</code> request with the returned <code>nextToken</code>
     * value. This value can be between 1 and 100. If this parameter is not used, then <code>ListWorldTemplates</code>
     * returns up to 100 results and a <code>nextToken</code> value if applicable.
     * </p>
     * 
     * @return When this parameter is used, <code>ListWorldTemplates</code> only returns <code>maxResults</code> results
     *         in a single page along with a <code>nextToken</code> response element. The remaining results of the
     *         initial request can be seen by sending another <code>ListWorldTemplates</code> request with the returned
     *         <code>nextToken</code> value. This value can be between 1 and 100. If this parameter is not used, then
     *         <code>ListWorldTemplates</code> returns up to 100 results and a <code>nextToken</code> value if
     *         applicable.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * When this parameter is used, <code>ListWorldTemplates</code> only returns <code>maxResults</code> results in a
     * single page along with a <code>nextToken</code> response element. The remaining results of the initial request
     * can be seen by sending another <code>ListWorldTemplates</code> request with the returned <code>nextToken</code>
     * value. This value can be between 1 and 100. If this parameter is not used, then <code>ListWorldTemplates</code>
     * returns up to 100 results and a <code>nextToken</code> value if applicable.
     * </p>
     * 
     * @param maxResults
     *        When this parameter is used, <code>ListWorldTemplates</code> only returns <code>maxResults</code> results
     *        in a single page along with a <code>nextToken</code> response element. The remaining results of the
     *        initial request can be seen by sending another <code>ListWorldTemplates</code> request with the returned
     *        <code>nextToken</code> value. This value can be between 1 and 100. If this parameter is not used, then
     *        <code>ListWorldTemplates</code> returns up to 100 results and a <code>nextToken</code> value if
     *        applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorldTemplatesRequest withMaxResults(Integer maxResults) {
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

        if (obj instanceof ListWorldTemplatesRequest == false)
            return false;
        ListWorldTemplatesRequest other = (ListWorldTemplatesRequest) obj;
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

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListWorldTemplatesRequest clone() {
        return (ListWorldTemplatesRequest) super.clone();
    }

}
