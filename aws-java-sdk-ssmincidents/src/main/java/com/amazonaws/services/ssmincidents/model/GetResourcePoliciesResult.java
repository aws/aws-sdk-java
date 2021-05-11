/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ssmincidents.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/GetResourcePolicies" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetResourcePoliciesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The pagination token to continue to the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Details about the resource policy attached to the response plan.
     * </p>
     */
    private java.util.List<ResourcePolicy> resourcePolicies;

    /**
     * <p>
     * The pagination token to continue to the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to continue to the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token to continue to the next page of results.
     * </p>
     * 
     * @return The pagination token to continue to the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token to continue to the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to continue to the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourcePoliciesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Details about the resource policy attached to the response plan.
     * </p>
     * 
     * @return Details about the resource policy attached to the response plan.
     */

    public java.util.List<ResourcePolicy> getResourcePolicies() {
        return resourcePolicies;
    }

    /**
     * <p>
     * Details about the resource policy attached to the response plan.
     * </p>
     * 
     * @param resourcePolicies
     *        Details about the resource policy attached to the response plan.
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
     * Details about the resource policy attached to the response plan.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourcePolicies(java.util.Collection)} or {@link #withResourcePolicies(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param resourcePolicies
     *        Details about the resource policy attached to the response plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourcePoliciesResult withResourcePolicies(ResourcePolicy... resourcePolicies) {
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
     * Details about the resource policy attached to the response plan.
     * </p>
     * 
     * @param resourcePolicies
     *        Details about the resource policy attached to the response plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourcePoliciesResult withResourcePolicies(java.util.Collection<ResourcePolicy> resourcePolicies) {
        setResourcePolicies(resourcePolicies);
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
        if (getResourcePolicies() != null)
            sb.append("ResourcePolicies: ").append(getResourcePolicies());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetResourcePoliciesResult == false)
            return false;
        GetResourcePoliciesResult other = (GetResourcePoliciesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getResourcePolicies() == null ^ this.getResourcePolicies() == null)
            return false;
        if (other.getResourcePolicies() != null && other.getResourcePolicies().equals(this.getResourcePolicies()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getResourcePolicies() == null) ? 0 : getResourcePolicies().hashCode());
        return hashCode;
    }

    @Override
    public GetResourcePoliciesResult clone() {
        try {
            return (GetResourcePoliciesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
