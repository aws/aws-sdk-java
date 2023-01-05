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
package com.amazonaws.services.proton.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListEnvironmentProvisionedResources"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEnvironmentProvisionedResourcesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A token that indicates the location of the next environment provisioned resource in the array of provisioned
     * resources, after the current requested list of environment provisioned resources.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * An array of environment provisioned resources.
     * </p>
     */
    private java.util.List<ProvisionedResource> provisionedResources;

    /**
     * <p>
     * A token that indicates the location of the next environment provisioned resource in the array of provisioned
     * resources, after the current requested list of environment provisioned resources.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates the location of the next environment provisioned resource in the array of
     *        provisioned resources, after the current requested list of environment provisioned resources.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates the location of the next environment provisioned resource in the array of provisioned
     * resources, after the current requested list of environment provisioned resources.
     * </p>
     * 
     * @return A token that indicates the location of the next environment provisioned resource in the array of
     *         provisioned resources, after the current requested list of environment provisioned resources.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates the location of the next environment provisioned resource in the array of provisioned
     * resources, after the current requested list of environment provisioned resources.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates the location of the next environment provisioned resource in the array of
     *        provisioned resources, after the current requested list of environment provisioned resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentProvisionedResourcesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * An array of environment provisioned resources.
     * </p>
     * 
     * @return An array of environment provisioned resources.
     */

    public java.util.List<ProvisionedResource> getProvisionedResources() {
        return provisionedResources;
    }

    /**
     * <p>
     * An array of environment provisioned resources.
     * </p>
     * 
     * @param provisionedResources
     *        An array of environment provisioned resources.
     */

    public void setProvisionedResources(java.util.Collection<ProvisionedResource> provisionedResources) {
        if (provisionedResources == null) {
            this.provisionedResources = null;
            return;
        }

        this.provisionedResources = new java.util.ArrayList<ProvisionedResource>(provisionedResources);
    }

    /**
     * <p>
     * An array of environment provisioned resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProvisionedResources(java.util.Collection)} or {@link #withProvisionedResources(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param provisionedResources
     *        An array of environment provisioned resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentProvisionedResourcesResult withProvisionedResources(ProvisionedResource... provisionedResources) {
        if (this.provisionedResources == null) {
            setProvisionedResources(new java.util.ArrayList<ProvisionedResource>(provisionedResources.length));
        }
        for (ProvisionedResource ele : provisionedResources) {
            this.provisionedResources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of environment provisioned resources.
     * </p>
     * 
     * @param provisionedResources
     *        An array of environment provisioned resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentProvisionedResourcesResult withProvisionedResources(java.util.Collection<ProvisionedResource> provisionedResources) {
        setProvisionedResources(provisionedResources);
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
        if (getProvisionedResources() != null)
            sb.append("ProvisionedResources: ").append(getProvisionedResources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListEnvironmentProvisionedResourcesResult == false)
            return false;
        ListEnvironmentProvisionedResourcesResult other = (ListEnvironmentProvisionedResourcesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getProvisionedResources() == null ^ this.getProvisionedResources() == null)
            return false;
        if (other.getProvisionedResources() != null && other.getProvisionedResources().equals(this.getProvisionedResources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getProvisionedResources() == null) ? 0 : getProvisionedResources().hashCode());
        return hashCode;
    }

    @Override
    public ListEnvironmentProvisionedResourcesResult clone() {
        try {
            return (ListEnvironmentProvisionedResourcesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
