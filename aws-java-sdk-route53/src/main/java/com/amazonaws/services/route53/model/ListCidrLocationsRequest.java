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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListCidrLocations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCidrLocationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The CIDR collection ID.
     * </p>
     */
    private String collectionId;
    /**
     * <p>
     * An opaque pagination token to indicate where the service is to begin enumerating results.
     * </p>
     * <p>
     * If no value is provided, the listing of results starts from the beginning.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of CIDR collection locations to return in the response.
     * </p>
     */
    private String maxResults;

    /**
     * <p>
     * The CIDR collection ID.
     * </p>
     * 
     * @param collectionId
     *        The CIDR collection ID.
     */

    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }

    /**
     * <p>
     * The CIDR collection ID.
     * </p>
     * 
     * @return The CIDR collection ID.
     */

    public String getCollectionId() {
        return this.collectionId;
    }

    /**
     * <p>
     * The CIDR collection ID.
     * </p>
     * 
     * @param collectionId
     *        The CIDR collection ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCidrLocationsRequest withCollectionId(String collectionId) {
        setCollectionId(collectionId);
        return this;
    }

    /**
     * <p>
     * An opaque pagination token to indicate where the service is to begin enumerating results.
     * </p>
     * <p>
     * If no value is provided, the listing of results starts from the beginning.
     * </p>
     * 
     * @param nextToken
     *        An opaque pagination token to indicate where the service is to begin enumerating results.</p>
     *        <p>
     *        If no value is provided, the listing of results starts from the beginning.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An opaque pagination token to indicate where the service is to begin enumerating results.
     * </p>
     * <p>
     * If no value is provided, the listing of results starts from the beginning.
     * </p>
     * 
     * @return An opaque pagination token to indicate where the service is to begin enumerating results.</p>
     *         <p>
     *         If no value is provided, the listing of results starts from the beginning.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An opaque pagination token to indicate where the service is to begin enumerating results.
     * </p>
     * <p>
     * If no value is provided, the listing of results starts from the beginning.
     * </p>
     * 
     * @param nextToken
     *        An opaque pagination token to indicate where the service is to begin enumerating results.</p>
     *        <p>
     *        If no value is provided, the listing of results starts from the beginning.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCidrLocationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of CIDR collection locations to return in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of CIDR collection locations to return in the response.
     */

    public void setMaxResults(String maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of CIDR collection locations to return in the response.
     * </p>
     * 
     * @return The maximum number of CIDR collection locations to return in the response.
     */

    public String getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of CIDR collection locations to return in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of CIDR collection locations to return in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCidrLocationsRequest withMaxResults(String maxResults) {
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
        if (getCollectionId() != null)
            sb.append("CollectionId: ").append(getCollectionId()).append(",");
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

        if (obj instanceof ListCidrLocationsRequest == false)
            return false;
        ListCidrLocationsRequest other = (ListCidrLocationsRequest) obj;
        if (other.getCollectionId() == null ^ this.getCollectionId() == null)
            return false;
        if (other.getCollectionId() != null && other.getCollectionId().equals(this.getCollectionId()) == false)
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

        hashCode = prime * hashCode + ((getCollectionId() == null) ? 0 : getCollectionId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListCidrLocationsRequest clone() {
        return (ListCidrLocationsRequest) super.clone();
    }

}
