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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Returns the objects or data listed below if successful. Otherwise, returns an error.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/ListTags" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTagsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of resource tags.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ResourceTag> resourceTagList;
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of resource tags.
     * </p>
     * 
     * @return A list of resource tags.
     */

    public java.util.List<ResourceTag> getResourceTagList() {
        if (resourceTagList == null) {
            resourceTagList = new com.amazonaws.internal.SdkInternalList<ResourceTag>();
        }
        return resourceTagList;
    }

    /**
     * <p>
     * A list of resource tags.
     * </p>
     * 
     * @param resourceTagList
     *        A list of resource tags.
     */

    public void setResourceTagList(java.util.Collection<ResourceTag> resourceTagList) {
        if (resourceTagList == null) {
            this.resourceTagList = null;
            return;
        }

        this.resourceTagList = new com.amazonaws.internal.SdkInternalList<ResourceTag>(resourceTagList);
    }

    /**
     * <p>
     * A list of resource tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTagList(java.util.Collection)} or {@link #withResourceTagList(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param resourceTagList
     *        A list of resource tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsResult withResourceTagList(ResourceTag... resourceTagList) {
        if (this.resourceTagList == null) {
            setResourceTagList(new com.amazonaws.internal.SdkInternalList<ResourceTag>(resourceTagList.length));
        }
        for (ResourceTag ele : resourceTagList) {
            this.resourceTagList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of resource tags.
     * </p>
     * 
     * @param resourceTagList
     *        A list of resource tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsResult withResourceTagList(java.util.Collection<ResourceTag> resourceTagList) {
        setResourceTagList(resourceTagList);
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param nextToken
     *        Reserved for future use.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param nextToken
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsResult withNextToken(String nextToken) {
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
        if (getResourceTagList() != null)
            sb.append("ResourceTagList: ").append(getResourceTagList()).append(",");
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

        if (obj instanceof ListTagsResult == false)
            return false;
        ListTagsResult other = (ListTagsResult) obj;
        if (other.getResourceTagList() == null ^ this.getResourceTagList() == null)
            return false;
        if (other.getResourceTagList() != null && other.getResourceTagList().equals(this.getResourceTagList()) == false)
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

        hashCode = prime * hashCode + ((getResourceTagList() == null) ? 0 : getResourceTagList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTagsResult clone() {
        try {
            return (ListTagsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
