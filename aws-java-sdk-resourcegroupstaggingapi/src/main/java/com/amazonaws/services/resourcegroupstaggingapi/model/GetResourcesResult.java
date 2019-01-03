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
package com.amazonaws.services.resourcegroupstaggingapi.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/GetResources"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetResourcesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A string that indicates that the response contains more data than can be returned in a single response. To
     * receive additional data, specify this string for the <code>PaginationToken</code> value in a subsequent request.
     * </p>
     */
    private String paginationToken;
    /**
     * <p>
     * A list of resource ARNs and the tags (keys and values) associated with each.
     * </p>
     */
    private java.util.List<ResourceTagMapping> resourceTagMappingList;

    /**
     * <p>
     * A string that indicates that the response contains more data than can be returned in a single response. To
     * receive additional data, specify this string for the <code>PaginationToken</code> value in a subsequent request.
     * </p>
     * 
     * @param paginationToken
     *        A string that indicates that the response contains more data than can be returned in a single response. To
     *        receive additional data, specify this string for the <code>PaginationToken</code> value in a subsequent
     *        request.
     */

    public void setPaginationToken(String paginationToken) {
        this.paginationToken = paginationToken;
    }

    /**
     * <p>
     * A string that indicates that the response contains more data than can be returned in a single response. To
     * receive additional data, specify this string for the <code>PaginationToken</code> value in a subsequent request.
     * </p>
     * 
     * @return A string that indicates that the response contains more data than can be returned in a single response.
     *         To receive additional data, specify this string for the <code>PaginationToken</code> value in a
     *         subsequent request.
     */

    public String getPaginationToken() {
        return this.paginationToken;
    }

    /**
     * <p>
     * A string that indicates that the response contains more data than can be returned in a single response. To
     * receive additional data, specify this string for the <code>PaginationToken</code> value in a subsequent request.
     * </p>
     * 
     * @param paginationToken
     *        A string that indicates that the response contains more data than can be returned in a single response. To
     *        receive additional data, specify this string for the <code>PaginationToken</code> value in a subsequent
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourcesResult withPaginationToken(String paginationToken) {
        setPaginationToken(paginationToken);
        return this;
    }

    /**
     * <p>
     * A list of resource ARNs and the tags (keys and values) associated with each.
     * </p>
     * 
     * @return A list of resource ARNs and the tags (keys and values) associated with each.
     */

    public java.util.List<ResourceTagMapping> getResourceTagMappingList() {
        return resourceTagMappingList;
    }

    /**
     * <p>
     * A list of resource ARNs and the tags (keys and values) associated with each.
     * </p>
     * 
     * @param resourceTagMappingList
     *        A list of resource ARNs and the tags (keys and values) associated with each.
     */

    public void setResourceTagMappingList(java.util.Collection<ResourceTagMapping> resourceTagMappingList) {
        if (resourceTagMappingList == null) {
            this.resourceTagMappingList = null;
            return;
        }

        this.resourceTagMappingList = new java.util.ArrayList<ResourceTagMapping>(resourceTagMappingList);
    }

    /**
     * <p>
     * A list of resource ARNs and the tags (keys and values) associated with each.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTagMappingList(java.util.Collection)} or
     * {@link #withResourceTagMappingList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param resourceTagMappingList
     *        A list of resource ARNs and the tags (keys and values) associated with each.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourcesResult withResourceTagMappingList(ResourceTagMapping... resourceTagMappingList) {
        if (this.resourceTagMappingList == null) {
            setResourceTagMappingList(new java.util.ArrayList<ResourceTagMapping>(resourceTagMappingList.length));
        }
        for (ResourceTagMapping ele : resourceTagMappingList) {
            this.resourceTagMappingList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of resource ARNs and the tags (keys and values) associated with each.
     * </p>
     * 
     * @param resourceTagMappingList
     *        A list of resource ARNs and the tags (keys and values) associated with each.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourcesResult withResourceTagMappingList(java.util.Collection<ResourceTagMapping> resourceTagMappingList) {
        setResourceTagMappingList(resourceTagMappingList);
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
        if (getPaginationToken() != null)
            sb.append("PaginationToken: ").append(getPaginationToken()).append(",");
        if (getResourceTagMappingList() != null)
            sb.append("ResourceTagMappingList: ").append(getResourceTagMappingList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetResourcesResult == false)
            return false;
        GetResourcesResult other = (GetResourcesResult) obj;
        if (other.getPaginationToken() == null ^ this.getPaginationToken() == null)
            return false;
        if (other.getPaginationToken() != null && other.getPaginationToken().equals(this.getPaginationToken()) == false)
            return false;
        if (other.getResourceTagMappingList() == null ^ this.getResourceTagMappingList() == null)
            return false;
        if (other.getResourceTagMappingList() != null && other.getResourceTagMappingList().equals(this.getResourceTagMappingList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPaginationToken() == null) ? 0 : getPaginationToken().hashCode());
        hashCode = prime * hashCode + ((getResourceTagMappingList() == null) ? 0 : getResourceTagMappingList().hashCode());
        return hashCode;
    }

    @Override
    public GetResourcesResult clone() {
        try {
            return (GetResourcesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
