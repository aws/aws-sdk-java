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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/ListDiscoveredResources" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDiscoveredResourcesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The details that identify a resource that is discovered by AWS Config, including the resource type, ID, and (if
     * available) the custom resource name.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ResourceIdentifier> resourceIdentifiers;
    /**
     * <p>
     * The string that you use in a subsequent request to get the next page of results in a paginated response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The details that identify a resource that is discovered by AWS Config, including the resource type, ID, and (if
     * available) the custom resource name.
     * </p>
     * 
     * @return The details that identify a resource that is discovered by AWS Config, including the resource type, ID,
     *         and (if available) the custom resource name.
     */

    public java.util.List<ResourceIdentifier> getResourceIdentifiers() {
        if (resourceIdentifiers == null) {
            resourceIdentifiers = new com.amazonaws.internal.SdkInternalList<ResourceIdentifier>();
        }
        return resourceIdentifiers;
    }

    /**
     * <p>
     * The details that identify a resource that is discovered by AWS Config, including the resource type, ID, and (if
     * available) the custom resource name.
     * </p>
     * 
     * @param resourceIdentifiers
     *        The details that identify a resource that is discovered by AWS Config, including the resource type, ID,
     *        and (if available) the custom resource name.
     */

    public void setResourceIdentifiers(java.util.Collection<ResourceIdentifier> resourceIdentifiers) {
        if (resourceIdentifiers == null) {
            this.resourceIdentifiers = null;
            return;
        }

        this.resourceIdentifiers = new com.amazonaws.internal.SdkInternalList<ResourceIdentifier>(resourceIdentifiers);
    }

    /**
     * <p>
     * The details that identify a resource that is discovered by AWS Config, including the resource type, ID, and (if
     * available) the custom resource name.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceIdentifiers(java.util.Collection)} or {@link #withResourceIdentifiers(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param resourceIdentifiers
     *        The details that identify a resource that is discovered by AWS Config, including the resource type, ID,
     *        and (if available) the custom resource name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDiscoveredResourcesResult withResourceIdentifiers(ResourceIdentifier... resourceIdentifiers) {
        if (this.resourceIdentifiers == null) {
            setResourceIdentifiers(new com.amazonaws.internal.SdkInternalList<ResourceIdentifier>(resourceIdentifiers.length));
        }
        for (ResourceIdentifier ele : resourceIdentifiers) {
            this.resourceIdentifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The details that identify a resource that is discovered by AWS Config, including the resource type, ID, and (if
     * available) the custom resource name.
     * </p>
     * 
     * @param resourceIdentifiers
     *        The details that identify a resource that is discovered by AWS Config, including the resource type, ID,
     *        and (if available) the custom resource name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDiscoveredResourcesResult withResourceIdentifiers(java.util.Collection<ResourceIdentifier> resourceIdentifiers) {
        setResourceIdentifiers(resourceIdentifiers);
        return this;
    }

    /**
     * <p>
     * The string that you use in a subsequent request to get the next page of results in a paginated response.
     * </p>
     * 
     * @param nextToken
     *        The string that you use in a subsequent request to get the next page of results in a paginated response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The string that you use in a subsequent request to get the next page of results in a paginated response.
     * </p>
     * 
     * @return The string that you use in a subsequent request to get the next page of results in a paginated response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The string that you use in a subsequent request to get the next page of results in a paginated response.
     * </p>
     * 
     * @param nextToken
     *        The string that you use in a subsequent request to get the next page of results in a paginated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDiscoveredResourcesResult withNextToken(String nextToken) {
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
        if (getResourceIdentifiers() != null)
            sb.append("ResourceIdentifiers: ").append(getResourceIdentifiers()).append(",");
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

        if (obj instanceof ListDiscoveredResourcesResult == false)
            return false;
        ListDiscoveredResourcesResult other = (ListDiscoveredResourcesResult) obj;
        if (other.getResourceIdentifiers() == null ^ this.getResourceIdentifiers() == null)
            return false;
        if (other.getResourceIdentifiers() != null && other.getResourceIdentifiers().equals(this.getResourceIdentifiers()) == false)
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

        hashCode = prime * hashCode + ((getResourceIdentifiers() == null) ? 0 : getResourceIdentifiers().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDiscoveredResourcesResult clone() {
        try {
            return (ListDiscoveredResourcesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
