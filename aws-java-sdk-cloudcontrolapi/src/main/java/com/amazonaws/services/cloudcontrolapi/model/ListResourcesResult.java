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
package com.amazonaws.services.cloudcontrolapi.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudcontrol-2021-09-30/ListResources" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResourcesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the resource type.
     * </p>
     */
    private String typeName;
    /**
     * <p>
     * Information about the specified resources, including primary identifier and resource model.
     * </p>
     */
    private java.util.List<ResourceDescription> resourceDescriptions;
    /**
     * <p>
     * If the request doesn't return all of the remaining results, <code>NextToken</code> is set to a token. To retrieve
     * the next set of results, call <code>ListResources</code> again and assign that token to the request object's
     * <code>NextToken</code> parameter. If the request returns all results, <code>NextToken</code> is set to null.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The name of the resource type.
     * </p>
     * 
     * @param typeName
     *        The name of the resource type.
     */

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * <p>
     * The name of the resource type.
     * </p>
     * 
     * @return The name of the resource type.
     */

    public String getTypeName() {
        return this.typeName;
    }

    /**
     * <p>
     * The name of the resource type.
     * </p>
     * 
     * @param typeName
     *        The name of the resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourcesResult withTypeName(String typeName) {
        setTypeName(typeName);
        return this;
    }

    /**
     * <p>
     * Information about the specified resources, including primary identifier and resource model.
     * </p>
     * 
     * @return Information about the specified resources, including primary identifier and resource model.
     */

    public java.util.List<ResourceDescription> getResourceDescriptions() {
        return resourceDescriptions;
    }

    /**
     * <p>
     * Information about the specified resources, including primary identifier and resource model.
     * </p>
     * 
     * @param resourceDescriptions
     *        Information about the specified resources, including primary identifier and resource model.
     */

    public void setResourceDescriptions(java.util.Collection<ResourceDescription> resourceDescriptions) {
        if (resourceDescriptions == null) {
            this.resourceDescriptions = null;
            return;
        }

        this.resourceDescriptions = new java.util.ArrayList<ResourceDescription>(resourceDescriptions);
    }

    /**
     * <p>
     * Information about the specified resources, including primary identifier and resource model.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceDescriptions(java.util.Collection)} or {@link #withResourceDescriptions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param resourceDescriptions
     *        Information about the specified resources, including primary identifier and resource model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourcesResult withResourceDescriptions(ResourceDescription... resourceDescriptions) {
        if (this.resourceDescriptions == null) {
            setResourceDescriptions(new java.util.ArrayList<ResourceDescription>(resourceDescriptions.length));
        }
        for (ResourceDescription ele : resourceDescriptions) {
            this.resourceDescriptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the specified resources, including primary identifier and resource model.
     * </p>
     * 
     * @param resourceDescriptions
     *        Information about the specified resources, including primary identifier and resource model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourcesResult withResourceDescriptions(java.util.Collection<ResourceDescription> resourceDescriptions) {
        setResourceDescriptions(resourceDescriptions);
        return this;
    }

    /**
     * <p>
     * If the request doesn't return all of the remaining results, <code>NextToken</code> is set to a token. To retrieve
     * the next set of results, call <code>ListResources</code> again and assign that token to the request object's
     * <code>NextToken</code> parameter. If the request returns all results, <code>NextToken</code> is set to null.
     * </p>
     * 
     * @param nextToken
     *        If the request doesn't return all of the remaining results, <code>NextToken</code> is set to a token. To
     *        retrieve the next set of results, call <code>ListResources</code> again and assign that token to the
     *        request object's <code>NextToken</code> parameter. If the request returns all results,
     *        <code>NextToken</code> is set to null.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the request doesn't return all of the remaining results, <code>NextToken</code> is set to a token. To retrieve
     * the next set of results, call <code>ListResources</code> again and assign that token to the request object's
     * <code>NextToken</code> parameter. If the request returns all results, <code>NextToken</code> is set to null.
     * </p>
     * 
     * @return If the request doesn't return all of the remaining results, <code>NextToken</code> is set to a token. To
     *         retrieve the next set of results, call <code>ListResources</code> again and assign that token to the
     *         request object's <code>NextToken</code> parameter. If the request returns all results,
     *         <code>NextToken</code> is set to null.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the request doesn't return all of the remaining results, <code>NextToken</code> is set to a token. To retrieve
     * the next set of results, call <code>ListResources</code> again and assign that token to the request object's
     * <code>NextToken</code> parameter. If the request returns all results, <code>NextToken</code> is set to null.
     * </p>
     * 
     * @param nextToken
     *        If the request doesn't return all of the remaining results, <code>NextToken</code> is set to a token. To
     *        retrieve the next set of results, call <code>ListResources</code> again and assign that token to the
     *        request object's <code>NextToken</code> parameter. If the request returns all results,
     *        <code>NextToken</code> is set to null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourcesResult withNextToken(String nextToken) {
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
        if (getTypeName() != null)
            sb.append("TypeName: ").append(getTypeName()).append(",");
        if (getResourceDescriptions() != null)
            sb.append("ResourceDescriptions: ").append(getResourceDescriptions()).append(",");
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

        if (obj instanceof ListResourcesResult == false)
            return false;
        ListResourcesResult other = (ListResourcesResult) obj;
        if (other.getTypeName() == null ^ this.getTypeName() == null)
            return false;
        if (other.getTypeName() != null && other.getTypeName().equals(this.getTypeName()) == false)
            return false;
        if (other.getResourceDescriptions() == null ^ this.getResourceDescriptions() == null)
            return false;
        if (other.getResourceDescriptions() != null && other.getResourceDescriptions().equals(this.getResourceDescriptions()) == false)
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

        hashCode = prime * hashCode + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        hashCode = prime * hashCode + ((getResourceDescriptions() == null) ? 0 : getResourceDescriptions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListResourcesResult clone() {
        try {
            return (ListResourcesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
