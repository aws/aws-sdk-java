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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListResourceCatalogs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResourceCatalogsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of the requested <code>ResourceCatalog</code>s.
     * </p>
     */
    private java.util.List<ResourceCatalog> resourceCatalogs;
    /**
     * <p>
     * A token to resume pagination of <code>ListResourceCatalogs</code> results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of the requested <code>ResourceCatalog</code>s.
     * </p>
     * 
     * @return A list of the requested <code>ResourceCatalog</code>s.
     */

    public java.util.List<ResourceCatalog> getResourceCatalogs() {
        return resourceCatalogs;
    }

    /**
     * <p>
     * A list of the requested <code>ResourceCatalog</code>s.
     * </p>
     * 
     * @param resourceCatalogs
     *        A list of the requested <code>ResourceCatalog</code>s.
     */

    public void setResourceCatalogs(java.util.Collection<ResourceCatalog> resourceCatalogs) {
        if (resourceCatalogs == null) {
            this.resourceCatalogs = null;
            return;
        }

        this.resourceCatalogs = new java.util.ArrayList<ResourceCatalog>(resourceCatalogs);
    }

    /**
     * <p>
     * A list of the requested <code>ResourceCatalog</code>s.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceCatalogs(java.util.Collection)} or {@link #withResourceCatalogs(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param resourceCatalogs
     *        A list of the requested <code>ResourceCatalog</code>s.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceCatalogsResult withResourceCatalogs(ResourceCatalog... resourceCatalogs) {
        if (this.resourceCatalogs == null) {
            setResourceCatalogs(new java.util.ArrayList<ResourceCatalog>(resourceCatalogs.length));
        }
        for (ResourceCatalog ele : resourceCatalogs) {
            this.resourceCatalogs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the requested <code>ResourceCatalog</code>s.
     * </p>
     * 
     * @param resourceCatalogs
     *        A list of the requested <code>ResourceCatalog</code>s.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceCatalogsResult withResourceCatalogs(java.util.Collection<ResourceCatalog> resourceCatalogs) {
        setResourceCatalogs(resourceCatalogs);
        return this;
    }

    /**
     * <p>
     * A token to resume pagination of <code>ListResourceCatalogs</code> results.
     * </p>
     * 
     * @param nextToken
     *        A token to resume pagination of <code>ListResourceCatalogs</code> results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to resume pagination of <code>ListResourceCatalogs</code> results.
     * </p>
     * 
     * @return A token to resume pagination of <code>ListResourceCatalogs</code> results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to resume pagination of <code>ListResourceCatalogs</code> results.
     * </p>
     * 
     * @param nextToken
     *        A token to resume pagination of <code>ListResourceCatalogs</code> results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceCatalogsResult withNextToken(String nextToken) {
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
        if (getResourceCatalogs() != null)
            sb.append("ResourceCatalogs: ").append(getResourceCatalogs()).append(",");
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

        if (obj instanceof ListResourceCatalogsResult == false)
            return false;
        ListResourceCatalogsResult other = (ListResourceCatalogsResult) obj;
        if (other.getResourceCatalogs() == null ^ this.getResourceCatalogs() == null)
            return false;
        if (other.getResourceCatalogs() != null && other.getResourceCatalogs().equals(this.getResourceCatalogs()) == false)
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

        hashCode = prime * hashCode + ((getResourceCatalogs() == null) ? 0 : getResourceCatalogs().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListResourceCatalogsResult clone() {
        try {
            return (ListResourceCatalogsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
