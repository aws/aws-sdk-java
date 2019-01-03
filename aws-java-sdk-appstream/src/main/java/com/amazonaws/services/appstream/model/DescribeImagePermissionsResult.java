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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeImagePermissions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeImagePermissionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the private image.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The permissions for a private image that you own.
     * </p>
     */
    private java.util.List<SharedImagePermissions> sharedImagePermissionsList;
    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The name of the private image.
     * </p>
     * 
     * @param name
     *        The name of the private image.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the private image.
     * </p>
     * 
     * @return The name of the private image.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the private image.
     * </p>
     * 
     * @param name
     *        The name of the private image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImagePermissionsResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The permissions for a private image that you own.
     * </p>
     * 
     * @return The permissions for a private image that you own.
     */

    public java.util.List<SharedImagePermissions> getSharedImagePermissionsList() {
        return sharedImagePermissionsList;
    }

    /**
     * <p>
     * The permissions for a private image that you own.
     * </p>
     * 
     * @param sharedImagePermissionsList
     *        The permissions for a private image that you own.
     */

    public void setSharedImagePermissionsList(java.util.Collection<SharedImagePermissions> sharedImagePermissionsList) {
        if (sharedImagePermissionsList == null) {
            this.sharedImagePermissionsList = null;
            return;
        }

        this.sharedImagePermissionsList = new java.util.ArrayList<SharedImagePermissions>(sharedImagePermissionsList);
    }

    /**
     * <p>
     * The permissions for a private image that you own.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSharedImagePermissionsList(java.util.Collection)} or
     * {@link #withSharedImagePermissionsList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param sharedImagePermissionsList
     *        The permissions for a private image that you own.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImagePermissionsResult withSharedImagePermissionsList(SharedImagePermissions... sharedImagePermissionsList) {
        if (this.sharedImagePermissionsList == null) {
            setSharedImagePermissionsList(new java.util.ArrayList<SharedImagePermissions>(sharedImagePermissionsList.length));
        }
        for (SharedImagePermissions ele : sharedImagePermissionsList) {
            this.sharedImagePermissionsList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The permissions for a private image that you own.
     * </p>
     * 
     * @param sharedImagePermissionsList
     *        The permissions for a private image that you own.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImagePermissionsResult withSharedImagePermissionsList(java.util.Collection<SharedImagePermissions> sharedImagePermissionsList) {
        setSharedImagePermissionsList(sharedImagePermissionsList);
        return this;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to use to retrieve the next page of results for this operation. If there are no more
     *        pages, this value is null.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     * 
     * @return The pagination token to use to retrieve the next page of results for this operation. If there are no more
     *         pages, this value is null.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to use to retrieve the next page of results for this operation. If there are no more
     *        pages, this value is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImagePermissionsResult withNextToken(String nextToken) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSharedImagePermissionsList() != null)
            sb.append("SharedImagePermissionsList: ").append(getSharedImagePermissionsList()).append(",");
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

        if (obj instanceof DescribeImagePermissionsResult == false)
            return false;
        DescribeImagePermissionsResult other = (DescribeImagePermissionsResult) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSharedImagePermissionsList() == null ^ this.getSharedImagePermissionsList() == null)
            return false;
        if (other.getSharedImagePermissionsList() != null && other.getSharedImagePermissionsList().equals(this.getSharedImagePermissionsList()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSharedImagePermissionsList() == null) ? 0 : getSharedImagePermissionsList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeImagePermissionsResult clone() {
        try {
            return (DescribeImagePermissionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
