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
package com.amazonaws.services.elasticfilesystem.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DescribeAccountPreferences"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAccountPreferencesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * (Optional) You can use <code>NextToken</code> in a subsequent request to fetch the next page of Amazon Web
     * Services account preferences if the response payload was paginated.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * (Optional) When retrieving account preferences, you can optionally specify the <code>MaxItems</code> parameter to
     * limit the number of objects returned in a response. The default value is 100.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * (Optional) You can use <code>NextToken</code> in a subsequent request to fetch the next page of Amazon Web
     * Services account preferences if the response payload was paginated.
     * </p>
     * 
     * @param nextToken
     *        (Optional) You can use <code>NextToken</code> in a subsequent request to fetch the next page of Amazon Web
     *        Services account preferences if the response payload was paginated.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * (Optional) You can use <code>NextToken</code> in a subsequent request to fetch the next page of Amazon Web
     * Services account preferences if the response payload was paginated.
     * </p>
     * 
     * @return (Optional) You can use <code>NextToken</code> in a subsequent request to fetch the next page of Amazon
     *         Web Services account preferences if the response payload was paginated.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * (Optional) You can use <code>NextToken</code> in a subsequent request to fetch the next page of Amazon Web
     * Services account preferences if the response payload was paginated.
     * </p>
     * 
     * @param nextToken
     *        (Optional) You can use <code>NextToken</code> in a subsequent request to fetch the next page of Amazon Web
     *        Services account preferences if the response payload was paginated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccountPreferencesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * (Optional) When retrieving account preferences, you can optionally specify the <code>MaxItems</code> parameter to
     * limit the number of objects returned in a response. The default value is 100.
     * </p>
     * 
     * @param maxResults
     *        (Optional) When retrieving account preferences, you can optionally specify the <code>MaxItems</code>
     *        parameter to limit the number of objects returned in a response. The default value is 100.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * (Optional) When retrieving account preferences, you can optionally specify the <code>MaxItems</code> parameter to
     * limit the number of objects returned in a response. The default value is 100.
     * </p>
     * 
     * @return (Optional) When retrieving account preferences, you can optionally specify the <code>MaxItems</code>
     *         parameter to limit the number of objects returned in a response. The default value is 100.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * (Optional) When retrieving account preferences, you can optionally specify the <code>MaxItems</code> parameter to
     * limit the number of objects returned in a response. The default value is 100.
     * </p>
     * 
     * @param maxResults
     *        (Optional) When retrieving account preferences, you can optionally specify the <code>MaxItems</code>
     *        parameter to limit the number of objects returned in a response. The default value is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccountPreferencesRequest withMaxResults(Integer maxResults) {
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

        if (obj instanceof DescribeAccountPreferencesRequest == false)
            return false;
        DescribeAccountPreferencesRequest other = (DescribeAccountPreferencesRequest) obj;
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
    public DescribeAccountPreferencesRequest clone() {
        return (DescribeAccountPreferencesRequest) super.clone();
    }

}
