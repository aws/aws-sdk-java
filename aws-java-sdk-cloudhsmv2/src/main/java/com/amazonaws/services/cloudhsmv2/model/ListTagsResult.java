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
package com.amazonaws.services.cloudhsmv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/ListTags" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTagsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of tags.
     * </p>
     */
    private java.util.List<Tag> tagList;
    /**
     * <p>
     * An opaque string that indicates that the response contains only a subset of tags. Use this value in a subsequent
     * <code>ListTags</code> request to get more tags.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of tags.
     * </p>
     * 
     * @return A list of tags.
     */

    public java.util.List<Tag> getTagList() {
        return tagList;
    }

    /**
     * <p>
     * A list of tags.
     * </p>
     * 
     * @param tagList
     *        A list of tags.
     */

    public void setTagList(java.util.Collection<Tag> tagList) {
        if (tagList == null) {
            this.tagList = null;
            return;
        }

        this.tagList = new java.util.ArrayList<Tag>(tagList);
    }

    /**
     * <p>
     * A list of tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagList(java.util.Collection)} or {@link #withTagList(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param tagList
     *        A list of tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsResult withTagList(Tag... tagList) {
        if (this.tagList == null) {
            setTagList(new java.util.ArrayList<Tag>(tagList.length));
        }
        for (Tag ele : tagList) {
            this.tagList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags.
     * </p>
     * 
     * @param tagList
     *        A list of tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsResult withTagList(java.util.Collection<Tag> tagList) {
        setTagList(tagList);
        return this;
    }

    /**
     * <p>
     * An opaque string that indicates that the response contains only a subset of tags. Use this value in a subsequent
     * <code>ListTags</code> request to get more tags.
     * </p>
     * 
     * @param nextToken
     *        An opaque string that indicates that the response contains only a subset of tags. Use this value in a
     *        subsequent <code>ListTags</code> request to get more tags.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An opaque string that indicates that the response contains only a subset of tags. Use this value in a subsequent
     * <code>ListTags</code> request to get more tags.
     * </p>
     * 
     * @return An opaque string that indicates that the response contains only a subset of tags. Use this value in a
     *         subsequent <code>ListTags</code> request to get more tags.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An opaque string that indicates that the response contains only a subset of tags. Use this value in a subsequent
     * <code>ListTags</code> request to get more tags.
     * </p>
     * 
     * @param nextToken
     *        An opaque string that indicates that the response contains only a subset of tags. Use this value in a
     *        subsequent <code>ListTags</code> request to get more tags.
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
        if (getTagList() != null)
            sb.append("TagList: ").append(getTagList()).append(",");
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
        if (other.getTagList() == null ^ this.getTagList() == null)
            return false;
        if (other.getTagList() != null && other.getTagList().equals(this.getTagList()) == false)
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

        hashCode = prime * hashCode + ((getTagList() == null) ? 0 : getTagList().hashCode());
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
