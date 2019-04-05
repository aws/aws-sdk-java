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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DescribeResourcePolicies" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeResourcePoliciesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The resource policies that exist in this account.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ResourcePolicy> resourcePolicies;

    private String nextToken;

    /**
     * <p>
     * The resource policies that exist in this account.
     * </p>
     * 
     * @return The resource policies that exist in this account.
     */

    public java.util.List<ResourcePolicy> getResourcePolicies() {
        if (resourcePolicies == null) {
            resourcePolicies = new com.amazonaws.internal.SdkInternalList<ResourcePolicy>();
        }
        return resourcePolicies;
    }

    /**
     * <p>
     * The resource policies that exist in this account.
     * </p>
     * 
     * @param resourcePolicies
     *        The resource policies that exist in this account.
     */

    public void setResourcePolicies(java.util.Collection<ResourcePolicy> resourcePolicies) {
        if (resourcePolicies == null) {
            this.resourcePolicies = null;
            return;
        }

        this.resourcePolicies = new com.amazonaws.internal.SdkInternalList<ResourcePolicy>(resourcePolicies);
    }

    /**
     * <p>
     * The resource policies that exist in this account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourcePolicies(java.util.Collection)} or {@link #withResourcePolicies(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param resourcePolicies
     *        The resource policies that exist in this account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeResourcePoliciesResult withResourcePolicies(ResourcePolicy... resourcePolicies) {
        if (this.resourcePolicies == null) {
            setResourcePolicies(new com.amazonaws.internal.SdkInternalList<ResourcePolicy>(resourcePolicies.length));
        }
        for (ResourcePolicy ele : resourcePolicies) {
            this.resourcePolicies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The resource policies that exist in this account.
     * </p>
     * 
     * @param resourcePolicies
     *        The resource policies that exist in this account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeResourcePoliciesResult withResourcePolicies(java.util.Collection<ResourcePolicy> resourcePolicies) {
        setResourcePolicies(resourcePolicies);
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

    public DescribeResourcePoliciesResult withNextToken(String nextToken) {
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

        if (obj instanceof DescribeResourcePoliciesResult == false)
            return false;
        DescribeResourcePoliciesResult other = (DescribeResourcePoliciesResult) obj;
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
    public DescribeResourcePoliciesResult clone() {
        try {
            return (DescribeResourcePoliciesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
