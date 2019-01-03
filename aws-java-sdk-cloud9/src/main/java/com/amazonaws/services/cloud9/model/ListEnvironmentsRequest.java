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
package com.amazonaws.services.cloud9.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloud9-2017-09-23/ListEnvironments" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEnvironmentsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * During a previous call, if there are more than 25 items in the list, only the first 25 items are returned, along
     * with a unique string called a <i>next token</i>. To get the next batch of items in the list, call this operation
     * again, adding the next token to the call. To get all of the items in the list, keep calling this operation with
     * each subsequent next token that is returned, until no more next tokens are returned.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of environments to get identifiers for.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * During a previous call, if there are more than 25 items in the list, only the first 25 items are returned, along
     * with a unique string called a <i>next token</i>. To get the next batch of items in the list, call this operation
     * again, adding the next token to the call. To get all of the items in the list, keep calling this operation with
     * each subsequent next token that is returned, until no more next tokens are returned.
     * </p>
     * 
     * @param nextToken
     *        During a previous call, if there are more than 25 items in the list, only the first 25 items are returned,
     *        along with a unique string called a <i>next token</i>. To get the next batch of items in the list, call
     *        this operation again, adding the next token to the call. To get all of the items in the list, keep calling
     *        this operation with each subsequent next token that is returned, until no more next tokens are returned.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * During a previous call, if there are more than 25 items in the list, only the first 25 items are returned, along
     * with a unique string called a <i>next token</i>. To get the next batch of items in the list, call this operation
     * again, adding the next token to the call. To get all of the items in the list, keep calling this operation with
     * each subsequent next token that is returned, until no more next tokens are returned.
     * </p>
     * 
     * @return During a previous call, if there are more than 25 items in the list, only the first 25 items are
     *         returned, along with a unique string called a <i>next token</i>. To get the next batch of items in the
     *         list, call this operation again, adding the next token to the call. To get all of the items in the list,
     *         keep calling this operation with each subsequent next token that is returned, until no more next tokens
     *         are returned.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * During a previous call, if there are more than 25 items in the list, only the first 25 items are returned, along
     * with a unique string called a <i>next token</i>. To get the next batch of items in the list, call this operation
     * again, adding the next token to the call. To get all of the items in the list, keep calling this operation with
     * each subsequent next token that is returned, until no more next tokens are returned.
     * </p>
     * 
     * @param nextToken
     *        During a previous call, if there are more than 25 items in the list, only the first 25 items are returned,
     *        along with a unique string called a <i>next token</i>. To get the next batch of items in the list, call
     *        this operation again, adding the next token to the call. To get all of the items in the list, keep calling
     *        this operation with each subsequent next token that is returned, until no more next tokens are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of environments to get identifiers for.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of environments to get identifiers for.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of environments to get identifiers for.
     * </p>
     * 
     * @return The maximum number of environments to get identifiers for.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of environments to get identifiers for.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of environments to get identifiers for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentsRequest withMaxResults(Integer maxResults) {
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

        if (obj instanceof ListEnvironmentsRequest == false)
            return false;
        ListEnvironmentsRequest other = (ListEnvironmentsRequest) obj;
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
    public ListEnvironmentsRequest clone() {
        return (ListEnvironmentsRequest) super.clone();
    }

}
