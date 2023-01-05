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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/ListEventDataStores" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEventDataStoresRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A token you can use to get the next page of event data store results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of event data stores to display on a single page.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * A token you can use to get the next page of event data store results.
     * </p>
     * 
     * @param nextToken
     *        A token you can use to get the next page of event data store results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token you can use to get the next page of event data store results.
     * </p>
     * 
     * @return A token you can use to get the next page of event data store results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token you can use to get the next page of event data store results.
     * </p>
     * 
     * @param nextToken
     *        A token you can use to get the next page of event data store results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventDataStoresRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of event data stores to display on a single page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of event data stores to display on a single page.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of event data stores to display on a single page.
     * </p>
     * 
     * @return The maximum number of event data stores to display on a single page.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of event data stores to display on a single page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of event data stores to display on a single page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventDataStoresRequest withMaxResults(Integer maxResults) {
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

        if (obj instanceof ListEventDataStoresRequest == false)
            return false;
        ListEventDataStoresRequest other = (ListEventDataStoresRequest) obj;
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
    public ListEventDataStoresRequest clone() {
        return (ListEventDataStoresRequest) super.clone();
    }

}
