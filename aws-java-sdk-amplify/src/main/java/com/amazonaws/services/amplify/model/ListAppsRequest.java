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
package com.amazonaws.services.amplify.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Request structure for an Amplify App list request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ListApps" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAppsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Pagination token. If non-null pagination token is returned in a result, then pass its value in another request to
     * fetch more entries.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Maximum number of records to list in a single response.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * Pagination token. If non-null pagination token is returned in a result, then pass its value in another request to
     * fetch more entries.
     * </p>
     * 
     * @param nextToken
     *        Pagination token. If non-null pagination token is returned in a result, then pass its value in another
     *        request to fetch more entries.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Pagination token. If non-null pagination token is returned in a result, then pass its value in another request to
     * fetch more entries.
     * </p>
     * 
     * @return Pagination token. If non-null pagination token is returned in a result, then pass its value in another
     *         request to fetch more entries.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Pagination token. If non-null pagination token is returned in a result, then pass its value in another request to
     * fetch more entries.
     * </p>
     * 
     * @param nextToken
     *        Pagination token. If non-null pagination token is returned in a result, then pass its value in another
     *        request to fetch more entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Maximum number of records to list in a single response.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of records to list in a single response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Maximum number of records to list in a single response.
     * </p>
     * 
     * @return Maximum number of records to list in a single response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Maximum number of records to list in a single response.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of records to list in a single response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppsRequest withMaxResults(Integer maxResults) {
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

        if (obj instanceof ListAppsRequest == false)
            return false;
        ListAppsRequest other = (ListAppsRequest) obj;
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
    public ListAppsRequest clone() {
        return (ListAppsRequest) super.clone();
    }

}
