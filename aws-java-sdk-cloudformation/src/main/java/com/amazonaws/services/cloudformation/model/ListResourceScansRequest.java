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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ListResourceScans" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResourceScansRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A string that identifies the next page of resource scan results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * If the number of available results exceeds this maximum, the response includes a <code>NextToken</code> value
     * that you can use for the <code>NextToken</code> parameter to get the next set of results. The default value is
     * 10. The maximum value is 100.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * A string that identifies the next page of resource scan results.
     * </p>
     * 
     * @param nextToken
     *        A string that identifies the next page of resource scan results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A string that identifies the next page of resource scan results.
     * </p>
     * 
     * @return A string that identifies the next page of resource scan results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A string that identifies the next page of resource scan results.
     * </p>
     * 
     * @param nextToken
     *        A string that identifies the next page of resource scan results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceScansRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * If the number of available results exceeds this maximum, the response includes a <code>NextToken</code> value
     * that you can use for the <code>NextToken</code> parameter to get the next set of results. The default value is
     * 10. The maximum value is 100.
     * </p>
     * 
     * @param maxResults
     *        If the number of available results exceeds this maximum, the response includes a <code>NextToken</code>
     *        value that you can use for the <code>NextToken</code> parameter to get the next set of results. The
     *        default value is 10. The maximum value is 100.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * If the number of available results exceeds this maximum, the response includes a <code>NextToken</code> value
     * that you can use for the <code>NextToken</code> parameter to get the next set of results. The default value is
     * 10. The maximum value is 100.
     * </p>
     * 
     * @return If the number of available results exceeds this maximum, the response includes a <code>NextToken</code>
     *         value that you can use for the <code>NextToken</code> parameter to get the next set of results. The
     *         default value is 10. The maximum value is 100.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * If the number of available results exceeds this maximum, the response includes a <code>NextToken</code> value
     * that you can use for the <code>NextToken</code> parameter to get the next set of results. The default value is
     * 10. The maximum value is 100.
     * </p>
     * 
     * @param maxResults
     *        If the number of available results exceeds this maximum, the response includes a <code>NextToken</code>
     *        value that you can use for the <code>NextToken</code> parameter to get the next set of results. The
     *        default value is 10. The maximum value is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceScansRequest withMaxResults(Integer maxResults) {
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

        if (obj instanceof ListResourceScansRequest == false)
            return false;
        ListResourceScansRequest other = (ListResourceScansRequest) obj;
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
    public ListResourceScansRequest clone() {
        return (ListResourceScansRequest) super.clone();
    }

}
