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
package com.amazonaws.services.xray.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/ListResourcePolicies" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResourcePoliciesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of resource policies in the target Amazon Web Services account.
     * </p>
     */
    private java.util.List<ResourcePolicy> resourcePolicies;
    /**
     * <p>
     * Pagination token. Not currently supported.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of resource policies in the target Amazon Web Services account.
     * </p>
     * 
     * @return The list of resource policies in the target Amazon Web Services account.
     */

    public java.util.List<ResourcePolicy> getResourcePolicies() {
        return resourcePolicies;
    }

    /**
     * <p>
     * The list of resource policies in the target Amazon Web Services account.
     * </p>
     * 
     * @param resourcePolicies
     *        The list of resource policies in the target Amazon Web Services account.
     */

    public void setResourcePolicies(java.util.Collection<ResourcePolicy> resourcePolicies) {
        if (resourcePolicies == null) {
            this.resourcePolicies = null;
            return;
        }

        this.resourcePolicies = new java.util.ArrayList<ResourcePolicy>(resourcePolicies);
    }

    /**
     * <p>
     * The list of resource policies in the target Amazon Web Services account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourcePolicies(java.util.Collection)} or {@link #withResourcePolicies(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param resourcePolicies
     *        The list of resource policies in the target Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourcePoliciesResult withResourcePolicies(ResourcePolicy... resourcePolicies) {
        if (this.resourcePolicies == null) {
            setResourcePolicies(new java.util.ArrayList<ResourcePolicy>(resourcePolicies.length));
        }
        for (ResourcePolicy ele : resourcePolicies) {
            this.resourcePolicies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of resource policies in the target Amazon Web Services account.
     * </p>
     * 
     * @param resourcePolicies
     *        The list of resource policies in the target Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourcePoliciesResult withResourcePolicies(java.util.Collection<ResourcePolicy> resourcePolicies) {
        setResourcePolicies(resourcePolicies);
        return this;
    }

    /**
     * <p>
     * Pagination token. Not currently supported.
     * </p>
     * 
     * @param nextToken
     *        Pagination token. Not currently supported.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Pagination token. Not currently supported.
     * </p>
     * 
     * @return Pagination token. Not currently supported.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Pagination token. Not currently supported.
     * </p>
     * 
     * @param nextToken
     *        Pagination token. Not currently supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourcePoliciesResult withNextToken(String nextToken) {
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
        if (getResourcePolicies() != null)
            sb.append("ResourcePolicies: ").append(getResourcePolicies()).append(",");
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

        if (obj instanceof ListResourcePoliciesResult == false)
            return false;
        ListResourcePoliciesResult other = (ListResourcePoliciesResult) obj;
        if (other.getResourcePolicies() == null ^ this.getResourcePolicies() == null)
            return false;
        if (other.getResourcePolicies() != null && other.getResourcePolicies().equals(this.getResourcePolicies()) == false)
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

        hashCode = prime * hashCode + ((getResourcePolicies() == null) ? 0 : getResourcePolicies().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListResourcePoliciesResult clone() {
        try {
            return (ListResourcePoliciesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
