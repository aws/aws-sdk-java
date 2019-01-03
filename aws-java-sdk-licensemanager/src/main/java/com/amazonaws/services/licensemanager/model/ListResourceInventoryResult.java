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
package com.amazonaws.services.licensemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListResourceInventory"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResourceInventoryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The detailed list of resources.
     * </p>
     */
    private java.util.List<ResourceInventory> resourceInventoryList;
    /**
     * <p>
     * Token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The detailed list of resources.
     * </p>
     * 
     * @return The detailed list of resources.
     */

    public java.util.List<ResourceInventory> getResourceInventoryList() {
        return resourceInventoryList;
    }

    /**
     * <p>
     * The detailed list of resources.
     * </p>
     * 
     * @param resourceInventoryList
     *        The detailed list of resources.
     */

    public void setResourceInventoryList(java.util.Collection<ResourceInventory> resourceInventoryList) {
        if (resourceInventoryList == null) {
            this.resourceInventoryList = null;
            return;
        }

        this.resourceInventoryList = new java.util.ArrayList<ResourceInventory>(resourceInventoryList);
    }

    /**
     * <p>
     * The detailed list of resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceInventoryList(java.util.Collection)} or
     * {@link #withResourceInventoryList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param resourceInventoryList
     *        The detailed list of resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceInventoryResult withResourceInventoryList(ResourceInventory... resourceInventoryList) {
        if (this.resourceInventoryList == null) {
            setResourceInventoryList(new java.util.ArrayList<ResourceInventory>(resourceInventoryList.length));
        }
        for (ResourceInventory ele : resourceInventoryList) {
            this.resourceInventoryList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The detailed list of resources.
     * </p>
     * 
     * @param resourceInventoryList
     *        The detailed list of resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceInventoryResult withResourceInventoryList(java.util.Collection<ResourceInventory> resourceInventoryList) {
        setResourceInventoryList(resourceInventoryList);
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

    public ListResourceInventoryResult withNextToken(String nextToken) {
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
        if (getResourceInventoryList() != null)
            sb.append("ResourceInventoryList: ").append(getResourceInventoryList()).append(",");
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

        if (obj instanceof ListResourceInventoryResult == false)
            return false;
        ListResourceInventoryResult other = (ListResourceInventoryResult) obj;
        if (other.getResourceInventoryList() == null ^ this.getResourceInventoryList() == null)
            return false;
        if (other.getResourceInventoryList() != null && other.getResourceInventoryList().equals(this.getResourceInventoryList()) == false)
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

        hashCode = prime * hashCode + ((getResourceInventoryList() == null) ? 0 : getResourceInventoryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListResourceInventoryResult clone() {
        try {
            return (ListResourceInventoryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
