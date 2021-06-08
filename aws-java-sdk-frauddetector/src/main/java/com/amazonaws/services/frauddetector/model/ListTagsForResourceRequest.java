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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/ListTagsForResource" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTagsForResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN that specifies the resource whose tags you want to list.
     * </p>
     */
    private String resourceARN;
    /**
     * <p>
     * The next token from the previous results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of objects to return for the request.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The ARN that specifies the resource whose tags you want to list.
     * </p>
     * 
     * @param resourceARN
     *        The ARN that specifies the resource whose tags you want to list.
     */

    public void setResourceARN(String resourceARN) {
        this.resourceARN = resourceARN;
    }

    /**
     * <p>
     * The ARN that specifies the resource whose tags you want to list.
     * </p>
     * 
     * @return The ARN that specifies the resource whose tags you want to list.
     */

    public String getResourceARN() {
        return this.resourceARN;
    }

    /**
     * <p>
     * The ARN that specifies the resource whose tags you want to list.
     * </p>
     * 
     * @param resourceARN
     *        The ARN that specifies the resource whose tags you want to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForResourceRequest withResourceARN(String resourceARN) {
        setResourceARN(resourceARN);
        return this;
    }

    /**
     * <p>
     * The next token from the previous results.
     * </p>
     * 
     * @param nextToken
     *        The next token from the previous results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next token from the previous results.
     * </p>
     * 
     * @return The next token from the previous results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The next token from the previous results.
     * </p>
     * 
     * @param nextToken
     *        The next token from the previous results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForResourceRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of objects to return for the request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of objects to return for the request.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of objects to return for the request.
     * </p>
     * 
     * @return The maximum number of objects to return for the request.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of objects to return for the request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of objects to return for the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForResourceRequest withMaxResults(Integer maxResults) {
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
        if (getResourceARN() != null)
            sb.append("ResourceARN: ").append(getResourceARN()).append(",");
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

        if (obj instanceof ListTagsForResourceRequest == false)
            return false;
        ListTagsForResourceRequest other = (ListTagsForResourceRequest) obj;
        if (other.getResourceARN() == null ^ this.getResourceARN() == null)
            return false;
        if (other.getResourceARN() != null && other.getResourceARN().equals(this.getResourceARN()) == false)
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

        hashCode = prime * hashCode + ((getResourceARN() == null) ? 0 : getResourceARN().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListTagsForResourceRequest clone() {
        return (ListTagsForResourceRequest) super.clone();
    }

}
