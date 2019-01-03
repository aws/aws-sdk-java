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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Container for the parameters to the <code> <a>ListElasticsearchVersions</a> </code> operation.
 * <p>
 * Use <code> <a>MaxResults</a> </code> to control the maximum number of results to retrieve in a single call.
 * </p>
 * <p>
 * Use <code> <a>NextToken</a> </code> in response to retrieve more results. If the received response does not contain a
 * NextToken, then there are no more results to retrieve.
 * </p>
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListElasticsearchVersionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Set this value to limit the number of results returned. Value provided must be greater than 10 else it wont be
     * honored.
     * </p>
     */
    private Integer maxResults;

    private String nextToken;

    /**
     * <p>
     * Set this value to limit the number of results returned. Value provided must be greater than 10 else it wont be
     * honored.
     * </p>
     * 
     * @param maxResults
     *        Set this value to limit the number of results returned. Value provided must be greater than 10 else it
     *        wont be honored.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Set this value to limit the number of results returned. Value provided must be greater than 10 else it wont be
     * honored.
     * </p>
     * 
     * @return Set this value to limit the number of results returned. Value provided must be greater than 10 else it
     *         wont be honored.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Set this value to limit the number of results returned. Value provided must be greater than 10 else it wont be
     * honored.
     * </p>
     * 
     * @param maxResults
     *        Set this value to limit the number of results returned. Value provided must be greater than 10 else it
     *        wont be honored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListElasticsearchVersionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListElasticsearchVersionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListElasticsearchVersionsRequest == false)
            return false;
        ListElasticsearchVersionsRequest other = (ListElasticsearchVersionsRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListElasticsearchVersionsRequest clone() {
        return (ListElasticsearchVersionsRequest) super.clone();
    }

}
