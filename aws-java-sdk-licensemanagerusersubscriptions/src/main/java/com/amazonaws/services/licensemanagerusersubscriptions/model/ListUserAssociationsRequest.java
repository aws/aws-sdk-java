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
package com.amazonaws.services.licensemanagerusersubscriptions.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-user-subscriptions-2018-05-10/ListUserAssociations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListUserAssociationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An array of structures that you can use to filter the results to those that match one or more sets of key-value
     * pairs that you specify.
     * </p>
     */
    private java.util.List<Filter> filters;
    /**
     * <p>
     * An object that specifies details for the identity provider.
     * </p>
     */
    private IdentityProvider identityProvider;
    /**
     * <p>
     * The ID of the EC2 instance, which provides user-based subscriptions.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * Maximum number of results to return in a single call.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of structures that you can use to filter the results to those that match one or more sets of key-value
     * pairs that you specify.
     * </p>
     * 
     * @return An array of structures that you can use to filter the results to those that match one or more sets of
     *         key-value pairs that you specify.
     */

    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * An array of structures that you can use to filter the results to those that match one or more sets of key-value
     * pairs that you specify.
     * </p>
     * 
     * @param filters
     *        An array of structures that you can use to filter the results to those that match one or more sets of
     *        key-value pairs that you specify.
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<Filter>(filters);
    }

    /**
     * <p>
     * An array of structures that you can use to filter the results to those that match one or more sets of key-value
     * pairs that you specify.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        An array of structures that you can use to filter the results to those that match one or more sets of
     *        key-value pairs that you specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUserAssociationsRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of structures that you can use to filter the results to those that match one or more sets of key-value
     * pairs that you specify.
     * </p>
     * 
     * @param filters
     *        An array of structures that you can use to filter the results to those that match one or more sets of
     *        key-value pairs that you specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUserAssociationsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * An object that specifies details for the identity provider.
     * </p>
     * 
     * @param identityProvider
     *        An object that specifies details for the identity provider.
     */

    public void setIdentityProvider(IdentityProvider identityProvider) {
        this.identityProvider = identityProvider;
    }

    /**
     * <p>
     * An object that specifies details for the identity provider.
     * </p>
     * 
     * @return An object that specifies details for the identity provider.
     */

    public IdentityProvider getIdentityProvider() {
        return this.identityProvider;
    }

    /**
     * <p>
     * An object that specifies details for the identity provider.
     * </p>
     * 
     * @param identityProvider
     *        An object that specifies details for the identity provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUserAssociationsRequest withIdentityProvider(IdentityProvider identityProvider) {
        setIdentityProvider(identityProvider);
        return this;
    }

    /**
     * <p>
     * The ID of the EC2 instance, which provides user-based subscriptions.
     * </p>
     * 
     * @param instanceId
     *        The ID of the EC2 instance, which provides user-based subscriptions.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the EC2 instance, which provides user-based subscriptions.
     * </p>
     * 
     * @return The ID of the EC2 instance, which provides user-based subscriptions.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the EC2 instance, which provides user-based subscriptions.
     * </p>
     * 
     * @param instanceId
     *        The ID of the EC2 instance, which provides user-based subscriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUserAssociationsRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * Maximum number of results to return in a single call.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of results to return in a single call.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Maximum number of results to return in a single call.
     * </p>
     * 
     * @return Maximum number of results to return in a single call.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Maximum number of results to return in a single call.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of results to return in a single call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUserAssociationsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        Token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Token for the next set of results.
     * </p>
     * 
     * @return Token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        Token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUserAssociationsRequest withNextToken(String nextToken) {
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
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getIdentityProvider() != null)
            sb.append("IdentityProvider: ").append(getIdentityProvider()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
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

        if (obj instanceof ListUserAssociationsRequest == false)
            return false;
        ListUserAssociationsRequest other = (ListUserAssociationsRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getIdentityProvider() == null ^ this.getIdentityProvider() == null)
            return false;
        if (other.getIdentityProvider() != null && other.getIdentityProvider().equals(this.getIdentityProvider()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
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

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getIdentityProvider() == null) ? 0 : getIdentityProvider().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListUserAssociationsRequest clone() {
        return (ListUserAssociationsRequest) super.clone();
    }

}
