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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/ListLakeFormationOptIns"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLakeFormationOptInsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private DataLakePrincipal principal;
    /**
     * <p>
     * A structure for the resource.
     * </p>
     */
    private Resource resource;
    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A continuation token, if this is not the first call to retrieve this list.
     * </p>
     */
    private String nextToken;

    /**
     * @param principal
     */

    public void setPrincipal(DataLakePrincipal principal) {
        this.principal = principal;
    }

    /**
     * @return
     */

    public DataLakePrincipal getPrincipal() {
        return this.principal;
    }

    /**
     * @param principal
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLakeFormationOptInsRequest withPrincipal(DataLakePrincipal principal) {
        setPrincipal(principal);
        return this;
    }

    /**
     * <p>
     * A structure for the resource.
     * </p>
     * 
     * @param resource
     *        A structure for the resource.
     */

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * A structure for the resource.
     * </p>
     * 
     * @return A structure for the resource.
     */

    public Resource getResource() {
        return this.resource;
    }

    /**
     * <p>
     * A structure for the resource.
     * </p>
     * 
     * @param resource
     *        A structure for the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLakeFormationOptInsRequest withResource(Resource resource) {
        setResource(resource);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @return The maximum number of results to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLakeFormationOptInsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A continuation token, if this is not the first call to retrieve this list.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if this is not the first call to retrieve this list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if this is not the first call to retrieve this list.
     * </p>
     * 
     * @return A continuation token, if this is not the first call to retrieve this list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token, if this is not the first call to retrieve this list.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if this is not the first call to retrieve this list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLakeFormationOptInsRequest withNextToken(String nextToken) {
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
        if (getPrincipal() != null)
            sb.append("Principal: ").append(getPrincipal()).append(",");
        if (getResource() != null)
            sb.append("Resource: ").append(getResource()).append(",");
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

        if (obj instanceof ListLakeFormationOptInsRequest == false)
            return false;
        ListLakeFormationOptInsRequest other = (ListLakeFormationOptInsRequest) obj;
        if (other.getPrincipal() == null ^ this.getPrincipal() == null)
            return false;
        if (other.getPrincipal() != null && other.getPrincipal().equals(this.getPrincipal()) == false)
            return false;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getPrincipal() == null) ? 0 : getPrincipal().hashCode());
        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListLakeFormationOptInsRequest clone() {
        return (ListLakeFormationOptInsRequest) super.clone();
    }

}
