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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListResourceDelegates" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResourceDelegatesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the organization that contains the resource for which delegates are listed.
     * </p>
     */
    private String organizationId;
    /**
     * <p>
     * The identifier for the resource whose delegates are listed.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The token used to paginate through the delegates associated with a resource.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The number of maximum results in a page.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The identifier for the organization that contains the resource for which delegates are listed.
     * </p>
     * 
     * @param organizationId
     *        The identifier for the organization that contains the resource for which delegates are listed.
     */

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The identifier for the organization that contains the resource for which delegates are listed.
     * </p>
     * 
     * @return The identifier for the organization that contains the resource for which delegates are listed.
     */

    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * <p>
     * The identifier for the organization that contains the resource for which delegates are listed.
     * </p>
     * 
     * @param organizationId
     *        The identifier for the organization that contains the resource for which delegates are listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceDelegatesRequest withOrganizationId(String organizationId) {
        setOrganizationId(organizationId);
        return this;
    }

    /**
     * <p>
     * The identifier for the resource whose delegates are listed.
     * </p>
     * 
     * @param resourceId
     *        The identifier for the resource whose delegates are listed.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The identifier for the resource whose delegates are listed.
     * </p>
     * 
     * @return The identifier for the resource whose delegates are listed.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The identifier for the resource whose delegates are listed.
     * </p>
     * 
     * @param resourceId
     *        The identifier for the resource whose delegates are listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceDelegatesRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The token used to paginate through the delegates associated with a resource.
     * </p>
     * 
     * @param nextToken
     *        The token used to paginate through the delegates associated with a resource.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token used to paginate through the delegates associated with a resource.
     * </p>
     * 
     * @return The token used to paginate through the delegates associated with a resource.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token used to paginate through the delegates associated with a resource.
     * </p>
     * 
     * @param nextToken
     *        The token used to paginate through the delegates associated with a resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceDelegatesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The number of maximum results in a page.
     * </p>
     * 
     * @param maxResults
     *        The number of maximum results in a page.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The number of maximum results in a page.
     * </p>
     * 
     * @return The number of maximum results in a page.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The number of maximum results in a page.
     * </p>
     * 
     * @param maxResults
     *        The number of maximum results in a page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceDelegatesRequest withMaxResults(Integer maxResults) {
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
        if (getOrganizationId() != null)
            sb.append("OrganizationId: ").append(getOrganizationId()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
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

        if (obj instanceof ListResourceDelegatesRequest == false)
            return false;
        ListResourceDelegatesRequest other = (ListResourceDelegatesRequest) obj;
        if (other.getOrganizationId() == null ^ this.getOrganizationId() == null)
            return false;
        if (other.getOrganizationId() != null && other.getOrganizationId().equals(this.getOrganizationId()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
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

        hashCode = prime * hashCode + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListResourceDelegatesRequest clone() {
        return (ListResourceDelegatesRequest) super.clone();
    }

}
