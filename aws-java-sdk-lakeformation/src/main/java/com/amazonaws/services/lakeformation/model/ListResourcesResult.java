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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/ListResources" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResourcesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A summary of the data lake resources.
     * </p>
     */
    private java.util.List<ResourceInfo> resourceInfoList;
    /**
     * <p>
     * A continuation token, if this is not the first call to retrieve these resources.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A summary of the data lake resources.
     * </p>
     * 
     * @return A summary of the data lake resources.
     */

    public java.util.List<ResourceInfo> getResourceInfoList() {
        return resourceInfoList;
    }

    /**
     * <p>
     * A summary of the data lake resources.
     * </p>
     * 
     * @param resourceInfoList
     *        A summary of the data lake resources.
     */

    public void setResourceInfoList(java.util.Collection<ResourceInfo> resourceInfoList) {
        if (resourceInfoList == null) {
            this.resourceInfoList = null;
            return;
        }

        this.resourceInfoList = new java.util.ArrayList<ResourceInfo>(resourceInfoList);
    }

    /**
     * <p>
     * A summary of the data lake resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceInfoList(java.util.Collection)} or {@link #withResourceInfoList(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param resourceInfoList
     *        A summary of the data lake resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourcesResult withResourceInfoList(ResourceInfo... resourceInfoList) {
        if (this.resourceInfoList == null) {
            setResourceInfoList(new java.util.ArrayList<ResourceInfo>(resourceInfoList.length));
        }
        for (ResourceInfo ele : resourceInfoList) {
            this.resourceInfoList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A summary of the data lake resources.
     * </p>
     * 
     * @param resourceInfoList
     *        A summary of the data lake resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourcesResult withResourceInfoList(java.util.Collection<ResourceInfo> resourceInfoList) {
        setResourceInfoList(resourceInfoList);
        return this;
    }

    /**
     * <p>
     * A continuation token, if this is not the first call to retrieve these resources.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if this is not the first call to retrieve these resources.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if this is not the first call to retrieve these resources.
     * </p>
     * 
     * @return A continuation token, if this is not the first call to retrieve these resources.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token, if this is not the first call to retrieve these resources.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if this is not the first call to retrieve these resources.
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
        if (getResourceInfoList() != null)
            sb.append("ResourceInfoList: ").append(getResourceInfoList()).append(",");
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
        if (other.getResourceInfoList() == null ^ this.getResourceInfoList() == null)
            return false;
        if (other.getResourceInfoList() != null && other.getResourceInfoList().equals(this.getResourceInfoList()) == false)
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

        hashCode = prime * hashCode + ((getResourceInfoList() == null) ? 0 : getResourceInfoList().hashCode());
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
