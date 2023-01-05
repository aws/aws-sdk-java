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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListCidrBlocks" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCidrBlocksRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The UUID of the CIDR collection.
     * </p>
     */
    private String collectionId;
    /**
     * <p>
     * The name of the CIDR collection location.
     * </p>
     */
    private String locationName;
    /**
     * <p>
     * An opaque pagination token to indicate where the service is to begin enumerating results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Maximum number of results you want returned.
     * </p>
     */
    private String maxResults;

    /**
     * <p>
     * The UUID of the CIDR collection.
     * </p>
     * 
     * @param collectionId
     *        The UUID of the CIDR collection.
     */

    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }

    /**
     * <p>
     * The UUID of the CIDR collection.
     * </p>
     * 
     * @return The UUID of the CIDR collection.
     */

    public String getCollectionId() {
        return this.collectionId;
    }

    /**
     * <p>
     * The UUID of the CIDR collection.
     * </p>
     * 
     * @param collectionId
     *        The UUID of the CIDR collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCidrBlocksRequest withCollectionId(String collectionId) {
        setCollectionId(collectionId);
        return this;
    }

    /**
     * <p>
     * The name of the CIDR collection location.
     * </p>
     * 
     * @param locationName
     *        The name of the CIDR collection location.
     */

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    /**
     * <p>
     * The name of the CIDR collection location.
     * </p>
     * 
     * @return The name of the CIDR collection location.
     */

    public String getLocationName() {
        return this.locationName;
    }

    /**
     * <p>
     * The name of the CIDR collection location.
     * </p>
     * 
     * @param locationName
     *        The name of the CIDR collection location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCidrBlocksRequest withLocationName(String locationName) {
        setLocationName(locationName);
        return this;
    }

    /**
     * <p>
     * An opaque pagination token to indicate where the service is to begin enumerating results.
     * </p>
     * 
     * @param nextToken
     *        An opaque pagination token to indicate where the service is to begin enumerating results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An opaque pagination token to indicate where the service is to begin enumerating results.
     * </p>
     * 
     * @return An opaque pagination token to indicate where the service is to begin enumerating results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An opaque pagination token to indicate where the service is to begin enumerating results.
     * </p>
     * 
     * @param nextToken
     *        An opaque pagination token to indicate where the service is to begin enumerating results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCidrBlocksRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Maximum number of results you want returned.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of results you want returned.
     */

    public void setMaxResults(String maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Maximum number of results you want returned.
     * </p>
     * 
     * @return Maximum number of results you want returned.
     */

    public String getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Maximum number of results you want returned.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of results you want returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCidrBlocksRequest withMaxResults(String maxResults) {
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
        if (getLocationName() != null)
            sb.append("LocationName: ").append(getLocationName()).append(",");
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

        if (obj instanceof ListCidrBlocksRequest == false)
            return false;
        ListCidrBlocksRequest other = (ListCidrBlocksRequest) obj;
        if (other.getCollectionId() == null ^ this.getCollectionId() == null)
            return false;
        if (other.getCollectionId() != null && other.getCollectionId().equals(this.getCollectionId()) == false)
            return false;
        if (other.getLocationName() == null ^ this.getLocationName() == null)
            return false;
        if (other.getLocationName() != null && other.getLocationName().equals(this.getLocationName()) == false)
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
        hashCode = prime * hashCode + ((getLocationName() == null) ? 0 : getLocationName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListCidrBlocksRequest clone() {
        return (ListCidrBlocksRequest) super.clone();
    }

}
